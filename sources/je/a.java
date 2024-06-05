package je;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.m;

/* compiled from: PlatformThreadLocalRandom.kt */
public final class a extends ie.a {
    public int d(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    public long f(long j10, long j11) {
        return ThreadLocalRandom.current().nextLong(j10, j11);
    }

    public Random g() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        m.d(current, "current()");
        return current;
    }
}
