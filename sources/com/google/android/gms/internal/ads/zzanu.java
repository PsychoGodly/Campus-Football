package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzanu extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzanu zzb;
    private int zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzgqr zzh = zzgqm.zzaJ();
    private long zzi;

    static {
        zzanu zzanu = new zzanu();
        zzb = zzanu;
        zzgqm.zzaT(zzanu.class, zzanu);
    }

    private zzanu() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new zzanu();
        } else {
            if (i11 == 4) {
                return new zzant((zzamu) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
