package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzbn {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    protected zzbn(zzbn zzbn) {
        this.zza = zzbn.zza;
        this.zzb = zzbn.zzb;
        this.zzc = zzbn.zzc;
        this.zzd = zzbn.zzd;
        this.zze = zzbn.zze;
    }

    public zzbn(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    private zzbn(Object obj, int i10, int i11, long j10, int i12) {
        this.zza = obj;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10;
        this.zze = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbn)) {
            return false;
        }
        zzbn zzbn = (zzbn) obj;
        return this.zza.equals(zzbn.zza) && this.zzb == zzbn.zzb && this.zzc == zzbn.zzc && this.zzd == zzbn.zzd && this.zze == zzbn.zze;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzbn zza(Object obj) {
        if (this.zza.equals(obj)) {
            return this;
        }
        return new zzbn(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzbn(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public zzbn(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }
}
