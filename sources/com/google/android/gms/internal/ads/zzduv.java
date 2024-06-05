package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzduv extends zzdut {
    zzduv(Context context) {
        this.zzf = new zzbsn(context, t.v().b(), this, this);
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzf(this.zze, new zzdus(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zze(new zzdvi(1));
                } catch (Throwable th) {
                    t.q().zzu(th, "RemoteSignalsClientTask.onConnected");
                    this.zza.zze(new zzdvi(1));
                }
            }
        }
    }

    public final zzfut zzb(zzbtn zzbtn) {
        synchronized (this.zzb) {
            if (this.zzc) {
                zzbzs zzbzs = this.zza;
                return zzbzs;
            }
            this.zzc = true;
            this.zze = zzbtn;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.zzc(new zzduu(this), zzbzn.zzf);
            zzbzs zzbzs2 = this.zza;
            return zzbzs2;
        }
    }
}
