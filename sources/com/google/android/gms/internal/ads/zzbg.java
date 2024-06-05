package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbg {
    public static final zzbg zza = new zzaj().zzc();
    public static final zzn zzb = zzah.zza;
    private static final String zzk = zzew.zzP(0);
    private static final String zzl = zzew.zzP(1);
    private static final String zzm = zzew.zzP(2);
    private static final String zzn = zzew.zzP(3);
    private static final String zzo = zzew.zzP(4);
    public final String zzc;
    public final zzay zzd;
    @Deprecated
    public final zzba zze;
    public final zzaw zzf;
    public final zzbm zzg;
    public final zzan zzh;
    @Deprecated
    public final zzap zzi;
    public final zzbd zzj;

    /* synthetic */ zzbg(String str, zzap zzap, zzba zzba, zzaw zzaw, zzbm zzbm, zzbd zzbd, zzbf zzbf) {
        this.zzc = str;
        this.zzd = zzba;
        this.zze = zzba;
        this.zzf = zzaw;
        this.zzg = zzbm;
        this.zzh = zzap;
        this.zzi = zzap;
        this.zzj = zzbd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbg)) {
            return false;
        }
        zzbg zzbg = (zzbg) obj;
        return zzew.zzU(this.zzc, zzbg.zzc) && this.zzh.equals(zzbg.zzh) && zzew.zzU(this.zzd, zzbg.zzd) && zzew.zzU(this.zzf, zzbg.zzf) && zzew.zzU(this.zzg, zzbg.zzg) && zzew.zzU(this.zzj, zzbg.zzj);
    }

    public final int hashCode() {
        int hashCode = this.zzc.hashCode() * 31;
        zzay zzay = this.zzd;
        return (((((((hashCode + (zzay != null ? zzay.hashCode() : 0)) * 31) + this.zzf.hashCode()) * 31) + this.zzh.hashCode()) * 31) + this.zzg.hashCode()) * 31;
    }
}
