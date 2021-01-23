package com.madv.patterns.structural.bridge.RemoteControls.remotes;
/**
 * интерфейс пульта управления
 * Abstractiom
 */
public interface Remote {
    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}
