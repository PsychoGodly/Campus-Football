package k7;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FieldDescriptor */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f29139a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Object> f29140b;

    /* compiled from: FieldDescriptor */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f29141a;

        /* renamed from: b  reason: collision with root package name */
        private Map<Class<?>, Object> f29142b = null;

        b(String str) {
            this.f29141a = str;
        }

        public c a() {
            Map map;
            String str = this.f29141a;
            if (this.f29142b == null) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(new HashMap(this.f29142b));
            }
            return new c(str, map);
        }

        public <T extends Annotation> b b(T t10) {
            if (this.f29142b == null) {
                this.f29142b = new HashMap();
            }
            this.f29142b.put(t10.annotationType(), t10);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.emptyMap());
    }

    public String b() {
        return this.f29139a;
    }

    public <T extends Annotation> T c(Class<T> cls) {
        return (Annotation) this.f29140b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f29139a.equals(cVar.f29139a) || !this.f29140b.equals(cVar.f29140b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f29139a.hashCode() * 31) + this.f29140b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f29139a + ", properties=" + this.f29140b.values() + "}";
    }

    private c(String str, Map<Class<?>, Object> map) {
        this.f29139a = str;
        this.f29140b = map;
    }
}
