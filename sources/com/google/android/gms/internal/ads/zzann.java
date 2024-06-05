package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzann extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzann zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;

    static {
        zzann zzann = new zzann();
        zzb = zzann;
        zzgqm.zzaT(zzann.class, zzann);
    }

    private zzann() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", "zzf", zzany.zza});
        } else if (i11 == 3) {
            return new zzann();
        } else {
            if (i11 == 4) {
                return new zzanm((zzamu) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
