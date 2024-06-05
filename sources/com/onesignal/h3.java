package com.onesignal;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.onesignal.a;
import java.lang.ref.WeakReference;

/* compiled from: OSViewUtils */
class h3 {

    /* renamed from: a  reason: collision with root package name */
    private static final int f27839a = b(24);

    /* compiled from: OSViewUtils */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f27840a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f27841b;

        /* renamed from: com.onesignal.h3$a$a  reason: collision with other inner class name */
        /* compiled from: OSViewUtils */
        class C0292a extends a.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f27842a;

            C0292a(a aVar) {
                this.f27842a = aVar;
            }

            /* access modifiers changed from: package-private */
            public void a(Activity activity) {
                this.f27842a.r(a.this.f27840a);
                if (h3.k(activity)) {
                    a.this.f27841b.run();
                } else {
                    h3.a(activity, a.this.f27841b);
                }
            }
        }

        a(String str, Runnable runnable) {
            this.f27840a = str;
            this.f27841b = runnable;
        }

        public void run() {
            a b10 = b.b();
            if (b10 != null) {
                b10.c(this.f27840a, new C0292a(b10));
            }
        }
    }

    static void a(Activity activity, Runnable runnable) {
        activity.getWindow().getDecorView().post(new a("decorViewReady:" + runnable, runnable));
    }

    static int b(int i10) {
        return (int) (((float) i10) * Resources.getSystem().getDisplayMetrics().density);
    }

    static int[] c(Activity activity) {
        float f10;
        DisplayCutout cutout;
        Rect i10 = i(activity);
        View findViewById = activity.getWindow().findViewById(16908290);
        float top = ((float) (i10.top - findViewById.getTop())) / Resources.getSystem().getDisplayMetrics().density;
        float bottom = ((float) (findViewById.getBottom() - i10.bottom)) / Resources.getSystem().getDisplayMetrics().density;
        float f11 = 0.0f;
        if (Build.VERSION.SDK_INT != 29 || (cutout = activity.getWindowManager().getDefaultDisplay().getCutout()) == null) {
            f10 = 0.0f;
        } else {
            f11 = ((float) cutout.getSafeInsetRight()) / Resources.getSystem().getDisplayMetrics().density;
            f10 = ((float) cutout.getSafeInsetLeft()) / Resources.getSystem().getDisplayMetrics().density;
        }
        return new int[]{Math.round(top), Math.round(bottom), Math.round(f11), Math.round(f10)};
    }

    private static int d(Activity activity) {
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        return point.y;
    }

    static int e(Activity activity) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.getWindow().getDecorView().getWidth();
        }
        return j(activity);
    }

    static int f(Activity activity) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return g(activity);
        }
        if (i10 >= 21) {
            return h(activity);
        }
        return d(activity);
    }

    private static int g(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return decorView.getHeight();
        }
        return (decorView.getHeight() - rootWindowInsets.getStableInsetBottom()) - rootWindowInsets.getStableInsetTop();
    }

    private static int h(Activity activity) {
        if (activity.getResources().getConfiguration().orientation == 2) {
            return i(activity).height();
        }
        return d(activity);
    }

    private static Rect i(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    static int j(Activity activity) {
        return i(activity).width();
    }

    static boolean k(Activity activity) {
        boolean z10 = activity.getWindow().getDecorView().getApplicationWindowToken() != null;
        if (Build.VERSION.SDK_INT < 23) {
            return z10;
        }
        boolean z11 = activity.getWindow().getDecorView().getRootWindowInsets() != null;
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }

    static boolean l(WeakReference<Activity> weakReference) {
        View view;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Rect rect = new Rect();
        if (weakReference.get() != null) {
            Window window = ((Activity) weakReference.get()).getWindow();
            view = window.getDecorView();
            view.getWindowVisibleDisplayFrame(rect);
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            view = null;
        }
        if (view == null || displayMetrics.heightPixels - rect.bottom <= f27839a) {
            return false;
        }
        return true;
    }
}
