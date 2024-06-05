package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgjp extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgjp zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgjj zze;
    /* access modifiers changed from: private */
    public zzgpe zzf;
    /* access modifiers changed from: private */
    public zzgpe zzg;

    static {
        zzgjp zzgjp = new zzgjp();
        zzb = zzgjp;
        zzgqm.zzaT(zzgjp.class, zzgjp);
    }

    private zzgjp() {
        zzgpe zzgpe = zzgpe.zzb;
        this.zzf = zzgpe;
        this.zzg = zzgpe;
    }

    public static zzgjo zzd() {
        return (zzgjo) zzb.zzaA();
    }

    public static zzgjp zzf() {
        return zzb;
    }

    public static zzgjp zzg(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzgjp) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    static /* synthetic */ void zzk(zzgjp zzgjp, zzgjj zzgjj) {
        zzgjj.getClass();
        zzgjp.zze = zzgjj;
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
            return zzgqm.zzaQ(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzgjp();
        } else {
            if (i11 == 4) {
                return new zzgjo((zzgjn) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgjj zzc() {
        zzgjj zzgjj = this.zze;
        return zzgjj == null ? zzgjj.zze() : zzgjj;
    }

    public final zzgpe zzh() {
        return this.zzf;
    }

    public final zzgpe zzi() {
        return this.zzg;
    }
}
