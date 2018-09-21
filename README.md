# sdk-example-network-layer

A simple example of how a network layer could look for the IMONT SDK.

In order to show how a network layer is implemented, a simple network protocol has been developed.  The `ExampleHardwareAccess` class implements this protocol
and should be seen as the firmware running within a hardware module or device coordinator.  Whenever put into acquisition mode, the hardware access will "find"
and emit a new dimmable light bulb. These bulbs can then be toggled on and off, dimmed or removed from the network.  Each request sent across the network will
result in the bulb reporting back this new state after a brief built-in delay.

This project is built with gradle and comes included with the gradle wrapper.  To build, simply run the following from within the project directory

./gradlew clean build install

To include for use with your instance of the SDK, first set a dependency to this project.  If you use gradle, it would look something like this :

```
compile 'io.imont.networks.example-network-layer:network-layer:0.1-SNAPSHOT'
compile 'io.imont.networks.example-network-layer:drivers:0.1-SNAPSHOT'
```

Then within your main class, register the network layer and drivers as follows before starting lion.

```java
lion.registerNetwork(new ExampleNetworkLayer());
lion.getDriverManager().registerBundle(new ExampleDriverBundle());
```