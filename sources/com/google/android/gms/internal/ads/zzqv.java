package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzqv extends zzgp {
    public final zzqx zza;
    public final String zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzqv(Throwable th, zzqx zzqx) {
        super("Decoder failed: ".concat(String.valueOf(zzqx == null ? null : zzqx.zza)), th);
        String str = null;
        this.zza = zzqx;
        if (zzew.zza >= 21 && (th instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zzb = str;
    }
}
