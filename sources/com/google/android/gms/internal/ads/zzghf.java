package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzghf extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzghf zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzghl zze;
    private zzgjz zzf;

    static {
        zzghf zzghf = new zzghf();
        zzb = zzghf;
        zzgqm.zzaT(zzghf.class, zzghf);
    }

    private zzghf() {
    }

    public static zzghe zzc() {
        return (zzghe) zzb.zzaA();
    }

    public static zzghf zze(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzghf) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    static /* synthetic */ void zzi(zzghf zzghf, zzghl zzghl) {
        zzghl.getClass();
        zzghf.zze = zzghl;
    }

    static /* synthetic */ void zzj(zzghf zzghf, zzgjz zzgjz) {
        zzgjz.getClass();
        zzghf.zzf = zzgjz;
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
            return zzgqm.zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzghf();
        } else {
            if (i11 == 4) {
                return new zzghe((zzghd) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzghl zzf() {
        zzghl zzghl = this.zze;
        return zzghl == null ? zzghl.zze() : zzghl;
    }

    public final zzgjz zzg() {
        zzgjz zzgjz = this.zzf;
        return zzgjz == null ? zzgjz.zze() : zzgjz;
    }
}
