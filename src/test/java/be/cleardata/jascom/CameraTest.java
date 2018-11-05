package be.cleardata.jascom;

import com.sun.jna.platform.win32.OaIdl;
import com.sun.jna.platform.win32.Ole32;

public class CameraTest {

    public static void main(String[] args) throws InterruptedException {
        String simulator = "ASCOM.Simulator.Camera";
        Ole32.INSTANCE.CoInitializeEx(null, Ole32.COINIT_MULTITHREADED);
        JAscomFactory comFactory = new JAscomFactory();

        ICameraV2 camera = comFactory.createObject(simulator, ICameraV2.class);
        camera.SetupDialog();
        camera.setConnected(true);
        camera.setCoolerOn(true);

        camera.StartExposure(20.0, true);

        CameraStates cameraState = camera.getCameraState();
        assert(cameraState == CameraStates.cameraExposing);
        while (! camera.getImageReady()){
            Thread.sleep(1000);
        }

        OaIdl.SAFEARRAY array = camera.getImageArray();

        camera.setCoolerOn(false);
        camera.setConnected(false);
    }

}
