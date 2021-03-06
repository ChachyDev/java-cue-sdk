package dk.allanmc.cuesdk.jna;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * contains information about separate LED-device connected to the channel controlled by the DIY-device.<br>
 * <i>native declaration : target\CUESDK\include\CUESDK.h:124</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CorsairChannelDeviceInfo extends Structure {
    /**
     * type of the LED-device.<br>
     * C type : CorsairChannelDeviceType
     */
    public int type;
    /**
     * number of LEDs controlled by LED-device.
     */
    public int deviceLedCount;

    public CorsairChannelDeviceInfo() {
        super();
    }

    /**
     * @param type           @see CorsairChannelDeviceType<br>
     *                       type of the LED-device.<br>
     *                       C type : CorsairChannelDeviceType<br>
     * @param deviceLedCount number of LEDs controlled by LED-device.
     */
    public CorsairChannelDeviceInfo(int type, int deviceLedCount) {
        super();
        this.type = type;
        this.deviceLedCount = deviceLedCount;
    }

    public CorsairChannelDeviceInfo(Pointer peer) {
        super(peer);
    }

    protected List<?> getFieldOrder() {
        return Arrays.asList("type", "deviceLedCount");
    }

    public static class ByReference extends CorsairChannelDeviceInfo implements Structure.ByReference {

    }

	public static class ByValue extends CorsairChannelDeviceInfo implements Structure.ByValue {

    }

}
