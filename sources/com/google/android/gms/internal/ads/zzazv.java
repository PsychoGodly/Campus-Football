package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzazv extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzazv zzb;
    private int zzd;
    private int zze = 1000;
    private zzazl zzf;
    private zzazc zzg;

    static {
        zzazv zzazv = new zzazv();
        zzb = zzazv;
        zzgqm.zzaT(zzazv.class, zzazv);
    }

    private zzazv() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzaxr.zza, "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzazv();
        } else {
            if (i11 == 4) {
                return new zzazu((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
