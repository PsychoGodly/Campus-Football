package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfwz implements Comparable {
    private final byte[] zza;

    /* synthetic */ zzfwz(byte[] bArr, zzfwy zzfwy) {
        this.zza = Arrays.copyOf(bArr, bArr.length);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzfwz zzfwz = (zzfwz) obj;
        int length = this.zza.length;
        int length2 = zzfwz.zza.length;
        if (length != length2) {
            return length - length2;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i10 >= bArr.length) {
                return 0;
            }
            byte b10 = bArr[i10];
            byte b11 = zzfwz.zza[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfwz)) {
            return false;
        }
        return Arrays.equals(this.zza, ((zzfwz) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return zzgnx.zza(this.zza);
    }
}
