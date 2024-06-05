package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;

/* compiled from: LifecycleDispatcher.kt */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f3942a = new l();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f3943b = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher.kt */
    public static final class a extends e {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            m.e(activity, "activity");
            b0.f3897b.c(activity);
        }
    }

    private l() {
    }

    public static final void a(Context context) {
        m.e(context, "context");
        if (!f3943b.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            m.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
        }
    }
}
