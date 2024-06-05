package d6;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import k6.b;

/* compiled from: MaterialColors */
public class a {
    public static int a(Context context, int i10, int i11) {
        TypedValue a10 = b.a(context, i10);
        return a10 != null ? a10.data : i11;
    }

    public static int b(Context context, int i10, String str) {
        return b.c(context, i10, str);
    }

    public static int c(View view, int i10) {
        return b.d(view, i10);
    }

    public static int d(View view, int i10, int i11) {
        return a(view.getContext(), i10, i11);
    }

    public static int e(int i10, int i11) {
        return androidx.core.graphics.b.c(i11, i10);
    }

    public static int f(int i10, int i11, float f10) {
        return e(i10, androidx.core.graphics.b.f(i11, Math.round(((float) Color.alpha(i11)) * f10)));
    }
}
