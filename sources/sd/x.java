package sd;

import fe.a;
import java.io.Serializable;
import kotlin.jvm.internal.m;

/* compiled from: Lazy.kt */
public final class x<T> implements g<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private a<? extends T> f38142a;

    /* renamed from: b  reason: collision with root package name */
    private Object f38143b = u.f38140a;

    public x(a<? extends T> aVar) {
        m.e(aVar, "initializer");
        this.f38142a = aVar;
    }

    public boolean a() {
        return this.f38143b != u.f38140a;
    }

    public T getValue() {
        if (this.f38143b == u.f38140a) {
            a<? extends T> aVar = this.f38142a;
            m.b(aVar);
            this.f38143b = aVar.invoke();
            this.f38142a = null;
        }
        return this.f38143b;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
