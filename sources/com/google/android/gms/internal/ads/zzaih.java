package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzaih extends zzzg {
    public zzaih(zzeu zzeu, long j10, long j11) {
        super(new zzzb(), new zzaig(zzeu, (zzaif) null), j10, 0, j10 + 1, 0, j11, 188, 1000);
    }

    static /* bridge */ /* synthetic */ int zzh(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << Ascii.CAN) | ((bArr[i10 + 1] & 255) << Ascii.DLE) | ((bArr[i10 + 2] & 255) << 8);
    }
}
