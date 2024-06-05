package n2;

import java.util.HashSet;

/* compiled from: ExoPlayerLibraryInfo */
public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    private static final HashSet<String> f20609a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private static String f20610b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (o1.class) {
            if (f20609a.add(str)) {
                f20610b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (o1.class) {
            str = f20610b;
        }
        return str;
    }
}
