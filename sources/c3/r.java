package c3;

import c3.i0;
import k4.a;
import k4.a0;
import n2.r1;
import s2.e0;
import s2.n;

/* compiled from: Id3Reader */
public final class r implements m {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f5909a = new a0(10);

    /* renamed from: b  reason: collision with root package name */
    private e0 f5910b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5911c;

    /* renamed from: d  reason: collision with root package name */
    private long f5912d = -9223372036854775807L;

    /* renamed from: e  reason: collision with root package name */
    private int f5913e;

    /* renamed from: f  reason: collision with root package name */
    private int f5914f;

    public void b() {
        this.f5911c = false;
        this.f5912d = -9223372036854775807L;
    }

    public void c(a0 a0Var) {
        a.h(this.f5910b);
        if (this.f5911c) {
            int a10 = a0Var.a();
            int i10 = this.f5914f;
            if (i10 < 10) {
                int min = Math.min(a10, 10 - i10);
                System.arraycopy(a0Var.e(), a0Var.f(), this.f5909a.e(), this.f5914f, min);
                if (this.f5914f + min == 10) {
                    this.f5909a.T(0);
                    if (73 == this.f5909a.G() && 68 == this.f5909a.G() && 51 == this.f5909a.G()) {
                        this.f5909a.U(3);
                        this.f5913e = this.f5909a.F() + 10;
                    } else {
                        k4.r.i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f5911c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a10, this.f5913e - this.f5914f);
            this.f5910b.d(a0Var, min2);
            this.f5914f += min2;
        }
    }

    public void d() {
        int i10;
        a.h(this.f5910b);
        if (this.f5911c && (i10 = this.f5913e) != 0 && this.f5914f == i10) {
            long j10 = this.f5912d;
            if (j10 != -9223372036854775807L) {
                this.f5910b.b(j10, 1, i10, 0, (e0.a) null);
            }
            this.f5911c = false;
        }
    }

    public void e(n nVar, i0.d dVar) {
        dVar.a();
        e0 e10 = nVar.e(dVar.c(), 5);
        this.f5910b = e10;
        e10.a(new r1.b().U(dVar.b()).g0("application/id3").G());
    }

    public void f(long j10, int i10) {
        if ((i10 & 4) != 0) {
            this.f5911c = true;
            if (j10 != -9223372036854775807L) {
                this.f5912d = j10;
            }
            this.f5913e = 0;
            this.f5914f = 0;
        }
    }
}
