package com.google.android.gms.internal.p001firebaseauthapi;

import com.applovin.exoplayer2.common.base.Ascii;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzamn {
    static /* synthetic */ void zza(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
        if (zza(b11) || (((b10 << Ascii.FS) + (b11 + 112)) >> 30) != 0 || zza(b12) || zza(b13)) {
            throw zzaji.zzd();
        }
        byte b14 = ((b10 & 7) << Ascii.DC2) | ((b11 & 63) << Ascii.FF) | ((b12 & 63) << 6) | (b13 & 63);
        cArr[i10] = (char) ((b14 >>> 10) + 55232);
        cArr[i10 + 1] = (char) ((b14 & 1023) + Ascii.NUL);
    }

    private static boolean zza(byte b10) {
        return b10 > -65;
    }

    static /* synthetic */ void zza(byte b10, char[] cArr, int i10) {
        cArr[i10] = (char) b10;
    }

    static /* synthetic */ void zza(byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (zza(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || zza(b12)))) {
            throw zzaji.zzd();
        }
        cArr[i10] = (char) (((b10 & Ascii.SI) << Ascii.FF) | ((b11 & 63) << 6) | (b12 & 63));
    }

    static /* synthetic */ void zza(byte b10, byte b11, char[] cArr, int i10) {
        if (b10 < -62 || zza(b11)) {
            throw zzaji.zzd();
        }
        cArr[i10] = (char) (((b10 & Ascii.US) << 6) | (b11 & 63));
    }
}
