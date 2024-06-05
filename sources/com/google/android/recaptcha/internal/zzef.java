package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzef {
    static void zza(boolean z10, String str, long j10, long j11) {
        if (!z10) {
            throw new ArithmeticException("overflow: " + str + "(" + j10 + ", " + j11 + ")");
        }
    }

    static void zzb(boolean z10) {
        if (!z10) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
