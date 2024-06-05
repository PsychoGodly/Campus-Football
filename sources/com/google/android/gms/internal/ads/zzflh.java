package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzflh extends zzfma {
    private int zza;
    private String zzb;
    private byte zzc;

    zzflh() {
    }

    public final zzfma zza(String str) {
        this.zzb = str;
        return this;
    }

    public final zzfma zzb(int i10) {
        this.zza = i10;
        this.zzc = 1;
        return this;
    }

    public final zzfmb zzc() {
        if (this.zzc == 1) {
            return new zzflj(this.zza, this.zzb, (zzfli) null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
