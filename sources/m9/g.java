package m9;

import java.util.Formatter;

/* compiled from: DetectionResultColumn */
class g {

    /* renamed from: a  reason: collision with root package name */
    private final c f29283a;

    /* renamed from: b  reason: collision with root package name */
    private final d[] f29284b;

    g(c cVar) {
        this.f29283a = new c(cVar);
        this.f29284b = new d[((cVar.f() - cVar.h()) + 1)];
    }

    /* access modifiers changed from: package-private */
    public final c a() {
        return this.f29283a;
    }

    /* access modifiers changed from: package-private */
    public final d b(int i10) {
        return this.f29284b[e(i10)];
    }

    /* access modifiers changed from: package-private */
    public final d c(int i10) {
        d dVar;
        d dVar2;
        d b10 = b(i10);
        if (b10 != null) {
            return b10;
        }
        for (int i11 = 1; i11 < 5; i11++) {
            int e10 = e(i10) - i11;
            if (e10 >= 0 && (dVar2 = this.f29284b[e10]) != null) {
                return dVar2;
            }
            int e11 = e(i10) + i11;
            d[] dVarArr = this.f29284b;
            if (e11 < dVarArr.length && (dVar = dVarArr[e11]) != null) {
                return dVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final d[] d() {
        return this.f29284b;
    }

    /* access modifiers changed from: package-private */
    public final int e(int i10) {
        return i10 - this.f29283a.h();
    }

    /* access modifiers changed from: package-private */
    public final void f(int i10, d dVar) {
        this.f29284b[e(i10)] = dVar;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        int i10 = 0;
        for (d dVar : this.f29284b) {
            if (dVar == null) {
                formatter.format("%3d:    |   %n", new Object[]{Integer.valueOf(i10)});
                i10++;
            } else {
                formatter.format("%3d: %3d|%3d%n", new Object[]{Integer.valueOf(i10), Integer.valueOf(dVar.c()), Integer.valueOf(dVar.e())});
                i10++;
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
