package be.cleardata.jascom;

import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;

public interface ITelescopeV3 extends IUnknown, IRawDispatchHandle, IDispatch {

    @ComProperty(name = "AlignmentMode")
    AlignmentModes getAlignmentMode();

    @ComProperty(name = "Altitude")
    Double getAltitude();

    @ComProperty(name = "ApertureArea")
    Double getApertureArea();

    @ComProperty(name = "ApertureDiameter")
    Double getApertureDiameter();

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

    @ComProperty(name = "CanPulseGuide")
    Boolean getCanPulseGuide();

    @ComProperty(name = "CanSetDeclinationRate")
    Boolean getCanSetDeclinationRate();

    @ComProperty(name = "CanSetGuideRates")
    Boolean getCanSetGuideRates();

    @ComProperty(name = "CanSetPark")
    Boolean getCanSetPark();

    @ComProperty(name = "CanSetRightAscensionRate")
    Boolean getCanSetRightAscensionRate();

    @ComProperty(name = "CanSetPierSide")
    Boolean getCanSetPierSide();

    @ComProperty(name = "CanSetTracking")
    Boolean getCanSetTracking();

    @ComProperty(name = "CanSlew")
    Boolean getCanSlew();

    @ComProperty(name = "CanSlewAltAz")
    Boolean getCanSlewAltAz();

    @ComProperty(name = "CanSlewAltAzAsync")
    Boolean getCanSlewAltAzAsync();

    @ComProperty(name = "CanSlewAsync")
    Boolean getCanSlewAsync();

    @ComProperty(name = "CanSync")
    Boolean getCanSync();

    @ComProperty(name = "CanSyncAltAz")
    Boolean getCanSyncAltAz();

    @ComProperty(name = "CanUnpark")
    Boolean getCanUnpark();

    @ComProperty(name = "Connected")
    Boolean getConnected();

    @ComProperty(name = "Connected")
    void setConnected(Boolean param0);

    @ComProperty(name = "Declination")
    Double getDeclination();

    @ComProperty(name = "DeclinationRate")
    Double getDeclinationRate();

    @ComProperty(name = "DeclinationRate")
    void setDeclinationRate(Double param0);

    @ComProperty(name = "Description")
    String getDescription();

    @ComProperty(name = "DoesRefraction")
    Boolean getDoesRefraction();

    @ComProperty(name = "DoesRefraction")
    void setDoesRefraction(Boolean param0);

    @ComProperty(name = "DriverInfo")
    String getDriverInfo();

    @ComProperty(name = "DriverVersion")
    String getDriverVersion();

    @ComProperty(name = "EquatorialSystem")
    EquatorialCoordinateType getEquatorialSystem();

    @ComProperty(name = "FocalLength")
    Double getFocalLength();

    @ComProperty(name = "GuideRateDeclination")
    Double getGuideRateDeclination();

    @ComProperty(name = "GuideRateDeclination")
    void setGuideRateDeclination(Double param0);

    @ComProperty(name = "GuideRateRightAscension")
    Double getGuideRateRightAscension();

    @ComProperty(name = "GuideRateRightAscension")
    void setGuideRateRightAscension(Double param0);

    @ComProperty(name = "InterfaceVersion")
    Short getInterfaceVersion();

    @ComProperty(name = "IsPulseGuiding")
    Boolean getIsPulseGuiding();

    @ComProperty(name = "Name")
    String getName();

    @ComProperty(name = "RightAscension")
    Double getRightAscension();

    @ComProperty(name = "RightAscensionRate")
    Double getRightAscensionRate();

    @ComProperty(name = "RightAscensionRate")
    void setRightAscensionRate(Double param0);

    @ComProperty(name = "SideOfPier")
    PierSide getSideOfPier();

    @ComProperty(name = "SideOfPier")
    void setSideOfPier(PierSide param0);

    @ComProperty(name = "SiderealTime")
    Double getSiderealTime();

    @ComProperty(name = "SiteElevation")
    Double getSiteElevation();

    @ComProperty(name = "SiteElevation")
    void setSiteElevation(Double param0);

    @ComProperty(name = "SiteLatitude")
    Double getSiteLatitude();

    @ComProperty(name = "SiteLatitude")
    void setSiteLatitude(Double param0);

    @ComProperty(name = "SiteLongitude")
    Double getSiteLongitude();

    @ComProperty(name = "SiteLongitude")
    void setSiteLongitude(Double param0);

    @ComProperty(name = "Slewing")
    Boolean getSlewing();

    @ComProperty(name = "SlewSettleTime")
    Short getSlewSettleTime();

    @ComProperty(name = "SlewSettleTime")
    void setSlewSettleTime(Short param0);

    @ComProperty(name = "TargetDeclination")
    Double getTargetDeclination();

    @ComProperty(name = "TargetDeclination")
    void setTargetDeclination(Double param0);

    @ComProperty(name = "TargetRightAscension")
    Double getTargetRightAscension();

    @ComProperty(name = "TargetRightAscension")
    void setTargetRightAscension(Double param0);

    @ComProperty(name = "Tracking")
    Boolean getTracking();

    @ComProperty(name = "Tracking")
    void setTracking(Boolean param0);

    @ComProperty(name = "TrackingRate")
    DriveRates getTrackingRate();

    @ComProperty(name = "TrackingRate")
    void setTrackingRate(DriveRates param0);

    @ComProperty(name = "TrackingRates")
    ITrackingRates getTrackingRates();

    @ComProperty(name = "UTCDate")
    java.util.Date getUTCDate();

    @ComProperty(name = "UTCDate")
    void setUTCDate(java.util.Date param0);

    @ComMethod(name = "AbortSlew")
    void AbortSlew();

    @ComMethod(name = "AxisRates")
    IAxisRates AxisRates(TelescopeAxes Axis);

    @ComMethod(name = "CanMoveAxis")
    Boolean CanMoveAxis(TelescopeAxes Axis);

    @ComMethod(name = "DestinationSideOfPier")
    PierSide DestinationSideOfPier(Double RightAscension, Double Declination);

    @ComMethod(name = "FindHome")
    void FindHome();

    @ComMethod(name = "MoveAxis")
    void MoveAxis(TelescopeAxes Axis,
                  Double Rate);

    @ComMethod(name = "Park")
    void Park();

    @ComMethod(name = "PulseGuide")
    void PulseGuide(GuideDirections Direction,
                    Integer Duration);

    @ComMethod(name = "SetPark")
    void SetPark();

    @ComMethod(name = "SetupDialog")
    void SetupDialog();

    @ComMethod(name = "SlewToAltAz")
    void SlewToAltAz(Double Azimuth, Double Altitude);

    @ComMethod(name = "SlewToAltAzAsync")
    void SlewToAltAzAsync(Double Azimuth, Double Altitude);

    @ComMethod(name = "SlewToCoordinates")
    void SlewToCoordinates(Double RightAscension, Double Declination);

    @ComMethod(name = "SlewToCoordinatesAsync")
    void SlewToCoordinatesAsync(Double RightAscension, Double Declination);

    @ComMethod(name = "SlewToTarget")
    void SlewToTarget();

    @ComMethod(name = "SlewToTargetAsync")
    void SlewToTargetAsync();

    @ComMethod(name = "SyncToAltAz")
    void SyncToAltAz(Double Azimuth,
                     Double Altitude);

    @ComMethod(name = "SyncToCoordinates")
    void SyncToCoordinates(Double RightAscension,
                           Double Declination);

    @ComMethod(name = "SyncToTarget")
    void SyncToTarget();

    @ComMethod(name = "Unpark")
    void Unpark();

    @ComMethod(name = "CommandBlind")
    void CommandBlind(String Command,
                      Boolean Raw);

    @ComMethod(name = "CommandBool")
    Boolean CommandBool(String Command,
                        Boolean Raw);

    @ComMethod(name = "CommandString")
    String CommandString(String Command,
                         Boolean Raw);

}