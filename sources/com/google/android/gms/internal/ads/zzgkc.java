package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgkc extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgkc zzb;
    private zzgkf zzd;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        zzgkc zzgkc = new zzgkc();
        zzb = zzgkc;
        zzgqm.zzaT(zzgkc.class, zzgkc);
    }

    private zzgkc() {
    }

    public static zzgkb zzc() {
        return (zzgkb) zzb.zzaA();
    }

    public static zzgkc zze() {
        return zzb;
    }

    public static zzgkc zzf(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzgkc) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    static /* synthetic */ void zzh(zzgkc zzgkc, zzgkf zzgkf) {
        zzgkf.getClass();
        zzgkc.zzd = zzgkf;
    }

    public final int zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzgkc();
        } else {
            if (i11 == 4) {
                return new zzgkb((zzgka) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgkf zzg() {
        zzgkf zzgkf = this.zzd;
        return zzgkf == null ? zzgkf.zze() : zzgkf;
    }
}
