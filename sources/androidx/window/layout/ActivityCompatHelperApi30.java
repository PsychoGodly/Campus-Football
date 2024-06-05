package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import kotlin.jvm.internal.m;

/* compiled from: ActivityCompatHelper.kt */
public final class ActivityCompatHelperApi30 {
    public static final ActivityCompatHelperApi30 INSTANCE = new ActivityCompatHelperApi30();

    private ActivityCompatHelperApi30() {
    }

    public final Rect currentWindowBounds(Activity activity) {
        m.e(activity, "activity");
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        m.d(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    public final Rect maximumWindowBounds(Activity activity) {
        m.e(activity, "activity");
        Rect bounds = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
        m.d(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}
