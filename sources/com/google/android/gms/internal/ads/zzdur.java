package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.t;
import h5.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdur extends zzdut {
    public zzdur(Context context) {
        this.zzf = new zzbsn(context, t.v().b(), this, this);
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzg(this.zze, new zzdus(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zze(new zzdvi(1));
                } catch (Throwable th) {
                    t.q().zzu(th, "RemoteAdRequestClientTask.onConnected");
                    this.zza.zze(new zzdvi(1));
                }
            }
        }
    }

    public final void onConnectionFailed(b bVar) {
        zzbza.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zze(new zzdvi(1));
    }
}
