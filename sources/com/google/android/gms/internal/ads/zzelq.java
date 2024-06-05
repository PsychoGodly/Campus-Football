package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzelq implements zzepn {
    private final zzfuu zza;
    private final zzdni zzb;
    private final String zzc;
    private final zzeyx zzd;

    public zzelq(zzfuu zzfuu, zzdni zzdni, zzeyx zzeyx, String str) {
        this.zza = zzfuu;
        this.zzb = zzdni;
        this.zzd = zzeyx;
        this.zzc = str;
    }

    public final int zza() {
        return 17;
    }

    public final zzfut zzb() {
        return this.zza.zzb(new zzelp(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzelr zzc() throws Exception {
        return new zzelr(this.zzb.zzb(this.zzd.zzf, this.zzc), this.zzb.zza());
    }
}
