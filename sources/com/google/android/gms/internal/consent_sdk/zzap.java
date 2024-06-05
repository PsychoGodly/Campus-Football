package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
final class zzap implements zzaz {
    private final zzaj zza;
    private final zzap zzb = this;
    private final zzdr zzc;
    private final zzdr zzd;
    private final zzdr zze;
    private final zzdr zzf;
    private final zzdr zzg;

    /* synthetic */ zzap(zzaj zzaj, zzbs zzbs, zzao zzao) {
        this.zza = zzaj;
        zzdr zza2 = zzdn.zza(new zzbz(zzaj.zzb));
        this.zzc = zza2;
        zzdo zza3 = zzdp.zza(zzbs);
        this.zzd = zza3;
        zzdm zzdm = new zzdm();
        this.zze = zzdm;
        zzcd zzcd = new zzcd(zzaj.zzb, zza2, zzau.zza, zzaw.zza, zzaj.zzi, zzaj.zzj, zzdm, zzaj.zzc);
        this.zzf = zzcd;
        zzbx zzbx = new zzbx(zza2, zzau.zza, zzcd);
        this.zzg = zzbx;
        zzdm.zza(zzdm, zzdn.zza(new zzbf(zzaj.zzb, zzaj.zzd, zza2, zzaj.zzc, zza3, zzbx)));
    }

    public final zzbe zza() {
        return (zzbe) this.zze.zzb();
    }
}
