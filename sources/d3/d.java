package d3;

import android.util.Pair;
import java.io.IOException;
import k4.a0;
import k4.n0;
import k4.r;
import n2.y2;
import s2.m;

/* compiled from: WavHeaderReader */
final class d {

    /* compiled from: WavHeaderReader */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f17696a;

        /* renamed from: b  reason: collision with root package name */
        public final long f17697b;

        private a(int i10, long j10) {
            this.f17696a = i10;
            this.f17697b = j10;
        }

        public static a a(m mVar, a0 a0Var) throws IOException {
            mVar.p(a0Var.e(), 0, 8);
            a0Var.T(0);
            return new a(a0Var.p(), a0Var.w());
        }
    }

    public static boolean a(m mVar) throws IOException {
        a0 a0Var = new a0(8);
        int i10 = a.a(mVar, a0Var).f17696a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        mVar.p(a0Var.e(), 0, 4);
        a0Var.T(0);
        int p10 = a0Var.p();
        if (p10 == 1463899717) {
            return true;
        }
        r.c("WavHeaderReader", "Unsupported form type: " + p10);
        return false;
    }

    public static c b(m mVar) throws IOException {
        byte[] bArr;
        a0 a0Var = new a0(16);
        a d10 = d(1718449184, mVar, a0Var);
        k4.a.f(d10.f17697b >= 16);
        mVar.p(a0Var.e(), 0, 16);
        a0Var.T(0);
        int y10 = a0Var.y();
        int y11 = a0Var.y();
        int x10 = a0Var.x();
        int x11 = a0Var.x();
        int y12 = a0Var.y();
        int y13 = a0Var.y();
        int i10 = ((int) d10.f17697b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            mVar.p(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = n0.f19743f;
        }
        mVar.m((int) (mVar.h() - mVar.c()));
        return new c(y10, y11, x10, x11, y12, y13, bArr);
    }

    public static long c(m mVar) throws IOException {
        a0 a0Var = new a0(8);
        a a10 = a.a(mVar, a0Var);
        if (a10.f17696a != 1685272116) {
            mVar.l();
            return -1;
        }
        mVar.i(8);
        a0Var.T(0);
        mVar.p(a0Var.e(), 0, 8);
        long u10 = a0Var.u();
        mVar.m(((int) a10.f17697b) + 8);
        return u10;
    }

    private static a d(int i10, m mVar, a0 a0Var) throws IOException {
        a a10 = a.a(mVar, a0Var);
        while (a10.f17696a != i10) {
            r.i("WavHeaderReader", "Ignoring unknown WAV chunk: " + a10.f17696a);
            long j10 = a10.f17697b + 8;
            if (j10 <= 2147483647L) {
                mVar.m((int) j10);
                a10 = a.a(mVar, a0Var);
            } else {
                throw y2.d("Chunk is too large (~2GB+) to skip; id: " + a10.f17696a);
            }
        }
        return a10;
    }

    public static Pair<Long, Long> e(m mVar) throws IOException {
        mVar.l();
        a d10 = d(1684108385, mVar, new a0(8));
        mVar.m(8);
        return Pair.create(Long.valueOf(mVar.c()), Long.valueOf(d10.f17697b));
    }
}
