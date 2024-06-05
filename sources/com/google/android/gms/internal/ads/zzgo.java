package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgo {
    public byte[] zza;
    public byte[] zzb;
    public int zzc;
    public int[] zzd;
    public int[] zze;
    public int zzf;
    public int zzg;
    public int zzh;
    private final MediaCodec.CryptoInfo zzi;
    private final zzgn zzj;

    public zzgo() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.zzi = cryptoInfo;
        this.zzj = zzew.zza >= 24 ? new zzgn(cryptoInfo, (zzgm) null) : null;
    }

    public final MediaCodec.CryptoInfo zza() {
        return this.zzi;
    }

    public final void zzb(int i10) {
        if (i10 != 0) {
            if (this.zzd == null) {
                int[] iArr = new int[1];
                this.zzd = iArr;
                this.zzi.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.zzd;
            iArr2[0] = iArr2[0] + i10;
        }
    }

    public final void zzc(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.zzf = i10;
        this.zzd = iArr;
        this.zze = iArr2;
        this.zzb = bArr;
        this.zza = bArr2;
        this.zzc = i11;
        this.zzg = i12;
        this.zzh = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.zzi;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (zzew.zza >= 24) {
            zzgn zzgn = this.zzj;
            Objects.requireNonNull(zzgn);
            zzgn.zza(zzgn, i12, i13);
        }
    }
}
