package j4;

import j4.b;
import java.util.Arrays;
import k4.a;
import k4.n0;

/* compiled from: DefaultAllocator */
public final class q implements b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f19408a;

    /* renamed from: b  reason: collision with root package name */
    private final int f19409b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f19410c;

    /* renamed from: d  reason: collision with root package name */
    private int f19411d;

    /* renamed from: e  reason: collision with root package name */
    private int f19412e;

    /* renamed from: f  reason: collision with root package name */
    private int f19413f;

    /* renamed from: g  reason: collision with root package name */
    private a[] f19414g;

    public q(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public synchronized void a(b.a aVar) {
        while (aVar != null) {
            a[] aVarArr = this.f19414g;
            int i10 = this.f19413f;
            this.f19413f = i10 + 1;
            aVarArr[i10] = aVar.a();
            this.f19412e--;
            aVar = aVar.next();
        }
        notifyAll();
    }

    public synchronized void b(a aVar) {
        a[] aVarArr = this.f19414g;
        int i10 = this.f19413f;
        this.f19413f = i10 + 1;
        aVarArr[i10] = aVar;
        this.f19412e--;
        notifyAll();
    }

    public synchronized a c() {
        a aVar;
        this.f19412e++;
        int i10 = this.f19413f;
        if (i10 > 0) {
            a[] aVarArr = this.f19414g;
            int i11 = i10 - 1;
            this.f19413f = i11;
            aVar = (a) a.e(aVarArr[i11]);
            this.f19414g[this.f19413f] = null;
        } else {
            aVar = new a(new byte[this.f19409b], 0);
            int i12 = this.f19412e;
            a[] aVarArr2 = this.f19414g;
            if (i12 > aVarArr2.length) {
                this.f19414g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
            }
        }
        return aVar;
    }

    public synchronized void d() {
        int i10 = 0;
        int max = Math.max(0, n0.l(this.f19411d, this.f19409b) - this.f19412e);
        int i11 = this.f19413f;
        if (max < i11) {
            if (this.f19410c != null) {
                int i12 = i11 - 1;
                while (i10 <= i12) {
                    a aVar = (a) a.e(this.f19414g[i10]);
                    if (aVar.f19285a == this.f19410c) {
                        i10++;
                    } else {
                        a aVar2 = (a) a.e(this.f19414g[i12]);
                        if (aVar2.f19285a != this.f19410c) {
                            i12--;
                        } else {
                            a[] aVarArr = this.f19414g;
                            aVarArr[i10] = aVar2;
                            aVarArr[i12] = aVar;
                            i12--;
                            i10++;
                        }
                    }
                }
                max = Math.max(max, i10);
                if (max >= this.f19413f) {
                    return;
                }
            }
            Arrays.fill(this.f19414g, max, this.f19413f, (Object) null);
            this.f19413f = max;
        }
    }

    public int e() {
        return this.f19409b;
    }

    public synchronized int f() {
        return this.f19412e * this.f19409b;
    }

    public synchronized void g() {
        if (this.f19408a) {
            h(0);
        }
    }

    public synchronized void h(int i10) {
        boolean z10 = i10 < this.f19411d;
        this.f19411d = i10;
        if (z10) {
            d();
        }
    }

    public q(boolean z10, int i10, int i11) {
        boolean z11 = true;
        a.a(i10 > 0);
        a.a(i11 < 0 ? false : z11);
        this.f19408a = z10;
        this.f19409b = i10;
        this.f19413f = i11;
        this.f19414g = new a[(i11 + 100)];
        if (i11 > 0) {
            this.f19410c = new byte[(i11 * i10)];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f19414g[i12] = new a(this.f19410c, i12 * i10);
            }
            return;
        }
        this.f19410c = null;
    }
}
