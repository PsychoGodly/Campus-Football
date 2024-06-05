package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzjy {
    public static final zzfw zza;
    public static final zzfw zzb;
    public static final zzfw zzc;

    static {
        zzfv zzi = zzfw.zzi();
        zzi.zze(-315576000000L);
        zzi.zzd(-999999999);
        zza = (zzfw) zzi.zzj();
        zzfv zzi2 = zzfw.zzi();
        zzi2.zze(315576000000L);
        zzi2.zzd(999999999);
        zzb = (zzfw) zzi2.zzj();
        zzfv zzi3 = zzfw.zzi();
        zzi3.zze(0);
        zzi3.zzd(0);
        zzc = (zzfw) zzi3.zzj();
    }

    public static zzfw zza(long j10) {
        return zzc(j10 / 1000, (int) ((j10 % 1000) * 1000000));
    }

    public static zzfw zzb(long j10) {
        return zzc(j10 / 1000000000, (int) (j10 % 1000000000));
    }

    static zzfw zzc(long j10, int i10) {
        int i11;
        if (i10 <= -1000000000 || i10 >= 1000000000) {
            j10 = zzee.zza(j10, (long) (i10 / 1000000000));
            i10 %= 1000000000;
        }
        if (j10 > 0 && i10 < 0) {
            i10 += 1000000000;
            j10--;
        }
        if (j10 < 0 && i10 > 0) {
            i10 -= 1000000000;
            j10++;
        }
        zzfv zzi = zzfw.zzi();
        zzi.zze(j10);
        zzi.zzd(i10);
        zzfw zzfw = (zzfw) zzi.zzj();
        long zzg = zzfw.zzg();
        int zzf = zzfw.zzf();
        if (zzg >= -315576000000L && zzg <= 315576000000L && ((long) zzf) >= -999999999 && zzf < 1000000000 && ((zzg >= 0 && zzf >= 0) || (i11 <= 0 && zzf <= 0))) {
            return zzfw;
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", new Object[]{Long.valueOf(zzg), Integer.valueOf(zzf)}));
    }
}
