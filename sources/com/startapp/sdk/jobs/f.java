package com.startapp.sdk.jobs;

import android.content.Context;
import android.os.Bundle;
import com.startapp.l7;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.jobs.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class f implements l7 {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f17256a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, Future<?>> f17257b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f17258c = Executors.newScheduledThreadPool(1, ComponentLocator.b("scheduler"));

    /* compiled from: Sta */
    public class a extends a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JobRequest f17259a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f17260b;

        public a(JobRequest jobRequest, long j10) {
            this.f17259a = jobRequest;
            this.f17260b = j10;
        }

        public void a(b bVar) {
            f fVar = f.this;
            int a10 = JobRequest.a(this.f17259a.f17234a);
            long j10 = this.f17260b;
            synchronized (fVar) {
                fVar.f17257b.put(Integer.valueOf(a10), fVar.f17258c.scheduleAtFixedRate(bVar, j10, j10, TimeUnit.MILLISECONDS));
            }
        }
    }

    /* compiled from: Sta */
    public class b implements b.a {
        public b(f fVar, JobRequest jobRequest) {
        }

        public void a(b bVar, boolean z10) {
        }
    }

    /* compiled from: Sta */
    public class c extends a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JobRequest f17262a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f17263b;

        public c(JobRequest jobRequest, long j10) {
            this.f17262a = jobRequest;
            this.f17263b = j10;
        }

        public void a(b bVar) {
            f fVar = f.this;
            int a10 = JobRequest.a(this.f17262a.f17234a);
            long j10 = this.f17263b;
            synchronized (fVar) {
                fVar.f17257b.put(Integer.valueOf(a10), fVar.f17258c.schedule(bVar, j10, TimeUnit.MILLISECONDS));
            }
        }
    }

    /* compiled from: Sta */
    public class d implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JobRequest f17265a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f17266b;

        public d(JobRequest jobRequest, long j10) {
            this.f17265a = jobRequest;
            this.f17266b = j10;
        }

        public void a(b bVar, boolean z10) {
            if (z10) {
                f fVar = f.this;
                int a10 = JobRequest.a(this.f17265a.f17234a);
                long j10 = this.f17266b;
                synchronized (fVar) {
                    fVar.f17257b.put(Integer.valueOf(a10), fVar.f17258c.schedule(bVar, j10, TimeUnit.MILLISECONDS));
                }
                return;
            }
            synchronized (this) {
                f.this.f17257b.remove(Integer.valueOf(JobRequest.a(this.f17265a.f17234a)));
            }
        }
    }

    public f(Context context) {
        this.f17256a = new WeakReference<>(context);
    }

    public boolean a(JobRequest jobRequest, long j10) {
        Context context = (Context) this.f17256a.get();
        if (context == null) {
            return false;
        }
        return new a(jobRequest, j10).a(context, jobRequest.f17234a, new b(this, jobRequest), (Bundle) null);
    }

    public boolean a(JobRequest jobRequest, Long l10, Long l11) {
        Context context = (Context) this.f17256a.get();
        if (context == null) {
            return false;
        }
        long longValue = l10 != null ? l10.longValue() : 0;
        return new c(jobRequest, longValue).a(context, jobRequest.f17234a, new d(jobRequest, longValue), (Bundle) null);
    }

    public synchronized boolean a(int i10) {
        Future future = this.f17257b.get(Integer.valueOf(i10));
        if (future == null) {
            return false;
        }
        this.f17257b.remove(Integer.valueOf(i10));
        return future.cancel(true);
    }
}
