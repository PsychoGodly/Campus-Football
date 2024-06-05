package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public class zzbza {
    protected static final zzfoh zza = zzfoh.zzb(4000);

    static String zzd(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        return str + " @" + lineNumber;
    }

    public static void zze(String str) {
        if (!zzm(3)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.d("Ads", str);
            return;
        }
        boolean z10 = true;
        for (String str2 : zza.zzd(str)) {
            if (z10) {
                Log.d("Ads", str2);
            } else {
                Log.d("Ads-cont", str2);
            }
            z10 = false;
        }
    }

    public static void zzf(String str, Throwable th) {
        if (zzm(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void zzg(String str) {
        if (!zzm(6)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.e("Ads", str);
            return;
        }
        boolean z10 = true;
        for (String str2 : zza.zzd(str)) {
            if (z10) {
                Log.e("Ads", str2);
            } else {
                Log.e("Ads-cont", str2);
            }
            z10 = false;
        }
    }

    public static void zzh(String str, Throwable th) {
        if (zzm(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void zzi(String str) {
        if (!zzm(4)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.i("Ads", str);
            return;
        }
        boolean z10 = true;
        for (String str2 : zza.zzd(str)) {
            if (z10) {
                Log.i("Ads", str2);
            } else {
                Log.i("Ads-cont", str2);
            }
            z10 = false;
        }
    }

    public static void zzj(String str) {
        if (!zzm(5)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.w("Ads", str);
            return;
        }
        boolean z10 = true;
        for (String str2 : zza.zzd(str)) {
            if (z10) {
                Log.w("Ads", str2);
            } else {
                Log.w("Ads-cont", str2);
            }
            z10 = false;
        }
    }

    public static void zzk(String str, Throwable th) {
        if (zzm(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void zzl(String str, Throwable th) {
        if (!zzm(5)) {
            return;
        }
        if (th != null) {
            zzk(zzd(str), th);
        } else {
            zzj(zzd(str));
        }
    }

    public static boolean zzm(int i10) {
        return i10 >= 5 || Log.isLoggable("Ads", i10);
    }
}
