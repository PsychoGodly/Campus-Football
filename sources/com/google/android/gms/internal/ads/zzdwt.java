package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.t;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdwt extends zzdwz {
    private zzbsv zzh;

    zzdwt(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zze = context;
        this.zzf = t.v().b();
        this.zzg = scheduledExecutorService;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onConnected(android.os.Bundle r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r4 = r3.zzc     // Catch:{ all -> 0x0039 }
            if (r4 != 0) goto L_0x0037
            r4 = 1
            r3.zzc = r4     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.ads.zzbsq r0 = r3.zzd     // Catch:{ RemoteException -> 0x002b, all -> 0x001a }
            com.google.android.gms.internal.ads.zzbtd r0 = r0.zzp()     // Catch:{ RemoteException -> 0x002b, all -> 0x001a }
            com.google.android.gms.internal.ads.zzbsv r1 = r3.zzh     // Catch:{ RemoteException -> 0x002b, all -> 0x001a }
            com.google.android.gms.internal.ads.zzdwy r2 = new com.google.android.gms.internal.ads.zzdwy     // Catch:{ RemoteException -> 0x002b, all -> 0x001a }
            r2.<init>(r3)     // Catch:{ RemoteException -> 0x002b, all -> 0x001a }
            r0.zze(r1, r2)     // Catch:{ RemoteException -> 0x002b, all -> 0x001a }
            monitor-exit(r3)
            return
        L_0x001a:
            r4 = move-exception
            java.lang.String r0 = "RemoteAdsServiceProxyClientTask.onConnected"
            com.google.android.gms.internal.ads.zzbyj r1 = com.google.android.gms.ads.internal.t.q()     // Catch:{ all -> 0x0039 }
            r1.zzu(r4, r0)     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.ads.zzbzs r0 = r3.zza     // Catch:{ all -> 0x0039 }
            r0.zze(r4)     // Catch:{ all -> 0x0039 }
            monitor-exit(r3)
            return
        L_0x002b:
            com.google.android.gms.internal.ads.zzbzs r0 = r3.zza     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.ads.zzdvi r1 = new com.google.android.gms.internal.ads.zzdvi     // Catch:{ all -> 0x0039 }
            r1.<init>(r4)     // Catch:{ all -> 0x0039 }
            r0.zze(r1)     // Catch:{ all -> 0x0039 }
            monitor-exit(r3)
            return
        L_0x0037:
            monitor-exit(r3)
            return
        L_0x0039:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdwt.onConnected(android.os.Bundle):void");
    }

    public final synchronized zzfut zza(zzbsv zzbsv, long j10) {
        if (this.zzb) {
            return zzfuj.zzn(this.zza, j10, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbsv;
        zzb();
        zzfut zzn = zzfuj.zzn(this.zza, j10, TimeUnit.MILLISECONDS, this.zzg);
        zzn.zzc(new zzdws(this), zzbzn.zzf);
        return zzn;
    }
}
