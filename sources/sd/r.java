package sd;

import fe.a;
import java.io.Serializable;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: LazyJVM.kt */
final class r<T> implements g<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private a<? extends T> f38136a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f38137b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f38138c;

    public r(a<? extends T> aVar, Object obj) {
        m.e(aVar, "initializer");
        this.f38136a = aVar;
        this.f38137b = u.f38140a;
        this.f38138c = obj == null ? this : obj;
    }

    public boolean a() {
        return this.f38137b != u.f38140a;
    }

    public T getValue() {
        T t10;
        T t11 = this.f38137b;
        T t12 = u.f38140a;
        if (t11 != t12) {
            return t11;
        }
        synchronized (this.f38138c) {
            t10 = this.f38137b;
            if (t10 == t12) {
                a aVar = this.f38136a;
                m.b(aVar);
                t10 = aVar.invoke();
                this.f38137b = t10;
                this.f38136a = null;
            }
        }
        return t10;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(a aVar, Object obj, int i10, h hVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }
}
