package n7;

import java.lang.annotation.Annotation;
import n7.d;

/* compiled from: AtProtobuf */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private int f29414a;

    /* renamed from: b  reason: collision with root package name */
    private d.a f29415b = d.a.DEFAULT;

    /* renamed from: n7.a$a  reason: collision with other inner class name */
    /* compiled from: AtProtobuf */
    private static final class C0312a implements d {

        /* renamed from: a  reason: collision with root package name */
        private final int f29416a;

        /* renamed from: b  reason: collision with root package name */
        private final d.a f29417b;

        C0312a(int i10, d.a aVar) {
            this.f29416a = i10;
            this.f29417b = aVar;
        }

        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f29416a != dVar.tag() || !this.f29417b.equals(dVar.intEncoding())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f29416a ^ 14552422) + (this.f29417b.hashCode() ^ 2041407134);
        }

        public d.a intEncoding() {
            return this.f29417b;
        }

        public int tag() {
            return this.f29416a;
        }

        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + '(' + "tag=" + this.f29416a + "intEncoding=" + this.f29417b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0312a(this.f29414a, this.f29415b);
    }

    public a c(int i10) {
        this.f29414a = i10;
        return this;
    }
}
