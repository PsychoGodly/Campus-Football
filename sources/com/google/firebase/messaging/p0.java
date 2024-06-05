package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.d;
import java.util.Map;

/* compiled from: RemoteMessage */
public final class p0 extends i5.a {
    public static final Parcelable.Creator<p0> CREATOR = new q0();

    /* renamed from: a  reason: collision with root package name */
    Bundle f26853a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f26854b;

    /* renamed from: c  reason: collision with root package name */
    private c f26855c;

    /* compiled from: RemoteMessage */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Bundle f26856a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, String> f26857b = new androidx.collection.a();

        public b(String str) {
            Bundle bundle = new Bundle();
            this.f26856a = bundle;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("google.to", str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        public p0 a() {
            Bundle bundle = new Bundle();
            for (Map.Entry next : this.f26857b.entrySet()) {
                bundle.putString((String) next.getKey(), (String) next.getValue());
            }
            bundle.putAll(this.f26856a);
            this.f26856a.remove("from");
            return new p0(bundle);
        }

        public b b(String str) {
            this.f26856a.putString("collapse_key", str);
            return this;
        }

        public b c(Map<String, String> map) {
            this.f26857b.clear();
            this.f26857b.putAll(map);
            return this;
        }

        public b d(String str) {
            this.f26856a.putString("google.message_id", str);
            return this;
        }

        public b e(String str) {
            this.f26856a.putString("message_type", str);
            return this;
        }

        public b f(int i10) {
            this.f26856a.putString("google.ttl", String.valueOf(i10));
            return this;
        }
    }

    /* compiled from: RemoteMessage */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f26858a;

        /* renamed from: b  reason: collision with root package name */
        private final String f26859b;

        /* renamed from: c  reason: collision with root package name */
        private final String[] f26860c;

        /* renamed from: d  reason: collision with root package name */
        private final String f26861d;

        /* renamed from: e  reason: collision with root package name */
        private final String f26862e;

        /* renamed from: f  reason: collision with root package name */
        private final String[] f26863f;

        /* renamed from: g  reason: collision with root package name */
        private final String f26864g;

        /* renamed from: h  reason: collision with root package name */
        private final String f26865h;

        /* renamed from: i  reason: collision with root package name */
        private final String f26866i;

        /* renamed from: j  reason: collision with root package name */
        private final String f26867j;

        /* renamed from: k  reason: collision with root package name */
        private final String f26868k;

        /* renamed from: l  reason: collision with root package name */
        private final String f26869l;

        /* renamed from: m  reason: collision with root package name */
        private final String f26870m;

        /* renamed from: n  reason: collision with root package name */
        private final Uri f26871n;

        /* renamed from: o  reason: collision with root package name */
        private final String f26872o;

        /* renamed from: p  reason: collision with root package name */
        private final Integer f26873p;

        /* renamed from: q  reason: collision with root package name */
        private final Integer f26874q;

        /* renamed from: r  reason: collision with root package name */
        private final Integer f26875r;

        /* renamed from: s  reason: collision with root package name */
        private final int[] f26876s;

        /* renamed from: t  reason: collision with root package name */
        private final Long f26877t;

        /* renamed from: u  reason: collision with root package name */
        private final boolean f26878u;

        /* renamed from: v  reason: collision with root package name */
        private final boolean f26879v;

        /* renamed from: w  reason: collision with root package name */
        private final boolean f26880w;

        /* renamed from: x  reason: collision with root package name */
        private final boolean f26881x;

        /* renamed from: y  reason: collision with root package name */
        private final boolean f26882y;

        /* renamed from: z  reason: collision with root package name */
        private final long[] f26883z;

        private static String[] j(k0 k0Var, String str) {
            Object[] g10 = k0Var.g(str);
            if (g10 == null) {
                return null;
            }
            String[] strArr = new String[g10.length];
            for (int i10 = 0; i10 < g10.length; i10++) {
                strArr[i10] = String.valueOf(g10[i10]);
            }
            return strArr;
        }

        public String a() {
            return this.f26861d;
        }

        public String[] b() {
            return this.f26863f;
        }

        public String c() {
            return this.f26862e;
        }

        public String d() {
            return this.f26870m;
        }

        public String e() {
            return this.f26869l;
        }

        public String f() {
            return this.f26868k;
        }

        public String g() {
            return this.f26864g;
        }

        public Uri h() {
            String str = this.f26865h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        public Uri i() {
            return this.f26871n;
        }

        public Integer k() {
            return this.f26875r;
        }

        public Integer l() {
            return this.f26873p;
        }

        public String m() {
            return this.f26866i;
        }

        public String n() {
            return this.f26867j;
        }

        public String o() {
            return this.f26872o;
        }

        public String p() {
            return this.f26858a;
        }

        public String[] q() {
            return this.f26860c;
        }

        public String r() {
            return this.f26859b;
        }

        public Integer s() {
            return this.f26874q;
        }

        private c(k0 k0Var) {
            this.f26858a = k0Var.p("gcm.n.title");
            this.f26859b = k0Var.h("gcm.n.title");
            this.f26860c = j(k0Var, "gcm.n.title");
            this.f26861d = k0Var.p("gcm.n.body");
            this.f26862e = k0Var.h("gcm.n.body");
            this.f26863f = j(k0Var, "gcm.n.body");
            this.f26864g = k0Var.p("gcm.n.icon");
            this.f26866i = k0Var.o();
            this.f26867j = k0Var.p("gcm.n.tag");
            this.f26868k = k0Var.p("gcm.n.color");
            this.f26869l = k0Var.p("gcm.n.click_action");
            this.f26870m = k0Var.p("gcm.n.android_channel_id");
            this.f26871n = k0Var.f();
            this.f26865h = k0Var.p("gcm.n.image");
            this.f26872o = k0Var.p("gcm.n.ticker");
            this.f26873p = k0Var.b("gcm.n.notification_priority");
            this.f26874q = k0Var.b("gcm.n.visibility");
            this.f26875r = k0Var.b("gcm.n.notification_count");
            this.f26878u = k0Var.a("gcm.n.sticky");
            this.f26879v = k0Var.a("gcm.n.local_only");
            this.f26880w = k0Var.a("gcm.n.default_sound");
            this.f26881x = k0Var.a("gcm.n.default_vibrate_timings");
            this.f26882y = k0Var.a("gcm.n.default_light_settings");
            this.f26877t = k0Var.j("gcm.n.event_time");
            this.f26876s = k0Var.e();
            this.f26883z = k0Var.q();
        }
    }

    public p0(Bundle bundle) {
        this.f26853a = bundle;
    }

    private int z(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public String B() {
        return this.f26853a.getString("message_type");
    }

    public c C() {
        if (this.f26855c == null && k0.t(this.f26853a)) {
            this.f26855c = new c(new k0(this.f26853a));
        }
        return this.f26855c;
    }

    public int I() {
        String string = this.f26853a.getString("google.original_priority");
        if (string == null) {
            string = this.f26853a.getString("google.priority");
        }
        return z(string);
    }

    public long J() {
        Object obj = this.f26853a.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
            return 0;
        }
    }

    public String K() {
        return this.f26853a.getString("google.to");
    }

    public int L() {
        Object obj = this.f26853a.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public void Y(Intent intent) {
        intent.putExtras(this.f26853a);
    }

    public String v() {
        return this.f26853a.getString("collapse_key");
    }

    public Map<String, String> w() {
        if (this.f26854b == null) {
            this.f26854b = d.a.a(this.f26853a);
        }
        return this.f26854b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        q0.c(this, parcel, i10);
    }

    public String x() {
        return this.f26853a.getString("from");
    }

    public String y() {
        String string = this.f26853a.getString("google.message_id");
        return string == null ? this.f26853a.getString("message_id") : string;
    }
}
