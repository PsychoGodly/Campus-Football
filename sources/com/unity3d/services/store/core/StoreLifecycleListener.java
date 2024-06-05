package com.unity3d.services.store.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.store.gpbl.StoreBilling;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.m;

/* compiled from: StoreLifecycleListener.kt */
public final class StoreLifecycleListener implements Application.ActivityLifecycleCallbacks {
    private final ArrayList<String> _purchaseTypes;
    private final StoreBilling _storeBilling;
    private final StoreEventListener _storeEventListener;

    public StoreLifecycleListener(ArrayList<String> arrayList, StoreBilling storeBilling, StoreEventListener storeEventListener) {
        m.e(arrayList, "_purchaseTypes");
        m.e(storeBilling, "_storeBilling");
        m.e(storeEventListener, "_storeEventListener");
        this._purchaseTypes = arrayList;
        this._storeBilling = storeBilling;
        this._storeEventListener = storeEventListener;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        m.e(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        m.e(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        m.e(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        m.e(activity, "activity");
        try {
            Iterator<String> it = this._purchaseTypes.iterator();
            while (it.hasNext()) {
                this._storeBilling.getPurchases(it.next(), this._storeEventListener);
            }
        } catch (ClassNotFoundException e10) {
            DeviceLog.warning("Couldn't fetch purchases onActivityResumed. " + e10.getMessage());
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m.e(activity, "activity");
        m.e(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        m.e(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        m.e(activity, "activity");
    }
}
