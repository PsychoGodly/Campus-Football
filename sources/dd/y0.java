package dd;

import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import r6.o;

/* compiled from: Metadata */
public final class y0 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f32386c = Logger.getLogger(y0.class.getName());

    /* renamed from: d  reason: collision with root package name */
    public static final e<byte[]> f32387d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final d<String> f32388e = new b();

    /* renamed from: f  reason: collision with root package name */
    static final t6.a f32389f = t6.a.a().k();

    /* renamed from: a  reason: collision with root package name */
    private Object[] f32390a;

    /* renamed from: b  reason: collision with root package name */
    private int f32391b;

    /* compiled from: Metadata */
    class a implements e<byte[]> {
        a() {
        }
    }

    /* compiled from: Metadata */
    class b implements d<String> {
        b() {
        }

        /* renamed from: c */
        public String b(String str) {
            return str;
        }

        /* renamed from: d */
        public String a(String str) {
            return str;
        }
    }

    /* compiled from: Metadata */
    private static class c<T> extends g<T> {

        /* renamed from: f  reason: collision with root package name */
        private final d<T> f32392f;

        /* synthetic */ c(String str, boolean z10, d dVar, a aVar) {
            this(str, z10, dVar);
        }

        /* access modifiers changed from: package-private */
        public T h(byte[] bArr) {
            return this.f32392f.b(new String(bArr, r6.e.f29801a));
        }

        /* access modifiers changed from: package-private */
        public byte[] j(T t10) {
            return this.f32392f.a(t10).getBytes(r6.e.f29801a);
        }

        private c(String str, boolean z10, d<T> dVar) {
            super(str, z10, dVar, (a) null);
            o.l(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f32392f = (d) o.p(dVar, "marshaller");
        }
    }

    /* compiled from: Metadata */
    public interface d<T> {
        String a(T t10);

        T b(String str);
    }

    /* compiled from: Metadata */
    public interface e<T> {
    }

    /* compiled from: Metadata */
    public interface f<T> {
        InputStream a(T t10);

        T b(InputStream inputStream);
    }

    /* compiled from: Metadata */
    public static abstract class g<T> {

        /* renamed from: e  reason: collision with root package name */
        private static final BitSet f32393e = b();

        /* renamed from: a  reason: collision with root package name */
        private final String f32394a;

        /* renamed from: b  reason: collision with root package name */
        private final String f32395b;

        /* renamed from: c  reason: collision with root package name */
        private final byte[] f32396c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f32397d;

        /* synthetic */ g(String str, boolean z10, Object obj, a aVar) {
            this(str, z10, obj);
        }

        private static BitSet b() {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c10 = '0'; c10 <= '9'; c10 = (char) (c10 + 1)) {
                bitSet.set(c10);
            }
            for (char c11 = 'a'; c11 <= 'z'; c11 = (char) (c11 + 1)) {
                bitSet.set(c11);
            }
            return bitSet;
        }

        public static <T> g<T> e(String str, d<T> dVar) {
            return f(str, false, dVar);
        }

        static <T> g<T> f(String str, boolean z10, d<T> dVar) {
            return new c(str, z10, dVar, (a) null);
        }

        static <T> g<T> g(String str, boolean z10, j<T> jVar) {
            return new i(str, z10, jVar, (a) null);
        }

        private static String k(String str, boolean z10) {
            o.p(str, MediationMetaData.KEY_NAME);
            o.e(!str.isEmpty(), "token must have at least 1 tchar");
            if (str.equals("connection")) {
                y0.f32386c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", new RuntimeException("exception to show backtrace"));
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (!z10 || charAt != ':' || i10 != 0) {
                    o.g(f32393e.get(charAt), "Invalid character '%s' in key name '%s'", charAt, str);
                }
            }
            return str;
        }

        /* access modifiers changed from: package-private */
        public byte[] a() {
            return this.f32396c;
        }

        /* access modifiers changed from: package-private */
        public final <M> M c(Class<M> cls) {
            if (cls.isInstance(this.f32397d)) {
                return cls.cast(this.f32397d);
            }
            return null;
        }

        public final String d() {
            return this.f32395b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f32395b.equals(((g) obj).f32395b);
        }

        /* access modifiers changed from: package-private */
        public abstract T h(byte[] bArr);

        public final int hashCode() {
            return this.f32395b.hashCode();
        }

        /* access modifiers changed from: package-private */
        public boolean i() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract byte[] j(T t10);

        public String toString() {
            return "Key{name='" + this.f32395b + "'}";
        }

        private g(String str, boolean z10, Object obj) {
            String str2 = (String) o.p(str, MediationMetaData.KEY_NAME);
            this.f32394a = str2;
            String k10 = k(str2.toLowerCase(Locale.ROOT), z10);
            this.f32395b = k10;
            this.f32396c = k10.getBytes(r6.e.f29801a);
            this.f32397d = obj;
        }
    }

    /* compiled from: Metadata */
    static final class h<T> {

        /* renamed from: a  reason: collision with root package name */
        private final f<T> f32398a;

        /* renamed from: b  reason: collision with root package name */
        private final T f32399b;

        /* renamed from: c  reason: collision with root package name */
        private volatile byte[] f32400c;

        h(f<T> fVar, T t10) {
            this.f32398a = fVar;
            this.f32399b = t10;
        }

        static <T> h<T> a(g<T> gVar, T t10) {
            return new h<>((f) o.o(b(gVar)), t10);
        }

        private static <T> f<T> b(g<T> gVar) {
            return (f) gVar.c(f.class);
        }

        /* access modifiers changed from: package-private */
        public byte[] c() {
            if (this.f32400c == null) {
                synchronized (this) {
                    if (this.f32400c == null) {
                        this.f32400c = y0.r(e());
                    }
                }
            }
            return this.f32400c;
        }

        /* access modifiers changed from: package-private */
        public <T2> T2 d(g<T2> gVar) {
            f<T2> b10;
            if (!gVar.i() || (b10 = b(gVar)) == null) {
                return gVar.h(c());
            }
            return b10.b(e());
        }

        /* access modifiers changed from: package-private */
        public InputStream e() {
            return this.f32398a.a(this.f32399b);
        }
    }

    /* compiled from: Metadata */
    private static final class i<T> extends g<T> {

        /* renamed from: f  reason: collision with root package name */
        private final j<T> f32401f;

        /* synthetic */ i(String str, boolean z10, j jVar, a aVar) {
            this(str, z10, jVar);
        }

        /* access modifiers changed from: package-private */
        public T h(byte[] bArr) {
            return this.f32401f.b(bArr);
        }

        /* access modifiers changed from: package-private */
        public byte[] j(T t10) {
            return this.f32401f.a(t10);
        }

        private i(String str, boolean z10, j<T> jVar) {
            super(str, z10, jVar, (a) null);
            o.l(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f32401f = (j) o.p(jVar, "marshaller");
        }
    }

    /* compiled from: Metadata */
    interface j<T> {
        byte[] a(T t10);

        T b(byte[] bArr);
    }

    y0(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    private boolean c(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    private int d() {
        Object[] objArr = this.f32390a;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private void f(int i10) {
        Object[] objArr = new Object[i10];
        if (!i()) {
            System.arraycopy(this.f32390a, 0, objArr, 0, k());
        }
        this.f32390a = objArr;
    }

    private boolean i() {
        return this.f32391b == 0;
    }

    private int k() {
        return this.f32391b * 2;
    }

    private void l() {
        if (k() == 0 || k() == d()) {
            f(Math.max(k() * 2, 8));
        }
    }

    private void n(int i10, byte[] bArr) {
        this.f32390a[i10 * 2] = bArr;
    }

    private byte[] o(int i10) {
        return (byte[]) this.f32390a[i10 * 2];
    }

    /* access modifiers changed from: private */
    public static byte[] r(InputStream inputStream) {
        try {
            return t6.b.d(inputStream);
        } catch (IOException e10) {
            throw new RuntimeException("failure reading serialized stream", e10);
        }
    }

    private Object s(int i10) {
        return this.f32390a[(i10 * 2) + 1];
    }

    private void t(int i10, Object obj) {
        if (this.f32390a instanceof byte[][]) {
            f(d());
        }
        this.f32390a[(i10 * 2) + 1] = obj;
    }

    private void u(int i10, byte[] bArr) {
        this.f32390a[(i10 * 2) + 1] = bArr;
    }

    private byte[] v(int i10) {
        Object s10 = s(i10);
        if (s10 instanceof byte[]) {
            return (byte[]) s10;
        }
        return ((h) s10).c();
    }

    private <T> T w(int i10, g<T> gVar) {
        Object s10 = s(i10);
        if (s10 instanceof byte[]) {
            return gVar.h((byte[]) s10);
        }
        return ((h) s10).d(gVar);
    }

    public <T> void e(g<T> gVar) {
        if (!i()) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f32391b; i11++) {
                if (!c(gVar.a(), o(i11))) {
                    n(i10, o(i11));
                    t(i10, s(i11));
                    i10++;
                }
            }
            Arrays.fill(this.f32390a, i10 * 2, k(), (Object) null);
            this.f32391b = i10;
        }
    }

    public <T> T g(g<T> gVar) {
        for (int i10 = this.f32391b - 1; i10 >= 0; i10--) {
            if (c(gVar.a(), o(i10))) {
                return w(i10, gVar);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.f32391b;
    }

    public Set<String> j() {
        if (i()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.f32391b);
        for (int i10 = 0; i10 < this.f32391b; i10++) {
            hashSet.add(new String(o(i10), 0));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public void m(y0 y0Var) {
        if (!y0Var.i()) {
            int d10 = d() - k();
            if (i() || d10 < y0Var.k()) {
                f(k() + y0Var.k());
            }
            System.arraycopy(y0Var.f32390a, 0, this.f32390a, k(), y0Var.k());
            this.f32391b += y0Var.f32391b;
        }
    }

    public <T> void p(g<T> gVar, T t10) {
        o.p(gVar, "key");
        o.p(t10, "value");
        l();
        n(this.f32391b, gVar.a());
        if (gVar.i()) {
            t(this.f32391b, h.a(gVar, t10));
        } else {
            u(this.f32391b, gVar.j(t10));
        }
        this.f32391b++;
    }

    /* access modifiers changed from: package-private */
    public byte[][] q() {
        byte[][] bArr = new byte[k()][];
        Object[] objArr = this.f32390a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, k());
        } else {
            for (int i10 = 0; i10 < this.f32391b; i10++) {
                int i11 = i10 * 2;
                bArr[i11] = o(i10);
                bArr[i11 + 1] = v(i10);
            }
        }
        return bArr;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata(");
        for (int i10 = 0; i10 < this.f32391b; i10++) {
            if (i10 != 0) {
                sb2.append(',');
            }
            byte[] o10 = o(i10);
            Charset charset = r6.e.f29801a;
            String str = new String(o10, charset);
            sb2.append(str);
            sb2.append('=');
            if (str.endsWith("-bin")) {
                sb2.append(f32389f.e(v(i10)));
            } else {
                sb2.append(new String(v(i10), charset));
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    y0(int i10, byte[]... bArr) {
        this(i10, (Object[]) bArr);
    }

    y0(int i10, Object[] objArr) {
        this.f32391b = i10;
        this.f32390a = objArr;
    }

    public y0() {
    }
}
