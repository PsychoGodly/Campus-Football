package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.i;
import kotlin.jvm.internal.m;

/* compiled from: ServiceLifecycleDispatcher.kt */
public class j0 {

    /* renamed from: a  reason: collision with root package name */
    private final r f3933a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f3934b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    private a f3935c;

    /* compiled from: ServiceLifecycleDispatcher.kt */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final r f3936a;

        /* renamed from: b  reason: collision with root package name */
        private final i.a f3937b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f3938c;

        public a(r rVar, i.a aVar) {
            m.e(rVar, "registry");
            m.e(aVar, "event");
            this.f3936a = rVar;
            this.f3937b = aVar;
        }

        public void run() {
            if (!this.f3938c) {
                this.f3936a.i(this.f3937b);
                this.f3938c = true;
            }
        }
    }

    public j0(p pVar) {
        m.e(pVar, "provider");
        this.f3933a = new r(pVar);
    }

    private final void f(i.a aVar) {
        a aVar2 = this.f3935c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f3933a, aVar);
        this.f3935c = aVar3;
        Handler handler = this.f3934b;
        m.b(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    public i a() {
        return this.f3933a;
    }

    public void b() {
        f(i.a.ON_START);
    }

    public void c() {
        f(i.a.ON_CREATE);
    }

    public void d() {
        f(i.a.ON_STOP);
        f(i.a.ON_DESTROY);
    }

    public void e() {
        f(i.a.ON_START);
    }
}
