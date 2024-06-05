package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;
import com.onesignal.a4;
import com.onesignal.d4;
import com.onesignal.g0;
import com.onesignal.s2;
import com.onesignal.u3;
import com.onesignal.v3;
import com.onesignal.w4;
import com.onesignal.x1;
import com.onesignal.y3;
import com.onesignal.z1;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OneSignal */
public class k3 {
    /* access modifiers changed from: private */
    public static v1 A = new u1();
    private static t B;
    private static s2.b C = new j();
    private static g1 D = new g1();
    private static c3 E = new d3();
    /* access modifiers changed from: private */
    public static o2 F = new o2();
    private static z2 G = new z2(A);
    private static a3 H = new a3(F, A);
    private static l3 I = new w3();
    /* access modifiers changed from: private */
    public static t2 J;
    /* access modifiers changed from: private */
    public static ia.e K;
    private static s2 L;
    /* access modifiers changed from: private */
    public static j2 M;
    private static la.c N;
    private static z1 O;
    private static final Object P = new u();
    public static String Q = "native";
    /* access modifiers changed from: private */
    public static String R;
    private static OSUtils S = new OSUtils();
    /* access modifiers changed from: private */
    public static boolean T;
    /* access modifiers changed from: private */
    public static boolean U;
    /* access modifiers changed from: private */
    public static boolean V;
    private static boolean W;
    /* access modifiers changed from: private */
    public static boolean X;
    /* access modifiers changed from: private */
    public static g0.d Y;
    private static Collection<JSONArray> Z = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    private static c1 f27902a;

    /* renamed from: a0  reason: collision with root package name */
    private static HashSet<String> f27903a0 = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private static c1 f27904b;
    /* access modifiers changed from: private */

    /* renamed from: b0  reason: collision with root package name */
    public static final ArrayList<t0> f27905b0 = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private static m0 f27906c;

    /* renamed from: c0  reason: collision with root package name */
    private static r f27907c0;

    /* renamed from: d  reason: collision with root package name */
    private static m0 f27908d;

    /* renamed from: d0  reason: collision with root package name */
    private static l2 f27909d0;

    /* renamed from: e  reason: collision with root package name */
    private static List<n0> f27910e = new ArrayList();

    /* renamed from: e0  reason: collision with root package name */
    static l2 f27911e0;

    /* renamed from: f  reason: collision with root package name */
    static Context f27912f;

    /* renamed from: f0  reason: collision with root package name */
    private static h2<k2, m2> f27913f0;

    /* renamed from: g  reason: collision with root package name */
    static WeakReference<Activity> f27914g;

    /* renamed from: g0  reason: collision with root package name */
    private static OSSubscriptionState f27915g0;

    /* renamed from: h  reason: collision with root package name */
    static String f27916h;

    /* renamed from: h0  reason: collision with root package name */
    static OSSubscriptionState f27917h0;

    /* renamed from: i  reason: collision with root package name */
    static String f27918i;

    /* renamed from: i0  reason: collision with root package name */
    private static h2<v2, w2> f27919i0;

    /* renamed from: j  reason: collision with root package name */
    private static r0 f27920j = r0.NONE;

    /* renamed from: j0  reason: collision with root package name */
    private static y0 f27921j0;

    /* renamed from: k  reason: collision with root package name */
    private static r0 f27922k = r0.WARN;

    /* renamed from: k0  reason: collision with root package name */
    static y0 f27923k0;

    /* renamed from: l  reason: collision with root package name */
    private static String f27924l = null;

    /* renamed from: l0  reason: collision with root package name */
    private static h2<x0, z0> f27925l0;

    /* renamed from: m  reason: collision with root package name */
    private static String f27926m = null;

    /* renamed from: m0  reason: collision with root package name */
    private static q2 f27927m0;

    /* renamed from: n  reason: collision with root package name */
    private static String f27928n = null;

    /* renamed from: n0  reason: collision with root package name */
    static q2 f27929n0;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static int f27930o = a.e.API_PRIORITY_OTHER;

    /* renamed from: o0  reason: collision with root package name */
    private static h2<p2, r2> f27931o0;

    /* renamed from: p  reason: collision with root package name */
    static ka.a f27932p = null;

    /* renamed from: p0  reason: collision with root package name */
    private static q0 f27933p0;

    /* renamed from: q  reason: collision with root package name */
    static a1 f27934q;

    /* renamed from: q0  reason: collision with root package name */
    private static a4 f27935q0;

    /* renamed from: r  reason: collision with root package name */
    static y0 f27936r;

    /* renamed from: s  reason: collision with root package name */
    static x0 f27937s;

    /* renamed from: t  reason: collision with root package name */
    static u0 f27938t;

    /* renamed from: u  reason: collision with root package name */
    private static boolean f27939u;

    /* renamed from: v  reason: collision with root package name */
    private static boolean f27940v;

    /* renamed from: w  reason: collision with root package name */
    private static i0 f27941w = i0.APP_CLOSE;

    /* renamed from: x  reason: collision with root package name */
    private static n4 f27942x;

    /* renamed from: y  reason: collision with root package name */
    private static l4 f27943y;

    /* renamed from: z  reason: collision with root package name */
    private static m4 f27944z;

    /* compiled from: OneSignal */
    class a implements Runnable {
        a() {
        }

        public void run() {
            try {
                k3.N1();
            } catch (JSONException e10) {
                k3.b(r0.FATAL, "FATAL Error registering device!", e10);
            }
        }
    }

    /* compiled from: OneSignal */
    class a0 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f27945a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e1 f27946b;

        a0(String str, e1 e1Var) {
            this.f27945a = str;
            this.f27946b = e1Var;
        }

        public void run() {
            k3.A.d("Running sendUniqueOutcome() operation from pending queue.");
            k3.l2(this.f27945a, this.f27946b);
        }
    }

    /* compiled from: OneSignal */
    public interface a1 {
        void a(Context context, g2 g2Var);
    }

    /* compiled from: OneSignal */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f27947a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f27948b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c1 f27949c;

        b(String str, String str2, c1 c1Var) {
            this.f27947a = str;
            this.f27948b = str2;
            this.f27949c = c1Var;
        }

        public void run() {
            k3.A.d("Running setSMSNumber() operation from a pending task queue.");
            k3.C2(this.f27947a, this.f27948b, this.f27949c);
        }
    }

    /* compiled from: OneSignal */
    class b0 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f27950a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f27951b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e1 f27952c;

        b0(String str, float f10, e1 e1Var) {
            this.f27950a = str;
            this.f27951b = f10;
            this.f27952c = e1Var;
        }

        public void run() {
            k3.A.d("Running sendOutcomeWithValue() operation from pending queue.");
            k3.h2(this.f27950a, this.f27951b, this.f27952c);
        }
    }

    /* compiled from: OneSignal */
    public static class b1 {

        /* renamed from: a  reason: collision with root package name */
        private i1 f27953a;

        /* renamed from: b  reason: collision with root package name */
        private String f27954b;

        b1(i1 i1Var, String str) {
            this.f27953a = i1Var;
            this.f27954b = str;
        }

        public String a() {
            return this.f27954b;
        }

        public i1 b() {
            return this.f27953a;
        }
    }

    /* compiled from: OneSignal */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c1 f27955a;

        c(c1 c1Var) {
            this.f27955a = c1Var;
        }

        public void run() {
            k3.A.d("Running  logoutSMSNumber() operation from pending task queue.");
            k3.r1(this.f27955a);
        }
    }

    /* compiled from: OneSignal */
    class c0 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j1 f27956a;

        c0(j1 j1Var) {
            this.f27956a = j1Var;
        }

        public void run() {
            k3.A.d("Running setInAppMessageLifecycleHandler() operation from pending queue.");
            k3.r2(this.f27956a);
        }
    }

    /* compiled from: OneSignal */
    public interface c1 {
        void a(JSONObject jSONObject);

        void d(b1 b1Var);
    }

    /* compiled from: OneSignal */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f27957a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f27958b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m0 f27959c;

        d(String str, String str2, m0 m0Var) {
            this.f27957a = str;
            this.f27958b = str2;
            this.f27959c = m0Var;
        }

        public void run() {
            k3.A.d("Running setEmail() operation from a pending task queue.");
            k3.n2(this.f27957a, this.f27958b, this.f27959c);
        }
    }

    /* compiled from: OneSignal */
    class d0 implements g0.b {
        d0() {
        }

        public void a(g0.d dVar) {
            g0.d unused = k3.Y = dVar;
            boolean unused2 = k3.U = true;
            k3.M1();
        }

        public g0.f getType() {
            return g0.f.STARTUP;
        }
    }

    /* compiled from: OneSignal */
    public interface d1 {
        void b(String str);

        void h(w0 w0Var);
    }

    /* compiled from: OneSignal */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0 f27960a;

        e(m0 m0Var) {
            this.f27960a = m0Var;
        }

        public void run() {
            k3.A.d("Running  logoutEmail() operation from pending task queue.");
            k3.q1(this.f27960a);
        }
    }

    /* compiled from: OneSignal */
    class e0 implements a4.a {
        e0() {
        }

        public void a(String str, int i10) {
            v1 d10 = k3.A;
            d10.d("registerForPushToken completed with id: " + str + " status: " + i10);
            if (i10 < 1) {
                if (y3.f() == null && (k3.f27930o == 1 || k3.I1(k3.f27930o))) {
                    int unused = k3.f27930o = i10;
                }
            } else if (k3.I1(k3.f27930o)) {
                int unused2 = k3.f27930o = i10;
            }
            String unused3 = k3.R = str;
            boolean unused4 = k3.T = true;
            k3.d0(k3.f27912f).k(str);
            k3.M1();
        }
    }

    /* compiled from: OneSignal */
    public interface e1 {
        void e(i2 i2Var);
    }

    /* compiled from: OneSignal */
    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f27961a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d1 f27962b;

        f(String str, d1 d1Var) {
            this.f27961a = str;
            this.f27962b = d1Var;
        }

        public void run() {
            k3.A.d("Running setLanguage() operation from pending task queue.");
            k3.t2(this.f27961a, this.f27962b);
        }
    }

    /* compiled from: OneSignal */
    class f0 implements u3.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f27963a;

        f0(boolean z10) {
            this.f27963a = z10;
        }

        public void a(u3.f fVar) {
            boolean unused = k3.X = false;
            String str = fVar.f28242a;
            if (str != null) {
                k3.f27918i = str;
            }
            k3.F.r(fVar, k3.K, k3.J, k3.A);
            k3.z1();
            l0.g(k3.f27912f, fVar.f28247f);
            if (this.f27963a) {
                k3.L1();
            }
        }
    }

    /* compiled from: OneSignal */
    public interface f1 {
        void a(JSONObject jSONObject);

        void f(JSONObject jSONObject);
    }

    /* compiled from: OneSignal */
    class g implements y3.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d1 f27964a;

        g(d1 d1Var) {
            this.f27964a = d1Var;
        }

        public void a(y3.c cVar) {
            this.f27964a.h(new w0(cVar.f28458a, cVar.f28459b));
        }

        public void b(String str) {
            this.f27964a.b(str);
        }
    }

    /* compiled from: OneSignal */
    class g0 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0 f27965a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f27966b;

        g0(r0 r0Var, String str) {
            this.f27965a = r0Var;
            this.f27966b = str;
        }

        public void run() {
            if (k3.Z() != null) {
                new AlertDialog.Builder(k3.Z()).setTitle(this.f27965a.toString()).setMessage(this.f27966b).show();
            }
        }
    }

    /* compiled from: OneSignal */
    enum g1 {
        PERMISSION_GRANTED,
        PERMISSION_DENIED,
        LOCATION_PERMISSIONS_MISSING_MANIFEST,
        ERROR
    }

    /* compiled from: OneSignal */
    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f27972a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f27973b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s0 f27974c;

        h(String str, String str2, s0 s0Var) {
            this.f27972a = str;
            this.f27973b = str2;
            this.f27974c = s0Var;
        }

        public void run() {
            k3.A.d("Running setExternalUserId() operation from pending task queue.");
            k3.p2(this.f27972a, this.f27973b, this.f27974c);
        }
    }

    /* compiled from: OneSignal */
    class h0 implements Runnable {
        h0() {
        }

        public void run() {
            k3.A.d("Running onAppLostFocus() operation from a pending task queue.");
            k3.H();
        }
    }

    /* compiled from: OneSignal */
    public interface h1 {
        void n(boolean z10);
    }

    /* compiled from: OneSignal */
    class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f27975a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j0 f27976b;

        i(JSONObject jSONObject, j0 j0Var) {
            this.f27975a = jSONObject;
            this.f27976b = j0Var;
        }

        public void run() {
            k3.A.d("Running sendTags() operation from pending task queue.");
            k3.k2(this.f27975a, this.f27976b);
        }
    }

    /* compiled from: OneSignal */
    public enum i0 {
        NOTIFICATION_CLICK,
        APP_OPEN,
        APP_CLOSE;

        public boolean a() {
            return equals(APP_CLOSE);
        }

        public boolean c() {
            return equals(APP_OPEN);
        }

        public boolean d() {
            return equals(NOTIFICATION_CLICK);
        }
    }

    /* compiled from: OneSignal */
    public enum i1 {
        VALIDATION,
        REQUIRES_SMS_AUTH,
        INVALID_OPERATION,
        NETWORK
    }

    /* compiled from: OneSignal */
    class j implements s2.b {
        j() {
        }

        public void a(List<ja.a> list) {
            if (k3.M == null) {
                k3.a(r0.WARN, "OneSignal onSessionEnding called before init!");
            }
            if (k3.M != null) {
                k3.M.e();
            }
            k3.m0().g(list);
        }
    }

    /* compiled from: OneSignal */
    public interface j0 {
        void a(JSONObject jSONObject);

        void i(j1 j1Var);
    }

    /* compiled from: OneSignal */
    public static class j1 {

        /* renamed from: a  reason: collision with root package name */
        private String f27986a;

        /* renamed from: b  reason: collision with root package name */
        private int f27987b;

        j1(int i10, String str) {
            this.f27986a = str;
            this.f27987b = i10;
        }

        public int a() {
            return this.f27987b;
        }

        public String b() {
            return this.f27986a;
        }
    }

    /* compiled from: OneSignal */
    class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f27988a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j0 f27989b;

        k(JSONObject jSONObject, j0 j0Var) {
            this.f27988a = jSONObject;
            this.f27989b = j0Var;
        }

        public void run() {
            if (this.f27988a == null) {
                k3.A.a("Attempted to send null tags");
                j0 j0Var = this.f27989b;
                if (j0Var != null) {
                    j0Var.i(new j1(-1, "Attempted to send null tags"));
                    return;
                }
                return;
            }
            JSONObject jSONObject = y3.i(false).f28382b;
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> keys = this.f27988a.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    Object opt = this.f27988a.opt(next);
                    if (!(opt instanceof JSONArray)) {
                        if (!(opt instanceof JSONObject)) {
                            if (!this.f27988a.isNull(next)) {
                                if (!MaxReward.DEFAULT_LABEL.equals(opt)) {
                                    jSONObject2.put(next, opt.toString());
                                }
                            }
                            if (jSONObject != null && jSONObject.has(next)) {
                                jSONObject2.put(next, MaxReward.DEFAULT_LABEL);
                            }
                        }
                    }
                    r0 r0Var = r0.ERROR;
                    k3.a(r0Var, "Omitting key '" + next + "'! sendTags DO NOT supported nested values!");
                } catch (Throwable unused) {
                }
            }
            if (!jSONObject2.toString().equals(JsonUtils.EMPTY_JSON)) {
                v1 d10 = k3.A;
                d10.d("Available tags to send: " + jSONObject2.toString());
                y3.t(jSONObject2, this.f27989b);
                return;
            }
            k3.A.d("Send tags ended successfully");
            j0 j0Var2 = this.f27989b;
            if (j0Var2 != null) {
                j0Var2.a(jSONObject);
            }
        }
    }

    /* compiled from: OneSignal */
    public enum k0 {
        VALIDATION,
        REQUIRES_EMAIL_AUTH,
        INVALID_OPERATION,
        NETWORK
    }

    /* compiled from: OneSignal */
    class l extends v3.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f1 f27995a;

        l(f1 f1Var) {
            this.f27995a = f1Var;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:(1:3)|4|5|6|7|13) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
            r2.printStackTrace();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(int r2, java.lang.String r3, java.lang.Throwable r4) {
            /*
                r1 = this;
                java.lang.String r0 = "create notification failed"
                com.onesignal.k3.p1(r0, r2, r4, r3)
                com.onesignal.k3$f1 r4 = r1.f27995a
                if (r4 == 0) goto L_0x0027
                if (r2 != 0) goto L_0x000d
                java.lang.String r3 = "{\"error\": \"HTTP no response error\"}"
            L_0x000d:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0016 }
                r2.<init>(r3)     // Catch:{ all -> 0x0016 }
                r4.f(r2)     // Catch:{ all -> 0x0016 }
                goto L_0x0027
            L_0x0016:
                com.onesignal.k3$f1 r2 = r1.f27995a     // Catch:{ JSONException -> 0x0023 }
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0023 }
                java.lang.String r4 = "{\"error\": \"Unknown response!\"}"
                r3.<init>(r4)     // Catch:{ JSONException -> 0x0023 }
                r2.f(r3)     // Catch:{ JSONException -> 0x0023 }
                goto L_0x0027
            L_0x0023:
                r2 = move-exception
                r2.printStackTrace()
            L_0x0027:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.k3.l.a(int, java.lang.String, java.lang.Throwable):void");
        }

        public void b(String str) {
            v1 d10 = k3.A;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("HTTP create notification success: ");
            sb2.append(str != null ? str : "null");
            d10.d(sb2.toString());
            if (this.f27995a != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("errors")) {
                        this.f27995a.f(jSONObject);
                    } else {
                        this.f27995a.a(new JSONObject(str));
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* compiled from: OneSignal */
    public static class l0 {

        /* renamed from: a  reason: collision with root package name */
        private k0 f27996a;

        /* renamed from: b  reason: collision with root package name */
        private String f27997b;

        l0(k0 k0Var, String str) {
            this.f27996a = k0Var;
            this.f27997b = str;
        }

        public String a() {
            return this.f27997b;
        }
    }

    /* compiled from: OneSignal */
    class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t0 f27998a;

        m(t0 t0Var) {
            this.f27998a = t0Var;
        }

        public void run() {
            k3.A.d("Running getTags() operation from pending queue.");
            k3.M0(this.f27998a);
        }
    }

    /* compiled from: OneSignal */
    public interface m0 {
        void j(l0 l0Var);

        void onSuccess();
    }

    /* compiled from: OneSignal */
    class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t0 f27999a;

        n(t0 t0Var) {
            this.f27999a = t0Var;
        }

        public void run() {
            synchronized (k3.f27905b0) {
                k3.f27905b0.add(this.f27999a);
                if (k3.f27905b0.size() <= 1) {
                    k3.Y1();
                }
            }
        }
    }

    /* compiled from: OneSignal */
    interface n0 {
        void a(i0 i0Var);
    }

    /* compiled from: OneSignal */
    class o implements Runnable {
        o() {
        }

        public void run() {
            JSONObject jSONObject;
            w4.e i10 = y3.i(!k3.V);
            if (i10.f28381a) {
                boolean unused = k3.V = true;
            }
            synchronized (k3.f27905b0) {
                Iterator it = k3.f27905b0.iterator();
                while (it.hasNext()) {
                    t0 t0Var = (t0) it.next();
                    if (i10.f28382b != null) {
                        if (!i10.toString().equals(JsonUtils.EMPTY_JSON)) {
                            jSONObject = i10.f28382b;
                            t0Var.c(jSONObject);
                        }
                    }
                    jSONObject = null;
                    t0Var.c(jSONObject);
                }
                k3.f27905b0.clear();
            }
        }
    }

    /* compiled from: OneSignal */
    public static class o0 {

        /* renamed from: a  reason: collision with root package name */
        private p0 f28000a;

        /* renamed from: b  reason: collision with root package name */
        private String f28001b;

        o0(p0 p0Var, String str) {
            this.f28000a = p0Var;
            this.f28001b = str;
        }

        public String a() {
            return this.f28001b;
        }

        public p0 b() {
            return this.f28000a;
        }
    }

    /* compiled from: OneSignal */
    class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f2 f28002a;

        p(f2 f2Var) {
            this.f28002a = f2Var;
        }

        public void run() {
            k3.f27937s.m(this.f28002a);
        }
    }

    /* compiled from: OneSignal */
    public enum p0 {
        REQUIRES_EXTERNAL_ID_AUTH,
        INVALID_OPERATION,
        NETWORK
    }

    /* compiled from: OneSignal */
    class q extends v3.g {
        q() {
        }

        /* access modifiers changed from: package-private */
        public void a(int i10, String str, Throwable th) {
            k3.p1("sending Notification Opened Failed", i10, th, str);
        }
    }

    /* compiled from: OneSignal */
    private static class q0 {

        /* renamed from: a  reason: collision with root package name */
        JSONArray f28007a;

        /* renamed from: b  reason: collision with root package name */
        boolean f28008b;

        /* renamed from: c  reason: collision with root package name */
        v3.g f28009c;

        q0(JSONArray jSONArray) {
            this.f28007a = jSONArray;
        }
    }

    /* compiled from: OneSignal */
    class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f28010a;

        r(boolean z10) {
            this.f28010a = z10;
        }

        public void run() {
            k3.A.d("Running setSubscription() operation from pending queue.");
            k3.M(this.f28010a);
        }
    }

    /* compiled from: OneSignal */
    public enum r0 {
        NONE,
        FATAL,
        ERROR,
        WARN,
        INFO,
        DEBUG,
        VERBOSE
    }

    /* compiled from: OneSignal */
    class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f28019a;

        s(boolean z10) {
            this.f28019a = z10;
        }

        public void run() {
            k3.A.d("Running setLocationShared() operation from pending task queue.");
            k3.v2(this.f28019a);
        }
    }

    /* compiled from: OneSignal */
    public interface s0 {
        void a(JSONObject jSONObject);

        void g(o0 o0Var);
    }

    /* compiled from: OneSignal */
    class t implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z0 f28020a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f28021b;

        t(z0 z0Var, boolean z10) {
            this.f28020a = z0Var;
            this.f28021b = z10;
        }

        public void run() {
            k3.A.d("Running promptLocation() operation from pending queue.");
            k3.G1(this.f28020a, this.f28021b);
        }
    }

    /* compiled from: OneSignal */
    public interface t0 {
        void c(JSONObject jSONObject);
    }

    /* compiled from: OneSignal */
    class u {
        u() {
        }
    }

    /* compiled from: OneSignal */
    public interface u0 {
        void k(d1 d1Var);
    }

    /* compiled from: OneSignal */
    class v extends g0.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z0 f28022a;

        v(z0 z0Var) {
            this.f28022a = z0Var;
        }

        public void a(g0.d dVar) {
            if (!k3.H2("promptLocation()") && dVar != null) {
                y3.D(dVar);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(g1 g1Var) {
            super.b(g1Var);
            z0 z0Var = this.f28022a;
            if (z0Var != null) {
                z0Var.a(g1Var);
            }
        }

        public g0.f getType() {
            return g0.f.PROMPT_LOCATION;
        }
    }

    /* compiled from: OneSignal */
    interface v0 {
        void a(String str, boolean z10);
    }

    /* compiled from: OneSignal */
    class w implements Runnable {
        w() {
        }

        public void run() {
            k3.A.d("Running clearOneSignalNotifications() operation from pending queue.");
            k3.J();
        }
    }

    /* compiled from: OneSignal */
    public static class w0 {

        /* renamed from: a  reason: collision with root package name */
        private int f28023a;

        /* renamed from: b  reason: collision with root package name */
        private String f28024b;

        w0(int i10, String str) {
            this.f28023a = i10;
            this.f28024b = str;
        }

        public String a() {
            return this.f28024b;
        }
    }

    /* compiled from: OneSignal */
    class x implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f28025a;

        x(int i10) {
            this.f28025a = i10;
        }

        public void run() {
            k3.A.d("Running removeNotification() operation from pending queue.");
            k3.R1(this.f28025a);
        }
    }

    /* compiled from: OneSignal */
    public interface x0 {
        void m(f2 f2Var);
    }

    /* compiled from: OneSignal */
    class y implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f28026a;

        y(boolean z10) {
            this.f28026a = z10;
        }

        public void run() {
            k3.A.d("Running pauseInAppMessages() operation from pending queue.");
            k3.C1(this.f28026a);
        }
    }

    /* compiled from: OneSignal */
    public interface y0 {
        void l(g2 g2Var);
    }

    /* compiled from: OneSignal */
    class z implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f28027a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e1 f28028b;

        z(String str, e1 e1Var) {
            this.f28027a = str;
            this.f28028b = e1Var;
        }

        public void run() {
            k3.A.d("Running sendOutcome() operation from pending queue.");
            k3.g2(this.f28027a, this.f28028b);
        }
    }

    /* compiled from: OneSignal */
    interface z0 {
        void a(g1 g1Var);
    }

    static {
        u2 u2Var = new u2();
        J = u2Var;
        ia.e eVar = new ia.e(u2Var, A, E);
        K = eVar;
        L = new s2(C, eVar, A);
    }

    public static void A(k2 k2Var) {
        if (f27912f == null) {
            A.a("OneSignal.initWithContext has not been called. Could not add permission observer");
            return;
        }
        x0().a(k2Var);
        if (b0(f27912f).b(p0(f27912f))) {
            OSPermissionChangedInternalObserver.a(b0(f27912f));
        }
    }

    static o2 A0() {
        return F;
    }

    public static void A1(r0 r0Var, String str) {
        a(r0Var, str);
    }

    static void A2(a1 a1Var) {
        if (f27934q == null) {
            f27934q = a1Var;
        }
    }

    public static void B(p2 p2Var) {
        if (f27912f == null) {
            A.a("OneSignal.initWithContext has not been called. Could not add sms subscription observer");
            return;
        }
        E0().a(p2Var);
        if (c0(f27912f).b(q0(f27912f))) {
            OSSMSSubscriptionChangedInternalObserver.a(c0(f27912f));
        }
    }

    static u3.f B0() {
        return F.d();
    }

    static void B1(Activity activity, JSONArray jSONArray) {
        try {
            Intent b10 = x.f28388a.a(activity, jSONArray.getJSONObject(0)).b();
            if (b10 != null) {
                v1 v1Var = A;
                v1Var.f("SDK running startActivity with Intent: " + b10);
                activity.startActivity(b10);
                return;
            }
            A.f("SDK not showing an Activity automatically due to it's settings.");
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static void B2(boolean z10) {
        if (A0().g()) {
            A.e("setRequiresUserPrivacyConsent already called by remote params!, ignoring user set");
        } else if (!X1() || z10) {
            A0().p(z10);
        } else {
            a(r0.ERROR, "Cannot change requiresUserPrivacyConsent() from TRUE to FALSE");
        }
    }

    public static void C(v2 v2Var) {
        if (f27912f == null) {
            A.a("OneSignal.initWithContext has not been called. Could not add subscription observer");
            return;
        }
        L0().a(v2Var);
        if (d0(f27912f).a(s0(f27912f))) {
            OSSubscriptionChangedInternalObserver.a(d0(f27912f));
        }
    }

    static String C0() {
        if (f27928n == null && f27912f != null) {
            f27928n = t3.f(t3.f28204a, "PREFS_OS_SMS_ID", (String) null);
        }
        if (TextUtils.isEmpty(f27928n)) {
            return null;
        }
        return f27928n;
    }

    public static void C1(boolean z10) {
        if (f27912f == null) {
            A.a("Waiting initWithContext. Moving pauseInAppMessages() operation to a pending task queue.");
            H.c(new y(z10));
            return;
        }
        n0().v0(!z10);
    }

    public static void C2(String str, String str2, c1 c1Var) {
        if (H.g("setSMSNumber()")) {
            A.a("Waiting for remote params. Moving setSMSNumber() operation to a pending task queue.");
            H.c(new b(str, str2, c1Var));
        } else if (!H2("setSMSNumber()")) {
            if (TextUtils.isEmpty(str)) {
                if (c1Var != null) {
                    c1Var.d(new b1(i1.VALIDATION, "SMS number is invalid"));
                }
                A.a("SMS number is invalid");
            } else if (!B0().f28244c || !(str2 == null || str2.length() == 0)) {
                f27902a = c1Var;
                c0(f27912f).i(str);
                y3.z(str, str2);
            } else {
                if (c1Var != null) {
                    c1Var.d(new b1(i1.REQUIRES_SMS_AUTH, "SMS authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard."));
                }
                A.a("SMS authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard.");
            }
        }
    }

    public static void D(Map<String, Object> map) {
        n0().C(map);
    }

    static q2 D0() {
        return c0(f27912f);
    }

    public static void D1(JSONObject jSONObject, f1 f1Var) {
        if (!H2("postNotification()")) {
            try {
                if (!jSONObject.has("app_id")) {
                    jSONObject.put("app_id", F0());
                }
                if (jSONObject.has("app_id")) {
                    v3.j("notifications/", jSONObject, new l(f1Var));
                } else if (f1Var != null) {
                    f1Var.f(new JSONObject().put("error", "Missing app_id"));
                }
            } catch (JSONException e10) {
                A.c("HTTP create notification json exception!", e10);
                if (f1Var != null) {
                    try {
                        f1Var.f(new JSONObject("{'error': 'HTTP create notification json exception!'}"));
                    } catch (JSONException e11) {
                        e11.printStackTrace();
                    }
                }
            }
        }
    }

    private static void D2(boolean z10) {
        b.c((Application) f27912f);
        if (z10) {
            f27932p = new ka.a(J);
            t3.o();
            r3 e02 = e0();
            z1 z1Var = new z1(e02, A);
            O = z1Var;
            z1Var.h();
            n0().G();
            if (N == null) {
                N = new la.c(A, I, e02, J);
            }
            L.g();
            w0().d();
        }
    }

    static void E(String str) {
        i0 i0Var = i0.NOTIFICATION_CLICK;
        f27941w = i0Var;
        L.j(i0Var, str);
    }

    static h2<p2, r2> E0() {
        if (f27931o0 == null) {
            f27931o0 = new h2<>("onSMSSubscriptionChanged", true);
        }
        return f27931o0;
    }

    public static void E1(boolean z10, h1 h1Var) {
        q0.f28095a.i(z10, h1Var);
    }

    private static void E2(Context context) {
        String string;
        ApplicationInfo a10 = j.f27861a.a(context);
        if (a10 != null && (string = a10.metaData.getString("com.onesignal.PrivacyConsent")) != null) {
            B2("ENABLE".equalsIgnoreCase(string));
        }
    }

    static boolean F() {
        if (F.v()) {
            return OSUtils.a(f27912f);
        }
        return true;
    }

    static String F0() {
        return G0(f27912f);
    }

    public static void F1() {
        G1((z0) null, false);
    }

    static boolean F2(b2 b2Var) {
        if (!h1()) {
            A1(r0.INFO, "App is in background, show notification");
            return false;
        } else if (f27936r == null) {
            A1(r0.INFO, "No NotificationWillShowInForegroundHandler setup, show notification");
            return false;
        } else if (!b2Var.n()) {
            return true;
        } else {
            A1(r0.INFO, "Not firing notificationWillShowInForegroundHandler for restored notifications");
            return false;
        }
    }

    static boolean G(r0 r0Var) {
        return r0Var.compareTo(f27920j) < 1 || r0Var.compareTo(f27922k) < 1;
    }

    private static String G0(Context context) {
        if (context == null) {
            return null;
        }
        return t3.f(t3.f28204a, "GT_APP_ID", (String) null);
    }

    static void G1(z0 z0Var, boolean z10) {
        if (H.g("promptLocation()")) {
            A.a("Waiting for remote params. Moving promptLocation() operation to a pending queue.");
            H.c(new t(z0Var, z10));
        } else if (!H2("promptLocation()")) {
            g0.g(f27912f, true, z10, new v(z0Var));
        }
    }

    private static boolean G2(Activity activity, JSONArray jSONArray) {
        if (f27940v) {
            return false;
        }
        try {
            return new e2(activity, jSONArray.getJSONObject(0)).a();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return true;
        }
    }

    static void H() {
        if (!f27940v) {
            l4 l4Var = f27943y;
            if (l4Var != null) {
                l4Var.c();
            }
            m0().a();
            e2();
        }
    }

    private static String H0(Context context) {
        if (context == null) {
            return null;
        }
        return t3.f(t3.f28204a, "GT_PLAYER_ID", (String) null);
    }

    public static void H1(boolean z10) {
        boolean P2 = P2();
        F.u(z10);
        if (!P2 && z10 && f27907c0 != null) {
            a(r0.VERBOSE, "Privacy consent provided, reassigning all delayed init params and attempting init again...");
            J1();
        }
    }

    static boolean H2(String str) {
        if (!X1()) {
            return false;
        }
        if (str == null) {
            return true;
        }
        r0 r0Var = r0.WARN;
        a(r0Var, "Method " + str + " was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.userProvidedPrivacyConsent()");
        return true;
    }

    static void I(i0 i0Var) {
        for (n0 a10 : new ArrayList(f27910e)) {
            a10.a(i0Var);
        }
    }

    public static String I0() {
        return "040808";
    }

    /* access modifiers changed from: private */
    public static boolean I1(int i10) {
        return i10 < -6;
    }

    private static boolean I2() {
        if (h1() && k1()) {
            return true;
        }
        return false;
    }

    public static void J() {
        z1 z1Var;
        if (H.g("clearOneSignalNotifications()") || (z1Var = O) == null) {
            A.a("Waiting for remote params. Moving clearOneSignalNotifications() operation to a pending queue.");
            H.c(new w());
            return;
        }
        z1Var.i(new WeakReference(f27912f));
    }

    static s2 J0() {
        return L;
    }

    private static boolean J1() {
        Context context;
        String str;
        if (f27939u) {
            return false;
        }
        r rVar = f27907c0;
        if (rVar == null) {
            str = F0();
            context = f27912f;
            A.a("Trying to continue OneSignal with null delayed params");
        } else {
            str = rVar.a();
            context = f27907c0.b();
        }
        v1 v1Var = A;
        v1Var.d("reassignDelayedInitParams with appContext: " + f27912f);
        f27907c0 = null;
        m2(str);
        if (f27939u) {
            return true;
        }
        if (context == null) {
            A.a("Trying to continue OneSignal with null delayed params context");
            return false;
        }
        e1(context);
        return true;
    }

    static void J2(boolean z10) {
        v1 v1Var = A;
        v1Var.d("OneSignal startLocationShared: " + z10);
        A0().o(z10);
        if (!z10) {
            A.d("OneSignal is shareLocation set false, clearing last location!");
            y3.b();
        }
    }

    public static void K(Collection<String> collection, j0 j0Var) {
        if (!H2("deleteTags()")) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (String put : collection) {
                    jSONObject.put(put, MaxReward.DEFAULT_LABEL);
                }
                k2(jSONObject, j0Var);
            } catch (Throwable th) {
                b(r0.ERROR, "Failed to generate JSON for deleteTags.", th);
            }
        }
    }

    static t2 K0() {
        return J;
    }

    static void K1() {
        b0(f27912f).e();
    }

    private static void K2() {
        g0.g(f27912f, false, false, new d0());
    }

    public static void L(JSONArray jSONArray, j0 j0Var) {
        if (!H2("deleteTags()")) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    jSONObject.put(jSONArray.getString(i10), MaxReward.DEFAULT_LABEL);
                }
                k2(jSONObject, j0Var);
            } catch (Throwable th) {
                b(r0.ERROR, "Failed to generate JSON for deleteTags.", th);
            }
        }
    }

    static h2<v2, w2> L0() {
        if (f27919i0 == null) {
            f27919i0 = new h2<>("onOSSubscriptionChanged", true);
        }
        return f27919i0;
    }

    /* access modifiers changed from: private */
    public static void L1() {
        y0().a(f27912f, f27918i, new e0());
    }

    private static void L2() {
        if (!W) {
            W = true;
            if (f27940v && y3.h()) {
                U = false;
            }
            K2();
            T = false;
            if (B0() != null) {
                L1();
            } else {
                s1(f27916h, R0(), true);
            }
        }
    }

    public static void M(boolean z10) {
        if (H.g("setSubscription()")) {
            A.a("Waiting for remote params. Moving setSubscription() operation to a pending queue.");
            H.c(new r(z10));
        } else if (!H2("setSubscription()")) {
            d0(f27912f).j(z10);
            y3.A(!z10);
        }
    }

    public static void M0(t0 t0Var) {
        if (H.g("getTags()")) {
            A.a("Waiting for remote params. Moving getTags() operation to a pending queue.");
            H.c(new m(t0Var));
        } else if (!H2("getTags()")) {
            if (t0Var == null) {
                A.a("getTags called with null GetTagsHandler!");
            } else {
                new Thread(new n(t0Var), "OS_GETTAGS").start();
            }
        }
    }

    /* access modifiers changed from: private */
    public static void M1() {
        v1 v1Var = A;
        v1Var.d("registerUser:registerForPushFired:" + T + ", locationFired: " + U + ", remoteParams: " + B0() + ", appId: " + f27916h);
        if (!T || !U || B0() == null || f27916h == null) {
            A.d("registerUser not possible");
        } else {
            OSUtils.X(new Thread(new a(), "OS_REG_USER"));
        }
    }

    static void M2(String str) {
        b2(str);
        a0(f27912f).j(str);
        try {
            y3.E(new JSONObject().put("parent_player_id", str));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private static void N() {
        if (I2()) {
            v1 v1Var = A;
            v1Var.d("Starting new session with appEntryState: " + W());
            y3.w();
            w0().e();
            L.m(W());
            n0().s0();
            u2(E.b());
        } else if (h1()) {
            v1 v1Var2 = A;
            v1Var2.d("Continue on same session with appEntryState: " + W());
            L.c(W());
        }
        n0().X();
        if (!f27940v && c1()) {
            A.d("doSessionInit on background with already registered user");
        }
        L2();
    }

    static c3 N0() {
        return E;
    }

    /* access modifiers changed from: private */
    public static void N1() throws JSONException {
        g0.d dVar;
        String packageName = f27912f.getPackageName();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_id", F0());
        jSONObject.put("device_os", Build.VERSION.RELEASE);
        jSONObject.put("timezone", P0());
        jSONObject.put("timezone_id", O0());
        jSONObject.put("language", f27932p.b());
        jSONObject.put(ServiceProvider.NAMED_SDK, "040808");
        jSONObject.put("sdk_type", Q);
        jSONObject.put("android_package", packageName);
        jSONObject.put("device_model", Build.MODEL);
        Integer X2 = X();
        if (X2 != null) {
            jSONObject.put("game_version", X2);
        }
        jSONObject.put("net_type", S.i());
        jSONObject.put("carrier", S.d());
        jSONObject.put("rooted", j4.a());
        y3.C(jSONObject, (y3.b) null);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("identifier", R);
        jSONObject2.put("subscribableStatus", f27930o);
        jSONObject2.put("androidPermission", F());
        jSONObject2.put("device_type", S.e());
        y3.E(jSONObject2);
        if (j1() && (dVar = Y) != null) {
            y3.D(dVar);
        }
        A.d("registerUserTask calling readyToUpdate");
        y3.p(true);
        W = false;
    }

    static void N2(String str) {
        c2(str);
        c0(f27912f).j(str);
    }

    private static void O() {
        for (JSONArray Z1 : Z) {
            Z1(Z1);
        }
        Z.clear();
    }

    private static String O0() {
        if (Build.VERSION.SDK_INT >= 26) {
            return ZoneId.systemDefault().getId();
        }
        return TimeZone.getDefault().getID();
    }

    public static void O1(x0 x0Var) {
        if (f27912f == null) {
            A.a("OneSignal.initWithContext has not been called. Could not modify email subscription observer");
        } else {
            k0().d(x0Var);
        }
    }

    static void O2(String str) {
        d2(str);
        f1();
        d0(f27912f).l(str);
        q0 q0Var = f27933p0;
        if (q0Var != null) {
            i2(q0Var.f28007a, q0Var.f28008b, q0Var.f28009c);
            f27933p0 = null;
        }
        y3.q();
    }

    static void P() {
        m0 m0Var = f27906c;
        if (m0Var != null) {
            m0Var.j(new l0(k0.NETWORK, "Failed due to network failure. Will retry on next sync."));
            f27906c = null;
        }
    }

    private static int P0() {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            rawOffset += timeZone.getDSTSavings();
        }
        return rawOffset / 1000;
    }

    static void P1(n0 n0Var) {
        f27910e.remove(n0Var);
    }

    public static boolean P2() {
        return F.e();
    }

    static void Q() {
        m0 m0Var = f27906c;
        if (m0Var != null) {
            m0Var.onSuccess();
            f27906c = null;
        }
    }

    public static Object Q0(String str) {
        if (f27912f != null) {
            return n0().U(str);
        }
        A.a("Before calling getTriggerValueForKey, Make sure OneSignal initWithContext and setAppId is called first");
        return null;
    }

    public static void Q1(s0 s0Var) {
        if (!H2("removeExternalUserId()")) {
            o2(MaxReward.DEFAULT_LABEL, s0Var);
        }
    }

    static void R(y1 y1Var) {
        A1(r0.INFO, "Fire notificationWillShowInForegroundHandler");
        g2 c10 = y1Var.c();
        try {
            f27936r.l(c10);
        } catch (Throwable th) {
            A1(r0.ERROR, "Exception thrown while notification was being processed for display by notificationWillShowInForegroundHandler, showing notification in foreground!");
            c10.b(c10.c());
            throw th;
        }
    }

    static String R0() {
        Context context;
        if (f27924l == null && (context = f27912f) != null) {
            f27924l = H0(context);
        }
        return f27924l;
    }

    public static void R1(int i10) {
        if (H.g("removeNotification()") || O == null) {
            A.a("Waiting for remote params. Moving removeNotification() operation to a pending queue.");
            H.c(new x(i10));
        } else if (!H2("removeNotification()")) {
            O.l(i10, new WeakReference(f27912f));
        }
    }

    private static void S(f2 f2Var) {
        q.f28088a.b(new p(f2Var));
    }

    private static void S0(Context context) {
        a b10 = b.b();
        boolean z10 = context instanceof Activity;
        boolean z11 = Z() == null;
        s2(!z11 || z10);
        v1 v1Var = A;
        v1Var.d("OneSignal handleActivityLifecycleHandler inForeground: " + f27940v);
        if (f27940v) {
            if (z11 && z10 && b10 != null) {
                b10.s((Activity) context);
                b10.t(true);
            }
            OSNotificationRestoreWorkManager.c(context, false);
            m0().b();
        } else if (b10 != null) {
            b10.t(true);
        }
    }

    public static void S1(k2 k2Var) {
        if (f27912f == null) {
            A.a("OneSignal.initWithContext has not been called. Could not modify permission observer");
        } else {
            x0().d(k2Var);
        }
    }

    static void T() {
        c1 c1Var = f27902a;
        if (c1Var != null) {
            c1Var.d(new b1(i1.NETWORK, "Failed due to network failure. Will retry on next sync."));
            f27902a = null;
        }
    }

    private static void T0() {
        try {
            Class.forName("com.amazon.device.iap.PurchasingListener");
            f27943y = new l4(f27912f);
        } catch (ClassNotFoundException unused) {
        }
    }

    public static void T1(p2 p2Var) {
        if (f27912f == null) {
            A.a("OneSignal.initWithContext has not been called. Could not modify sms subscription observer");
        } else {
            E0().d(p2Var);
        }
    }

    static void U(JSONObject jSONObject) {
        c1 c1Var = f27902a;
        if (c1Var != null) {
            c1Var.a(jSONObject);
            f27902a = null;
        }
    }

    private static void U0() {
        String F0 = F0();
        if (F0 == null) {
            r0 r0Var = r0.DEBUG;
            a(r0Var, "App id set for first time:  " + f27916h);
            l.d(0, f27912f);
            a2(f27916h);
        } else if (!F0.equals(f27916h)) {
            r0 r0Var2 = r0.DEBUG;
            a(r0Var2, "App id has changed:\nFrom: " + F0 + "\n To: " + f27916h + "\nClearing the user id, app state, and remoteParams as they are no longer valid");
            a2(f27916h);
            y3.r();
            F.a();
        }
    }

    public static void U1(v2 v2Var) {
        if (f27912f == null) {
            A.a("OneSignal.initWithContext has not been called. Could not modify subscription observer");
        } else {
            L0().d(v2Var);
        }
    }

    private static f2 V(JSONArray jSONArray) {
        int length = jSONArray.length();
        int optInt = jSONArray.optJSONObject(0).optInt("androidNotificationId");
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        String str = null;
        JSONObject jSONObject = null;
        for (int i10 = 0; i10 < length; i10++) {
            try {
                jSONObject = jSONArray.getJSONObject(i10);
                if (str == null && jSONObject.has("actionId")) {
                    str = jSONObject.optString("actionId", (String) null);
                }
                if (z10) {
                    z10 = false;
                } else {
                    arrayList.add(new w1(jSONObject));
                }
            } catch (Throwable th) {
                b(r0.ERROR, "Error parsing JSON item " + i10 + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH + length + " for callback.", th);
            }
        }
        return new f2(new w1(arrayList, jSONObject, optInt), new x1(str != null ? x1.a.ActionTaken : x1.a.Opened, str));
    }

    static void V0() {
        m0 m0Var = f27908d;
        if (m0Var != null) {
            m0Var.j(new l0(k0.NETWORK, "Failed due to network failure. Will retry on next sync."));
            f27908d = null;
        }
    }

    public static void V1(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        n0().q0(arrayList);
    }

    static i0 W() {
        return f27941w;
    }

    static void W0(Activity activity, JSONArray jSONArray, String str) {
        if (!H2((String) null)) {
            u1(activity, jSONArray);
            if (f27944z != null && l0()) {
                f27944z.g(V(jSONArray));
            }
            if (G2(activity, jSONArray)) {
                E(str);
            }
            B1(activity, jSONArray);
            Z1(jSONArray);
        }
    }

    public static void W1(Collection<String> collection) {
        n0().q0(collection);
    }

    private static Integer X() {
        y a10 = z3.f28487a.a(f27912f, f27912f.getPackageName(), 0);
        if (!a10.b() || a10.a() == null) {
            return null;
        }
        return Integer.valueOf(a10.a().versionCode);
    }

    static void X0(b2 b2Var) {
        try {
            JSONObject jSONObject = new JSONObject(b2Var.e().toString());
            jSONObject.put("androidNotificationId", b2Var.a());
            f2 V2 = V(k0.g(jSONObject));
            if (f27944z != null && l0()) {
                f27944z.h(V2);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static boolean X1() {
        return f27912f == null || (m1() && !P2());
    }

    static boolean Y() {
        return F.b();
    }

    static void Y0() {
        m0 m0Var = f27908d;
        if (m0Var != null) {
            m0Var.onSuccess();
            f27908d = null;
        }
    }

    /* access modifiers changed from: private */
    public static void Y1() {
        if (R0() == null) {
            A.e("getTags called under a null user!");
        } else {
            f1();
        }
    }

    static Activity Z() {
        a b10 = b.b();
        if (b10 != null) {
            return b10.e();
        }
        return null;
    }

    static void Z0(JSONObject jSONObject) {
        c1 c1Var = f27904b;
        if (c1Var != null) {
            c1Var.a(jSONObject);
            f27904b = null;
        }
    }

    private static void Z1(JSONArray jSONArray) {
        if (f27937s == null) {
            Z.add(jSONArray);
            return;
        }
        f2 V2 = V(jSONArray);
        y(V2, f27941w);
        S(V2);
    }

    static void a(r0 r0Var, String str) {
        b(r0Var, str, (Throwable) null);
    }

    private static y0 a0(Context context) {
        if (context == null) {
            return null;
        }
        if (f27921j0 == null) {
            y0 y0Var = new y0(false);
            f27921j0 = y0Var;
            y0Var.e().b(new OSEmailSubscriptionChangedInternalObserver());
        }
        return f27921j0;
    }

    static boolean a1() {
        return !TextUtils.isEmpty(f27926m);
    }

    private static void a2(String str) {
        if (f27912f != null) {
            t3.m(t3.f28204a, "GT_APP_ID", str);
        }
    }

    static void b(r0 r0Var, String str, Throwable th) {
        if (r0Var.compareTo(f27922k) < 1) {
            if (r0Var == r0.VERBOSE) {
                Log.v("OneSignal", str, th);
            } else if (r0Var == r0.DEBUG) {
                Log.d("OneSignal", str, th);
            } else if (r0Var == r0.INFO) {
                Log.i("OneSignal", str, th);
            } else if (r0Var == r0.WARN) {
                Log.w("OneSignal", str, th);
            } else if (r0Var == r0.ERROR || r0Var == r0.FATAL) {
                Log.e("OneSignal", str, th);
            }
        }
        if (r0Var.compareTo(f27920j) < 1 && Z() != null) {
            try {
                String str2 = str + "\n";
                if (th != null) {
                    StringWriter stringWriter = new StringWriter();
                    th.printStackTrace(new PrintWriter(stringWriter));
                    str2 = (str2 + th.getMessage()) + stringWriter.toString();
                }
                OSUtils.T(new g0(r0Var, str2));
            } catch (Throwable th2) {
                Log.e("OneSignal", "Error showing logging message.", th2);
            }
        }
    }

    private static l2 b0(Context context) {
        if (context == null) {
            return null;
        }
        if (f27909d0 == null) {
            l2 l2Var = new l2(false);
            f27909d0 = l2Var;
            l2Var.c().b(new OSPermissionChangedInternalObserver());
        }
        return f27909d0;
    }

    static boolean b1() {
        return !TextUtils.isEmpty(f27928n);
    }

    static void b2(String str) {
        f27926m = str;
        if (f27912f != null) {
            t3.m(t3.f28204a, "OS_EMAIL_ID", MaxReward.DEFAULT_LABEL.equals(f27926m) ? null : f27926m);
        }
    }

    private static q2 c0(Context context) {
        if (context == null) {
            return null;
        }
        if (f27927m0 == null) {
            q2 q2Var = new q2(false);
            f27927m0 = q2Var;
            q2Var.c().b(new OSSMSSubscriptionChangedInternalObserver());
        }
        return f27927m0;
    }

    static boolean c1() {
        return R0() != null;
    }

    static void c2(String str) {
        f27928n = str;
        if (f27912f != null) {
            t3.m(t3.f28204a, "PREFS_OS_SMS_ID", MaxReward.DEFAULT_LABEL.equals(f27928n) ? null : f27928n);
        }
    }

    /* access modifiers changed from: private */
    public static OSSubscriptionState d0(Context context) {
        if (context == null) {
            return null;
        }
        if (f27915g0 == null) {
            f27915g0 = new OSSubscriptionState(false, b0(context).a());
            b0(context).c().a(f27915g0);
            f27915g0.b().b(new OSSubscriptionChangedInternalObserver());
        }
        return f27915g0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00dc, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void d1(android.content.Context r5) {
        /*
            java.lang.Class<com.onesignal.k3> r0 = com.onesignal.k3.class
            monitor-enter(r0)
            com.onesignal.v1 r1 = A     // Catch:{ all -> 0x00dd }
            java.lang.String r2 = "Starting OneSignal initialization!"
            r1.b(r2)     // Catch:{ all -> 0x00dd }
            android.content.Context r1 = f27912f     // Catch:{ all -> 0x00dd }
            com.onesignal.y1.h(r1)     // Catch:{ all -> 0x00dd }
            boolean r1 = X1()     // Catch:{ all -> 0x00dd }
            r2 = 0
            if (r1 != 0) goto L_0x00a9
            com.onesignal.o2 r1 = F     // Catch:{ all -> 0x00dd }
            boolean r1 = r1.l()     // Catch:{ all -> 0x00dd }
            if (r1 != 0) goto L_0x0020
            goto L_0x00a9
        L_0x0020:
            int r1 = f27930o     // Catch:{ all -> 0x00dd }
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r3) goto L_0x0028
            goto L_0x0032
        L_0x0028:
            com.onesignal.OSUtils r1 = S     // Catch:{ all -> 0x00dd }
            android.content.Context r3 = f27912f     // Catch:{ all -> 0x00dd }
            java.lang.String r4 = f27916h     // Catch:{ all -> 0x00dd }
            int r1 = r1.A(r3, r4)     // Catch:{ all -> 0x00dd }
        L_0x0032:
            f27930o = r1     // Catch:{ all -> 0x00dd }
            boolean r1 = l1()     // Catch:{ all -> 0x00dd }
            if (r1 == 0) goto L_0x003c
            monitor-exit(r0)
            return
        L_0x003c:
            boolean r1 = f27939u     // Catch:{ all -> 0x00dd }
            if (r1 == 0) goto L_0x0050
            com.onesignal.k3$x0 r5 = f27937s     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x0047
            O()     // Catch:{ all -> 0x00dd }
        L_0x0047:
            com.onesignal.v1 r5 = A     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = "OneSignal SDK initialization already completed."
            r5.d(r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r0)
            return
        L_0x0050:
            S0(r5)     // Catch:{ all -> 0x00dd }
            f27914g = r2     // Catch:{ all -> 0x00dd }
            com.onesignal.y3.l()     // Catch:{ all -> 0x00dd }
            U0()     // Catch:{ all -> 0x00dd }
            T0()     // Catch:{ all -> 0x00dd }
            android.content.Context r5 = f27912f     // Catch:{ all -> 0x00dd }
            com.onesignal.l2 r5 = b0(r5)     // Catch:{ all -> 0x00dd }
            com.onesignal.OSPermissionChangedInternalObserver.b(r5)     // Catch:{ all -> 0x00dd }
            N()     // Catch:{ all -> 0x00dd }
            com.onesignal.k3$x0 r5 = f27937s     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x0071
            O()     // Catch:{ all -> 0x00dd }
        L_0x0071:
            android.content.Context r5 = f27912f     // Catch:{ all -> 0x00dd }
            boolean r5 = com.onesignal.n4.a(r5)     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x0082
            com.onesignal.n4 r5 = new com.onesignal.n4     // Catch:{ all -> 0x00dd }
            android.content.Context r1 = f27912f     // Catch:{ all -> 0x00dd }
            r5.<init>(r1)     // Catch:{ all -> 0x00dd }
            f27942x = r5     // Catch:{ all -> 0x00dd }
        L_0x0082:
            boolean r5 = com.onesignal.m4.a()     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x0091
            com.onesignal.m4 r5 = new com.onesignal.m4     // Catch:{ all -> 0x00dd }
            android.content.Context r1 = f27912f     // Catch:{ all -> 0x00dd }
            r5.<init>(r1)     // Catch:{ all -> 0x00dd }
            f27944z = r5     // Catch:{ all -> 0x00dd }
        L_0x0091:
            r5 = 1
            f27939u = r5     // Catch:{ all -> 0x00dd }
            com.onesignal.k3$r0 r5 = com.onesignal.k3.r0.VERBOSE     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = "OneSignal SDK initialization done."
            a(r5, r1)     // Catch:{ all -> 0x00dd }
            com.onesignal.j2 r5 = w0()     // Catch:{ all -> 0x00dd }
            r5.q()     // Catch:{ all -> 0x00dd }
            com.onesignal.a3 r5 = H     // Catch:{ all -> 0x00dd }
            r5.f()     // Catch:{ all -> 0x00dd }
            monitor-exit(r0)
            return
        L_0x00a9:
            com.onesignal.o2 r1 = F     // Catch:{ all -> 0x00dd }
            boolean r1 = r1.l()     // Catch:{ all -> 0x00dd }
            if (r1 != 0) goto L_0x00b9
            com.onesignal.v1 r1 = A     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = "OneSignal SDK initialization delayed, waiting for remote params."
            r1.b(r3)     // Catch:{ all -> 0x00dd }
            goto L_0x00c0
        L_0x00b9:
            com.onesignal.v1 r1 = A     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = "OneSignal SDK initialization delayed, waiting for privacy consent to be set."
            r1.b(r3)     // Catch:{ all -> 0x00dd }
        L_0x00c0:
            com.onesignal.r r1 = new com.onesignal.r     // Catch:{ all -> 0x00dd }
            android.content.Context r3 = f27912f     // Catch:{ all -> 0x00dd }
            java.lang.String r4 = f27916h     // Catch:{ all -> 0x00dd }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x00dd }
            f27907c0 = r1     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = f27916h     // Catch:{ all -> 0x00dd }
            f27916h = r2     // Catch:{ all -> 0x00dd }
            if (r1 == 0) goto L_0x00db
            if (r5 == 0) goto L_0x00db
            java.lang.String r5 = R0()     // Catch:{ all -> 0x00dd }
            r2 = 0
            s1(r1, r5, r2)     // Catch:{ all -> 0x00dd }
        L_0x00db:
            monitor-exit(r0)
            return
        L_0x00dd:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.k3.d1(android.content.Context):void");
    }

    static void d2(String str) {
        f27924l = str;
        if (f27912f != null) {
            t3.m(t3.f28204a, "GT_PLAYER_ID", f27924l);
        }
    }

    static r3 e0() {
        return r3.A(f27912f);
    }

    public static void e1(Context context) {
        if (context == null) {
            A.e("initWithContext called with null context, ignoring!");
            return;
        }
        if (context instanceof Activity) {
            f27914g = new WeakReference<>((Activity) context);
        }
        boolean z10 = f27912f == null;
        f27912f = context.getApplicationContext();
        D2(z10);
        E2(f27912f);
        if (f27916h == null) {
            String F0 = F0();
            if (F0 == null) {
                A.e("appContext set, but please call setAppId(appId) with a valid appId to complete OneSignal init!");
                return;
            }
            v1 v1Var = A;
            v1Var.b("appContext set and cached app id found, calling setAppId with: " + F0);
            m2(F0);
            return;
        }
        v1 v1Var2 = A;
        v1Var2.b("initWithContext called with: " + context);
        d1(context);
    }

    private static boolean e2() {
        boolean o10 = y3.o();
        v1 v1Var = A;
        v1Var.d("OneSignal scheduleSyncService unsyncedChanges: " + o10);
        if (o10) {
            x2.q().s(f27912f);
        }
        boolean m10 = g0.m(f27912f);
        v1 v1Var2 = A;
        v1Var2.d("OneSignal scheduleSyncService locationScheduled: " + m10);
        return m10 || o10;
    }

    static r3 f0(Context context) {
        return r3.A(context);
    }

    private static void f1() {
        ArrayList<t0> arrayList = f27905b0;
        synchronized (arrayList) {
            if (arrayList.size() != 0) {
                new Thread(new o(), "OS_GETTAGS_CALLBACK").start();
            }
        }
    }

    static void f2(List<l1> list) {
        j2 j2Var = M;
        if (j2Var == null || f27916h == null) {
            a(r0.ERROR, "Make sure OneSignal.init is called first");
        } else {
            j2Var.m(list);
        }
    }

    public static u0 g0() {
        Context context = f27912f;
        if (context != null) {
            return new u0(d0(context), b0(f27912f), a0(f27912f), c0(f27912f));
        }
        A.a("OneSignal.initWithContext has not been called. Could not get OSDeviceState");
        return null;
    }

    static boolean g1() {
        return f27939u && h1();
    }

    public static void g2(String str, e1 e1Var) {
        if (!n1(str)) {
            A.a("Make sure OneSignal initWithContext and setAppId is called first");
        } else if (H.g("sendOutcome()") || M == null) {
            A.a("Waiting for remote params. Moving sendOutcome() operation to a pending queue.");
            H.c(new z(str, e1Var));
        } else if (!H2("sendOutcome()")) {
            M.n(str, e1Var);
        }
    }

    static boolean h0() {
        return F.h();
    }

    static boolean h1() {
        return f27940v;
    }

    public static void h2(String str, float f10, e1 e1Var) {
        j2 j2Var;
        if (n1(str) && o1(f10)) {
            if (H.g("sendOutcomeWithValue()") || (j2Var = M) == null) {
                A.a("Waiting for remote params. Moving sendOutcomeWithValue() operation to a pending queue.");
                H.c(new b0(str, f10, e1Var));
                return;
            }
            j2Var.o(str, f10, e1Var);
        }
    }

    static String i0() {
        if (f27926m == null && f27912f != null) {
            f27926m = t3.f(t3.f28204a, "OS_EMAIL_ID", (String) null);
        }
        if (TextUtils.isEmpty(f27926m)) {
            return null;
        }
        return f27926m;
    }

    static boolean i1() {
        return f27939u;
    }

    static void i2(JSONArray jSONArray, boolean z10, v3.g gVar) {
        if (!H2("sendPurchases()")) {
            if (R0() == null) {
                q0 q0Var = new q0(jSONArray);
                f27933p0 = q0Var;
                q0Var.f28008b = z10;
                q0Var.f28009c = gVar;
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("app_id", F0());
                if (z10) {
                    jSONObject.put("existing", true);
                }
                jSONObject.put("purchases", jSONArray);
                y3.s(jSONObject, gVar);
            } catch (Throwable th) {
                b(r0.ERROR, "Failed to generate JSON for sendPurchases.", th);
            }
        }
    }

    static y0 j0() {
        return a0(f27912f);
    }

    public static boolean j1() {
        return F.i();
    }

    public static void j2(JSONObject jSONObject) {
        k2(jSONObject, (j0) null);
    }

    static h2<x0, z0> k0() {
        if (f27925l0 == null) {
            f27925l0 = new h2<>("onOSEmailSubscriptionChanged", true);
        }
        return f27925l0;
    }

    private static boolean k1() {
        long b10 = N0().b();
        long r02 = r0();
        long j10 = b10 - r02;
        v1 v1Var = A;
        v1Var.d("isPastOnSessionTime currentTimeMillis: " + b10 + " lastSessionTime: " + r02 + " difference: " + j10);
        return j10 >= 30000;
    }

    public static void k2(JSONObject jSONObject, j0 j0Var) {
        if (H.g("sendTags()")) {
            A.a("Waiting for remote params. Moving sendTags() operation to a pending task queue.");
            H.c(new i(jSONObject, j0Var));
        } else if (!H2("sendTags()")) {
            k kVar = new k(jSONObject, j0Var);
            if (H.e()) {
                A.d("Sending sendTags() operation to pending task queue.");
                H.c(kVar);
                return;
            }
            kVar.run();
        }
    }

    static boolean l0() {
        return F.c();
    }

    private static boolean l1() {
        return f27930o == -999;
    }

    public static void l2(String str, e1 e1Var) {
        if (n1(str)) {
            if (H.g("sendUniqueOutcome()") || M == null) {
                A.a("Waiting for remote params. Moving sendUniqueOutcome() operation to a pending queue.");
                H.c(new a0(str, e1Var));
            } else if (!H2("sendUniqueOutcome()")) {
                M.r(str, e1Var);
            }
        }
    }

    static t m0() {
        if (B == null) {
            B = new t(new b1(), A);
        }
        return B;
    }

    static boolean m1() {
        return F.j();
    }

    public static void m2(String str) {
        if (str == null || str.isEmpty()) {
            v1 v1Var = A;
            v1Var.e("setAppId called with id: " + str + ", ignoring!");
            return;
        }
        if (!str.equals(f27916h)) {
            f27939u = false;
            v1 v1Var2 = A;
            v1Var2.b("setAppId called with id: " + str + " changing id from: " + f27916h);
        }
        f27916h = str;
        if (f27912f == null) {
            A.e("appId set, but please call initWithContext(appContext) with Application context to complete OneSignal init!");
            return;
        }
        WeakReference<Activity> weakReference = f27914g;
        if (weakReference == null || weakReference.get() == null) {
            d1(f27912f);
        } else {
            d1((Context) f27914g.get());
        }
    }

    static f1 n0() {
        return D.a(e0(), G, u0(), K0(), f27932p);
    }

    private static boolean n1(String str) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        a(r0.ERROR, "Outcome name must not be empty");
        return false;
    }

    public static void n2(String str, String str2, m0 m0Var) {
        if (H.g("setEmail()")) {
            A.a("Waiting for remote params. Moving setEmail() operation to a pending task queue.");
            H.c(new d(str, str2, m0Var));
        } else if (!H2("setEmail()")) {
            if (!OSUtils.J(str)) {
                if (m0Var != null) {
                    m0Var.j(new l0(k0.VALIDATION, "Email is invalid"));
                }
                A.a("Email is invalid");
            } else if (!B0().f28245d || !(str2 == null || str2.length() == 0)) {
                f27906c = m0Var;
                String trim = str.trim();
                if (str2 != null) {
                    str2 = str2.toLowerCase();
                }
                a0(f27912f).i(trim);
                y3.u(trim.toLowerCase(), str2);
            } else {
                if (m0Var != null) {
                    m0Var.j(new l0(k0.REQUIRES_EMAIL_AUTH, "Email authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard."));
                }
                A.a("Email authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard.");
            }
        }
    }

    private static y0 o0(Context context) {
        if (context == null) {
            return null;
        }
        if (f27923k0 == null) {
            f27923k0 = new y0(true);
        }
        return f27923k0;
    }

    private static boolean o1(float f10) {
        if (f10 > 0.0f) {
            return true;
        }
        a(r0.ERROR, "Outcome value must be greater than 0");
        return false;
    }

    public static void o2(String str, s0 s0Var) {
        p2(str, (String) null, s0Var);
    }

    private static l2 p0(Context context) {
        if (context == null) {
            return null;
        }
        if (f27911e0 == null) {
            f27911e0 = new l2(true);
        }
        return f27911e0;
    }

    static void p1(String str, int i10, Throwable th, String str2) {
        String str3;
        if (str2 == null || !G(r0.INFO)) {
            str3 = MaxReward.DEFAULT_LABEL;
        } else {
            str3 = "\n" + str2 + "\n";
        }
        b(r0.WARN, "HTTP code: " + i10 + " " + str + str3, th);
    }

    public static void p2(String str, String str2, s0 s0Var) {
        if (H.g("setExternalUserId()")) {
            A.a("Waiting for remote params. Moving setExternalUserId() operation to a pending task queue.");
            H.c(new h(str, str2, s0Var));
        } else if (!H2("setExternalUserId()")) {
            if (str == null) {
                A.e("External id can't be null, set an empty string to remove an external id");
            } else if (str.isEmpty() || B0() == null || !B0().f28246e || !(str2 == null || str2.length() == 0)) {
                if (str2 != null) {
                    str2 = str2.toLowerCase();
                }
                try {
                    y3.v(str, str2, s0Var);
                } catch (JSONException e10) {
                    String str3 = str.equals(MaxReward.DEFAULT_LABEL) ? "remove" : "set";
                    v1 v1Var = A;
                    v1Var.a("Attempted to " + str3 + " external ID but encountered a JSON exception");
                    e10.printStackTrace();
                }
            } else {
                if (s0Var != null) {
                    s0Var.g(new o0(p0.REQUIRES_EXTERNAL_ID_AUTH, "External Id authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard."));
                }
                A.a("External Id authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard.");
            }
        }
    }

    private static q2 q0(Context context) {
        if (context == null) {
            return null;
        }
        if (f27929n0 == null) {
            f27929n0 = new q2(true);
        }
        return f27929n0;
    }

    public static void q1(m0 m0Var) {
        if (H.g("logoutEmail()")) {
            A.a("Waiting for remote params. Moving logoutEmail() operation to a pending task queue.");
            H.c(new e(m0Var));
        } else if (!H2("logoutEmail()")) {
            if (i0() == null) {
                if (m0Var != null) {
                    m0Var.j(new l0(k0.INVALID_OPERATION, "logoutEmail not valid as email was not set or already logged out!"));
                }
                A.a("logoutEmail not valid as email was not set or already logged out!");
                return;
            }
            f27908d = m0Var;
            y3.m();
        }
    }

    public static void q2(u0 u0Var) {
        f27938t = u0Var;
    }

    private static long r0() {
        return t3.d(t3.f28204a, "OS_LAST_SESSION_TIME", -31000);
    }

    public static void r1(c1 c1Var) {
        if (H.g("logoutSMSNumber()")) {
            A.a("Waiting for remote params. Moving logoutSMSNumber() operation to a pending task queue.");
            H.c(new c(c1Var));
        } else if (!H2("logoutSMSNumber()")) {
            if (C0() == null) {
                if (c1Var != null) {
                    c1Var.d(new b1(i1.INVALID_OPERATION, "logoutSMSNumber() not valid as sms number was not set or already logged out!"));
                }
                A.a("logoutSMSNumber() not valid as sms number was not set or already logged out!");
                return;
            }
            f27904b = c1Var;
            y3.n();
        }
    }

    public static void r2(j1 j1Var) {
        if (f27912f == null) {
            A.a("Waiting initWithContext. Moving setInAppMessageLifecycleHandler() operation to a pending task queue.");
            H.c(new c0(j1Var));
            return;
        }
        n0().u0(j1Var);
    }

    private static OSSubscriptionState s0(Context context) {
        if (context == null) {
            return null;
        }
        if (f27917h0 == null) {
            f27917h0 = new OSSubscriptionState(true, false);
        }
        return f27917h0;
    }

    private static void s1(String str, String str2, boolean z10) {
        if (B0() == null && !X) {
            X = true;
            u3.e(str, str2, new f0(z10));
        }
    }

    static void s2(boolean z10) {
        f27940v = z10;
    }

    private static r0 t0(int i10) {
        switch (i10) {
            case 0:
                return r0.NONE;
            case 1:
                return r0.FATAL;
            case 2:
                return r0.ERROR;
            case 3:
                return r0.WARN;
            case 4:
                return r0.INFO;
            case 5:
                return r0.DEBUG;
            case 6:
                return r0.VERBOSE;
            default:
                if (i10 < 0) {
                    return r0.NONE;
                }
                return r0.VERBOSE;
        }
    }

    static void t1(Context context, JSONObject jSONObject, z1.e eVar) {
        if (O == null) {
            O = new z1(f0(context), A);
        }
        O.k(jSONObject, eVar);
    }

    public static void t2(String str, d1 d1Var) {
        if (H.g("setLanguage()")) {
            A.a("Waiting for remote params. Moving setLanguage() operation to a pending task queue.");
            H.c(new f(str, d1Var));
            return;
        }
        g gVar = null;
        if (d1Var != null) {
            gVar = new g(d1Var);
        }
        if (!H2("setLanguage()")) {
            ka.c cVar = new ka.c(J);
            cVar.b(str);
            f27932p.c(cVar);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("language", f27932p.b());
                y3.C(jSONObject, gVar);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    static v1 u0() {
        return A;
    }

    private static void u1(Context context, JSONArray jSONArray) {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                String optString = new JSONObject(jSONArray.getJSONObject(i10).optString("custom", (String) null)).optString("i", (String) null);
                if (!f27903a0.contains(optString)) {
                    f27903a0.add(optString);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_id", G0(context));
                    jSONObject.put("player_id", H0(context));
                    jSONObject.put("opened", true);
                    jSONObject.put("device_type", S.e());
                    v3.l("notifications/" + optString, jSONObject, new q());
                }
            } catch (Throwable th) {
                b(r0.ERROR, "Failed to generate JSON to send notification opened.", th);
            }
        }
    }

    static void u2(long j10) {
        v1 v1Var = A;
        v1Var.d("Last session time set to: " + j10);
        t3.l(t3.f28204a, "OS_LAST_SESSION_TIME", j10);
    }

    static String v0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("custom"));
            if (jSONObject2.has("i")) {
                return jSONObject2.optString("i", (String) null);
            }
            A.d("Not a OneSignal formatted FCM message. No 'i' field in custom.");
            return null;
        } catch (JSONException unused) {
            A.d("Not a OneSignal formatted FCM message. No 'custom' field in the JSONObject.");
        }
    }

    static void v1() {
        r0 r0Var = r0.DEBUG;
        a(r0Var, "Application on focus");
        s2(true);
        i0 i0Var = f27941w;
        i0 i0Var2 = i0.NOTIFICATION_CLICK;
        if (!i0Var.equals(i0Var2)) {
            I(f27941w);
            if (!f27941w.equals(i0Var2)) {
                f27941w = i0.APP_OPEN;
            }
        }
        g0.l();
        q0.f28095a.h();
        if (!OSUtils.U(f27916h)) {
            if (!F.l()) {
                a(r0Var, "Delay onAppFocus logic due to missing remote params");
                s1(f27916h, R0(), false);
                return;
            }
            w1();
        }
    }

    public static void v2(boolean z10) {
        if (H.g("setLocationShared()")) {
            A.a("Waiting for remote params. Moving setLocationShared() operation to a pending task queue.");
            H.c(new s(z10));
        } else if (!A0().f()) {
            J2(z10);
        }
    }

    static j2 w0() {
        if (M == null) {
            synchronized (P) {
                if (M == null) {
                    if (N == null) {
                        N = new la.c(A, I, e0(), J);
                    }
                    M = new j2(L, N);
                }
            }
        }
        return M;
    }

    private static void w1() {
        if (!H2("onAppFocus")) {
            m0().b();
            N();
            n4 n4Var = f27942x;
            if (n4Var != null) {
                n4Var.u();
            }
            OSNotificationRestoreWorkManager.c(f27912f, false);
            K1();
            if (f27944z != null && l0()) {
                f27944z.f();
            }
            x2.q().p(f27912f);
        }
    }

    public static void w2(int i10, int i11) {
        x2(t0(i10), t0(i11));
    }

    public static void x(x0 x0Var) {
        if (f27912f == null) {
            A.a("OneSignal.initWithContext has not been called. Could not add email subscription observer");
            return;
        }
        k0().a(x0Var);
        if (a0(f27912f).b(o0(f27912f))) {
            OSEmailSubscriptionChangedInternalObserver.a(a0(f27912f));
        }
    }

    static h2<k2, m2> x0() {
        if (f27913f0 == null) {
            f27913f0 = new h2<>("onOSPermissionChanged", true);
        }
        return f27913f0;
    }

    static void x1() {
        r0 r0Var = r0.DEBUG;
        a(r0Var, "Application lost focus initDone: " + f27939u);
        s2(false);
        f27941w = i0.APP_CLOSE;
        u2(N0().b());
        g0.l();
        if (f27939u) {
            H();
        } else if (H.g("onAppLostFocus()")) {
            A.a("Waiting for remote params. Moving onAppLostFocus() operation to a pending task queue.");
            H.c(new h0());
        }
    }

    public static void x2(r0 r0Var, r0 r0Var2) {
        f27922k = r0Var;
        f27920j = r0Var2;
    }

    static void y(n0 n0Var, i0 i0Var) {
        if (!i0Var.equals(i0.NOTIFICATION_CLICK)) {
            f27910e.add(n0Var);
        }
    }

    private static a4 y0() {
        a4 a4Var = f27935q0;
        if (a4Var != null) {
            return a4Var;
        }
        if (OSUtils.C()) {
            f27935q0 = new b4();
        } else if (!OSUtils.B()) {
            f27935q0 = new e4();
        } else if (OSUtils.r()) {
            f27935q0 = z0();
        }
        return f27935q0;
    }

    static void y1() {
        K1();
    }

    public static void y2(x0 x0Var) {
        f27937s = x0Var;
        if (f27939u && x0Var != null) {
            O();
        }
    }

    static void z(JSONObject jSONObject) {
        try {
            jSONObject.put("net_type", S.i());
        } catch (Throwable unused) {
        }
    }

    private static d4 z0() {
        u3.d dVar = F.d().f28257p;
        return new d4(f27912f, dVar != null ? new d4.a(dVar.f28231a, dVar.f28232b, dVar.f28233c) : null);
    }

    static void z1() {
        if (!J1() && f27940v) {
            w1();
        }
    }

    public static void z2(y0 y0Var) {
        f27936r = y0Var;
    }
}
