package m5;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class h implements e {

    /* renamed from: a  reason: collision with root package name */
    private static final h f20095a = new h();

    private h() {
    }

    public static e d() {
        return f20095a;
    }

    public final long a() {
        return System.currentTimeMillis();
    }

    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    public final long c() {
        return System.nanoTime();
    }
}
