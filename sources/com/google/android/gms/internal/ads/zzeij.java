package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c1;
import com.google.android.gms.ads.internal.client.c3;
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
import com.google.android.gms.dynamic.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeij extends t0 {
    private final z4 zza;
    private final Context zzb;
    private final zzewf zzc;
    private final String zzd;
    private final zzbzg zze;
    private final zzeib zzf;
    private final zzexf zzg;
    private final zzapw zzh;
    /* access modifiers changed from: private */
    public zzdcv zzi;
    private boolean zzj = ((Boolean) a0.c().zzb(zzbar.zzaA)).booleanValue();

    public zzeij(Context context, z4 z4Var, String str, zzewf zzewf, zzeib zzeib, zzexf zzexf, zzbzg zzbzg, zzapw zzapw) {
        this.zza = z4Var;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzewf;
        this.zzf = zzeib;
        this.zzg = zzexf;
        this.zze = zzbzg;
        this.zzh = zzapw;
    }

    private final synchronized boolean zze() {
        zzdcv zzdcv;
        zzdcv = this.zzi;
        return zzdcv != null && !zzdcv.zza();
    }

    public final void zzA() {
    }

    public final synchronized void zzB() {
        q.f("resume must be called on the main UI thread.");
        zzdcv zzdcv = this.zzi;
        if (zzdcv != null) {
            zzdcv.zzm().zzc((Context) null);
        }
    }

    public final void zzC(e0 e0Var) {
    }

    public final void zzD(h0 h0Var) {
        q.f("setAdListener must be called on the main UI thread.");
        this.zzf.zze(h0Var);
    }

    public final void zzE(y0 y0Var) {
        q.f("setAdMetadataListener must be called on the main UI thread.");
    }

    public final void zzF(z4 z4Var) {
    }

    public final void zzG(c1 c1Var) {
        q.f("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzi(c1Var);
    }

    public final void zzH(zzavb zzavb) {
    }

    public final void zzI(f5 f5Var) {
    }

    public final void zzJ(j1 j1Var) {
        this.zzf.zzt(j1Var);
    }

    public final void zzK(w2 w2Var) {
    }

    public final synchronized void zzL(boolean z10) {
        q.f("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z10;
    }

    public final void zzM(zzbrl zzbrl) {
    }

    public final void zzN(boolean z10) {
    }

    public final synchronized void zzO(zzbbp zzbbp) {
        q.f("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzi(zzbbp);
    }

    public final void zzP(i2 i2Var) {
        q.f("setPaidEventListener must be called on the main UI thread.");
        this.zzf.zzg(i2Var);
    }

    public final void zzQ(zzbro zzbro, String str) {
    }

    public final void zzR(String str) {
    }

    public final void zzS(zzbuj zzbuj) {
        this.zzg.zzf(zzbuj);
    }

    public final void zzT(String str) {
    }

    public final void zzU(n4 n4Var) {
    }

    public final synchronized void zzW(a aVar) {
        if (this.zzi == null) {
            zzbza.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzk(zzezx.zzd(9, (String) null, (c3) null));
            return;
        }
        if (((Boolean) a0.c().zzb(zzbar.zzcn)).booleanValue()) {
            this.zzh.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzi.zzc(this.zzj, (Activity) b.A1(aVar));
    }

    public final synchronized void zzX() {
        q.f("showInterstitial must be called on the main UI thread.");
        if (this.zzi == null) {
            zzbza.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzk(zzezx.zzd(9, (String) null, (c3) null));
            return;
        }
        if (((Boolean) a0.c().zzb(zzbar.zzcn)).booleanValue()) {
            this.zzh.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzi.zzc(this.zzj, (Activity) null);
    }

    public final synchronized boolean zzY() {
        return this.zzc.zza();
    }

    public final synchronized boolean zzZ() {
        q.f("isLoaded must be called on the main UI thread.");
        return zze();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065 A[SYNTHETIC, Splitter:B:21:0x0065] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.u4 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzbbw r0 = com.google.android.gms.internal.ads.zzbci.zzi     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x008c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x008c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x008c }
            r1 = 0
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzjw     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzbap r2 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r2.zzb(r0)     // Catch:{ all -> 0x008c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x008c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            com.google.android.gms.internal.ads.zzbzg r2 = r5.zze     // Catch:{ all -> 0x008c }
            int r2 = r2.zzc     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzbaj r3 = com.google.android.gms.internal.ads.zzbar.zzjx     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzbap r4 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x008c }
            java.lang.Object r3 = r4.zzb(r3)     // Catch:{ all -> 0x008c }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x008c }
            int r3 = r3.intValue()     // Catch:{ all -> 0x008c }
            if (r2 < r3) goto L_0x003d
            if (r0 != 0) goto L_0x0042
        L_0x003d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.q.f(r0)     // Catch:{ all -> 0x008c }
        L_0x0042:
            com.google.android.gms.ads.internal.t.r()     // Catch:{ all -> 0x008c }
            android.content.Context r0 = r5.zzb     // Catch:{ all -> 0x008c }
            boolean r0 = com.google.android.gms.ads.internal.util.b2.d(r0)     // Catch:{ all -> 0x008c }
            r2 = 0
            if (r0 == 0) goto L_0x0065
            com.google.android.gms.ads.internal.client.a1 r0 = r6.f14569t     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x0065
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.zzbza.zzg(r6)     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzeib r6 = r5.zzf     // Catch:{ all -> 0x008c }
            if (r6 == 0) goto L_0x0063
            r0 = 4
            com.google.android.gms.ads.internal.client.c3 r0 = com.google.android.gms.internal.ads.zzezx.zzd(r0, r2, r2)     // Catch:{ all -> 0x008c }
            r6.zza(r0)     // Catch:{ all -> 0x008c }
        L_0x0063:
            monitor-exit(r5)
            return r1
        L_0x0065:
            boolean r0 = r5.zze()     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x006d
            monitor-exit(r5)
            return r1
        L_0x006d:
            android.content.Context r0 = r5.zzb     // Catch:{ all -> 0x008c }
            boolean r1 = r6.f14556g     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzezr.zza(r0, r1)     // Catch:{ all -> 0x008c }
            r5.zzi = r2     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzewf r0 = r5.zzc     // Catch:{ all -> 0x008c }
            java.lang.String r1 = r5.zzd     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzevy r2 = new com.google.android.gms.internal.ads.zzevy     // Catch:{ all -> 0x008c }
            com.google.android.gms.ads.internal.client.z4 r3 = r5.zza     // Catch:{ all -> 0x008c }
            r2.<init>(r3)     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzeii r3 = new com.google.android.gms.internal.ads.zzeii     // Catch:{ all -> 0x008c }
            r3.<init>(r5)     // Catch:{ all -> 0x008c }
            boolean r6 = r0.zzb(r6, r1, r2, r3)     // Catch:{ all -> 0x008c }
            monitor-exit(r5)
            return r6
        L_0x008c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeij.zzaa(com.google.android.gms.ads.internal.client.u4):boolean");
    }

    public final void zzab(g1 g1Var) {
    }

    public final Bundle zzd() {
        q.f("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final z4 zzg() {
        return null;
    }

    public final h0 zzi() {
        return this.zzf.zzc();
    }

    public final c1 zzj() {
        return this.zzf.zzd();
    }

    public final synchronized p2 zzk() {
        if (!((Boolean) a0.c().zzb(zzbar.zzgp)).booleanValue()) {
            return null;
        }
        zzdcv zzdcv = this.zzi;
        if (zzdcv == null) {
            return null;
        }
        return zzdcv.zzl();
    }

    public final s2 zzl() {
        return null;
    }

    public final a zzn() {
        return null;
    }

    public final synchronized String zzr() {
        return this.zzd;
    }

    public final synchronized String zzs() {
        zzdcv zzdcv = this.zzi;
        if (zzdcv == null || zzdcv.zzl() == null) {
            return null;
        }
        return zzdcv.zzl().zzg();
    }

    public final synchronized String zzt() {
        zzdcv zzdcv = this.zzi;
        if (zzdcv == null || zzdcv.zzl() == null) {
            return null;
        }
        return zzdcv.zzl().zzg();
    }

    public final synchronized void zzx() {
        q.f("destroy must be called on the main UI thread.");
        zzdcv zzdcv = this.zzi;
        if (zzdcv != null) {
            zzdcv.zzm().zza((Context) null);
        }
    }

    public final void zzy(u4 u4Var, k0 k0Var) {
        this.zzf.zzf(k0Var);
        zzaa(u4Var);
    }

    public final synchronized void zzz() {
        q.f("pause must be called on the main UI thread.");
        zzdcv zzdcv = this.zzi;
        if (zzdcv != null) {
            zzdcv.zzm().zzb((Context) null);
        }
    }
}
