package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.y0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzexz extends zzbuf {
    private final zzexp zza;
    private final zzexf zzb;
    /* access modifiers changed from: private */
    public final zzeyp zzc;
    /* access modifiers changed from: private */
    public zzdlu zzd;
    private boolean zze = false;

    public zzexz(zzexp zzexp, zzexf zzexf, zzeyp zzeyp) {
        this.zza = zzexp;
        this.zzb = zzexf;
        this.zzc = zzeyp;
    }

    private final synchronized boolean zzy() {
        zzdlu zzdlu;
        zzdlu = this.zzd;
        return zzdlu != null && !zzdlu.zze();
    }

    public final Bundle zzb() {
        q.f("getAdMetadata can only be called from the UI thread.");
        zzdlu zzdlu = this.zzd;
        return zzdlu != null ? zzdlu.zza() : new Bundle();
    }

    public final synchronized p2 zzc() throws RemoteException {
        if (!((Boolean) a0.c().zzb(zzbar.zzgp)).booleanValue()) {
            return null;
        }
        zzdlu zzdlu = this.zzd;
        if (zzdlu == null) {
            return null;
        }
        return zzdlu.zzl();
    }

    public final synchronized String zzd() throws RemoteException {
        zzdlu zzdlu = this.zzd;
        if (zzdlu == null || zzdlu.zzl() == null) {
            return null;
        }
        return zzdlu.zzl().zzg();
    }

    public final void zze() throws RemoteException {
        zzf((a) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.content.Context} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzf(com.google.android.gms.dynamic.a r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.q.f(r0)     // Catch:{ all -> 0x0027 }
            com.google.android.gms.internal.ads.zzexf r0 = r2.zzb     // Catch:{ all -> 0x0027 }
            r1 = 0
            r0.zzb(r1)     // Catch:{ all -> 0x0027 }
            com.google.android.gms.internal.ads.zzdlu r0 = r2.zzd     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0025
            if (r3 != 0) goto L_0x0013
            goto L_0x001a
        L_0x0013:
            java.lang.Object r3 = com.google.android.gms.dynamic.b.A1(r3)     // Catch:{ all -> 0x0027 }
            r1 = r3
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ all -> 0x0027 }
        L_0x001a:
            com.google.android.gms.internal.ads.zzdlu r3 = r2.zzd     // Catch:{ all -> 0x0027 }
            com.google.android.gms.internal.ads.zzcvn r3 = r3.zzm()     // Catch:{ all -> 0x0027 }
            r3.zza(r1)     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)
            return
        L_0x0025:
            monitor-exit(r2)
            return
        L_0x0027:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzexz.zzf(com.google.android.gms.dynamic.a):void");
    }

    public final synchronized void zzg(zzbuk zzbuk) throws RemoteException {
        q.f("loadAd must be called on the main UI thread.");
        String str = zzbuk.zzb;
        String str2 = (String) a0.c().zzb(zzbar.zzeV);
        if (!(str2 == null || str == null)) {
            try {
                if (Pattern.matches(str2, str)) {
                    return;
                }
            } catch (RuntimeException e10) {
                t.q().zzu(e10, "NonagonUtil.isPatternMatched");
            }
        }
        if (zzy()) {
            if (!((Boolean) a0.c().zzb(zzbar.zzeX)).booleanValue()) {
                return;
            }
        }
        zzexh zzexh = new zzexh((String) null);
        this.zzd = null;
        this.zza.zzj(1);
        this.zza.zzb(zzbuk.zza, zzbuk.zzb, zzexh, new zzexx(this));
    }

    public final void zzh() {
        zzi((a) null);
    }

    public final synchronized void zzi(a aVar) {
        Context context;
        q.f("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            if (aVar == null) {
                context = null;
            } else {
                context = (Context) b.A1(aVar);
            }
            this.zzd.zzm().zzb(context);
        }
    }

    public final void zzj() {
        zzk((a) null);
    }

    public final synchronized void zzk(a aVar) {
        Context context;
        q.f("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            if (aVar == null) {
                context = null;
            } else {
                context = (Context) b.A1(aVar);
            }
            this.zzd.zzm().zzc(context);
        }
    }

    public final void zzl(y0 y0Var) {
        q.f("setAdMetadataListener can only be called from the UI thread.");
        if (y0Var == null) {
            this.zzb.zzb((a5.a) null);
        } else {
            this.zzb.zzb(new zzexy(this, y0Var));
        }
    }

    public final synchronized void zzm(String str) throws RemoteException {
        q.f("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    public final synchronized void zzn(boolean z10) {
        q.f("setImmersiveMode must be called on the main UI thread.");
        this.zze = z10;
    }

    public final void zzo(zzbuj zzbuj) throws RemoteException {
        q.f("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzf(zzbuj);
    }

    public final synchronized void zzp(String str) throws RemoteException {
        q.f("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    public final synchronized void zzq() throws RemoteException {
        zzr((a) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.app.Activity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzr(com.google.android.gms.dynamic.a r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "showAd must be called on the main UI thread."
            com.google.android.gms.common.internal.q.f(r0)     // Catch:{ all -> 0x0024 }
            com.google.android.gms.internal.ads.zzdlu r0 = r2.zzd     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            r0 = 0
            if (r3 != 0) goto L_0x000e
            goto L_0x0019
        L_0x000e:
            java.lang.Object r3 = com.google.android.gms.dynamic.b.A1(r3)     // Catch:{ all -> 0x0024 }
            boolean r1 = r3 instanceof android.app.Activity     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0019
            r0 = r3
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ all -> 0x0024 }
        L_0x0019:
            com.google.android.gms.internal.ads.zzdlu r3 = r2.zzd     // Catch:{ all -> 0x0024 }
            boolean r1 = r2.zze     // Catch:{ all -> 0x0024 }
            r3.zzh(r1, r0)     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0022:
            monitor-exit(r2)
            return
        L_0x0024:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzexz.zzr(com.google.android.gms.dynamic.a):void");
    }

    public final boolean zzs() throws RemoteException {
        q.f("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    public final boolean zzt() {
        zzdlu zzdlu = this.zzd;
        return zzdlu != null && zzdlu.zzg();
    }

    public final void zzu(zzbue zzbue) {
        q.f("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzg(zzbue);
    }
}
