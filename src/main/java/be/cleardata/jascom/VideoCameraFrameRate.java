package be.cleardata.jascom;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum VideoCameraFrameRate implements IComEnum {

    Variable(0),

    PAL(1),

    NTSC(2)
    ;

    private long value;

    private VideoCameraFrameRate(long value) {
        this.value = value;
    }

    public long getValue() {
        return this.value;
    }

}
