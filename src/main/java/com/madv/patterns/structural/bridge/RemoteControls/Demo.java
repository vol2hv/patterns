package com.madv.patterns.structural.bridge.RemoteControls;
/**
 * Он же Client
 */

import com.madv.patterns.structural.bridge.RemoteControls.devices.Device;
import com.madv.patterns.structural.bridge.RemoteControls.devices.Radio;
import com.madv.patterns.structural.bridge.RemoteControls.devices.Tv;
import com.madv.patterns.structural.bridge.RemoteControls.remotes.AdvancedRemote;
import com.madv.patterns.structural.bridge.RemoteControls.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
