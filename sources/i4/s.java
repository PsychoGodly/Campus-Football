package i4;

import j4.f;
import java.util.List;
import k4.r;
import n2.c4;
import n2.r1;
import p3.x;
import p3.x0;
import r3.n;
import r3.o;

/* compiled from: ExoTrackSelection */
public interface s extends v {

    /* compiled from: ExoTrackSelection */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final x0 f19059a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f19060b;

        /* renamed from: c  reason: collision with root package name */
        public final int f19061c;

        public a(x0 x0Var, int... iArr) {
            this(x0Var, iArr, 0);
        }

        public a(x0 x0Var, int[] iArr, int i10) {
            if (iArr.length == 0) {
                r.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f19059a = x0Var;
            this.f19060b = iArr;
            this.f19061c = i10;
        }
    }

    /* compiled from: ExoTrackSelection */
    public interface b {
        s[] a(a[] aVarArr, f fVar, x.b bVar, c4 c4Var);
    }

    void d();

    boolean e(long j10, r3.f fVar, List<? extends n> list);

    int f();

    boolean g(int i10, long j10);

    boolean h(int i10, long j10);

    void i(boolean z10);

    void j();

    void k(long j10, long j11, long j12, List<? extends n> list, o[] oVarArr);

    int m(long j10, List<? extends n> list);

    int n();

    r1 o();

    int p();

    void q(float f10);

    Object r();

    void s();

    void t();
}
