package m3;

import f3.a;
import f3.e;
import f3.h;
import java.nio.ByteBuffer;
import k4.a0;
import k4.j0;
import k4.z;

/* compiled from: SpliceInfoDecoder */
public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f20043a = new a0();

    /* renamed from: b  reason: collision with root package name */
    private final z f20044b = new z();

    /* renamed from: c  reason: collision with root package name */
    private j0 f20045c;

    /* access modifiers changed from: protected */
    public a b(e eVar, ByteBuffer byteBuffer) {
        j0 j0Var = this.f20045c;
        if (j0Var == null || eVar.f17988j != j0Var.e()) {
            j0 j0Var2 = new j0(eVar.f21757f);
            this.f20045c = j0Var2;
            j0Var2.a(eVar.f21757f - eVar.f17988j);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f20043a.R(array, limit);
        this.f20044b.o(array, limit);
        this.f20044b.r(39);
        long h10 = (((long) this.f20044b.h(1)) << 32) | ((long) this.f20044b.h(32));
        this.f20044b.r(20);
        int h11 = this.f20044b.h(12);
        int h12 = this.f20044b.h(8);
        a.b bVar = null;
        this.f20043a.U(14);
        if (h12 == 0) {
            bVar = new e();
        } else if (h12 == 255) {
            bVar = a.a(this.f20043a, h11, h10);
        } else if (h12 == 4) {
            bVar = f.a(this.f20043a);
        } else if (h12 == 5) {
            bVar = d.a(this.f20043a, h10, this.f20045c);
        } else if (h12 == 6) {
            bVar = g.a(this.f20043a, h10, this.f20045c);
        }
        if (bVar == null) {
            return new a(new a.b[0]);
        }
        return new a(bVar);
    }
}
