package p2;

import android.media.AudioAttributes;
import android.os.Bundle;
import k4.n0;
import n2.h;

/* compiled from: AudioAttributes */
public final class e implements h {

    /* renamed from: h  reason: collision with root package name */
    public static final e f21234h = new C0223e().a();

    /* renamed from: i  reason: collision with root package name */
    private static final String f21235i = n0.r0(0);

    /* renamed from: j  reason: collision with root package name */
    private static final String f21236j = n0.r0(1);

    /* renamed from: k  reason: collision with root package name */
    private static final String f21237k = n0.r0(2);

    /* renamed from: l  reason: collision with root package name */
    private static final String f21238l = n0.r0(3);

    /* renamed from: m  reason: collision with root package name */
    private static final String f21239m = n0.r0(4);

    /* renamed from: n  reason: collision with root package name */
    public static final h.a<e> f21240n = d.f36818a;

    /* renamed from: a  reason: collision with root package name */
    public final int f21241a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21242b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21243c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21244d;

    /* renamed from: f  reason: collision with root package name */
    public final int f21245f;

    /* renamed from: g  reason: collision with root package name */
    private d f21246g;

    /* compiled from: AudioAttributes */
    private static final class b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    /* compiled from: AudioAttributes */
    private static final class c {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    /* compiled from: AudioAttributes */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final AudioAttributes f21247a;

        private d(e eVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(eVar.f21241a).setFlags(eVar.f21242b).setUsage(eVar.f21243c);
            int i10 = n0.f19738a;
            if (i10 >= 29) {
                b.a(usage, eVar.f21244d);
            }
            if (i10 >= 32) {
                c.a(usage, eVar.f21245f);
            }
            this.f21247a = usage.build();
        }
    }

    /* renamed from: p2.e$e  reason: collision with other inner class name */
    /* compiled from: AudioAttributes */
    public static final class C0223e {

        /* renamed from: a  reason: collision with root package name */
        private int f21248a = 0;

        /* renamed from: b  reason: collision with root package name */
        private int f21249b = 0;

        /* renamed from: c  reason: collision with root package name */
        private int f21250c = 1;

        /* renamed from: d  reason: collision with root package name */
        private int f21251d = 1;

        /* renamed from: e  reason: collision with root package name */
        private int f21252e = 0;

        public e a() {
            return new e(this.f21248a, this.f21249b, this.f21250c, this.f21251d, this.f21252e);
        }

        public C0223e b(int i10) {
            this.f21251d = i10;
            return this;
        }

        public C0223e c(int i10) {
            this.f21248a = i10;
            return this;
        }

        public C0223e d(int i10) {
            this.f21249b = i10;
            return this;
        }

        public C0223e e(int i10) {
            this.f21252e = i10;
            return this;
        }

        public C0223e f(int i10) {
            this.f21250c = i10;
            return this;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ e c(Bundle bundle) {
        C0223e eVar = new C0223e();
        String str = f21235i;
        if (bundle.containsKey(str)) {
            eVar.c(bundle.getInt(str));
        }
        String str2 = f21236j;
        if (bundle.containsKey(str2)) {
            eVar.d(bundle.getInt(str2));
        }
        String str3 = f21237k;
        if (bundle.containsKey(str3)) {
            eVar.f(bundle.getInt(str3));
        }
        String str4 = f21238l;
        if (bundle.containsKey(str4)) {
            eVar.b(bundle.getInt(str4));
        }
        String str5 = f21239m;
        if (bundle.containsKey(str5)) {
            eVar.e(bundle.getInt(str5));
        }
        return eVar.a();
    }

    public d b() {
        if (this.f21246g == null) {
            this.f21246g = new d();
        }
        return this.f21246g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f21241a == eVar.f21241a && this.f21242b == eVar.f21242b && this.f21243c == eVar.f21243c && this.f21244d == eVar.f21244d && this.f21245f == eVar.f21245f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f21241a) * 31) + this.f21242b) * 31) + this.f21243c) * 31) + this.f21244d) * 31) + this.f21245f;
    }

    private e(int i10, int i11, int i12, int i13, int i14) {
        this.f21241a = i10;
        this.f21242b = i11;
        this.f21243c = i12;
        this.f21244d = i13;
        this.f21245f = i14;
    }
}
