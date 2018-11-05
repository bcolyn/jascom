package be.cleardata.jascom;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum AlignmentModes implements IComEnum {

    algAltAz(0),

    algPolar(1),

    algGermanPolar(2),
    ;

    private long value;

    private AlignmentModes(long value) {
        this.value = value;
    }

    public long getValue() {
        return this.value;
    }
}