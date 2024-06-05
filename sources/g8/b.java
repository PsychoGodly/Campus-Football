package g8;

/* compiled from: SystemClock */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private static b f28932a;

    private b() {
    }

    public static b b() {
        if (f28932a == null) {
            f28932a = new b();
        }
        return f28932a;
    }

    public long a() {
        return System.currentTimeMillis();
    }
}
