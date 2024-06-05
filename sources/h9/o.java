package h9;

import v8.j;
import v8.m;
import v8.n;
import z8.a;

/* compiled from: UPCEANExtensionSupport */
final class o {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f28979c = {1, 1, 2};

    /* renamed from: a  reason: collision with root package name */
    private final m f28980a = new m();

    /* renamed from: b  reason: collision with root package name */
    private final n f28981b = new n();

    o() {
    }

    /* access modifiers changed from: package-private */
    public n a(int i10, a aVar, int i11) throws j {
        int[] m10 = p.m(aVar, i11, false, f28979c);
        try {
            return this.f28981b.b(i10, aVar, m10);
        } catch (m unused) {
            return this.f28980a.b(i10, aVar, m10);
        }
    }
}
