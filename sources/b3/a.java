package b3;

import java.io.EOFException;
import java.io.IOException;
import k4.n0;
import s2.b0;
import s2.c0;
import s2.m;
import s2.o;

/* compiled from: DefaultOggSeeker */
final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final f f5457a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final long f5458b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final long f5459c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final i f5460d;

    /* renamed from: e  reason: collision with root package name */
    private int f5461e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public long f5462f;

    /* renamed from: g  reason: collision with root package name */
    private long f5463g;

    /* renamed from: h  reason: collision with root package name */
    private long f5464h;

    /* renamed from: i  reason: collision with root package name */
    private long f5465i;

    /* renamed from: j  reason: collision with root package name */
    private long f5466j;

    /* renamed from: k  reason: collision with root package name */
    private long f5467k;

    /* renamed from: l  reason: collision with root package name */
    private long f5468l;

    /* compiled from: DefaultOggSeeker */
    private final class b implements b0 {
        private b() {
        }

        public boolean f() {
            return true;
        }

        public b0.a h(long j10) {
            return new b0.a(new c0(j10, n0.r((a.this.f5458b + ((a.this.f5460d.c(j10) * (a.this.f5459c - a.this.f5458b)) / a.this.f5462f)) - 30000, a.this.f5458b, a.this.f5459c - 1)));
        }

        public long i() {
            return a.this.f5460d.b(a.this.f5462f);
        }
    }

    public a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        k4.a.a(j10 >= 0 && j11 > j10);
        this.f5460d = iVar;
        this.f5458b = j10;
        this.f5459c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f5462f = j13;
            this.f5461e = 4;
        } else {
            this.f5461e = 0;
        }
        this.f5457a = new f();
    }

    private long i(m mVar) throws IOException {
        m mVar2 = mVar;
        if (this.f5465i == this.f5466j) {
            return -1;
        }
        long c10 = mVar.c();
        if (!this.f5457a.d(mVar2, this.f5466j)) {
            long j10 = this.f5465i;
            if (j10 != c10) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f5457a.a(mVar2, false);
        mVar.l();
        long j11 = this.f5464h;
        f fVar = this.f5457a;
        long j12 = fVar.f5488c;
        long j13 = j11 - j12;
        int i10 = fVar.f5493h + fVar.f5494i;
        if (0 <= j13 && j13 < 72000) {
            return -1;
        }
        int i11 = (j13 > 0 ? 1 : (j13 == 0 ? 0 : -1));
        if (i11 < 0) {
            this.f5466j = c10;
            this.f5468l = j12;
        } else {
            this.f5465i = mVar.c() + ((long) i10);
            this.f5467k = this.f5457a.f5488c;
        }
        long j14 = this.f5466j;
        long j15 = this.f5465i;
        if (j14 - j15 < 100000) {
            this.f5466j = j15;
            return j15;
        }
        long j16 = ((long) i10) * (i11 <= 0 ? 2 : 1);
        long j17 = this.f5466j;
        long j18 = this.f5465i;
        return n0.r((mVar.c() - j16) + ((j13 * (j17 - j18)) / (this.f5468l - this.f5467k)), j18, j17 - 1);
    }

    private void k(m mVar) throws IOException {
        while (true) {
            this.f5457a.c(mVar);
            this.f5457a.a(mVar, false);
            f fVar = this.f5457a;
            if (fVar.f5488c > this.f5464h) {
                mVar.l();
                return;
            }
            mVar.m(fVar.f5493h + fVar.f5494i);
            this.f5465i = mVar.c();
            this.f5467k = this.f5457a.f5488c;
        }
    }

    public long a(m mVar) throws IOException {
        int i10 = this.f5461e;
        if (i10 == 0) {
            long c10 = mVar.c();
            this.f5463g = c10;
            this.f5461e = 1;
            long j10 = this.f5459c - 65307;
            if (j10 > c10) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long i11 = i(mVar);
                if (i11 != -1) {
                    return i11;
                }
                this.f5461e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            k(mVar);
            this.f5461e = 4;
            return -(this.f5467k + 2);
        }
        this.f5462f = j(mVar);
        this.f5461e = 4;
        return this.f5463g;
    }

    public void c(long j10) {
        this.f5464h = n0.r(j10, 0, this.f5462f - 1);
        this.f5461e = 2;
        this.f5465i = this.f5458b;
        this.f5466j = this.f5459c;
        this.f5467k = 0;
        this.f5468l = this.f5462f;
    }

    /* renamed from: h */
    public b b() {
        if (this.f5462f != 0) {
            return new b();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public long j(m mVar) throws IOException {
        this.f5457a.b();
        if (this.f5457a.c(mVar)) {
            this.f5457a.a(mVar, false);
            f fVar = this.f5457a;
            mVar.m(fVar.f5493h + fVar.f5494i);
            long j10 = this.f5457a.f5488c;
            while (true) {
                f fVar2 = this.f5457a;
                if ((fVar2.f5487b & 4) == 4 || !fVar2.c(mVar) || mVar.c() >= this.f5459c || !this.f5457a.a(mVar, true)) {
                    break;
                }
                f fVar3 = this.f5457a;
                if (!o.e(mVar, fVar3.f5493h + fVar3.f5494i)) {
                    break;
                }
                j10 = this.f5457a.f5488c;
            }
            return j10;
        }
        throw new EOFException();
    }
}
