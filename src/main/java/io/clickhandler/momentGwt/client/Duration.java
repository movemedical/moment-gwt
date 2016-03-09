package io.clickhandler.momentGwt.client;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


@JsType(isNative = true)
public class Duration {

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Created by Moment class, but has several own functions including a couple static
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public native String humanize();
    public native double milliseconds();
    public native double asMilliseconds();
    public native double seconds();
    public native double asSeconds();
    public native double minutes();
    public native double asMinutes();
    public native double hours();
    public native double asHours();
    public native double days();
    public native double asDays();
    public native double months();
    public native double asMonths();
    public native double years();
    public native double asYears();
    public native Object toJSON();


    @JsMethod(namespace = "duration")
    public static native Duration as(String unitOfTime);
    // Get method
    @JsMethod(namespace = "duration")
    public static native Duration get(String unitOfTime);


    // can call other methods like add and subtract on a duration instance
    public native Duration add(double amount, String key);
    public native Duration add(double amount);
    public native Duration add(Duration duration);
    public native Duration add(Object object);

    public native Duration substract(double amount, String key);
    public native Duration substract(double amount);
    public native Duration substract(Duration duration);
    public native Duration substract(Object object);
}
