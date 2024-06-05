package bd;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.window.layout.WindowMetrics;
import androidx.window.layout.d;

/* compiled from: ViewUtils */
public final class h {

    /* compiled from: ViewUtils */
    public interface a {
        void a(float f10, float f11, float f12);
    }

    /* compiled from: ViewUtils */
    public interface b {
        boolean a(View view);
    }

    public static void c(Context context, a aVar) {
        Activity f10 = f(context);
        if (f10 != null) {
            WindowMetrics computeMaximumWindowMetrics = d.a().computeMaximumWindowMetrics(f10);
            aVar.a((float) computeMaximumWindowMetrics.getBounds().width(), (float) computeMaximumWindowMetrics.getBounds().height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static boolean d(View view) {
        return j(view, g.f5559a);
    }

    public static int e(int i10) {
        return Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : i10;
    }

    public static Activity f(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return f(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean g(View view, Class<? extends View>[] clsArr) {
        return j(view, new f(clsArr));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean i(Class[] clsArr, View view) {
        for (Class isInstance : clsArr) {
            if (isInstance.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(View view, b bVar) {
        if (view == null) {
            return false;
        }
        if (bVar.a(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (j(viewGroup.getChildAt(i10), bVar)) {
                    return true;
                }
            }
        }
        return false;
    }
}
