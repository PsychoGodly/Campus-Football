package r3;

import com.google.android.gms.common.api.a;
import j4.l;
import j4.o;
import java.io.IOException;
import n2.r1;
import s2.e0;
import s2.f;

/* compiled from: SingleSampleMediaChunk */
public final class p extends a {

    /* renamed from: o  reason: collision with root package name */
    private final int f22180o;

    /* renamed from: p  reason: collision with root package name */
    private final r1 f22181p;

    /* renamed from: q  reason: collision with root package name */
    private long f22182q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f22183r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(l lVar, j4.p pVar, r1 r1Var, int i10, Object obj, long j10, long j11, long j12, int i11, r1 r1Var2) {
        super(lVar, pVar, r1Var, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f22180o = i11;
        this.f22181p = r1Var2;
    }

    /* JADX INFO: finally extract failed */
    public void a() throws IOException {
        c j10 = j();
        j10.b(0);
        e0 e10 = j10.e(0, this.f22180o);
        e10.a(this.f22181p);
        try {
            long f10 = this.f22135i.f(this.f22128b.e(this.f22182q));
            if (f10 != -1) {
                f10 += this.f22182q;
            }
            f fVar = new f(this.f22135i, this.f22182q, f10);
            for (int i10 = 0; i10 != -1; i10 = e10.e(fVar, a.e.API_PRIORITY_OTHER, true)) {
                this.f22182q += (long) i10;
            }
            e10.b(this.f22133g, 1, (int) this.f22182q, 0, (e0.a) null);
            o.a(this.f22135i);
            this.f22183r = true;
        } catch (Throwable th) {
            o.a(this.f22135i);
            throw th;
        }
    }

    public void c() {
    }

    public boolean h() {
        return this.f22183r;
    }
}
