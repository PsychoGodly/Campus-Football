package td;

import com.applovin.impl.sdk.utils.JsonUtils;
import ge.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;

/* compiled from: Maps.kt */
final class b0 implements Map, Serializable, a {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f38601a = new b0();

    private b0() {
    }

    public boolean a(Void voidR) {
        m.e(voidR, "value");
        return false;
    }

    /* renamed from: b */
    public Void get(Object obj) {
        return null;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return a((Void) obj);
    }

    public Set<Map.Entry> d() {
        return c0.f38609a;
    }

    public Set<Object> e() {
        return c0.f38609a;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return d();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public int f() {
        return 0;
    }

    public Collection g() {
        return a0.f38597a;
    }

    /* renamed from: h */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return e();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return f();
    }

    public String toString() {
        return JsonUtils.EMPTY_JSON;
    }

    public final /* bridge */ Collection values() {
        return g();
    }
}
