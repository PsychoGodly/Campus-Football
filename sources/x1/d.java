package x1;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import java.util.HashMap;
import lc.j;
import lc.k;

/* compiled from: FacebookInterstitialAdPlugin */
class d implements k.c, InterstitialAdListener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public InterstitialAd f23578a = null;

    /* renamed from: b  reason: collision with root package name */
    private Context f23579b;

    /* renamed from: c  reason: collision with root package name */
    private k f23580c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f23581d;

    /* compiled from: FacebookInterstitialAdPlugin */
    class a implements Runnable {
        a() {
        }

        public void run() {
            if (d.this.f23578a != null && d.this.f23578a.isAdLoaded() && !d.this.f23578a.isAdInvalidated()) {
                d.this.f23578a.show(d.this.f23578a.buildShowAdConfig().build());
            }
        }
    }

    d(Context context, k kVar) {
        this.f23579b = context;
        this.f23580c = kVar;
        this.f23581d = new Handler();
    }

    private boolean b() {
        InterstitialAd interstitialAd = this.f23578a;
        if (interstitialAd == null) {
            return false;
        }
        interstitialAd.destroy();
        this.f23578a = null;
        return true;
    }

    private boolean c(HashMap hashMap) {
        String str = (String) hashMap.get("id");
        if (this.f23578a == null) {
            this.f23578a = new InterstitialAd(this.f23579b, str);
        }
        try {
            if (this.f23578a.isAdLoaded()) {
                return true;
            }
            this.f23578a.loadAd(this.f23578a.buildLoadAdConfig().withAdListener(this).withCacheFlags(CacheFlag.ALL).build());
            return true;
        } catch (Exception e10) {
            Log.e("InterstitialLoadAdError", e10.getCause().getMessage());
            return false;
        }
    }

    private boolean d(HashMap hashMap) {
        int intValue = ((Integer) hashMap.get("delay")).intValue();
        InterstitialAd interstitialAd = this.f23578a;
        if (interstitialAd == null || !interstitialAd.isAdLoaded() || this.f23578a.isAdInvalidated()) {
            return false;
        }
        if (intValue <= 0) {
            this.f23578a.show(this.f23578a.buildShowAdConfig().build());
            return true;
        }
        this.f23581d.postDelayed(new a(), (long) intValue);
        return true;
    }

    public void onAdClicked(Ad ad2) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad2.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad2.isAdInvalidated()));
        this.f23580c.c("clicked", hashMap);
    }

    public void onAdLoaded(Ad ad2) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad2.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad2.isAdInvalidated()));
        this.f23580c.c("loaded", hashMap);
    }

    public void onError(Ad ad2, AdError adError) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad2.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad2.isAdInvalidated()));
        hashMap.put("error_code", Integer.valueOf(adError.getErrorCode()));
        hashMap.put("error_message", adError.getErrorMessage());
        this.f23580c.c("error", hashMap);
    }

    public void onInterstitialDismissed(Ad ad2) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad2.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad2.isAdInvalidated()));
        this.f23580c.c("dismissed", hashMap);
    }

    public void onInterstitialDisplayed(Ad ad2) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad2.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad2.isAdInvalidated()));
        this.f23580c.c("displayed", hashMap);
    }

    public void onLoggingImpression(Ad ad2) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad2.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad2.isAdInvalidated()));
        this.f23580c.c("logging_impression", hashMap);
    }

    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.f36116a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1941808395:
                if (str.equals("loadInterstitialAd")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1193444148:
                if (str.equals("showInterstitialAd")) {
                    c10 = 1;
                    break;
                }
                break;
            case 166478601:
                if (str.equals("destroyInterstitialAd")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                dVar.success(Boolean.valueOf(c((HashMap) jVar.f36117b)));
                return;
            case 1:
                dVar.success(Boolean.valueOf(d((HashMap) jVar.f36117b)));
                return;
            case 2:
                dVar.success(Boolean.valueOf(b()));
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }
}
