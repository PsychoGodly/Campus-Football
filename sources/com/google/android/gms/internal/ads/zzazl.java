package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzazl extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzazl zzb;
    private int zzd;
    private int zze;

    static {
        zzazl zzazl = new zzazl();
        zzb = zzazl;
        zzgqm.zzaT(zzazl.class, zzazl);
    }

    private zzazl() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzd", "zze", zzazk.zza});
        } else if (i11 == 3) {
            return new zzazl();
        } else {
            if (i11 == 4) {
                return new zzazj((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
