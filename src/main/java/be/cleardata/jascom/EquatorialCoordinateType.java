package be.cleardata.jascom;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum EquatorialCoordinateType implements IComEnum {

    equOther(0),

    equLocalTopocentric(1),

    equJ2000(2),

    equJ2050(3),

    equB1950(4),
    ;

    private long value;

    private EquatorialCoordinateType(long value) {
        this.value = value;
    }

    public long getValue() {
        return this.value;
    }
}