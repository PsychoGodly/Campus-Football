package com.onesignal;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.a0;
import androidx.work.c;
import androidx.work.g;
import androidx.work.q;
import androidx.work.r;
import com.onesignal.k3;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import sd.w;

/* compiled from: OSFocusHandler.kt */
public final class OSFocusHandler {

    /* renamed from: b  reason: collision with root package name */
    public static final a f27497b = new a((h) null);

    /* renamed from: c  reason: collision with root package name */
    private static boolean f27498c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static boolean f27499d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static boolean f27500e;

    /* renamed from: a  reason: collision with root package name */
    private Runnable f27501a;

    /* compiled from: OSFocusHandler.kt */
    public static final class OnLostFocusWorker extends Worker {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OnLostFocusWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            m.e(context, "context");
            m.e(workerParameters, "workerParams");
        }

        public ListenableWorker.a doWork() {
            OSFocusHandler.f27497b.a();
            ListenableWorker.a c10 = ListenableWorker.a.c();
            m.d(c10, "success()");
            return c10;
        }
    }

    /* compiled from: OSFocusHandler.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final void a() {
            a b10 = b.b();
            if (b10 == null || b10.e() == null) {
                k3.s2(false);
            }
            k3.A1(k3.r0.DEBUG, "OSFocusHandler running onAppLostFocus");
            OSFocusHandler.f27499d = true;
            k3.x1();
            OSFocusHandler.f27500e = true;
        }
    }

    private final c d() {
        c a10 = new c.a().b(q.CONNECTED).a();
        m.d(a10, "Builder()\n            .s…TED)\n            .build()");
        return a10;
    }

    private final void h() {
        i();
        f27499d = false;
    }

    private final void i() {
        f27498c = false;
        Runnable runnable = this.f27501a;
        if (runnable != null) {
            e3.b().a(runnable);
        }
    }

    /* access modifiers changed from: private */
    public static final void n() {
        f27498c = true;
        k3.A1(k3.r0.DEBUG, "OSFocusHandler setting stop state: true");
    }

    public final void e(String str, Context context) {
        m.e(str, "tag");
        m.e(context, "context");
        j3.a(context).a(str);
    }

    public final boolean f() {
        return f27499d;
    }

    public final boolean g() {
        return f27500e;
    }

    public final void j() {
        h();
        k3.A1(k3.r0.DEBUG, "OSFocusHandler running onAppFocus");
        k3.v1();
    }

    public final void k(String str, long j10, Context context) {
        m.e(str, "tag");
        m.e(context, "context");
        a0 b10 = ((r.a) ((r.a) ((r.a) new r.a(OnLostFocusWorker.class).f(d())).g(j10, TimeUnit.MILLISECONDS)).a(str)).b();
        m.d(b10, "Builder(OnLostFocusWorke…tag)\n            .build()");
        j3.a(context).e(str, g.KEEP, (r) b10);
    }

    public final void l() {
        if (f27498c) {
            f27498c = false;
            this.f27501a = null;
            k3.A1(k3.r0.DEBUG, "OSFocusHandler running onAppStartFocusLogic");
            k3.y1();
            return;
        }
        i();
    }

    public final void m() {
        a1 a1Var = a1.f27551a;
        e3.b().c(1500, a1Var);
        w wVar = w.f38141a;
        this.f27501a = a1Var;
    }
}
