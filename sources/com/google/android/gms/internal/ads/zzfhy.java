package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.c;
import h5.b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfhy implements c.a, c.b {
    protected final zzfiw zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzfhp zzf;
    private final long zzg = System.currentTimeMillis();
    private final int zzh;

    public zzfhy(Context context, int i10, int i11, String str, String str2, String str3, zzfhp zzfhp) {
        this.zzb = str;
        this.zzh = i11;
        this.zzc = str2;
        this.zzf = zzfhp;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfiw zzfiw = new zzfiw(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfiw;
        this.zzd = new LinkedBlockingQueue();
        zzfiw.checkAvailabilityAndConnect();
    }

    static zzfji zza() {
        return new zzfji((byte[]) null, 1);
    }

    private final void zze(int i10, long j10, Exception exc) {
        this.zzf.zzc(i10, System.currentTimeMillis() - j10, exc);
    }

    public final void onConnected(Bundle bundle) {
        zzfjb zzd2 = zzd();
        if (zzd2 != null) {
            try {
                zzfji zzf2 = zzd2.zzf(new zzfjg(1, this.zzh, this.zzb, this.zzc));
                zze(5011, this.zzg, (Exception) null);
                this.zzd.put(zzf2);
            } catch (Throwable th) {
                zzc();
                this.zze.quit();
                throw th;
            }
            zzc();
            this.zze.quit();
        }
    }

    public final void onConnectionFailed(b bVar) {
        try {
            zze(4012, this.zzg, (Exception) null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final void onConnectionSuspended(int i10) {
        try {
            zze(4011, this.zzg, (Exception) null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzfji zzb(int i10) {
        zzfji zzfji;
        try {
            zzfji = (zzfji) this.zzd.poll(50000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            zze(AdError.INTERSTITIAL_AD_TIMEOUT, this.zzg, e10);
            zzfji = null;
        }
        zze(3004, this.zzg, (Exception) null);
        if (zzfji != null) {
            if (zzfji.zzc == 7) {
                zzfhp.zzg(3);
            } else {
                zzfhp.zzg(2);
            }
        }
        return zzfji == null ? zza() : zzfji;
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
