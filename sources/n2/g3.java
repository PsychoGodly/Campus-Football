package n2;

import android.os.Bundle;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import k4.l;
import k4.n0;
import l4.z;
import n2.h;
import r6.k;

/* compiled from: Player */
public interface g3 {

    /* compiled from: Player */
    public static final class b implements h {

        /* renamed from: b  reason: collision with root package name */
        public static final b f20397b = new a().e();

        /* renamed from: c  reason: collision with root package name */
        private static final String f20398c = n0.r0(0);

        /* renamed from: d  reason: collision with root package name */
        public static final h.a<b> f20399d = h3.f36398a;
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final l f20400a;

        /* compiled from: Player */
        public static final class a {

            /* renamed from: b  reason: collision with root package name */
            private static final int[] f20401b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

            /* renamed from: a  reason: collision with root package name */
            private final l.b f20402a = new l.b();

            public a a(int i10) {
                this.f20402a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f20402a.b(bVar.f20400a);
                return this;
            }

            public a c(int... iArr) {
                this.f20402a.c(iArr);
                return this;
            }

            public a d(int i10, boolean z10) {
                this.f20402a.d(i10, z10);
                return this;
            }

            public b e() {
                return new b(this.f20402a.e());
            }
        }

        /* access modifiers changed from: private */
        public static b c(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f20398c);
            if (integerArrayList == null) {
                return f20397b;
            }
            a aVar = new a();
            for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
                aVar.a(integerArrayList.get(i10).intValue());
            }
            return aVar.e();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return this.f20400a.equals(((b) obj).f20400a);
        }

        public int hashCode() {
            return this.f20400a.hashCode();
        }

        private b(l lVar) {
            this.f20400a = lVar;
        }
    }

    /* compiled from: Player */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final l f20403a;

        public c(l lVar) {
            this.f20403a = lVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return this.f20403a.equals(((c) obj).f20403a);
        }

        public int hashCode() {
            return this.f20403a.hashCode();
        }
    }

    /* compiled from: Player */
    public interface d {
        void A(e eVar, e eVar2, int i10);

        @Deprecated
        void B(boolean z10);

        @Deprecated
        void C(int i10);

        void D(e2 e2Var);

        void G(o oVar);

        void H(boolean z10);

        @Deprecated
        void I();

        void J(h4 h4Var);

        void K(c4 c4Var, int i10);

        void L(float f10);

        void M(int i10);

        void N(b bVar);

        void R(boolean z10);

        void W(int i10, boolean z10);

        @Deprecated
        void X(boolean z10, int i10);

        void Y(z1 z1Var, int i10);

        void a(boolean z10);

        void b0();

        void c0(p2.e eVar);

        void d(f3 f3Var);

        void d0(boolean z10, int i10);

        void f0(g3 g3Var, c cVar);

        void h0(int i10, int i11);

        void j0(c3 c3Var);

        void l0(c3 c3Var);

        void n(f3.a aVar);

        void p(int i10);

        void p0(boolean z10);

        @Deprecated
        void q(List<y3.b> list);

        void s(z zVar);

        void u(y3.e eVar);

        void z(int i10);
    }

    /* compiled from: Player */
    public static final class e implements h {

        /* renamed from: l  reason: collision with root package name */
        private static final String f20404l = n0.r0(0);

        /* renamed from: m  reason: collision with root package name */
        private static final String f20405m = n0.r0(1);

        /* renamed from: n  reason: collision with root package name */
        private static final String f20406n = n0.r0(2);

        /* renamed from: o  reason: collision with root package name */
        private static final String f20407o = n0.r0(3);

        /* renamed from: p  reason: collision with root package name */
        private static final String f20408p = n0.r0(4);

        /* renamed from: q  reason: collision with root package name */
        private static final String f20409q = n0.r0(5);

        /* renamed from: r  reason: collision with root package name */
        private static final String f20410r = n0.r0(6);

        /* renamed from: s  reason: collision with root package name */
        public static final h.a<e> f20411s = j3.f36404a;

        /* renamed from: a  reason: collision with root package name */
        public final Object f20412a;
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public final int f20413b;

        /* renamed from: c  reason: collision with root package name */
        public final int f20414c;

        /* renamed from: d  reason: collision with root package name */
        public final z1 f20415d;

        /* renamed from: f  reason: collision with root package name */
        public final Object f20416f;

        /* renamed from: g  reason: collision with root package name */
        public final int f20417g;

        /* renamed from: h  reason: collision with root package name */
        public final long f20418h;

        /* renamed from: i  reason: collision with root package name */
        public final long f20419i;

        /* renamed from: j  reason: collision with root package name */
        public final int f20420j;

        /* renamed from: k  reason: collision with root package name */
        public final int f20421k;

        public e(Object obj, int i10, z1 z1Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f20412a = obj;
            this.f20413b = i10;
            this.f20414c = i10;
            this.f20415d = z1Var;
            this.f20416f = obj2;
            this.f20417g = i11;
            this.f20418h = j10;
            this.f20419i = j11;
            this.f20420j = i12;
            this.f20421k = i13;
        }

        /* access modifiers changed from: private */
        public static e b(Bundle bundle) {
            z1 z1Var;
            int i10 = bundle.getInt(f20404l, 0);
            Bundle bundle2 = bundle.getBundle(f20405m);
            if (bundle2 == null) {
                z1Var = null;
            } else {
                z1Var = z1.f20783p.a(bundle2);
            }
            return new e((Object) null, i10, z1Var, (Object) null, bundle.getInt(f20406n, 0), bundle.getLong(f20407o, 0), bundle.getLong(f20408p, 0), bundle.getInt(f20409q, -1), bundle.getInt(f20410r, -1));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f20414c == eVar.f20414c && this.f20417g == eVar.f20417g && this.f20418h == eVar.f20418h && this.f20419i == eVar.f20419i && this.f20420j == eVar.f20420j && this.f20421k == eVar.f20421k && k.a(this.f20412a, eVar.f20412a) && k.a(this.f20416f, eVar.f20416f) && k.a(this.f20415d, eVar.f20415d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return k.b(this.f20412a, Integer.valueOf(this.f20414c), this.f20415d, this.f20416f, Integer.valueOf(this.f20417g), Long.valueOf(this.f20418h), Long.valueOf(this.f20419i), Integer.valueOf(this.f20420j), Integer.valueOf(this.f20421k));
        }
    }

    void A();

    h4 C();

    boolean E();

    int F();

    int G();

    boolean H();

    int I();

    c4 J();

    boolean K();

    boolean M();

    void a();

    int b();

    void c(f3 f3Var);

    void d(int i10);

    f3 e();

    void f(long j10);

    long getCurrentPosition();

    long getDuration();

    void h(Surface surface);

    boolean i();

    long j();

    int k();

    void l(int i10, long j10);

    boolean m();

    void n(boolean z10);

    int p();

    void q();

    boolean r();

    void release();

    int s();

    void setVolume(float f10);

    void stop();

    int t();

    void u(d dVar);

    c3 v();

    void w(boolean z10);

    long x();

    long y();

    boolean z();
}
