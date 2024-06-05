package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzrn implements zzrk {
    private final int zza;
    private MediaCodecInfo[] zzb;

    public zzrn(boolean z10, boolean z11) {
        int i10 = 1;
        if (!z10 && !z11) {
            i10 = 0;
        }
        this.zza = i10;
    }

    private final void zzf() {
        if (this.zzb == null) {
            this.zzb = new MediaCodecList(this.zza).getCodecInfos();
        }
    }

    public final int zza() {
        zzf();
        return this.zzb.length;
    }

    public final MediaCodecInfo zzb(int i10) {
        zzf();
        return this.zzb[i10];
    }

    public final boolean zzc(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public final boolean zze() {
        return true;
    }
}
