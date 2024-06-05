package com.google.android.gms.internal.p001firebaseauthapi;

import com.applovin.exoplayer2.common.base.Ascii;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzxj {
    public static String zza(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            byte b11 = b10 & 255;
            sb2.append("0123456789abcdef".charAt(b11 / Ascii.DLE));
            sb2.append("0123456789abcdef".charAt(b11 % Ascii.DLE));
        }
        return sb2.toString();
    }
}
