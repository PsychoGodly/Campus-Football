package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgjm extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgjm zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgjp zze;
    /* access modifiers changed from: private */
    public zzgpe zzf = zzgpe.zzb;

    static {
        zzgjm zzgjm = new zzgjm();
        zzb = zzgjm;
        zzgqm.zzaT(zzgjm.class, zzgjm);
    }

    private zzgjm() {
    }

    public static zzgjl zzc() {
        return (zzgjl) zzb.zzaA();
    }

    public static zzgjm zze(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzgjm) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    static /* synthetic */ void zzi(zzgjm zzgjm, zzgjp zzgjp) {
        zzgjp.getClass();
        zzgjm.zze = zzgjp;
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
            return new zzgjm();
        } else {
            if (i11 == 4) {
                return new zzgjl((zzgjk) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgjp zzf() {
        zzgjp zzgjp = this.zze;
        return zzgjp == null ? zzgjp.zzf() : zzgjp;
    }

    public final zzgpe zzg() {
        return this.zzf;
    }
}
