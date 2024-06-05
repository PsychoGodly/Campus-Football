package r6;

import java.io.Serializable;

/* compiled from: Optional */
public abstract class l<T> implements Serializable {
    l() {
    }

    public static <T> l<T> a() {
        return a.e();
    }

    public static <T> l<T> d(T t10) {
        return new r(o.o(t10));
    }

    public abstract T b();

    public abstract boolean c();
}
