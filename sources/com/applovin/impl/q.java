package com.applovin.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final List f10765a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b  reason: collision with root package name */
    private WeakReference f10766b = new WeakReference((Object) null);

    /* renamed from: c  reason: collision with root package name */
    private WeakReference f10767c = new WeakReference((Object) null);

    public q(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f10766b = new WeakReference(activity);
            if (activity.hasWindowFocus()) {
                this.f10767c = this.f10766b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public Activity a() {
        return (Activity) this.f10767c.get();
    }

    public Activity b() {
        return (Activity) this.f10766b.get();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        for (p onActivityCreated : new ArrayList(this.f10765a)) {
            onActivityCreated.onActivityCreated(activity, bundle);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        for (p onActivityDestroyed : new ArrayList(this.f10765a)) {
            onActivityDestroyed.onActivityDestroyed(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        this.f10767c = new WeakReference((Object) null);
        for (p onActivityPaused : new ArrayList(this.f10765a)) {
            onActivityPaused.onActivityPaused(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        WeakReference weakReference = new WeakReference(activity);
        this.f10766b = weakReference;
        this.f10767c = weakReference;
        for (p onActivityResumed : new ArrayList(this.f10765a)) {
            onActivityResumed.onActivityResumed(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        for (p onActivitySaveInstanceState : new ArrayList(this.f10765a)) {
            onActivitySaveInstanceState.onActivitySaveInstanceState(activity, bundle);
        }
    }

    public void onActivityStarted(Activity activity) {
        for (p onActivityStarted : new ArrayList(this.f10765a)) {
            onActivityStarted.onActivityStarted(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        for (p onActivityStopped : new ArrayList(this.f10765a)) {
            onActivityStopped.onActivityStopped(activity);
        }
    }

    public void a(p pVar) {
        this.f10765a.add(pVar);
    }

    public void b(p pVar) {
        this.f10765a.remove(pVar);
    }
}
