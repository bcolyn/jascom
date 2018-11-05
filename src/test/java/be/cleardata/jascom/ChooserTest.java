package be.cleardata.jascom;

import com.sun.jna.platform.win32.Ole32;

public class ChooserTest {

    public static void main(String[] args) {
        Ole32.INSTANCE.CoInitializeEx(null, Ole32.COINIT_MULTITHREADED);
        JAscomFactory comFactory = new JAscomFactory();
        Chooser chooser = comFactory.createObject("ASCOM.Utilities.Chooser", Chooser.class);
        chooser.setDeviceType("Camera");
        String choice = chooser.Choose(null);
        System.out.println(choice);
    }

}
