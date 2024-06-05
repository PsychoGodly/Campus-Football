package com.onesignal;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import com.onesignal.g0;
import com.onesignal.k3;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* compiled from: OSSyncService */
class x2 extends t0 {

    /* renamed from: e  reason: collision with root package name */
    private static final Object f28394e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private static x2 f28395f;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Long f28396d = 0L;

    /* compiled from: OSSyncService */
    static class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<Service> f28397a;

        a(Service service) {
            this.f28397a = new WeakReference<>(service);
        }

        /* access modifiers changed from: protected */
        public void a() {
            k3.a(k3.r0.DEBUG, "LegacySyncRunnable:Stopped");
            if (this.f28397a.get() != null) {
                ((Service) this.f28397a.get()).stopSelf();
            }
        }
    }

    /* compiled from: OSSyncService */
    static class b extends c {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<JobService> f28398a;

        /* renamed from: b  reason: collision with root package name */
        private JobParameters f28399b;

        b(JobService jobService, JobParameters jobParameters) {
            this.f28398a = new WeakReference<>(jobService);
            this.f28399b = jobParameters;
        }

        /* access modifiers changed from: protected */
        public void a() {
            k3.r0 r0Var = k3.r0.DEBUG;
            k3.a(r0Var, "LollipopSyncRunnable:JobFinished needsJobReschedule: " + x2.q().f28200a);
            boolean z10 = x2.q().f28200a;
            x2.q().f28200a = false;
            if (this.f28398a.get() != null) {
                ((JobService) this.f28398a.get()).jobFinished(this.f28399b, z10);
            }
        }
    }

    /* compiled from: OSSyncService */
    static abstract class c implements Runnable {

        /* compiled from: OSSyncService */
        class a implements g0.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ BlockingQueue f28400a;

            a(BlockingQueue blockingQueue) {
                this.f28400a = blockingQueue;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.onesignal.g0$d} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.onesignal.g0$d} */
            /* JADX WARNING: Failed to insert additional move for type inference */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void a(com.onesignal.g0.d r2) {
                /*
                    r1 = this;
                    if (r2 == 0) goto L_0x0003
                    goto L_0x0008
                L_0x0003:
                    java.lang.Object r2 = new java.lang.Object
                    r2.<init>()
                L_0x0008:
                    java.util.concurrent.BlockingQueue r0 = r1.f28400a
                    r0.offer(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.onesignal.x2.c.a.a(com.onesignal.g0$d):void");
            }

            public g0.f getType() {
                return g0.f.SYNC_SERVICE;
            }
        }

        c() {
        }

        /* access modifiers changed from: protected */
        public abstract void a();

        public final void run() {
            synchronized (t0.f28199c) {
                Long unused = x2.q().f28396d = 0L;
            }
            if (k3.R0() == null) {
                a();
                return;
            }
            k3.f27916h = k3.F0();
            y3.l();
            try {
                ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
                g0.g(k3.f27912f, false, false, new a(arrayBlockingQueue));
                Object take = arrayBlockingQueue.take();
                if (take instanceof g0.d) {
                    y3.D((g0.d) take);
                }
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            y3.B(true);
            k3.m0().d();
            a();
        }
    }

    x2() {
    }

    static x2 q() {
        if (f28395f == null) {
            synchronized (f28394e) {
                if (f28395f == null) {
                    f28395f = new x2();
                }
            }
        }
        return f28395f;
    }

    /* access modifiers changed from: protected */
    public Class c() {
        return SyncJobService.class;
    }

    /* access modifiers changed from: protected */
    public Class d() {
        return SyncService.class;
    }

    /* access modifiers changed from: protected */
    public int e() {
        return 2071862118;
    }

    /* access modifiers changed from: protected */
    public String f() {
        return "OS_SYNCSRV_BG_SYNC";
    }

    /* access modifiers changed from: package-private */
    public void p(Context context) {
        synchronized (t0.f28199c) {
            this.f28396d = 0L;
            if (!g0.m(context)) {
                a(context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void r(Context context, long j10) {
        k3.r0 r0Var = k3.r0.VERBOSE;
        k3.a(r0Var, "OSSyncService scheduleLocationUpdateTask:delayMs: " + j10);
        t(context, j10);
    }

    /* access modifiers changed from: protected */
    public void s(Context context) {
        k3.a(k3.r0.VERBOSE, "OSSyncService scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000");
        t(context, 30000);
    }

    /* access modifiers changed from: protected */
    public void t(Context context, long j10) {
        synchronized (t0.f28199c) {
            if (this.f28396d.longValue() == 0 || k3.N0().b() + j10 <= this.f28396d.longValue()) {
                if (j10 < UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS) {
                    j10 = 5000;
                }
                i(context, j10);
                this.f28396d = Long.valueOf(k3.N0().b() + j10);
                return;
            }
            k3.a(k3.r0.VERBOSE, "OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.f28396d);
        }
    }
}
