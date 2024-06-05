package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgoj {
    private final byte[] zza;

    private zzgoj(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i11);
    }

    public static zzgoj zzb(byte[] bArr) {
        Objects.requireNonNull(bArr, "data must be non-null");
        return new zzgoj(bArr, 0, bArr.length);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgoj)) {
            return false;
        }
        return Arrays.equals(((zzgoj) obj).zza, this.zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        String zza2 = zzgnx.zza(this.zza);
        return "Bytes(" + zza2 + ")";
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzc() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
