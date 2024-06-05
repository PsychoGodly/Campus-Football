package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.common.internal.c;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzavm {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzavi(this);
    /* access modifiers changed from: private */
    public final Object zzc = new Object();
    /* access modifiers changed from: private */
    public zzavp zzd;
    private Context zze;
    /* access modifiers changed from: private */
    public zzavs zzf;

    static /* bridge */ /* synthetic */ void zzh(zzavm zzavm) {
        synchronized (zzavm.zzc) {
            zzavp zzavp = zzavm.zzd;
            if (zzavp != null) {
                if (zzavp.isConnected() || zzavm.zzd.isConnecting()) {
                    zzavm.zzd.disconnect();
                }
                zzavm.zzd = null;
                zzavm.zzf = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzl() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.zzc
            monitor-enter(r0)
            android.content.Context r1 = r3.zze     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.zzavp r1 = r3.zzd     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0021
        L_0x000c:
            com.google.android.gms.internal.ads.zzavk r1 = new com.google.android.gms.internal.ads.zzavk     // Catch:{ all -> 0x0023 }
            r1.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.zzavl r2 = new com.google.android.gms.internal.ads.zzavl     // Catch:{ all -> 0x0023 }
            r2.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.zzavp r1 = r3.zzd(r1, r2)     // Catch:{ all -> 0x0023 }
            r3.zzd = r1     // Catch:{ all -> 0x0023 }
            r1.checkAvailabilityAndConnect()     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavm.zzl():void");
    }

    public final long zza(zzavq zzavq) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return -2;
            }
            if (this.zzd.zzp()) {
                try {
                    long zze2 = this.zzf.zze(zzavq);
                    return zze2;
                } catch (RemoteException e10) {
                    zzbza.zzh("Unable to call into cache service.", e10);
                    return -2;
                }
            }
        }
    }

    public final zzavn zzb(zzavq zzavq) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                zzavn zzavn = new zzavn();
                return zzavn;
            }
            try {
                if (this.zzd.zzp()) {
                    zzavn zzg = this.zzf.zzg(zzavq);
                    return zzg;
                }
                zzavn zzf2 = this.zzf.zzf(zzavq);
                return zzf2;
            } catch (RemoteException e10) {
                zzbza.zzh("Unable to call into cache service.", e10);
                return new zzavn();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized zzavp zzd(c.a aVar, c.b bVar) {
        return new zzavp(this.zze, t.v().b(), aVar, bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzi(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r2.zzc
            monitor-enter(r0)
            android.content.Context r1 = r2.zze     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000c:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0048 }
            r2.zze = r3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzbaj r3 = com.google.android.gms.internal.ads.zzbar.zzdM     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.zzb(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.zzl()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            com.google.android.gms.internal.ads.zzbaj r3 = com.google.android.gms.internal.ads.zzbar.zzdL     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.zzb(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.zzavj r3 = new com.google.android.gms.internal.ads.zzavj     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzatz r1 = com.google.android.gms.ads.internal.t.d()     // Catch:{ all -> 0x0048 }
            r1.zzc(r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavm.zzi(android.content.Context):void");
    }

    public final void zzj() {
        if (((Boolean) a0.c().zzb(zzbar.zzdN)).booleanValue()) {
            synchronized (this.zzc) {
                zzl();
                ScheduledFuture scheduledFuture = this.zza;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zza = zzbzn.zzd.schedule(this.zzb, ((Long) a0.c().zzb(zzbar.zzdO)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }
}
