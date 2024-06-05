package e7;

import java.lang.annotation.Annotation;

/* compiled from: Qualified */
public final class f0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<? extends Annotation> f28756a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<T> f28757b;

    /* compiled from: Qualified */
    private @interface a {
    }

    public f0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f28756a = cls;
        this.f28757b = cls2;
    }

    public static <T> f0<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new f0<>(cls, cls2);
    }

    public static <T> f0<T> b(Class<T> cls) {
        return new f0<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (!this.f28757b.equals(f0Var.f28757b)) {
            return false;
        }
        return this.f28756a.equals(f0Var.f28756a);
    }

    public int hashCode() {
        return (this.f28757b.hashCode() * 31) + this.f28756a.hashCode();
    }

    public String toString() {
        if (this.f28756a == a.class) {
            return this.f28757b.getName();
        }
        return "@" + this.f28756a.getName() + " " + this.f28757b.getName();
    }
}
