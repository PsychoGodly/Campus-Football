package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* compiled from: TooltipCompat */
public class e1 {

    /* compiled from: TooltipCompat */
    static class a {
        static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
        } else {
            h1.h(view, charSequence);
        }
    }
}
