package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class fe implements Comparable, AppLovinCommunicatorSubscriber {
    private final List A;
    private final List B;
    private final List C;
    private final Map D;
    private final boolean E;
    private final sn F;
    private final boolean G;
    private final String H;
    private final Map I;

    /* renamed from: a  reason: collision with root package name */
    private final k f7733a;

    /* renamed from: b  reason: collision with root package name */
    private final a f7734b;

    /* renamed from: c  reason: collision with root package name */
    private int f7735c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f7736d;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f7737f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f7738g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f7739h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f7740i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f7741j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f7742k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f7743l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f7744m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f7745n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f7746o;

    /* renamed from: p  reason: collision with root package name */
    private final String f7747p;

    /* renamed from: q  reason: collision with root package name */
    private final String f7748q;

    /* renamed from: r  reason: collision with root package name */
    private String f7749r;

    /* renamed from: s  reason: collision with root package name */
    private String f7750s;

    /* renamed from: t  reason: collision with root package name */
    private final String f7751t;

    /* renamed from: u  reason: collision with root package name */
    private final String f7752u;

    /* renamed from: v  reason: collision with root package name */
    private final String f7753v;

    /* renamed from: w  reason: collision with root package name */
    private final String f7754w;

    /* renamed from: x  reason: collision with root package name */
    private final int f7755x;

    /* renamed from: y  reason: collision with root package name */
    private final List f7756y;

    /* renamed from: z  reason: collision with root package name */
    private final List f7757z;

    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f7763a;

        private a(String str) {
            this.f7763a = str;
        }

        /* access modifiers changed from: private */
        public String b() {
            return this.f7763a;
        }
    }

    public enum b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY(MaxReward.DEFAULT_LABEL, -16776961, MaxReward.DEFAULT_LABEL);
        

        /* renamed from: a  reason: collision with root package name */
        private final String f7770a;

        /* renamed from: b  reason: collision with root package name */
        private final int f7771b;

        /* renamed from: c  reason: collision with root package name */
        private final String f7772c;

        private b(String str, int i10, String str2) {
            this.f7770a = str;
            this.f7771b = i10;
            this.f7772c = str2;
        }

        public String b() {
            return this.f7772c;
        }

        public String c() {
            return this.f7770a;
        }

        public int d() {
            return this.f7771b;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0225 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fe(org.json.JSONObject r21, com.applovin.impl.sdk.k r22) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            r3 = r22
            java.lang.String r4 = "MediatedNetwork"
            r20.<init>()
            r1.f7733a = r3
            java.lang.String r0 = "name"
            java.lang.String r5 = ""
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r0, r5)
            r1.f7747p = r0
            java.lang.String r0 = "display_name"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r0, r5)
            r1.f7748q = r0
            java.lang.String r6 = "adapter_class"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r6, r5)
            r1.f7749r = r0
            java.lang.String r0 = "latest_adapter_version"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r0, r5)
            r1.f7752u = r0
            java.util.List r0 = r20.a((org.json.JSONObject) r21)
            r1.B = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r7 = "hide_if_missing"
            java.lang.Boolean r7 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r2, r7, r0)
            boolean r7 = r7.booleanValue()
            r1.f7742k = r7
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.String r8 = "configuration"
            org.json.JSONObject r7 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r2, (java.lang.String) r8, (org.json.JSONObject) r7)
            java.util.List r8 = r1.a((org.json.JSONObject) r7, (com.applovin.impl.sdk.k) r3)
            r1.f7757z = r8
            java.lang.String r8 = "java_8_required"
            java.lang.Boolean r8 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r7, r8, r0)
            boolean r8 = r8.booleanValue()
            r1.f7746o = r8
            java.lang.String r8 = "hide_initialization_status"
            java.lang.Boolean r8 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r7, r8, r0)
            boolean r8 = r8.booleanValue()
            r1.E = r8
            java.lang.String r8 = "live_network_filtering_names"
            r9 = 0
            java.util.List r8 = com.applovin.impl.sdk.utils.JsonUtils.getList(r7, r8, r9)
            r1.C = r8
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r10 = "test_mode"
            org.json.JSONObject r8 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r7, (java.lang.String) r10, (org.json.JSONObject) r8)
            java.lang.String r11 = "false_coppa_required"
            java.lang.Boolean r0 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r8, r11, r0)
            boolean r0 = r0.booleanValue()
            r1.f7745n = r0
            java.lang.String r0 = "network_names"
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r8, (java.lang.String) r0, (org.json.JSONObject) r9)
            if (r0 == 0) goto L_0x00cb
            int r11 = r0.length()
            if (r11 <= 0) goto L_0x00cb
            java.util.HashMap r11 = new java.util.HashMap
            int r12 = r0.length()
            r11.<init>(r12)
            java.util.Iterator r12 = r0.keys()
        L_0x00a7:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00c8
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            com.applovin.mediation.MaxAdFormat r14 = com.applovin.mediation.MaxAdFormat.formatFromString(r13)
            java.lang.String r13 = com.applovin.impl.sdk.utils.JsonUtils.getString(r0, r13, r9)
            if (r14 == 0) goto L_0x00a7
            boolean r15 = android.text.TextUtils.isEmpty(r13)
            if (r15 == 0) goto L_0x00c4
            goto L_0x00a7
        L_0x00c4:
            r11.put(r14, r13)
            goto L_0x00a7
        L_0x00c8:
            r1.D = r11
            goto L_0x00cd
        L_0x00cb:
            r1.D = r9
        L_0x00cd:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r2, (java.lang.String) r10, (org.json.JSONObject) r0)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            java.lang.String r11 = "supported"
            java.lang.Boolean r11 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r0, r11, r10)
            boolean r11 = r11.booleanValue()
            r1.f7740i = r11
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            java.lang.String r12 = "test_mode_requires_init"
            java.lang.Boolean r11 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r2, r12, r11)
            boolean r11 = r11.booleanValue()
            r1.f7741j = r11
            java.lang.String r11 = "message"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r0, r11, r9)
            r1.f7753v = r0
            java.lang.String r0 = "tcf_config"
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(r7, r0)
            com.applovin.impl.sn r11 = new com.applovin.impl.sn
            java.lang.String r12 = r1.f7748q
            r11.<init>(r0, r12)
            r1.F = r11
            java.lang.String r0 = "existence_classes"
            java.util.List r0 = com.applovin.impl.sdk.utils.JsonUtils.getList(r2, r0, r9)
            if (r0 == 0) goto L_0x0118
            boolean r0 = com.applovin.impl.zp.a((java.util.List) r0)
            r1.f7736d = r0
            goto L_0x0124
        L_0x0118:
            java.lang.String r0 = "existence_class"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r0, r5)
            boolean r0 = com.applovin.impl.zp.a((java.lang.String) r0)
            r1.f7736d = r0
        L_0x0124:
            java.util.List r11 = java.util.Collections.emptyList()
            java.lang.String r0 = r1.f7749r
            java.lang.String r12 = "init_adapter_class"
            java.lang.String r12 = com.applovin.impl.sdk.utils.JsonUtils.getString(r7, r12, r9)
            if (r12 == 0) goto L_0x0134
            r1.f7749r = r12
        L_0x0134:
            com.applovin.mediation.adapter.MaxAdapter r0 = com.applovin.impl.ve.a(r0, r3)
            r12 = 1
            if (r0 == 0) goto L_0x01eb
            r1.f7737f = r12
            java.lang.String r14 = r0.getAdapterVersion()     // Catch:{ all -> 0x0187 }
            java.lang.String r15 = com.applovin.impl.ve.a((com.applovin.mediation.adapter.MaxAdapter) r0)     // Catch:{ all -> 0x0184 }
            java.lang.String r12 = "is_mrec_supported"
            java.lang.Boolean r8 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r8, r12, r10)     // Catch:{ all -> 0x0182 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0182 }
            java.util.List r11 = r1.a((com.applovin.mediation.adapter.MaxAdapter) r0, (boolean) r8)     // Catch:{ all -> 0x0182 }
            java.lang.String r8 = "native_ad_view_config"
            org.json.JSONObject r8 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r7, (java.lang.String) r8, (org.json.JSONObject) r9)     // Catch:{ all -> 0x0182 }
            if (r8 == 0) goto L_0x0177
            java.lang.String r10 = "min_adapter_version"
            java.lang.String r10 = com.applovin.impl.sdk.utils.JsonUtils.getString(r8, r10, r9)     // Catch:{ all -> 0x0182 }
            if (r10 == 0) goto L_0x016c
            int r10 = com.applovin.impl.zp.a((java.lang.String) r14, (java.lang.String) r10)     // Catch:{ all -> 0x0182 }
            if (r10 < 0) goto L_0x016a
            goto L_0x016c
        L_0x016a:
            r10 = 0
            goto L_0x016d
        L_0x016c:
            r10 = 1
        L_0x016d:
            java.lang.String r12 = "network_name"
            java.lang.String r8 = com.applovin.impl.sdk.utils.JsonUtils.getString(r8, r12, r9)     // Catch:{ all -> 0x0174 }
            goto L_0x0179
        L_0x0174:
            r0 = move-exception
            r8 = r9
            goto L_0x018c
        L_0x0177:
            r8 = r9
            r10 = 0
        L_0x0179:
            boolean r0 = r0.isBeta()     // Catch:{ all -> 0x0180 }
            r9 = r8
            r8 = r0
            goto L_0x01ac
        L_0x0180:
            r0 = move-exception
            goto L_0x018c
        L_0x0182:
            r0 = move-exception
            goto L_0x018a
        L_0x0184:
            r0 = move-exception
            r15 = r5
            goto L_0x018a
        L_0x0187:
            r0 = move-exception
            r14 = r5
            r15 = r14
        L_0x018a:
            r8 = r9
            r10 = 0
        L_0x018c:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r9 = "Failed to load adapter for network "
            r12.append(r9)
            java.lang.String r9 = r1.f7747p
            r12.append(r9)
            java.lang.String r9 = ". Please check that you have a compatible network SDK integrated. Error: "
            r12.append(r9)
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            com.applovin.impl.sdk.t.h(r4, r0)
            r9 = r8
            r8 = 0
        L_0x01ac:
            java.lang.String r0 = r1.f7749r     // Catch:{ all -> 0x01d6 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x01d6 }
            java.lang.String r12 = "loadNativeAd"
            r13 = 3
            java.lang.Class[] r13 = new java.lang.Class[r13]     // Catch:{ all -> 0x01d6 }
            java.lang.Class<com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters> r18 = com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters.class
            r17 = 0
            r13[r17] = r18     // Catch:{ all -> 0x01d6 }
            java.lang.Class<android.app.Activity> r18 = android.app.Activity.class
            r16 = 1
            r13[r16] = r18     // Catch:{ all -> 0x01d6 }
            r18 = 2
            java.lang.Class<com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener> r19 = com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener.class
            r13[r18] = r19     // Catch:{ all -> 0x01d6 }
            java.lang.reflect.Method r12 = r0.getMethod(r12, r13)     // Catch:{ all -> 0x01d6 }
            java.lang.Class r12 = r12.getDeclaringClass()     // Catch:{ all -> 0x01d6 }
            boolean r0 = r12.equals(r0)     // Catch:{ all -> 0x01d6 }
            goto L_0x01f4
        L_0x01d6:
            r0 = move-exception
            r22.L()
            boolean r12 = com.applovin.impl.sdk.t.a()
            if (r12 == 0) goto L_0x01e9
            com.applovin.impl.sdk.t r12 = r22.L()
            java.lang.String r13 = "Failed to check if adapter overrides MaxNativeAdAdapter"
            r12.a(r4, r13, r0)
        L_0x01e9:
            r0 = 0
            goto L_0x01f4
        L_0x01eb:
            r4 = 0
            r1.f7737f = r4
            r14 = r5
            r15 = r14
            r0 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x01f4:
            r1.f7751t = r14
            r1.f7750s = r15
            r1.f7756y = r11
            r1.f7743l = r0
            r1.f7744m = r10
            r1.f7754w = r9
            java.util.List r0 = r1.a(r7, r14, r3)
            r1.A = r0
            java.lang.String r0 = "alternative_network"
            r4 = 0
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r2, (java.lang.String) r0, (org.json.JSONObject) r4)
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r0, r6, r5)
            boolean r0 = com.applovin.impl.zp.a((java.lang.String) r0)
            r1.f7739h = r0
            com.applovin.impl.fe$a r0 = r20.a()
            r1.f7734b = r0
            java.lang.String r0 = r1.f7752u
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0229
            if (r8 != 0) goto L_0x0229
            r0 = 1
            goto L_0x022a
        L_0x0229:
            r0 = 0
        L_0x022a:
            r1.f7738g = r0
            android.content.Context r0 = com.applovin.impl.sdk.k.k()
            java.lang.String r2 = r1.f7747p
            java.lang.String r4 = "_"
            int r2 = r2.lastIndexOf(r4)
            r4 = -1
            if (r2 == r4) goto L_0x0247
            java.lang.String r4 = r1.f7747p
            java.lang.String r4 = r4.toLowerCase()
            r5 = 0
            java.lang.String r2 = r4.substring(r5, r2)
            goto L_0x024d
        L_0x0247:
            java.lang.String r2 = r1.f7747p
            java.lang.String r2 = r2.toLowerCase()
        L_0x024d:
            android.content.res.Resources r4 = r0.getResources()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "applovin_ic_mediation_"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            java.lang.String r5 = r0.getPackageName()
            java.lang.String r6 = "drawable"
            int r2 = r4.getIdentifier(r2, r6, r5)
            r1.f7755x = r2
            com.applovin.mediation.adapter.MaxAdapter$InitializationStatus r2 = com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.NOT_INITIALIZED
            int r2 = r2.getCode()
            r1.f7735c = r2
            com.applovin.communicator.AppLovinCommunicator r0 = com.applovin.communicator.AppLovinCommunicator.getInstance(r0)
            java.lang.String r2 = "adapter_initialization_status"
            r0.subscribe((com.applovin.communicator.AppLovinCommunicatorSubscriber) r1, (java.lang.String) r2)
            com.applovin.impl.mediation.e r0 = r22.N()
            java.util.LinkedHashMap r0 = r0.a()
            java.lang.String r2 = r1.f7749r
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L_0x029d
            java.lang.String r2 = r1.f7749r
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.f7735c = r0
        L_0x029d:
            java.lang.String r0 = "amazon_marketplace"
            r2 = 0
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r7, (java.lang.String) r0, (org.json.JSONObject) r2)
            if (r0 == 0) goto L_0x02fc
            boolean r3 = r1.f7736d
            if (r3 == 0) goto L_0x02fc
            r3 = 1
            r1.G = r3
            java.lang.String r3 = "test_mode_app_id"
            java.lang.String r3 = com.applovin.impl.sdk.utils.JsonUtils.getString(r0, r3, r2)
            r1.H = r3
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "test_mode_slot_ids"
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r0, (java.lang.String) r3, (org.json.JSONObject) r2)
            java.util.HashMap r2 = new java.util.HashMap
            int r3 = r0.length()
            r2.<init>(r3)
            java.util.Iterator r3 = r0.keys()
        L_0x02cd:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x02f9
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            com.applovin.mediation.MaxAdFormat r5 = com.applovin.mediation.MaxAdFormat.formatFromString(r4)
            r6 = 0
            org.json.JSONObject r4 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r0, (java.lang.String) r4, (org.json.JSONObject) r6)
            if (r5 == 0) goto L_0x02cd
            if (r4 != 0) goto L_0x02e7
            goto L_0x02cd
        L_0x02e7:
            java.lang.String r7 = "uuid"
            java.lang.String r7 = com.applovin.impl.sdk.utils.JsonUtils.getString(r4, r7, r6)
            if (r7 != 0) goto L_0x02f0
            goto L_0x02cd
        L_0x02f0:
            com.applovin.impl.p0 r6 = new com.applovin.impl.p0
            r6.<init>(r7, r4, r5)
            r2.put(r5, r6)
            goto L_0x02cd
        L_0x02f9:
            r1.I = r2
            goto L_0x0304
        L_0x02fc:
            r2 = 0
            r1.G = r2
            r2 = 0
            r1.H = r2
            r1.I = r2
        L_0x0304:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.fe.<init>(org.json.JSONObject, com.applovin.impl.sdk.k):void");
    }

    public boolean A() {
        return this.G;
    }

    public boolean B() {
        return this.f7746o;
    }

    public boolean C() {
        return this.f7736d;
    }

    public boolean D() {
        return this.f7745n;
    }

    public boolean E() {
        return this.f7734b == a.MISSING && this.f7742k;
    }

    public boolean F() {
        return this.E;
    }

    public boolean G() {
        return this.f7743l;
    }

    public boolean H() {
        return this.f7744m;
    }

    /* renamed from: a */
    public int compareTo(fe feVar) {
        return this.f7748q.compareToIgnoreCase(feVar.f7748q);
    }

    public String b() {
        return this.f7749r;
    }

    public String c() {
        return this.f7751t;
    }

    public Map d() {
        return this.I;
    }

    public String e() {
        return this.H;
    }

    public List f() {
        return this.A;
    }

    public String g() {
        return this.f7748q;
    }

    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public int h() {
        return this.f7755x;
    }

    public int i() {
        return this.f7735c;
    }

    public final String j() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n---------- ");
        sb2.append(this.f7747p);
        sb2.append(" ----------");
        sb2.append("\nStatus  - ");
        sb2.append(this.f7734b.b());
        sb2.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb2.append((!this.f7736d || TextUtils.isEmpty(this.f7750s)) ? str : this.f7750s);
        sb2.append("\nAdapter - ");
        if (this.f7737f && !TextUtils.isEmpty(this.f7751t)) {
            str = this.f7751t;
        }
        sb2.append(str);
        for (eh ehVar : n()) {
            if (!ehVar.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(ehVar.b());
                sb2.append(": ");
                sb2.append(ehVar.a());
            }
        }
        for (n6 n6Var : f()) {
            if (!n6Var.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(n6Var.b());
                sb2.append(": ");
                sb2.append(n6Var.a());
            }
        }
        return sb2.toString();
    }

    public String k() {
        return this.f7752u;
    }

    public List l() {
        return this.C;
    }

    public String m() {
        return this.f7747p;
    }

    public List n() {
        return this.f7757z;
    }

    public final k o() {
        return this.f7733a;
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", MaxReward.DEFAULT_LABEL);
        if (this.f7749r.equals(string)) {
            this.f7735c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter a10 = ve.a(string, this.f7733a);
            if (a10 != null) {
                String a11 = ve.a(a10);
                if (!this.f7750s.equals(a11)) {
                    this.f7750s = a11;
                    this.f7733a.o().a(this.f7750s, string);
                }
            }
        }
    }

    public String p() {
        return this.f7750s;
    }

    public a q() {
        return this.f7734b;
    }

    public List r() {
        return this.f7756y;
    }

    public List s() {
        return this.B;
    }

    public sn t() {
        return this.F;
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.f7747p + ", displayName=" + this.f7748q + ", sdkAvailable=" + this.f7736d + ", sdkVersion=" + this.f7750s + ", adapterAvailable=" + this.f7737f + ", adapterVersion=" + this.f7751t + "}";
    }

    public String u() {
        return this.f7753v;
    }

    public String v() {
        return this.f7754w;
    }

    public Map w() {
        return this.D;
    }

    public b x() {
        if (!this.f7740i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.f7734b;
        if (aVar != a.COMPLETE && (aVar != a.INCOMPLETE_INTEGRATION || !C() || !y())) {
            return b.INVALID_INTEGRATION;
        }
        if (!this.f7733a.n0().c()) {
            return b.DISABLED;
        }
        if (!this.f7741j || (this.f7735c != MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() && this.f7735c != MaxAdapter.InitializationStatus.INITIALIZING.getCode())) {
            return b.READY;
        }
        return b.NOT_INITIALIZED;
    }

    public boolean y() {
        return this.f7737f;
    }

    public boolean z() {
        return this.f7738g;
    }

    private a a() {
        a aVar;
        if (this.f7736d) {
            if (this.f7737f) {
                aVar = a.COMPLETE;
            } else if (this.f7739h) {
                aVar = a.MISSING;
            } else {
                aVar = a.INCOMPLETE_INTEGRATION;
            }
        } else if (this.f7737f) {
            aVar = a.INCOMPLETE_INTEGRATION;
        } else {
            aVar = a.MISSING;
        }
        if (aVar == a.MISSING) {
            return aVar;
        }
        for (eh c10 : this.f7757z) {
            if (!c10.c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        for (n6 c11 : this.A) {
            if (!c11.c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        return (!this.f7746o || k.B0()) ? aVar : a.INVALID_INTEGRATION;
    }

    private List a(JSONObject jSONObject, String str, k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length() + jSONArray2.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new n6(jSONObject2, kVar));
            }
        }
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null);
            if (jSONObject3 != null && n6.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", (String) null), JsonUtils.getString(jSONObject3, "max_adapter_version", (String) null))) {
                arrayList.add(new n6(jSONObject3, kVar));
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject, k kVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f7749r.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            eh ehVar = new eh("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", k.k());
            if (ehVar.c()) {
                arrayList.add(ehVar);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                arrayList.add(new eh(next, jSONObject2.getString(next), k.k()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List a(MaxAdapter maxAdapter, boolean z10) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxRewardedInterstitialAdapter) {
            arrayList.add(MaxAdFormat.REWARDED_INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            if (z10) {
                arrayList.add(MaxAdFormat.MREC);
            }
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", (JSONArray) null), (List) null);
    }
}
