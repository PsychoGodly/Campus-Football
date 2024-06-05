package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgkf extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgkf zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzgkf zzgkf = new zzgkf();
        zzb = zzgkf;
        zzgqm.zzaT(zzgkf.class, zzgkf);
    }

    private zzgkf() {
    }

    public static zzgke zzc() {
        return (zzgke) zzb.zzaA();
    }

    public static zzgkf zze() {
        return zzb;
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
            return zzgqm.zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzgkf();
        } else {
            if (i11 == 4) {
                return new zzgke((zzgkd) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int zzg() {
        int zzb2 = zzgjw.zzb(this.zzd);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
