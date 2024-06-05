package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgjz extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgjz zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgkf zze;
    /* access modifiers changed from: private */
    public zzgpe zzf = zzgpe.zzb;

    static {
        zzgjz zzgjz = new zzgjz();
        zzb = zzgjz;
        zzgqm.zzaT(zzgjz.class, zzgjz);
    }

    private zzgjz() {
    }

    public static zzgjy zzc() {
        return (zzgjy) zzb.zzaA();
    }

    public static zzgjz zze() {
        return zzb;
    }

    public static zzgjz zzf(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzgjz) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    static /* synthetic */ void zzj(zzgjz zzgjz, zzgkf zzgkf) {
        zzgkf.getClass();
        zzgjz.zze = zzgkf;
    }

    public final int zza() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzgjz();
        } else {
            if (i11 == 4) {
                return new zzgjy((zzgjx) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgkf zzg() {
        zzgkf zzgkf = this.zze;
        return zzgkf == null ? zzgkf.zze() : zzgkf;
    }

    public final zzgpe zzh() {
        return this.zzf;
    }
}
