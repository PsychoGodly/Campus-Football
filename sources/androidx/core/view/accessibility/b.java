package androidx.core.view.accessibility;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: AccessibilityEventCompat */
public final class b {

    /* compiled from: AccessibilityEventCompat */
    static class a {
        static int a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        static void b(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    public static int a(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return a.a(accessibilityEvent);
        }
        return 0;
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i10) {
        if (Build.VERSION.SDK_INT >= 19) {
            a.b(accessibilityEvent, i10);
        }
    }
}
