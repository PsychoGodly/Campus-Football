package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaht  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaht extends zzahz {
    private final int zzc;
    private final int zzd;

    zzaht(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzahp.zza(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    public final byte zza(int i10) {
        int zzb = zzb();
        if (((zzb - (i10 + 1)) | i10) >= 0) {
            return this.zzb[this.zzc + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + zzb);
    }

    /* access modifiers changed from: package-private */
    public final byte zzb(int i10) {
        return this.zzb[this.zzc + i10];
    }

    /* access modifiers changed from: protected */
    public final int zzh() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final void zza(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, zzh(), bArr, 0, i12);
    }
}
