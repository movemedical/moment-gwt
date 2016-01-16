package momentGwt.client;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative = true)
public class Moment {
    public static native Moment moment();

    public static native Moment moment(String value);

    public static native Moment moment(String value, String format);

    public static native Moment moment(String value, String format, String locale);

    public static native Moment moment(String value, String format, boolean strictParsing);

    public static native Moment moment(String value, String format, String locale, boolean strictParsing);

    public static native Moment moment(String value, String[] formats);

    public static native Moment moment(String value, String[] formats, String locale);

    public static native Moment moment(String value, String[] formats, boolean strictParsing);

    public static native Moment moment(String value, String[] formats, String locale, boolean strictParsing);

    public static native Moment moment(Parts parts);

    public static native Moment moment(int millis);

    @JsMethod(namespace = "moment")
    public static native Moment unix(double millis);

    public static native Moment moment(int[] values);

    public static native Moment moment(Moment moment);

    @JsMethod(namespace = "moment")
    public static native Moment utc();

    @JsMethod(namespace = "moment")
    public static native Moment utc(int millis);

    @JsMethod(namespace = "moment")
    public static native Moment utc(int[] values);

    @JsMethod(namespace = "moment")
    public static native Moment utc(String value);

    @JsMethod(namespace = "moment")
    public static native Moment utc(String value, String format);

    @JsMethod(namespace = "moment")
    public static native Moment utc(String value, String[] formats);

    @JsMethod(namespace = "moment")
    public static native Moment utc(String value, String format, String locale);

    @JsMethod(namespace = "moment")
    public static native Moment utc(Moment moment);

    @JsMethod(namespace = "moment")
    public static native Moment parseZone(String value);

    public native Moment zone(String value);

    public native boolean isValid();

    public native String invalidAt();

    public native CreationData creationData();


    // Setting Defaults
    // also works for moment(String, String) already defined above
    public static native void moment(int value, String property);

    // Getter and Setter

    public native int milliseconds();

    public native Moment milliseconds(int milliseconds);

    public native int seconds();

    public native Moment seconds(int seconds);

    public native int minutes();

    public native Moment minutes(int minutes);

    // TODO


    public native String format(String format);

    public native String fromNow();

    public native String calendar();

    @JsType
    class Parts {
        @JsProperty
        String year;
        @JsProperty
        String month;
        @JsProperty
        String day;
        @JsProperty
        String hour;
        @JsProperty
        String minute;
        @JsProperty
        String seconds;
        @JsProperty
        String milliseconds;

        public Parts(String year, String month, String day, String hour, String minute, String seconds, String milliseconds) {
            this.year = year;
            this.month = month;
            this.day = day;
            this.hour = hour;
            this.minute = minute;
            this.seconds = seconds;
            this.milliseconds = milliseconds;
        }

        public Parts(String year, String month, String day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public Parts(String hour, String minute, String seconds, String milliseconds) {
            this.hour = hour;
            this.minute = minute;
            this.seconds = seconds;
            this.milliseconds = milliseconds;
        }
    }
}
