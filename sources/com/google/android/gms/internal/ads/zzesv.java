package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzesv implements zzepn {
    private final zzbyj zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzfuu zze;
    private final String zzf;
    private final zzbxy zzg;

    zzesv(zzbyj zzbyj, boolean z10, boolean z11, zzbxy zzbxy, zzfuu zzfuu, String str, ScheduledExecutorService scheduledExecutorService, byte[] bArr) {
        this.zza = zzbyj;
        this.zzb = z10;
        this.zzc = z11;
        this.zzg = zzbxy;
        this.zze = zzfuu;
        this.zzf = str;
        this.zzd = scheduledExecutorService;
    }

    public final int zza() {
        return 50;
    }

    public final zzfut zzb() {
        if (((Boolean) a0.c().zzb(zzbar.zzgK)).booleanValue() && this.zzc) {
            return zzfuj.zzh((Object) null);
        }
        if (!this.zzb) {
            return zzfuj.zzh((Object) null);
        }
        return zzfuj.zze(zzfuj.zzn(zzfuj.zzl(zzfuj.zzh((Object) null), zzest.zza, this.zze), ((Long) zzbcy.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd), Exception.class, new zzesu(this), this.zze);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzesw zzc(Exception exc) {
        this.zza.zzu(exc, "TrustlessTokenSignal");
        return null;
    }
}
