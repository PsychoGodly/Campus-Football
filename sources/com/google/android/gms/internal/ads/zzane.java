package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzane extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzane zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;
    private int zzg = 1000;

    static {
        zzane zzane = new zzane();
        zzb = zzane;
        zzgqm.zzaT(zzane.class, zzane);
    }

    private zzane() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgqq zzgqq = zzany.zza;
            return zzgqm.zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"zzd", "zze", "zzf", zzgqq, "zzg", zzgqq});
        } else if (i11 == 3) {
            return new zzane();
        } else {
            if (i11 == 4) {
                return new zzand((zzamu) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
