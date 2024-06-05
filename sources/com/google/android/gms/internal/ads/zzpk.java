package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzpk implements zzof {
    final /* synthetic */ zzpl zza;

    /* synthetic */ zzpk(zzpl zzpl, zzpj zzpj) {
        this.zza = zzpl;
    }

    public final void zza(Exception exc) {
        zzee.zzc("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzc.zzb(exc);
    }

    public final void zzb() {
        zzpl zzpl = this.zza;
        if (zzpl.zzl != null) {
            zzpl.zzl.zzb();
        }
    }
}
