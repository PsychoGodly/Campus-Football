package b2;

import b2.c;
import com.google.auto.value.AutoValue;
import z1.b;
import z1.c;
import z1.e;

@AutoValue
/* compiled from: SendRequest */
abstract class n {

    @AutoValue.Builder
    /* compiled from: SendRequest */
    public static abstract class a {
        public abstract n a();

        /* access modifiers changed from: package-private */
        public abstract a b(b bVar);

        /* access modifiers changed from: package-private */
        public abstract a c(c<?> cVar);

        /* access modifiers changed from: package-private */
        public abstract a d(e<?, byte[]> eVar);

        public abstract a e(o oVar);

        public abstract a f(String str);
    }

    n() {
    }

    public static a a() {
        return new c.b();
    }

    public abstract b b();

    /* access modifiers changed from: package-private */
    public abstract z1.c<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    /* access modifiers changed from: package-private */
    public abstract e<?, byte[]> e();

    public abstract o f();

    public abstract String g();
}
