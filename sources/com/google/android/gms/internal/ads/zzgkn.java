package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgkn extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgkn zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzgkn zzgkn = new zzgkn();
        zzb = zzgkn;
        zzgqm.zzaT(zzgkn.class, zzgkn);
    }

    private zzgkn() {
    }

    public static zzgkm zza() {
        return (zzgkm) zzb.zzaA();
    }

    public static zzgkn zzd() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzgkn();
        } else {
            if (i11 == 4) {
                return new zzgkm((zzgkl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int zze() {
        int i10 = this.zzf;
        int i11 = 3;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 != 1) {
            i11 = i10 != 2 ? i10 != 3 ? 0 : 5 : 4;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int zzf() {
        int i10 = this.zze;
        int i11 = 3;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 != 1) {
            i11 = i10 != 2 ? i10 != 3 ? 0 : 5 : 4;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int zzg() {
        int i10 = this.zzd;
        int i11 = 4;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 == 1) {
            i11 = 3;
        } else if (i10 != 2) {
            i11 = i10 != 3 ? i10 != 4 ? 0 : 6 : 5;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
