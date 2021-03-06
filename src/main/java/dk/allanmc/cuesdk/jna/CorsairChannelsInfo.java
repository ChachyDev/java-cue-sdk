package dk.allanmc.cuesdk.jna;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * contains information about channels of the DIY-devices.<br>
 * <i>native declaration : target\CUESDK\include\CUESDK.h:137</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CorsairChannelsInfo extends Structure {
    /**
     * number of channels controlled by the device.
     */
    public int channelsCount;
    /**
     * array containing information about each separate channel of the DIY-device. Index of the channel in the array is same as index of the channel on the DIY-device.<br>
     * C type : CorsairChannelInfo*
     */
    public CorsairChannelInfo.ByReference channels;

    public CorsairChannelsInfo() {
        super();
    }

    /**
     * @param channelsCount number of channels controlled by the device.<br>
     * @param channels      array containing information about each separate channel of the DIY-device. Index of the channel in the array is same as index of the channel on the DIY-device.<br>
     *                      C type : CorsairChannelInfo*
     */
    public CorsairChannelsInfo(int channelsCount, CorsairChannelInfo.ByReference channels) {
        super();
        this.channelsCount = channelsCount;
        this.channels = channels;
    }

    public CorsairChannelsInfo(Pointer peer) {
        super(peer);
    }

    protected List<?> getFieldOrder() {
        return Arrays.asList("channelsCount", "channels");
    }

    public static class ByReference extends CorsairChannelsInfo implements Structure.ByReference {

    }

    public static class ByValue extends CorsairChannelsInfo implements Structure.ByValue {

    }

}
