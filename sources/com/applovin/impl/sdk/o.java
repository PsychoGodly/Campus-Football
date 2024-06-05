package com.applovin.impl.sdk;

import android.os.Build;
import com.applovin.impl.be;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.tr;
import com.applovin.impl.v;
import com.applovin.impl.ve;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinSdk;
import java.lang.Thread;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class o {

    /* renamed from: f  reason: collision with root package name */
    private static final int f11966f = ((int) TimeUnit.SECONDS.toMillis(30));

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f11967a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f11968b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c  reason: collision with root package name */
    private final Set f11969c = Collections.synchronizedSet(new HashSet());

    /* renamed from: d  reason: collision with root package name */
    protected final k f11970d;

    /* renamed from: e  reason: collision with root package name */
    protected final t f11971e;

    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f11972a;

        /* renamed from: com.applovin.impl.sdk.o$a$a  reason: collision with other inner class name */
        class C0140a implements Thread.UncaughtExceptionHandler {
            C0140a() {
            }

            public void uncaughtException(Thread thread, Throwable th) {
                a.this.f11972a.L();
                if (t.a()) {
                    a.this.f11972a.L().a("ErrorReporter", "Caught unhandled exception", th);
                }
            }
        }

        a(k kVar) {
            this.f11972a = kVar;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:error_reporter");
            thread.setDaemon(true);
            thread.setPriority(((Integer) this.f11972a.a(oj.T)).intValue());
            thread.setUncaughtExceptionHandler(new C0140a());
            return thread;
        }
    }

    public enum b {
        ANR("anr"),
        BLACK_VIEW("black_view"),
        CACHE_ERROR("cache_error"),
        CAUGHT_EXCEPTION("caught_exception"),
        CONSENT_FLOW_ERROR("consent_flow_error"),
        CRASH("crash"),
        DISPLAY_ERROR("display_error"),
        FILE_ERROR("file_error"),
        GENERIC("generic"),
        INTEGRATION_ERROR("integration_error"),
        MEDIA_ERROR("media_error"),
        NATIVE_ERROR("native_error"),
        NETWORK_ERROR("network_error"),
        TASK_EXCEPTION("task_exception"),
        TASK_LATENCY_ALERT("task_latency_alert"),
        TEMPLATE_ERROR("template_error"),
        WEB_VIEW_ERROR("web_view_error");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f11993a;

        private b(String str) {
            this.f11993a = str;
        }

        public String b() {
            return this.f11993a;
        }
    }

    public o(k kVar) {
        this.f11970d = kVar;
        this.f11971e = kVar.L();
        this.f11967a = Executors.newFixedThreadPool(1, new a(kVar));
    }

    private JSONObject b(b bVar, Object obj, Map map) {
        Map map2;
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putStringIfValid(jSONObject, "event_type", bVar.b());
        if (bVar == b.BLACK_VIEW || bVar == b.WEB_VIEW_ERROR || bVar == b.TEMPLATE_ERROR) {
            if (((Boolean) this.f11970d.a(oj.f10444x4)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "wvvc", String.valueOf(tr.d()));
                JsonUtils.putStringIfValid(jSONObject, "wvv", tr.c());
                JsonUtils.putStringIfValid(jSONObject, "wvpn", tr.b());
            }
            if (this.f11970d.y() != null) {
                JsonUtils.putStringIfValid(jSONObject, "oglv", this.f11970d.z().s());
            } else {
                JsonUtils.putStringIfValid(jSONObject, "oglv", this.f11970d.x().D());
            }
        }
        if (this.f11970d.y() != null) {
            JsonUtils.putStringIfValid(jSONObject, "platform", this.f11970d.z().u());
            map2 = this.f11970d.y().b();
        } else {
            JsonUtils.putStringIfValid(jSONObject, "platform", this.f11970d.x().v());
            map2 = this.f11970d.x().A();
        }
        JsonUtils.putObject(jSONObject, "first_install", map2.get("first_install_v2"));
        JsonUtils.putStringIfValid(jSONObject, "rid", UUID.randomUUID().toString());
        JsonUtils.putStringIfValid(jSONObject, "applovin_random_token", this.f11970d.c0());
        JsonUtils.putStringIfValid(jSONObject, "compass_random_token", this.f11970d.p());
        JsonUtils.putStringIfValid(jSONObject, "ts_ms", String.valueOf(System.currentTimeMillis()));
        JsonUtils.putStringIfValid(jSONObject, "cfug", String.valueOf(this.f11970d.q().getConsentFlowUserGeography()));
        a(obj, map);
        JsonUtils.putObject(jSONObject, "extra_parameters", map);
        JsonUtils.putStringIfValid(jSONObject, "sdk_version", String.valueOf(AppLovinSdk.VERSION));
        JsonUtils.putStringIfValid(jSONObject, "os", Build.VERSION.RELEASE);
        JsonUtils.putStringIfValid(jSONObject, "api_level", String.valueOf(Build.VERSION.SDK_INT));
        JsonUtils.putStringIfValid(jSONObject, "brand", Build.MANUFACTURER);
        JsonUtils.putStringIfValid(jSONObject, "brand_name", Build.BRAND);
        JsonUtils.putStringIfValid(jSONObject, "hardware", Build.HARDWARE);
        JsonUtils.putStringIfValid(jSONObject, "revision", Build.DEVICE);
        JsonUtils.putStringIfValid(jSONObject, "model", Build.MODEL);
        JsonUtils.putStringIfValid(jSONObject, "country", this.f11970d.q().getCountryCode());
        JsonUtils.putStringIfValid(jSONObject, "aei", String.valueOf(this.f11970d.a(oj.f10455z)));
        JsonUtils.putStringIfValid(jSONObject, "mei", String.valueOf(this.f11970d.a(oj.A)));
        JsonUtils.putStringIfValid(jSONObject, "md", (String) this.f11970d.a(oj.B));
        JsonUtils.putObject(jSONObject, "package_name", map2.get("package_name"));
        JsonUtils.putObject(jSONObject, "app_version", map2.get("app_version"));
        JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.f11970d.Q());
        JsonUtils.putInt(jSONObject, "installed_mediation_adapters_count", ve.a(this.f11970d).length());
        JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", v.b());
        return jSONObject;
    }

    private Map c(b bVar, Object obj, Map map) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", bVar.b());
        if (bVar == b.BLACK_VIEW || bVar == b.WEB_VIEW_ERROR || bVar == b.TEMPLATE_ERROR) {
            if (((Boolean) this.f11970d.a(oj.f10444x4)).booleanValue()) {
                CollectionUtils.putStringIfValid("wvvc", String.valueOf(tr.d()), hashMap);
                CollectionUtils.putStringIfValid("wvv", tr.c(), hashMap);
                CollectionUtils.putStringIfValid("wvpn", tr.b(), hashMap);
            }
            if (this.f11970d.y() != null) {
                CollectionUtils.putStringIfValid("oglv", this.f11970d.z().s(), hashMap);
            } else {
                CollectionUtils.putStringIfValid("oglv", this.f11970d.x().D(), hashMap);
            }
        }
        if (this.f11970d.y() != null) {
            hashMap.put("platform", this.f11970d.z().u());
        } else {
            hashMap.put("platform", this.f11970d.x().v());
        }
        hashMap.put("applovin_random_token", this.f11970d.c0());
        hashMap.put("compass_random_token", this.f11970d.p());
        hashMap.put("model", Build.MODEL);
        hashMap.put("brand", Build.MANUFACTURER);
        hashMap.put("brand_name", Build.BRAND);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("revision", Build.DEVICE);
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        CollectionUtils.putStringIfValid("ad_review_sdk_version", v.b(), hashMap);
        hashMap.put("aei", String.valueOf(this.f11970d.a(oj.f10455z)));
        hashMap.put("mei", String.valueOf(this.f11970d.a(oj.A)));
        hashMap.put("md", (String) this.f11970d.a(oj.B));
        a(hashMap);
        a(obj, (Map) hashMap);
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void d(b bVar, Object obj, Map map) {
        if (t.a()) {
            t tVar = this.f11971e;
            tVar.a("ErrorReporter", "Reporting " + bVar.b() + " with extra parameters " + map);
        }
        if (zp.a((Integer) this.f11970d.a(oj.f10351m))) {
            f(bVar, obj, map);
        }
        if (((Boolean) this.f11970d.a(oj.f10359n)).booleanValue()) {
            g(bVar, obj, map);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0079 A[Catch:{ all -> 0x00a1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f(com.applovin.impl.sdk.o.b r7, java.lang.Object r8, java.util.Map r9) {
        /*
            r6 = this;
            java.lang.String r0 = "ErrorReporter"
            r1 = 0
            java.net.URL r8 = r6.a((com.applovin.impl.sdk.o.b) r7, (java.lang.Object) r8, (java.util.Map) r9)     // Catch:{ all -> 0x006f }
            java.net.URLConnection r8 = r8.openConnection()     // Catch:{ all -> 0x006f }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ all -> 0x006f }
            int r1 = f11966f     // Catch:{ all -> 0x006d }
            r8.setConnectTimeout(r1)     // Catch:{ all -> 0x006d }
            r8.setReadTimeout(r1)     // Catch:{ all -> 0x006d }
            r1 = 0
            r8.setDefaultUseCaches(r1)     // Catch:{ all -> 0x006d }
            r8.setAllowUserInteraction(r1)     // Catch:{ all -> 0x006d }
            r8.setUseCaches(r1)     // Catch:{ all -> 0x006d }
            r2 = 1
            r8.setInstanceFollowRedirects(r2)     // Catch:{ all -> 0x006d }
            r8.setDoOutput(r1)     // Catch:{ all -> 0x006d }
            java.lang.String r1 = "POST"
            r8.setRequestMethod(r1)     // Catch:{ all -> 0x006d }
            int r1 = r8.getResponseCode()     // Catch:{ all -> 0x006d }
            boolean r2 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x006d }
            if (r2 == 0) goto L_0x005a
            com.applovin.impl.sdk.t r2 = r6.f11971e     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r3.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r4 = r7.b()     // Catch:{ all -> 0x006d }
            r3.append(r4)     // Catch:{ all -> 0x006d }
            java.lang.String r4 = " reported with code "
            r3.append(r4)     // Catch:{ all -> 0x006d }
            r3.append(r1)     // Catch:{ all -> 0x006d }
            java.lang.String r1 = " and extra parameters "
            r3.append(r1)     // Catch:{ all -> 0x006d }
            r3.append(r9)     // Catch:{ all -> 0x006d }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x006d }
            r2.a((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x006d }
        L_0x005a:
            java.util.Map r1 = r6.f11968b     // Catch:{ all -> 0x006d }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x006d }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x006d }
            r1.put(r7, r2)     // Catch:{ all -> 0x006d }
            com.applovin.impl.sdk.k r7 = r6.f11970d
            com.applovin.impl.zp.a((java.net.HttpURLConnection) r8, (com.applovin.impl.sdk.k) r7)
            goto L_0x00a0
        L_0x006d:
            r1 = move-exception
            goto L_0x0073
        L_0x006f:
            r8 = move-exception
            r5 = r1
            r1 = r8
            r8 = r5
        L_0x0073:
            boolean r2 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x00a1 }
            if (r2 == 0) goto L_0x009b
            com.applovin.impl.sdk.t r2 = r6.f11971e     // Catch:{ all -> 0x00a1 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a1 }
            r3.<init>()     // Catch:{ all -> 0x00a1 }
            java.lang.String r4 = "Failed to report "
            r3.append(r4)     // Catch:{ all -> 0x00a1 }
            java.lang.String r7 = r7.b()     // Catch:{ all -> 0x00a1 }
            r3.append(r7)     // Catch:{ all -> 0x00a1 }
            java.lang.String r7 = " with extra parameters "
            r3.append(r7)     // Catch:{ all -> 0x00a1 }
            r3.append(r9)     // Catch:{ all -> 0x00a1 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x00a1 }
            r2.d(r0, r7, r1)     // Catch:{ all -> 0x00a1 }
        L_0x009b:
            com.applovin.impl.sdk.k r7 = r6.f11970d
            com.applovin.impl.zp.a((java.net.HttpURLConnection) r8, (com.applovin.impl.sdk.k) r7)
        L_0x00a0:
            return
        L_0x00a1:
            r7 = move-exception
            com.applovin.impl.sdk.k r9 = r6.f11970d
            com.applovin.impl.zp.a((java.net.HttpURLConnection) r8, (com.applovin.impl.sdk.k) r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.o.f(com.applovin.impl.sdk.o$b, java.lang.Object, java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00bd A[Catch:{ all -> 0x00e5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g(com.applovin.impl.sdk.o.b r6, java.lang.Object r7, java.util.Map r8) {
        /*
            r5 = this;
            java.lang.String r0 = "ErrorReporter"
            com.applovin.impl.sdk.k r1 = r5.f11970d
            com.applovin.impl.oj r2 = com.applovin.impl.oj.f10375p
            java.lang.Object r1 = r1.a((com.applovin.impl.oj) r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            if (r2 != 0) goto L_0x0013
            return
        L_0x0013:
            com.applovin.impl.sdk.k r2 = r5.f11970d
            com.applovin.impl.oj r3 = com.applovin.impl.oj.f10367o
            java.lang.Object r2 = r2.a((com.applovin.impl.oj) r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            boolean r2 = com.applovin.impl.zp.a((java.lang.Integer) r2)
            if (r2 != 0) goto L_0x0024
            return
        L_0x0024:
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch:{ all -> 0x00b6 }
            r3.<init>(r1)     // Catch:{ all -> 0x00b6 }
            org.json.JSONObject r7 = r5.b(r6, r7, r8)     // Catch:{ all -> 0x00b6 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00b6 }
            java.lang.String r1 = "UTF-8"
            byte[] r7 = r7.getBytes(r1)     // Catch:{ all -> 0x00b6 }
            java.net.URLConnection r1 = r3.openConnection()     // Catch:{ all -> 0x00b6 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ all -> 0x00b6 }
            int r2 = f11966f     // Catch:{ all -> 0x00b3 }
            r1.setConnectTimeout(r2)     // Catch:{ all -> 0x00b3 }
            r1.setReadTimeout(r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/json; charset=utf-8"
            r1.setRequestProperty(r2, r3)     // Catch:{ all -> 0x00b3 }
            r2 = 0
            r1.setDefaultUseCaches(r2)     // Catch:{ all -> 0x00b3 }
            r1.setAllowUserInteraction(r2)     // Catch:{ all -> 0x00b3 }
            r1.setUseCaches(r2)     // Catch:{ all -> 0x00b3 }
            r2 = 1
            r1.setInstanceFollowRedirects(r2)     // Catch:{ all -> 0x00b3 }
            r1.setDoOutput(r2)     // Catch:{ all -> 0x00b3 }
            int r2 = r7.length     // Catch:{ all -> 0x00b3 }
            r1.setFixedLengthStreamingMode(r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "POST"
            r1.setRequestMethod(r2)     // Catch:{ all -> 0x00b3 }
            java.io.OutputStream r2 = r1.getOutputStream()     // Catch:{ all -> 0x00b3 }
            r2.write(r7)     // Catch:{ all -> 0x00b3 }
            r2.close()     // Catch:{ all -> 0x00b3 }
            int r7 = r1.getResponseCode()     // Catch:{ all -> 0x00b3 }
            boolean r2 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x00a0
            com.applovin.impl.sdk.t r2 = r5.f11971e     // Catch:{ all -> 0x00b3 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            r3.<init>()     // Catch:{ all -> 0x00b3 }
            java.lang.String r4 = r6.b()     // Catch:{ all -> 0x00b3 }
            r3.append(r4)     // Catch:{ all -> 0x00b3 }
            java.lang.String r4 = " reported with code "
            r3.append(r4)     // Catch:{ all -> 0x00b3 }
            r3.append(r7)     // Catch:{ all -> 0x00b3 }
            java.lang.String r7 = " and extra parameters "
            r3.append(r7)     // Catch:{ all -> 0x00b3 }
            r3.append(r8)     // Catch:{ all -> 0x00b3 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x00b3 }
            r2.a((java.lang.String) r0, (java.lang.String) r7)     // Catch:{ all -> 0x00b3 }
        L_0x00a0:
            java.util.Map r7 = r5.f11968b     // Catch:{ all -> 0x00b3 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b3 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00b3 }
            r7.put(r6, r2)     // Catch:{ all -> 0x00b3 }
            com.applovin.impl.sdk.k r6 = r5.f11970d
            com.applovin.impl.zp.a((java.net.HttpURLConnection) r1, (com.applovin.impl.sdk.k) r6)
            goto L_0x00e4
        L_0x00b3:
            r7 = move-exception
            r2 = r1
            goto L_0x00b7
        L_0x00b6:
            r7 = move-exception
        L_0x00b7:
            boolean r1 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x00e5 }
            if (r1 == 0) goto L_0x00df
            com.applovin.impl.sdk.t r1 = r5.f11971e     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            r3.<init>()     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = "Failed to report "
            r3.append(r4)     // Catch:{ all -> 0x00e5 }
            java.lang.String r6 = r6.b()     // Catch:{ all -> 0x00e5 }
            r3.append(r6)     // Catch:{ all -> 0x00e5 }
            java.lang.String r6 = " with extra parameters "
            r3.append(r6)     // Catch:{ all -> 0x00e5 }
            r3.append(r8)     // Catch:{ all -> 0x00e5 }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00e5 }
            r1.d(r0, r6, r7)     // Catch:{ all -> 0x00e5 }
        L_0x00df:
            com.applovin.impl.sdk.k r6 = r5.f11970d
            com.applovin.impl.zp.a((java.net.HttpURLConnection) r2, (com.applovin.impl.sdk.k) r6)
        L_0x00e4:
            return
        L_0x00e5:
            r6 = move-exception
            com.applovin.impl.sdk.k r7 = r5.f11970d
            com.applovin.impl.zp.a((java.net.HttpURLConnection) r2, (com.applovin.impl.sdk.k) r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.o.g(com.applovin.impl.sdk.o$b, java.lang.Object, java.util.Map):void");
    }

    public void a(String str, String str2, Throwable th) {
        a(str, str2, th, (Map) new HashMap());
    }

    public void a(String str, String str2, Throwable th, Map map) {
        a(str + ":" + str2, th, map);
    }

    public void a(String str, Throwable th) {
        a(str, th, (Map) new HashMap());
    }

    public void a(String str, Throwable th, Map map) {
        map.put("source", str);
        map.put("top_main_method", th.toString());
        a(b.CAUGHT_EXCEPTION, map);
    }

    public void a(String str, String str2, com.applovin.impl.sdk.ad.b bVar) {
        HashMap hashMap = new HashMap();
        if (bVar != null) {
            CollectionUtils.putStringIfValid("ad_size", bVar.getSize().toString(), hashMap);
            CollectionUtils.putStringIfValid("ad_id", String.valueOf(bVar.getAdIdNumber()), hashMap);
            CollectionUtils.putStringIfValid("dsp_name", bVar.getDspName(), hashMap);
            CollectionUtils.putStringIfValid("dsp_id", bVar.getDspId(), hashMap);
            CollectionUtils.putStringIfValid("ad_domain", bVar.getAdDomain(), hashMap);
            CollectionUtils.putStringIfValid("video_url", bVar.P(), hashMap);
        }
        hashMap.put("source", str);
        hashMap.put("top_main_method", str2);
        a(b.MEDIA_ERROR, (Map) hashMap);
    }

    public void a(String str, String str2, int i10) {
        a(str, str2, i10, new HashMap());
    }

    public void a(String str, String str2, int i10, HashMap hashMap) {
        if (i10 >= 400) {
            hashMap.put("source", str);
            hashMap.put("url", StringUtils.emptyIfNull(str2));
            hashMap.put("code", String.valueOf(i10));
            a(b.NETWORK_ERROR, (Map) hashMap);
        }
    }

    public void a(b bVar, String str) {
        a(bVar, str, (Map) new HashMap());
    }

    public void a(b bVar, String str, Map map) {
        map.put("source", str);
        a(bVar, map);
    }

    public void a(b bVar, String str, Map map, String str2) {
        if (!StringUtils.isValidString(str2) || this.f11969c.add(str2)) {
            map.put("source", str);
            a(bVar, str, map);
        }
    }

    public void a(b bVar, Map map) {
        a(bVar, (Object) null, map, 0);
    }

    public void a(b bVar, Map map, long j10) {
        a(bVar, (Object) null, map, j10);
    }

    public void a(b bVar, Object obj, Map map, long j10) {
        if (!a(bVar, j10)) {
            try {
                if (zp.h()) {
                    this.f11967a.execute(new l1(this, bVar, obj, map));
                } else {
                    d(bVar, obj, map);
                }
            } catch (Throwable th) {
                if (t.a()) {
                    t tVar = this.f11971e;
                    tVar.d("ErrorReporter", "Failed to report " + bVar.b() + " with extra parameters " + map, th);
                }
            }
        }
    }

    private URL a(b bVar, Object obj, Map map) {
        StringBuilder sb2 = new StringBuilder("https://ms.applovin.com/1.0/sdk/error");
        sb2.append("?");
        Iterator it = c(bVar, obj, map).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String encode = URLEncoder.encode((String) entry.getKey(), "UTF-8");
            String encode2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
            sb2.append(encode);
            sb2.append("=");
            sb2.append(encode2);
            if (it.hasNext()) {
                sb2.append("&");
            }
        }
        return new URL(sb2.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.util.Map r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r1 = 0
            android.content.Context r2 = com.applovin.impl.sdk.k.k()     // Catch:{ all -> 0x0018 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ all -> 0x0018 }
            android.content.Context r3 = com.applovin.impl.sdk.k.k()     // Catch:{ all -> 0x0018 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ all -> 0x0018 }
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001a
        L_0x0018:
            r3 = r0
        L_0x0019:
            r2 = 0
        L_0x001a:
            java.lang.String r4 = "package_name"
            r6.put(r4, r3)
            if (r2 == 0) goto L_0x0023
            java.lang.String r0 = r2.versionName
        L_0x0023:
            java.lang.String r3 = "app_version"
            r6.put(r3, r0)
            if (r2 == 0) goto L_0x002c
            int r1 = r2.versionCode
        L_0x002c:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "app_version_code"
            r6.put(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.o.a(java.util.Map):void");
    }

    private void a(Object obj, Map map) {
        if (obj == null) {
            obj = this.f11970d.E().a();
        }
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            map.put("fs_ad_network", "AppLovin");
            map.put("fs_ad_creative_id", Long.toString(((com.applovin.impl.sdk.ad.b) obj).getAdIdNumber()));
        } else if (obj instanceof be) {
            be beVar = (be) obj;
            map.put("fs_ad_network", beVar.getNetworkName());
            map.put("fs_ad_creative_id", beVar.getCreativeId());
        } else {
            map.put("fs_ad_network", "None");
            map.put("fs_ad_creative_id", "None");
        }
    }

    private boolean a(b bVar, long j10) {
        Long l10 = (Long) this.f11968b.get(bVar);
        return System.currentTimeMillis() - (l10 != null ? l10.longValue() : -1) < j10;
    }
}
