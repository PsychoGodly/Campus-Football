package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
abstract class zzmi {
    zzmi() {
    }

    /* access modifiers changed from: package-private */
    public abstract int zza(int i10, byte[] bArr, int i11, int i12);

    /* access modifiers changed from: package-private */
    public abstract int zza(CharSequence charSequence, byte[] bArr, int i10, int i11);

    /* access modifiers changed from: package-private */
    public abstract String zza(byte[] bArr, int i10, int i11) throws zzji;

    /* access modifiers changed from: package-private */
    public final boolean zzb(byte[] bArr, int i10, int i11) {
        return zza(0, bArr, i10, i11) == 0;
    }
}
