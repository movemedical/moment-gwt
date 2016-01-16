package momentGwt.client.customEntryPoints;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;
import momentGwt.resources.MomentGwtBundle;

public class MomentWithLocalesEntryPoint implements EntryPoint {
    @Override
    public void onModuleLoad() {
        ScriptInjector.fromString(MomentGwtBundle.INSTANCE.momentWithLocales().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
    }
}
