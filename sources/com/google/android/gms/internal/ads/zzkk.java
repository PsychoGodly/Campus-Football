package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzkk {
    private final zzkj zza;
    private final zzki zzb;
    private final zzdm zzc;
    private final zzcn zzd;
    private int zze;
    private Object zzf;
    private final Looper zzg;
    private final int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public zzkk(zzki zzki, zzkj zzkj, zzcn zzcn, int i10, zzdm zzdm, Looper looper) {
        this.zzb = zzki;
        this.zza = zzkj;
        this.zzd = zzcn;
        this.zzg = looper;
        this.zzc = zzdm;
        this.zzh = i10;
    }

    public final int zza() {
        return this.zze;
    }

    public final Looper zzb() {
        return this.zzg;
    }

    public final zzkj zzc() {
        return this.zza;
    }

    public final zzkk zzd() {
        zzdl.zzf(!this.zzi);
        this.zzi = true;
        this.zzb.zzm(this);
        return this;
    }

    public final zzkk zze(Object obj) {
        zzdl.zzf(!this.zzi);
        this.zzf = obj;
        return this;
    }

    public final zzkk zzf(int i10) {
        zzdl.zzf(!this.zzi);
        this.zze = i10;
        return this;
    }

    public final Object zzg() {
        return this.zzf;
    }

    public final synchronized void zzh(boolean z10) {
        this.zzj = z10 | this.zzj;
        this.zzk = true;
        notifyAll();
    }

    public final synchronized boolean zzi(long j10) throws InterruptedException, TimeoutException {
        zzdl.zzf(this.zzi);
        zzdl.zzf(this.zzg.getThread() != Thread.currentThread());
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        while (!this.zzk) {
            if (j10 > 0) {
                wait(j10);
                j10 = elapsedRealtime - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
        return this.zzj;
    }

    public final synchronized boolean zzj() {
        return false;
    }
}
