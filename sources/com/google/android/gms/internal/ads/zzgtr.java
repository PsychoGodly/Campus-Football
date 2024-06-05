package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgtr {
    static /* bridge */ /* synthetic */ void zza(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
        if (zzg(b11) || (((b10 << Ascii.FS) + (b11 + 112)) >> 30) != 0 || zzg(b12) || zzg(b13)) {
            throw zzgqy.zzd();
        }
        byte b14 = ((b10 & 7) << Ascii.DC2) | ((b11 & 63) << Ascii.FF) | ((b12 & 63) << 6) | (b13 & 63);
        cArr[i10] = (char) ((b14 >>> 10) + 55232);
        cArr[i10 + 1] = (char) ((b14 & 1023) + Ascii.NUL);
    }

    static /* bridge */ /* synthetic */ void zzb(byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (!zzg(b11)) {
            if (b10 == -32) {
                if (b11 >= -96) {
                    b10 = -32;
                }
            }
            if (b10 == -19) {
                if (b11 < -96) {
                    b10 = -19;
                }
            }
            if (!zzg(b12)) {
                cArr[i10] = (char) (((b10 & Ascii.SI) << Ascii.FF) | ((b11 & 63) << 6) | (b12 & 63));
                return;
            }
        }
        throw zzgqy.zzd();
    }

    static /* bridge */ /* synthetic */ void zzc(byte b10, byte b11, char[] cArr, int i10) {
        if (b10 < -62 || zzg(b11)) {
            throw zzgqy.zzd();
        }
        cArr[i10] = (char) (((b10 & Ascii.US) << 6) | (b11 & 63));
    }

    static /* bridge */ /* synthetic */ boolean zzd(byte b10) {
        return b10 >= 0;
    }

    static /* bridge */ /* synthetic */ boolean zze(byte b10) {
        return b10 < -16;
    }

    static /* bridge */ /* synthetic */ boolean zzf(byte b10) {
        return b10 < -32;
    }

    private static boolean zzg(byte b10) {
        return b10 > -65;
    }
}
