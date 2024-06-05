package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzy {
    public static int zza(int i10, int i11) {
        String str;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            str = zzag.zza("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else if (i11 < 0) {
            throw new IllegalArgumentException("negative size: " + i11);
        } else {
            str = zzag.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(str);
    }

    public static int zzb(int i10, int i11) {
        if (i10 >= 0 && i10 <= i11) {
            return i10;
        }
        throw new IndexOutOfBoundsException(zzb(i10, i11, "index"));
    }

    private static String zzb(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzag.zza("%s (%s) must not be negative", str, Integer.valueOf(i10));
        } else if (i11 >= 0) {
            return zzag.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        } else {
            throw new IllegalArgumentException("negative size: " + i11);
        }
    }

    public static int zza(int i10, int i11, String str) {
        if (i10 >= 0 && i10 <= i11) {
            return i10;
        }
        throw new IndexOutOfBoundsException(zzb(i10, i11, str));
    }

    public static <T> T zza(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    public static void zza(int i10, int i11, int i12) {
        String str;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                str = zzb(i10, i12, "start index");
            } else if (i11 < 0 || i11 > i12) {
                str = zzb(i11, i12, "end index");
            } else {
                str = zzag.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }
}
