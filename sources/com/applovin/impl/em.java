package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.impl.vj;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class em extends xl {

    /* renamed from: m  reason: collision with root package name */
    private static JSONObject f7462m;

    /* renamed from: n  reason: collision with root package name */
    private static final Object f7463n = new Object();

    /* renamed from: o  reason: collision with root package name */
    private static final Map f7464o = Collections.synchronizedMap(new HashMap());

    /* renamed from: h  reason: collision with root package name */
    private final String f7465h;

    /* renamed from: i  reason: collision with root package name */
    private final MaxAdFormat f7466i;

    /* renamed from: j  reason: collision with root package name */
    private final Map f7467j;

    /* renamed from: k  reason: collision with root package name */
    private final Context f7468k;

    /* renamed from: l  reason: collision with root package name */
    private final b f7469l;

    public interface b {
        void a(JSONArray jSONArray);
    }

    public em(String str, MaxAdFormat maxAdFormat, Map map, Context context, k kVar, b bVar) {
        super("TaskCollectSignals", kVar);
        this.f7465h = str;
        this.f7466i = maxAdFormat;
        this.f7467j = map;
        this.f7468k = context;
        this.f7469l = bVar;
    }

    private void a(wj wjVar, vj.a aVar) {
        if (wjVar.r()) {
            AppLovinSdkUtils.runOnUiThread(new lw(this, wjVar, aVar));
            return;
        }
        this.f13421a.S().collectSignal(this.f7465h, this.f7466i, wjVar, this.f7468k, aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(wj wjVar, vj.a aVar) {
        this.f13421a.S().collectSignal(this.f7465h, this.f7466i, wjVar, this.f7468k, aVar);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            java.lang.Object r0 = f7463n     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            monitor-enter(r0)     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            org.json.JSONObject r1 = f7462m     // Catch:{ all -> 0x0076 }
            java.lang.String r2 = "signal_providers"
            r3 = 0
            org.json.JSONArray r1 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(r1, r2, r3)     // Catch:{ all -> 0x0076 }
            monitor-exit(r0)     // Catch:{ all -> 0x0076 }
            if (r1 == 0) goto L_0x002d
            int r0 = r1.length()     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            if (r0 <= 0) goto L_0x002d
            java.util.Map r0 = f7464o     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            int r0 = r0.size()     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            if (r0 <= 0) goto L_0x0023
            org.json.JSONObject r0 = f7462m     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            r4.a((org.json.JSONArray) r1, (org.json.JSONObject) r0)     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            goto L_0x002c
        L_0x0023:
            int r0 = r1.length()     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            org.json.JSONObject r2 = f7462m     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            r4.a(r0, r1, r2)     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
        L_0x002c:
            return
        L_0x002d:
            boolean r0 = com.applovin.impl.sdk.t.a()     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            if (r0 == 0) goto L_0x003c
            com.applovin.impl.sdk.t r0 = r4.f13423c     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            java.lang.String r1 = r4.f13422b     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            java.lang.String r2 = "Unable to find cached signal providers, fetching signal providers from SharedPreferences."
            r0.k(r1, r2)     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
        L_0x003c:
            com.applovin.impl.sdk.k r0 = r4.f13421a     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            com.applovin.impl.qj r1 = com.applovin.impl.qj.F     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            java.lang.String r2 = "{}"
            java.lang.Object r0 = r0.a((com.applovin.impl.qj) r1, (java.lang.Object) r2)     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            java.lang.String r0 = "signal_providers"
            org.json.JSONArray r0 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(r1, r0, r3)     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            if (r0 == 0) goto L_0x0070
            int r2 = r0.length()     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            if (r2 != 0) goto L_0x005c
            goto L_0x0070
        L_0x005c:
            java.util.Map r2 = f7464o     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            int r2 = r2.size()     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            if (r2 <= 0) goto L_0x0068
            r4.a((org.json.JSONArray) r0, (org.json.JSONObject) r1)     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            goto L_0x00b4
        L_0x0068:
            int r2 = r0.length()     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            r4.a(r2, r0, r1)     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            goto L_0x00b4
        L_0x0070:
            java.lang.String r0 = "No signal providers found"
            r4.a((java.lang.String) r0, (java.lang.Throwable) r3)     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
            return
        L_0x0076:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0076 }
            throw r1     // Catch:{ JSONException -> 0x00a1, InterruptedException -> 0x008d, all -> 0x0079 }
        L_0x0079:
            r0 = move-exception
            java.lang.String r1 = "Failed to collect signals"
            r4.a((java.lang.String) r1, (java.lang.Throwable) r0)
            com.applovin.impl.sdk.k r1 = r4.f13421a
            com.applovin.impl.sdk.o r1 = r1.B()
            java.lang.String r2 = "TaskCollectSignals"
            java.lang.String r3 = "collectSignals"
            r1.a((java.lang.String) r2, (java.lang.String) r3, (java.lang.Throwable) r0)
            goto L_0x00b4
        L_0x008d:
            r0 = move-exception
            java.lang.String r1 = "Failed to wait for signals"
            r4.a((java.lang.String) r1, (java.lang.Throwable) r0)
            com.applovin.impl.sdk.k r1 = r4.f13421a
            com.applovin.impl.sdk.o r1 = r1.B()
            java.lang.String r2 = "TaskCollectSignals"
            java.lang.String r3 = "waitForSignals"
            r1.a((java.lang.String) r2, (java.lang.String) r3, (java.lang.Throwable) r0)
            goto L_0x00b4
        L_0x00a1:
            r0 = move-exception
            java.lang.String r1 = "Failed to parse signals JSON"
            r4.a((java.lang.String) r1, (java.lang.Throwable) r0)
            com.applovin.impl.sdk.k r1 = r4.f13421a
            com.applovin.impl.sdk.o r1 = r1.B()
            java.lang.String r2 = "TaskCollectSignals"
            java.lang.String r3 = "parseSignalsJSON"
            r1.a((java.lang.String) r2, (java.lang.String) r3, (java.lang.Throwable) r0)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.em.run():void");
    }

    private void a(int i10, JSONArray jSONArray, JSONObject jSONObject) {
        c cVar = new c(i10, this.f7469l, this.f13421a);
        this.f13421a.l0().a((xl) new kn(this.f13421a, "timeoutCollectSignal", cVar), sm.b.TIMEOUT, ((Long) this.f13421a.a(qe.P6)).longValue());
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            a(new wj(this.f7467j, jSONArray.getJSONObject(i11), jSONObject, this.f13421a), (vj.a) cVar);
        }
    }

    public static void a(JSONObject jSONObject, k kVar) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    f7464o.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, (List) null)));
                }
            }
        } catch (JSONException e10) {
            t.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e10);
            kVar.B().a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", (Throwable) e10);
        }
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) {
        Set set = (Set) f7464o.get(this.f7465h);
        if (set == null || set.isEmpty()) {
            a("No signal providers found for ad unit: " + this.f7465h, (Throwable) null);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            if (set.contains(JsonUtils.getString(jSONObject2, MediationMetaData.KEY_NAME, (String) null))) {
                jSONArray2.put(jSONObject2);
            }
        }
        if (((Boolean) this.f13421a.a(qe.Q6)).booleanValue()) {
            a(jSONArray2.length(), jSONArray2, jSONObject);
        } else {
            a(set.size(), jSONArray2, jSONObject);
        }
    }

    private static class c implements vj.a, Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final b f7470a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f7471b;

        /* renamed from: c  reason: collision with root package name */
        private int f7472c;

        /* renamed from: d  reason: collision with root package name */
        private final AtomicBoolean f7473d;

        /* renamed from: f  reason: collision with root package name */
        private final Collection f7474f;

        /* renamed from: g  reason: collision with root package name */
        private final k f7475g;

        /* renamed from: h  reason: collision with root package name */
        private final t f7476h;

        private c(int i10, b bVar, k kVar) {
            this.f7472c = i10;
            this.f7470a = bVar;
            this.f7475g = kVar;
            this.f7476h = kVar.L();
            this.f7471b = new Object();
            this.f7474f = new ArrayList(i10);
            this.f7473d = new AtomicBoolean();
        }

        /* access modifiers changed from: private */
        public void a() {
            ArrayList<vj> arrayList;
            synchronized (this.f7471b) {
                arrayList = new ArrayList<>(this.f7474f);
            }
            JSONArray jSONArray = new JSONArray();
            for (vj vjVar : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    wj f10 = vjVar.f();
                    jSONObject.put(MediationMetaData.KEY_NAME, f10.c());
                    jSONObject.put("class", f10.b());
                    jSONObject.put("adapter_version", vjVar.a());
                    jSONObject.put("sdk_version", vjVar.d());
                    JSONObject jSONObject2 = new JSONObject();
                    MaxError c10 = vjVar.c();
                    if (c10 != null) {
                        jSONObject2.put("error_message", c10.getMessage());
                    } else {
                        jSONObject2.put("signal", vjVar.e());
                    }
                    jSONObject2.put("signal_collection_time_ms", vjVar.b());
                    jSONObject2.put("is_cached", vjVar.g());
                    jSONObject.put(JsonStorageKeyNames.DATA_KEY, jSONObject2);
                    jSONArray.put(jSONObject);
                    if (t.a()) {
                        t tVar = this.f7476h;
                        tVar.a("TaskCollectSignals", "Collected signal from " + f10);
                    }
                } catch (JSONException e10) {
                    if (t.a()) {
                        this.f7476h.a("TaskCollectSignals", "Failed to create signal data", e10);
                    }
                    this.f7475g.B().a("TaskCollectSignals", "createSignalsData", (Throwable) e10);
                }
            }
            a(jSONArray);
        }

        public void run() {
            if (this.f7473d.compareAndSet(false, true)) {
                a();
            }
        }

        private void a(JSONArray jSONArray) {
            b bVar = this.f7470a;
            if (bVar != null) {
                bVar.a(jSONArray);
            }
        }

        public void a(vj vjVar) {
            boolean z10;
            synchronized (this.f7471b) {
                this.f7474f.add(vjVar);
                int i10 = this.f7472c - 1;
                this.f7472c = i10;
                z10 = i10 < 1;
            }
            if (z10 && this.f7473d.compareAndSet(false, true)) {
                if (!zp.h() || !((Boolean) this.f7475g.a(oj.Q)).booleanValue()) {
                    a();
                } else {
                    this.f7475g.l0().a((xl) new kn(this.f7475g, "handleSignalCollectionCompleted", new mw(this)), sm.b.MEDIATION);
                }
            }
        }
    }

    private void a(String str, Throwable th) {
        if (t.a()) {
            t tVar = this.f13423c;
            String str2 = this.f13422b;
            tVar.a(str2, "No signals collected: " + str, th);
        }
        b bVar = this.f7469l;
        if (bVar != null) {
            bVar.a(new JSONArray());
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (f7463n) {
            f7462m = jSONObject;
        }
    }
}
