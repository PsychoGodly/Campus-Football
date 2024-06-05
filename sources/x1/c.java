package x1;

import android.content.Context;
import android.view.View;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import io.flutter.plugin.platform.e;
import io.flutter.plugin.platform.f;
import java.util.HashMap;
import lc.k;

/* compiled from: FacebookBannerAdPlugin */
class c implements f, AdListener {

    /* renamed from: a  reason: collision with root package name */
    private final AdView f23576a;

    /* renamed from: b  reason: collision with root package name */
    private final k f23577b;

    c(Context context, int i10, HashMap hashMap, lc.c cVar) {
        this.f23577b = new k(cVar, "fb.audience.network.io/bannerAd_" + i10);
        AdView adView = new AdView(context, (String) hashMap.get("id"), a(hashMap));
        this.f23576a = adView;
        adView.loadAd(adView.buildLoadAdConfig().withAdListener(this).build());
    }

    private AdSize a(HashMap hashMap) {
        int intValue = ((Integer) hashMap.get("height")).intValue();
        if (intValue >= 250) {
            return AdSize.RECTANGLE_HEIGHT_250;
        }
        if (intValue >= 90) {
            return AdSize.BANNER_HEIGHT_90;
        }
        return AdSize.BANNER_HEIGHT_50;
    }

    public void dispose() {
    }

    public View getView() {
        return this.f23576a;
    }

    public void onAdClicked(Ad ad2) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad2.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad2.isAdInvalidated()));
        this.f23577b.c("clicked", hashMap);
    }

    public void onAdLoaded(Ad ad2) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad2.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad2.isAdInvalidated()));
        this.f23577b.c("loaded", hashMap);
    }

    public void onError(Ad ad2, AdError adError) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad2.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad2.isAdInvalidated()));
        hashMap.put("error_code", Integer.valueOf(adError.getErrorCode()));
        hashMap.put("error_message", adError.getErrorMessage());
        this.f23577b.c("error", hashMap);
    }

    public /* synthetic */ void onFlutterViewAttached(View view) {
        e.a(this, view);
    }

    public /* synthetic */ void onFlutterViewDetached() {
        e.b(this);
    }

    public /* synthetic */ void onInputConnectionLocked() {
        e.c(this);
    }

    public /* synthetic */ void onInputConnectionUnlocked() {
        e.d(this);
    }

    public void onLoggingImpression(Ad ad2) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad2.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad2.isAdInvalidated()));
        this.f23577b.c("logging_impression", hashMap);
    }
}
