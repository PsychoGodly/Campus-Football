package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdlu extends zzcqm {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdee zze;
    private final zzdbk zzf;
    private final zzcvb zzg;
    private final zzcwi zzh;
    private final zzcrg zzi;
    private final zzbut zzj;
    private final zzfia zzk;
    private final zzeyq zzl;
    private boolean zzm = false;

    zzdlu(zzcql zzcql, Context context, zzcei zzcei, zzdee zzdee, zzdbk zzdbk, zzcvb zzcvb, zzcwi zzcwi, zzcrg zzcrg, zzeyc zzeyc, zzfia zzfia, zzeyq zzeyq) {
        super(zzcql);
        this.zzc = context;
        this.zze = zzdee;
        this.zzd = new WeakReference(zzcei);
        this.zzf = zzdbk;
        this.zzg = zzcvb;
        this.zzh = zzcwi;
        this.zzi = zzcrg;
        this.zzk = zzfia;
        zzbup zzbup = zzeyc.zzm;
        this.zzj = new zzbvn(zzbup != null ? zzbup.zza : MaxReward.DEFAULT_LABEL, zzbup != null ? zzbup.zzb : 1);
        this.zzl = zzeyq;
    }

    public final void finalize() throws Throwable {
        try {
            zzcei zzcei = (zzcei) this.zzd.get();
            if (((Boolean) a0.c().zzb(zzbar.zzgn)).booleanValue()) {
                if (!this.zzm && zzcei != null) {
                    zzbzn.zze.execute(new zzdlt(zzcei));
                }
            } else if (zzcei != null) {
                zzcei.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbut zzc() {
        return this.zzj;
    }

    public final zzeyq zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzcei zzcei = (zzcei) this.zzd.get();
        return zzcei != null && !zzcei.zzaB();
    }

    public final boolean zzh(boolean z10, Activity activity) {
        if (((Boolean) a0.c().zzb(zzbar.zzay)).booleanValue()) {
            t.r();
            if (b2.c(this.zzc)) {
                zzbza.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) a0.c().zzb(zzbar.zzaz)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzm) {
            zzbza.zzj("The rewarded ad have been showed.");
            this.zzg.zza(zzezx.zzd(10, (String) null, (c3) null));
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        Context context = activity;
        if (activity == null) {
            context = this.zzc;
        }
        try {
            this.zze.zza(z10, context, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzded e10) {
            this.zzg.zzc(e10);
            return false;
        }
    }
}
