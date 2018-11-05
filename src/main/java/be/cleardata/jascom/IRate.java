package be.cleardata.jascom;

import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;

public interface IRate extends IUnknown, IRawDispatchHandle, IDispatch {

    @ComProperty(name = "Maximum")
    Double getMaximum();

    @ComProperty(name = "Maximum")
    void setMaximum(Double param0);

    @ComProperty(name = "Minimum")
    Double getMinimum();

    @ComProperty(name = "Minimum")
    void setMinimum(Double param0);

}