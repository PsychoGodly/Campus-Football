package y6;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.t;

/* compiled from: FirebaseOptions */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final String f31333a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31334b;

    /* renamed from: c  reason: collision with root package name */
    private final String f31335c;

    /* renamed from: d  reason: collision with root package name */
    private final String f31336d;

    /* renamed from: e  reason: collision with root package name */
    private final String f31337e;

    /* renamed from: f  reason: collision with root package name */
    private final String f31338f;

    /* renamed from: g  reason: collision with root package name */
    private final String f31339g;

    /* compiled from: FirebaseOptions */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f31340a;

        /* renamed from: b  reason: collision with root package name */
        private String f31341b;

        /* renamed from: c  reason: collision with root package name */
        private String f31342c;

        /* renamed from: d  reason: collision with root package name */
        private String f31343d;

        /* renamed from: e  reason: collision with root package name */
        private String f31344e;

        /* renamed from: f  reason: collision with root package name */
        private String f31345f;

        /* renamed from: g  reason: collision with root package name */
        private String f31346g;

        public n a() {
            return new n(this.f31341b, this.f31340a, this.f31342c, this.f31343d, this.f31344e, this.f31345f, this.f31346g);
        }

        public b b(String str) {
            this.f31340a = q.h(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f31341b = q.h(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f31342c = str;
            return this;
        }

        public b e(String str) {
            this.f31343d = str;
            return this;
        }

        public b f(String str) {
            this.f31344e = str;
            return this;
        }

        public b g(String str) {
            this.f31346g = str;
            return this;
        }

        public b h(String str) {
            this.f31345f = str;
            return this;
        }
    }

    public static n a(Context context) {
        t tVar = new t(context);
        String a10 = tVar.a("google_app_id");
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        return new n(a10, tVar.a("google_api_key"), tVar.a("firebase_database_url"), tVar.a("ga_trackingId"), tVar.a("gcm_defaultSenderId"), tVar.a("google_storage_bucket"), tVar.a("project_id"));
    }

    public String b() {
        return this.f31333a;
    }

    public String c() {
        return this.f31334b;
    }

    public String d() {
        return this.f31335c;
    }

    public String e() {
        return this.f31336d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!p.a(this.f31334b, nVar.f31334b) || !p.a(this.f31333a, nVar.f31333a) || !p.a(this.f31335c, nVar.f31335c) || !p.a(this.f31336d, nVar.f31336d) || !p.a(this.f31337e, nVar.f31337e) || !p.a(this.f31338f, nVar.f31338f) || !p.a(this.f31339g, nVar.f31339g)) {
            return false;
        }
        return true;
    }

    public String f() {
        return this.f31337e;
    }

    public String g() {
        return this.f31339g;
    }

    public String h() {
        return this.f31338f;
    }

    public int hashCode() {
        return p.b(this.f31334b, this.f31333a, this.f31335c, this.f31336d, this.f31337e, this.f31338f, this.f31339g);
    }

    public String toString() {
        return p.c(this).a("applicationId", this.f31334b).a("apiKey", this.f31333a).a("databaseUrl", this.f31335c).a("gcmSenderId", this.f31337e).a("storageBucket", this.f31338f).a("projectId", this.f31339g).toString();
    }

    private n(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        q.o(!m5.q.b(str), "ApplicationId must be set.");
        this.f31334b = str;
        this.f31333a = str2;
        this.f31335c = str3;
        this.f31336d = str4;
        this.f31337e = str5;
        this.f31338f = str6;
        this.f31339g = str7;
    }
}
