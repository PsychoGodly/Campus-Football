package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.dynamic.a;
import t4.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdef implements zzcwc, t, zzcvi {
    a zza;
    private final Context zzb;
    private final zzcei zzc;
    private final zzeyc zzd;
    private final zzbzg zze;
    private final zzawo zzf;

    public zzdef(Context context, zzcei zzcei, zzeyc zzeyc, zzbzg zzbzg, zzawo zzawo) {
        this.zzb = context;
        this.zzc = zzcei;
        this.zzd = zzeyc;
        this.zze = zzbzg;
        this.zzf = zzawo;
    }

    public final void zzb() {
        if (this.zza != null && this.zzc != null) {
            if (!((Boolean) a0.c().zzb(zzbar.zzeH)).booleanValue()) {
                this.zzc.zzd("onSdkImpression", new androidx.collection.a());
            }
        }
    }

    public final void zzbF() {
    }

    public final void zzbo() {
    }

    public final void zzby() {
    }

    public final void zze() {
    }

    public final void zzf(int i10) {
        this.zza = null;
    }

    public final void zzl() {
        if (this.zza != null && this.zzc != null) {
            if (((Boolean) a0.c().zzb(zzbar.zzeH)).booleanValue()) {
                this.zzc.zzd("onSdkImpression", new androidx.collection.a());
            }
        }
    }

    public final void zzn() {
        zzear zzear;
        zzeas zzeas;
        zzeas zzeas2;
        zzawo zzawo = this.zzf;
        if ((zzawo == zzawo.REWARD_BASED_VIDEO_AD || zzawo == zzawo.INTERSTITIAL || zzawo == zzawo.APP_OPEN) && this.zzd.zzU && this.zzc != null && com.google.android.gms.ads.internal.t.a().zze(this.zzb)) {
            zzbzg zzbzg = this.zze;
            String str = zzbzg.zzb + "." + zzbzg.zzc;
            String zza2 = this.zzd.zzW.zza();
            if (this.zzd.zzW.zzb() == 1) {
                zzear = zzear.VIDEO;
                zzeas = zzeas.DEFINED_BY_JAVASCRIPT;
            } else {
                if (this.zzd.zzZ == 2) {
                    zzeas2 = zzeas.UNSPECIFIED;
                } else {
                    zzeas2 = zzeas.BEGIN_TO_RENDER;
                }
                zzeas = zzeas2;
                zzear = zzear.HTML_DISPLAY;
            }
            a zza3 = com.google.android.gms.ads.internal.t.a().zza(str, this.zzc.zzG(), MaxReward.DEFAULT_LABEL, "javascript", zza2, zzeas, zzear, this.zzd.zzam);
            this.zza = zza3;
            if (zza3 != null) {
                com.google.android.gms.ads.internal.t.a().zzc(this.zza, (View) this.zzc);
                this.zzc.zzap(this.zza);
                com.google.android.gms.ads.internal.t.a().zzd(this.zza);
                this.zzc.zzd("onSdkLoaded", new androidx.collection.a());
            }
        }
    }
}
