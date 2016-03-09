package io.clickhandler.momentGwt.client;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative = true)
public class Zone {

    @JsProperty
    public String name; // unique identifier
    @JsProperty
    public String[] abbrs; // abbreviations
    @JsProperty
    public double[] until; // timestamps in milliseconds
    @JsProperty
    public double[] offsets;

    public native String format();
    public native String zoneAbbr();
    public native String zoneName();

    @JsMethod(namespace = "tz")
    public static native String abbr(double timestamp); // get the abbreviation of a given timestamp

    @JsMethod(namespace = "tz")
    public static native double offset(double timestamp); // was string

    @JsMethod(namespace = "tz")
    public static native double parse(double timestamp); // was string

    // format utilities for unpacked and packed, conversions, etc
    @JsMethod(namespace = "tz")
    public static native String pack(Zone unpackedObject);
    @JsMethod(namespace = "tz")
    public static native Object unpack(String packedString);
    @JsMethod(namespace = "tz")
    public static native String packBase60(double number);
    @JsMethod(namespace = "tz")
    public static native String packBase60(double number, double precision);
    @JsMethod(namespace = "tz")
    public static native double unpackBase60(String base60String);

    // when not using the Zone object a special string can be used, it follows a specific link format from docs
    @JsMethod(namespace = "tz")
    public static native String add(String packedZoneString);
    @JsMethod(namespace = "tz")
    public static native String add(String[] packedZoneString);
    @JsMethod(namespace = "tz")
    public static native String link(String packedLinkString);
    @JsMethod(namespace = "tz")
    public static native String link(String[] packedLinkStrings);
    @JsMethod(namespace = "tz")
    public static native Object createLinks(Object unpackedBundle);

    @JsMethod(namespace = "tz")
    public static native Object load(Object data);
    @JsMethod(namespace = "tz")
    public static native Object zone(String name); // can return Zone if zone was loaded, null if zone was not loaded
//    @JsMethod(namespace = "tz")
//    public static native String[] names();

    // filters
    @JsMethod(namespace = "tz")
    public static native Object filterYears(Object unpackedZone, double startYear, double endYear); // returns an unpacked zone
    @JsMethod(namespace = "tz")
    public static native Object filterLinkPack(Object unpackedZone, double startYear, double endYear); //  returns a packed bundle


}

/*
    example of bottom methods here
    moment.tz.zone("UnloadedZone"); // null
    moment.tz.add("UnloadedZone|UZ|0|0|");
    moment.tz.zone("UnloadedZone"); // returns zone
 */