package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.p;
import java.util.Collections;
import java.util.List;
import k1.i;
import n1.c;
import n1.d;
import w6.f;

public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* renamed from: g  reason: collision with root package name */
    private static final String f5314g = p.f("ConstraintTrkngWrkr");

    /* renamed from: a  reason: collision with root package name */
    private WorkerParameters f5315a;

    /* renamed from: b  reason: collision with root package name */
    final Object f5316b = new Object();

    /* renamed from: c  reason: collision with root package name */
    volatile boolean f5317c = false;

    /* renamed from: d  reason: collision with root package name */
    androidx.work.impl.utils.futures.c<ListenableWorker.a> f5318d = androidx.work.impl.utils.futures.c.t();

    /* renamed from: f  reason: collision with root package name */
    private ListenableWorker f5319f;

    class a implements Runnable {
        a() {
        }

        public void run() {
            ConstraintTrackingWorker.this.e();
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f5321a;

        b(f fVar) {
            this.f5321a = fVar;
        }

        public void run() {
            synchronized (ConstraintTrackingWorker.this.f5316b) {
                if (ConstraintTrackingWorker.this.f5317c) {
                    ConstraintTrackingWorker.this.d();
                } else {
                    ConstraintTrackingWorker.this.f5318d.r(this.f5321a);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f5315a = workerParameters;
    }

    public WorkDatabase a() {
        return i.m(getApplicationContext()).q();
    }

    public void b(List<String> list) {
        p.c().a(f5314g, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.f5316b) {
            this.f5317c = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f5318d.p(ListenableWorker.a.a());
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f5318d.p(ListenableWorker.a.b());
    }

    /* access modifiers changed from: package-private */
    public void e() {
        String l10 = getInputData().l("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(l10)) {
            p.c().b(f5314g, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        ListenableWorker b10 = getWorkerFactory().b(getApplicationContext(), l10, this.f5315a);
        this.f5319f = b10;
        if (b10 == null) {
            p.c().a(f5314g, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        r1.p m10 = a().B().m(getId().toString());
        if (m10 == null) {
            c();
            return;
        }
        d dVar = new d(getApplicationContext(), getTaskExecutor(), this);
        dVar.d(Collections.singletonList(m10));
        if (dVar.c(getId().toString())) {
            p.c().a(f5314g, String.format("Constraints met for delegate %s", new Object[]{l10}), new Throwable[0]);
            try {
                f<ListenableWorker.a> startWork = this.f5319f.startWork();
                startWork.a(new b(startWork), getBackgroundExecutor());
            } catch (Throwable th) {
                p c10 = p.c();
                String str = f5314g;
                c10.a(str, String.format("Delegated worker %s threw exception in startWork.", new Object[]{l10}), th);
                synchronized (this.f5316b) {
                    if (this.f5317c) {
                        p.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        d();
                    } else {
                        c();
                    }
                }
            }
        } else {
            p.c().a(f5314g, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{l10}), new Throwable[0]);
            d();
        }
    }

    public void f(List<String> list) {
    }

    public t1.a getTaskExecutor() {
        return i.m(getApplicationContext()).r();
    }

    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f5319f;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f5319f;
        if (listenableWorker != null && !listenableWorker.isStopped()) {
            this.f5319f.stop();
        }
    }

    public f<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.f5318d;
    }
}
