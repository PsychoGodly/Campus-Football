package r3;

import j4.l;
import j4.o;
import j4.o0;
import j4.p;
import java.io.IOException;
import n2.r1;
import r3.g;
import s2.f;

/* compiled from: InitializationChunk */
public final class m extends f {

    /* renamed from: j  reason: collision with root package name */
    private final g f22174j;

    /* renamed from: k  reason: collision with root package name */
    private g.b f22175k;

    /* renamed from: l  reason: collision with root package name */
    private long f22176l;

    /* renamed from: m  reason: collision with root package name */
    private volatile boolean f22177m;

    public m(l lVar, p pVar, r1 r1Var, int i10, Object obj, g gVar) {
        super(lVar, pVar, 2, r1Var, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f22174j = gVar;
    }

    public void a() throws IOException {
        f fVar;
        if (this.f22176l == 0) {
            this.f22174j.c(this.f22175k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            p e10 = this.f22128b.e(this.f22176l);
            o0 o0Var = this.f22135i;
            fVar = new f(o0Var, e10.f19393g, o0Var.f(e10));
            do {
                if (this.f22177m || !this.f22174j.a(fVar)) {
                    break;
                }
                break;
                break;
            } while (!this.f22174j.a(fVar));
            break;
            this.f22176l = fVar.c() - this.f22128b.f19393g;
            o.a(this.f22135i);
        } catch (Throwable th) {
            o.a(this.f22135i);
            throw th;
        }
    }

    public void c() {
        this.f22177m = true;
    }

    public void g(g.b bVar) {
        this.f22175k = bVar;
    }
}
