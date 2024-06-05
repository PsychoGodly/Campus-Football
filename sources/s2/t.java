package s2;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import k3.h;
import k4.a0;
import k4.z;
import n2.y2;
import s2.v;
import s6.u;

/* compiled from: FlacMetadataReader */
public final class t {

    /* compiled from: FlacMetadataReader */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public v f22465a;

        public a(v vVar) {
            this.f22465a = vVar;
        }
    }

    public static boolean a(m mVar) throws IOException {
        a0 a0Var = new a0(4);
        mVar.p(a0Var.e(), 0, 4);
        if (a0Var.I() == 1716281667) {
            return true;
        }
        return false;
    }

    public static int b(m mVar) throws IOException {
        mVar.l();
        a0 a0Var = new a0(2);
        mVar.p(a0Var.e(), 0, 2);
        int M = a0Var.M();
        if ((M >> 2) == 16382) {
            mVar.l();
            return M;
        }
        mVar.l();
        throw y2.a("First frame does not start with sync code.", (Throwable) null);
    }

    public static f3.a c(m mVar, boolean z10) throws IOException {
        f3.a a10 = new y().a(mVar, z10 ? null : h.f19649b);
        if (a10 == null || a10.e() == 0) {
            return null;
        }
        return a10;
    }

    public static f3.a d(m mVar, boolean z10) throws IOException {
        mVar.l();
        long h10 = mVar.h();
        f3.a c10 = c(mVar, z10);
        mVar.m((int) (mVar.h() - h10));
        return c10;
    }

    public static boolean e(m mVar, a aVar) throws IOException {
        mVar.l();
        z zVar = new z(new byte[4]);
        mVar.p(zVar.f19821a, 0, 4);
        boolean g10 = zVar.g();
        int h10 = zVar.h(7);
        int h11 = zVar.h(24) + 4;
        if (h10 == 0) {
            aVar.f22465a = h(mVar);
        } else {
            v vVar = aVar.f22465a;
            if (vVar == null) {
                throw new IllegalArgumentException();
            } else if (h10 == 3) {
                aVar.f22465a = vVar.b(g(mVar, h11));
            } else if (h10 == 4) {
                aVar.f22465a = vVar.c(j(mVar, h11));
            } else if (h10 == 6) {
                a0 a0Var = new a0(h11);
                mVar.readFully(a0Var.e(), 0, h11);
                a0Var.U(4);
                aVar.f22465a = vVar.a(u.z(i3.a.a(a0Var)));
            } else {
                mVar.m(h11);
            }
        }
        return g10;
    }

    public static v.a f(a0 a0Var) {
        a0Var.U(1);
        int J = a0Var.J();
        long f10 = ((long) a0Var.f()) + ((long) J);
        int i10 = J / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long z10 = a0Var.z();
            if (z10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = z10;
            jArr2[i11] = a0Var.z();
            a0Var.U(2);
            i11++;
        }
        a0Var.U((int) (f10 - ((long) a0Var.f())));
        return new v.a(jArr, jArr2);
    }

    private static v.a g(m mVar, int i10) throws IOException {
        a0 a0Var = new a0(i10);
        mVar.readFully(a0Var.e(), 0, i10);
        return f(a0Var);
    }

    private static v h(m mVar) throws IOException {
        byte[] bArr = new byte[38];
        mVar.readFully(bArr, 0, 38);
        return new v(bArr, 4);
    }

    public static void i(m mVar) throws IOException {
        a0 a0Var = new a0(4);
        mVar.readFully(a0Var.e(), 0, 4);
        if (a0Var.I() != 1716281667) {
            throw y2.a("Failed to read FLAC stream marker.", (Throwable) null);
        }
    }

    private static List<String> j(m mVar, int i10) throws IOException {
        a0 a0Var = new a0(i10);
        mVar.readFully(a0Var.e(), 0, i10);
        a0Var.U(4);
        return Arrays.asList(h0.j(a0Var, false, false).f22427b);
    }
}
