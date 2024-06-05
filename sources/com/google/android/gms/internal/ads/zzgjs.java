package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgjs extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgjs zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzgpe zzf = zzgpe.zzb;

    static {
        zzgjs zzgjs = new zzgjs();
        zzb = zzgjs;
        zzgqm.zzaT(zzgjs.class, zzgjs);
    }

    private zzgjs() {
    }

    public static zzgjr zza() {
        return (zzgjr) zzb.zzaA();
    }

    public static zzgjs zzd() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzgjs();
        } else {
            if (i11 == 4) {
                return new zzgjr((zzgjq) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgpe zze() {
        return this.zzf;
    }

    public final int zzg() {
        int i10 = this.zzd;
        int i11 = 5;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 == 2) {
            i11 = 4;
        } else if (i10 != 3) {
            i11 = i10 != 4 ? i10 != 5 ? 0 : 7 : 6;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int zzh() {
        int zzb2 = zzgjw.zzb(this.zze);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
