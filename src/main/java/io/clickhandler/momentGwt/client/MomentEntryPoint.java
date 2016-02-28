package io.clickhandler.momentGwt.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;
import momentGwt.resources.MomentGwtBundle;

public class MomentEntryPoint implements EntryPoint {
    @Override
    public void onModuleLoad() {
        final MomentGwtBundle bundle = MomentGwtBundle.INSTANCE;

        // Inject MomentJs with Locales and MomentTimezone with all data
        ScriptInjector.fromString(bundle.momentWithLocales().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        ScriptInjector.fromString(bundle.momentTimezoneWithData().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
    }
}
