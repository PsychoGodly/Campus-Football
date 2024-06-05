package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.m;

/* compiled from: LifecycleService.kt */
public class t extends Service implements p {

    /* renamed from: a  reason: collision with root package name */
    private final j0 f3970a = new j0(this);

    public i getLifecycle() {
        return this.f3970a.a();
    }

    public IBinder onBind(Intent intent) {
        m.e(intent, "intent");
        this.f3970a.b();
        return null;
    }

    public void onCreate() {
        this.f3970a.c();
        super.onCreate();
    }

    public void onDestroy() {
        this.f3970a.d();
        super.onDestroy();
    }

    public void onStart(Intent intent, int i10) {
        this.f3970a.e();
        super.onStart(intent, i10);
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
