package be.cleardata.jascom;

import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.OaIdl;

public interface ICameraV2 extends IUnknown, IRawDispatchHandle, IDispatch {

    @ComProperty(name = "BinX")
    Short getBinX();

    @ComProperty(name = "BinX")
    void setBinX(Short param0);

    @ComProperty(name = "BinY")
    Short getBinY();

    @ComProperty(name = "BinY")
    void setBinY(Short param0);

    @ComProperty(name = "CameraState")
    CameraStates getCameraState();

    @ComProperty(name = "CameraXSize")
    Integer getCameraXSize();

    @ComProperty(name = "CameraYSize")
    Integer getCameraYSize();

    @ComProperty(name = "CanAbortExposure")
    Boolean getCanAbortExposure();

    @ComProperty(name = "CanAsymmetricBin")
    Boolean getCanAsymmetricBin();

    @ComProperty(name = "CanGetCoolerPower")
    Boolean getCanGetCoolerPower();

    @ComProperty(name = "CanPulseGuide")
    Boolean getCanPulseGuide();

    @ComProperty(name = "CanSetCCDTemperature")
    Boolean getCanSetCCDTemperature();

    @ComProperty(name = "CanStopExposure")
    Boolean getCanStopExposure();

    @ComProperty(name = "CCDTemperature")
    Double getCCDTemperature();

    @ComProperty(name = "Connected")
    Boolean getConnected();

    @ComProperty(name = "Connected")
    void setConnected(Boolean param0);

    @ComProperty(name = "CoolerOn")
    Boolean getCoolerOn();

    @ComProperty(name = "CoolerOn")
    void setCoolerOn(Boolean param0);

    @ComProperty(name = "CoolerPower")
    Double getCoolerPower();

    @ComProperty(name = "Description")
    String getDescription();

    @ComProperty(name = "ElectronsPerADU")
    Double getElectronsPerADU();

    @ComProperty(name = "FullWellCapacity")
    Double getFullWellCapacity();

    @ComProperty(name = "HasShutter")
    Boolean getHasShutter();

    @ComProperty(name = "HeatSinkTemperature")
    Double getHeatSinkTemperature();

    @ComProperty(name = "ImageArray")
    OaIdl.SAFEARRAY getImageArray();

    @ComProperty(name = "ImageArrayVariant")
    Object getImageArrayVariant();

    @ComProperty(name = "ImageReady")
    Boolean getImageReady();

    @ComProperty(name = "IsPulseGuiding")
    Boolean getIsPulseGuiding();

    @ComProperty(name = "LastError")
    String getLastError();

    @ComProperty(name = "LastExposureDuration")
    Double getLastExposureDuration();

    @ComProperty(name = "LastExposureStartTime")
    String getLastExposureStartTime();

    @ComProperty(name = "MaxADU")
    Integer getMaxADU();

    @ComProperty(name = "MaxBinX")
    Short getMaxBinX();

    @ComProperty(name = "MaxBinY")
    Short getMaxBinY();

    @ComProperty(name = "NumX")
    Integer getNumX();

    @ComProperty(name = "NumX")
    void setNumX(Integer param0);

    @ComProperty(name = "NumY")
    Integer getNumY();

    @ComProperty(name = "NumY")
    void setNumY(Integer param0);

    @ComProperty(name = "PixelSizeX")
    Double getPixelSizeX();

    @ComProperty(name = "PixelSizeY")
    Double getPixelSizeY();

    @ComProperty(name = "SetCCDTemperature")
    Double getSetCCDTemperature();

    @ComProperty(name = "SetCCDTemperature")
    void setSetCCDTemperature(Double param0);

    @ComProperty(name = "StartX")
    Integer getStartX();

    @ComProperty(name = "StartX")
    void setStartX(Integer param0);

    @ComProperty(name = "StartY")
    Integer getStartY();

    @ComProperty(name = "StartY")
    void setStartY(Integer param0);

    @ComMethod(name = "AbortExposure")
    void AbortExposure();

    @ComMethod(name = "PulseGuide")
    void PulseGuide(GuideDirections Direction, Integer Duration);

    @ComMethod(name = "SetupDialog")
    void SetupDialog();

    @ComMethod(name = "StartExposure")
    void StartExposure(Double Duration, Boolean Light);

    @ComMethod(name = "StopExposure")
    void StopExposure();

}