package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzglz extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzglz zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgmc zze;

    static {
        zzglz zzglz = new zzglz();
        zzb = zzglz;
        zzgqm.zzaT(zzglz.class, zzglz);
    }

    private zzglz() {
    }

    public static zzgly zzc() {
        return (zzgly) zzb.zzaA();
    }

    public static zzglz zze(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzglz) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    static /* synthetic */ void zzh(zzglz zzglz, zzgmc zzgmc) {
        zzgmc.getClass();
        zzglz.zze = zzgmc;
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
            return zzgqm.zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzglz();
        } else {
            if (i11 == 4) {
                return new zzgly((zzglx) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgmc zzf() {
        zzgmc zzgmc = this.zze;
        return zzgmc == null ? zzgmc.zzd() : zzgmc;
    }
}
