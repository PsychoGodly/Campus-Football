package z9;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

public class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private boolean f31522a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f31523b;

    /* renamed from: c  reason: collision with root package name */
    private a f31524c;

    public interface a {
        void a(boolean z10);
    }

    private void c(boolean z10) {
        if (this.f31523b != z10) {
            this.f31523b = z10;
            if (this.f31522a) {
                f(z10);
                a aVar = this.f31524c;
                if (aVar != null) {
                    aVar.a(z10);
                }
            }
        }
    }

    private boolean d() {
        return (e().importance == 100) || h();
    }

    public void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public void b(a aVar) {
        this.f31524c = aVar;
    }

    /* access modifiers changed from: package-private */
    public ActivityManager.RunningAppProcessInfo e() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* access modifiers changed from: protected */
    public void f(boolean z10) {
    }

    public boolean g() {
        return this.f31523b;
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return false;
    }

    public void i() {
        this.f31522a = true;
        boolean d10 = d();
        this.f31523b = d10;
        f(d10);
    }

    public void j() {
        this.f31522a = false;
        this.f31524c = null;
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
        c(true);
    }

    public void onActivityStopped(Activity activity) {
        c(d());
    }
}
