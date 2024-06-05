package p0;

import androidx.lifecycle.k0;
import fe.l;
import kotlin.jvm.internal.m;

/* compiled from: InitializerViewModelFactory.kt */
public final class f<T extends k0> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f21101a;

    /* renamed from: b  reason: collision with root package name */
    private final l<a, T> f21102b;

    public f(Class<T> cls, l<? super a, ? extends T> lVar) {
        m.e(cls, "clazz");
        m.e(lVar, "initializer");
        this.f21101a = cls;
        this.f21102b = lVar;
    }

    public final Class<T> a() {
        return this.f21101a;
    }

    public final l<a, T> b() {
        return this.f21102b;
    }
}
