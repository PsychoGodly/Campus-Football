package androidx.lifecycle;

import androidx.lifecycle.b;
import androidx.lifecycle.i;

@Deprecated
class ReflectiveGenericLifecycleObserver implements m {

    /* renamed from: a  reason: collision with root package name */
    private final Object f3852a;

    /* renamed from: b  reason: collision with root package name */
    private final b.a f3853b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3852a = obj;
        this.f3853b = b.f3890c.c(obj.getClass());
    }

    public void onStateChanged(p pVar, i.a aVar) {
        this.f3853b.a(pVar, aVar, this.f3852a);
    }
}
