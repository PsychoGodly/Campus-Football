package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfem {
    public static void zza(zzfut zzfut, zzfen zzfen, zzfec zzfec) {
        zzg(zzfut, zzfen, zzfec, false);
    }

    public static void zzb(zzfut zzfut, zzfen zzfen, zzfec zzfec) {
        zzg(zzfut, zzfen, zzfec, true);
    }

    public static void zzc(zzfut zzfut, zzfen zzfen, zzfec zzfec) {
        if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
            zzfuj.zzq(zzfua.zzv(zzfut), new zzfel(zzfen, zzfec), zzbzn.zzf);
        }
    }

    public static void zzd(zzfut zzfut, zzfec zzfec) {
        if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
            zzfuj.zzq(zzfua.zzv(zzfut), new zzfej(zzfec), zzbzn.zzf);
        }
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) a0.c().zzb(zzbar.zzia), str);
    }

    public static int zzf(zzeyx zzeyx) {
        int e10 = y4.a0.e(zzeyx) - 1;
        return (e10 == 0 || e10 == 1) ? 7 : 23;
    }

    private static void zzg(zzfut zzfut, zzfen zzfen, zzfec zzfec, boolean z10) {
        if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
            zzfuj.zzq(zzfua.zzv(zzfut), new zzfek(zzfen, zzfec, z10), zzbzn.zzf);
        }
    }
}
