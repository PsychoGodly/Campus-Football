package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgve extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgve zzb;
    private int zzd;
    private int zze;
    private zzgpe zzf;
    private zzgpe zzg;

    static {
        zzgve zzgve = new zzgve();
        zzb = zzgve;
        zzgqm.zzaT(zzgve.class, zzgve);
    }

    private zzgve() {
        zzgpe zzgpe = zzgpe.zzb;
        this.zzf = zzgpe;
        this.zzg = zzgpe;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzgve();
        } else {
            if (i11 == 4) {
                return new zzgvd((zzgub) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
