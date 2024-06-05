package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzecr extends zzbun implements zzcvy {
    private zzbuo zza;
    private zzcvx zzb;
    private zzdcn zzc;

    public final synchronized void zza(zzcvx zzcvx) {
        this.zzb = zzcvx;
    }

    public final synchronized void zzc(zzbuo zzbuo) {
        this.zza = zzbuo;
    }

    public final synchronized void zzd(zzdcn zzdcn) {
        this.zzc = zzdcn;
    }

    public final synchronized void zze(a aVar) throws RemoteException {
        zzbuo zzbuo = this.zza;
        if (zzbuo != null) {
            ((zzefm) zzbuo).zzb.onAdClicked();
        }
    }

    public final synchronized void zzf(a aVar) throws RemoteException {
        zzbuo zzbuo = this.zza;
        if (zzbuo != null) {
            zzbuo.zzf(aVar);
        }
    }

    public final synchronized void zzg(a aVar, int i10) throws RemoteException {
        zzcvx zzcvx = this.zzb;
        if (zzcvx != null) {
            zzcvx.zza(i10);
        }
    }

    public final synchronized void zzh(a aVar) throws RemoteException {
        zzbuo zzbuo = this.zza;
        if (zzbuo != null) {
            ((zzefm) zzbuo).zzc.zzb();
        }
    }

    public final synchronized void zzi(a aVar) throws RemoteException {
        zzcvx zzcvx = this.zzb;
        if (zzcvx != null) {
            zzcvx.zzd();
        }
    }

    public final synchronized void zzj(a aVar) throws RemoteException {
        zzbuo zzbuo = this.zza;
        if (zzbuo != null) {
            ((zzefm) zzbuo).zza.zzb();
        }
    }

    public final synchronized void zzk(a aVar, int i10) throws RemoteException {
        zzdcn zzdcn = this.zzc;
        if (zzdcn != null) {
            zzbza.zzj("Fail to initialize adapter ".concat(String.valueOf(((zzefl) zzdcn).zzc.zza)));
        }
    }

    public final synchronized void zzl(a aVar) throws RemoteException {
        zzdcn zzdcn = this.zzc;
        if (zzdcn != null) {
            ((zzefl) zzdcn).zzd.zzb.execute(new zzefk((zzefl) zzdcn, ((zzefl) zzdcn).zza, ((zzefl) zzdcn).zzb, ((zzefl) zzdcn).zzc));
        }
    }

    public final synchronized void zzm(a aVar, zzbup zzbup) throws RemoteException {
        zzbuo zzbuo = this.zza;
        if (zzbuo != null) {
            ((zzefm) zzbuo).zzd.zza(zzbup);
        }
    }

    public final synchronized void zzn(a aVar) throws RemoteException {
        zzbuo zzbuo = this.zza;
        if (zzbuo != null) {
            ((zzefm) zzbuo).zzc.zze();
        }
    }

    public final synchronized void zzo(a aVar) throws RemoteException {
        zzbuo zzbuo = this.zza;
        if (zzbuo != null) {
            ((zzefm) zzbuo).zzd.zzc();
        }
    }
}
