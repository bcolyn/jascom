package be.cleardata.jascom;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum TelescopeAxes implements IComEnum {

    axisPrimary(0),

    axisSecondary(1),

    axisTertiary(2),
    ;

    private long value;

    private TelescopeAxes(long value) {
        this.value = value;
    }

    public long getValue() {
        return this.value;
    }
}