package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.p1;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzekw implements zzepn {
    private static final Object zza = new Object();
    private final String zzb;
    private final String zzc;
    private final zzcsd zzd;
    private final zzfad zze;
    private final zzeyx zzf;
    private final p1 zzg = t.q().zzh();
    private final zzdpd zzh;

    public zzekw(String str, String str2, zzcsd zzcsd, zzfad zzfad, zzeyx zzeyx, zzdpd zzdpd) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzcsd;
        this.zze = zzfad;
        this.zzf = zzeyx;
        this.zzh = zzdpd;
    }

    public final int zza() {
        return 12;
    }

    public final zzfut zzb() {
        Bundle bundle = new Bundle();
        if (((Boolean) a0.c().zzb(zzbar.zzha)).booleanValue()) {
            this.zzh.zza().put("seq_num", this.zzb);
        }
        if (((Boolean) a0.c().zzb(zzbar.zzff)).booleanValue()) {
            this.zzd.zzg(this.zzf.zzd);
            bundle.putAll(this.zze.zzb());
        }
        return zzfuj.zzh(new zzekv(this, bundle));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Bundle bundle, Bundle bundle2) {
        if (((Boolean) a0.c().zzb(zzbar.zzff)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) a0.c().zzb(zzbar.zzfe)).booleanValue()) {
                synchronized (zza) {
                    this.zzd.zzg(this.zzf.zzd);
                    bundle2.putBundle("quality_signals", this.zze.zzb());
                }
            } else {
                this.zzd.zzg(this.zzf.zzd);
                bundle2.putBundle("quality_signals", this.zze.zzb());
            }
        }
        bundle2.putString("seq_num", this.zzb);
        if (!this.zzg.zzP()) {
            bundle2.putString("session_id", this.zzc);
        }
    }
}
