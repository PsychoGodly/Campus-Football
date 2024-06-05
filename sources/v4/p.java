package v4;

import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import n4.a;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public interface p {
    void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter);

    @Deprecated
    void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i10);

    void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, a aVar);

    void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter);
}
