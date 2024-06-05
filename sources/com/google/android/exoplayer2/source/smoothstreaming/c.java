package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.source.smoothstreaming.b;
import i4.s;
import j4.g0;
import j4.i0;
import j4.p0;
import java.io.IOException;
import java.util.ArrayList;
import n2.r1;
import n2.u3;
import p3.e0;
import p3.q0;
import p3.r0;
import p3.u;
import p3.x0;
import p3.z0;
import r2.w;
import r2.y;
import r3.i;
import x3.a;

/* compiled from: SsMediaPeriod */
final class c implements u, r0.a<i<b>> {

    /* renamed from: a  reason: collision with root package name */
    private final b.a f14386a;

    /* renamed from: b  reason: collision with root package name */
    private final p0 f14387b;

    /* renamed from: c  reason: collision with root package name */
    private final i0 f14388c;

    /* renamed from: d  reason: collision with root package name */
    private final y f14389d;

    /* renamed from: f  reason: collision with root package name */
    private final w.a f14390f;

    /* renamed from: g  reason: collision with root package name */
    private final g0 f14391g;

    /* renamed from: h  reason: collision with root package name */
    private final e0.a f14392h;

    /* renamed from: i  reason: collision with root package name */
    private final j4.b f14393i;

    /* renamed from: j  reason: collision with root package name */
    private final z0 f14394j;

    /* renamed from: k  reason: collision with root package name */
    private final p3.i f14395k;

    /* renamed from: l  reason: collision with root package name */
    private u.a f14396l;

    /* renamed from: m  reason: collision with root package name */
    private a f14397m;

    /* renamed from: n  reason: collision with root package name */
    private i<b>[] f14398n;

    /* renamed from: o  reason: collision with root package name */
    private r0 f14399o;

    public c(a aVar, b.a aVar2, p0 p0Var, p3.i iVar, y yVar, w.a aVar3, g0 g0Var, e0.a aVar4, i0 i0Var, j4.b bVar) {
        this.f14397m = aVar;
        this.f14386a = aVar2;
        this.f14387b = p0Var;
        this.f14388c = i0Var;
        this.f14389d = yVar;
        this.f14390f = aVar3;
        this.f14391g = g0Var;
        this.f14392h = aVar4;
        this.f14393i = bVar;
        this.f14395k = iVar;
        this.f14394j = k(aVar, yVar);
        i<b>[] l10 = l(0);
        this.f14398n = l10;
        this.f14399o = iVar.a(l10);
    }

    private i<b> a(s sVar, long j10) {
        int c10 = this.f14394j.c(sVar.a());
        return new i(this.f14397m.f23625f[c10].f23631a, (int[]) null, (r1[]) null, this.f14386a.a(this.f14388c, this.f14397m, c10, sVar, this.f14387b), this, this.f14393i, j10, this.f14389d, this.f14390f, this.f14391g, this.f14392h);
    }

    private static z0 k(a aVar, y yVar) {
        x0[] x0VarArr = new x0[aVar.f23625f.length];
        int i10 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f23625f;
            if (i10 >= bVarArr.length) {
                return new z0(x0VarArr);
            }
            r1[] r1VarArr = bVarArr[i10].f23640j;
            r1[] r1VarArr2 = new r1[r1VarArr.length];
            for (int i11 = 0; i11 < r1VarArr.length; i11++) {
                r1 r1Var = r1VarArr[i11];
                r1VarArr2[i11] = r1Var.c(yVar.b(r1Var));
            }
            x0VarArr[i10] = new x0(Integer.toString(i10), r1VarArr2);
            i10++;
        }
    }

    private static i<b>[] l(int i10) {
        return new i[i10];
    }

    public long b() {
        return this.f14399o.b();
    }

    public boolean c(long j10) {
        return this.f14399o.c(j10);
    }

    public long d(long j10, u3 u3Var) {
        for (i<b> iVar : this.f14398n) {
            if (iVar.f22138a == 2) {
                return iVar.d(j10, u3Var);
            }
        }
        return j10;
    }

    public long f() {
        return this.f14399o.f();
    }

    public void g(long j10) {
        this.f14399o.g(j10);
    }

    public void h(u.a aVar, long j10) {
        this.f14396l = aVar;
        aVar.e(this);
    }

    public boolean isLoading() {
        return this.f14399o.isLoading();
    }

    public void m() throws IOException {
        this.f14388c.a();
    }

    public long n(long j10) {
        for (i<b> Q : this.f14398n) {
            Q.Q(j10);
        }
        return j10;
    }

    /* renamed from: o */
    public void j(i<b> iVar) {
        this.f14396l.j(this);
    }

    public long p(s[] sVarArr, boolean[] zArr, q0[] q0VarArr, boolean[] zArr2, long j10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            if (q0VarArr[i10] != null) {
                i iVar = q0VarArr[i10];
                if (sVarArr[i10] == null || !zArr[i10]) {
                    iVar.N();
                    q0VarArr[i10] = null;
                } else {
                    ((b) iVar.C()).b(sVarArr[i10]);
                    arrayList.add(iVar);
                }
            }
            if (q0VarArr[i10] == null && sVarArr[i10] != null) {
                i<b> a10 = a(sVarArr[i10], j10);
                arrayList.add(a10);
                q0VarArr[i10] = a10;
                zArr2[i10] = true;
            }
        }
        i<b>[] l10 = l(arrayList.size());
        this.f14398n = l10;
        arrayList.toArray(l10);
        this.f14399o = this.f14395k.a(this.f14398n);
        return j10;
    }

    public void q() {
        for (i<b> N : this.f14398n) {
            N.N();
        }
        this.f14396l = null;
    }

    public long r() {
        return -9223372036854775807L;
    }

    public z0 s() {
        return this.f14394j;
    }

    public void t(long j10, boolean z10) {
        for (i<b> t10 : this.f14398n) {
            t10.t(j10, z10);
        }
    }

    public void u(a aVar) {
        this.f14397m = aVar;
        for (i<b> C : this.f14398n) {
            C.C().f(aVar);
        }
        this.f14396l.j(this);
    }
}
