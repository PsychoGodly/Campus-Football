package com.onesignal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import com.applovin.mediation.MaxReward;
import com.onesignal.k3;
import com.onesignal.z1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NotificationBundleProcessor */
class k0 {

    /* compiled from: NotificationBundleProcessor */
    class a implements z1.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f27882a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f27883b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f27884c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f27885d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f27886e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f27887f;

        a(boolean z10, JSONObject jSONObject, Context context, int i10, String str, long j10) {
            this.f27882a = z10;
            this.f27883b = jSONObject;
            this.f27884c = context;
            this.f27885d = i10;
            this.f27886e = str;
            this.f27887f = j10;
        }

        public void a(boolean z10) {
            if (this.f27882a || !z10) {
                OSNotificationWorkManager.b(this.f27884c, a2.b(this.f27883b), this.f27885d, this.f27886e, this.f27887f, this.f27882a, false);
                if (this.f27882a) {
                    OSUtils.W(100);
                }
            }
        }
    }

    /* compiled from: NotificationBundleProcessor */
    class b implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f27888a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f27889b;

        b(f fVar, e eVar) {
            this.f27888a = fVar;
            this.f27889b = eVar;
        }

        public void a(boolean z10) {
            if (!z10) {
                this.f27888a.d(true);
            }
            this.f27889b.a(this.f27888a);
        }
    }

    /* compiled from: NotificationBundleProcessor */
    class c implements z1.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f27890a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f27891b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Bundle f27892c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f27893d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ JSONObject f27894e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f27895f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f27896g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f f27897h;

        c(boolean z10, Context context, Bundle bundle, d dVar, JSONObject jSONObject, long j10, boolean z11, f fVar) {
            this.f27890a = z10;
            this.f27891b = context;
            this.f27892c = bundle;
            this.f27893d = dVar;
            this.f27894e = jSONObject;
            this.f27895f = j10;
            this.f27896g = z11;
            this.f27897h = fVar;
        }

        public void a(boolean z10) {
            if (this.f27890a || !z10) {
                OSNotificationWorkManager.b(this.f27891b, a2.b(this.f27894e), this.f27892c.containsKey("android_notif_id") ? this.f27892c.getInt("android_notif_id") : 0, this.f27894e.toString(), this.f27895f, this.f27890a, this.f27896g);
                this.f27897h.g(true);
                this.f27893d.a(true);
                return;
            }
            k3.r0 r0Var = k3.r0.DEBUG;
            k3.a(r0Var, "startNotificationProcessing returning, with context: " + this.f27891b + " and bundle: " + this.f27892c);
            this.f27893d.a(false);
        }
    }

    /* compiled from: NotificationBundleProcessor */
    interface d {
        void a(boolean z10);
    }

    /* compiled from: NotificationBundleProcessor */
    interface e {
        void a(f fVar);
    }

    /* compiled from: NotificationBundleProcessor */
    static class f {

        /* renamed from: a  reason: collision with root package name */
        private boolean f27898a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f27899b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f27900c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f27901d;

        f() {
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f27899b;
        }

        public boolean b() {
            return this.f27901d;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return !this.f27898a || this.f27899b || this.f27900c || this.f27901d;
        }

        /* access modifiers changed from: package-private */
        public void d(boolean z10) {
            this.f27899b = z10;
        }

        public void e(boolean z10) {
            this.f27900c = z10;
        }

        /* access modifiers changed from: package-private */
        public void f(boolean z10) {
            this.f27898a = z10;
        }

        public void g(boolean z10) {
            this.f27901d = z10;
        }
    }

    static JSONObject a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e10) {
                k3.r0 r0Var = k3.r0.ERROR;
                k3.b(r0Var, "bundleAsJSONObject error for key: " + str, e10);
            }
        }
        return jSONObject;
    }

    static JSONObject b(JSONObject jSONObject) throws JSONException {
        return new JSONObject(jSONObject.optString("custom"));
    }

    static boolean c(Bundle bundle) {
        return d(bundle, "licon") || d(bundle, "bicon") || bundle.getString("bg_img", (String) null) != null;
    }

    private static boolean d(Bundle bundle, String str) {
        String trim = bundle.getString(str, MaxReward.DEFAULT_LABEL).trim();
        return trim.startsWith("http://") || trim.startsWith("https://");
    }

    static void e(b2 b2Var) {
        if (b2Var.m()) {
            k3.a(k3.r0.DEBUG, "Marking restored or disabled notifications as dismissed: " + b2Var.toString());
            r3 A = r3.A(b2Var.d());
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", 1);
            A.h("notification", contentValues, "android_notification_id = " + b2Var.a(), (String[]) null);
            l.c(A, b2Var.d());
        }
    }

    private static void f(Bundle bundle) {
        JSONObject jSONObject;
        String str;
        if (bundle.containsKey("o")) {
            try {
                JSONObject jSONObject2 = new JSONObject(bundle.getString("custom"));
                if (jSONObject2.has("a")) {
                    jSONObject = jSONObject2.getJSONObject("a");
                } else {
                    jSONObject = new JSONObject();
                }
                JSONArray jSONArray = new JSONArray(bundle.getString("o"));
                bundle.remove("o");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                    String string = jSONObject3.getString("n");
                    jSONObject3.remove("n");
                    if (jSONObject3.has("i")) {
                        str = jSONObject3.getString("i");
                        jSONObject3.remove("i");
                    } else {
                        str = string;
                    }
                    jSONObject3.put("id", str);
                    jSONObject3.put("text", string);
                    if (jSONObject3.has("p")) {
                        jSONObject3.put("icon", jSONObject3.getString("p"));
                        jSONObject3.remove("p");
                    }
                }
                jSONObject.put("actionButtons", jSONArray);
                jSONObject.put("actionId", "__DEFAULT__");
                if (!jSONObject2.has("a")) {
                    jSONObject2.put("a", jSONObject);
                }
                bundle.putString("custom", jSONObject2.toString());
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    static JSONArray g(JSONObject jSONObject) {
        return new JSONArray().put(jSONObject);
    }

    static void h(Context context, Bundle bundle, e eVar) {
        f fVar = new f();
        if (!a2.d(bundle)) {
            eVar.a(fVar);
            return;
        }
        fVar.f(true);
        f(bundle);
        if (n1.c(context, bundle)) {
            fVar.e(true);
            eVar.a(fVar);
            return;
        }
        q(context, bundle, fVar, new b(fVar, eVar));
    }

    private static void i(b2 b2Var) {
        if (!b2Var.n() && b2Var.e().has("collapse_key") && !"do_not_collapse".equals(b2Var.e().optString("collapse_key"))) {
            Cursor j10 = r3.A(b2Var.d()).j("notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{b2Var.e().optString("collapse_key")}, (String) null, (String) null, (String) null);
            if (j10.moveToFirst()) {
                b2Var.f().J(j10.getInt(j10.getColumnIndex("android_notification_id")));
            }
            j10.close();
        }
    }

    static void j(Context context, m mVar) {
        k3.e1(context);
        try {
            String e10 = mVar.e("json_payload");
            if (e10 == null) {
                k3.r0 r0Var = k3.r0.ERROR;
                k3.a(r0Var, "json_payload key is nonexistent from mBundle passed to ProcessFromFCMIntentService: " + mVar);
                return;
            }
            JSONObject jSONObject = new JSONObject(e10);
            k3.t1(context, jSONObject, new a(mVar.getBoolean("is_restoring", false), jSONObject, context, mVar.f("android_notif_id") ? mVar.d("android_notif_id").intValue() : 0, e10, mVar.b("timestamp").longValue()));
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    static int k(y1 y1Var, boolean z10) {
        return l(y1Var, false, z10);
    }

    private static int l(y1 y1Var, boolean z10, boolean z11) {
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.a(r0Var, "Starting processJobForDisplay opened: " + z10 + " fromBackgroundLogic: " + z11);
        b2 b10 = y1Var.b();
        i(b10);
        int intValue = b10.a().intValue();
        boolean z12 = false;
        if (p(b10)) {
            b10.p(true);
            if (!z11 || !k3.F2(b10)) {
                z12 = v.n(b10);
            } else {
                y1Var.g(false);
                k3.R(y1Var);
                return intValue;
            }
        }
        if (!b10.n()) {
            n(b10, z10, z12);
            OSNotificationWorkManager.c(a2.b(y1Var.b().e()));
            k3.X0(b10);
        }
        return intValue;
    }

    static int m(b2 b2Var, boolean z10) {
        return l(new y1(b2Var, b2Var.n(), true), false, z10);
    }

    static void n(b2 b2Var, boolean z10, boolean z11) {
        o(b2Var, z10);
        if (!z11) {
            e(b2Var);
            return;
        }
        String b10 = b2Var.b();
        OSReceiveReceiptController.c().a(b2Var.d(), b10);
        k3.J0().l(b10);
    }

    private static void o(b2 b2Var, boolean z10) {
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.a(r0Var, "Saving Notification job: " + b2Var.toString());
        Context d10 = b2Var.d();
        JSONObject e10 = b2Var.e();
        try {
            JSONObject b10 = b(b2Var.e());
            r3 A = r3.A(b2Var.d());
            int i10 = 1;
            if (b2Var.m()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("dismissed", 1);
                A.h("notification", contentValues, "android_notification_id = " + b2Var.a(), (String[]) null);
                l.c(A, d10);
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("notification_id", b10.optString("i"));
            if (e10.has("grp")) {
                contentValues2.put("group_id", e10.optString("grp"));
            }
            if (e10.has("collapse_key") && !"do_not_collapse".equals(e10.optString("collapse_key"))) {
                contentValues2.put("collapse_id", e10.optString("collapse_key"));
            }
            if (!z10) {
                i10 = 0;
            }
            contentValues2.put("opened", Integer.valueOf(i10));
            if (!z10) {
                contentValues2.put("android_notification_id", b2Var.a());
            }
            if (b2Var.k() != null) {
                contentValues2.put("title", b2Var.k().toString());
            }
            if (b2Var.c() != null) {
                contentValues2.put("message", b2Var.c().toString());
            }
            contentValues2.put("expire_time", Long.valueOf((e10.optLong("google.sent_time", k3.N0().b()) / 1000) + ((long) e10.optInt("google.ttl", 259200))));
            contentValues2.put("full_data", e10.toString());
            A.L("notification", (String) null, contentValues2);
            k3.a(r0Var, "Notification saved values: " + contentValues2.toString());
            if (!z10) {
                l.c(A, d10);
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    private static boolean p(b2 b2Var) {
        return b2Var.l() || OSUtils.I(b2Var.e().optString("alert"));
    }

    private static void q(Context context, Bundle bundle, f fVar, d dVar) {
        JSONObject a10 = a(bundle);
        k3.t1(context, a10, new c(bundle.getBoolean("is_restoring", false), context, bundle, dVar, a10, k3.N0().b() / 1000, Integer.parseInt(bundle.getString("pri", "0")) > 9, fVar));
    }
}
