package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.c;
import com.unity3d.services.UnityAdsConstants;
import h5.b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfhw implements c.a, c.b {
    protected final zzfiw zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd = new LinkedBlockingQueue();
    private final HandlerThread zze;

    public zzfhw(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfiw zzfiw = new zzfiw(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfiw;
        zzfiw.checkAvailabilityAndConnect();
    }

    static zzans zza() {
        zzamv zza2 = zzans.zza();
        zza2.zzD(32768);
        return (zzans) zza2.zzal();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        zzc();
        r3.zze.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3.zzd.put(zza());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onConnected(android.os.Bundle r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzfjb r4 = r3.zzd()
            if (r4 == 0) goto L_0x0039
            com.google.android.gms.internal.ads.zzfix r0 = new com.google.android.gms.internal.ads.zzfix     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = r3.zzb     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = r3.zzc     // Catch:{ all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.zzfiz r4 = r4.zze(r0)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.zzans r4 = r4.zza()     // Catch:{ all -> 0x0025 }
            java.util.concurrent.LinkedBlockingQueue r0 = r3.zzd     // Catch:{ all -> 0x0025 }
            r0.put(r4)     // Catch:{ all -> 0x0025 }
        L_0x001c:
            r3.zzc()
            android.os.HandlerThread r4 = r3.zze
            r4.quit()
            return
        L_0x0025:
            java.util.concurrent.LinkedBlockingQueue r4 = r3.zzd     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            com.google.android.gms.internal.ads.zzans r0 = zza()     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            r4.put(r0)     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            goto L_0x001c
        L_0x002f:
            r4 = move-exception
            r3.zzc()
            android.os.HandlerThread r0 = r3.zze
            r0.quit()
            throw r4
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfhw.onConnected(android.os.Bundle):void");
    }

    public final void onConnectionFailed(b bVar) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final void onConnectionSuspended(int i10) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzans zzb(int i10) {
        zzans zzans;
        try {
            zzans = (zzans) this.zzd.poll(UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzans = null;
        }
        return zzans == null ? zza() : zzans;
    }

    public final void zzc() {
        zzfiw zzfiw = this.zza;
        if (zzfiw == null) {
            return;
        }
        if (zzfiw.isConnected() || this.zza.isConnecting()) {
            this.zza.disconnect();
        }
    }

    /* access modifiers changed from: protected */
    public final zzfjb zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
