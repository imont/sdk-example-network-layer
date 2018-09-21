/*
 * Copyright (C) 2018 IMONT Technologies Limited
 *
 */
package io.imont.network.example;


import io.imont.network.example.hardwareaccess.ExampleHardwareAccess;

public class ExampleDriverInterface {

    private final ExampleHardwareAccess fakeDeviceConnection;

    public ExampleDriverInterface(final ExampleHardwareAccess fakeDeviceConnection) {
        this.fakeDeviceConnection = fakeDeviceConnection;
    }

    public void readAttribute(final String deviceId, final String attributeId) {
        fakeDeviceConnection.downStreamMessage(String.format("READ_ATTRIBUTE:%s,%s", deviceId, attributeId));
    }

    public void writeAttribute(final String deviceId, final String attributeId, final String value) {
        fakeDeviceConnection.downStreamMessage(String.format("WRITE_ATTRIBUTE:%s,%s,%s", deviceId, attributeId, value));
    }
}
