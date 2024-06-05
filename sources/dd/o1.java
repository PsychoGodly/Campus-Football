package dd;

import dd.r;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ThreadLocalContextStorage */
final class o1 extends r.c {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f32320a = Logger.getLogger(o1.class.getName());

    /* renamed from: b  reason: collision with root package name */
    static final ThreadLocal<r> f32321b = new ThreadLocal<>();

    o1() {
    }

    public r b() {
        r rVar = f32321b.get();
        return rVar == null ? r.f32335d : rVar;
    }

    public void c(r rVar, r rVar2) {
        if (b() != rVar) {
            f32320a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (rVar2 != r.f32335d) {
            f32321b.set(rVar2);
        } else {
            f32321b.set((Object) null);
        }
    }

    public r d(r rVar) {
        r b10 = b();
        f32321b.set(rVar);
        return b10;
    }
}
