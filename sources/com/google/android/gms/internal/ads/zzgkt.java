package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgkt extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgkt zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgkn zze;
    /* access modifiers changed from: private */
    public zzgpe zzf = zzgpe.zzb;

    static {
        zzgkt zzgkt = new zzgkt();
        zzb = zzgkt;
        zzgqm.zzaT(zzgkt.class, zzgkt);
    }

    private zzgkt() {
    }

    public static zzgks zzd() {
        return (zzgks) zzb.zzaA();
    }

    public static zzgkt zzf() {
        return zzb;
    }

    public static zzgkt zzg(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzgkt) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    static /* synthetic */ void zzj(zzgkt zzgkt, zzgkn zzgkn) {
        zzgkn.getClass();
        zzgkt.zze = zzgkn;
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
            return new zzgkt();
        } else {
            if (i11 == 4) {
                return new zzgks((zzgkr) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgkn zzc() {
        zzgkn zzgkn = this.zze;
        return zzgkn == null ? zzgkn.zzd() : zzgkn;
    }

    public final zzgpe zzh() {
        return this.zzf;
    }

    public final boolean zzl() {
        return this.zze != null;
    }
}
