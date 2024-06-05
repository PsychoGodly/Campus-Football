package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import t4.c0;
import t4.e0;
import t4.i;
import v4.e;
import v4.p;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbpu implements MediationInterstitialAdapter {
    /* access modifiers changed from: private */
    public Activity zza;
    /* access modifiers changed from: private */
    public p zzb;
    private Uri zzc;

    public final void onDestroy() {
        zzbza.zze("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        zzbza.zze("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        zzbza.zze("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public final void requestInterstitialAd(Context context, p pVar, Bundle bundle, e eVar, Bundle bundle2) {
        this.zzb = pVar;
        if (pVar == null) {
            zzbza.zzj("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            zzbza.zzj("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.zzb.onAdFailedToLoad((MediationInterstitialAdapter) this, 0);
        } else if (!zzbbs.zzg(context)) {
            zzbza.zzj("Default browser does not support custom tabs. Bailing out.");
            this.zzb.onAdFailedToLoad((MediationInterstitialAdapter) this, 0);
        } else {
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                zzbza.zzj("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.zzb.onAdFailedToLoad((MediationInterstitialAdapter) this, 0);
                return;
            }
            this.zza = (Activity) context;
            this.zzc = Uri.parse(string);
            this.zzb.onAdLoaded(this);
        }
    }

    public final void showInterstitial() {
        d b10 = new d.b().b();
        b10.f1921a.setData(this.zzc);
        b2.f14773i.post(new zzbpt(this, new AdOverlayInfoParcel(new i(b10.f1921a, (c0) null), (a) null, new zzbps(this), (e0) null, new zzbzg(0, 0, false, false, false), (zzcei) null, (zzdcc) null)));
        t.q().zzp();
    }
}
