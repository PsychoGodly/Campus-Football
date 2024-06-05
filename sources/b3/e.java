package b3;

import java.io.IOException;
import java.util.Arrays;
import k4.a;
import k4.a0;
import s2.m;
import s2.o;

/* compiled from: OggPacket */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private final f f5481a = new f();

    /* renamed from: b  reason: collision with root package name */
    private final a0 f5482b = new a0(new byte[65025], 0);

    /* renamed from: c  reason: collision with root package name */
    private int f5483c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f5484d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5485e;

    e() {
    }

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f5484d = 0;
        do {
            int i13 = this.f5484d;
            int i14 = i10 + i13;
            f fVar = this.f5481a;
            if (i14 >= fVar.f5492g) {
                break;
            }
            int[] iArr = fVar.f5495j;
            this.f5484d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f5481a;
    }

    public a0 c() {
        return this.f5482b;
    }

    public boolean d(m mVar) throws IOException {
        int i10;
        a.f(mVar != null);
        if (this.f5485e) {
            this.f5485e = false;
            this.f5482b.P(0);
        }
        while (!this.f5485e) {
            if (this.f5483c < 0) {
                if (!this.f5481a.c(mVar) || !this.f5481a.a(mVar, true)) {
                    return false;
                }
                f fVar = this.f5481a;
                int i11 = fVar.f5493h;
                if ((fVar.f5487b & 1) == 1 && this.f5482b.g() == 0) {
                    i11 += a(0);
                    i10 = this.f5484d + 0;
                } else {
                    i10 = 0;
                }
                if (!o.e(mVar, i11)) {
                    return false;
                }
                this.f5483c = i10;
            }
            int a10 = a(this.f5483c);
            int i12 = this.f5483c + this.f5484d;
            if (a10 > 0) {
                a0 a0Var = this.f5482b;
                a0Var.c(a0Var.g() + a10);
                if (!o.d(mVar, this.f5482b.e(), this.f5482b.g(), a10)) {
                    return false;
                }
                a0 a0Var2 = this.f5482b;
                a0Var2.S(a0Var2.g() + a10);
                this.f5485e = this.f5481a.f5495j[i12 + -1] != 255;
            }
            if (i12 == this.f5481a.f5492g) {
                i12 = -1;
            }
            this.f5483c = i12;
        }
        return true;
    }

    public void e() {
        this.f5481a.b();
        this.f5482b.P(0);
        this.f5483c = -1;
        this.f5485e = false;
    }

    public void f() {
        if (this.f5482b.e().length != 65025) {
            a0 a0Var = this.f5482b;
            a0Var.R(Arrays.copyOf(a0Var.e(), Math.max(65025, this.f5482b.g())), this.f5482b.g());
        }
    }
}
