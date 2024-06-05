package p0;

import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import ee.a;
import fe.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: InitializerViewModelFactory.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<f<?>> f21099a = new ArrayList();

    public final <T extends k0> void a(le.c<T> cVar, l<? super a, ? extends T> lVar) {
        m.e(cVar, "clazz");
        m.e(lVar, "initializer");
        this.f21099a.add(new f(a.a(cVar), lVar));
    }

    public final l0.b b() {
        f[] fVarArr = (f[]) this.f21099a.toArray(new f[0]);
        return new b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
