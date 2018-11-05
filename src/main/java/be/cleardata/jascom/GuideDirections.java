package be.cleardata.jascom;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum GuideDirections implements IComEnum {

    guideNorth(0),

    guideSouth(1),

    guideEast(2),

    guideWest(3),
    ;

    private long value;

    private GuideDirections(long value) {
        this.value = value;
    }

    public long getValue() {
        return this.value;
    }
}