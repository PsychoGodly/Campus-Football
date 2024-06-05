package androidx.window.layout;

import android.app.Activity;
import androidx.core.util.a;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.jvm.internal.m;
import sd.w;

/* compiled from: ExtensionWindowLayoutInfoBackend.kt */
public final class ExtensionWindowLayoutInfoBackend implements WindowBackend {
    private final Map<Activity, MulticastConsumer> activityToListeners = new LinkedHashMap();
    private final WindowLayoutComponent component;
    private final ReentrantLock extensionWindowBackendLock = new ReentrantLock();
    private final Map<a<WindowLayoutInfo>, Activity> listenerToActivity = new LinkedHashMap();

    /* compiled from: ExtensionWindowLayoutInfoBackend.kt */
    private static final class MulticastConsumer implements Consumer<WindowLayoutInfo> {
        private final Activity activity;
        private WindowLayoutInfo lastKnownValue;
        private final ReentrantLock multicastConsumerLock = new ReentrantLock();
        private final Set<a<WindowLayoutInfo>> registeredListeners = new LinkedHashSet();

        public MulticastConsumer(Activity activity2) {
            m.e(activity2, "activity");
            this.activity = activity2;
        }

        public final void addListener(a<WindowLayoutInfo> aVar) {
            m.e(aVar, "listener");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                WindowLayoutInfo windowLayoutInfo = this.lastKnownValue;
                if (windowLayoutInfo != null) {
                    aVar.accept(windowLayoutInfo);
                }
                this.registeredListeners.add(aVar);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean isEmpty() {
            return this.registeredListeners.isEmpty();
        }

        public final void removeListener(a<WindowLayoutInfo> aVar) {
            m.e(aVar, "listener");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.registeredListeners.remove(aVar);
            } finally {
                reentrantLock.unlock();
            }
        }

        public void accept(WindowLayoutInfo windowLayoutInfo) {
            m.e(windowLayoutInfo, "value");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.lastKnownValue = ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(this.activity, windowLayoutInfo);
                for (a accept : this.registeredListeners) {
                    accept.accept(this.lastKnownValue);
                }
                w wVar = w.f38141a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public ExtensionWindowLayoutInfoBackend(WindowLayoutComponent windowLayoutComponent) {
        m.e(windowLayoutComponent, "component");
        this.component = windowLayoutComponent;
    }

    public void registerLayoutChangeCallback(Activity activity, Executor executor, a<WindowLayoutInfo> aVar) {
        w wVar;
        m.e(activity, "activity");
        m.e(executor, "executor");
        m.e(aVar, "callback");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = this.activityToListeners.get(activity);
            if (multicastConsumer == null) {
                wVar = null;
            } else {
                multicastConsumer.addListener(aVar);
                this.listenerToActivity.put(aVar, activity);
                wVar = w.f38141a;
            }
            if (wVar == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(activity);
                this.activityToListeners.put(activity, multicastConsumer2);
                this.listenerToActivity.put(aVar, activity);
                multicastConsumer2.addListener(aVar);
                this.component.addWindowLayoutInfoListener(activity, multicastConsumer2);
            }
            w wVar2 = w.f38141a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void unregisterLayoutChangeCallback(a<WindowLayoutInfo> aVar) {
        m.e(aVar, "callback");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            Activity activity = this.listenerToActivity.get(aVar);
            if (activity != null) {
                MulticastConsumer multicastConsumer = this.activityToListeners.get(activity);
                if (multicastConsumer == null) {
                    reentrantLock.unlock();
                    return;
                }
                multicastConsumer.removeListener(aVar);
                if (multicastConsumer.isEmpty()) {
                    this.component.removeWindowLayoutInfoListener(multicastConsumer);
                }
                w wVar = w.f38141a;
                reentrantLock.unlock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
