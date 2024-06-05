package androidx.lifecycle;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;

/* compiled from: ViewModelStore.kt */
public class o0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, k0> f3958a = new LinkedHashMap();

    public final void a() {
        for (k0 a10 : this.f3958a.values()) {
            a10.a();
        }
        this.f3958a.clear();
    }

    public final k0 b(String str) {
        m.e(str, "key");
        return this.f3958a.get(str);
    }

    public final Set<String> c() {
        return new HashSet(this.f3958a.keySet());
    }

    public final void d(String str, k0 k0Var) {
        m.e(str, "key");
        m.e(k0Var, "viewModel");
        k0 put = this.f3958a.put(str, k0Var);
        if (put != null) {
            put.d();
        }
    }
}
