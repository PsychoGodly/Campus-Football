package x1;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;
import io.flutter.plugin.platform.e;
import java.util.HashMap;
import lc.c;
import lc.k;

/* compiled from: FacebookNativeAdPlugin */
class f implements io.flutter.plugin.platform.f, NativeAdListener {

    /* renamed from: a  reason: collision with root package name */
    private LinearLayout f23584a;

    /* renamed from: b  reason: collision with root package name */
    private final k f23585b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap f23586c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f23587d;

    /* renamed from: f  reason: collision with root package name */
    private NativeAd f23588f;

    /* renamed from: g  reason: collision with root package name */
    private NativeBannerAd f23589g;

    /* compiled from: FacebookNativeAdPlugin */
    class a implements Runnable {
        a() {
        }

        public void run() {
            f.this.d();
        }
    }

    f(Context context, int i10, HashMap hashMap, c cVar) {
        this.f23584a = new LinearLayout(context);
        this.f23585b = new k(cVar, "fb.audience.network.io/nativeAd_" + i10);
        this.f23586c = hashMap;
        this.f23587d = context;
        if (((Boolean) hashMap.get("banner_ad")).booleanValue()) {
            NativeBannerAd nativeBannerAd = new NativeBannerAd(context, (String) hashMap.get("id"));
            this.f23589g = nativeBannerAd;
            this.f23589g.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(this).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).build());
            return;
        }
        NativeAd nativeAd = new NativeAd(context, (String) hashMap.get("id"));
        this.f23588f = nativeAd;
        this.f23588f.loadAd(nativeAd.buildLoadAdConfig().withAdListener(this).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).build());
    }

    private NativeBannerAdView.Type b(HashMap hashMap) {
        int intValue = ((Integer) hashMap.get("height")).intValue();
        if (intValue == 50) {
            return NativeBannerAdView.Type.HEIGHT_50;
        }
        if (intValue == 100) {
            return NativeBannerAdView.Type.HEIGHT_100;
        }
        if (intValue != 120) {
            return NativeBannerAdView.Type.HEIGHT_120;
        }
        return NativeBannerAdView.Type.HEIGHT_120;
    }

    private NativeAdViewAttributes c(Context context, HashMap hashMap) {
        NativeAdViewAttributes nativeAdViewAttributes = new NativeAdViewAttributes(context);
        if (hashMap.get("bg_color") != null) {
            nativeAdViewAttributes.setBackgroundColor(Color.parseColor((String) hashMap.get("bg_color")));
        }
        if (hashMap.get("title_color") != null) {
            nativeAdViewAttributes.setTitleTextColor(Color.parseColor((String) hashMap.get("title_color")));
        }
        if (hashMap.get("desc_color") != null) {
            nativeAdViewAttributes.setDescriptionTextColor(Color.parseColor((String) hashMap.get("desc_color")));
        }
        if (hashMap.get("button_color") != null) {
            nativeAdViewAttributes.setButtonColor(Color.parseColor((String) hashMap.get("button_color")));
        }
        if (hashMap.get("button_title_color") != null) {
            nativeAdViewAttributes.setButtonTextColor(Color.parseColor((String) hashMap.get("button_title_color")));
        }
        if (hashMap.get("button_border_color") != null) {
            nativeAdViewAttributes.setButtonBorderColor(Color.parseColor((String) hashMap.get("button_border_color")));
        }
        return nativeAdViewAttributes;
    }

    /* access modifiers changed from: private */
    public void d() {
        if (this.f23584a.getChildCount() > 0) {
            this.f23584a.removeAllViews();
        }
        if (((Boolean) this.f23586c.get("banner_ad")).booleanValue()) {
            this.f23584a.addView(NativeBannerAdView.render(this.f23587d, this.f23589g, b(this.f23586c), c(this.f23587d, this.f23586c)));
        } else {
            LinearLayout linearLayout = this.f23584a;
            Context context = this.f23587d;
            linearLayout.addView(NativeAdView.render(context, this.f23588f, c(context, this.f23586c)));
        }
        this.f23585b.c("loaded", this.f23586c);
    }

    public void dispose() {
    }

    public View getView() {
        return this.f23584a;
    }

    public void onAdClicked(Ad ad2) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad2.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad2.isAdInvalidated()));
        this.f23585b.c("clicked", hashMap);
    }

    public void onAdLoaded(Ad ad2) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad2.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad2.isAdInvalidated()));
        this.f23585b.c("load_success", hashMap);
        this.f23584a.postDelayed(new a(), 200);
    }

    public void onError(Ad ad2, AdError adError) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad2.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad2.isAdInvalidated()));
        hashMap.put("error_code", Integer.valueOf(adError.getErrorCode()));
        hashMap.put("error_message", adError.getErrorMessage());
        this.f23585b.c("error", hashMap);
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
        this.f23585b.c("logging_impression", hashMap);
    }

    public void onMediaDownloaded(Ad ad2) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad2.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad2.isAdInvalidated()));
        this.f23585b.c("media_downloaded", hashMap);
    }
}
