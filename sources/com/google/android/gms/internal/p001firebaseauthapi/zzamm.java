package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
abstract class zzamm {
    zzamm() {
    }

    /* access modifiers changed from: package-private */
    public abstract int zza(int i10, byte[] bArr, int i11, int i12);

    /* access modifiers changed from: package-private */
    public abstract int zza(CharSequence charSequence, byte[] bArr, int i10, int i11);

    /* access modifiers changed from: package-private */
    public abstract String zza(byte[] bArr, int i10, int i11) throws zzaji;

    /* access modifiers changed from: package-private */
    public final boolean zzb(byte[] bArr, int i10, int i11) {
        return zza(0, bArr, i10, i11) == 0;
    }
}
