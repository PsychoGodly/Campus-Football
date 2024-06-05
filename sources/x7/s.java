package x7;

import b8.b;
import dd.y0;
import l8.i;
import y6.n;
import z7.j;

/* compiled from: FirebaseClientGrpcMetadataProvider */
public class s implements i0 {

    /* renamed from: d  reason: collision with root package name */
    private static final y0.g<String> f31127d;

    /* renamed from: e  reason: collision with root package name */
    private static final y0.g<String> f31128e;

    /* renamed from: f  reason: collision with root package name */
    private static final y0.g<String> f31129f;

    /* renamed from: a  reason: collision with root package name */
    private final b<j> f31130a;

    /* renamed from: b  reason: collision with root package name */
    private final b<i> f31131b;

    /* renamed from: c  reason: collision with root package name */
    private final n f31132c;

    static {
        y0.d<String> dVar = y0.f32388e;
        f31127d = y0.g.e("x-firebase-client-log-type", dVar);
        f31128e = y0.g.e("x-firebase-client", dVar);
        f31129f = y0.g.e("x-firebase-gmpid", dVar);
    }

    public s(b<i> bVar, b<j> bVar2, n nVar) {
        this.f31131b = bVar;
        this.f31130a = bVar2;
        this.f31132c = nVar;
    }

    private void b(y0 y0Var) {
        n nVar = this.f31132c;
        if (nVar != null) {
            String c10 = nVar.c();
            if (c10.length() != 0) {
                y0Var.p(f31129f, c10);
            }
        }
    }

    public void a(y0 y0Var) {
        if (this.f31130a.get() != null && this.f31131b.get() != null) {
            int a10 = this.f31130a.get().b("fire-fst").a();
            if (a10 != 0) {
                y0Var.p(f31127d, Integer.toString(a10));
            }
            y0Var.p(f31128e, this.f31131b.get().a());
            b(y0Var);
        }
    }
}
