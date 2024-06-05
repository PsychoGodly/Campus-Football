package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzdi {
    public static void zza(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(zzdl.zza(str, Character.valueOf(c10)));
        }
    }

    public static void zzd(int i10, int i11, int i12) {
        String str;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                str = zzf(i10, i12, "start index");
            } else if (i11 < 0 || i11 > i12) {
                str = zzf(i11, i12, "end index");
            } else {
                str = zzdl.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void zze(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzf(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzdl.zza("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        return zzdl.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
    }
}
