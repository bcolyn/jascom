package be.cleardata.jascom;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum ShutterState implements IComEnum {

    shutterOpen(0),

    shutterClosed(1),

    shutterOpening(2),

    shutterClosing(3),

    shutterError(4),
    ;

    private long value;

    private ShutterState(long value) {
        this.value = value;
    }

    public long getValue() {
        return this.value;
    }
}