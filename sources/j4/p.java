package j4;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import n2.o1;

/* compiled from: DataSpec */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f19387a;

    /* renamed from: b  reason: collision with root package name */
    public final long f19388b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19389c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f19390d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, String> f19391e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public final long f19392f;

    /* renamed from: g  reason: collision with root package name */
    public final long f19393g;

    /* renamed from: h  reason: collision with root package name */
    public final long f19394h;

    /* renamed from: i  reason: collision with root package name */
    public final String f19395i;

    /* renamed from: j  reason: collision with root package name */
    public final int f19396j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f19397k;

    /* compiled from: DataSpec */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private Uri f19398a;

        /* renamed from: b  reason: collision with root package name */
        private long f19399b;

        /* renamed from: c  reason: collision with root package name */
        private int f19400c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f19401d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, String> f19402e;

        /* renamed from: f  reason: collision with root package name */
        private long f19403f;

        /* renamed from: g  reason: collision with root package name */
        private long f19404g;

        /* renamed from: h  reason: collision with root package name */
        private String f19405h;

        /* renamed from: i  reason: collision with root package name */
        private int f19406i;

        /* renamed from: j  reason: collision with root package name */
        private Object f19407j;

        public p a() {
            k4.a.i(this.f19398a, "The uri must be set.");
            return new p(this.f19398a, this.f19399b, this.f19400c, this.f19401d, this.f19402e, this.f19403f, this.f19404g, this.f19405h, this.f19406i, this.f19407j);
        }

        public b b(int i10) {
            this.f19406i = i10;
            return this;
        }

        public b c(byte[] bArr) {
            this.f19401d = bArr;
            return this;
        }

        public b d(int i10) {
            this.f19400c = i10;
            return this;
        }

        public b e(Map<String, String> map) {
            this.f19402e = map;
            return this;
        }

        public b f(String str) {
            this.f19405h = str;
            return this;
        }

        public b g(long j10) {
            this.f19404g = j10;
            return this;
        }

        public b h(long j10) {
            this.f19403f = j10;
            return this;
        }

        public b i(Uri uri) {
            this.f19398a = uri;
            return this;
        }

        public b j(String str) {
            this.f19398a = Uri.parse(str);
            return this;
        }

        public b() {
            this.f19400c = 1;
            this.f19402e = Collections.emptyMap();
            this.f19404g = -1;
        }

        private b(p pVar) {
            this.f19398a = pVar.f19387a;
            this.f19399b = pVar.f19388b;
            this.f19400c = pVar.f19389c;
            this.f19401d = pVar.f19390d;
            this.f19402e = pVar.f19391e;
            this.f19403f = pVar.f19393g;
            this.f19404g = pVar.f19394h;
            this.f19405h = pVar.f19395i;
            this.f19406i = pVar.f19396j;
            this.f19407j = pVar.f19397k;
        }
    }

    static {
        o1.a("goog.exo.datasource");
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f19389c);
    }

    public boolean d(int i10) {
        return (this.f19396j & i10) == i10;
    }

    public p e(long j10) {
        long j11 = this.f19394h;
        long j12 = -1;
        if (j11 != -1) {
            j12 = j11 - j10;
        }
        return f(j10, j12);
    }

    public p f(long j10, long j11) {
        if (j10 == 0 && this.f19394h == j11) {
            return this;
        }
        return new p(this.f19387a, this.f19388b, this.f19389c, this.f19390d, this.f19391e, this.f19393g + j10, j11, this.f19395i, this.f19396j, this.f19397k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f19387a + ", " + this.f19393g + ", " + this.f19394h + ", " + this.f19395i + ", " + this.f19396j + "]";
    }

    public p(Uri uri) {
        this(uri, 0, -1);
    }

    public p(Uri uri, long j10, long j11) {
        this(uri, 0, 1, (byte[]) null, Collections.emptyMap(), j10, j11, (String) null, 0, (Object) null);
    }

    private p(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        long j13 = j10;
        byte[] bArr2 = bArr;
        long j14 = j11;
        long j15 = j12;
        long j16 = j13 + j14;
        boolean z10 = true;
        k4.a.a(j16 >= 0);
        k4.a.a(j14 >= 0);
        if (j15 <= 0 && j15 != -1) {
            z10 = false;
        }
        k4.a.a(z10);
        this.f19387a = uri;
        this.f19388b = j13;
        this.f19389c = i10;
        this.f19390d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f19391e = Collections.unmodifiableMap(new HashMap(map));
        this.f19393g = j14;
        this.f19392f = j16;
        this.f19394h = j15;
        this.f19395i = str;
        this.f19396j = i11;
        this.f19397k = obj;
    }
}
