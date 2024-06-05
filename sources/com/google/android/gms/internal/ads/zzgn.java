package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgn {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* synthetic */ zzgn(MediaCodec.CryptoInfo cryptoInfo, zzgm zzgm) {
        this.zza = cryptoInfo;
    }

    static /* bridge */ /* synthetic */ void zza(zzgn zzgn, int i10, int i11) {
        zzgn.zzb.set(i10, i11);
        zzgn.zza.setPattern(zzgn.zzb);
    }
}
