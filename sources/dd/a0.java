package dd;

import java.util.List;

/* compiled from: GlobalInterceptors */
final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private static List<h> f32113a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f32114b;

    static synchronized List<h> a() {
        List<h> list;
        synchronized (a0.class) {
            f32114b = true;
            list = f32113a;
        }
        return list;
    }
}
