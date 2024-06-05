package androidx.lifecycle;

import androidx.lifecycle.l0;
import kotlin.jvm.internal.m;
import p0.a;

/* compiled from: ViewModelProvider.kt */
public final /* synthetic */ class m0 {
    static {
        l0.b.a aVar = l0.b.f3952a;
    }

    public static k0 a(l0.b bVar, Class cls) {
        m.e(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public static k0 b(l0.b bVar, Class cls, a aVar) {
        m.e(cls, "modelClass");
        m.e(aVar, "extras");
        return bVar.a(cls);
    }
}
