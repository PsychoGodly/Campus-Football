package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzamy extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzamy zzb;
    private int zzd;
    private int zze;

    static {
        zzamy zzamy = new zzamy();
        zzb = zzamy;
        zzgqm.zzaT(zzamy.class, zzamy);
    }

    private zzamy() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzd", "zze", zzanc.zza});
        } else if (i11 == 3) {
            return new zzamy();
        } else {
            if (i11 == 4) {
                return new zzamx((zzamu) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
