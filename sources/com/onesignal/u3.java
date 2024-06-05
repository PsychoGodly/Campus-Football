package com.onesignal;

import com.onesignal.k3;
import com.onesignal.v3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OneSignalRemoteParams */
public class u3 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static int f28225a;

    /* compiled from: OneSignalRemoteParams */
    class a extends v3.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f28226a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28227b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f28228c;

        /* renamed from: com.onesignal.u3$a$a  reason: collision with other inner class name */
        /* compiled from: OneSignalRemoteParams */
        class C0295a implements Runnable {
            C0295a() {
            }

            public void run() {
                int a10 = (u3.f28225a * 10000) + 30000;
                if (a10 > 90000) {
                    a10 = 90000;
                }
                k3.r0 r0Var = k3.r0.INFO;
                k3.a(r0Var, "Failed to get Android parameters, trying again in " + (a10 / 1000) + " seconds.");
                try {
                    Thread.sleep((long) a10);
                    u3.b();
                    a aVar = a.this;
                    u3.e(aVar.f28226a, aVar.f28227b, aVar.f28228c);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            }
        }

        a(String str, String str2, c cVar) {
            this.f28226a = str;
            this.f28227b = str2;
            this.f28228c = cVar;
        }

        /* access modifiers changed from: package-private */
        public void a(int i10, String str, Throwable th) {
            if (i10 == 403) {
                k3.a(k3.r0.FATAL, "403 error getting OneSignal params, omitting further retries!");
            } else {
                new Thread(new C0295a(), "OS_PARAMS_REQUEST").start();
            }
        }

        /* access modifiers changed from: package-private */
        public void b(String str) {
            u3.f(str, this.f28228c);
        }
    }

    /* compiled from: OneSignalRemoteParams */
    class b extends f {

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ JSONObject f28230q;

        b(JSONObject jSONObject) {
            this.f28230q = jSONObject;
            this.f28243b = jSONObject.optBoolean("enterp", false);
            this.f28245d = jSONObject.optBoolean("require_email_auth", false);
            this.f28246e = jSONObject.optBoolean("require_user_id_auth", false);
            this.f28247f = jSONObject.optJSONArray("chnl_lst");
            this.f28248g = jSONObject.optBoolean("fba", false);
            this.f28249h = jSONObject.optBoolean("restore_ttl_filter", true);
            this.f28242a = jSONObject.optString("android_sender_id", (String) null);
            this.f28250i = jSONObject.optBoolean("clear_group_on_summary_click", true);
            this.f28251j = jSONObject.optBoolean("receive_receipts_enable", false);
            this.f28252k = !jSONObject.has("disable_gms_missing_prompt") ? null : Boolean.valueOf(jSONObject.optBoolean("disable_gms_missing_prompt", false));
            this.f28253l = !jSONObject.has("unsubscribe_on_notifications_disabled") ? null : Boolean.valueOf(jSONObject.optBoolean("unsubscribe_on_notifications_disabled", true));
            this.f28254m = !jSONObject.has("location_shared") ? null : Boolean.valueOf(jSONObject.optBoolean("location_shared", true));
            this.f28255n = !jSONObject.has("requires_user_privacy_consent") ? null : Boolean.valueOf(jSONObject.optBoolean("requires_user_privacy_consent", false));
            this.f28256o = new e();
            if (jSONObject.has("outcomes")) {
                u3.g(jSONObject.optJSONObject("outcomes"), this.f28256o);
            }
            this.f28257p = new d();
            if (jSONObject.has("fcm")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("fcm");
                this.f28257p.f28233c = optJSONObject.optString("api_key", (String) null);
                this.f28257p.f28232b = optJSONObject.optString("app_id", (String) null);
                this.f28257p.f28231a = optJSONObject.optString("project_id", (String) null);
            }
        }
    }

    /* compiled from: OneSignalRemoteParams */
    interface c {
        void a(f fVar);
    }

    /* compiled from: OneSignalRemoteParams */
    static class d {

        /* renamed from: a  reason: collision with root package name */
        String f28231a;

        /* renamed from: b  reason: collision with root package name */
        String f28232b;

        /* renamed from: c  reason: collision with root package name */
        String f28233c;

        d() {
        }
    }

    /* compiled from: OneSignalRemoteParams */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        int f28234a = 1440;

        /* renamed from: b  reason: collision with root package name */
        int f28235b = 10;

        /* renamed from: c  reason: collision with root package name */
        int f28236c = 1440;

        /* renamed from: d  reason: collision with root package name */
        int f28237d = 10;

        /* renamed from: e  reason: collision with root package name */
        boolean f28238e = false;

        /* renamed from: f  reason: collision with root package name */
        boolean f28239f = false;

        /* renamed from: g  reason: collision with root package name */
        boolean f28240g = false;

        /* renamed from: h  reason: collision with root package name */
        boolean f28241h = false;

        public int a() {
            return this.f28237d;
        }

        public int b() {
            return this.f28236c;
        }

        public int c() {
            return this.f28234a;
        }

        public int d() {
            return this.f28235b;
        }

        public boolean e() {
            return this.f28238e;
        }

        public boolean f() {
            return this.f28239f;
        }

        public boolean g() {
            return this.f28240g;
        }

        public String toString() {
            return "InfluenceParams{indirectNotificationAttributionWindow=" + this.f28234a + ", notificationLimit=" + this.f28235b + ", indirectIAMAttributionWindow=" + this.f28236c + ", iamLimit=" + this.f28237d + ", directEnabled=" + this.f28238e + ", indirectEnabled=" + this.f28239f + ", unattributedEnabled=" + this.f28240g + '}';
        }
    }

    /* compiled from: OneSignalRemoteParams */
    static class f {

        /* renamed from: a  reason: collision with root package name */
        String f28242a;

        /* renamed from: b  reason: collision with root package name */
        boolean f28243b;

        /* renamed from: c  reason: collision with root package name */
        boolean f28244c;

        /* renamed from: d  reason: collision with root package name */
        boolean f28245d;

        /* renamed from: e  reason: collision with root package name */
        boolean f28246e;

        /* renamed from: f  reason: collision with root package name */
        JSONArray f28247f;

        /* renamed from: g  reason: collision with root package name */
        boolean f28248g;

        /* renamed from: h  reason: collision with root package name */
        boolean f28249h;

        /* renamed from: i  reason: collision with root package name */
        boolean f28250i;

        /* renamed from: j  reason: collision with root package name */
        boolean f28251j;

        /* renamed from: k  reason: collision with root package name */
        Boolean f28252k;

        /* renamed from: l  reason: collision with root package name */
        Boolean f28253l;

        /* renamed from: m  reason: collision with root package name */
        Boolean f28254m;

        /* renamed from: n  reason: collision with root package name */
        Boolean f28255n;

        /* renamed from: o  reason: collision with root package name */
        e f28256o;

        /* renamed from: p  reason: collision with root package name */
        d f28257p;

        f() {
        }
    }

    static /* synthetic */ int b() {
        int i10 = f28225a;
        f28225a = i10 + 1;
        return i10;
    }

    static void e(String str, String str2, c cVar) {
        a aVar = new a(str, str2, cVar);
        String str3 = "apps/" + str + "/android_params.js";
        if (str2 != null) {
            str3 = str3 + "?player_id=" + str2;
        }
        k3.a(k3.r0.DEBUG, "Starting request to get Android parameters.");
        v3.e(str3, aVar, "CACHE_KEY_REMOTE_PARAMS");
    }

    /* access modifiers changed from: private */
    public static void f(String str, c cVar) {
        try {
            cVar.a(new b(new JSONObject(str)));
        } catch (NullPointerException | JSONException e10) {
            k3.r0 r0Var = k3.r0.FATAL;
            k3.b(r0Var, "Error parsing android_params!: ", e10);
            k3.a(r0Var, "Response that errored from android_params!: " + str);
        }
    }

    /* access modifiers changed from: private */
    public static void g(JSONObject jSONObject, e eVar) {
        if (jSONObject.has("v2_enabled")) {
            eVar.f28241h = jSONObject.optBoolean("v2_enabled");
        }
        if (jSONObject.has("direct")) {
            eVar.f28238e = jSONObject.optJSONObject("direct").optBoolean("enabled");
        }
        if (jSONObject.has("indirect")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("indirect");
            eVar.f28239f = optJSONObject.optBoolean("enabled");
            if (optJSONObject.has("notification_attribution")) {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("notification_attribution");
                eVar.f28234a = optJSONObject2.optInt("minutes_since_displayed", 1440);
                eVar.f28235b = optJSONObject2.optInt("limit", 10);
            }
            if (optJSONObject.has("in_app_message_attribution")) {
                JSONObject optJSONObject3 = optJSONObject.optJSONObject("in_app_message_attribution");
                eVar.f28236c = optJSONObject3.optInt("minutes_since_displayed", 1440);
                eVar.f28237d = optJSONObject3.optInt("limit", 10);
            }
        }
        if (jSONObject.has("unattributed")) {
            eVar.f28240g = jSONObject.optJSONObject("unattributed").optBoolean("enabled");
        }
    }
}
