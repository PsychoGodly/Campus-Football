package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgmn extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgmn zzb;
    private int zzd;

    static {
        zzgmn zzgmn = new zzgmn();
        zzb = zzgmn;
        zzgqm.zzaT(zzgmn.class, zzgmn);
    }

    private zzgmn() {
    }

    public static zzgmn zzc() {
        return zzb;
    }

    public static zzgmn zzd(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzgmn) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new zzgmn();
        } else {
            if (i11 == 4) {
                return new zzgmm((zzgml) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
