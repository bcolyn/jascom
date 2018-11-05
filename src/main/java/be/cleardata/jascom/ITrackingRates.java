package be.cleardata.jascom;

import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;

public interface ITrackingRates extends IUnknown, IRawDispatchHandle, IDispatch {

    @ComProperty(name = "Count")
    Integer getCount();

    @ComProperty(name = "Item")
    DriveRates getItem(Integer Index);

}