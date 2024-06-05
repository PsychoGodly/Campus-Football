package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.e;
import t4.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcng implements zzatf, zzcvj, t, zzcvi {
    private final zzcnb zza;
    private final zzcnc zzb;
    private final Set zzc = new HashSet();
    private final zzbmr zzd;
    private final Executor zze;
    private final e zzf;
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcnf zzh = new zzcnf();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcng(zzbmo zzbmo, zzcnc zzcnc, Executor executor, zzcnb zzcnb, e eVar) {
        this.zza = zzcnb;
        zzblz zzblz = zzbmc.zza;
        this.zzd = zzbmo.zza("google.afma.activeView.handleUpdate", zzblz, zzblz);
        this.zzb = zzcnc;
        this.zze = executor;
        this.zzf = eVar;
    }

    private final void zzk() {
        for (zzcei zzf2 : this.zzc) {
            this.zza.zzf(zzf2);
        }
        this.zza.zze();
    }

    public final void zzb() {
    }

    public final synchronized void zzbF() {
        this.zzh.zzb = false;
        zzg();
    }

    public final synchronized void zzbn(Context context) {
        this.zzh.zze = "u";
        zzg();
        zzk();
        this.zzi = true;
    }

    public final synchronized void zzbo() {
        this.zzh.zzb = true;
        zzg();
    }

    public final synchronized void zzbp(Context context) {
        this.zzh.zzb = true;
        zzg();
    }

    public final synchronized void zzbq(Context context) {
        this.zzh.zzb = false;
        zzg();
    }

    public final void zzby() {
    }

    public final synchronized void zzc(zzate zzate) {
        zzcnf zzcnf = this.zzh;
        zzcnf.zza = zzate.zzj;
        zzcnf.zzf = zzate;
        zzg();
    }

    public final void zze() {
    }

    public final void zzf(int i10) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzg() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.ref.WeakReference r0 = r5.zzj     // Catch:{ all -> 0x0060 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x005b
            boolean r0 = r5.zzi     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x0059
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.zzg     // Catch:{ all -> 0x0060 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0059
            com.google.android.gms.internal.ads.zzcnf r0 = r5.zzh     // Catch:{ Exception -> 0x0051 }
            m5.e r1 = r5.zzf     // Catch:{ Exception -> 0x0051 }
            long r1 = r1.b()     // Catch:{ Exception -> 0x0051 }
            r0.zzd = r1     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.zzcnc r0 = r5.zzb     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.zzcnf r1 = r5.zzh     // Catch:{ Exception -> 0x0051 }
            org.json.JSONObject r0 = r0.zzb(r1)     // Catch:{ Exception -> 0x0051 }
            java.util.Set r1 = r5.zzc     // Catch:{ Exception -> 0x0051 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0051 }
        L_0x002d:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0051 }
            if (r2 == 0) goto L_0x0044
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.zzcei r2 = (com.google.android.gms.internal.ads.zzcei) r2     // Catch:{ Exception -> 0x0051 }
            java.util.concurrent.Executor r3 = r5.zze     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.zzcne r4 = new com.google.android.gms.internal.ads.zzcne     // Catch:{ Exception -> 0x0051 }
            r4.<init>(r2, r0)     // Catch:{ Exception -> 0x0051 }
            r3.execute(r4)     // Catch:{ Exception -> 0x0051 }
            goto L_0x002d
        L_0x0044:
            com.google.android.gms.internal.ads.zzbmr r1 = r5.zzd     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.zzfut r0 = r1.zzb(r0)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r1 = "ActiveViewListener.callActiveViewJs"
            com.google.android.gms.internal.ads.zzbzq.zzb(r0, r1)     // Catch:{ Exception -> 0x0051 }
            monitor-exit(r5)
            return
        L_0x0051:
            r0 = move-exception
            java.lang.String r1 = "Failed to call ActiveViewJS"
            com.google.android.gms.ads.internal.util.n1.b(r1, r0)     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)
            return
        L_0x0059:
            monitor-exit(r5)
            return
        L_0x005b:
            r5.zzj()     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)
            return
        L_0x0060:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcng.zzg():void");
    }

    public final synchronized void zzh(zzcei zzcei) {
        this.zzc.add(zzcei);
        this.zza.zzd(zzcei);
    }

    public final void zzi(Object obj) {
        this.zzj = new WeakReference(obj);
    }

    public final synchronized void zzj() {
        zzk();
        this.zzi = true;
    }

    public final synchronized void zzl() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zzc(this);
            zzg();
        }
    }
}
