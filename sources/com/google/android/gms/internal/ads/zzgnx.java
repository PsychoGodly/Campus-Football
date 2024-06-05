package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgnx {
    public static String zza(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(r1 + r1);
        for (byte b10 : bArr) {
            byte b11 = b10 & 255;
            sb2.append("0123456789abcdef".charAt(b11 >> 4));
            sb2.append("0123456789abcdef".charAt(b11 & Ascii.SI));
        }
        return sb2.toString();
    }
}
