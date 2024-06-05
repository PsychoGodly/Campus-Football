package ie;

import java.util.Random;
import kotlin.jvm.internal.m;

/* compiled from: PlatformRandom.kt */
public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    private final a f33333c = new a();

    /* compiled from: PlatformRandom.kt */
    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    public Random g() {
        Object obj = this.f33333c.get();
        m.d(obj, "implStorage.get()");
        return (Random) obj;
    }
}
