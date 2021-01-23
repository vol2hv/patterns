package com.madv.patterns.structural.bridge.RemoteControls.devices;
/**
 * интерфейс устройства
 * Implementation
 */
public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
