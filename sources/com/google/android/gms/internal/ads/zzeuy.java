package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.f5;
import com.google.android.gms.ads.internal.client.u4;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzeuy implements zzfbe {
    public final zzevs zza;
    public final zzevu zzb;
    public final u4 zzc;
    public final String zzd;
    public final Executor zze;
    public final f5 zzf;
    public final zzfat zzg;

    public zzeuy(zzevs zzevs, zzevu zzevu, u4 u4Var, String str, Executor executor, f5 f5Var, zzfat zzfat) {
        this.zza = zzevs;
        this.zzb = zzevu;
        this.zzc = u4Var;
        this.zzd = str;
        this.zze = executor;
        this.zzf = f5Var;
        this.zzg = zzfat;
    }

    public final zzfat zza() {
        return this.zzg;
    }

    public final Executor zzb() {
        return this.zze;
    }
}
