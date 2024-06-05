package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.b5;
import com.google.android.gms.ads.internal.client.c1;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.h0;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.ads.internal.client.j1;
import com.google.android.gms.ads.internal.client.k0;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o4.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeib implements e, zzcxj, zzcwc, zzcur, zzcvi, a, zzcuo, zzcwz, zzcve, zzdcc {
    final BlockingQueue zza = new ArrayBlockingQueue(((Integer) a0.c().zzb(zzbar.zzic)).intValue());
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicBoolean zzg = new AtomicBoolean(true);
    private final AtomicBoolean zzh = new AtomicBoolean(false);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final zzfdk zzj;

    public zzeib(zzfdk zzfdk) {
        this.zzj = zzfdk;
    }

    private final void zzu() {
        if (this.zzh.get() && this.zzi.get()) {
            for (Pair zzehs : this.zza) {
                zzevh.zza(this.zzc, new zzehs(zzehs));
            }
            this.zza.clear();
            this.zzg.set(false);
        }
    }

    public final void onAdClicked() {
        if (!((Boolean) a0.c().zzb(zzbar.zzjf)).booleanValue()) {
            zzevh.zza(this.zzb, zzeht.zza);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onAppEvent(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzg     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0036
            java.util.concurrent.BlockingQueue r0 = r3.zza     // Catch:{ all -> 0x0042 }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0042 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.offer(r1)     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "The queue for app events is full, dropping the new event."
            com.google.android.gms.internal.ads.zzbza.zze(r0)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.zzfdk r0 = r3.zzj     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0034
            java.lang.String r1 = "dae_action"
            com.google.android.gms.internal.ads.zzfdj r1 = com.google.android.gms.internal.ads.zzfdj.zzb(r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "dae_name"
            r1.zza(r2, r4)     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = "dae_data"
            r1.zza(r4, r5)     // Catch:{ all -> 0x0042 }
            r0.zzb(r1)     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return
        L_0x0034:
            monitor-exit(r3)
            return
        L_0x0036:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzc     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.zzeho r1 = new com.google.android.gms.internal.ads.zzeho     // Catch:{ all -> 0x0042 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.zzevh.zza(r0, r1)     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return
        L_0x0042:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeib.onAppEvent(java.lang.String, java.lang.String):void");
    }

    public final void zza(c3 c3Var) {
        zzevh.zza(this.zzb, new zzehv(c3Var));
        zzevh.zza(this.zzb, new zzehw(c3Var));
        zzevh.zza(this.zze, new zzehx(c3Var));
        this.zzg.set(false);
        this.zza.clear();
    }

    public final void zzb(zzeyo zzeyo) {
        this.zzg.set(true);
        this.zzi.set(false);
    }

    public final void zzbA(zzbtn zzbtn) {
    }

    public final void zzbr() {
    }

    public final synchronized h0 zzc() {
        return (h0) this.zzb.get();
    }

    public final synchronized c1 zzd() {
        return (c1) this.zzc.get();
    }

    public final void zze(h0 h0Var) {
        this.zzb.set(h0Var);
    }

    public final void zzf(k0 k0Var) {
        this.zze.set(k0Var);
    }

    public final void zzg(i2 i2Var) {
        this.zzd.set(i2Var);
    }

    public final void zzh(b5 b5Var) {
        zzevh.zza(this.zzd, new zzehq(b5Var));
    }

    public final void zzi(c1 c1Var) {
        this.zzc.set(c1Var);
        this.zzh.set(true);
        zzu();
    }

    public final void zzj() {
        zzevh.zza(this.zzb, zzeia.zza);
        zzevh.zza(this.zzf, zzehj.zza);
    }

    public final void zzk(c3 c3Var) {
        zzevh.zza(this.zzf, new zzehp(c3Var));
    }

    public final void zzl() {
        zzevh.zza(this.zzb, zzehi.zza);
    }

    public final void zzm() {
        zzevh.zza(this.zzb, zzehr.zza);
    }

    public final synchronized void zzn() {
        zzevh.zza(this.zzb, zzehy.zza);
        zzevh.zza(this.zze, zzehz.zza);
        this.zzi.set(true);
        zzu();
    }

    public final void zzo() {
        zzevh.zza(this.zzb, zzehl.zza);
        zzevh.zza(this.zzf, zzehm.zza);
        zzevh.zza(this.zzf, zzehn.zza);
    }

    public final void zzp(zzbud zzbud, String str, String str2) {
    }

    public final void zzq() {
    }

    public final void zzr() {
        if (((Boolean) a0.c().zzb(zzbar.zzjf)).booleanValue()) {
            zzevh.zza(this.zzb, zzeht.zza);
        }
        zzevh.zza(this.zzf, zzehu.zza);
    }

    public final void zzs() {
        zzevh.zza(this.zzb, zzehk.zza);
    }

    public final void zzt(j1 j1Var) {
        this.zzf.set(j1Var);
    }
}
