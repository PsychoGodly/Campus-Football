package com.google.android.gms.internal.ads;

import android.util.Base64;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaoh {
    public static String zza(byte[] bArr, boolean z10) {
        return Base64.encodeToString(bArr, true != z10 ? 2 : 11);
    }

    public static byte[] zzb(String str, boolean z10) throws IllegalArgumentException {
        byte[] decode = Base64.decode(str, true != z10 ? 2 : 11);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }
}
