package r3;

import android.util.SparseArray;
import j4.i;
import java.io.IOException;
import k4.n0;
import n2.r1;
import r3.g;
import s2.a0;
import s2.b0;
import s2.d;
import s2.d0;
import s2.e0;
import s2.k;
import s2.l;
import s2.m;
import s2.n;

/* compiled from: BundledChunkExtractor */
public final class e implements n, g {

    /* renamed from: k  reason: collision with root package name */
    public static final g.a f22109k = d.f37805a;

    /* renamed from: l  reason: collision with root package name */
    private static final a0 f22110l = new a0();

    /* renamed from: a  reason: collision with root package name */
    private final l f22111a;

    /* renamed from: b  reason: collision with root package name */
    private final int f22112b;

    /* renamed from: c  reason: collision with root package name */
    private final r1 f22113c;

    /* renamed from: d  reason: collision with root package name */
    private final SparseArray<a> f22114d = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    private boolean f22115f;

    /* renamed from: g  reason: collision with root package name */
    private g.b f22116g;

    /* renamed from: h  reason: collision with root package name */
    private long f22117h;

    /* renamed from: i  reason: collision with root package name */
    private b0 f22118i;

    /* renamed from: j  reason: collision with root package name */
    private r1[] f22119j;

    /* compiled from: BundledChunkExtractor */
    private static final class a implements e0 {

        /* renamed from: a  reason: collision with root package name */
        private final int f22120a;

        /* renamed from: b  reason: collision with root package name */
        private final int f22121b;

        /* renamed from: c  reason: collision with root package name */
        private final r1 f22122c;

        /* renamed from: d  reason: collision with root package name */
        private final k f22123d = new k();

        /* renamed from: e  reason: collision with root package name */
        public r1 f22124e;

        /* renamed from: f  reason: collision with root package name */
        private e0 f22125f;

        /* renamed from: g  reason: collision with root package name */
        private long f22126g;

        public a(int i10, int i11, r1 r1Var) {
            this.f22120a = i10;
            this.f22121b = i11;
            this.f22122c = r1Var;
        }

        public void a(r1 r1Var) {
            r1 r1Var2 = this.f22122c;
            if (r1Var2 != null) {
                r1Var = r1Var.j(r1Var2);
            }
            this.f22124e = r1Var;
            ((e0) n0.j(this.f22125f)).a(this.f22124e);
        }

        public void b(long j10, int i10, int i11, int i12, e0.a aVar) {
            long j11 = this.f22126g;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.f22125f = this.f22123d;
            }
            ((e0) n0.j(this.f22125f)).b(j10, i10, i11, i12, aVar);
        }

        public int c(i iVar, int i10, boolean z10, int i11) throws IOException {
            return ((e0) n0.j(this.f22125f)).e(iVar, i10, z10);
        }

        public /* synthetic */ void d(k4.a0 a0Var, int i10) {
            d0.b(this, a0Var, i10);
        }

        public /* synthetic */ int e(i iVar, int i10, boolean z10) {
            return d0.a(this, iVar, i10, z10);
        }

        public void f(k4.a0 a0Var, int i10, int i11) {
            ((e0) n0.j(this.f22125f)).d(a0Var, i10);
        }

        public void g(g.b bVar, long j10) {
            if (bVar == null) {
                this.f22125f = this.f22123d;
                return;
            }
            this.f22126g = j10;
            e0 e10 = bVar.e(this.f22120a, this.f22121b);
            this.f22125f = e10;
            r1 r1Var = this.f22124e;
            if (r1Var != null) {
                e10.a(r1Var);
            }
        }
    }

    public e(l lVar, int i10, r1 r1Var) {
        this.f22111a = lVar;
        this.f22112b = i10;
        this.f22113c = r1Var;
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [y2.e] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ r3.g g(int r6, n2.r1 r7, boolean r8, java.util.List r9, s2.e0 r10, o2.u1 r11) {
        /*
            java.lang.String r11 = r7.f20653l
            boolean r0 = k4.v.r(r11)
            if (r0 == 0) goto L_0x000a
            r6 = 0
            return r6
        L_0x000a:
            boolean r11 = k4.v.q(r11)
            if (r11 == 0) goto L_0x0017
            y2.e r8 = new y2.e
            r9 = 1
            r8.<init>(r9)
            goto L_0x0028
        L_0x0017:
            r11 = 0
            if (r8 == 0) goto L_0x001d
            r11 = 4
            r1 = 4
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            a3.g r8 = new a3.g
            r2 = 0
            r3 = 0
            r0 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x0028:
            r3.e r9 = new r3.e
            r9.<init>(r8, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.e.g(int, n2.r1, boolean, java.util.List, s2.e0, o2.u1):r3.g");
    }

    public boolean a(m mVar) throws IOException {
        int g10 = this.f22111a.g(mVar, f22110l);
        k4.a.f(g10 != 1);
        if (g10 == 0) {
            return true;
        }
        return false;
    }

    public r1[] b() {
        return this.f22119j;
    }

    public void c(g.b bVar, long j10, long j11) {
        this.f22116g = bVar;
        this.f22117h = j11;
        if (!this.f22115f) {
            this.f22111a.b(this);
            if (j10 != -9223372036854775807L) {
                this.f22111a.c(0, j10);
            }
            this.f22115f = true;
            return;
        }
        l lVar = this.f22111a;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        lVar.c(0, j10);
        for (int i10 = 0; i10 < this.f22114d.size(); i10++) {
            this.f22114d.valueAt(i10).g(bVar, j11);
        }
    }

    public d d() {
        b0 b0Var = this.f22118i;
        if (b0Var instanceof d) {
            return (d) b0Var;
        }
        return null;
    }

    public e0 e(int i10, int i11) {
        a aVar = this.f22114d.get(i10);
        if (aVar == null) {
            k4.a.f(this.f22119j == null);
            aVar = new a(i10, i11, i11 == this.f22112b ? this.f22113c : null);
            aVar.g(this.f22116g, this.f22117h);
            this.f22114d.put(i10, aVar);
        }
        return aVar;
    }

    public void j(b0 b0Var) {
        this.f22118i = b0Var;
    }

    public void q() {
        r1[] r1VarArr = new r1[this.f22114d.size()];
        for (int i10 = 0; i10 < this.f22114d.size(); i10++) {
            r1VarArr[i10] = (r1) k4.a.h(this.f22114d.valueAt(i10).f22124e);
        }
        this.f22119j = r1VarArr;
    }

    public void release() {
        this.f22111a.release();
    }
}
