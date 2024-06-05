package v4;

import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import n4.a;
import q4.f;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public interface r {
    void onAdClicked(MediationNativeAdapter mediationNativeAdapter);

    void onAdClosed(MediationNativeAdapter mediationNativeAdapter);

    void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, a aVar);

    void onAdImpression(MediationNativeAdapter mediationNativeAdapter);

    void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, x xVar);

    void onAdOpened(MediationNativeAdapter mediationNativeAdapter);

    void zzc(MediationNativeAdapter mediationNativeAdapter, f fVar);

    void zze(MediationNativeAdapter mediationNativeAdapter, f fVar, String str);
}
