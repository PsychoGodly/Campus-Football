package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.p1;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdyn implements zzdbh {
    private boolean zza = false;
    private boolean zzb = false;
    private final String zzc;
    private final zzfdk zzd;
    private final p1 zze;

    public zzdyn(String str, zzfdk zzfdk) {
        this.zzc = str;
        this.zzd = zzfdk;
        this.zze = t.q().zzh();
    }

    private final zzfdj zzg(String str) {
        String str2;
        if (this.zze.zzP()) {
            str2 = MaxReward.DEFAULT_LABEL;
        } else {
            str2 = this.zzc;
        }
        zzfdj zzb2 = zzfdj.zzb(str);
        zzb2.zza("tms", Long.toString(t.b().b(), 10));
        zzb2.zza(ScarConstants.TOKEN_ID_KEY, str2);
        return zzb2;
    }

    public final void zza(String str) {
        zzfdk zzfdk = this.zzd;
        zzfdj zzg = zzg("aaia");
        zzg.zza("aair", "MalformedJson");
        zzfdk.zzb(zzg);
    }

    public final void zzb(String str, String str2) {
        zzfdk zzfdk = this.zzd;
        zzfdj zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        zzg.zza("rqe", str2);
        zzfdk.zzb(zzg);
    }

    public final void zzc(String str) {
        zzfdk zzfdk = this.zzd;
        zzfdj zzg = zzg("adapter_init_started");
        zzg.zza("ancn", str);
        zzfdk.zzb(zzg);
    }

    public final void zzd(String str) {
        zzfdk zzfdk = this.zzd;
        zzfdj zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        zzfdk.zzb(zzg);
    }

    public final synchronized void zze() {
        if (!this.zzb) {
            this.zzd.zzb(zzg("init_finished"));
            this.zzb = true;
        }
    }

    public final synchronized void zzf() {
        if (!this.zza) {
            this.zzd.zzb(zzg("init_started"));
            this.zza = true;
        }
    }
}
