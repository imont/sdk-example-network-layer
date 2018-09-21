/*
 * Copyright (C) 2018 IMONT Technologies Limited
 *
 */
package io.imont.network.example.drivers;

import io.imont.lion.drivers.LionBundle;

import java.net.URL;
import java.util.*;

public class ExampleDriverBundle implements LionBundle {

    private static final String[] DRIVERS = new String[] {
            "example-dimmer.js"
    };

    @Override
    public Map<String, URL> getLibraries() {
        return Collections.emptyMap();
    }

    @Override
    public List<URL> getDrivers() {
        List<URL> ret = new ArrayList<>();
        for (String driver : DRIVERS) {
            ret.add(getClass().getClassLoader().getResource("drivers/" + driver));
        }
        return ret;
    }
}
