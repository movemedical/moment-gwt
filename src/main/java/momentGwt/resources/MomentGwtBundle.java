package momentGwt.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;


public interface MomentGwtBundle extends ClientBundle {
    MomentGwtBundle INSTANCE = GWT.create(MomentGwtBundle.class);

    @Source("moment/moment.js")
    TextResource moment();

    @Source("moment/moment-with-locales.js")
    TextResource momentWithLocales();

    @Source("momentTimezone/moment-timezone.js")
    TextResource momentTimezone();

    @Source("momentTimezone/moment-timezone-with-data.js")
    TextResource momentTimezoneWithData();

    @Source("momentTimezone/moment-timezone-with-data-2010-2020.js")
    TextResource momentTimezoneWithData2010to2020();
}