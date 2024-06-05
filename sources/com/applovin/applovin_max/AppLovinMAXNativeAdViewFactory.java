package com.applovin.applovin_max;

import android.content.Context;
import com.applovin.sdk.AppLovinSdk;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.g;
import java.util.Map;
import lc.c;
import lc.r;

public class AppLovinMAXNativeAdViewFactory extends g {
    private final c messenger;

    public AppLovinMAXNativeAdViewFactory(c cVar) {
        super(r.f36128a);
        this.messenger = cVar;
    }

    public f create(Context context, int i10, Object obj) {
        AppLovinSdk sdk = AppLovinMAX.getInstance().getSdk();
        if (sdk == null) {
            AppLovinMAX.e("Failed to create MaxNativeAdView widget - please ensure the AppLovin MAX plugin has been initialized by calling 'AppLovinMAX.initialize(...);'!");
            return null;
        }
        Map map = (Map) obj;
        String str = (String) map.get("ad_unit_id");
        AppLovinMAX.d("Creating MaxNativeAdView widget with Ad Unit ID: " + str);
        return new AppLovinMAXNativeAdView(i10, str, map.containsKey("placement") ? (String) map.get("placement") : null, map.containsKey("custom_data") ? (String) map.get("custom_data") : null, map.containsKey("extra_parameters") ? (Map) map.get("extra_parameters") : null, map.containsKey("local_extra_parameters") ? (Map) map.get("local_extra_parameters") : null, this.messenger, sdk, context);
    }
}
