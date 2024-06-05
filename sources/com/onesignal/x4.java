package com.onesignal;

import android.app.Activity;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.applovin.mediation.MaxReward;
import com.onesignal.a;
import com.onesignal.d0;
import com.onesignal.k3;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WebViewManager */
class x4 extends a.b {

    /* renamed from: k  reason: collision with root package name */
    private static final String f28402k = "com.onesignal.x4";

    /* renamed from: l  reason: collision with root package name */
    private static final int f28403l = h3.b(24);

    /* renamed from: m  reason: collision with root package name */
    protected static x4 f28404m = null;

    /* renamed from: a  reason: collision with root package name */
    private final Object f28405a = new b();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public i3 f28406b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public d0 f28407c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Activity f28408d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public i1 f28409e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public e1 f28410f;

    /* renamed from: g  reason: collision with root package name */
    private String f28411g = null;

    /* renamed from: h  reason: collision with root package name */
    private Integer f28412h = null;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public boolean f28413i = false;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public boolean f28414j = false;

    /* compiled from: WebViewManager */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f28415a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.onesignal.x4$m[] r0 = com.onesignal.x4.m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28415a = r0
                com.onesignal.x4$m r1 = com.onesignal.x4.m.TOP_BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28415a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onesignal.x4$m r1 = com.onesignal.x4.m.BOTTOM_BANNER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.x4.a.<clinit>():void");
        }
    }

    /* compiled from: WebViewManager */
    class b {
        b() {
        }
    }

    /* compiled from: WebViewManager */
    class c implements l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f28417a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i1 f28418b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e1 f28419c;

        c(Activity activity, i1 i1Var, e1 e1Var) {
            this.f28417a = activity;
            this.f28418b = i1Var;
            this.f28419c = e1Var;
        }

        public void a() {
            x4.f28404m = null;
            x4.B(this.f28417a, this.f28418b, this.f28419c);
        }
    }

    /* compiled from: WebViewManager */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i1 f28420a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e1 f28421b;

        d(i1 i1Var, e1 e1Var) {
            this.f28420a = i1Var;
            this.f28421b = e1Var;
        }

        public void run() {
            x4.I(this.f28420a, this.f28421b);
        }
    }

    /* compiled from: WebViewManager */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f28423b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f28424c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e1 f28425d;

        e(Activity activity, String str, e1 e1Var) {
            this.f28423b = activity;
            this.f28424c = str;
            this.f28425d = e1Var;
        }

        public void run() {
            try {
                x4.this.H(this.f28423b, this.f28424c, this.f28425d.g());
            } catch (Exception e10) {
                if (e10.getMessage() == null || !e10.getMessage().contains("No WebView installed")) {
                    throw e10;
                }
                k3.b(k3.r0.ERROR, "Error setting up WebView: ", e10);
            }
        }
    }

    /* compiled from: WebViewManager */
    class f implements Runnable {
        f() {
        }

        public void run() {
            int[] c10 = h3.c(x4.this.f28408d);
            x4.this.f28406b.evaluateJavascript(String.format("setSafeAreaInsets(%s)", new Object[]{String.format("{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", new Object[]{Integer.valueOf(c10[0]), Integer.valueOf(c10[1]), Integer.valueOf(c10[2]), Integer.valueOf(c10[3])})}), (ValueCallback) null);
        }
    }

    /* compiled from: WebViewManager */
    class g implements Runnable {

        /* compiled from: WebViewManager */
        class a implements ValueCallback<String> {
            a() {
            }

            /* renamed from: a */
            public void onReceiveValue(String str) {
                try {
                    x4 x4Var = x4.this;
                    x4.this.J(Integer.valueOf(x4Var.C(x4Var.f28408d, new JSONObject(str))));
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }

        g() {
        }

        public void run() {
            x4 x4Var = x4.this;
            x4Var.G(x4Var.f28408d);
            if (x4.this.f28410f.g()) {
                x4.this.K();
            }
            x4.this.f28406b.evaluateJavascript("getPageMetaData()", new a());
        }
    }

    /* compiled from: WebViewManager */
    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f28429a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28430b;

        h(Activity activity, String str) {
            this.f28429a = activity;
            this.f28430b = str;
        }

        public void run() {
            x4.this.G(this.f28429a);
            x4.this.f28406b.loadData(this.f28430b, "text/html; charset=utf-8", "base64");
        }
    }

    /* compiled from: WebViewManager */
    class i implements d0.j {
        i() {
        }

        public void a() {
            k3.n0().b0(x4.this.f28409e);
            x4.this.D();
        }

        public void b() {
            k3.n0().h0(x4.this.f28409e);
        }

        public void c() {
            k3.n0().i0(x4.this.f28409e);
        }
    }

    /* compiled from: WebViewManager */
    class j implements l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f28433a;

        j(l lVar) {
            this.f28433a = lVar;
        }

        public void a() {
            boolean unused = x4.this.f28413i = false;
            x4.this.F((d0) null);
            l lVar = this.f28433a;
            if (lVar != null) {
                lVar.a();
            }
        }
    }

    /* compiled from: WebViewManager */
    class k {
        k() {
        }

        private m a(JSONObject jSONObject) {
            m mVar = m.FULL_SCREEN;
            try {
                if (!jSONObject.has("displayLocation") || jSONObject.get("displayLocation").equals(MaxReward.DEFAULT_LABEL)) {
                    return mVar;
                }
                return m.valueOf(jSONObject.optString("displayLocation", "FULL_SCREEN").toUpperCase());
            } catch (JSONException e10) {
                e10.printStackTrace();
                return mVar;
            }
        }

        private boolean b(JSONObject jSONObject) {
            try {
                return jSONObject.getBoolean("dragToDismissDisabled");
            } catch (JSONException unused) {
                return false;
            }
        }

        private int c(JSONObject jSONObject) {
            try {
                x4 x4Var = x4.this;
                return x4Var.C(x4Var.f28408d, jSONObject.getJSONObject("pageMetaData"));
            } catch (JSONException unused) {
                return -1;
            }
        }

        private void d(JSONObject jSONObject) throws JSONException {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            String optString = jSONObject2.optString("id", (String) null);
            boolean unused = x4.this.f28414j = jSONObject2.getBoolean("close");
            if (x4.this.f28409e.f27854k) {
                k3.n0().e0(x4.this.f28409e, jSONObject2);
            } else if (optString != null) {
                k3.n0().d0(x4.this.f28409e, jSONObject2);
            }
            if (x4.this.f28414j) {
                x4.this.w((l) null);
            }
        }

        private void e(JSONObject jSONObject) throws JSONException {
            k3.n0().k0(x4.this.f28409e, jSONObject);
        }

        private void f(JSONObject jSONObject) {
            m a10 = a(jSONObject);
            int c10 = a10 == m.FULL_SCREEN ? -1 : c(jSONObject);
            boolean b10 = b(jSONObject);
            x4.this.f28410f.i(a10);
            x4.this.f28410f.j(c10);
            x4.this.v(b10);
        }

        @JavascriptInterface
        public void postMessage(String str) {
            try {
                k3.r0 r0Var = k3.r0.DEBUG;
                k3.A1(r0Var, "OSJavaScriptInterface:postMessage: " + str);
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("type");
                char c10 = 65535;
                switch (string.hashCode()) {
                    case -1484226720:
                        if (string.equals("page_change")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case -934437708:
                        if (string.equals("resize")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 42998156:
                        if (string.equals("rendering_complete")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 1851145598:
                        if (string.equals("action_taken")) {
                            c10 = 1;
                            break;
                        }
                        break;
                }
                if (c10 == 0) {
                    f(jSONObject);
                } else if (c10 != 1) {
                    if (c10 == 3) {
                        e(jSONObject);
                    }
                } else if (!x4.this.f28407c.O()) {
                    d(jSONObject);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* compiled from: WebViewManager */
    interface l {
        void a();
    }

    /* compiled from: WebViewManager */
    enum m {
        TOP_BANNER,
        BOTTOM_BANNER,
        CENTER_MODAL,
        FULL_SCREEN;

        /* access modifiers changed from: package-private */
        public boolean a() {
            int i10 = a.f28415a[ordinal()];
            return i10 == 1 || i10 == 2;
        }
    }

    protected x4(i1 i1Var, Activity activity, e1 e1Var) {
        this.f28409e = i1Var;
        this.f28408d = activity;
        this.f28410f = e1Var;
    }

    private int A(Activity activity) {
        return h3.f(activity) - (this.f28410f.g() ? 0 : f28403l * 2);
    }

    /* access modifiers changed from: private */
    public static void B(Activity activity, i1 i1Var, e1 e1Var) {
        if (e1Var.g()) {
            E(e1Var, activity);
        }
        try {
            String encodeToString = Base64.encodeToString(e1Var.a().getBytes("UTF-8"), 2);
            x4 x4Var = new x4(i1Var, activity, e1Var);
            f28404m = x4Var;
            OSUtils.T(new e(activity, encodeToString, e1Var));
        } catch (UnsupportedEncodingException e10) {
            k3.b(k3.r0.ERROR, "Catch on initInAppMessage: ", e10);
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public int C(Activity activity, JSONObject jSONObject) {
        try {
            int b10 = h3.b(jSONObject.getJSONObject("rect").getInt("height"));
            k3.r0 r0Var = k3.r0.DEBUG;
            k3.A1(r0Var, "getPageHeightData:pxHeight: " + b10);
            int A = A(activity);
            if (b10 <= A) {
                return b10;
            }
            k3.a(r0Var, "getPageHeightData:pxHeight is over screen max: " + A);
            return A;
        } catch (JSONException e10) {
            k3.b(k3.r0.ERROR, "pageRectToViewHeight could not get page height", e10);
            return -1;
        }
    }

    /* access modifiers changed from: private */
    public void D() {
        a b10 = b.b();
        if (b10 != null) {
            b10.r(f28402k + this.f28409e.f27580a);
        }
    }

    private static void E(e1 e1Var, Activity activity) {
        String a10 = e1Var.a();
        int[] c10 = h3.c(activity);
        String format = String.format("\n\n<script>\n    setSafeAreaInsets(%s);\n</script>", new Object[]{String.format("{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", new Object[]{Integer.valueOf(c10[0]), Integer.valueOf(c10[1]), Integer.valueOf(c10[2]), Integer.valueOf(c10[3])})});
        e1Var.h(a10 + format);
    }

    /* access modifiers changed from: private */
    public void F(d0 d0Var) {
        synchronized (this.f28405a) {
            this.f28407c = d0Var;
        }
    }

    /* access modifiers changed from: private */
    public void G(Activity activity) {
        this.f28406b.layout(0, 0, z(activity), A(activity));
    }

    /* access modifiers changed from: private */
    public void H(Activity activity, String str, boolean z10) {
        y();
        i3 i3Var = new i3(activity);
        this.f28406b = i3Var;
        i3Var.setOverScrollMode(2);
        this.f28406b.setVerticalScrollBarEnabled(false);
        this.f28406b.setHorizontalScrollBarEnabled(false);
        this.f28406b.getSettings().setJavaScriptEnabled(true);
        this.f28406b.addJavascriptInterface(new k(), "OSAndroid");
        if (z10) {
            this.f28406b.setSystemUiVisibility(3074);
            if (Build.VERSION.SDK_INT >= 30) {
                this.f28406b.setFitsSystemWindows(false);
            }
        }
        t(this.f28406b);
        h3.a(activity, new h(activity, str));
    }

    static void I(i1 i1Var, e1 e1Var) {
        Activity Z = k3.Z();
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.A1(r0Var, "in app message showMessageContent on currentActivity: " + Z);
        if (Z != null) {
            x4 x4Var = f28404m;
            if (x4Var == null || !i1Var.f27854k) {
                B(Z, i1Var, e1Var);
            } else {
                x4Var.w(new c(Z, i1Var, e1Var));
            }
        } else {
            Looper.prepare();
            new Handler().postDelayed(new d(i1Var, e1Var), 200);
        }
    }

    /* access modifiers changed from: private */
    public void J(Integer num) {
        synchronized (this.f28405a) {
            if (this.f28407c == null) {
                k3.a(k3.r0.WARN, "No messageView found to update a with a new height.");
                return;
            }
            k3.r0 r0Var = k3.r0.DEBUG;
            k3.a(r0Var, "In app message, showing first one with height: " + num);
            this.f28407c.U(this.f28406b);
            if (num != null) {
                this.f28412h = num;
                this.f28407c.Z(num.intValue());
            }
            this.f28407c.X(this.f28408d);
            this.f28407c.B();
        }
    }

    /* access modifiers changed from: private */
    public void K() {
        OSUtils.T(new f());
    }

    private void t(WebView webView) {
        if (Build.VERSION.SDK_INT == 19) {
            webView.setLayerType(1, (Paint) null);
        }
    }

    private void u() {
        d0 d0Var = this.f28407c;
        if (d0Var != null) {
            if (d0Var.M() != m.FULL_SCREEN || this.f28410f.g()) {
                k3.a(k3.r0.DEBUG, "In app message new activity, calculate height and show ");
                h3.a(this.f28408d, new g());
                return;
            }
            J((Integer) null);
        }
    }

    /* access modifiers changed from: private */
    public void v(boolean z10) {
        this.f28412h = Integer.valueOf(this.f28410f.d());
        F(new d0(this.f28406b, this.f28410f, z10));
        this.f28407c.R(new i());
        a b10 = b.b();
        if (b10 != null) {
            b10.c(f28402k + this.f28409e.f27580a, this);
        }
    }

    static void x() {
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.A1(r0Var, "WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + f28404m);
        x4 x4Var = f28404m;
        if (x4Var != null) {
            x4Var.w((l) null);
        }
    }

    private static void y() {
        if (Build.VERSION.SDK_INT >= 19 && k3.G(k3.r0.DEBUG)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    private int z(Activity activity) {
        if (this.f28410f.g()) {
            return h3.e(activity);
        }
        return h3.j(activity) - (f28403l * 2);
    }

    /* access modifiers changed from: package-private */
    public void a(Activity activity) {
        String str = this.f28411g;
        this.f28408d = activity;
        this.f28411g = activity.getLocalClassName();
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.a(r0Var, "In app message activity available currentActivityName: " + this.f28411g + " lastActivityName: " + str);
        if (str == null) {
            J((Integer) null);
        } else if (str.equals(this.f28411g)) {
            u();
        } else if (!this.f28414j) {
            d0 d0Var = this.f28407c;
            if (d0Var != null) {
                d0Var.P();
            }
            J(this.f28412h);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Activity activity) {
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.a(r0Var, "In app message activity stopped, cleaning views, currentActivityName: " + this.f28411g + "\nactivity: " + this.f28408d + "\nmessageView: " + this.f28407c);
        if (this.f28407c != null && activity.getLocalClassName().equals(this.f28411g)) {
            this.f28407c.P();
        }
    }

    /* access modifiers changed from: protected */
    public void w(l lVar) {
        d0 d0Var = this.f28407c;
        if (d0Var != null && !this.f28413i) {
            if (!(this.f28409e == null || d0Var == null)) {
                k3.n0().i0(this.f28409e);
            }
            this.f28407c.K(new j(lVar));
            this.f28413i = true;
        } else if (lVar != null) {
            lVar.a();
        }
    }
}
