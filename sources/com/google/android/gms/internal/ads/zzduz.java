package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.t;
import h5.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzduz extends zzdut {
    private String zzg;
    private int zzh = 1;

    zzduz(Context context) {
        this.zzf = new zzbsn(context, t.v().b(), this, this);
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    int i10 = this.zzh;
                    if (i10 == 2) {
                        this.zzf.zzp().zze(this.zze, new zzdus(this));
                    } else if (i10 == 3) {
                        this.zzf.zzp().zzh(this.zzg, new zzdus(this));
                    } else {
                        this.zza.zze(new zzdvi(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zze(new zzdvi(1));
                } catch (Throwable th) {
                    t.q().zzu(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zza.zze(new zzdvi(1));
                }
            }
        }
    }

    public final void onConnectionFailed(b bVar) {
        zzbza.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zze(new zzdvi(1));
    }

    public final zzfut zzb(zzbtn zzbtn) {
        synchronized (this.zzb) {
            int i10 = this.zzh;
            if (i10 != 1 && i10 != 2) {
                zzfut zzg2 = zzfuj.zzg(new zzdvi(2));
                return zzg2;
            } else if (this.zzc) {
                zzbzs zzbzs = this.zza;
                return zzbzs;
            } else {
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzbtn;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.zzc(new zzduy(this), zzbzn.zzf);
                zzbzs zzbzs2 = this.zza;
                return zzbzs2;
            }
        }
    }

    public final zzfut zzc(String str) {
        synchronized (this.zzb) {
            int i10 = this.zzh;
            if (i10 != 1 && i10 != 3) {
                zzfut zzg2 = zzfuj.zzg(new zzdvi(2));
                return zzg2;
            } else if (this.zzc) {
                zzbzs zzbzs = this.zza;
                return zzbzs;
            } else {
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.zzc(new zzdux(this), zzbzn.zzf);
                zzbzs zzbzs2 = this.zza;
                return zzbzs2;
            }
        }
    }
}
