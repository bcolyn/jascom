package be.cleardata.jascom;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum PierSide implements IComEnum {

    pierUnknown(-1),

    pierEast(0),

    pierWest(1),
    ;

    private long value;

    private PierSide(long value) {
        this.value = value;
    }

    public long getValue() {
        return this.value;
    }
}