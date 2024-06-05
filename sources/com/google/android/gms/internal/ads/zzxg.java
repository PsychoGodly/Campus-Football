package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzxg {
    public static final zzxa zza = new zzxa(0, -9223372036854775807L, (zzwz) null);
    public static final zzxa zzb = new zzxa(1, -9223372036854775807L, (zzwz) null);
    public static final zzxa zzc = new zzxa(2, -9223372036854775807L, (zzwz) null);
    public static final zzxa zzd = new zzxa(3, -9223372036854775807L, (zzwz) null);
    /* access modifiers changed from: private */
    public final ExecutorService zze = zzew.zzR("ExoPlayer:Loader:ProgressiveMediaPeriod");
    /* access modifiers changed from: private */
    public zzxb zzf;
    /* access modifiers changed from: private */
    public IOException zzg;

    public zzxg(String str) {
    }

    public static zzxa zzb(boolean z10, long j10) {
        return new zzxa(z10 ? 1 : 0, j10, (zzwz) null);
    }

    public final long zza(zzxc zzxc, zzwy zzwy, int i10) {
        Looper myLooper = Looper.myLooper();
        zzdl.zzb(myLooper);
        this.zzg = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzxb(this, myLooper, zzxc, zzwy, i10, elapsedRealtime).zzc(0);
        return elapsedRealtime;
    }

    public final void zzg() {
        zzxb zzxb = this.zzf;
        zzdl.zzb(zzxb);
        zzxb.zza(false);
    }

    public final void zzh() {
        this.zzg = null;
    }

    public final void zzi(int i10) throws IOException {
        IOException iOException = this.zzg;
        if (iOException == null) {
            zzxb zzxb = this.zzf;
            if (zzxb != null) {
                zzxb.zzb(i10);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void zzj(zzxd zzxd) {
        zzxb zzxb = this.zzf;
        if (zzxb != null) {
            zzxb.zza(true);
        }
        this.zze.execute(new zzxe(zzxd));
        this.zze.shutdown();
    }

    public final boolean zzk() {
        return this.zzg != null;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
