package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgkk extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgkk zzb;
    private zzgkn zzd;

    static {
        zzgkk zzgkk = new zzgkk();
        zzb = zzgkk;
        zzgqm.zzaT(zzgkk.class, zzgkk);
    }

    private zzgkk() {
    }

    public static zzgkj zza() {
        return (zzgkj) zzb.zzaA();
    }

    public static zzgkk zzd(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzgkk) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    static /* synthetic */ void zzf(zzgkk zzgkk, zzgkn zzgkn) {
        zzgkn.getClass();
        zzgkk.zzd = zzgkn;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new zzgkk();
        } else {
            if (i11 == 4) {
                return new zzgkj((zzgki) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgkn zze() {
        zzgkn zzgkn = this.zzd;
        return zzgkn == null ? zzgkn.zzd() : zzgkn;
    }
}
