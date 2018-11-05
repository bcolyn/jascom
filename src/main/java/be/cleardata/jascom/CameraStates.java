package be.cleardata.jascom;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum CameraStates implements IComEnum {

    cameraIdle(0),

    cameraWaiting(1),

    cameraExposing(2),

    cameraReading(3),

    cameraDownload(4),

    cameraError(5),
    ;

    private long value;

    private CameraStates(long value) {
        this.value = value;
    }

    public long getValue() {
        return this.value;
    }
}