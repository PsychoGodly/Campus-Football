package dd;

import dd.g;

/* compiled from: ForwardingClientCall */
public abstract class z<ReqT, RespT> extends d1<ReqT, RespT> {
    public /* bridge */ /* synthetic */ void a(String str, Throwable th) {
        super.a(str, th);
    }

    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public /* bridge */ /* synthetic */ void c(int i10) {
        super.c(i10);
    }

    public void d(ReqT reqt) {
        f().d(reqt);
    }

    public void e(g.a<RespT> aVar, y0 y0Var) {
        f().e(aVar, y0Var);
    }

    /* access modifiers changed from: protected */
    public abstract g<ReqT, RespT> f();

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
