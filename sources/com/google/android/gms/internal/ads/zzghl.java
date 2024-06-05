package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzghl extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzghl zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzghr zze;
    /* access modifiers changed from: private */
    public zzgpe zzf = zzgpe.zzb;

    static {
        zzghl zzghl = new zzghl();
        zzb = zzghl;
        zzgqm.zzaT(zzghl.class, zzghl);
    }

    private zzghl() {
    }

    public static zzghk zzc() {
        return (zzghk) zzb.zzaA();
    }

    public static zzghl zze() {
        return zzb;
    }

    public static zzghl zzf(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzghl) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    static /* synthetic */ void zzj(zzghl zzghl, zzghr zzghr) {
        zzghr.getClass();
        zzghl.zze = zzghr;
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
            return new zzghl();
        } else {
            if (i11 == 4) {
                return new zzghk((zzghj) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzghr zzg() {
        zzghr zzghr = this.zze;
        return zzghr == null ? zzghr.zze() : zzghr;
    }

    public final zzgpe zzh() {
        return this.zzf;
    }
}
