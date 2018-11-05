package be.cleardata.jascom;

import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;

public interface IDomeV2 extends IUnknown, IRawDispatchHandle, IDispatch {

    @ComProperty(name = "Altitude")
    Double getAltitude();

    @ComProperty(name = "AtHome")
    Boolean getAtHome();

    @ComProperty(name = "AtPark")
    Boolean getAtPark();

    @ComProperty(name = "Azimuth")
    Double getAzimuth();

    @ComProperty(name = "CanFindHome")
    Boolean getCanFindHome();

    @ComProperty(name = "CanPark")
    Boolean getCanPark();

    @ComProperty(name = "CanSetAltitude")
    Boolean getCanSetAltitude();

    @ComProperty(name = "CanSetAzimuth")
    Boolean getCanSetAzimuth();

    @ComProperty(name = "CanSetPark")
    Boolean getCanSetPark();

    @ComProperty(name = "CanSetShutter")
    Boolean getCanSetShutter();

    @ComProperty(name = "CanSlave")
    Boolean getCanSlave();

    @ComProperty(name = "CanSyncAzimuth")
    Boolean getCanSyncAzimuth();

    @ComProperty(name = "Connected")
    Boolean getConnected();

    @ComProperty(name = "Connected")
    void setConnected(Boolean param0);

    @ComProperty(name = "Description")
    String getDescription();

    @ComProperty(name = "DriverInfo")
    String getDriverInfo();

    @ComProperty(name = "InterfaceVersion")
    Short getInterfaceVersion();

    @ComProperty(name = "Name")
    String getName();

    @ComProperty(name = "Slaved")
    Boolean getSlaved();

    @ComProperty(name = "Slaved")
    void setSlaved(Boolean param0);

    @ComProperty(name = "ShutterStatus")
    ShutterState getShutterStatus();

    @ComProperty(name = "Slewing")
    Boolean getSlewing();

    @ComMethod(name = "AbortSlew")
    void AbortSlew();

    @ComMethod(name = "CloseShutter")
    void CloseShutter();

    @ComMethod(name = "FindHome")
    void FindHome();

    @ComMethod(name = "OpenShutter")
    void OpenShutter();

    @ComMethod(name = "Park")
    void Park();

    @ComMethod(name = "SetPark")
    void SetPark();

    @ComMethod(name = "SetupDialog")
    void SetupDialog();

    @ComMethod(name = "SlewToAltitude")
    void SlewToAltitude(Double Altitude);

    @ComMethod(name = "SlewToAzimuth")
    void SlewToAzimuth(Double Azimuth);

    @ComMethod(name = "SyncToAzimuth")
    void SyncToAzimuth(Double Azimuth);

    @ComMethod(name = "CommandBlind")
    void CommandBlind(String Command);

    @ComMethod(name = "CommandBool")
    Boolean CommandBool(String Command);

    @ComMethod(name = "CommandString")
    String CommandString(String Command);

}