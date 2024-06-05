package com.unity3d.services.core.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.a0;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import com.unity3d.scar.adapter.common.l;
import com.unity3d.services.core.configuration.ConfigurationReader;
import java.util.HashSet;
import java.util.Set;

public class LifecycleCache implements Application.ActivityLifecycleCallbacks, m {
    private boolean _appActive = true;
    private final Set<IAppActiveListener> _appActiveListeners = new HashSet();
    private final Set<IAppEventListener> _appStateListeners = new HashSet();
    private LifecycleEvent _currentState = LifecycleEvent.RESUMED;
    private boolean _lifecycleAppActive = true;
    private boolean _newLifecycle = false;
    private int _numStarted = 0;

    /* renamed from: com.unity3d.services.core.lifecycle.LifecycleCache$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$Event;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.lifecycle.i$a[] r0 = androidx.lifecycle.i.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$lifecycle$Lifecycle$Event = r0
                androidx.lifecycle.i$a r1 = androidx.lifecycle.i.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.i.a.ON_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.lifecycle.LifecycleCache.AnonymousClass2.<clinit>():void");
        }
    }

    LifecycleCache(ConfigurationReader configurationReader) {
        this._newLifecycle = configurationReader.getCurrentConfiguration().getExperiments().isJetpackLifecycle();
        startProcessLifecycleObserving();
    }

    /* access modifiers changed from: private */
    public void registerLifecycleObserver() {
        a0.l().getLifecycle().a(this);
    }

    private void startProcessLifecycleObserving() {
        l.a(new Runnable() {
            public void run() {
                LifecycleCache.this.registerLifecycleObserver();
            }
        });
    }

    public synchronized void addActiveListener(IAppActiveListener iAppActiveListener) {
        this._appActiveListeners.add(iAppActiveListener);
    }

    public synchronized void addStateListener(IAppEventListener iAppEventListener) {
        this._appStateListeners.add(iAppEventListener);
    }

    public LifecycleEvent getCurrentState() {
        return this._currentState;
    }

    public boolean isAppActive() {
        return this._newLifecycle ? this._lifecycleAppActive : this._appActive;
    }

    public synchronized void notifyActiveListeners() {
        for (IAppActiveListener onAppStateChanged : this._appActiveListeners) {
            onAppStateChanged.onAppStateChanged(this._appActive);
        }
    }

    public synchronized void notifyStateListeners(LifecycleEvent lifecycleEvent) {
        for (IAppEventListener onLifecycleEvent : this._appStateListeners) {
            onLifecycleEvent.onLifecycleEvent(lifecycleEvent);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this._currentState = LifecycleEvent.CREATED;
    }

    public void onActivityDestroyed(Activity activity) {
        this._currentState = LifecycleEvent.DESTROYED;
    }

    public void onActivityPaused(Activity activity) {
        LifecycleEvent lifecycleEvent = LifecycleEvent.PAUSED;
        this._currentState = lifecycleEvent;
        notifyStateListeners(lifecycleEvent);
    }

    public void onActivityResumed(Activity activity) {
        LifecycleEvent lifecycleEvent = LifecycleEvent.RESUMED;
        this._currentState = lifecycleEvent;
        notifyStateListeners(lifecycleEvent);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this._currentState = LifecycleEvent.SAVE_INSTANCE_STATE;
    }

    public void onActivityStarted(Activity activity) {
        this._currentState = LifecycleEvent.STARTED;
        if (this._numStarted == 0) {
            this._appActive = true;
            if (!this._newLifecycle) {
                notifyActiveListeners();
            }
        }
        this._numStarted++;
    }

    public void onActivityStopped(Activity activity) {
        this._currentState = LifecycleEvent.STOPPED;
        int i10 = this._numStarted - 1;
        this._numStarted = i10;
        if (i10 <= 0) {
            this._numStarted = 0;
            this._appActive = false;
            if (!this._newLifecycle) {
                notifyActiveListeners();
            }
        }
    }

    public void onStateChanged(p pVar, i.a aVar) {
        int i10 = AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$Event[aVar.ordinal()];
        if (i10 == 1) {
            this._lifecycleAppActive = false;
            if (this._newLifecycle) {
                notifyActiveListeners();
            }
        } else if (i10 == 2) {
            this._lifecycleAppActive = true;
            if (this._newLifecycle) {
                notifyActiveListeners();
            }
        }
    }

    public synchronized void removeActiveListener(IAppActiveListener iAppActiveListener) {
        this._appActiveListeners.remove(iAppActiveListener);
    }

    public synchronized void removeStateListener(IAppEventListener iAppEventListener) {
        this._appStateListeners.remove(iAppEventListener);
    }
}
