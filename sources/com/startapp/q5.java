package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.unity3d.ads.core.domain.InitializeAndroidBoldSDK;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
public class q5 extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16287a;

    /* renamed from: b  reason: collision with root package name */
    public final com.startapp.sdk.adsbase.e f16288b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f16289c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f16290d;

    /* renamed from: e  reason: collision with root package name */
    public String f16291e;

    /* renamed from: f  reason: collision with root package name */
    public String f16292f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16293g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f16294h = false;

    /* renamed from: i  reason: collision with root package name */
    public long f16295i;

    /* renamed from: j  reason: collision with root package name */
    public final long f16296j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f16297k;

    /* renamed from: l  reason: collision with root package name */
    public Boolean f16298l;

    /* renamed from: m  reason: collision with root package name */
    public String f16299m;

    /* renamed from: n  reason: collision with root package name */
    public Runnable f16300n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f16301o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f16302p = false;

    /* renamed from: q  reason: collision with root package name */
    public final LinkedHashMap<String, Float> f16303q = new LinkedHashMap<>();

    /* renamed from: r  reason: collision with root package name */
    public long f16304r;

    /* renamed from: s  reason: collision with root package name */
    public final Runnable f16305s = new a();

    /* renamed from: t  reason: collision with root package name */
    public final Runnable f16306t = new b();

    /* renamed from: u  reason: collision with root package name */
    public final Runnable f16307u = new c();

    /* renamed from: v  reason: collision with root package name */
    public final Runnable f16308v = new d();

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            q5 q5Var = q5.this;
            q5Var.f16289c.execute(q5Var.f16306t);
        }
    }

    /* compiled from: Sta */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            q5 q5Var = q5.this;
            if (!q5Var.f16293g) {
                try {
                    i3 i3Var = new i3(j3.f15952e);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed smart redirect hop info: ");
                    sb2.append(q5Var.f16302p ? "Page Finished" : InitializeAndroidBoldSDK.MSG_TIMEOUT);
                    i3Var.f15914d = sb2.toString();
                    i3Var.f15916f = q5Var.b();
                    i3Var.f15917g = q5Var.f16292f;
                    i3Var.a();
                } catch (Throwable th) {
                    i3.a(th);
                }
                try {
                    q5Var.f16301o = true;
                    com.startapp.sdk.adsbase.a.c(q5Var.f16287a);
                    q5Var.a();
                    if (!q5Var.f16297k || !MetaData.f17070k.U()) {
                        com.startapp.sdk.adsbase.a.b(q5Var.f16287a, q5Var.f16291e, q5Var.f16292f);
                    } else {
                        com.startapp.sdk.adsbase.a.a(q5Var.f16287a, q5Var.f16291e, q5Var.f16292f);
                    }
                    Runnable runnable = q5Var.f16300n;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Throwable th2) {
                    i3.a(th2);
                }
            }
        }
    }

    /* compiled from: Sta */
    public class c implements Runnable {
        public c() {
        }

        public void run() {
            q5 q5Var = q5.this;
            q5Var.f16289c.execute(q5Var.f16308v);
        }
    }

    /* compiled from: Sta */
    public class d implements Runnable {
        public d() {
        }

        public void run() {
            q5 q5Var = q5.this;
            if (!q5Var.f16301o && !q5Var.f16293g) {
                try {
                    q5Var.f16293g = true;
                    com.startapp.sdk.adsbase.a.c(q5Var.f16287a);
                    if (!q5Var.f16297k || !MetaData.f17070k.U()) {
                        com.startapp.sdk.adsbase.a.b(q5Var.f16287a, q5Var.f16291e, q5Var.f16292f);
                    } else {
                        com.startapp.sdk.adsbase.a.a(q5Var.f16287a, q5Var.f16291e, q5Var.f16292f);
                    }
                    Runnable runnable = q5Var.f16300n;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Throwable th) {
                    i3.a(th);
                }
            }
        }
    }

    /* compiled from: Sta */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16313a;

        public e(String str) {
            this.f16313a = str;
        }

        public void run() {
            q5 q5Var = q5.this;
            String str = this.f16313a;
            if (!q5Var.f16294h) {
                q5Var.f16304r = System.currentTimeMillis();
                q5Var.f16303q.put(str, Float.valueOf(-1.0f));
                q5Var.f16290d.postDelayed(q5Var.f16305s, q5Var.f16295i);
                q5Var.f16294h = true;
            }
            q5Var.f16302p = false;
            q5Var.a();
        }
    }

    /* compiled from: Sta */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16315a;

        public f(String str) {
            this.f16315a = str;
        }

        public void run() {
            q5 q5Var = q5.this;
            String str = this.f16315a;
            q5Var.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            q5Var.f16304r = currentTimeMillis;
            q5Var.f16303q.put(q5Var.f16291e, Float.valueOf(((float) (currentTimeMillis - q5Var.f16304r)) / 1000.0f));
            q5Var.f16303q.put(str, Float.valueOf(-1.0f));
            q5Var.f16291e = str;
        }
    }

    /* compiled from: Sta */
    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16317a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f16318b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f16319c;

        public g(String str, boolean z10, String str2) {
            this.f16317a = str;
            this.f16318b = z10;
            this.f16319c = str2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x008e A[Catch:{ all -> 0x00df }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0097 A[Catch:{ all -> 0x00df }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                com.startapp.q5 r0 = com.startapp.q5.this
                java.lang.String r1 = r8.f16317a
                boolean r2 = r8.f16318b
                java.lang.String r3 = r8.f16319c
                r0.getClass()
                boolean r4 = r0.f16301o     // Catch:{ all -> 0x00df }
                if (r4 != 0) goto L_0x00e3
                r4 = 1
                r0.f16293g = r4     // Catch:{ all -> 0x00df }
                android.content.Context r5 = r0.f16287a     // Catch:{ all -> 0x00df }
                com.startapp.sdk.adsbase.a.c((android.content.Context) r5)     // Catch:{ all -> 0x00df }
                r0.a()     // Catch:{ all -> 0x00df }
                android.content.Context r5 = r0.f16287a     // Catch:{ all -> 0x00df }
                if (r2 == 0) goto L_0x001f
                r1 = r3
            L_0x001f:
                r2 = 0
                com.startapp.sdk.adsbase.a.b(r5, r1, r2)     // Catch:{ all -> 0x00df }
                java.lang.String r1 = r0.f16299m     // Catch:{ all -> 0x00df }
                if (r1 == 0) goto L_0x0073
                java.lang.String r2 = ""
                boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x00df }
                if (r1 != 0) goto L_0x0073
                java.lang.String r1 = r0.f16291e     // Catch:{ all -> 0x00df }
                java.lang.String r1 = r1.toLowerCase()     // Catch:{ all -> 0x00df }
                java.lang.String r2 = r0.f16299m     // Catch:{ all -> 0x00df }
                java.lang.String r2 = r2.toLowerCase()     // Catch:{ all -> 0x00df }
                boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x00df }
                if (r1 != 0) goto L_0x0073
                com.startapp.i3 r1 = new com.startapp.i3     // Catch:{ all -> 0x00df }
                com.startapp.j3 r2 = com.startapp.j3.f15952e     // Catch:{ all -> 0x00df }
                r1.<init>((com.startapp.j3) r2)     // Catch:{ all -> 0x00df }
                java.lang.String r2 = "Wrong package reached"
                r1.f15914d = r2     // Catch:{ all -> 0x00df }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
                r2.<init>()     // Catch:{ all -> 0x00df }
                java.lang.String r3 = "Expected: "
                r2.append(r3)     // Catch:{ all -> 0x00df }
                java.lang.String r3 = r0.f16299m     // Catch:{ all -> 0x00df }
                r2.append(r3)     // Catch:{ all -> 0x00df }
                java.lang.String r3 = ", Link: "
                r2.append(r3)     // Catch:{ all -> 0x00df }
                java.lang.String r3 = r0.f16291e     // Catch:{ all -> 0x00df }
                r2.append(r3)     // Catch:{ all -> 0x00df }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00df }
                r1.f15915e = r2     // Catch:{ all -> 0x00df }
                java.lang.String r2 = r0.f16292f     // Catch:{ all -> 0x00df }
                r1.f15917g = r2     // Catch:{ all -> 0x00df }
                r1.a()     // Catch:{ all -> 0x00df }
                goto L_0x00d7
            L_0x0073:
                com.startapp.sdk.adsbase.remoteconfig.MetaData r1 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f17070k     // Catch:{ all -> 0x00df }
                com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig r1 = r1.analytics     // Catch:{ all -> 0x00df }
                boolean r1 = r1.k()     // Catch:{ all -> 0x00df }
                java.lang.String r2 = "firstSucceededSmartRedirect"
                r3 = 0
                if (r1 == 0) goto L_0x0089
                com.startapp.sdk.adsbase.e r1 = r0.f16288b     // Catch:{ all -> 0x00df }
                boolean r1 = r1.getBoolean(r2, r4)     // Catch:{ all -> 0x00df }
                if (r1 == 0) goto L_0x0089
                goto L_0x008a
            L_0x0089:
                r4 = 0
            L_0x008a:
                java.lang.Boolean r1 = r0.f16298l     // Catch:{ all -> 0x00df }
                if (r1 != 0) goto L_0x0097
                com.startapp.sdk.adsbase.remoteconfig.MetaData r1 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f17070k     // Catch:{ all -> 0x00df }
                com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig r1 = r1.analytics     // Catch:{ all -> 0x00df }
                float r1 = r1.j()     // Catch:{ all -> 0x00df }
                goto L_0x00a1
            L_0x0097:
                boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00df }
                if (r1 == 0) goto L_0x00a0
                r1 = 1120403456(0x42c80000, float:100.0)
                goto L_0x00a1
            L_0x00a0:
                r1 = 0
            L_0x00a1:
                if (r4 != 0) goto L_0x00b0
                double r4 = java.lang.Math.random()     // Catch:{ all -> 0x00df }
                r6 = 4636737291354636288(0x4059000000000000, double:100.0)
                double r4 = r4 * r6
                double r6 = (double) r1     // Catch:{ all -> 0x00df }
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r1 >= 0) goto L_0x00d7
            L_0x00b0:
                com.startapp.i3 r1 = new com.startapp.i3     // Catch:{ all -> 0x00df }
                com.startapp.j3 r4 = com.startapp.j3.f15960m     // Catch:{ all -> 0x00df }
                r1.<init>((com.startapp.j3) r4)     // Catch:{ all -> 0x00df }
                org.json.JSONArray r4 = r0.b()     // Catch:{ all -> 0x00df }
                r1.f15916f = r4     // Catch:{ all -> 0x00df }
                java.lang.String r4 = r0.f16292f     // Catch:{ all -> 0x00df }
                r1.f15917g = r4     // Catch:{ all -> 0x00df }
                r1.a()     // Catch:{ all -> 0x00df }
                com.startapp.sdk.adsbase.e r1 = r0.f16288b     // Catch:{ all -> 0x00df }
                com.startapp.sdk.adsbase.e$a r1 = r1.edit()     // Catch:{ all -> 0x00df }
                java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00df }
                r1.a((java.lang.String) r2, r4)     // Catch:{ all -> 0x00df }
                android.content.SharedPreferences$Editor r4 = r1.f17013a     // Catch:{ all -> 0x00df }
                r4.putBoolean(r2, r3)     // Catch:{ all -> 0x00df }
                r1.apply()     // Catch:{ all -> 0x00df }
            L_0x00d7:
                java.lang.Runnable r0 = r0.f16300n     // Catch:{ all -> 0x00df }
                if (r0 == 0) goto L_0x00e3
                r0.run()     // Catch:{ all -> 0x00df }
                goto L_0x00e3
            L_0x00df:
                r0 = move-exception
                com.startapp.i3.a((java.lang.Throwable) r0)
            L_0x00e3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.q5.g.run():void");
        }
    }

    /* compiled from: Sta */
    public class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16321a;

        public h(String str) {
            this.f16321a = str;
        }

        public void run() {
            q5 q5Var = q5.this;
            String str = this.f16321a;
            if (!q5Var.f16293g && !q5Var.f16301o && q5Var.f16291e.equals(str) && !com.startapp.sdk.adsbase.a.b(str)) {
                if (str.startsWith("http://") || str.startsWith("https://")) {
                    q5Var.f16302p = true;
                    q5Var.a(str);
                    synchronized (q5Var.f16290d) {
                        q5Var.f16290d.removeCallbacks(q5Var.f16307u);
                        q5Var.f16290d.postDelayed(q5Var.f16307u, q5Var.f16296j);
                    }
                }
            }
        }
    }

    public q5(Context context, com.startapp.sdk.adsbase.e eVar, Executor executor, Handler handler, long j10, long j11, boolean z10, Boolean bool, String str, String str2, String str3, Runnable runnable) {
        this.f16287a = context;
        this.f16288b = eVar;
        this.f16289c = new r7(executor);
        this.f16290d = handler;
        this.f16295i = j10;
        this.f16296j = j11;
        this.f16297k = z10;
        this.f16298l = bool;
        this.f16291e = str;
        this.f16299m = str2;
        this.f16292f = str3;
        this.f16300n = runnable;
    }

    public void a() {
        synchronized (this.f16290d) {
            this.f16290d.removeCallbacks(this.f16307u);
        }
    }

    public JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry next : this.f16303q.entrySet()) {
            String str = (String) next.getKey();
            Float f10 = (Float) next.getValue();
            JSONObject jSONObject = new JSONObject();
            try {
                a(str);
                jSONObject.put("time", String.valueOf(f10));
                jSONObject.put("url", str);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f16289c.execute(new h(str));
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f16289c.execute(new e(str));
    }

    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        a();
        if (str2 != null && !com.startapp.sdk.adsbase.a.b(str2) && com.startapp.sdk.adsbase.a.c(str2)) {
            i3 i3Var = new i3(j3.f15952e);
            i3Var.f15914d = "Failed smart redirect: " + i10;
            i3Var.f15915e = str2;
            i3Var.f15917g = this.f16292f;
            i3Var.a();
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!(webView == null || str == null)) {
            this.f16289c.execute(new f(str));
            if (j9.b(webView.getContext(), str)) {
                return true;
            }
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            boolean b10 = com.startapp.sdk.adsbase.a.b(lowerCase);
            boolean startsWith = lowerCase.startsWith("intent://");
            if (!b10 && !startsWith) {
                return false;
            }
            this.f16289c.execute(new g(str, startsWith, webView.getUrl()));
        }
        return true;
    }

    public final void a(String str) {
        Float f10 = this.f16303q.get(str);
        if (f10 == null || f10.floatValue() < 0.0f) {
            this.f16303q.put(str, Float.valueOf(((float) (System.currentTimeMillis() - this.f16304r)) / 1000.0f));
        }
    }
}
