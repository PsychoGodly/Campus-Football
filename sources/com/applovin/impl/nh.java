package com.applovin.impl;

import android.os.Bundle;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.m2;
import com.applovin.impl.z8;
import java.util.ArrayList;
import java.util.List;

public interface nh {

    public static final class b implements m2 {

        /* renamed from: b  reason: collision with root package name */
        public static final b f9979b = new a().a();

        /* renamed from: c  reason: collision with root package name */
        public static final m2.a f9980c = tz.f12456a;
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final z8 f9981a;

        public static final class a {

            /* renamed from: b  reason: collision with root package name */
            private static final int[] f9982b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};

            /* renamed from: a  reason: collision with root package name */
            private final z8.b f9983a = new z8.b();

            public a a(int i10) {
                this.f9983a.a(i10);
                return this;
            }

            public a a(b bVar) {
                this.f9983a.a(bVar.f9981a);
                return this;
            }

            public a a(int... iArr) {
                this.f9983a.a(iArr);
                return this;
            }

            public a a(int i10, boolean z10) {
                this.f9983a.a(i10, z10);
                return this;
            }

            public b a() {
                return new b(this.f9983a.a());
            }
        }

        private b(z8 z8Var) {
            this.f9981a = z8Var;
        }

        private static String b(int i10) {
            return Integer.toString(i10, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return this.f9981a.equals(((b) obj).f9981a);
        }

        public int hashCode() {
            return this.f9981a.hashCode();
        }

        public boolean a(int i10) {
            return this.f9981a.a(i10);
        }

        /* access modifiers changed from: private */
        public static b a(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(b(0));
            if (integerArrayList == null) {
                return f9979b;
            }
            a aVar = new a();
            for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
                aVar.a(integerArrayList.get(i10).intValue());
            }
            return aVar.a();
        }
    }

    public interface c {
        void a(int i10);

        void a(go goVar, int i10);

        void a(kh khVar);

        void a(mh mhVar);

        void a(b bVar);

        void a(f fVar, f fVar2, int i10);

        void a(nh nhVar, d dVar);

        void a(od odVar, int i10);

        void a(qd qdVar);

        void a(qo qoVar, uo uoVar);

        void a(boolean z10, int i10);

        void b();

        void b(int i10);

        void b(kh khVar);

        void b(boolean z10);

        void b(boolean z10, int i10);

        void c(int i10);

        void c(boolean z10);

        void d(boolean z10);

        void e(int i10);

        void e(boolean z10);
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final z8 f9984a;

        public d(z8 z8Var) {
            this.f9984a = z8Var;
        }

        public boolean a(int i10) {
            return this.f9984a.a(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return this.f9984a.equals(((d) obj).f9984a);
        }

        public int hashCode() {
            return this.f9984a.hashCode();
        }

        public boolean a(int... iArr) {
            return this.f9984a.a(iArr);
        }
    }

    public interface e extends c {
        void a();

        void a(float f10);

        void a(int i10);

        void a(int i10, int i11);

        void a(go goVar, int i10);

        void a(kh khVar);

        void a(mh mhVar);

        void a(b bVar);

        void a(f fVar, f fVar2, int i10);

        void a(nh nhVar, d dVar);

        void a(od odVar, int i10);

        void a(p6 p6Var);

        void a(qd qdVar);

        void a(qo qoVar, uo uoVar);

        void a(we weVar);

        void a(yq yqVar);

        void a(List list);

        void a(boolean z10);

        void a(boolean z10, int i10);

        void b(int i10);

        void b(int i10, boolean z10);

        void b(kh khVar);

        void b(boolean z10);

        void c(int i10);

        void c(boolean z10);

        void d(boolean z10);
    }

    uo A();

    void B();

    qd C();

    void D();

    int E();

    long F();

    mh a();

    void a(int i10);

    void a(int i10, long j10);

    void a(long j10);

    void a(SurfaceView surfaceView);

    void a(TextureView textureView);

    void a(e eVar);

    void a(boolean z10);

    void b();

    void b(SurfaceView surfaceView);

    void b(TextureView textureView);

    void b(e eVar);

    void b(boolean z10);

    boolean b(int i10);

    kh c();

    boolean d();

    long e();

    int f();

    long g();

    long getCurrentPosition();

    long getDuration();

    long h();

    b i();

    boolean isPlaying();

    int j();

    qo k();

    boolean l();

    int m();

    go n();

    int o();

    Looper p();

    long q();

    boolean r();

    long s();

    int t();

    void u();

    int v();

    void w();

    List x();

    boolean y();

    yq z();

    public static final class f implements m2 {

        /* renamed from: k  reason: collision with root package name */
        public static final m2.a f9985k = wz.f13191a;

        /* renamed from: a  reason: collision with root package name */
        public final Object f9986a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9987b;

        /* renamed from: c  reason: collision with root package name */
        public final od f9988c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f9989d;

        /* renamed from: f  reason: collision with root package name */
        public final int f9990f;

        /* renamed from: g  reason: collision with root package name */
        public final long f9991g;

        /* renamed from: h  reason: collision with root package name */
        public final long f9992h;

        /* renamed from: i  reason: collision with root package name */
        public final int f9993i;

        /* renamed from: j  reason: collision with root package name */
        public final int f9994j;

        public f(Object obj, int i10, od odVar, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f9986a = obj;
            this.f9987b = i10;
            this.f9988c = odVar;
            this.f9989d = obj2;
            this.f9990f = i11;
            this.f9991g = j10;
            this.f9992h = j11;
            this.f9993i = i12;
            this.f9994j = i13;
        }

        /* access modifiers changed from: private */
        public static f a(Bundle bundle) {
            return new f((Object) null, bundle.getInt(a(0), -1), (od) n2.a(od.f10103h, bundle.getBundle(a(1))), (Object) null, bundle.getInt(a(2), -1), bundle.getLong(a(3), -9223372036854775807L), bundle.getLong(a(4), -9223372036854775807L), bundle.getInt(a(5), -1), bundle.getInt(a(6), -1));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            if (this.f9987b == fVar.f9987b && this.f9990f == fVar.f9990f && this.f9991g == fVar.f9991g && this.f9992h == fVar.f9992h && this.f9993i == fVar.f9993i && this.f9994j == fVar.f9994j && Objects.equal(this.f9986a, fVar.f9986a) && Objects.equal(this.f9989d, fVar.f9989d) && Objects.equal(this.f9988c, fVar.f9988c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.f9986a, Integer.valueOf(this.f9987b), this.f9988c, this.f9989d, Integer.valueOf(this.f9990f), Integer.valueOf(this.f9987b), Long.valueOf(this.f9991g), Long.valueOf(this.f9992h), Integer.valueOf(this.f9993i), Integer.valueOf(this.f9994j));
        }

        private static String a(int i10) {
            return Integer.toString(i10, 36);
        }
    }
}
