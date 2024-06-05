package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzlc {
    public final long zza;
    public final zzcn zzb;
    public final int zzc;
    public final zzss zzd;
    public final long zze;
    public final zzcn zzf;
    public final int zzg;
    public final zzss zzh;
    public final long zzi;
    public final long zzj;

    public zzlc(long j10, zzcn zzcn, int i10, zzss zzss, long j11, zzcn zzcn2, int i11, zzss zzss2, long j12, long j13) {
        this.zza = j10;
        this.zzb = zzcn;
        this.zzc = i10;
        this.zzd = zzss;
        this.zze = j11;
        this.zzf = zzcn2;
        this.zzg = i11;
        this.zzh = zzss2;
        this.zzi = j12;
        this.zzj = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlc.class == obj.getClass()) {
            zzlc zzlc = (zzlc) obj;
            return this.zza == zzlc.zza && this.zzc == zzlc.zzc && this.zze == zzlc.zze && this.zzg == zzlc.zzg && this.zzi == zzlc.zzi && this.zzj == zzlc.zzj && zzfnp.zza(this.zzb, zzlc.zzb) && zzfnp.zza(this.zzd, zzlc.zzd) && zzfnp.zza(this.zzf, zzlc.zzf) && zzfnp.zza(this.zzh, zzlc.zzh);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}
