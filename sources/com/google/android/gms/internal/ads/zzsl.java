package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzsl extends zzsg {
    public static final Object zzd = new Object();
    private final Object zze;
    /* access modifiers changed from: private */
    public final Object zzf;

    private zzsl(zzcn zzcn, Object obj, Object obj2) {
        super(zzcn);
        this.zze = obj;
        this.zzf = obj2;
    }

    public static zzsl zzq(zzbg zzbg) {
        return new zzsl(new zzsm(zzbg), zzcm.zza, zzd);
    }

    public static zzsl zzr(zzcn zzcn, Object obj, Object obj2) {
        return new zzsl(zzcn, obj, obj2);
    }

    public final int zza(Object obj) {
        Object obj2;
        zzcn zzcn = this.zzc;
        if (zzd.equals(obj) && (obj2 = this.zzf) != null) {
            obj = obj2;
        }
        return zzcn.zza(obj);
    }

    public final zzck zzd(int i10, zzck zzck, boolean z10) {
        this.zzc.zzd(i10, zzck, z10);
        if (zzew.zzU(zzck.zzc, this.zzf) && z10) {
            zzck.zzc = zzd;
        }
        return zzck;
    }

    public final zzcm zze(int i10, zzcm zzcm, long j10) {
        this.zzc.zze(i10, zzcm, j10);
        if (zzew.zzU(zzcm.zzc, this.zze)) {
            zzcm.zzc = zzcm.zza;
        }
        return zzcm;
    }

    public final Object zzf(int i10) {
        Object zzf2 = this.zzc.zzf(i10);
        return zzew.zzU(zzf2, this.zzf) ? zzd : zzf2;
    }

    public final zzsl zzp(zzcn zzcn) {
        return new zzsl(zzcn, this.zze, this.zzf);
    }
}
