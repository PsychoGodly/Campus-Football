package androidx.window.java.layout;

import android.app.Activity;
import androidx.core.util.a;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.m;
import pe.c2;
import pe.q0;
import pe.r0;
import pe.u1;
import sd.w;
import se.e;
import xd.d;
import xd.g;

/* compiled from: WindowInfoTrackerCallbackAdapter.kt */
public final class WindowInfoTrackerCallbackAdapter implements WindowInfoTracker {
    private final Map<a<?>, c2> consumerToJobMap = new LinkedHashMap();
    private final ReentrantLock lock = new ReentrantLock();
    private final WindowInfoTracker tracker;

    public WindowInfoTrackerCallbackAdapter(WindowInfoTracker windowInfoTracker) {
        m.e(windowInfoTracker, "tracker");
        this.tracker = windowInfoTracker;
    }

    private final <T> void addListener(Executor executor, a<T> aVar, e<? extends T> eVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(aVar) == null) {
                this.consumerToJobMap.put(aVar, k.d(q0.a(u1.b(executor)), (g) null, (r0) null, new WindowInfoTrackerCallbackAdapter$addListener$1$1(eVar, aVar, (d<? super WindowInfoTrackerCallbackAdapter$addListener$1$1>) null), 3, (Object) null));
            }
            w wVar = w.f38141a;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void removeListener(a<?> aVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            c2 c2Var = this.consumerToJobMap.get(aVar);
            if (c2Var != null) {
                c2.a.a(c2Var, (CancellationException) null, 1, (Object) null);
            }
            c2 remove = this.consumerToJobMap.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addWindowLayoutInfoListener(Activity activity, Executor executor, a<WindowLayoutInfo> aVar) {
        m.e(activity, "activity");
        m.e(executor, "executor");
        m.e(aVar, "consumer");
        addListener(executor, aVar, this.tracker.windowLayoutInfo(activity));
    }

    public final void removeWindowLayoutInfoListener(a<WindowLayoutInfo> aVar) {
        m.e(aVar, "consumer");
        removeListener(aVar);
    }

    public e<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        m.e(activity, "activity");
        return this.tracker.windowLayoutInfo(activity);
    }
}
