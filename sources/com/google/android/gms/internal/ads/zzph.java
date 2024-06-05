package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzph implements zzos {
    protected zzph(zzpg zzpg) {
    }

    protected static int zza(int i10, int i11, int i12) {
        return zzfsr.zza(((((long) i10) * ((long) i11)) * ((long) i12)) / 1000000);
    }

    protected static int zzb(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
            default:
                throw new IllegalArgumentException();
        }
    }
}
