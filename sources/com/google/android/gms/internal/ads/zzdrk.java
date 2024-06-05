package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.n1;
import com.unity3d.ads.core.domain.InitializeAndroidBoldSDK;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdrk {
    private boolean zza = false;
    private boolean zzb = false;
    /* access modifiers changed from: private */
    public boolean zzc = false;
    /* access modifiers changed from: private */
    public final long zzd;
    /* access modifiers changed from: private */
    public final zzbzs zze = new zzbzs();
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdnd zzh;
    /* access modifiers changed from: private */
    public final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    /* access modifiers changed from: private */
    public final zzdpr zzl;
    private final zzbzg zzm;
    private final Map zzn = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    public final zzdbf zzo;
    /* access modifiers changed from: private */
    public final zzfep zzp;
    private boolean zzq = true;

    public zzdrk(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdnd zzdnd, ScheduledExecutorService scheduledExecutorService, zzdpr zzdpr, zzbzg zzbzg, zzdbf zzdbf, zzfep zzfep) {
        this.zzh = zzdnd;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdpr;
        this.zzm = zzbzg;
        this.zzo = zzdbf;
        this.zzp = zzfep;
        this.zzd = t.b().b();
        zzv("com.google.android.gms.ads.MobileAds", false, MaxReward.DEFAULT_LABEL, 0);
    }

    static /* bridge */ /* synthetic */ void zzj(zzdrk zzdrk, String str) {
        zzdrk zzdrk2 = zzdrk;
        int i10 = 5;
        zzfec zza2 = zzfeb.zza(zzdrk2.zzf, 5);
        zza2.zzh();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                zzfec zza3 = zzfeb.zza(zzdrk2.zzf, i10);
                zza3.zzh();
                zza3.zzd(next);
                Object obj = new Object();
                zzbzs zzbzs = new zzbzs();
                zzfut zzn2 = zzfuj.zzn(zzbzs, ((Long) a0.c().zzb(zzbar.zzbE)).longValue(), TimeUnit.SECONDS, zzdrk2.zzk);
                zzdrk2.zzl.zzc(next);
                zzdrk2.zzo.zzc(next);
                long b10 = t.b().b();
                zzdrb zzdrb = r1;
                zzfut zzfut = zzn2;
                zzdrb zzdrb2 = new zzdrb(zzdrk, obj, zzbzs, next, b10, zza3);
                zzfut.zzc(zzdrb, zzdrk2.zzi);
                arrayList.add(zzfut);
                zzdrj zzdrj = new zzdrj(zzdrk, obj, next, b10, zza3, zzbzs);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray(JsonStorageKeyNames.DATA_KEY);
                        int i11 = 0;
                        while (i11 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                            String optString = jSONObject2.optString("format", MaxReward.DEFAULT_LABEL);
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject(JsonStorageKeyNames.DATA_KEY);
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, MaxReward.DEFAULT_LABEL));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzbjv(optString, bundle));
                            i11++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdrk2.zzv(next, false, MaxReward.DEFAULT_LABEL, 0);
                try {
                    zzdrk2.zzj.execute(new zzdrf(zzdrk, zzdrk2.zzh.zzc(next, new JSONObject()), zzdrj, arrayList2, next));
                } catch (zzezc unused2) {
                    try {
                        zzdrj.zze("Failed to create Adapter.");
                    } catch (RemoteException e10) {
                        zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
                    }
                }
                i10 = 5;
            }
            zzfuj.zza(arrayList).zza(new zzdrc(zzdrk2, zza2), zzdrk2.zzi);
        } catch (JSONException e11) {
            n1.b("Malformed CLD response", e11);
            zzdrk2.zzo.zza("MalformedJson");
            zzdrk2.zzl.zza("MalformedJson");
            zzdrk2.zze.zze(e11);
            t.q().zzu(e11, "AdapterInitializer.updateAdapterStatus");
            zzfep zzfep = zzdrk2.zzp;
            zza2.zzg(e11);
            zza2.zzf(false);
            zzfep.zzb(zza2.zzl());
        }
    }

    private final synchronized zzfut zzu() {
        String zzc2 = t.q().zzh().zzh().zzc();
        if (!TextUtils.isEmpty(zzc2)) {
            return zzfuj.zzh(zzc2);
        }
        zzbzs zzbzs = new zzbzs();
        t.q().zzh().a(new zzdrg(this, zzbzs));
        return zzbzs;
    }

    /* access modifiers changed from: private */
    public final void zzv(String str, boolean z10, String str2, int i10) {
        this.zzn.put(str, new zzbjl(str, z10, i10, str2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzf(zzfec zzfec) throws Exception {
        this.zze.zzd(Boolean.TRUE);
        zzfep zzfep = this.zzp;
        zzfec.zzf(true);
        zzfep.zzb(zzfec.zzl());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbjl zzbjl = (zzbjl) this.zzn.get(str);
            arrayList.add(new zzbjl(str, zzbjl.zzb, zzbjl.zzc, zzbjl.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        synchronized (this) {
            if (!this.zzc) {
                zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (t.b().b() - this.zzd));
                this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                this.zze.zze(new Exception());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        com.google.android.gms.internal.ads.zzbza.zzh(com.applovin.mediation.MaxReward.DEFAULT_LABEL, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3.zze("Failed to initialize adapter. " + r5 + " does not implement the initialize() method.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zzn(com.google.android.gms.internal.ads.zzezs r2, com.google.android.gms.internal.ads.zzbjp r3, java.util.List r4, java.lang.String r5) {
        /*
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.zzg     // Catch:{ zzezc -> 0x0011 }
            java.lang.Object r0 = r0.get()     // Catch:{ zzezc -> 0x0011 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ zzezc -> 0x0011 }
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            android.content.Context r0 = r1.zzf     // Catch:{ zzezc -> 0x0011 }
        L_0x000d:
            r2.zzi(r0, r3, r4)     // Catch:{ zzezc -> 0x0011 }
            return
        L_0x0011:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x002b }
            r2.<init>()     // Catch:{ RemoteException -> 0x002b }
            java.lang.String r4 = "Failed to initialize adapter. "
            r2.append(r4)     // Catch:{ RemoteException -> 0x002b }
            r2.append(r5)     // Catch:{ RemoteException -> 0x002b }
            java.lang.String r4 = " does not implement the initialize() method."
            r2.append(r4)     // Catch:{ RemoteException -> 0x002b }
            java.lang.String r2 = r2.toString()     // Catch:{ RemoteException -> 0x002b }
            r3.zze(r2)     // Catch:{ RemoteException -> 0x002b }
            return
        L_0x002b:
            r2 = move-exception
            java.lang.String r3 = ""
            com.google.android.gms.internal.ads.zzbza.zzh(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdrk.zzn(com.google.android.gms.internal.ads.zzezs, com.google.android.gms.internal.ads.zzbjp, java.util.List, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(zzbzs zzbzs) {
        this.zzi.execute(new zzdqz(this, zzbzs));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(Object obj, zzbzs zzbzs, String str, long j10, zzfec zzfec) {
        synchronized (obj) {
            if (!zzbzs.isDone()) {
                zzv(str, false, "Timeout.", (int) (t.b().b() - j10));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                zzfep zzfep = this.zzp;
                zzfec.zzc(InitializeAndroidBoldSDK.MSG_TIMEOUT);
                zzfec.zzf(false);
                zzfep.zzb(zzfec.zzl());
                zzbzs.zzd(Boolean.FALSE);
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbcq.zza.zze()).booleanValue()) {
            if (this.zzm.zzc >= ((Integer) a0.c().zzb(zzbar.zzbD)).intValue() && this.zzq) {
                if (!this.zza) {
                    synchronized (this) {
                        if (!this.zza) {
                            this.zzl.zzf();
                            this.zzo.zzf();
                            this.zze.zzc(new zzdra(this), this.zzi);
                            this.zza = true;
                            zzfut zzu = zzu();
                            this.zzk.schedule(new zzdrd(this), ((Long) a0.c().zzb(zzbar.zzbF)).longValue(), TimeUnit.SECONDS);
                            zzfuj.zzq(zzu, new zzdri(this), this.zzi);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        if (!this.zza) {
            zzv("com.google.android.gms.ads.MobileAds", true, MaxReward.DEFAULT_LABEL, 0);
            this.zze.zzd(Boolean.FALSE);
            this.zza = true;
            this.zzb = true;
        }
    }

    public final void zzs(zzbjs zzbjs) {
        this.zze.zzc(new zzdre(this, zzbjs), this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
