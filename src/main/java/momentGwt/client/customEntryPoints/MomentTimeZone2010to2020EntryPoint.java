package momentGwt.client.customEntryPoints;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;
import momentGwt.resources.MomentGwtBundle;

public class MomentTimeZone2010to2020EntryPoint implements EntryPoint {
    @Override
    public void onModuleLoad() {
        ScriptInjector.fromString(MomentGwtBundle.INSTANCE.momentTimezoneWithData2010to2020().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
    }
}
