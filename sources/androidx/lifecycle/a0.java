package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.b0;
import androidx.lifecycle.i;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: ProcessLifecycleOwner.kt */
public final class a0 implements p {

    /* renamed from: j  reason: collision with root package name */
    public static final b f3878j = new b((h) null);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final a0 f3879k = new a0();

    /* renamed from: a  reason: collision with root package name */
    private int f3880a;

    /* renamed from: b  reason: collision with root package name */
    private int f3881b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3882c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3883d = true;

    /* renamed from: f  reason: collision with root package name */
    private Handler f3884f;

    /* renamed from: g  reason: collision with root package name */
    private final r f3885g = new r(this);

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f3886h = new z(this);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final b0.a f3887i = new d(this);

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3888a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            m.e(activity, "activity");
            m.e(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }

        public final p a() {
            return a0.f3879k;
        }

        public final void b(Context context) {
            m.e(context, "context");
            a0.f3879k.h(context);
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class c extends e {
        final /* synthetic */ a0 this$0;

        /* compiled from: ProcessLifecycleOwner.kt */
        public static final class a extends e {
            final /* synthetic */ a0 this$0;

            a(a0 a0Var) {
                this.this$0 = a0Var;
            }

            public void onActivityPostResumed(Activity activity) {
                m.e(activity, "activity");
                this.this$0.e();
            }

            public void onActivityPostStarted(Activity activity) {
                m.e(activity, "activity");
                this.this$0.f();
            }
        }

        c(a0 a0Var) {
            this.this$0 = a0Var;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            m.e(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                b0.f3897b.b(activity).f(this.this$0.f3887i);
            }
        }

        public void onActivityPaused(Activity activity) {
            m.e(activity, "activity");
            this.this$0.d();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            m.e(activity, "activity");
            a.a(activity, new a(this.this$0));
        }

        public void onActivityStopped(Activity activity) {
            m.e(activity, "activity");
            this.this$0.g();
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class d implements b0.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a0 f3889a;

        d(a0 a0Var) {
            this.f3889a = a0Var;
        }

        public void onCreate() {
        }

        public void onResume() {
            this.f3889a.e();
        }

        public void onStart() {
            this.f3889a.f();
        }
    }

    private a0() {
    }

    /* access modifiers changed from: private */
    public static final void i(a0 a0Var) {
        m.e(a0Var, "this$0");
        a0Var.j();
        a0Var.k();
    }

    public static final p l() {
        return f3878j.a();
    }

    public final void d() {
        int i10 = this.f3881b - 1;
        this.f3881b = i10;
        if (i10 == 0) {
            Handler handler = this.f3884f;
            m.b(handler);
            handler.postDelayed(this.f3886h, 700);
        }
    }

    public final void e() {
        int i10 = this.f3881b + 1;
        this.f3881b = i10;
        if (i10 != 1) {
            return;
        }
        if (this.f3882c) {
            this.f3885g.i(i.a.ON_RESUME);
            this.f3882c = false;
            return;
        }
        Handler handler = this.f3884f;
        m.b(handler);
        handler.removeCallbacks(this.f3886h);
    }

    public final void f() {
        int i10 = this.f3880a + 1;
        this.f3880a = i10;
        if (i10 == 1 && this.f3883d) {
            this.f3885g.i(i.a.ON_START);
            this.f3883d = false;
        }
    }

    public final void g() {
        this.f3880a--;
        k();
    }

    public i getLifecycle() {
        return this.f3885g;
    }

    public final void h(Context context) {
        m.e(context, "context");
        this.f3884f = new Handler();
        this.f3885g.i(i.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        m.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c(this));
    }

    public final void j() {
        if (this.f3881b == 0) {
            this.f3882c = true;
            this.f3885g.i(i.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.f3880a == 0 && this.f3882c) {
            this.f3885g.i(i.a.ON_STOP);
            this.f3883d = true;
        }
    }
}
