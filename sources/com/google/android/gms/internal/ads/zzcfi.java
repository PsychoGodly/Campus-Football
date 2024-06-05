package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.ads.internal.util.n1;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcfi {
    private final zzcfj zza;
    private final zzcfh zzb;

    public zzcfi(zzcfj zzcfj, zzcfh zzcfh, byte[] bArr) {
        this.zzb = zzcfh;
        this.zza = zzcfj;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzcfj, com.google.android.gms.internal.ads.zzcfq] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            n1.a("Click string is empty, not proceeding.");
            return MaxReward.DEFAULT_LABEL;
        }
        ? r02 = this.zza;
        zzapw zzI = r02.zzI();
        if (zzI == null) {
            n1.a("Signal utils is empty, ignoring.");
            return MaxReward.DEFAULT_LABEL;
        }
        zzaps zzc = zzI.zzc();
        if (zzc == null) {
            n1.a("Signals object is empty, ignoring.");
            return MaxReward.DEFAULT_LABEL;
        } else if (r02.getContext() == null) {
            n1.a("Context is null, ignoring.");
            return MaxReward.DEFAULT_LABEL;
        } else {
            Context context = this.zza.getContext();
            zzcfj zzcfj = this.zza;
            return zzc.zzf(context, str, (View) zzcfj, zzcfj.zzi());
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzcfj, com.google.android.gms.internal.ads.zzcfq] */
    @JavascriptInterface
    public String getViewSignals() {
        ? r02 = this.zza;
        zzapw zzI = r02.zzI();
        if (zzI == null) {
            n1.a("Signal utils is empty, ignoring.");
            return MaxReward.DEFAULT_LABEL;
        }
        zzaps zzc = zzI.zzc();
        if (zzc == null) {
            n1.a("Signals object is empty, ignoring.");
            return MaxReward.DEFAULT_LABEL;
        } else if (r02.getContext() == null) {
            n1.a("Context is null, ignoring.");
            return MaxReward.DEFAULT_LABEL;
        } else {
            Context context = this.zza.getContext();
            zzcfj zzcfj = this.zza;
            return zzc.zzh(context, (View) zzcfj, zzcfj.zzi());
        }
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            zzbza.zzj("URL is empty, ignoring message");
        } else {
            b2.f14773i.post(new zzcfg(this, str));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str) {
        zzcfh zzcfh = this.zzb;
        Uri parse = Uri.parse(str);
        zzcep zzaJ = ((zzcfb) zzcfh.zza).zzaJ();
        if (zzaJ == null) {
            zzbza.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzaJ.zzj(parse);
        }
    }
}
