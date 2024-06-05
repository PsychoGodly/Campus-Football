package a2;

import a2.e;
import com.google.auto.value.AutoValue;

@AutoValue
/* compiled from: ClientInfo */
public abstract class k {

    @AutoValue.Builder
    /* compiled from: ClientInfo */
    public static abstract class a {
        public abstract k a();

        public abstract a b(a aVar);

        public abstract a c(b bVar);
    }

    /* compiled from: ClientInfo */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f134a;

        private b(int i10) {
            this.f134a = i10;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract a b();

    public abstract b c();
}
