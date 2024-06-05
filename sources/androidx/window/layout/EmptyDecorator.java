package androidx.window.layout;

import kotlin.jvm.internal.m;

/* compiled from: WindowInfoTracker.kt */
final class EmptyDecorator implements WindowInfoTrackerDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    public WindowInfoTracker decorate(WindowInfoTracker windowInfoTracker) {
        m.e(windowInfoTracker, "tracker");
        return windowInfoTracker;
    }
}
