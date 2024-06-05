package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.unity3d.services.core.device.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzrm implements zzrk {
    private zzrm() {
    }

    /* synthetic */ zzrm(zzrl zzrl) {
    }

    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    public final MediaCodecInfo zzb(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    public final boolean zzc(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && MimeTypes.VIDEO_H264.equals(str2);
    }

    public final boolean zze() {
        return false;
    }
}
