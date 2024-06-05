package r6;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: Suppliers */
public final class w {

    /* compiled from: Suppliers */
    static class a<T> implements v<T>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        final v<T> f29836a;

        /* renamed from: b  reason: collision with root package name */
        volatile transient boolean f29837b;

        /* renamed from: c  reason: collision with root package name */
        transient T f29838c;

        a(v<T> vVar) {
            this.f29836a = (v) o.o(vVar);
        }

        public T get() {
            if (!this.f29837b) {
                synchronized (this) {
                    if (!this.f29837b) {
                        T t10 = this.f29836a.get();
                        this.f29838c = t10;
                        this.f29837b = true;
                        return t10;
                    }
                }
            }
            return j.a(this.f29838c);
        }

        public String toString() {
            Object obj;
            if (this.f29837b) {
                String valueOf = String.valueOf(this.f29838c);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
                sb2.append("<supplier that returned ");
                sb2.append(valueOf);
                sb2.append(">");
                obj = sb2.toString();
            } else {
                obj = this.f29836a;
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
            sb3.append("Suppliers.memoize(");
            sb3.append(valueOf2);
            sb3.append(")");
            return sb3.toString();
        }
    }

    /* compiled from: Suppliers */
    static class b<T> implements v<T> {

        /* renamed from: a  reason: collision with root package name */
        volatile v<T> f29839a;

        /* renamed from: b  reason: collision with root package name */
        volatile boolean f29840b;

        /* renamed from: c  reason: collision with root package name */
        T f29841c;

        b(v<T> vVar) {
            this.f29839a = (v) o.o(vVar);
        }

        public T get() {
            if (!this.f29840b) {
                synchronized (this) {
                    if (!this.f29840b) {
                        v<T> vVar = this.f29839a;
                        Objects.requireNonNull(vVar);
                        T t10 = vVar.get();
                        this.f29841c = t10;
                        this.f29840b = true;
                        this.f29839a = null;
                        return t10;
                    }
                }
            }
            return j.a(this.f29841c);
        }

        public String toString() {
            Object obj = this.f29839a;
            if (obj == null) {
                String valueOf = String.valueOf(this.f29841c);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
                sb2.append("<supplier that returned ");
                sb2.append(valueOf);
                sb2.append(">");
                obj = sb2.toString();
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
            sb3.append("Suppliers.memoize(");
            sb3.append(valueOf2);
            sb3.append(")");
            return sb3.toString();
        }
    }

    /* compiled from: Suppliers */
    private static class c<T> implements v<T>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        final T f29842a;

        c(T t10) {
            this.f29842a = t10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return k.a(this.f29842a, ((c) obj).f29842a);
            }
            return false;
        }

        public T get() {
            return this.f29842a;
        }

        public int hashCode() {
            return k.b(this.f29842a);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f29842a);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
            sb2.append("Suppliers.ofInstance(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static <T> v<T> a(v<T> vVar) {
        if ((vVar instanceof b) || (vVar instanceof a)) {
            return vVar;
        }
        if (vVar instanceof Serializable) {
            return new a(vVar);
        }
        return new b(vVar);
    }

    public static <T> v<T> b(T t10) {
        return new c(t10);
    }
}
