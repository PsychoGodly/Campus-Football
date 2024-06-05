package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzggw extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzggw zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public zzgpe zze = zzgpe.zzb;
    private zzghc zzf;

    static {
        zzggw zzggw = new zzggw();
        zzb = zzggw;
        zzgqm.zzaT(zzggw.class, zzggw);
    }

    private zzggw() {
    }

    public static zzggv zzc() {
        return (zzggv) zzb.zzaA();
    }

    public static zzggw zze(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzggw) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    static /* synthetic */ void zzj(zzggw zzggw, zzghc zzghc) {
        zzghc.getClass();
        zzggw.zzf = zzghc;
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
            return zzgqm.zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzggw();
        } else {
            if (i11 == 4) {
                return new zzggv((zzggu) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzghc zzf() {
        zzghc zzghc = this.zzf;
        return zzghc == null ? zzghc.zze() : zzghc;
    }

    public final zzgpe zzg() {
        return this.zze;
    }
}
