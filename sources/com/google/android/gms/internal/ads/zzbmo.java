package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbmo {
    private final zzblr zza;
    private zzfut zzb;

    zzbmo(zzblr zzblr) {
        this.zza = zzblr;
    }

    private final void zzd() {
        if (this.zzb == null) {
            zzbzs zzbzs = new zzbzs();
            this.zzb = zzbzs;
            this.zza.zzb((zzapw) null).zzi(new zzbmm(zzbzs), new zzbmn(zzbzs));
        }
    }

    public final zzbmr zza(String str, zzbly zzbly, zzblx zzblx) {
        zzd();
        return new zzbmr(this.zzb, "google.afma.activeView.handleUpdate", zzbly, zzblx);
    }

    public final void zzb(String str, zzbhp zzbhp) {
        zzd();
        this.zzb = zzfuj.zzm(this.zzb, new zzbmk(str, zzbhp), zzbzn.zzf);
    }

    public final void zzc(String str, zzbhp zzbhp) {
        this.zzb = zzfuj.zzl(this.zzb, new zzbml(str, zzbhp), zzbzn.zzf);
    }
}
