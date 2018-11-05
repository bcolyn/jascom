package be.cleardata.jascom;

import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;

public interface IFocuserV3 extends IUnknown, IRawDispatchHandle, IDispatch {

    @ComProperty(name = "Absolute")
    Boolean getAbsolute();

    @ComProperty(name = "IsMoving")
    Boolean getIsMoving();

    @ComProperty(name = "Link")
    Boolean getLink();

    @ComProperty(name = "Link")
    void setLink(Boolean param0);

    @ComProperty(name = "MaxIncrement")
    Integer getMaxIncrement();

    @ComProperty(name = "MaxStep")
    Integer getMaxStep();

    @ComProperty(name = "Position")
    Integer getPosition();

    @ComProperty(name = "StepSize")
    Double getStepSize();

    @ComProperty(name = "TempComp")
    Boolean getTempComp();

    @ComProperty(name = "TempComp")
    void setTempComp(Boolean param0);

    @ComProperty(name = "TempCompAvailable")
    Boolean getTempCompAvailable();

    @ComProperty(name = "Temperature")
    Double getTemperature();

    @ComMethod(name = "Halt")
    void Halt();

    @ComMethod(name = "SetupDialog")
    void SetupDialog();

    @ComMethod(name = "Move")
    void Move(Integer val);

}