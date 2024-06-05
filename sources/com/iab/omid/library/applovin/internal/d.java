package com.iab.omid.library.applovin.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

public class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private boolean f27386a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f27387b;

    /* renamed from: c  reason: collision with root package name */
    private a f27388c;

    public interface a {
        void a(boolean z10);
    }

    public void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* access modifiers changed from: package-private */
    public ActivityManager.RunningAppProcessInfo b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* access modifiers changed from: protected */
    public void b(boolean z10) {
    }

    public boolean c() {
        return this.f27387b;
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        return false;
    }

    public void e() {
        this.f27386a = true;
        boolean a10 = a();
        this.f27387b = a10;
        b(a10);
    }

    public void f() {
        this.f27386a = false;
        this.f27388c = null;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        a(true);
    }

    public void onActivityStopped(Activity activity) {
        a(a());
    }

    public void a(a aVar) {
        this.f27388c = aVar;
    }

    private void a(boolean z10) {
        if (this.f27387b != z10) {
            this.f27387b = z10;
            if (this.f27386a) {
                b(z10);
                a aVar = this.f27388c;
                if (aVar != null) {
                    aVar.a(z10);
                }
            }
        }
    }

    private boolean a() {
        return b().importance == 100 || d();
    }
}
