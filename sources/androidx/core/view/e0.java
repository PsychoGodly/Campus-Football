package androidx.core.view;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: ViewParentCompat */
public final class e0 {

    /* compiled from: ViewParentCompat */
    static class a {
        static boolean a(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
            return viewParent.onNestedFling(view, f10, f11, z10);
        }

        static boolean b(ViewParent viewParent, View view, float f10, float f11) {
            return viewParent.onNestedPreFling(view, f10, f11);
        }

        static void c(ViewParent viewParent, View view, int i10, int i11, int[] iArr) {
            viewParent.onNestedPreScroll(view, i10, i11, iArr);
        }

        static void d(ViewParent viewParent, View view, int i10, int i11, int i12, int i13) {
            viewParent.onNestedScroll(view, i10, i11, i12, i13);
        }

        static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.onNestedScrollAccepted(view, view2, i10);
        }

        static boolean f(ViewParent viewParent, View view, View view2, int i10) {
            return viewParent.onStartNestedScroll(view, view2, i10);
        }

        static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return a.a(viewParent, view, f10, f11, z10);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e10);
                return false;
            }
        } else if (viewParent instanceof s) {
            return ((s) viewParent).onNestedFling(view, f10, f11, z10);
        } else {
            return false;
        }
    }

    public static boolean b(ViewParent viewParent, View view, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return a.b(viewParent, view, f10, f11);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e10);
                return false;
            }
        } else if (viewParent instanceof s) {
            return ((s) viewParent).onNestedPreFling(view, f10, f11);
        } else {
            return false;
        }
    }

    public static void c(ViewParent viewParent, View view, int i10, int i11, int[] iArr, int i12) {
        if (viewParent instanceof q) {
            ((q) viewParent).onNestedPreScroll(view, i10, i11, iArr, i12);
        } else if (i12 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    a.c(viewParent, view, i10, i11, iArr);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e10);
                }
            } else if (viewParent instanceof s) {
                ((s) viewParent).onNestedPreScroll(view, i10, i11, iArr);
            }
        }
    }

    public static void d(ViewParent viewParent, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof r) {
            ((r) viewParent2).onNestedScroll(view, i10, i11, i12, i13, i14, iArr);
            return;
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        if (viewParent2 instanceof q) {
            ((q) viewParent2).onNestedScroll(view, i10, i11, i12, i13, i14);
        } else if (i14 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    a.d(viewParent, view, i10, i11, i12, i13);
                } catch (AbstractMethodError e10) {
                    AbstractMethodError abstractMethodError = e10;
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", abstractMethodError);
                }
            } else if (viewParent2 instanceof s) {
                ((s) viewParent2).onNestedScroll(view, i10, i11, i12, i13);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (viewParent instanceof q) {
            ((q) viewParent).onNestedScrollAccepted(view, view2, i10, i11);
        } else if (i11 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    a.e(viewParent, view, view2, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e10);
                }
            } else if (viewParent instanceof s) {
                ((s) viewParent).onNestedScrollAccepted(view, view2, i10);
            }
        }
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (viewParent instanceof q) {
            return ((q) viewParent).onStartNestedScroll(view, view2, i10, i11);
        }
        if (i11 != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return a.f(viewParent, view, view2, i10);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e10);
                return false;
            }
        } else if (viewParent instanceof s) {
            return ((s) viewParent).onStartNestedScroll(view, view2, i10);
        } else {
            return false;
        }
    }

    public static void g(ViewParent viewParent, View view, int i10) {
        if (viewParent instanceof q) {
            ((q) viewParent).onStopNestedScroll(view, i10);
        } else if (i10 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    a.g(viewParent, view);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e10);
                }
            } else if (viewParent instanceof s) {
                ((s) viewParent).onStopNestedScroll(view);
            }
        }
    }

    @Deprecated
    public static boolean h(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
