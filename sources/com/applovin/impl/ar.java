package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;

public abstract class ar {

    class a implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f6576a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f6577b;

        a(View view, Runnable runnable) {
            this.f6576a = view;
            this.f6577b = runnable;
        }

        public void onAnimationEnd(Animation animation) {
            Runnable runnable = this.f6577b;
            if (runnable != null) {
                runnable.run();
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            this.f6576a.setVisibility(0);
        }
    }

    class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f6578a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f6579b;

        b(View view, Runnable runnable) {
            this.f6578a = view;
            this.f6579b = runnable;
        }

        public void onAnimationEnd(Animation animation) {
            this.f6578a.setVisibility(4);
            Runnable runnable = this.f6579b;
            if (runnable != null) {
                runnable.run();
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            this.f6578a.setVisibility(0);
        }
    }

    public static void a(View view, long j10) {
        a(view, j10, (Runnable) null);
    }

    public static void b(View view, long j10, Runnable runnable) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(j10);
        alphaAnimation.setAnimationListener(new b(view, runnable));
        view.startAnimation(alphaAnimation);
    }

    public static boolean b(int i10) {
        return i10 == 0;
    }

    public static void c(View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }

    public static void a(View view, long j10, Runnable runnable) {
        view.setVisibility(4);
        view.bringToFront();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(j10);
        alphaAnimation.setAnimationListener(new a(view, runnable));
        view.startAnimation(alphaAnimation);
    }

    public static View b(View view) {
        View rootView;
        if (view == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        View findViewById = rootView.findViewById(16908290);
        return findViewById != null ? findViewById : rootView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if ((r5 & 16) == 16) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0071, code lost:
        if ((r5 & 1) == 1) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] a(int r5, int r6, int r7) {
        /*
            r0 = 2
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L_0x000c
            int[] r5 = new int[r0]
            r5[r1] = r6
            r5[r2] = r7
            return r5
        L_0x000c:
            r3 = r5 & 119(0x77, float:1.67E-43)
            r4 = 119(0x77, float:1.67E-43)
            if (r3 != r4) goto L_0x0019
            int[] r5 = new int[r2]
            r6 = 13
            r5[r1] = r6
            return r5
        L_0x0019:
            r3 = r5 & 112(0x70, float:1.57E-43)
            r4 = 112(0x70, float:1.57E-43)
            if (r3 != r4) goto L_0x0020
            goto L_0x0038
        L_0x0020:
            r3 = r5 & 48
            r4 = 48
            if (r3 != r4) goto L_0x0029
            r6 = 10
            goto L_0x003a
        L_0x0029:
            r3 = r5 & 80
            r4 = 80
            if (r3 != r4) goto L_0x0032
            r6 = 12
            goto L_0x003a
        L_0x0032:
            r3 = r5 & 16
            r4 = 16
            if (r3 != r4) goto L_0x003a
        L_0x0038:
            r6 = 15
        L_0x003a:
            r3 = r5 & 7
            r4 = 7
            if (r3 != r4) goto L_0x0040
            goto L_0x0073
        L_0x0040:
            boolean r3 = com.applovin.impl.x3.d()
            if (r3 == 0) goto L_0x0050
            r3 = 8388611(0x800003, float:1.1754948E-38)
            r4 = r5 & r3
            if (r4 != r3) goto L_0x0050
            r7 = 20
            goto L_0x0075
        L_0x0050:
            r3 = r5 & 3
            r4 = 3
            if (r3 != r4) goto L_0x0058
            r7 = 9
            goto L_0x0075
        L_0x0058:
            boolean r3 = com.applovin.impl.x3.d()
            if (r3 == 0) goto L_0x0068
            r3 = 8388613(0x800005, float:1.175495E-38)
            r4 = r5 & r3
            if (r4 != r3) goto L_0x0068
            r7 = 21
            goto L_0x0075
        L_0x0068:
            r3 = r5 & 5
            r4 = 5
            if (r3 != r4) goto L_0x0070
            r7 = 11
            goto L_0x0075
        L_0x0070:
            r5 = r5 & r2
            if (r5 != r2) goto L_0x0075
        L_0x0073:
            r7 = 14
        L_0x0075:
            int[] r5 = new int[r0]
            r5[r1] = r7
            r5[r2] = r6
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ar.a(int, int, int):int[]");
    }

    public static String a(int i10) {
        if (i10 == 0) {
            return "VISIBLE";
        }
        if (i10 == 4) {
            return "INVISIBLE";
        }
        return i10 == 8 ? "GONE" : String.valueOf(i10);
    }

    public static boolean a(int i10, int i11) {
        return b(i10) != b(i11);
    }

    private static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (a(view, viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(View view, Activity activity) {
        if (!(activity == null || view == null)) {
            Window window = activity.getWindow();
            if (window != null) {
                return a(view, window.getDecorView());
            }
            View findViewById = activity.findViewById(16908290);
            if (findViewById != null) {
                return a(view, findViewById.getRootView());
            }
        }
        return false;
    }

    public static Activity a(View view, k kVar) {
        if (view == null) {
            return null;
        }
        int i10 = 0;
        while (i10 < 1000) {
            try {
                Context context = view.getContext();
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
                i10++;
            } catch (Throwable th) {
                kVar.L();
                if (t.a()) {
                    kVar.L().a("ViewUtils", "Encountered error while retrieving activity from view", th);
                }
            }
        }
        return null;
    }

    public static String a(View view) {
        return view.getClass().getName() + '@' + Integer.toHexString(view.hashCode());
    }
}
