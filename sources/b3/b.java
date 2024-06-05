package b3;

import b3.i;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import k4.a0;
import k4.n0;
import s2.b0;
import s2.m;
import s2.s;
import s2.t;
import s2.u;
import s2.v;

/* compiled from: FlacReader */
final class b extends i {

    /* renamed from: n  reason: collision with root package name */
    private v f5470n;

    /* renamed from: o  reason: collision with root package name */
    private a f5471o;

    /* compiled from: FlacReader */
    private static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        private v f5472a;

        /* renamed from: b  reason: collision with root package name */
        private v.a f5473b;

        /* renamed from: c  reason: collision with root package name */
        private long f5474c = -1;

        /* renamed from: d  reason: collision with root package name */
        private long f5475d = -1;

        public a(v vVar, v.a aVar) {
            this.f5472a = vVar;
            this.f5473b = aVar;
        }

        public long a(m mVar) {
            long j10 = this.f5475d;
            if (j10 < 0) {
                return -1;
            }
            long j11 = -(j10 + 2);
            this.f5475d = -1;
            return j11;
        }

        public b0 b() {
            k4.a.f(this.f5474c != -1);
            return new u(this.f5472a, this.f5474c);
        }

        public void c(long j10) {
            long[] jArr = this.f5473b.f22480a;
            this.f5475d = jArr[n0.i(jArr, j10, true, true)];
        }

        public void d(long j10) {
            this.f5474c = j10;
        }
    }

    b() {
    }

    private int n(a0 a0Var) {
        int i10 = (a0Var.e()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            a0Var.U(4);
            a0Var.N();
        }
        int j10 = s.j(a0Var, i10);
        a0Var.T(0);
        return j10;
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(a0 a0Var) {
        return a0Var.a() >= 5 && a0Var.G() == 127 && a0Var.I() == 1179402563;
    }

    /* access modifiers changed from: protected */
    public long f(a0 a0Var) {
        if (!o(a0Var.e())) {
            return -1;
        }
        return (long) n(a0Var);
    }

    /* access modifiers changed from: protected */
    public boolean h(a0 a0Var, long j10, i.b bVar) {
        byte[] e10 = a0Var.e();
        v vVar = this.f5470n;
        if (vVar == null) {
            v vVar2 = new v(e10, 17);
            this.f5470n = vVar2;
            bVar.f5513a = vVar2.g(Arrays.copyOfRange(e10, 9, a0Var.g()), (f3.a) null);
            return true;
        } else if ((e10[0] & Ascii.DEL) == 3) {
            v.a f10 = t.f(a0Var);
            v b10 = vVar.b(f10);
            this.f5470n = b10;
            this.f5471o = new a(b10, f10);
            return true;
        } else if (!o(e10)) {
            return true;
        } else {
            a aVar = this.f5471o;
            if (aVar != null) {
                aVar.d(j10);
                bVar.f5514b = this.f5471o;
            }
            k4.a.e(bVar.f5513a);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f5470n = null;
            this.f5471o = null;
        }
    }
}
