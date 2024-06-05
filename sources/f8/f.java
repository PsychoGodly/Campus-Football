package f8;

import com.google.auto.value.AutoValue;
import f8.b;

@AutoValue
/* compiled from: TokenResult */
public abstract class f {

    @AutoValue.Builder
    /* compiled from: TokenResult */
    public static abstract class a {
        public abstract f a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j10);
    }

    /* compiled from: TokenResult */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        return new b.C0302b().d(0);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
