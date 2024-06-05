package x1;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import java.util.HashMap;
import lc.j;
import lc.k;

/* compiled from: FacebookRewardedVideoAdPlugin */
class g implements k.c, RewardedVideoAdListener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public RewardedVideoAd f23591a = null;

    /* renamed from: b  reason: collision with root package name */
    private Context f23592b;

    /* renamed from: c  reason: collision with root package name */
    private k f23593c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f23594d;

    /* compiled from: FacebookRewardedVideoAdPlugin */
    class a implements Runnable {
        a() {
        }

        public void run() {
            if (g.this.f23591a != null && g.this.f23591a.isAdLoaded() && !g.this.f23591a.isAdInvalidated()) {
                g.this.f23591a.show(g.this.f23591a.buildShowAdConfig().build());
            }
        }
    }

    g(Context context, k kVar) {
        this.f23592b = context;
        this.f23593c = kVar;
        this.f23594d = new Handler();
    }

    private boolean b() {
        RewardedVideoAd rewardedVideoAd = this.f23591a;
        if (rewardedVideoAd == null) {
            return false;
        }
        rewardedVideoAd.destroy();
        this.f23591a = null;
        return true;
    }

    private boolean c(HashMap hashMap) {
        String str = (String) hashMap.get("id");
        if (this.f23591a == null) {
            this.f23591a = new RewardedVideoAd(this.f23592b, str);
        }
        try {
            if (this.f23591a.isAdLoaded()) {
                return true;
            }
            this.f23591a.loadAd(this.f23591a.buildLoadAdConfig().withAdListener(this).build());
            return true;
        } catch (Exception e10) {
            Log.e("RewardedVideoAdError", e10.getMessage());
            return false;
        }
    }

    private boolean d(HashMap hashMap) {
        int intValue = ((Integer) hashMap.get("delay")).intValue();
        RewardedVideoAd rewardedVideoAd = this.f23591a;
        if (rewardedVideoAd == null || !rewardedVideoAd.isAdLoaded() || this.f23591a.isAdInvalidated()) {
            return false;
        }
        if (intValue <= 0) {
            this.f23591a.show(this.f23591a.buildShowAdConfig().build());
            return true;
        }
        this.f23594d.postDelayed(new a(), (long) intValue);
        return true;
    }

    public void onAdClicked(Ad ad2) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad2.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad2.isAdInvalidated()));
        this.f23593c.c("clicked", hashMap);
    }

    public void onAdLoaded(Ad ad2) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad2.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad2.isAdInvalidated()));
        this.f23593c.c("loaded", hashMap);
    }

    public void onError(Ad ad2, AdError adError) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad2.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad2.isAdInvalidated()));
        hashMap.put("error_code", Integer.valueOf(adError.getErrorCode()));
        hashMap.put("error_message", adError.getErrorMessage());
        this.f23593c.c("error", hashMap);
    }

    public void onLoggingImpression(Ad ad2) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad2.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad2.isAdInvalidated()));
        this.f23593c.c("logging_impression", hashMap);
    }

    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.f36116a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1548893609:
                if (str.equals("loadRewardedAd")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1009162322:
                if (str.equals("showRewardedAd")) {
                    c10 = 1;
                    break;
                }
                break;
            case -15281045:
                if (str.equals("destroyRewardedAd")) {
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

    public void onRewardedVideoClosed() {
        this.f23593c.c("rewarded_closed", Boolean.TRUE);
    }

    public void onRewardedVideoCompleted() {
        this.f23593c.c("rewarded_complete", Boolean.TRUE);
    }
}
