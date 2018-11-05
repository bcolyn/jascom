package be.cleardata.jascom;

import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;

@ComObject(progId = "ASCOM.Utilities.Chooser")
public interface Chooser {

    @ComProperty(name = "DeviceType")
    String getDeviceType();

    @ComProperty(name = "DeviceType")
    void setDeviceType(String deviceType);

    @ComMethod
    String Choose(String selection);

}
