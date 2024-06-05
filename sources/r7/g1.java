package r7;

import y7.b;

/* compiled from: TargetIdGenerator */
public class g1 {

    /* renamed from: a  reason: collision with root package name */
    private int f29903a;

    /* renamed from: b  reason: collision with root package name */
    private int f29904b;

    g1(int i10, int i11) {
        b.d((i10 & 1) == i10, "Generator ID %d contains more than %d reserved bits", Integer.valueOf(i10), 1);
        this.f29904b = i10;
        d(i11);
    }

    public static g1 a() {
        return new g1(1, 1);
    }

    public static g1 b(int i10) {
        g1 g1Var = new g1(0, i10);
        g1Var.c();
        return g1Var;
    }

    private void d(int i10) {
        b.d((i10 & 1) == this.f29904b, "Cannot supply target ID from different generator ID", new Object[0]);
        this.f29903a = i10;
    }

    public int c() {
        int i10 = this.f29903a;
        this.f29903a = i10 + 2;
        return i10;
    }
}
