package pd;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.m;

/* compiled from: Repository.kt */
public abstract class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, T> f37266a = new HashMap();

    private final boolean c(String str) {
        return this.f37266a.containsKey(str);
    }

    public final void a() {
        this.f37266a.clear();
    }

    /* access modifiers changed from: protected */
    public void b(String str) {
        m.e(str, "id");
        this.f37266a.remove(str);
    }

    public final T d(String str) throws d {
        m.e(str, "id");
        if (c(str)) {
            T t10 = this.f37266a.get(str);
            m.b(t10);
            return t10;
        }
        throw new d(str);
    }

    public final void e(String str, T t10) {
        m.e(str, "id");
        this.f37266a.put(str, t10);
    }
}
