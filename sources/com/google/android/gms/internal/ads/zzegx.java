package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.n1;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzegx {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Executor zzd;
    private JSONObject zze;

    zzegx(Executor executor) {
        this.zzd = executor;
    }

    private final synchronized List zzg(JSONObject jSONObject, String str) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        Bundle zzl = zzl(jSONObject.optJSONObject(JsonStorageKeyNames.DATA_KEY));
        JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
        if (optJSONArray == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            String optString = optJSONArray.optString(i10, MaxReward.DEFAULT_LABEL);
            if (!TextUtils.isEmpty(optString)) {
                arrayList2.add(optString);
            }
        }
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = (String) arrayList2.get(i11);
            zzf(str2);
            if (((zzegz) this.zza.get(str2)) != null) {
                arrayList.add(new zzegz(str2, str, zzl));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final synchronized void zzh() {
        this.zzb.clear();
        this.zza.clear();
        zzj();
        zzk();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void zzi(java.lang.String r3, java.lang.String r4, java.util.List r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0036
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0036
            java.util.Map r0 = r2.zzc     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0038 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x001c
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0038 }
            r0.<init>()     // Catch:{ all -> 0x0038 }
        L_0x001c:
            java.util.Map r1 = r2.zzc     // Catch:{ all -> 0x0038 }
            r1.put(r3, r0)     // Catch:{ all -> 0x0038 }
            java.lang.Object r3 = r0.get(r4)     // Catch:{ all -> 0x0038 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0038 }
            if (r3 != 0) goto L_0x002e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0038 }
            r3.<init>()     // Catch:{ all -> 0x0038 }
        L_0x002e:
            r3.addAll(r5)     // Catch:{ all -> 0x0038 }
            r0.put(r4, r3)     // Catch:{ all -> 0x0038 }
            monitor-exit(r2)
            return
        L_0x0036:
            monitor-exit(r2)
            return
        L_0x0038:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegx.zzi(java.lang.String, java.lang.String, java.util.List):void");
    }

    private final synchronized void zzj() {
        String str;
        JSONObject zzf = t.q().zzh().zzh().zzf();
        if (zzf != null) {
            try {
                JSONArray optJSONArray = zzf.optJSONArray("ad_unit_id_settings");
                this.zze = zzf.optJSONObject("ad_unit_patterns");
                if (optJSONArray != null) {
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        JSONObject jSONObject = optJSONArray.getJSONObject(i10);
                        if (((Boolean) a0.c().zzb(zzbar.zzji)).booleanValue()) {
                            str = jSONObject.optString("ad_unit_id", MaxReward.DEFAULT_LABEL).toLowerCase(Locale.ROOT);
                        } else {
                            str = jSONObject.optString("ad_unit_id", MaxReward.DEFAULT_LABEL);
                        }
                        String optString = jSONObject.optString("format", MaxReward.DEFAULT_LABEL);
                        ArrayList arrayList = new ArrayList();
                        JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (optJSONObject != null) {
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("ad_networks");
                            if (optJSONArray2 != null) {
                                for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                                    arrayList.addAll(zzg(optJSONArray2.getJSONObject(i11), optString));
                                }
                            }
                        }
                        zzi(optString, str, arrayList);
                    }
                }
            } catch (JSONException e10) {
                n1.b("Malformed config loading JSON.", e10);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void zzk() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzbbw r0 = com.google.android.gms.internal.ads.zzbcq.zzf     // Catch:{ all -> 0x0083 }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x0083 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0083 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0083 }
            if (r0 != 0) goto L_0x0081
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzbC     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x0083 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x0083 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0083 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0083 }
            if (r0 != 0) goto L_0x0022
            goto L_0x0081
        L_0x0022:
            com.google.android.gms.internal.ads.zzbyj r0 = com.google.android.gms.ads.internal.t.q()     // Catch:{ all -> 0x0083 }
            com.google.android.gms.ads.internal.util.p1 r0 = r0.zzh()     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.zzbyd r0 = r0.zzh()     // Catch:{ all -> 0x0083 }
            org.json.JSONObject r0 = r0.zzf()     // Catch:{ all -> 0x0083 }
            if (r0 != 0) goto L_0x0036
            monitor-exit(r9)
            return
        L_0x0036:
            java.lang.String r1 = "signal_adapters"
            org.json.JSONArray r0 = r0.getJSONArray(r1)     // Catch:{ JSONException -> 0x0079 }
            r1 = 0
            r2 = 0
        L_0x003e:
            int r3 = r0.length()     // Catch:{ JSONException -> 0x0079 }
            if (r2 >= r3) goto L_0x0077
            org.json.JSONObject r3 = r0.getJSONObject(r2)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r4 = "data"
            org.json.JSONObject r4 = r3.optJSONObject(r4)     // Catch:{ JSONException -> 0x0079 }
            android.os.Bundle r4 = zzl(r4)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r5 = "adapter_class_name"
            java.lang.String r5 = r3.optString(r5)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r6 = "render"
            boolean r6 = r3.optBoolean(r6, r1)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r7 = "collect_signals"
            boolean r3 = r3.optBoolean(r7, r1)     // Catch:{ JSONException -> 0x0079 }
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x0079 }
            if (r7 != 0) goto L_0x0074
            java.util.Map r7 = r9.zzb     // Catch:{ JSONException -> 0x0079 }
            com.google.android.gms.internal.ads.zzehb r8 = new com.google.android.gms.internal.ads.zzehb     // Catch:{ JSONException -> 0x0079 }
            r8.<init>(r5, r3, r6, r4)     // Catch:{ JSONException -> 0x0079 }
            r7.put(r5, r8)     // Catch:{ JSONException -> 0x0079 }
        L_0x0074:
            int r2 = r2 + 1
            goto L_0x003e
        L_0x0077:
            monitor-exit(r9)
            return
        L_0x0079:
            r0 = move-exception
            java.lang.String r1 = "Malformed config loading JSON."
            com.google.android.gms.ads.internal.util.n1.b(r1, r0)     // Catch:{ all -> 0x0083 }
            monitor-exit(r9)
            return
        L_0x0081:
            monitor-exit(r9)
            return
        L_0x0083:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegx.zzk():void");
    }

    private static final Bundle zzl(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, MaxReward.DEFAULT_LABEL));
            }
        }
        return bundle;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.Map zza(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0091 }
            if (r0 != 0) goto L_0x008b
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x000f
            goto L_0x008b
        L_0x000f:
            java.util.Map r0 = r3.zzc     // Catch:{ all -> 0x0091 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0091 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0091 }
            if (r0 != 0) goto L_0x001f
            com.google.android.gms.internal.ads.zzfqn r4 = com.google.android.gms.internal.ads.zzfqn.zzd()     // Catch:{ all -> 0x0091 }
            monitor-exit(r3)
            return r4
        L_0x001f:
            java.lang.Object r1 = r0.get(r5)     // Catch:{ all -> 0x0091 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0091 }
            if (r1 != 0) goto L_0x004c
            org.json.JSONObject r1 = r3.zze     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = com.google.android.gms.internal.ads.zzdnk.zza(r1, r5, r4)     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ads.zzbaj r5 = com.google.android.gms.internal.ads.zzbar.zzji     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x0091 }
            java.lang.Object r5 = r1.zzb(r5)     // Catch:{ all -> 0x0091 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0091 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0091 }
            if (r5 == 0) goto L_0x0045
            java.util.Locale r5 = java.util.Locale.ROOT     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = r4.toLowerCase(r5)     // Catch:{ all -> 0x0091 }
        L_0x0045:
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x0091 }
            r1 = r4
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0091 }
        L_0x004c:
            if (r1 != 0) goto L_0x0054
            com.google.android.gms.internal.ads.zzfqn r4 = com.google.android.gms.internal.ads.zzfqn.zzd()     // Catch:{ all -> 0x0091 }
            monitor-exit(r3)
            return r4
        L_0x0054:
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0091 }
            r4.<init>()     // Catch:{ all -> 0x0091 }
            java.util.Iterator r5 = r1.iterator()     // Catch:{ all -> 0x0091 }
        L_0x005d:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x0085
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ads.zzegz r0 = (com.google.android.gms.internal.ads.zzegz) r0     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = r0.zza     // Catch:{ all -> 0x0091 }
            boolean r2 = r4.containsKey(r1)     // Catch:{ all -> 0x0091 }
            if (r2 != 0) goto L_0x0079
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0091 }
            r2.<init>()     // Catch:{ all -> 0x0091 }
            r4.put(r1, r2)     // Catch:{ all -> 0x0091 }
        L_0x0079:
            java.lang.Object r1 = r4.get(r1)     // Catch:{ all -> 0x0091 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0091 }
            android.os.Bundle r0 = r0.zzc     // Catch:{ all -> 0x0091 }
            r1.add(r0)     // Catch:{ all -> 0x0091 }
            goto L_0x005d
        L_0x0085:
            com.google.android.gms.internal.ads.zzfqn r4 = com.google.android.gms.internal.ads.zzfqn.zzc(r4)     // Catch:{ all -> 0x0091 }
            monitor-exit(r3)
            return r4
        L_0x008b:
            com.google.android.gms.internal.ads.zzfqn r4 = com.google.android.gms.internal.ads.zzfqn.zzd()     // Catch:{ all -> 0x0091 }
            monitor-exit(r3)
            return r4
        L_0x0091:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegx.zza(java.lang.String, java.lang.String):java.util.Map");
    }

    public final synchronized Map zzb() {
        return zzfqn.zzc(this.zzb);
    }

    public final void zzd() {
        t.q().zzh().a(new zzegv(this));
        this.zzd.execute(new zzegw(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze() {
        this.zzd.execute(new zzegw(this));
    }

    public final synchronized void zzf(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!this.zza.containsKey(str)) {
                this.zza.put(str, new zzegz(str, MaxReward.DEFAULT_LABEL, new Bundle()));
            }
        }
    }
}
