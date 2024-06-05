package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdfr extends zzbdt {
    private final zzdgi zza;
    private a zzb;

    public zzdfr(zzdgi zzdgi) {
        this.zza = zzdgi;
    }

    private static float zzb(a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) b.A1(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
    }

    public final float zze() throws RemoteException {
        if (!((Boolean) a0.c().zzb(zzbar.zzfO)).booleanValue()) {
            return 0.0f;
        }
        if (this.zza.zzb() != 0.0f) {
            return this.zza.zzb();
        }
        if (this.zza.zzj() != null) {
            try {
                return this.zza.zzj().zze();
            } catch (RemoteException e10) {
                zzbza.zzh("Remote exception getting video controller aspect ratio.", e10);
                return 0.0f;
            }
        } else {
            a aVar = this.zzb;
            if (aVar != null) {
                return zzb(aVar);
            }
            zzbdx zzm = this.zza.zzm();
            if (zzm == null) {
                return 0.0f;
            }
            float zzd = (zzm.zzd() == -1 || zzm.zzc() == -1) ? 0.0f : ((float) zzm.zzd()) / ((float) zzm.zzc());
            return zzd == 0.0f ? zzb(zzm.zzf()) : zzd;
        }
    }

    public final float zzf() throws RemoteException {
        if (((Boolean) a0.c().zzb(zzbar.zzfP)).booleanValue() && this.zza.zzj() != null) {
            return this.zza.zzj().zzf();
        }
        return 0.0f;
    }

    public final float zzg() throws RemoteException {
        if (((Boolean) a0.c().zzb(zzbar.zzfP)).booleanValue() && this.zza.zzj() != null) {
            return this.zza.zzj().zzg();
        }
        return 0.0f;
    }

    public final s2 zzh() throws RemoteException {
        if (!((Boolean) a0.c().zzb(zzbar.zzfP)).booleanValue()) {
            return null;
        }
        return this.zza.zzj();
    }

    public final a zzi() throws RemoteException {
        a aVar = this.zzb;
        if (aVar != null) {
            return aVar;
        }
        zzbdx zzm = this.zza.zzm();
        if (zzm == null) {
            return null;
        }
        return zzm.zzf();
    }

    public final void zzj(a aVar) {
        this.zzb = aVar;
    }

    public final boolean zzk() throws RemoteException {
        if (((Boolean) a0.c().zzb(zzbar.zzfP)).booleanValue() && this.zza.zzj() != null) {
            return true;
        }
        return false;
    }

    public final void zzl(zzbff zzbff) {
        if (((Boolean) a0.c().zzb(zzbar.zzfP)).booleanValue() && (this.zza.zzj() instanceof zzcfe)) {
            ((zzcfe) this.zza.zzj()).zzv(zzbff);
        }
    }
}
