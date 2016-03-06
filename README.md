Corsair CUE SDK wrapper for Java
===

## Description
This wrapper is based on an [JNA](https://github.com/java-native-access/jna) interface generated by [JNAerator](https://github.com/nativelibs4java/JNAerator).

The `CueSDK` class provides some helper methods to access the most common needs from the native SDK, simplifying handling arrays of structs, etc.

## Usage Example
```Java
package dk.allanmc.test;

import dk.allanmc.cuesdk.CorsairLedColor;
import dk.allanmc.cuesdk.CueSDK;

public class CueSDKExample {

    public static void main(String[] args) throws InterruptedException {
        // Establish connection with device
        final CueSDK cue = new CueSDK(true);

        // Set LED #1 to red
        cue.corsairSetLedColor(new CorsairLedColor(1, 255, 0, 0));

        // Wait some time before exiting, so we can see the LED.
        Thread.sleep(5000);
    }

}

```````

## Reference
#### ``CueSDK()``
Instantiates a new CueSDK, and establishes a connection to the Corsair SDK with shared control.

#### ``CueSDK(boolean exclusiveLightingControl)``
Instantiates a new CueSDK, and establishes a connection to the Corsair SDK with shared or exclusive control.

#### ``int corsairGetDeviceCount()``
Get the number of connected devices compatible with the Corsair CUE SDK.

#### ``CorsairDeviceInfo corsairGetDeviceInfo(int deviceIndex)``
Retrieve information about a connected device.

#### ``List<CorsairLedPosition> corsairGetLedPositions()``
Retrieve a list of available LED positions, including their id and physical properties.

#### ``void corsairSetLedColor(CorsairLedColor ledColor)``
Set the color of a single LED.

#### ``void corsairSetLedsColors(Collection<CorsairLedColor> ledColors)``
Set the color af several LED at the same time.