package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzflb extends zzfln {
    private String zza;
    private String zzb;

    zzflb() {
    }

    public final zzfln zza(String str) {
        this.zzb = str;
        return this;
    }

    public final zzfln zzb(String str) {
        this.zza = str;
        return this;
    }

    public final zzflo zzc() {
        return new zzfld(this.zza, this.zzb, (zzflc) null);
    }
}
