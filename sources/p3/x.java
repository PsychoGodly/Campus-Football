package p3;

import android.os.Handler;
import j4.p0;
import java.io.IOException;
import n2.c4;
import n2.z1;
import o2.u1;
import r2.w;

/* compiled from: MediaSource */
public interface x {

    /* compiled from: MediaSource */
    public interface a {
    }

    /* compiled from: MediaSource */
    public static final class b extends v {
        public b(Object obj) {
            super(obj);
        }

        public b c(Object obj) {
            return new b(super.a(obj));
        }

        public b(Object obj, long j10) {
            super(obj, j10);
        }

        public b(Object obj, long j10, int i10) {
            super(obj, j10, i10);
        }

        public b(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10);
        }

        public b(v vVar) {
            super(vVar);
        }
    }

    /* compiled from: MediaSource */
    public interface c {
        void a(x xVar, c4 c4Var);
    }

    u a(b bVar, j4.b bVar2, long j10);

    void b(u uVar);

    void c(c cVar, p0 p0Var, u1 u1Var);

    void d(c cVar);

    z1 g();

    void h() throws IOException;

    boolean i();

    c4 j();

    void m(e0 e0Var);

    void n(c cVar);

    void p(Handler handler, w wVar);

    void q(Handler handler, e0 e0Var);

    void r(c cVar);

    void s(w wVar);
}
