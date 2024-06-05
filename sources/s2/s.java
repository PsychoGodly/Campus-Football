package s2;

import java.io.IOException;
import k4.a0;
import k4.n0;
import n2.y2;

/* compiled from: FlacFrameReader */
public final class s {

    /* compiled from: FlacFrameReader */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f22464a;
    }

    private static boolean a(a0 a0Var, v vVar, int i10) {
        int j10 = j(a0Var, i10);
        return j10 != -1 && j10 <= vVar.f22469b;
    }

    private static boolean b(a0 a0Var, int i10) {
        return a0Var.G() == n0.u(a0Var.e(), i10, a0Var.f() - 1, 0);
    }

    private static boolean c(a0 a0Var, v vVar, boolean z10, a aVar) {
        try {
            long N = a0Var.N();
            if (!z10) {
                N *= (long) vVar.f22469b;
            }
            aVar.f22464a = N;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(a0 a0Var, v vVar, int i10, a aVar) {
        a0 a0Var2 = a0Var;
        v vVar2 = vVar;
        int f10 = a0Var.f();
        long I = a0Var.I();
        long j10 = I >>> 16;
        if (j10 != ((long) i10)) {
            return false;
        }
        boolean z10 = (j10 & 1) == 1;
        int i11 = (int) ((I >> 12) & 15);
        int i12 = (int) ((I >> 8) & 15);
        int i13 = (int) (15 & (I >> 4));
        int i14 = (int) ((I >> 1) & 7);
        boolean z11 = (I & 1) == 1;
        if (!g(i13, vVar2) || !f(i14, vVar2) || z11 || !c(a0Var2, vVar2, z10, aVar) || !a(a0Var2, vVar2, i11) || !e(a0Var2, vVar2, i12) || !b(a0Var2, f10)) {
            return false;
        }
        return true;
    }

    private static boolean e(a0 a0Var, v vVar, int i10) {
        int i11 = vVar.f22472e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            if (i10 == vVar.f22473f) {
                return true;
            }
            return false;
        } else if (i10 == 12) {
            if (a0Var.G() * 1000 == i11) {
                return true;
            }
            return false;
        } else if (i10 > 14) {
            return false;
        } else {
            int M = a0Var.M();
            if (i10 == 14) {
                M *= 10;
            }
            if (M == i11) {
                return true;
            }
            return false;
        }
    }

    private static boolean f(int i10, v vVar) {
        return i10 == 0 || i10 == vVar.f22476i;
    }

    private static boolean g(int i10, v vVar) {
        if (i10 <= 7) {
            return i10 == vVar.f22474g - 1;
        }
        if (i10 > 10 || vVar.f22474g != 2) {
            return false;
        }
        return true;
    }

    public static boolean h(m mVar, v vVar, int i10, a aVar) throws IOException {
        long h10 = mVar.h();
        byte[] bArr = new byte[2];
        mVar.p(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            mVar.l();
            mVar.i((int) (h10 - mVar.c()));
            return false;
        }
        a0 a0Var = new a0(16);
        System.arraycopy(bArr, 0, a0Var.e(), 0, 2);
        a0Var.S(o.c(mVar, a0Var.e(), 2, 14));
        mVar.l();
        mVar.i((int) (h10 - mVar.c()));
        return d(a0Var, vVar, i10, aVar);
    }

    public static long i(m mVar, v vVar) throws IOException {
        mVar.l();
        boolean z10 = true;
        mVar.i(1);
        byte[] bArr = new byte[1];
        mVar.p(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z10 = false;
        }
        mVar.i(2);
        int i10 = z10 ? 7 : 6;
        a0 a0Var = new a0(i10);
        a0Var.S(o.c(mVar, a0Var.e(), 0, i10));
        mVar.l();
        a aVar = new a();
        if (c(a0Var, vVar, z10, aVar)) {
            return aVar.f22464a;
        }
        throw y2.a((String) null, (Throwable) null);
    }

    public static int j(a0 a0Var, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return a0Var.G() + 1;
            case 7:
                return a0Var.M() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
