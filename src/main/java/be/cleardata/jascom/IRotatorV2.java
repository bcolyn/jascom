package be.cleardata.jascom;

import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;

public interface IRotatorV2 extends IUnknown, IRawDispatchHandle, IDispatch {

    @ComProperty(name = "CanReverse")
    Boolean getCanReverse();

    @ComProperty(name = "Connected")
    Boolean getConnected();

    @ComProperty(name = "Connected")
    void setConnected(Boolean param0);

    @ComProperty(name = "IsMoving")
    Boolean getIsMoving();

    @ComProperty(name = "Position")
    Float getPosition();

    @ComProperty(name = "Reverse")
    Boolean getReverse();

    @ComProperty(name = "Reverse")
    void setReverse(Boolean param0);

    @ComProperty(name = "StepSize")
    Float getStepSize();

    @ComProperty(name = "TargetPosition")
    Float getTargetPosition();

    @ComMethod(name = "Halt")
    void Halt();

    @ComMethod(name = "Move")
    void Move(Float Position);

    @ComMethod(name = "MoveAbsolute")
    void MoveAbsolute(Float Position);

    @ComMethod(name = "SetupDialog")
    void SetupDialog();

}