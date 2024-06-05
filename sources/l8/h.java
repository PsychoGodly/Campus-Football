package l8;

import android.content.Context;
import e7.c;
import e7.r;

/* compiled from: LibraryVersionComponent */
public class h {

    /* compiled from: LibraryVersionComponent */
    public interface a<T> {
        String a(T t10);
    }

    public static c<?> b(String str, String str2) {
        return c.l(f.a(str, str2), f.class);
    }

    public static c<?> c(String str, a<Context> aVar) {
        return c.m(f.class).b(r.k(Context.class)).f(new g(str, aVar)).d();
    }
}
