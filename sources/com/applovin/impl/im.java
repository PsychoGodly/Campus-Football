package com.applovin.impl;

import com.applovin.impl.qi;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class im extends xl {

    /* renamed from: k  reason: collision with root package name */
    private static final AtomicBoolean f8564k = new AtomicBoolean();

    /* renamed from: h  reason: collision with root package name */
    private final int f8565h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f8566i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public b f8567j;

    public interface b {
        void a(JSONObject jSONObject);
    }

    private class c extends xl {
        public c(k kVar) {
            super("TaskTimeoutFetchBasicSettings", kVar, true);
        }

        public void run() {
            if (im.this.f8567j != null) {
                if (t.a()) {
                    this.f13423c.b(this.f13422b, "Timing out fetch basic settings...");
                }
                im.this.a(new JSONObject());
            }
        }
    }

    public im(int i10, k kVar, b bVar) {
        super("TaskFetchBasicSettings", kVar, true);
        this.f8565h = i10;
        this.f8567j = bVar;
    }

    private String f() {
        return c4.a((String) this.f13421a.a(oj.H0), "5.0/i", b());
    }

    private String g() {
        return c4.a((String) this.f13421a.a(oj.G0), "5.0/i", b());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(41:0|1|2|(1:6)|7|(1:9)|10|(1:12)|13|(1:15)(1:16)|17|(1:19)(2:20|(1:22))|(1:26)|27|(1:29)|30|(1:32)(1:33)|34|(1:36)|37|38|(1:40)|41|42|(1:46)|47|48|(5:50|51|(1:57)|58|(1:63))(4:64|(1:70)|71|(1:76))|77|(2:79|(1:81))|82|(1:84)|85|(1:87)|88|(1:90)|91|(1:95)|96|(3:98|(1:100)|101)|107) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0285 */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x02a7 A[SYNTHETIC, Splitter:B:50:0x02a7] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0334 A[Catch:{ JSONException -> 0x048d }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x03c3 A[Catch:{ JSONException -> 0x048d }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x03ec A[Catch:{ JSONException -> 0x048d }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0407 A[Catch:{ JSONException -> 0x048d }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x041e A[Catch:{ JSONException -> 0x048d }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0454 A[Catch:{ JSONException -> 0x048d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject e() {
        /*
            r25 = this;
            r1 = r25
            java.lang.String r0 = "supported_abis"
            java.lang.String r2 = "screen_size_in"
            java.lang.String r3 = "is_tablet"
            java.lang.String r4 = "revision"
            java.lang.String r5 = "model"
            java.lang.String r6 = "hardware"
            java.lang.String r7 = "brand_name"
            java.lang.String r8 = "brand"
            java.lang.String r9 = "locale"
            java.lang.String r10 = "os"
            java.lang.String r11 = "platform"
            java.lang.String r12 = "IABTCF_AddtlConsent"
            java.lang.String r13 = "IABTCF_gdprApplies"
            java.lang.String r14 = "IABTCF_TCString"
            java.lang.String r15 = "target_sdk"
            r16 = r0
            java.lang.String r0 = "tg"
            r17 = r2
            java.lang.String r2 = "debug"
            r18 = r3
            java.lang.String r3 = "test_ads"
            r19 = r4
            java.lang.String r4 = "app_version"
            r20 = r5
            java.lang.String r5 = "package_name"
            r21 = r6
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            r22 = r7
            com.applovin.impl.sdk.k r7 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            r23 = r8
            com.applovin.impl.oj r8 = com.applovin.impl.oj.f10437w5     // Catch:{ JSONException -> 0x048d }
            java.lang.Object r7 = r7.a((com.applovin.impl.oj) r8)     // Catch:{ JSONException -> 0x048d }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ JSONException -> 0x048d }
            boolean r7 = r7.booleanValue()     // Catch:{ JSONException -> 0x048d }
            if (r7 != 0) goto L_0x005d
            com.applovin.impl.sdk.k r7 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            java.lang.Object r7 = r7.a((com.applovin.impl.oj) r8)     // Catch:{ JSONException -> 0x048d }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ JSONException -> 0x048d }
            boolean r7 = r7.booleanValue()     // Catch:{ JSONException -> 0x048d }
            if (r7 == 0) goto L_0x006a
        L_0x005d:
            java.lang.String r7 = "rid"
            java.util.UUID r8 = java.util.UUID.randomUUID()     // Catch:{ JSONException -> 0x048d }
            java.lang.String r8 = r8.toString()     // Catch:{ JSONException -> 0x048d }
            r6.put(r7, r8)     // Catch:{ JSONException -> 0x048d }
        L_0x006a:
            java.lang.String r7 = "sdk_version"
            java.lang.String r8 = com.applovin.sdk.AppLovinSdk.VERSION     // Catch:{ JSONException -> 0x048d }
            r6.put(r7, r8)     // Catch:{ JSONException -> 0x048d }
            java.lang.String r7 = "ad_review_sdk_version"
            java.lang.String r8 = com.applovin.impl.v.b()     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.utils.JsonUtils.putStringIfValid(r6, r7, r8)     // Catch:{ JSONException -> 0x048d }
            java.lang.String r7 = "init_count"
            int r8 = r1.f8565h     // Catch:{ JSONException -> 0x048d }
            r6.put(r7, r8)     // Catch:{ JSONException -> 0x048d }
            java.lang.String r7 = "server_installed_at"
            com.applovin.impl.sdk.k r8 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            r24 = r9
            com.applovin.impl.oj r9 = com.applovin.impl.oj.f10407t     // Catch:{ JSONException -> 0x048d }
            java.lang.Object r8 = r8.a((com.applovin.impl.oj) r9)     // Catch:{ JSONException -> 0x048d }
            r6.put(r7, r8)     // Catch:{ JSONException -> 0x048d }
            java.lang.String r7 = "legacy"
            com.applovin.impl.sdk.k r8 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            java.util.concurrent.atomic.AtomicBoolean r8 = r8.C0()     // Catch:{ JSONException -> 0x048d }
            boolean r8 = r8.get()     // Catch:{ JSONException -> 0x048d }
            r6.put(r7, r8)     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.k r7 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            boolean r7 = r7.z0()     // Catch:{ JSONException -> 0x048d }
            r8 = 1
            if (r7 == 0) goto L_0x00ad
            java.lang.String r7 = "first_install"
            r6.put(r7, r8)     // Catch:{ JSONException -> 0x048d }
        L_0x00ad:
            com.applovin.impl.sdk.k r7 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            boolean r7 = r7.w0()     // Catch:{ JSONException -> 0x048d }
            if (r7 != 0) goto L_0x00ba
            java.lang.String r7 = "first_install_v2"
            r6.put(r7, r8)     // Catch:{ JSONException -> 0x048d }
        L_0x00ba:
            java.lang.String r7 = "process_name"
            android.content.Context r9 = r25.a()     // Catch:{ JSONException -> 0x048d }
            java.lang.String r9 = com.applovin.impl.zp.b((android.content.Context) r9)     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.utils.JsonUtils.putStringIfValid(r6, r7, r9)     // Catch:{ JSONException -> 0x048d }
            java.lang.String r7 = "is_main_process"
            android.content.Context r9 = r25.a()     // Catch:{ JSONException -> 0x048d }
            java.lang.Boolean r9 = com.applovin.impl.zp.g(r9)     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.utils.JsonUtils.putBooleanIfValid(r6, r7, r9)     // Catch:{ JSONException -> 0x048d }
            java.lang.String r7 = "plugin_version"
            com.applovin.impl.sdk.k r9 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.oj r8 = com.applovin.impl.oj.U3     // Catch:{ JSONException -> 0x048d }
            java.lang.Object r8 = r9.a((com.applovin.impl.oj) r8)     // Catch:{ JSONException -> 0x048d }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.utils.JsonUtils.putStringIfValid(r6, r7, r8)     // Catch:{ JSONException -> 0x048d }
            java.lang.String r7 = "mediation_provider"
            com.applovin.impl.sdk.k r8 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            java.lang.String r8 = r8.Q()     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.utils.JsonUtils.putStringIfValid(r6, r7, r8)     // Catch:{ JSONException -> 0x048d }
            java.lang.String r7 = "mediation_provider_v2"
            com.applovin.impl.sdk.k r8 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            java.lang.String r8 = r8.A()     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.utils.JsonUtils.putStringIfValid(r6, r7, r8)     // Catch:{ JSONException -> 0x048d }
            java.lang.String r7 = "installed_mediation_adapters"
            com.applovin.impl.sdk.k r8 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            org.json.JSONArray r8 = com.applovin.impl.ve.a((com.applovin.impl.sdk.k) r8)     // Catch:{ JSONException -> 0x048d }
            r6.put(r7, r8)     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.k r7 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.m r7 = r7.y()     // Catch:{ JSONException -> 0x048d }
            if (r7 == 0) goto L_0x0117
            com.applovin.impl.sdk.k r7 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.m r7 = r7.y()     // Catch:{ JSONException -> 0x048d }
            java.util.Map r7 = r7.b()     // Catch:{ JSONException -> 0x048d }
            goto L_0x0121
        L_0x0117:
            com.applovin.impl.sdk.k r7 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.l r7 = r7.x()     // Catch:{ JSONException -> 0x048d }
            java.util.Map r7 = r7.A()     // Catch:{ JSONException -> 0x048d }
        L_0x0121:
            java.lang.Object r8 = r7.get(r5)     // Catch:{ JSONException -> 0x048d }
            r6.put(r5, r8)     // Catch:{ JSONException -> 0x048d }
            java.lang.Object r5 = r7.get(r4)     // Catch:{ JSONException -> 0x048d }
            r6.put(r4, r5)     // Catch:{ JSONException -> 0x048d }
            java.lang.Object r4 = r7.get(r3)     // Catch:{ JSONException -> 0x048d }
            r6.put(r3, r4)     // Catch:{ JSONException -> 0x048d }
            java.lang.Object r3 = r7.get(r2)     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r3)     // Catch:{ JSONException -> 0x048d }
            java.lang.Object r2 = r7.get(r0)     // Catch:{ JSONException -> 0x048d }
            r6.put(r0, r2)     // Catch:{ JSONException -> 0x048d }
            java.lang.Object r0 = r7.get(r15)     // Catch:{ JSONException -> 0x048d }
            r6.put(r15, r0)     // Catch:{ JSONException -> 0x048d }
            r0 = 0
            com.applovin.impl.sdk.k r2 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.C0()     // Catch:{ JSONException -> 0x048d }
            boolean r2 = r2.get()     // Catch:{ JSONException -> 0x048d }
            if (r2 == 0) goto L_0x0163
            com.applovin.impl.sdk.k r0 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.sdk.AppLovinSdkSettings r0 = r0.g0()     // Catch:{ JSONException -> 0x048d }
            java.util.List r0 = r0.getInitializationAdUnitIds()     // Catch:{ JSONException -> 0x048d }
            goto L_0x0175
        L_0x0163:
            com.applovin.impl.sdk.k r2 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.sdk.AppLovinSdkInitializationConfiguration r2 = r2.I()     // Catch:{ JSONException -> 0x048d }
            if (r2 == 0) goto L_0x0175
            com.applovin.impl.sdk.k r0 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.sdk.AppLovinSdkInitializationConfiguration r0 = r0.I()     // Catch:{ JSONException -> 0x048d }
            java.util.List r0 = r0.getAdUnitIds()     // Catch:{ JSONException -> 0x048d }
        L_0x0175:
            if (r0 == 0) goto L_0x018e
            int r2 = r0.size()     // Catch:{ JSONException -> 0x048d }
            if (r2 <= 0) goto L_0x018e
            java.util.List r0 = com.applovin.impl.sdk.utils.CollectionUtils.removeTrimmedEmptyStrings(r0)     // Catch:{ JSONException -> 0x048d }
            java.lang.String r2 = "ad_unit_ids"
            int r3 = r0.size()     // Catch:{ JSONException -> 0x048d }
            java.lang.String r0 = com.applovin.impl.sdk.utils.CollectionUtils.implode(r0, r3)     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r0)     // Catch:{ JSONException -> 0x048d }
        L_0x018e:
            java.lang.Object r0 = r7.get(r14)     // Catch:{ JSONException -> 0x048d }
            r6.put(r14, r0)     // Catch:{ JSONException -> 0x048d }
            java.lang.Object r0 = r7.get(r13)     // Catch:{ JSONException -> 0x048d }
            r6.put(r13, r0)     // Catch:{ JSONException -> 0x048d }
            java.lang.Object r0 = r7.get(r12)     // Catch:{ JSONException -> 0x048d }
            boolean r2 = r0 instanceof java.lang.String     // Catch:{ JSONException -> 0x048d }
            if (r2 == 0) goto L_0x01a9
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.utils.JsonUtils.putStringIfValid(r6, r12, r0)     // Catch:{ JSONException -> 0x048d }
        L_0x01a9:
            java.lang.String r0 = "consent_flow_info"
            com.applovin.impl.sdk.k r2 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.f4 r2 = r2.t()     // Catch:{ JSONException -> 0x048d }
            org.json.JSONObject r2 = r2.c()     // Catch:{ JSONException -> 0x048d }
            r6.put(r0, r2)     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.k r0 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.m r0 = r0.y()     // Catch:{ JSONException -> 0x048d }
            if (r0 == 0) goto L_0x01cb
            com.applovin.impl.sdk.k r0 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.m r0 = r0.y()     // Catch:{ JSONException -> 0x048d }
            java.util.Map r0 = r0.k()     // Catch:{ JSONException -> 0x048d }
            goto L_0x01d5
        L_0x01cb:
            com.applovin.impl.sdk.k r0 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.l r0 = r0.x()     // Catch:{ JSONException -> 0x048d }
            java.util.Map r0 = r0.G()     // Catch:{ JSONException -> 0x048d }
        L_0x01d5:
            java.lang.Object r2 = r0.get(r11)     // Catch:{ JSONException -> 0x048d }
            r6.put(r11, r2)     // Catch:{ JSONException -> 0x048d }
            java.lang.Object r2 = r0.get(r10)     // Catch:{ JSONException -> 0x048d }
            r6.put(r10, r2)     // Catch:{ JSONException -> 0x048d }
            r2 = r24
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r3)     // Catch:{ JSONException -> 0x048d }
            r2 = r23
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r3)     // Catch:{ JSONException -> 0x048d }
            r2 = r22
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r3)     // Catch:{ JSONException -> 0x048d }
            r2 = r21
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r3)     // Catch:{ JSONException -> 0x048d }
            r2 = r20
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r3)     // Catch:{ JSONException -> 0x048d }
            r2 = r19
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r3)     // Catch:{ JSONException -> 0x048d }
            r2 = r18
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r3)     // Catch:{ JSONException -> 0x048d }
            r2 = r17
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r3)     // Catch:{ JSONException -> 0x048d }
            r2 = r16
            java.lang.Object r0 = r0.get(r2)     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r0)     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.k r0 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.oj r2 = com.applovin.impl.oj.f10292e4     // Catch:{ JSONException -> 0x048d }
            java.lang.Object r0 = r0.a((com.applovin.impl.oj) r2)     // Catch:{ JSONException -> 0x048d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ JSONException -> 0x048d }
            boolean r0 = r0.booleanValue()     // Catch:{ JSONException -> 0x048d }
            if (r0 == 0) goto L_0x0253
            java.lang.String r0 = "mtl"
            com.applovin.impl.sdk.k r2 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.SessionTracker r2 = r2.f0()     // Catch:{ JSONException -> 0x048d }
            int r2 = r2.getLastTrimMemoryLevel()     // Catch:{ JSONException -> 0x048d }
            r6.put(r0, r2)     // Catch:{ JSONException -> 0x048d }
        L_0x0253:
            android.content.Context r0 = com.applovin.impl.sdk.k.k()     // Catch:{ all -> 0x0285 }
            java.lang.String r2 = "activity"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ all -> 0x0285 }
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch:{ all -> 0x0285 }
            android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo     // Catch:{ all -> 0x0285 }
            r2.<init>()     // Catch:{ all -> 0x0285 }
            if (r0 == 0) goto L_0x0285
            r0.getMemoryInfo(r2)     // Catch:{ all -> 0x0285 }
            java.lang.String r0 = "fm"
            long r3 = r2.availMem     // Catch:{ all -> 0x0285 }
            r6.put(r0, r3)     // Catch:{ all -> 0x0285 }
            java.lang.String r0 = "tm"
            long r3 = r2.totalMem     // Catch:{ all -> 0x0285 }
            r6.put(r0, r3)     // Catch:{ all -> 0x0285 }
            java.lang.String r0 = "lmt"
            long r3 = r2.threshold     // Catch:{ all -> 0x0285 }
            r6.put(r0, r3)     // Catch:{ all -> 0x0285 }
            java.lang.String r0 = "lm"
            boolean r2 = r2.lowMemory     // Catch:{ all -> 0x0285 }
            r6.put(r0, r2)     // Catch:{ all -> 0x0285 }
        L_0x0285:
            com.applovin.impl.sdk.k r0 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            java.util.Map r0 = r0.k0()     // Catch:{ JSONException -> 0x048d }
            if (r0 == 0) goto L_0x029d
            boolean r2 = r0.isEmpty()     // Catch:{ JSONException -> 0x048d }
            if (r2 != 0) goto L_0x029d
            java.lang.String r2 = "targeting_data"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x048d }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r3)     // Catch:{ JSONException -> 0x048d }
        L_0x029d:
            com.applovin.impl.sdk.k r0 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.m r0 = r0.y()     // Catch:{ JSONException -> 0x048d }
            java.lang.String r2 = "dnt"
            if (r0 == 0) goto L_0x0334
            com.applovin.impl.sdk.k r0 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.n r0 = r0.z()     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.l0$a r0 = r0.d()     // Catch:{ JSONException -> 0x048d }
            boolean r3 = r0.c()     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r3)     // Catch:{ JSONException -> 0x048d }
            java.lang.String r2 = "dnt_code"
            com.applovin.impl.l0$a$a r3 = r0.b()     // Catch:{ JSONException -> 0x048d }
            java.lang.String r3 = r3.b()     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r3)     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.y3$a r2 = com.applovin.impl.y3.c()     // Catch:{ JSONException -> 0x048d }
            android.content.Context r3 = r25.a()     // Catch:{ JSONException -> 0x048d }
            java.lang.Boolean r2 = r2.b(r3)     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.k r3 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.oj r4 = com.applovin.impl.oj.Q3     // Catch:{ JSONException -> 0x048d }
            java.lang.Object r3 = r3.a((com.applovin.impl.oj) r4)     // Catch:{ JSONException -> 0x048d }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ JSONException -> 0x048d }
            boolean r3 = r3.booleanValue()     // Catch:{ JSONException -> 0x048d }
            if (r3 == 0) goto L_0x02fc
            java.lang.String r3 = r0.a()     // Catch:{ JSONException -> 0x048d }
            boolean r3 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r3)     // Catch:{ JSONException -> 0x048d }
            if (r3 == 0) goto L_0x02fc
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x048d }
            boolean r3 = r3.equals(r2)     // Catch:{ JSONException -> 0x048d }
            if (r3 != 0) goto L_0x02fc
            java.lang.String r3 = "idfa"
            java.lang.String r0 = r0.a()     // Catch:{ JSONException -> 0x048d }
            r6.put(r3, r0)     // Catch:{ JSONException -> 0x048d }
        L_0x02fc:
            com.applovin.impl.sdk.k r0 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.n r0 = r0.z()     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.n$c r0 = r0.h()     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.k r3 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.oj r4 = com.applovin.impl.oj.J3     // Catch:{ JSONException -> 0x048d }
            java.lang.Object r3 = r3.a((com.applovin.impl.oj) r4)     // Catch:{ JSONException -> 0x048d }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ JSONException -> 0x048d }
            boolean r3 = r3.booleanValue()     // Catch:{ JSONException -> 0x048d }
            if (r3 == 0) goto L_0x03bb
            if (r0 == 0) goto L_0x03bb
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x048d }
            boolean r2 = r3.equals(r2)     // Catch:{ JSONException -> 0x048d }
            if (r2 != 0) goto L_0x03bb
            java.lang.String r2 = "idfv"
            java.lang.String r3 = r0.a()     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r3)     // Catch:{ JSONException -> 0x048d }
            java.lang.String r2 = "idfv_scope"
            int r0 = r0.b()     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r0)     // Catch:{ JSONException -> 0x048d }
            goto L_0x03bb
        L_0x0334:
            com.applovin.impl.sdk.k r0 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.l r0 = r0.x()     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.l0$a r0 = r0.f()     // Catch:{ JSONException -> 0x048d }
            boolean r3 = r0.c()     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r3)     // Catch:{ JSONException -> 0x048d }
            java.lang.String r2 = "dnt_code"
            com.applovin.impl.l0$a$a r3 = r0.b()     // Catch:{ JSONException -> 0x048d }
            java.lang.String r3 = r3.b()     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r3)     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.y3$a r2 = com.applovin.impl.y3.c()     // Catch:{ JSONException -> 0x048d }
            android.content.Context r3 = r25.a()     // Catch:{ JSONException -> 0x048d }
            java.lang.Boolean r2 = r2.b(r3)     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.k r3 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.oj r4 = com.applovin.impl.oj.Q3     // Catch:{ JSONException -> 0x048d }
            java.lang.Object r3 = r3.a((com.applovin.impl.oj) r4)     // Catch:{ JSONException -> 0x048d }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ JSONException -> 0x048d }
            boolean r3 = r3.booleanValue()     // Catch:{ JSONException -> 0x048d }
            if (r3 == 0) goto L_0x0389
            java.lang.String r3 = r0.a()     // Catch:{ JSONException -> 0x048d }
            boolean r3 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r3)     // Catch:{ JSONException -> 0x048d }
            if (r3 == 0) goto L_0x0389
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x048d }
            boolean r3 = r3.equals(r2)     // Catch:{ JSONException -> 0x048d }
            if (r3 != 0) goto L_0x0389
            java.lang.String r3 = "idfa"
            java.lang.String r0 = r0.a()     // Catch:{ JSONException -> 0x048d }
            r6.put(r3, r0)     // Catch:{ JSONException -> 0x048d }
        L_0x0389:
            com.applovin.impl.sdk.k r0 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.l r0 = r0.x()     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.l$b r0 = r0.B()     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.k r3 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.oj r4 = com.applovin.impl.oj.J3     // Catch:{ JSONException -> 0x048d }
            java.lang.Object r3 = r3.a((com.applovin.impl.oj) r4)     // Catch:{ JSONException -> 0x048d }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ JSONException -> 0x048d }
            boolean r3 = r3.booleanValue()     // Catch:{ JSONException -> 0x048d }
            if (r3 == 0) goto L_0x03bb
            if (r0 == 0) goto L_0x03bb
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x048d }
            boolean r2 = r3.equals(r2)     // Catch:{ JSONException -> 0x048d }
            if (r2 != 0) goto L_0x03bb
            java.lang.String r2 = "idfv"
            java.lang.String r3 = r0.f11725a     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r3)     // Catch:{ JSONException -> 0x048d }
            java.lang.String r2 = "idfv_scope"
            int r0 = r0.f11726b     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r0)     // Catch:{ JSONException -> 0x048d }
        L_0x03bb:
            com.applovin.impl.sdk.k r0 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.sdk.AppLovinUserSegment r0 = r0.r0()     // Catch:{ JSONException -> 0x048d }
            if (r0 == 0) goto L_0x03dc
            com.applovin.impl.sdk.k r0 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.sdk.AppLovinUserSegment r0 = r0.r0()     // Catch:{ JSONException -> 0x048d }
            java.lang.String r0 = r0.getName()     // Catch:{ JSONException -> 0x048d }
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r0)     // Catch:{ JSONException -> 0x048d }
            if (r2 == 0) goto L_0x03dc
            java.lang.String r2 = "user_segment_name"
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.encodeUriString(r0)     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r0)     // Catch:{ JSONException -> 0x048d }
        L_0x03dc:
            com.applovin.impl.sdk.k r0 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.oj r2 = com.applovin.impl.oj.M3     // Catch:{ JSONException -> 0x048d }
            java.lang.Object r0 = r0.a((com.applovin.impl.oj) r2)     // Catch:{ JSONException -> 0x048d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ JSONException -> 0x048d }
            boolean r0 = r0.booleanValue()     // Catch:{ JSONException -> 0x048d }
            if (r0 == 0) goto L_0x03f7
            java.lang.String r0 = "compass_random_token"
            com.applovin.impl.sdk.k r2 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            java.lang.String r2 = r2.p()     // Catch:{ JSONException -> 0x048d }
            r6.put(r0, r2)     // Catch:{ JSONException -> 0x048d }
        L_0x03f7:
            com.applovin.impl.sdk.k r0 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.oj r2 = com.applovin.impl.oj.O3     // Catch:{ JSONException -> 0x048d }
            java.lang.Object r0 = r0.a((com.applovin.impl.oj) r2)     // Catch:{ JSONException -> 0x048d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ JSONException -> 0x048d }
            boolean r0 = r0.booleanValue()     // Catch:{ JSONException -> 0x048d }
            if (r0 == 0) goto L_0x0412
            java.lang.String r0 = "applovin_random_token"
            com.applovin.impl.sdk.k r2 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            java.lang.String r2 = r2.c0()     // Catch:{ JSONException -> 0x048d }
            r6.put(r0, r2)     // Catch:{ JSONException -> 0x048d }
        L_0x0412:
            com.applovin.impl.sdk.k r0 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.xn r0 = r0.n0()     // Catch:{ JSONException -> 0x048d }
            boolean r0 = r0.c()     // Catch:{ JSONException -> 0x048d }
            if (r0 == 0) goto L_0x0424
            java.lang.String r0 = "test_mode"
            r2 = 1
            r6.put(r0, r2)     // Catch:{ JSONException -> 0x048d }
        L_0x0424:
            com.applovin.impl.sdk.k r0 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.xn r0 = r0.n0()     // Catch:{ JSONException -> 0x048d }
            java.util.List r0 = r0.b()     // Catch:{ JSONException -> 0x048d }
            if (r0 == 0) goto L_0x043b
            boolean r2 = r0.isEmpty()     // Catch:{ JSONException -> 0x048d }
            if (r2 != 0) goto L_0x043b
            java.lang.String r2 = "test_mode_networks"
            r6.put(r2, r0)     // Catch:{ JSONException -> 0x048d }
        L_0x043b:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.k r2 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.sdk.AppLovinSdkSettings r2 = r2.g0()     // Catch:{ JSONException -> 0x048d }
            java.util.Map r2 = r2.getExtraParameters()     // Catch:{ JSONException -> 0x048d }
            r0.<init>(r2)     // Catch:{ JSONException -> 0x048d }
            java.lang.String r2 = "sdk_extra_parameters"
            r6.put(r2, r0)     // Catch:{ JSONException -> 0x048d }
            int r0 = r1.f8565h     // Catch:{ JSONException -> 0x048d }
            r2 = 1
            if (r0 <= r2) goto L_0x04aa
            com.applovin.impl.sdk.k r0 = r1.f13421a     // Catch:{ JSONException -> 0x048d }
            com.applovin.impl.sdk.array.ArrayService r0 = r0.l()     // Catch:{ JSONException -> 0x048d }
            java.lang.Boolean r2 = r0.getIsDirectDownloadEnabled()     // Catch:{ JSONException -> 0x048d }
            if (r2 == 0) goto L_0x0469
            java.lang.String r2 = "ah_dd_enabled"
            java.lang.Boolean r3 = r0.getIsDirectDownloadEnabled()     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r3)     // Catch:{ JSONException -> 0x048d }
        L_0x0469:
            java.lang.String r2 = "ah_sdk_version_code"
            long r3 = r0.getAppHubVersionCode()     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r3)     // Catch:{ JSONException -> 0x048d }
            java.lang.String r2 = "ah_random_user_token"
            java.lang.String r3 = r0.getRandomUserToken()     // Catch:{ JSONException -> 0x048d }
            java.lang.String r3 = com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(r3)     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r3)     // Catch:{ JSONException -> 0x048d }
            java.lang.String r2 = "ah_sdk_package_name"
            java.lang.String r0 = r0.getAppHubPackageName()     // Catch:{ JSONException -> 0x048d }
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(r0)     // Catch:{ JSONException -> 0x048d }
            r6.put(r2, r0)     // Catch:{ JSONException -> 0x048d }
            goto L_0x04aa
        L_0x048d:
            r0 = move-exception
            boolean r2 = com.applovin.impl.sdk.t.a()
            if (r2 == 0) goto L_0x049d
            com.applovin.impl.sdk.t r2 = r1.f13423c
            java.lang.String r3 = r1.f13422b
            java.lang.String r4 = "Failed to create JSON body"
            r2.a(r3, r4, r0)
        L_0x049d:
            com.applovin.impl.sdk.k r2 = r1.f13421a
            com.applovin.impl.sdk.o r2 = r2.B()
            java.lang.String r3 = r1.f13422b
            java.lang.String r4 = "createJSONBody"
            r2.a((java.lang.String) r3, (java.lang.String) r4, (java.lang.Throwable) r0)
        L_0x04aa:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.im.e():org.json.JSONObject");
    }

    /* access modifiers changed from: protected */
    public Map h() {
        HashMap hashMap = new HashMap();
        if (!((Boolean) this.f13421a.a(oj.f10445x5)).booleanValue() && !((Boolean) this.f13421a.a(oj.f10437w5)).booleanValue()) {
            hashMap.put("rid", UUID.randomUUID().toString());
        }
        if (!((Boolean) this.f13421a.a(oj.f10333j5)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f13421a.d0());
        }
        Boolean b10 = y3.b().b(a());
        if (b10 != null) {
            hashMap.put("huc", b10.toString());
        }
        Boolean b11 = y3.c().b(a());
        if (b11 != null) {
            hashMap.put("aru", b11.toString());
        }
        Boolean b12 = y3.a().b(a());
        if (b12 != null) {
            hashMap.put("dns", b12.toString());
        }
        return hashMap;
    }

    public void run() {
        if (!x3.k() && f8564k.compareAndSet(false, true)) {
            try {
                t5.a.a(k.k());
            } catch (Throwable th) {
                if (t.a()) {
                    this.f13423c.a(this.f13422b, "Cannot update security provider", th);
                }
            }
        }
        Map h10 = h();
        a.C0139a b10 = com.applovin.impl.sdk.network.a.a(this.f13421a).b(g()).a(f()).b(h10).a(e()).b(((Boolean) this.f13421a.a(oj.I5)).booleanValue()).c("POST").a((Object) new JSONObject()).a(((Integer) this.f13421a.a(oj.f10347l3)).intValue()).b(((Integer) this.f13421a.a(oj.f10371o3)).intValue());
        k kVar = this.f13421a;
        oj ojVar = oj.f10339k3;
        com.applovin.impl.sdk.network.a a10 = b10.c(((Integer) kVar.a(ojVar)).intValue()).e(((Boolean) this.f13421a.a(oj.f10443x3)).booleanValue()).a(qi.a.a(((Integer) this.f13421a.a(oj.f10373o5)).intValue())).f(true).a();
        this.f13421a.l0().a((xl) new c(this.f13421a), sm.b.TIMEOUT, ((long) ((Integer) this.f13421a.a(ojVar)).intValue()) + 250);
        a aVar = new a(a10, this.f13421a, d());
        aVar.c(oj.G0);
        aVar.b(oj.H0);
        this.f13421a.l0().a((xl) aVar);
    }

    class a extends en {
        a(com.applovin.impl.sdk.network.a aVar, k kVar, boolean z10) {
            super(aVar, kVar, z10);
        }

        public void a(String str, JSONObject jSONObject, int i10) {
            im.this.a(jSONObject);
            this.f13421a.B().a("fetchBasicSettings", str, i10);
        }

        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (t.a()) {
                t tVar = this.f13423c;
                String str3 = this.f13422b;
                tVar.b(str3, "Unable to fetch basic SDK settings: server returned " + i10);
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            im.this.a(jSONObject);
            this.f13421a.B().a("fetchBasicSettings", str, i10, (HashMap) CollectionUtils.hashMap("error_message", str2));
        }
    }

    /* access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        b bVar;
        synchronized (this.f8566i) {
            bVar = this.f8567j;
            this.f8567j = null;
        }
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }
}
