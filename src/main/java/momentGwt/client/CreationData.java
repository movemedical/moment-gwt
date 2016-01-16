package momentGwt.client;

import jsinterop.annotations.JsType;


@JsType(isNative = true)
public class CreationData {
        String input;
        String format;
        Object locale; // todo use locale object
        boolean isUTC;
        boolean strict;
}
