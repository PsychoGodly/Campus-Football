package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.c1;
import com.google.android.gms.ads.internal.client.e0;
import com.google.android.gms.ads.internal.client.f5;
import com.google.android.gms.ads.internal.client.g1;
import com.google.android.gms.ads.internal.client.h0;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.ads.internal.client.j1;
import com.google.android.gms.ads.internal.client.k0;
import com.google.android.gms.ads.internal.client.n4;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.t0;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.w2;
import com.google.android.gms.ads.internal.client.y0;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamic.a;
import java.util.concurrent.atomic.AtomicBoolean;
import t4.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeui extends t0 implements t, zzaus {
    protected zzcoe zza;
    private final zzcgd zzb;
    private final Context zzc;
    private AtomicBoolean zzd = new AtomicBoolean();
    private final String zze;
    private final zzeuc zzf;
    /* access modifiers changed from: private */
    public final zzeua zzg;
    private final zzbzg zzh;
    private long zzi = -1;
    private zzcns zzj;

    public zzeui(zzcgd zzcgd, Context context, String str, zzeuc zzeuc, zzeua zzeua, zzbzg zzbzg) {
        this.zzb = zzcgd;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzeuc;
        this.zzg = zzeua;
        this.zzh = zzbzg;
        zzeua.zzn(this);
    }

    private final synchronized void zzp(int i10) {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzg.zzj();
            zzcns zzcns = this.zzj;
            if (zzcns != null) {
                com.google.android.gms.ads.internal.t.d().zze(zzcns);
            }
            if (this.zza != null) {
                long j10 = -1;
                if (this.zzi != -1) {
                    j10 = com.google.android.gms.ads.internal.t.b().b() - this.zzi;
                }
                this.zza.zze(j10, i10);
            }
            zzx();
        }
    }

    public final synchronized void zzA() {
    }

    public final synchronized void zzB() {
        q.f("resume must be called on the main UI thread.");
    }

    public final void zzC(e0 e0Var) {
    }

    public final void zzD(h0 h0Var) {
    }

    public final void zzE(y0 y0Var) {
    }

    public final synchronized void zzF(z4 z4Var) {
        q.f("setAdSize must be called on the main UI thread.");
    }

    public final void zzG(c1 c1Var) {
    }

    public final void zzH(zzavb zzavb) {
        this.zzg.zzp(zzavb);
    }

    public final void zzI(f5 f5Var) {
        this.zzf.zzl(f5Var);
    }

    public final void zzJ(j1 j1Var) {
    }

    public final void zzK(w2 w2Var) {
    }

    public final void zzL(boolean z10) {
    }

    public final void zzM(zzbrl zzbrl) {
    }

    public final synchronized void zzN(boolean z10) {
    }

    public final synchronized void zzO(zzbbp zzbbp) {
    }

    public final void zzP(i2 i2Var) {
    }

    public final void zzQ(zzbro zzbro, String str) {
    }

    public final void zzR(String str) {
    }

    public final void zzS(zzbuj zzbuj) {
    }

    public final void zzT(String str) {
    }

    public final synchronized void zzU(n4 n4Var) {
    }

    public final void zzW(a aVar) {
    }

    public final synchronized void zzX() {
    }

    public final synchronized boolean zzY() {
        return this.zzf.zza();
    }

    public final boolean zzZ() {
        return false;
    }

    public final void zza() {
        zzp(3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c A[SYNTHETIC, Splitter:B:25:0x006c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.u4 r6) throws android.os.RemoteException {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzbbw r0 = com.google.android.gms.internal.ads.zzbci.zzd     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x0087 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0087 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0087 }
            r1 = 0
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzjw     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzbap r2 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r2.zzb(r0)     // Catch:{ all -> 0x0087 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0087 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            com.google.android.gms.internal.ads.zzbzg r2 = r5.zzh     // Catch:{ all -> 0x0087 }
            int r2 = r2.zzc     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzbaj r3 = com.google.android.gms.internal.ads.zzbar.zzjx     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzbap r4 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x0087 }
            java.lang.Object r3 = r4.zzb(r3)     // Catch:{ all -> 0x0087 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0087 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0087 }
            if (r2 < r3) goto L_0x003d
            if (r0 != 0) goto L_0x0042
        L_0x003d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.q.f(r0)     // Catch:{ all -> 0x0087 }
        L_0x0042:
            com.google.android.gms.ads.internal.t.r()     // Catch:{ all -> 0x0087 }
            android.content.Context r0 = r5.zzc     // Catch:{ all -> 0x0087 }
            boolean r0 = com.google.android.gms.ads.internal.util.b2.d(r0)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0064
            com.google.android.gms.ads.internal.client.a1 r0 = r6.f14569t     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0052
            goto L_0x0064
        L_0x0052:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.zzbza.zzg(r6)     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzeua r6 = r5.zzg     // Catch:{ all -> 0x0087 }
            r0 = 4
            r2 = 0
            com.google.android.gms.ads.internal.client.c3 r0 = com.google.android.gms.internal.ads.zzezx.zzd(r0, r2, r2)     // Catch:{ all -> 0x0087 }
            r6.zza(r0)     // Catch:{ all -> 0x0087 }
            monitor-exit(r5)
            return r1
        L_0x0064:
            boolean r0 = r5.zzY()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x006c
            monitor-exit(r5)
            return r1
        L_0x006c:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0087 }
            r0.<init>()     // Catch:{ all -> 0x0087 }
            r5.zzd = r0     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzeug r0 = new com.google.android.gms.internal.ads.zzeug     // Catch:{ all -> 0x0087 }
            r0.<init>(r5)     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzeuc r1 = r5.zzf     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = r5.zze     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzeuh r3 = new com.google.android.gms.internal.ads.zzeuh     // Catch:{ all -> 0x0087 }
            r3.<init>(r5)     // Catch:{ all -> 0x0087 }
            boolean r6 = r1.zzb(r6, r2, r0, r3)     // Catch:{ all -> 0x0087 }
            monitor-exit(r5)
            return r6
        L_0x0087:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeui.zzaa(com.google.android.gms.ads.internal.client.u4):boolean");
    }

    public final synchronized void zzab(g1 g1Var) {
    }

    public final synchronized void zzb() {
        if (this.zza != null) {
            this.zzi = com.google.android.gms.ads.internal.t.b().b();
            int zza2 = this.zza.zza();
            if (zza2 > 0) {
                zzcns zzcns = new zzcns(this.zzb.zzB(), com.google.android.gms.ads.internal.t.b());
                this.zzj = zzcns;
                zzcns.zzd(zza2, new zzeuf(this));
            }
        }
    }

    public final void zzbF() {
    }

    public final void zzbo() {
    }

    public final void zzby() {
    }

    public final Bundle zzd() {
        return new Bundle();
    }

    public final synchronized void zze() {
        zzcoe zzcoe = this.zza;
        if (zzcoe != null) {
            zzcoe.zze(com.google.android.gms.ads.internal.t.b().b() - this.zzi, 1);
        }
    }

    public final void zzf(int i10) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 == 0) {
                zzp(2);
            } else if (i11 == 1) {
                zzp(4);
            } else if (i11 != 2) {
                zzp(6);
            } else {
                zzp(3);
            }
        } else {
            throw null;
        }
    }

    public final synchronized z4 zzg() {
        return null;
    }

    public final h0 zzi() {
        return null;
    }

    public final c1 zzj() {
        return null;
    }

    public final synchronized p2 zzk() {
        return null;
    }

    public final synchronized s2 zzl() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        zzp(5);
    }

    public final a zzn() {
        return null;
    }

    public final void zzo() {
        this.zzb.zzA().execute(new zzeue(this));
    }

    public final synchronized String zzr() {
        return this.zze;
    }

    public final synchronized String zzs() {
        return null;
    }

    public final synchronized String zzt() {
        return null;
    }

    public final synchronized void zzx() {
        q.f("destroy must be called on the main UI thread.");
        zzcoe zzcoe = this.zza;
        if (zzcoe != null) {
            zzcoe.zzb();
        }
    }

    public final void zzy(u4 u4Var, k0 k0Var) {
    }

    public final synchronized void zzz() {
        q.f("pause must be called on the main UI thread.");
    }
}
