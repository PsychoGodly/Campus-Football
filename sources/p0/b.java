package p0;

import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import kotlin.jvm.internal.m;

/* compiled from: InitializerViewModelFactory.kt */
public final class b implements l0.b {

    /* renamed from: b  reason: collision with root package name */
    private final f<?>[] f21098b;

    public b(f<?>... fVarArr) {
        m.e(fVarArr, "initializers");
        this.f21098b = fVarArr;
    }

    public /* synthetic */ k0 a(Class cls) {
        return m0.a(this, cls);
    }

    public <T extends k0> T b(Class<T> cls, a aVar) {
        m.e(cls, "modelClass");
        m.e(aVar, "extras");
        T t10 = null;
        for (f<?> fVar : this.f21098b) {
            if (m.a(fVar.a(), cls)) {
                T invoke = fVar.b().invoke(aVar);
                t10 = invoke instanceof k0 ? (k0) invoke : null;
            }
        }
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
