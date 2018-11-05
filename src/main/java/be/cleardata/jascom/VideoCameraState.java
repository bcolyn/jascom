package be.cleardata.jascom;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum VideoCameraState implements IComEnum {

    videoCameraRunning(0),

    videoCameraRecording(1),

    videoCameraError(2)
    ;

    private long value;

    private VideoCameraState(long value) {
        this.value = value;
    }

    public long getValue() {
        return this.value;
    }
}
