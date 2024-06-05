package com.google.android.exoplayer2.source.smoothstreaming;

import a3.o;
import a3.p;
import android.net.Uri;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import i4.a0;
import i4.s;
import j4.g0;
import j4.i0;
import j4.l;
import j4.p0;
import java.io.IOException;
import java.util.List;
import k4.j0;
import n2.r1;
import n2.u3;
import r3.e;
import r3.f;
import r3.g;
import r3.h;
import r3.k;
import r3.n;
import x3.a;

/* compiled from: DefaultSsChunkSource */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final i0 f14375a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14376b;

    /* renamed from: c  reason: collision with root package name */
    private final g[] f14377c;

    /* renamed from: d  reason: collision with root package name */
    private final l f14378d;

    /* renamed from: e  reason: collision with root package name */
    private s f14379e;

    /* renamed from: f  reason: collision with root package name */
    private x3.a f14380f;

    /* renamed from: g  reason: collision with root package name */
    private int f14381g;

    /* renamed from: h  reason: collision with root package name */
    private IOException f14382h;

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a  reason: collision with other inner class name */
    /* compiled from: DefaultSsChunkSource */
    public static final class C0152a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private final l.a f14383a;

        public C0152a(l.a aVar) {
            this.f14383a = aVar;
        }

        public b a(i0 i0Var, x3.a aVar, int i10, s sVar, p0 p0Var) {
            l a10 = this.f14383a.a();
            if (p0Var != null) {
                a10.e(p0Var);
            }
            return new a(i0Var, aVar, i10, sVar, a10);
        }
    }

    /* compiled from: DefaultSsChunkSource */
    private static final class b extends r3.b {

        /* renamed from: e  reason: collision with root package name */
        private final a.b f14384e;

        /* renamed from: f  reason: collision with root package name */
        private final int f14385f;

        public b(a.b bVar, int i10, int i11) {
            super((long) i11, (long) (bVar.f23641k - 1));
            this.f14384e = bVar;
            this.f14385f = i10;
        }

        public long a() {
            c();
            return this.f14384e.e((int) d());
        }

        public long b() {
            return a() + this.f14384e.c((int) d());
        }
    }

    public a(i0 i0Var, x3.a aVar, int i10, s sVar, l lVar) {
        x3.a aVar2 = aVar;
        int i11 = i10;
        s sVar2 = sVar;
        this.f14375a = i0Var;
        this.f14380f = aVar2;
        this.f14376b = i11;
        this.f14379e = sVar2;
        this.f14378d = lVar;
        a.b bVar = aVar2.f23625f[i11];
        this.f14377c = new g[sVar.length()];
        int i12 = 0;
        while (i12 < this.f14377c.length) {
            int l10 = sVar2.l(i12);
            r1 r1Var = bVar.f23640j[l10];
            p[] pVarArr = r1Var.f20657p != null ? ((a.C0246a) k4.a.e(aVar2.f23624e)).f23630c : null;
            int i13 = bVar.f23631a;
            int i14 = i12;
            o oVar = r7;
            o oVar2 = new o(l10, i13, bVar.f23633c, -9223372036854775807L, aVar2.f23626g, r1Var, 0, pVarArr, i13 == 2 ? 4 : 0, (long[]) null, (long[]) null);
            this.f14377c[i14] = new e(new a3.g(3, (j0) null, oVar), bVar.f23631a, r1Var);
            i12 = i14 + 1;
        }
    }

    private static n k(r1 r1Var, l lVar, Uri uri, int i10, long j10, long j11, long j12, int i11, Object obj, g gVar) {
        l lVar2 = lVar;
        long j13 = j11;
        long j14 = j12;
        int i12 = i11;
        Object obj2 = obj;
        j4.p pVar = r0;
        j4.p pVar2 = new j4.p(uri);
        return new k(lVar2, pVar, r1Var, i12, obj2, j10, j13, j14, -9223372036854775807L, (long) i10, 1, j10, gVar);
    }

    private long l(long j10) {
        x3.a aVar = this.f14380f;
        if (!aVar.f23623d) {
            return -9223372036854775807L;
        }
        a.b bVar = aVar.f23625f[this.f14376b];
        int i10 = bVar.f23641k - 1;
        return (bVar.e(i10) + bVar.c(i10)) - j10;
    }

    public void a() throws IOException {
        IOException iOException = this.f14382h;
        if (iOException == null) {
            this.f14375a.a();
            return;
        }
        throw iOException;
    }

    public void b(s sVar) {
        this.f14379e = sVar;
    }

    public long d(long j10, u3 u3Var) {
        a.b bVar = this.f14380f.f23625f[this.f14376b];
        int d10 = bVar.d(j10);
        long e10 = bVar.e(d10);
        return u3Var.a(j10, e10, (e10 >= j10 || d10 >= bVar.f23641k + -1) ? e10 : bVar.e(d10 + 1));
    }

    public void e(f fVar) {
    }

    public void f(x3.a aVar) {
        a.b[] bVarArr = this.f14380f.f23625f;
        int i10 = this.f14376b;
        a.b bVar = bVarArr[i10];
        int i11 = bVar.f23641k;
        a.b bVar2 = aVar.f23625f[i10];
        if (i11 == 0 || bVar2.f23641k == 0) {
            this.f14381g += i11;
        } else {
            int i12 = i11 - 1;
            long e10 = bVar.e(i12) + bVar.c(i12);
            long e11 = bVar2.e(0);
            if (e10 <= e11) {
                this.f14381g += i11;
            } else {
                this.f14381g += bVar.d(e11);
            }
        }
        this.f14380f = aVar;
    }

    public final void g(long j10, long j11, List<? extends n> list, h hVar) {
        int i10;
        long j12 = j11;
        h hVar2 = hVar;
        if (this.f14382h == null) {
            x3.a aVar = this.f14380f;
            a.b bVar = aVar.f23625f[this.f14376b];
            if (bVar.f23641k == 0) {
                hVar2.f22137b = !aVar.f23623d;
                return;
            }
            if (list.isEmpty()) {
                i10 = bVar.d(j12);
                List<? extends n> list2 = list;
            } else {
                i10 = (int) (((n) list.get(list.size() - 1)).g() - ((long) this.f14381g));
                if (i10 < 0) {
                    this.f14382h = new p3.b();
                    return;
                }
            }
            if (i10 >= bVar.f23641k) {
                hVar2.f22137b = !this.f14380f.f23623d;
                return;
            }
            long j13 = j12 - j10;
            long l10 = l(j10);
            int length = this.f14379e.length();
            r3.o[] oVarArr = new r3.o[length];
            for (int i11 = 0; i11 < length; i11++) {
                oVarArr[i11] = new b(bVar, this.f14379e.l(i11), i10);
            }
            this.f14379e.k(j10, j13, l10, list, oVarArr);
            long e10 = bVar.e(i10);
            long c10 = e10 + bVar.c(i10);
            if (!list.isEmpty()) {
                j12 = -9223372036854775807L;
            }
            long j14 = j12;
            int i12 = i10 + this.f14381g;
            int f10 = this.f14379e.f();
            g gVar = this.f14377c[f10];
            Uri a10 = bVar.a(this.f14379e.l(f10), i10);
            hVar2.f22136a = k(this.f14379e.o(), this.f14378d, a10, i12, e10, c10, j14, this.f14379e.p(), this.f14379e.r(), gVar);
        }
    }

    public boolean h(f fVar, boolean z10, g0.c cVar, g0 g0Var) {
        g0.b a10 = g0Var.a(a0.c(this.f14379e), cVar);
        if (z10 && a10 != null && a10.f19315a == 2) {
            s sVar = this.f14379e;
            if (sVar.g(sVar.c(fVar.f22130d), a10.f19316b)) {
                return true;
            }
        }
        return false;
    }

    public int i(long j10, List<? extends n> list) {
        if (this.f14382h != null || this.f14379e.length() < 2) {
            return list.size();
        }
        return this.f14379e.m(j10, list);
    }

    public boolean j(long j10, f fVar, List<? extends n> list) {
        if (this.f14382h != null) {
            return false;
        }
        return this.f14379e.e(j10, fVar, list);
    }

    public void release() {
        for (g release : this.f14377c) {
            release.release();
        }
    }
}
