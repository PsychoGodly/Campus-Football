package z9;

import android.view.View;
import x9.o;

public class b extends d {

    /* renamed from: d  reason: collision with root package name */
    private static b f31518d = new b();

    private b() {
    }

    public static b k() {
        return f31518d;
    }

    public void f(boolean z10) {
        for (o p10 : c.e().c()) {
            p10.p().k(z10);
        }
    }

    public boolean h() {
        for (o h10 : c.e().a()) {
            View h11 = h10.h();
            if (h11 != null && h11.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
