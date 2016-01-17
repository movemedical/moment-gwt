package momentGwt.client;

import com.google.gwt.core.client.js.JsNamespace;
import jsinterop.annotations.*;


@JsType(isNative = true)
public class Moment {

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Parse
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment();

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(String value);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(String value, String format);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(String value, String format, String locale);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(String value, String format, boolean strictParsing);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(String value, String format, String locale, boolean strictParsing);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(String value, String[] formats);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(String value, String[] formats, String locale);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(String value, String[] formats, boolean strictParsing);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(String value, String[] formats, String locale, boolean strictParsing);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(Parts parts);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(int millis);

    @JsMethod(namespace = "moment")
    public static native Moment unix(double millis);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(int[] values);

    @JsMethod(namespace = JsNamespace.GLOBAL)
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

    // Used for setting defaults. also works for moment(String, String) already defined above
    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native void moment(int defaultValue, String property);


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Get + Set
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public native int milliseconds();

    public native Moment milliseconds(int milliseconds);

    public native int seconds();

    public native Moment seconds(int seconds);

    public native int minutes();

    public native Moment minutes(int minutes);

    // TODO


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Manipulate
    ////////////////////////////////////////////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Display
    ////////////////////////////////////////////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Query
    ////////////////////////////////////////////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // i18n
    ////////////////////////////////////////////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Customize
    ////////////////////////////////////////////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Durations
    ////////////////////////////////////////////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Utilities
    ////////////////////////////////////////////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Moment Timezone
    ////////////////////////////////////////////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Supporting Classes
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    @JsType
    class Parts {
        @JsProperty
        public String year;
        @JsProperty
        public String month;
        @JsProperty
        public String day;
        @JsProperty
        public String hour;
        @JsProperty
        public String minute;
        @JsProperty
        public String seconds;
        @JsProperty
        public String milliseconds;

        @JsIgnore
        public Parts(String year, String month, String day, String hour, String minute, String seconds, String milliseconds) {
            this.year = year;
            this.month = month;
            this.day = day;
            this.hour = hour;
            this.minute = minute;
            this.seconds = seconds;
            this.milliseconds = milliseconds;
        }

        @JsIgnore
        public Parts(String year, String month, String day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        @JsIgnore
        public Parts(String hour, String minute, String seconds, String milliseconds) {
            this.hour = hour;
            this.minute = minute;
            this.seconds = seconds;
            this.milliseconds = milliseconds;
        }
    }

    @JsType
    public class CreationData {
        @JsProperty
        public String input;
        @JsProperty
        public String format;
        @JsProperty
        public Object locale; // todo use locale object
        @JsProperty
        public boolean isUTC;
        @JsProperty
        public boolean strict;
    }
}
