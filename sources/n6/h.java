package n6;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: MaterialShapeUtils */
public class h {
    static d a(int i10) {
        if (i10 == 0) {
            return new j();
        }
        if (i10 != 1) {
            return b();
        }
        return new e();
    }

    static d b() {
        return new j();
    }

    static f c() {
        return new f();
    }

    public static void d(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            ((g) background).S(f10);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            f(view, (g) background);
        }
    }

    public static void f(View view, g gVar) {
        if (gVar.N()) {
            gVar.W(com.google.android.material.internal.h.b(view));
        }
    }
}
