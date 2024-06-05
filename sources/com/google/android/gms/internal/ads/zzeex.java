package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzeex extends zzefy {
    private final zzdcl zza;

    public zzeex(zzcum zzcum, zzdca zzdca, zzcvg zzcvg, zzcvv zzcvv, zzcwa zzcwa, zzcvb zzcvb, zzczi zzczi, zzdcs zzdcs, zzcwu zzcwu, zzdcl zzdcl, zzcze zzcze) {
        super(zzcum, zzdca, zzcvg, zzcvv, zzcwa, zzczi, zzcwu, zzdcs, zzcze, zzcvb);
        this.zza = zzdcl;
    }

    public final void zzs(zzbup zzbup) {
        this.zza.zza(zzbup);
    }

    public final void zzt(zzbut zzbut) throws RemoteException {
        this.zza.zza(new zzbup(zzbut.zzf(), zzbut.zze()));
    }

    public final void zzu() throws RemoteException {
        this.zza.zzb();
    }

    public final void zzv() {
        this.zza.zzb();
    }

    public final void zzy() {
        this.zza.zzc();
    }
}
