package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c2;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdsf implements zzdtd, zzdrq {
    private final zzdsn zza;
    private final zzdte zzb;
    private final zzdrr zzc;
    private final zzdsa zzd;
    private final zzdrp zze;
    private final zzdsz zzf;
    private final String zzg;
    private final String zzh;
    private final Map zzi = new HashMap();
    private final Map zzj = new HashMap();
    private final Map zzk = new HashMap();
    private String zzl = JsonUtils.EMPTY_JSON;
    private JSONObject zzm;
    private long zzn = Long.MAX_VALUE;
    private zzdsb zzo = zzdsb.NONE;
    private boolean zzp;
    private int zzq;
    private boolean zzr;
    private zzdse zzs = zzdse.UNKNOWN;

    zzdsf(zzdsn zzdsn, zzdte zzdte, zzdrr zzdrr, Context context, zzbzg zzbzg, zzdsa zzdsa, zzdsz zzdsz) {
        this.zza = zzdsn;
        this.zzb = zzdte;
        this.zzc = zzdrr;
        this.zze = new zzdrp(context);
        this.zzg = zzbzg.zza;
        this.zzh = "afma-sdk-a-v22.0.0";
        this.zzd = zzdsa;
        this.zzf = zzdsz;
        t.u().g(this);
    }

    private final synchronized JSONObject zzq() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.zzi.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zzdrt zzdrt : (List) entry.getValue()) {
                if (zzdrt.zzg()) {
                    jSONArray.put(zzdrt.zzd());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void zzr() {
        this.zzr = true;
        this.zzd.zzc();
        this.zza.zzh(this);
        this.zzb.zzc(this);
        this.zzc.zzc(this);
        this.zzf.zzf(this);
        zzx(t.q().zzh().zzo());
    }

    private final void zzs() {
        t.q().zzh().s(zzd());
    }

    private final synchronized void zzt(zzdsb zzdsb, boolean z10) {
        if (this.zzo != zzdsb) {
            if (zzo()) {
                zzv();
            }
            this.zzo = zzdsb;
            if (zzo()) {
                zzw();
            }
            if (z10) {
                zzs();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void zzu(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzp     // Catch:{ all -> 0x003d }
            if (r0 != r2) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            r1.zzp = r2     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.zzbaj r2 = com.google.android.gms.internal.ads.zzbar.zziu     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.ads.zzbap r0 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x003d }
            java.lang.Object r2 = r0.zzb(r2)     // Catch:{ all -> 0x003d }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x003d }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0027
            com.google.android.gms.ads.internal.util.x r2 = com.google.android.gms.ads.internal.t.u()     // Catch:{ all -> 0x003d }
            boolean r2 = r2.l()     // Catch:{ all -> 0x003d }
            if (r2 != 0) goto L_0x002b
        L_0x0027:
            r1.zzw()     // Catch:{ all -> 0x003d }
            goto L_0x0034
        L_0x002b:
            boolean r2 = r1.zzo()     // Catch:{ all -> 0x003d }
            if (r2 != 0) goto L_0x0034
            r1.zzv()     // Catch:{ all -> 0x003d }
        L_0x0034:
            if (r3 == 0) goto L_0x003b
            r1.zzs()     // Catch:{ all -> 0x003d }
            monitor-exit(r1)
            return
        L_0x003b:
            monitor-exit(r1)
            return
        L_0x003d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsf.zzu(boolean, boolean):void");
    }

    private final synchronized void zzv() {
        zzdsb zzdsb = zzdsb.NONE;
        int ordinal = this.zzo.ordinal();
        if (ordinal == 1) {
            this.zzb.zza();
        } else if (ordinal == 2) {
            this.zzc.zza();
        }
    }

    private final synchronized void zzw() {
        zzdsb zzdsb = zzdsb.NONE;
        int ordinal = this.zzo.ordinal();
        if (ordinal == 1) {
            this.zzb.zzb();
        } else if (ordinal == 2) {
            this.zzc.zzb();
        }
    }

    private final synchronized void zzx(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                zzu(jSONObject.optBoolean("isTestMode", false), false);
                zzt(zzdsb.zza(jSONObject.optString("gesture", "NONE")), false);
                this.zzl = jSONObject.optString("networkExtras", JsonUtils.EMPTY_JSON);
                this.zzn = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
            } catch (JSONException unused) {
            }
        }
    }

    public final zzdsb zza() {
        return this.zzo;
    }

    public final synchronized zzfut zzb(String str) {
        zzbzs zzbzs;
        zzbzs = new zzbzs();
        if (this.zzj.containsKey(str)) {
            zzbzs.zzd((zzdrt) this.zzj.get(str));
        } else {
            if (!this.zzk.containsKey(str)) {
                this.zzk.put(str, new ArrayList());
            }
            ((List) this.zzk.get(str)).add(zzbzs);
        }
        return zzbzs;
    }

    public final synchronized String zzc() {
        if (((Boolean) a0.c().zzb(zzbar.zzif)).booleanValue()) {
            if (zzo()) {
                if (this.zzn < t.b().a() / 1000) {
                    this.zzl = JsonUtils.EMPTY_JSON;
                    this.zzn = Long.MAX_VALUE;
                    return MaxReward.DEFAULT_LABEL;
                } else if (this.zzl.equals(JsonUtils.EMPTY_JSON)) {
                    return MaxReward.DEFAULT_LABEL;
                } else {
                    return this.zzl;
                }
            }
        }
        return MaxReward.DEFAULT_LABEL;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|3|4|5|(1:7)|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String zzd() {
        /*
            r7 = this;
            monitor-enter(r7)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0039 }
            r0.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r1 = "isTestMode"
            boolean r2 = r7.zzp     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r1 = "gesture"
            com.google.android.gms.internal.ads.zzdsb r2 = r7.zzo     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
            long r1 = r7.zzn     // Catch:{ JSONException -> 0x0033 }
            m5.e r3 = com.google.android.gms.ads.internal.t.b()     // Catch:{ JSONException -> 0x0033 }
            long r3 = r3.a()     // Catch:{ JSONException -> 0x0033 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0033
            java.lang.String r1 = "networkExtras"
            java.lang.String r2 = r7.zzl     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r1 = "networkExtrasExpirationSecs"
            long r2 = r7.zzn     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
        L_0x0033:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0039 }
            monitor-exit(r7)
            return r0
        L_0x0039:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsf.zzd():java.lang.String");
    }

    public final synchronized JSONObject zze() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            jSONObject.put("sdkVersion", this.zzh);
            jSONObject.put("internalSdkVersion", this.zzg);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("adapters", this.zzd.zza());
            if (((Boolean) a0.c().zzb(zzbar.zziD)).booleanValue()) {
                String zzm2 = t.q().zzm();
                if (!TextUtils.isEmpty(zzm2)) {
                    jSONObject.put("plugin", zzm2);
                }
            }
            if (this.zzn < t.b().a() / 1000) {
                this.zzl = JsonUtils.EMPTY_JSON;
            }
            jSONObject.put("networkExtras", this.zzl);
            jSONObject.put("adSlots", zzq());
            jSONObject.put("appInfo", this.zze.zza());
            String zzc2 = t.q().zzh().zzh().zzc();
            if (!TextUtils.isEmpty(zzc2)) {
                jSONObject.put("cld", new JSONObject(zzc2));
            }
            if (((Boolean) a0.c().zzb(zzbar.zziv)).booleanValue() && (jSONObject2 = this.zzm) != null) {
                String obj = jSONObject2.toString();
                zzbza.zze("Server data: " + obj);
                jSONObject.put("serverData", this.zzm);
            }
            if (((Boolean) a0.c().zzb(zzbar.zziu)).booleanValue()) {
                jSONObject.put("openAction", this.zzs);
                jSONObject.put("gesture", this.zzo);
            }
        } catch (JSONException e10) {
            t.q().zzt(e10, "Inspector.toJson");
            zzbza.zzk("Ad inspector encountered an error", e10);
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a2, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzf(java.lang.String r4, com.google.android.gms.internal.ads.zzdrt r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzif     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x00a3 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x00a3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00a3 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r3.zzo()     // Catch:{ all -> 0x00a3 }
            if (r0 != 0) goto L_0x001b
            goto L_0x00a1
        L_0x001b:
            int r0 = r3.zzq     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.zzbaj r1 = com.google.android.gms.internal.ads.zzbar.zzih     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.zzbap r2 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x00a3 }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ all -> 0x00a3 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x00a3 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x00a3 }
            if (r0 < r1) goto L_0x0036
            java.lang.String r4 = "Maximum number of ad requests stored reached. Dropping the current request."
            com.google.android.gms.internal.ads.zzbza.zzj(r4)     // Catch:{ all -> 0x00a3 }
            monitor-exit(r3)
            return
        L_0x0036:
            java.util.Map r0 = r3.zzi     // Catch:{ all -> 0x00a3 }
            boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x00a3 }
            if (r0 != 0) goto L_0x0048
            java.util.Map r0 = r3.zzi     // Catch:{ all -> 0x00a3 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00a3 }
            r1.<init>()     // Catch:{ all -> 0x00a3 }
            r0.put(r4, r1)     // Catch:{ all -> 0x00a3 }
        L_0x0048:
            int r0 = r3.zzq     // Catch:{ all -> 0x00a3 }
            int r0 = r0 + 1
            r3.zzq = r0     // Catch:{ all -> 0x00a3 }
            java.util.Map r0 = r3.zzi     // Catch:{ all -> 0x00a3 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x00a3 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x00a3 }
            r4.add(r5)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.zzbaj r4 = com.google.android.gms.internal.ads.zzbar.zziB     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.zzbap r0 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x00a3 }
            java.lang.Object r4 = r0.zzb(r4)     // Catch:{ all -> 0x00a3 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x00a3 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x00a3 }
            if (r4 != 0) goto L_0x006d
            monitor-exit(r3)
            return
        L_0x006d:
            java.lang.String r4 = r5.zzc()     // Catch:{ all -> 0x00a3 }
            java.util.Map r0 = r3.zzj     // Catch:{ all -> 0x00a3 }
            r0.put(r4, r5)     // Catch:{ all -> 0x00a3 }
            java.util.Map r0 = r3.zzk     // Catch:{ all -> 0x00a3 }
            boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x009f
            java.util.Map r0 = r3.zzk     // Catch:{ all -> 0x00a3 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x00a3 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x00a3 }
            java.util.Iterator r0 = r4.iterator()     // Catch:{ all -> 0x00a3 }
        L_0x008a:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x009a
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.zzbzs r1 = (com.google.android.gms.internal.ads.zzbzs) r1     // Catch:{ all -> 0x00a3 }
            r1.zzd(r5)     // Catch:{ all -> 0x00a3 }
            goto L_0x008a
        L_0x009a:
            r4.clear()     // Catch:{ all -> 0x00a3 }
            monitor-exit(r3)
            return
        L_0x009f:
            monitor-exit(r3)
            return
        L_0x00a1:
            monitor-exit(r3)
            return
        L_0x00a3:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsf.zzf(java.lang.String, com.google.android.gms.internal.ads.zzdrt):void");
    }

    public final void zzg() {
        if (((Boolean) a0.c().zzb(zzbar.zzif)).booleanValue()) {
            if (!((Boolean) a0.c().zzb(zzbar.zziu)).booleanValue() || !t.q().zzh().zzO()) {
                String zzo2 = t.q().zzh().zzo();
                if (!TextUtils.isEmpty(zzo2)) {
                    try {
                        if (new JSONObject(zzo2).optBoolean("isTestMode", false)) {
                            zzr();
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else {
                zzr();
            }
        }
    }

    public final synchronized void zzh(c2 c2Var, zzdse zzdse) {
        if (!zzo()) {
            try {
                c2Var.zze(zzezx.zzd(18, (String) null, (c3) null));
            } catch (RemoteException unused) {
                zzbza.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
            }
        } else {
            if (!((Boolean) a0.c().zzb(zzbar.zzif)).booleanValue()) {
                try {
                    c2Var.zze(zzezx.zzd(1, (String) null, (c3) null));
                } catch (RemoteException unused2) {
                    zzbza.zzj("Ad inspector had an internal error.");
                }
            } else {
                this.zzs = zzdse;
                this.zza.zzj(c2Var, new zzbih(this), new zzbia(this.zzf));
            }
        }
    }

    public final synchronized void zzi(String str, long j10) {
        this.zzl = str;
        this.zzn = j10;
        zzs();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (r2 != false) goto L_0x000c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzj(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.zzr
            if (r0 != 0) goto L_0x000a
            if (r2 == 0) goto L_0x0015
            r1.zzr()
            goto L_0x000c
        L_0x000a:
            if (r2 == 0) goto L_0x0015
        L_0x000c:
            boolean r2 = r1.zzp
            if (r2 == 0) goto L_0x0011
            goto L_0x0015
        L_0x0011:
            r1.zzw()
            return
        L_0x0015:
            boolean r2 = r1.zzo()
            if (r2 != 0) goto L_0x001e
            r1.zzv()
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsf.zzj(boolean):void");
    }

    public final void zzk(zzdsb zzdsb) {
        zzt(zzdsb, true);
    }

    public final synchronized void zzl(JSONObject jSONObject) {
        this.zzm = jSONObject;
    }

    public final void zzm(boolean z10) {
        if (!this.zzr && z10) {
            zzr();
        }
        zzu(z10, true);
    }

    public final boolean zzn() {
        return this.zzm != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        return r2.zzp || com.google.android.gms.ads.internal.t.u().l();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzo() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zziu     // Catch:{ all -> 0x002b }
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x002b }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x002b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x002b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0027
            boolean r0 = r2.zzp     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0025
            com.google.android.gms.ads.internal.util.x r0 = com.google.android.gms.ads.internal.t.u()     // Catch:{ all -> 0x002b }
            boolean r0 = r0.l()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0022
            goto L_0x0025
        L_0x0022:
            r0 = 0
        L_0x0023:
            monitor-exit(r2)
            return r0
        L_0x0025:
            r0 = 1
            goto L_0x0023
        L_0x0027:
            boolean r0 = r2.zzp     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return r0
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsf.zzo():boolean");
    }

    public final synchronized boolean zzp() {
        return this.zzp;
    }
}
