package com.applovin.applovin_max;

import android.content.Context;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.g;
import java.util.Map;
import lc.c;
import lc.r;

public class AppLovinMAXAdViewFactory extends g {
    private final c messenger;

    public AppLovinMAXAdViewFactory(c cVar) {
        super(r.f36128a);
        this.messenger = cVar;
    }

    public f create(Context context, int i10, Object obj) {
        AppLovinSdk sdk = AppLovinMAX.getInstance().getSdk();
        Map map = null;
        if (sdk == null) {
            AppLovinMAX.e("Failed to create MaxAdView widget - please ensure the AppLovin MAX plugin has been initialized by calling 'AppLovinMAX.initialize(...);'!");
            return null;
        }
        Map map2 = (Map) obj;
        String str = (String) map2.get("ad_unit_id");
        MaxAdFormat deviceSpecificBannerAdViewAdFormat = "mrec".equals((String) map2.get("ad_format")) ? MaxAdFormat.MREC : AppLovinMAX.getDeviceSpecificBannerAdViewAdFormat(context);
        AppLovinMAX.d("Creating MaxAdView widget with Ad Unit ID: " + str);
        boolean equals = Boolean.TRUE.equals(map2.get("is_auto_refresh_enabled"));
        String str2 = map2.containsKey("placement") ? (String) map2.get("placement") : null;
        String str3 = map2.containsKey("custom_data") ? (String) map2.get("custom_data") : null;
        Map map3 = map2.containsKey("extra_parameters") ? (Map) map2.get("extra_parameters") : null;
        if (map2.containsKey("local_extra_parameters")) {
            map = (Map) map2.get("local_extra_parameters");
        }
        return new AppLovinMAXAdView(i10, str, deviceSpecificBannerAdViewAdFormat, equals, str2, str3, map3, map, this.messenger, sdk, context);
    }
}
