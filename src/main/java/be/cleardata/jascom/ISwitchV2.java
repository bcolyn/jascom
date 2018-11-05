package be.cleardata.jascom;

import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;

public interface ISwitchV2 extends IUnknown, IRawDispatchHandle, IDispatch {

    @ComProperty(name = "Connected")
    Boolean getConnected();

    @ComProperty(name = "Connected")
    void setConnected(Boolean param0);

    @ComProperty(name = "Description")
    String getDescription();

    @ComProperty(name = "DriverInfo")
    String getDriverInfo();

    @ComProperty(name = "DriverVersion")
    String getDriverVersion();

    @ComProperty(name = "InterfaceVersion")
    Short getInterfaceVersion();

    @ComProperty(name = "MaxSwitch")
    Short getMaxSwitch();

    @ComProperty(name = "Name")
    String getName();

    @ComMethod(name = "GetSwitch")
    Boolean GetSwitch(Short ID);

    @ComMethod(name = "SetSwitch")
    void SetSwitch(Short ID,
                   Boolean State);

    @ComMethod(name = "SetupDialog")
    void SetupDialog();

    @ComMethod(name = "GetSwitchName")
    String GetSwitchName(Short ID);

    @ComMethod(name = "SetSwitchName")
    void SetSwitchName(Short ID, String State);

}