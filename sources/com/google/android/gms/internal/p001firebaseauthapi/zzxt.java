package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzxt {
    private final byte[] zza;

    private zzxt(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i11);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzxt)) {
            return false;
        }
        return Arrays.equals(((zzxt) obj).zza, this.zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        String zza2 = zzxj.zza(this.zza);
        return "Bytes(" + zza2 + ")";
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzb() {
        byte[] bArr = this.zza;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static zzxt zza(byte[] bArr) {
        Objects.requireNonNull(bArr, "data must be non-null");
        int length = bArr.length;
        if (length > bArr.length) {
            length = bArr.length;
        }
        return new zzxt(bArr, 0, length);
    }
}
