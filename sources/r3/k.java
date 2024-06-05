package r3;

import j4.l;
import j4.o;
import j4.o0;
import j4.p;
import java.io.IOException;
import n2.r1;
import r3.g;
import s2.f;

/* compiled from: ContainerMediaChunk */
public class k extends a {

    /* renamed from: o  reason: collision with root package name */
    private final int f22166o;

    /* renamed from: p  reason: collision with root package name */
    private final long f22167p;

    /* renamed from: q  reason: collision with root package name */
    private final g f22168q;

    /* renamed from: r  reason: collision with root package name */
    private long f22169r;

    /* renamed from: s  reason: collision with root package name */
    private volatile boolean f22170s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f22171t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(l lVar, p pVar, r1 r1Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, g gVar) {
        super(lVar, pVar, r1Var, i10, obj, j10, j11, j12, j13, j14);
        this.f22166o = i11;
        this.f22167p = j15;
        this.f22168q = gVar;
    }

    public final void a() throws IOException {
        f fVar;
        if (this.f22169r == 0) {
            c j10 = j();
            j10.b(this.f22167p);
            g gVar = this.f22168q;
            g.b l10 = l(j10);
            long j11 = this.f22100k;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.f22167p;
            long j13 = this.f22101l;
            gVar.c(l10, j12, j13 == -9223372036854775807L ? -9223372036854775807L : j13 - this.f22167p);
        }
        try {
            p e10 = this.f22128b.e(this.f22169r);
            o0 o0Var = this.f22135i;
            fVar = new f(o0Var, e10.f19393g, o0Var.f(e10));
            do {
                if (this.f22170s || !this.f22168q.a(fVar)) {
                    break;
                }
                break;
                break;
            } while (!this.f22168q.a(fVar));
            break;
            this.f22169r = fVar.c() - this.f22128b.f19393g;
            o.a(this.f22135i);
            this.f22171t = !this.f22170s;
        } catch (Throwable th) {
            o.a(this.f22135i);
            throw th;
        }
    }

    public final void c() {
        this.f22170s = true;
    }

    public long g() {
        return this.f22178j + ((long) this.f22166o);
    }

    public boolean h() {
        return this.f22171t;
    }

    /* access modifiers changed from: protected */
    public g.b l(c cVar) {
        return cVar;
    }
}
