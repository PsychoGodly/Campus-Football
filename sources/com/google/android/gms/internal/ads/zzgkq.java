package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgkq extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgkq zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgkt zze;
    /* access modifiers changed from: private */
    public zzgpe zzf = zzgpe.zzb;

    static {
        zzgkq zzgkq = new zzgkq();
        zzb = zzgkq;
        zzgqm.zzaT(zzgkq.class, zzgkq);
    }

    private zzgkq() {
    }

    public static zzgkp zzc() {
        return (zzgkp) zzb.zzaA();
    }

    public static zzgkq zze(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzgkq) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    static /* synthetic */ void zzi(zzgkq zzgkq, zzgkt zzgkt) {
        zzgkt.getClass();
        zzgkq.zze = zzgkt;
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
            return new zzgkq();
        } else {
            if (i11 == 4) {
                return new zzgkp((zzgko) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgkt zzf() {
        zzgkt zzgkt = this.zze;
        return zzgkt == null ? zzgkt.zzf() : zzgkt;
    }

    public final zzgpe zzg() {
        return this.zzf;
    }

    public final boolean zzk() {
        return this.zze != null;
    }
}
