package dd;

import r6.i;

/* compiled from: PartialForwardingClientCall */
abstract class d1<ReqT, RespT> extends g<ReqT, RespT> {
    d1() {
    }

    public void a(String str, Throwable th) {
        f().a(str, th);
    }

    public void b() {
        f().b();
    }

    public void c(int i10) {
        f().c(i10);
    }

    /* access modifiers changed from: protected */
    public abstract g<?, ?> f();

    public String toString() {
        return i.c(this).d("delegate", f()).toString();
    }
}
