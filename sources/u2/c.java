package u2;

import k4.a0;

/* compiled from: AviMainHeaderChunk */
final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final int f22814a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22815b;

    /* renamed from: c  reason: collision with root package name */
    public final int f22816c;

    /* renamed from: d  reason: collision with root package name */
    public final int f22817d;

    private c(int i10, int i11, int i12, int i13) {
        this.f22814a = i10;
        this.f22815b = i11;
        this.f22816c = i12;
        this.f22817d = i13;
    }

    public static c b(a0 a0Var) {
        int t10 = a0Var.t();
        a0Var.U(8);
        int t11 = a0Var.t();
        int t12 = a0Var.t();
        a0Var.U(4);
        int t13 = a0Var.t();
        a0Var.U(12);
        return new c(t10, t11, t12, t13);
    }

    public boolean a() {
        return (this.f22815b & 16) == 16;
    }

    public int getType() {
        return 1751742049;
    }
}
