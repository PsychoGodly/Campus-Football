package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzavv implements Runnable {
    public final /* synthetic */ zzavy zza;
    public final /* synthetic */ zzavp zzb;
    public final /* synthetic */ zzavq zzc;
    public final /* synthetic */ zzbzs zzd;

    public /* synthetic */ zzavv(zzavy zzavy, zzavp zzavp, zzavq zzavq, zzbzs zzbzs) {
        this.zza = zzavy;
        this.zzb = zzavp;
        this.zzc = zzavq;
        this.zzd = zzbzs;
    }

    public final void run() {
        zzavn zzavn;
        zzavy zzavy = this.zza;
        zzavp zzavp = this.zzb;
        zzavq zzavq = this.zzc;
        zzbzs zzbzs = this.zzd;
        try {
            zzavs zzq = zzavp.zzq();
            if (zzavp.zzp()) {
                zzavn = zzq.zzg(zzavq);
            } else {
                zzavn = zzq.zzf(zzavq);
            }
            if (!zzavn.zze()) {
                zzbzs.zze(new RuntimeException("No entry contents."));
                zzawa.zze(zzavy.zzc);
                return;
            }
            zzavx zzavx = new zzavx(zzavy, zzavn.zzc(), 1);
            int read = zzavx.read();
            if (read != -1) {
                zzavx.unread(read);
                zzbzs.zzd(zzawc.zzb(zzavx, zzavn.zzd(), zzavn.zzg(), zzavn.zza(), zzavn.zzf()));
                return;
            }
            throw new IOException("Unable to read from cache.");
        } catch (RemoteException | IOException e10) {
            zzbza.zzh("Unable to obtain a cache service instance.", e10);
            zzbzs.zze(e10);
            zzawa.zze(zzavy.zzc);
        }
    }
}
