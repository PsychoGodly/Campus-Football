package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzqs {
    public final zzqx zza;
    public final MediaFormat zzb;
    public final zzaf zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;

    private zzqs(zzqx zzqx, MediaFormat mediaFormat, zzaf zzaf, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.zza = zzqx;
        this.zzb = mediaFormat;
        this.zzc = zzaf;
        this.zzd = surface;
    }

    public static zzqs zza(zzqx zzqx, MediaFormat mediaFormat, zzaf zzaf, MediaCrypto mediaCrypto) {
        return new zzqs(zzqx, mediaFormat, zzaf, (Surface) null, (MediaCrypto) null, 0);
    }

    public static zzqs zzb(zzqx zzqx, MediaFormat mediaFormat, zzaf zzaf, Surface surface, MediaCrypto mediaCrypto) {
        return new zzqs(zzqx, mediaFormat, zzaf, surface, (MediaCrypto) null, 0);
    }
}
