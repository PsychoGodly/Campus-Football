package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzfnu {
    public static int zza(int i10, int i11, String str) {
        String str2;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            str2 = zzfoj.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else if (i11 < 0) {
            throw new IllegalArgumentException("negative size: " + i11);
        } else {
            str2 = zzfoj.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    public static int zzb(int i10, int i11, String str) {
        if (i10 >= 0 && i10 <= i11) {
            return i10;
        }
        throw new IndexOutOfBoundsException(zzj(i10, i11, "index"));
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzd(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzfoj.zzb(str, obj2));
    }

    public static void zze(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzf(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzg(int i10, int i11, int i12) {
        String str;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                str = zzj(i10, i12, "start index");
            } else if (i11 < 0 || i11 > i12) {
                str = zzj(i11, i12, "end index");
            } else {
                str = zzfoj.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void zzh(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void zzi(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzj(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzfoj.zzb("%s (%s) must not be negative", str, Integer.valueOf(i10));
        } else if (i11 >= 0) {
            return zzfoj.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        } else {
            throw new IllegalArgumentException("negative size: " + i11);
        }
    }
}
