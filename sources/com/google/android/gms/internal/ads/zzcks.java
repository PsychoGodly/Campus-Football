package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c2;
import com.google.android.gms.ads.internal.client.i4;
import com.google.android.gms.ads.internal.client.o1;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcks extends o1 {
    private final Context zza;
    private final zzbzg zzb;
    private final zzdnd zzc;
    private final zzeav zzd;
    private final zzegx zze;
    private final zzdrk zzf;
    private final zzbxf zzg;
    private final zzdni zzh;
    private final zzdsf zzi;
    private final zzbde zzj;
    private final zzfep zzk;
    private final zzezq zzl;
    private final zzbas zzm;
    private boolean zzn = false;

    zzcks(Context context, zzbzg zzbzg, zzdnd zzdnd, zzeav zzeav, zzegx zzegx, zzdrk zzdrk, zzbxf zzbxf, zzdni zzdni, zzdsf zzdsf, zzbde zzbde, zzfep zzfep, zzezq zzezq, zzbas zzbas) {
        this.zza = context;
        this.zzb = zzbzg;
        this.zzc = zzdnd;
        this.zzd = zzeav;
        this.zze = zzegx;
        this.zzf = zzdrk;
        this.zzg = zzbxf;
        this.zzh = zzdni;
        this.zzi = zzdsf;
        this.zzj = zzbde;
        this.zzk = zzfep;
        this.zzl = zzezq;
        this.zzm = zzbas;
    }

    /* access modifiers changed from: package-private */
    public final void zzb() {
        if (t.q().zzh().zzO()) {
            if (!t.u().j(this.zza, t.q().zzh().zzl(), this.zzb.zza)) {
                t.q().zzh().c(false);
                t.q().zzh().zzA(MaxReward.DEFAULT_LABEL);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Runnable runnable) {
        q.f("Adapters must be initialized on the main thread.");
        Map zze2 = t.q().zzh().zzh().zze();
        if (!zze2.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    zzbza.zzk("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            if (this.zzc.zzd()) {
                HashMap hashMap = new HashMap();
                for (zzbna zzbna : zze2.values()) {
                    for (zzbmz zzbmz : zzbna.zza) {
                        String str = zzbmz.zzk;
                        for (String str2 : zzbmz.zzc) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((List) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        zzeaw zza2 = this.zzd.zza(str3, jSONObject);
                        if (zza2 != null) {
                            zzezs zzezs = (zzezs) zza2.zzb;
                            if (!zzezs.zzC() && zzezs.zzB()) {
                                zzezs.zzj(this.zza, (zzecr) zza2.zzc, (List) entry.getValue());
                                zzbza.zze("Initialized rewarded video mediation adapter " + str3);
                            }
                        }
                    } catch (zzezc e10) {
                        zzbza.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e10);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        zzfaa.zzb(this.zza, true);
    }

    public final synchronized float zze() {
        return t.t().a();
    }

    public final String zzf() {
        return this.zzb.zza;
    }

    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    public final void zzh(String str) {
        this.zze.zzf(str);
    }

    public final void zzi() {
        this.zzf.zzl();
    }

    public final void zzj(boolean z10) throws RemoteException {
        try {
            zzfkw.zzi(this.zza).zzn(z10);
        } catch (IOException e10) {
            throw new RemoteException(e10.getMessage());
        }
    }

    public final synchronized void zzk() {
        if (this.zzn) {
            zzbza.zzj("Mobile ads is initialized already.");
            return;
        }
        zzbar.zzc(this.zza);
        this.zzm.zza();
        t.q().zzs(this.zza, this.zzb);
        t.e().zzi(this.zza);
        this.zzn = true;
        this.zzf.zzr();
        this.zze.zzd();
        if (((Boolean) a0.c().zzb(zzbar.zzdA)).booleanValue()) {
            this.zzh.zzc();
        }
        this.zzi.zzg();
        if (((Boolean) a0.c().zzb(zzbar.zziu)).booleanValue()) {
            zzbzn.zza.execute(new zzcko(this));
        }
        if (((Boolean) a0.c().zzb(zzbar.zzjk)).booleanValue()) {
            zzbzn.zza.execute(new zzckn(this));
        }
        if (((Boolean) a0.c().zzb(zzbar.zzcu)).booleanValue()) {
            zzbzn.zza.execute(new zzckp(this));
        }
    }

    public final void zzl(String str, a aVar) {
        String str2;
        zzckq zzckq;
        zzbar.zzc(this.zza);
        if (((Boolean) a0.c().zzb(zzbar.zzdE)).booleanValue()) {
            t.r();
            str2 = b2.M(this.zza);
        } else {
            str2 = MaxReward.DEFAULT_LABEL;
        }
        boolean z10 = true;
        String str3 = true == TextUtils.isEmpty(str2) ? str : str2;
        if (!TextUtils.isEmpty(str3)) {
            boolean booleanValue = ((Boolean) a0.c().zzb(zzbar.zzdz)).booleanValue();
            zzbaj zzbaj = zzbar.zzaK;
            boolean booleanValue2 = booleanValue | ((Boolean) a0.c().zzb(zzbaj)).booleanValue();
            if (((Boolean) a0.c().zzb(zzbaj)).booleanValue()) {
                zzckq = new zzckq(this, (Runnable) b.A1(aVar));
            } else {
                zzckq = null;
                z10 = booleanValue2;
            }
            zzckq zzckq2 = zzckq;
            if (z10) {
                t.c().a(this.zza, this.zzb, str3, zzckq2, this.zzk);
            }
        }
    }

    public final void zzm(c2 c2Var) throws RemoteException {
        this.zzi.zzh(c2Var, zzdse.API);
    }

    public final void zzn(a aVar, String str) {
        if (aVar == null) {
            zzbza.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) b.A1(aVar);
        if (context == null) {
            zzbza.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        com.google.android.gms.ads.internal.util.t tVar = new com.google.android.gms.ads.internal.util.t(context);
        tVar.n(str);
        tVar.o(this.zzb.zza);
        tVar.r();
    }

    public final void zzo(zzbnf zzbnf) throws RemoteException {
        this.zzl.zze(zzbnf);
    }

    public final synchronized void zzp(boolean z10) {
        t.t().c(z10);
    }

    public final synchronized void zzq(float f10) {
        t.t().d(f10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzr(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            android.content.Context r0 = r7.zza     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.zzbar.zzc(r0)     // Catch:{ all -> 0x0031 }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x002f
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzdz     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x0031 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x0031 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002f
            com.google.android.gms.ads.internal.e r1 = com.google.android.gms.ads.internal.t.c()     // Catch:{ all -> 0x0031 }
            android.content.Context r2 = r7.zza     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.zzbzg r3 = r7.zzb     // Catch:{ all -> 0x0031 }
            r5 = 0
            com.google.android.gms.internal.ads.zzfep r6 = r7.zzk     // Catch:{ all -> 0x0031 }
            r4 = r8
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0031 }
            monitor-exit(r7)
            return
        L_0x002f:
            monitor-exit(r7)
            return
        L_0x0031:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcks.zzr(java.lang.String):void");
    }

    public final void zzs(zzbjs zzbjs) throws RemoteException {
        this.zzf.zzs(zzbjs);
    }

    public final void zzt(String str) {
        if (((Boolean) a0.c().zzb(zzbar.zziD)).booleanValue()) {
            t.q().zzw(str);
        }
    }

    public final void zzu(i4 i4Var) throws RemoteException {
        this.zzg.zzq(this.zza, i4Var);
    }

    public final synchronized boolean zzv() {
        return t.t().e();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzw() {
        this.zzj.zza(new zzbsk());
    }
}
