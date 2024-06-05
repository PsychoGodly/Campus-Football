package v4;

import android.content.Context;
import com.google.android.gms.ads.MobileAds;
import java.util.List;
import n4.z;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class a {
    public abstract z getSDKVersionInfo();

    public abstract z getVersionInfo();

    public abstract void initialize(Context context, b bVar, List<l> list);

    public void loadAppOpenAd(h hVar, d<g, Object> dVar) {
        dVar.onFailure(new n4.a(7, getClass().getSimpleName().concat(" does not support app open ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadBannerAd(j jVar, d<i, Object> dVar) {
        dVar.onFailure(new n4.a(7, getClass().getSimpleName().concat(" does not support banner ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadInterscrollerAd(j jVar, d<m, Object> dVar) {
        dVar.onFailure(new n4.a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadInterstitialAd(o oVar, d<n, Object> dVar) {
        dVar.onFailure(new n4.a(7, getClass().getSimpleName().concat(" does not support interstitial ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadNativeAd(q qVar, d<x, Object> dVar) {
        dVar.onFailure(new n4.a(7, getClass().getSimpleName().concat(" does not support native ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadRewardedAd(t tVar, d<s, Object> dVar) {
        dVar.onFailure(new n4.a(7, getClass().getSimpleName().concat(" does not support rewarded ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadRewardedInterstitialAd(t tVar, d<s, Object> dVar) {
        dVar.onFailure(new n4.a(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), MobileAds.ERROR_DOMAIN));
    }
}
