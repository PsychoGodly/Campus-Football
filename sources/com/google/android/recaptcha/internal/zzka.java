package com.google.android.recaptcha.internal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzka {
    public static final zzjd zza;
    public static final zzjd zzb;
    public static final zzjd zzc;
    private static final ThreadLocal zzd = new zzjz();

    static {
        zzjc zzi = zzjd.zzi();
        zzi.zze(-62135596800L);
        zzi.zzd(0);
        zza = (zzjd) zzi.zzj();
        zzjc zzi2 = zzjd.zzi();
        zzi2.zze(253402300799L);
        zzi2.zzd(999999999);
        zzb = (zzjd) zzi2.zzj();
        zzjc zzi3 = zzjd.zzi();
        zzi3.zze(0);
        zzi3.zzd(0);
        zzc = (zzjd) zzi3.zzj();
    }

    public static zzjd zza(zzjd zzjd) {
        long zzg = zzjd.zzg();
        int i10 = (zzg > -62135596800L ? 1 : (zzg == -62135596800L ? 0 : -1));
        int zzf = zzjd.zzf();
        if (i10 >= 0 && zzg <= 253402300799L && zzf >= 0 && zzf < 1000000000) {
            return zzjd;
        }
        throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", new Object[]{Long.valueOf(zzg), Integer.valueOf(zzf)}));
    }

    public static zzjd zzb(long j10) {
        int i10 = (int) ((j10 % 1000) * 1000000);
        long j11 = j10 / 1000;
        if (i10 <= -1000000000 || i10 >= 1000000000) {
            j11 = zzee.zza(j11, (long) (i10 / 1000000000));
            i10 %= 1000000000;
        }
        if (i10 < 0) {
            i10 += 1000000000;
            j11 = zzee.zzb(j11, 1);
        }
        zzjc zzi = zzjd.zzi();
        zzi.zze(j11);
        zzi.zzd(i10);
        zzjd zzjd = (zzjd) zzi.zzj();
        zza(zzjd);
        return zzjd;
    }

    public static String zzc(zzjd zzjd) {
        String str;
        zza(zzjd);
        long zzg = zzjd.zzg();
        int zzf = zzjd.zzf();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((SimpleDateFormat) zzd.get()).format(new Date(zzg * 1000)));
        if (zzf != 0) {
            sb2.append(".");
            if (zzf % 1000000 == 0) {
                str = String.format(Locale.ENGLISH, "%1$03d", new Object[]{Integer.valueOf(zzf / 1000000)});
            } else if (zzf % 1000 == 0) {
                str = String.format(Locale.ENGLISH, "%1$06d", new Object[]{Integer.valueOf(zzf / 1000)});
            } else {
                str = String.format(Locale.ENGLISH, "%1$09d", new Object[]{Integer.valueOf(zzf)});
            }
            sb2.append(str);
        }
        sb2.append("Z");
        return sb2.toString();
    }
}
