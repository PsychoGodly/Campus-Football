package v4;

import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import n4.a;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public interface k {
    void onAdClicked(MediationBannerAdapter mediationBannerAdapter);

    void onAdClosed(MediationBannerAdapter mediationBannerAdapter);

    void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, a aVar);

    void onAdLoaded(MediationBannerAdapter mediationBannerAdapter);

    void onAdOpened(MediationBannerAdapter mediationBannerAdapter);

    void zzd(MediationBannerAdapter mediationBannerAdapter, String str, String str2);
}
