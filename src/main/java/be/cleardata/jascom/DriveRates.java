package be.cleardata.jascom;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum DriveRates implements IComEnum {

    driveSidereal(0),

    driveLunar(1),

    driveSolar(2),

    driveKing(3),
    ;

    private long value;

    private DriveRates(long value) {
        this.value = value;
    }

    public long getValue() {
        return this.value;
    }
}