package be.cleardata.jascom;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.COMUtils;
import com.sun.jna.platform.win32.COM.Dispatch;
import com.sun.jna.platform.win32.COM.IDispatch;
import com.sun.jna.platform.win32.COM.util.ObjectFactory;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.platform.win32.Ole32;
import com.sun.jna.platform.win32.WTypes;
import com.sun.jna.platform.win32.WinNT;
import com.sun.jna.ptr.PointerByReference;

public class JAscomFactory extends ObjectFactory {

    public <T> T createObject(String name, Class<T> iface) {

        assert COMUtils.comIsInitialized() : "COM not initialized";

        final Guid.GUID guid = this.discoverClsId(name);

        final PointerByReference ptrDisp = new PointerByReference();
        WinNT.HRESULT hr = Ole32.INSTANCE.CoCreateInstance(guid, null,
                WTypes.CLSCTX_SERVER, IDispatch.IID_IDISPATCH, ptrDisp);

        COMUtils.checkRC(hr);
        Dispatch d = new Dispatch(ptrDisp.getValue());
        T t = this.createProxy(iface, d);
        //CoCreateInstance returns a pointer to COM object with a +1 reference count, so we must drop one
        //Note: the createProxy adds one
        int n = d.Release();
        return t;

    }

    private Guid.GUID discoverClsId(final String progIdStr) {
        assert(progIdStr != null);

        if (!progIdStr.isEmpty()) {
            final Guid.CLSID.ByReference rclsid = new Guid.CLSID.ByReference();
            WinNT.HRESULT hr = Ole32.INSTANCE.CLSIDFromProgID(progIdStr, rclsid);
            COMUtils.checkRC(hr);
            return rclsid;
        } else {
            throw new COMException("Specify name of com class to instantiate");
        }
    }

}
