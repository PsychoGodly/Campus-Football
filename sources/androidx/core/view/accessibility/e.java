package androidx.core.view.accessibility;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* compiled from: AccessibilityRecordCompat */
public class e {

    /* compiled from: AccessibilityRecordCompat */
    static class a {
        static int a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        static int b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        static void c(AccessibilityRecord accessibilityRecord, int i10) {
            accessibilityRecord.setMaxScrollX(i10);
        }

        static void d(AccessibilityRecord accessibilityRecord, int i10) {
            accessibilityRecord.setMaxScrollY(i10);
        }
    }

    /* compiled from: AccessibilityRecordCompat */
    static class b {
        static void a(AccessibilityRecord accessibilityRecord, View view, int i10) {
            accessibilityRecord.setSource(view, i10);
        }
    }

    public static void a(AccessibilityRecord accessibilityRecord, int i10) {
        if (Build.VERSION.SDK_INT >= 15) {
            a.c(accessibilityRecord, i10);
        }
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i10) {
        if (Build.VERSION.SDK_INT >= 15) {
            a.d(accessibilityRecord, i10);
        }
    }

    public static void c(AccessibilityRecord accessibilityRecord, View view, int i10) {
        if (Build.VERSION.SDK_INT >= 16) {
            b.a(accessibilityRecord, view, i10);
        }
    }
}
