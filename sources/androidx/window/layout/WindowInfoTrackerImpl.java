package androidx.window.layout;

import android.app.Activity;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import se.e;
import se.g;
import xd.d;

/* compiled from: WindowInfoTrackerImpl.kt */
public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    private static final int BUFFER_CAPACITY = 10;
    public static final Companion Companion = new Companion((h) null);
    /* access modifiers changed from: private */
    public final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    /* compiled from: WindowInfoTrackerImpl.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator2, WindowBackend windowBackend2) {
        m.e(windowMetricsCalculator2, "windowMetricsCalculator");
        m.e(windowBackend2, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator2;
        this.windowBackend = windowBackend2;
    }

    public e<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        m.e(activity, "activity");
        return g.r(new WindowInfoTrackerImpl$windowLayoutInfo$1(this, activity, (d<? super WindowInfoTrackerImpl$windowLayoutInfo$1>) null));
    }
}
