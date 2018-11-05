package be.cleardata.jascom;

import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;

public interface IFilterWheelV2 extends IUnknown, IRawDispatchHandle, IDispatch {

    @ComProperty(name = "Connected")
    Boolean getConnected();

    @ComProperty(name = "Connected")
    void setConnected(Boolean param0);

    @ComProperty(name = "FocusOffsets")
    Integer getFocusOffsets();

    @ComProperty(name = "Position")
    Short getPosition();

    @ComProperty(name = "Position")
    void setPosition(Short param0);

    @ComProperty(name = "Names")
    String getNames();

    @ComMethod(name = "SetupDialog")
    void SetupDialog();

}