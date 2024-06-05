package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgox extends zzgpa {
    private final int zzc;
    private final int zzd;

    zzgox(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzgpe.zzq(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    public final byte zza(int i10) {
        zzgpe.zzB(i10, this.zzd);
        return this.zza[this.zzc + i10];
    }

    /* access modifiers changed from: package-private */
    public final byte zzb(int i10) {
        return this.zza[this.zzc + i10];
    }

    /* access modifiers changed from: protected */
    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, this.zzc + i10, bArr, i11, i12);
    }
}
