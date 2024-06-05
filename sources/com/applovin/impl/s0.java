package com.applovin.impl;

import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.nh;
import com.applovin.impl.wd;
import java.io.IOException;

public interface s0 {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f11253a;

        /* renamed from: b  reason: collision with root package name */
        public final go f11254b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11255c;

        /* renamed from: d  reason: collision with root package name */
        public final wd.a f11256d;

        /* renamed from: e  reason: collision with root package name */
        public final long f11257e;

        /* renamed from: f  reason: collision with root package name */
        public final go f11258f;

        /* renamed from: g  reason: collision with root package name */
        public final int f11259g;

        /* renamed from: h  reason: collision with root package name */
        public final wd.a f11260h;

        /* renamed from: i  reason: collision with root package name */
        public final long f11261i;

        /* renamed from: j  reason: collision with root package name */
        public final long f11262j;

        public a(long j10, go goVar, int i10, wd.a aVar, long j11, go goVar2, int i11, wd.a aVar2, long j12, long j13) {
            this.f11253a = j10;
            this.f11254b = goVar;
            this.f11255c = i10;
            this.f11256d = aVar;
            this.f11257e = j11;
            this.f11258f = goVar2;
            this.f11259g = i11;
            this.f11260h = aVar2;
            this.f11261i = j12;
            this.f11262j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f11253a == aVar.f11253a && this.f11255c == aVar.f11255c && this.f11257e == aVar.f11257e && this.f11259g == aVar.f11259g && this.f11261i == aVar.f11261i && this.f11262j == aVar.f11262j && Objects.equal(this.f11254b, aVar.f11254b) && Objects.equal(this.f11256d, aVar.f11256d) && Objects.equal(this.f11258f, aVar.f11258f) && Objects.equal(this.f11260h, aVar.f11260h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.f11253a), this.f11254b, Integer.valueOf(this.f11255c), this.f11256d, Long.valueOf(this.f11257e), this.f11258f, Integer.valueOf(this.f11259g), this.f11260h, Long.valueOf(this.f11261i), Long.valueOf(this.f11262j));
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final z8 f11263a;

        /* renamed from: b  reason: collision with root package name */
        private final SparseArray f11264b;

        public b(z8 z8Var, SparseArray sparseArray) {
            this.f11263a = z8Var;
            SparseArray sparseArray2 = new SparseArray(z8Var.a());
            for (int i10 = 0; i10 < z8Var.a(); i10++) {
                int b10 = z8Var.b(i10);
                sparseArray2.append(b10, (a) a1.a((Object) (a) sparseArray.get(b10)));
            }
            this.f11264b = sparseArray2;
        }
    }

    void a(nh nhVar, b bVar);

    void a(a aVar);

    void a(a aVar, float f10);

    void a(a aVar, int i10);

    void a(a aVar, int i10, int i11);

    void a(a aVar, int i10, int i11, int i12, float f10);

    void a(a aVar, int i10, long j10);

    void a(a aVar, int i10, long j10, long j11);

    void a(a aVar, int i10, d9 d9Var);

    void a(a aVar, int i10, l5 l5Var);

    void a(a aVar, int i10, String str, long j10);

    void a(a aVar, long j10);

    void a(a aVar, long j10, int i10);

    void a(a aVar, d9 d9Var);

    void a(a aVar, d9 d9Var, o5 o5Var);

    void a(a aVar, ic icVar, pd pdVar);

    void a(a aVar, ic icVar, pd pdVar, IOException iOException, boolean z10);

    void a(a aVar, kh khVar);

    void a(a aVar, l5 l5Var);

    void a(a aVar, mh mhVar);

    void a(a aVar, nh.b bVar);

    void a(a aVar, nh.f fVar, nh.f fVar2, int i10);

    void a(a aVar, od odVar, int i10);

    void a(a aVar, pd pdVar);

    void a(a aVar, qd qdVar);

    void a(a aVar, qo qoVar, uo uoVar);

    void a(a aVar, we weVar);

    void a(a aVar, yq yqVar);

    void a(a aVar, Exception exc);

    void a(a aVar, Object obj, long j10);

    void a(a aVar, String str);

    void a(a aVar, String str, long j10);

    void a(a aVar, String str, long j10, long j11);

    void a(a aVar, boolean z10);

    void a(a aVar, boolean z10, int i10);

    void b(a aVar);

    void b(a aVar, int i10);

    void b(a aVar, int i10, long j10, long j11);

    void b(a aVar, int i10, l5 l5Var);

    void b(a aVar, d9 d9Var);

    void b(a aVar, d9 d9Var, o5 o5Var);

    void b(a aVar, ic icVar, pd pdVar);

    void b(a aVar, l5 l5Var);

    void b(a aVar, Exception exc);

    void b(a aVar, String str);

    void b(a aVar, String str, long j10);

    void b(a aVar, String str, long j10, long j11);

    void b(a aVar, boolean z10);

    void b(a aVar, boolean z10, int i10);

    void c(a aVar);

    void c(a aVar, int i10);

    void c(a aVar, ic icVar, pd pdVar);

    void c(a aVar, l5 l5Var);

    void c(a aVar, Exception exc);

    void c(a aVar, boolean z10);

    void d(a aVar);

    void d(a aVar, int i10);

    void d(a aVar, l5 l5Var);

    void d(a aVar, Exception exc);

    void d(a aVar, boolean z10);

    void e(a aVar);

    void e(a aVar, int i10);

    void e(a aVar, boolean z10);

    void f(a aVar);

    void f(a aVar, int i10);

    void g(a aVar);

    void h(a aVar);
}
