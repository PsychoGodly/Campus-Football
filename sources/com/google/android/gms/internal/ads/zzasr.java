package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzasr extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzasr zzb;
    private int zzd;
    private zzasu zze;
    private zzgpe zzf;
    private zzgpe zzg;

    static {
        zzasr zzasr = new zzasr();
        zzb = zzasr;
        zzgqm.zzaT(zzasr.class, zzasr);
    }

    private zzasr() {
        zzgpe zzgpe = zzgpe.zzb;
        this.zzf = zzgpe;
        this.zzg = zzgpe;
    }

    public static zzasr zzc(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzasr) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzasr();
        } else {
            if (i11 == 4) {
                return new zzasq((zzasp) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzasu zzd() {
        zzasu zzasu = this.zze;
        return zzasu == null ? zzasu.zzg() : zzasu;
    }

    public final zzgpe zze() {
        return this.zzg;
    }

    public final zzgpe zzf() {
        return this.zzf;
    }
}
