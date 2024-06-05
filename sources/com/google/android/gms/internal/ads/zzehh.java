package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
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
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzehh extends t0 implements zzcxe {
    private final Context zza;
    private final zzeuo zzb;
    private final String zzc;
    private final zzeib zzd;
    private z4 zze;
    private final zzeyv zzf;
    private final zzbzg zzg;
    /* access modifiers changed from: private */
    public zzcok zzh;

    public zzehh(Context context, z4 z4Var, String str, zzeuo zzeuo, zzeib zzeib, zzbzg zzbzg) {
        this.zza = context;
        this.zzb = zzeuo;
        this.zze = z4Var;
        this.zzc = str;
        this.zzd = zzeib;
        this.zzf = zzeuo.zzi();
        this.zzg = zzbzg;
        zzeuo.zzp(this);
    }

    private final synchronized void zze(z4 z4Var) {
        this.zzf.zzr(z4Var);
        this.zzf.zzw(this.zze.f14659o);
    }

    private final synchronized boolean zzf(u4 u4Var) throws RemoteException {
        if (zzh()) {
            q.f("loadAd must be called on the main UI thread.");
        }
        t.r();
        if (!b2.d(this.zza) || u4Var.f14569t != null) {
            zzezr.zza(this.zza, u4Var.f14556g);
            return this.zzb.zzb(u4Var, this.zzc, (zzeip) null, new zzehg(this));
        }
        zzbza.zzg("Failed to load the ad because app ID is missing.");
        zzeib zzeib = this.zzd;
        if (zzeib != null) {
            zzeib.zza(zzezx.zzd(4, (String) null, (c3) null));
        }
        return false;
    }

    private final boolean zzh() {
        boolean z10;
        if (((Boolean) zzbci.zzf.zze()).booleanValue()) {
            if (((Boolean) a0.c().zzb(zzbar.zzjw)).booleanValue()) {
                z10 = true;
                return this.zzg.zzc >= ((Integer) a0.c().zzb(zzbar.zzjx)).intValue() || !z10;
            }
        }
        z10 = false;
        if (this.zzg.zzc >= ((Integer) a0.c().zzb(zzbar.zzjx)).intValue()) {
        }
    }

    public final synchronized void zzA() {
        q.f("recordManualImpression must be called on the main UI thread.");
        zzcok zzcok = this.zzh;
        if (zzcok != null) {
            zzcok.zzg();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r3.zzg.zzc < ((java.lang.Integer) com.google.android.gms.ads.internal.client.a0.c().zzb(com.google.android.gms.internal.ads.zzbar.zzjy)).intValue()) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzB() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbbw r0 = com.google.android.gms.internal.ads.zzbci.zzh     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzjs     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzbzg r0 = r3.zzg     // Catch:{ all -> 0x004c }
            int r0 = r0.zzc     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbaj r1 = com.google.android.gms.internal.ads.zzbar.zzjy     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbap r2 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ all -> 0x004c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x004c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x004c }
            if (r0 >= r1) goto L_0x003c
        L_0x0037:
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.google.android.gms.common.internal.q.f(r0)     // Catch:{ all -> 0x004c }
        L_0x003c:
            com.google.android.gms.internal.ads.zzcok r0 = r3.zzh     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.zzcvn r0 = r0.zzm()     // Catch:{ all -> 0x004c }
            r1 = 0
            r0.zzc(r1)     // Catch:{ all -> 0x004c }
            monitor-exit(r3)
            return
        L_0x004a:
            monitor-exit(r3)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzehh.zzB():void");
    }

    public final void zzC(e0 e0Var) {
        if (zzh()) {
            q.f("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzo(e0Var);
    }

    public final void zzD(h0 h0Var) {
        if (zzh()) {
            q.f("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zze(h0Var);
    }

    public final void zzE(y0 y0Var) {
        q.f("setAdMetadataListener must be called on the main UI thread.");
    }

    public final synchronized void zzF(z4 z4Var) {
        q.f("setAdSize must be called on the main UI thread.");
        this.zzf.zzr(z4Var);
        this.zze = z4Var;
        zzcok zzcok = this.zzh;
        if (zzcok != null) {
            zzcok.zzh(this.zzb.zzd(), z4Var);
        }
    }

    public final void zzG(c1 c1Var) {
        if (zzh()) {
            q.f("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzi(c1Var);
    }

    public final void zzH(zzavb zzavb) {
    }

    public final void zzI(f5 f5Var) {
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
        if (zzh()) {
            q.f("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.zzf.zzy(z10);
    }

    public final synchronized void zzO(zzbbp zzbbp) {
        q.f("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zzq(zzbbp);
    }

    public final void zzP(i2 i2Var) {
        if (zzh()) {
            q.f("setPaidEventListener must be called on the main UI thread.");
        }
        this.zzd.zzg(i2Var);
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
        if (zzh()) {
            q.f("setVideoOptions must be called on the main UI thread.");
        }
        this.zzf.zzF(n4Var);
    }

    public final void zzW(a aVar) {
    }

    public final void zzX() {
    }

    public final synchronized boolean zzY() {
        return this.zzb.zza();
    }

    public final boolean zzZ() {
        return false;
    }

    public final synchronized void zza() {
        if (this.zzb.zzr()) {
            z4 zzg2 = this.zzf.zzg();
            zzcok zzcok = this.zzh;
            if (!(zzcok == null || zzcok.zzf() == null || !this.zzf.zzO())) {
                zzg2 = zzezb.zza(this.zza, Collections.singletonList(this.zzh.zzf()));
            }
            zze(zzg2);
            try {
                zzf(this.zzf.zze());
            } catch (RemoteException unused) {
                zzbza.zzj("Failed to refresh the banner ad.");
            }
        } else {
            this.zzb.zzn();
        }
    }

    public final synchronized boolean zzaa(u4 u4Var) throws RemoteException {
        zze(this.zze);
        return zzf(u4Var);
    }

    public final synchronized void zzab(g1 g1Var) {
        q.f("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzQ(g1Var);
    }

    public final Bundle zzd() {
        q.f("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final synchronized z4 zzg() {
        q.f("getAdSize must be called on the main UI thread.");
        zzcok zzcok = this.zzh;
        if (zzcok != null) {
            return zzezb.zza(this.zza, Collections.singletonList(zzcok.zze()));
        }
        return this.zzf.zzg();
    }

    public final h0 zzi() {
        return this.zzd.zzc();
    }

    public final c1 zzj() {
        return this.zzd.zzd();
    }

    public final synchronized p2 zzk() {
        if (!((Boolean) a0.c().zzb(zzbar.zzgp)).booleanValue()) {
            return null;
        }
        zzcok zzcok = this.zzh;
        if (zzcok == null) {
            return null;
        }
        return zzcok.zzl();
    }

    public final synchronized s2 zzl() {
        q.f("getVideoController must be called from the main thread.");
        zzcok zzcok = this.zzh;
        if (zzcok == null) {
            return null;
        }
        return zzcok.zzd();
    }

    public final a zzn() {
        if (zzh()) {
            q.f("getAdFrame must be called on the main UI thread.");
        }
        return b.B1(this.zzb.zzd());
    }

    public final synchronized String zzr() {
        return this.zzc;
    }

    public final synchronized String zzs() {
        zzcok zzcok = this.zzh;
        if (zzcok == null || zzcok.zzl() == null) {
            return null;
        }
        return zzcok.zzl().zzg();
    }

    public final synchronized String zzt() {
        zzcok zzcok = this.zzh;
        if (zzcok == null || zzcok.zzl() == null) {
            return null;
        }
        return zzcok.zzl().zzg();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r3.zzg.zzc < ((java.lang.Integer) com.google.android.gms.ads.internal.client.a0.c().zzb(com.google.android.gms.internal.ads.zzbar.zzjy)).intValue()) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzx() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbbw r0 = com.google.android.gms.internal.ads.zzbci.zze     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x0047 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzjt     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x0047 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzbzg r0 = r3.zzg     // Catch:{ all -> 0x0047 }
            int r0 = r0.zzc     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.zzbaj r1 = com.google.android.gms.internal.ads.zzbar.zzjy     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.zzbap r2 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x0047 }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ all -> 0x0047 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0047 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0047 }
            if (r0 >= r1) goto L_0x003c
        L_0x0037:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.q.f(r0)     // Catch:{ all -> 0x0047 }
        L_0x003c:
            com.google.android.gms.internal.ads.zzcok r0 = r3.zzh     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0045
            r0.zzb()     // Catch:{ all -> 0x0047 }
            monitor-exit(r3)
            return
        L_0x0045:
            monitor-exit(r3)
            return
        L_0x0047:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzehh.zzx():void");
    }

    public final void zzy(u4 u4Var, k0 k0Var) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r3.zzg.zzc < ((java.lang.Integer) com.google.android.gms.ads.internal.client.a0.c().zzb(com.google.android.gms.internal.ads.zzbar.zzjy)).intValue()) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzz() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbbw r0 = com.google.android.gms.internal.ads.zzbci.zzg     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzju     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzbzg r0 = r3.zzg     // Catch:{ all -> 0x004c }
            int r0 = r0.zzc     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbaj r1 = com.google.android.gms.internal.ads.zzbar.zzjy     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbap r2 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ all -> 0x004c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x004c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x004c }
            if (r0 >= r1) goto L_0x003c
        L_0x0037:
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.google.android.gms.common.internal.q.f(r0)     // Catch:{ all -> 0x004c }
        L_0x003c:
            com.google.android.gms.internal.ads.zzcok r0 = r3.zzh     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.zzcvn r0 = r0.zzm()     // Catch:{ all -> 0x004c }
            r1 = 0
            r0.zzb(r1)     // Catch:{ all -> 0x004c }
            monitor-exit(r3)
            return
        L_0x004a:
            monitor-exit(r3)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzehh.zzz():void");
    }
}
