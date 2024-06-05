package com.startapp.sdk.ads.banner.banner3d;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import com.startapp.f9;
import com.startapp.i3;
import com.startapp.o0;
import com.startapp.sdk.ads.banner.Banner;
import com.startapp.sdk.ads.banner.BannerOptions;

/* compiled from: Sta */
public class Banner3DSize {

    /* compiled from: Sta */
    public enum Size {
        XXSMALL(new o0(280, 50)),
        XSMALL(new o0(300, 50)),
        SMALL(new o0(320, 50)),
        MEDIUM(new o0(468, 60)),
        LARGE(new o0(728, 90)),
        XLARGE(new o0(1024, 90));
        
        private o0 size;

        private Size(o0 o0Var) {
            this.size = o0Var;
        }

        public o0 getSize() {
            return this.size;
        }
    }

    public static boolean a(Context context, ViewParent viewParent, BannerOptions bannerOptions, Banner3D banner3D, o0 o0Var) {
        Point point = new Point();
        point.x = bannerOptions.o();
        point.y = bannerOptions.d();
        if (banner3D.getLayoutParams() != null && banner3D.getLayoutParams().width > 0) {
            point.x = Math.round(((float) (banner3D.getLayoutParams().width + 1)) / context.getResources().getDisplayMetrics().density);
        }
        if (banner3D.getLayoutParams() != null && banner3D.getLayoutParams().height > 0) {
            point.y = Math.round(((float) (banner3D.getLayoutParams().height + 1)) / context.getResources().getDisplayMetrics().density);
        }
        if (banner3D.getLayoutParams() == null || banner3D.getLayoutParams().width <= 0 || banner3D.getLayoutParams().height <= 0) {
            if (context instanceof Activity) {
                View decorView = ((Activity) context).getWindow().getDecorView();
                try {
                    View view = (View) viewParent;
                    if (view instanceof Banner) {
                        view = (View) view.getParent();
                    }
                    boolean z10 = false;
                    boolean z11 = false;
                    while (view != null && (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0)) {
                        if (view.getMeasuredWidth() > 0 && !z10) {
                            c(context, point, view);
                            z10 = true;
                        }
                        if (view.getMeasuredHeight() > 0 && !z11) {
                            b(context, point, view);
                            z11 = true;
                        }
                        view = (View) view.getParent();
                    }
                    if (view == null) {
                        a(context, point, decorView);
                    } else {
                        if (!z10) {
                            c(context, point, view);
                        }
                        if (!z11) {
                            b(context, point, view);
                        }
                    }
                } catch (Throwable th) {
                    a(context, point, decorView);
                    i3.a(th);
                }
            } else {
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        f9.a(context, windowManager, point);
                    }
                } catch (Throwable th2) {
                    i3.a(th2);
                }
            }
        }
        o0 o0Var2 = new o0(point.x, point.y);
        Point point2 = o0Var2.f16191a;
        o0Var.a(point2.x, point2.y);
        boolean z12 = false;
        for (Size size : Size.values()) {
            if (size.getSize().f16191a.x <= o0Var2.f16191a.x && size.getSize().f16191a.y <= o0Var2.f16191a.y) {
                bannerOptions.a(size.getSize().f16191a.x, size.getSize().f16191a.y);
                z12 = true;
            }
        }
        if (!z12) {
            bannerOptions.a(0, 0);
        }
        return z12;
    }

    public static void b(Context context, Point point, View view) {
        point.y = Math.round(((float) ((view.getMeasuredHeight() - view.getPaddingBottom()) - view.getPaddingTop())) / context.getResources().getDisplayMetrics().density);
    }

    public static void c(Context context, Point point, View view) {
        point.x = Math.round(((float) ((view.getMeasuredWidth() - view.getPaddingLeft()) - view.getPaddingRight())) / context.getResources().getDisplayMetrics().density);
    }

    public static void a(Context context, Point point, View view) {
        point.x = Math.round(((float) view.getMeasuredWidth()) / context.getResources().getDisplayMetrics().density);
        point.y = Math.round(((float) view.getMeasuredHeight()) / context.getResources().getDisplayMetrics().density);
    }
}
