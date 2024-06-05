package v2;

import java.io.IOException;
import s2.a;
import s2.m;
import s2.s;
import s2.v;

/* compiled from: FlacBinarySearchSeeker */
final class b extends s2.a {

    /* renamed from: v2.b$b  reason: collision with other inner class name */
    /* compiled from: FlacBinarySearchSeeker */
    private static final class C0240b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final v f23166a;

        /* renamed from: b  reason: collision with root package name */
        private final int f23167b;

        /* renamed from: c  reason: collision with root package name */
        private final s.a f23168c;

        private long c(m mVar) throws IOException {
            while (mVar.h() < mVar.b() - 6 && !s.h(mVar, this.f23166a, this.f23167b, this.f23168c)) {
                mVar.i(1);
            }
            if (mVar.h() < mVar.b() - 6) {
                return this.f23168c.f22464a;
            }
            mVar.i((int) (mVar.b() - mVar.h()));
            return this.f23166a.f22477j;
        }

        public /* synthetic */ void a() {
            s2.b.a(this);
        }

        public a.e b(m mVar, long j10) throws IOException {
            long c10 = mVar.c();
            long c11 = c(mVar);
            long h10 = mVar.h();
            mVar.i(Math.max(6, this.f23166a.f22470c));
            long c12 = c(mVar);
            long h11 = mVar.h();
            if (c11 <= j10 && c12 > j10) {
                return a.e.e(h10);
            }
            if (c12 <= j10) {
                return a.e.f(c12, h11);
            }
            return a.e.d(c11, c10);
        }

        private C0240b(v vVar, int i10) {
            this.f23166a = vVar;
            this.f23167b = i10;
            this.f23168c = new s.a();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(s2.v r17, int r18, long r19, long r21) {
        /*
            r16 = this;
            r0 = r17
            java.util.Objects.requireNonNull(r17)
            v2.a r1 = new v2.a
            r1.<init>(r0)
            v2.b$b r2 = new v2.b$b
            r3 = 0
            r4 = r18
            r2.<init>(r0, r4)
            long r3 = r17.f()
            long r7 = r0.f22477j
            long r13 = r17.d()
            int r0 = r0.f22470c
            r5 = 6
            int r15 = java.lang.Math.max(r5, r0)
            r5 = 0
            r0 = r16
            r9 = r19
            r11 = r21
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.b.<init>(s2.v, int, long, long):void");
    }
}
