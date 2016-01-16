package momentGwt.client.customEntryPoints;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;
import momentGwt.resources.MomentGwtBundle;

public class MomentNoLocalesEntryPoint implements EntryPoint {
    @Override
    public void onModuleLoad() {
        ScriptInjector.fromString(MomentGwtBundle.INSTANCE.moment().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
    }
}
