package ie;

import java.util.Random;

/* compiled from: PlatformRandom.kt */
public abstract class a extends c {
    public int b(int i10) {
        return d.f(g().nextInt(), i10);
    }

    public int c() {
        return g().nextInt();
    }

    public long e() {
        return g().nextLong();
    }

    public abstract Random g();
}
