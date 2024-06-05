package a2;

import a2.f;
import com.google.auto.value.AutoValue;

@AutoValue
/* compiled from: LogEvent */
public abstract class l {

    @AutoValue.Builder
    /* compiled from: LogEvent */
    public static abstract class a {
        public abstract l a();

        public abstract a b(Integer num);

        public abstract a c(long j10);

        public abstract a d(long j10);

        public abstract a e(o oVar);

        /* access modifiers changed from: package-private */
        public abstract a f(byte[] bArr);

        /* access modifiers changed from: package-private */
        public abstract a g(String str);

        public abstract a h(long j10);
    }

    private static a a() {
        return new f.b();
    }

    public static a i(String str) {
        return a().g(str);
    }

    public static a j(byte[] bArr) {
        return a().f(bArr);
    }

    public abstract Integer b();

    public abstract long c();

    public abstract long d();

    public abstract o e();

    public abstract byte[] f();

    public abstract String g();

    public abstract long h();
}
