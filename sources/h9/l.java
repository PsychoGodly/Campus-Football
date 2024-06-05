package h9;

import java.util.Map;
import v8.a;
import v8.c;
import v8.d;
import v8.e;
import v8.f;
import v8.j;
import v8.n;

/* compiled from: UPCAReader */
public final class l extends p {

    /* renamed from: i  reason: collision with root package name */
    private final p f28973i = new e();

    private static n q(n nVar) throws f {
        String f10 = nVar.f();
        if (f10.charAt(0) == '0') {
            return new n(f10.substring(1), (byte[]) null, nVar.e(), a.UPC_A);
        }
        throw f.a();
    }

    public n a(c cVar, Map<e, ?> map) throws j, f {
        return q(this.f28973i.a(cVar, map));
    }

    public n b(int i10, z8.a aVar, Map<e, ?> map) throws j, f, d {
        return q(this.f28973i.b(i10, aVar, map));
    }

    /* access modifiers changed from: protected */
    public int k(z8.a aVar, int[] iArr, StringBuilder sb2) throws j {
        return this.f28973i.k(aVar, iArr, sb2);
    }

    public n l(int i10, z8.a aVar, int[] iArr, Map<e, ?> map) throws j, f, d {
        return q(this.f28973i.l(i10, aVar, iArr, map));
    }

    /* access modifiers changed from: package-private */
    public a p() {
        return a.UPC_A;
    }
}
