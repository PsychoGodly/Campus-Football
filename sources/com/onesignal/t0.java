package com.onesignal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.onesignal.k3;

/* compiled from: OSBackgroundSync */
abstract class t0 {

    /* renamed from: c  reason: collision with root package name */
    protected static final Object f28199c = new Object();

    /* renamed from: a  reason: collision with root package name */
    protected boolean f28200a = false;

    /* renamed from: b  reason: collision with root package name */
    private Thread f28201b;

    t0() {
    }

    private boolean g(Context context) {
        return h.a(context, "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
    }

    private boolean h(Context context) {
        Thread thread;
        for (JobInfo id2 : ((JobScheduler) context.getSystemService("jobscheduler")).getAllPendingJobs()) {
            if (id2.getId() == e() && (thread = this.f28201b) != null && thread.isAlive()) {
                return true;
            }
        }
        return false;
    }

    private void j(Context context, long j10) {
        k3.r0 r0Var = k3.r0.VERBOSE;
        k3.a(r0Var, getClass().getSimpleName() + " scheduleServiceSyncTask:atTime: " + j10);
        ((AlarmManager) context.getSystemService("alarm")).set(0, k3.N0().b() + j10, m(context));
    }

    private void k(Context context, long j10) {
        k3.r0 r0Var = k3.r0.VERBOSE;
        k3.a(r0Var, "OSBackgroundSync scheduleSyncServiceAsJob:atTime: " + j10);
        if (h(context)) {
            k3.a(r0Var, "OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!");
            this.f28200a = true;
            return;
        }
        JobInfo.Builder builder = new JobInfo.Builder(e(), new ComponentName(context, c()));
        builder.setMinimumLatency(j10).setRequiredNetworkType(1);
        if (g(context)) {
            builder.setPersisted(true);
        }
        try {
            int schedule = ((JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build());
            k3.r0 r0Var2 = k3.r0.INFO;
            k3.a(r0Var2, "OSBackgroundSync scheduleSyncServiceAsJob:result: " + schedule);
        } catch (NullPointerException e10) {
            k3.b(k3.r0.ERROR, "scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e10);
        }
    }

    private PendingIntent m(Context context) {
        return PendingIntent.getService(context, e(), new Intent(context, d()), 201326592);
    }

    private static boolean n() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* access modifiers changed from: protected */
    public void a(Context context) {
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.A1(r0Var, getClass().getSimpleName() + " cancel background sync");
        synchronized (f28199c) {
            if (n()) {
                ((JobScheduler) context.getSystemService("jobscheduler")).cancel(e());
            } else {
                ((AlarmManager) context.getSystemService("alarm")).cancel(m(context));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Context context, Runnable runnable) {
        k3.A1(k3.r0.DEBUG, "OSBackground sync, calling initWithContext");
        k3.e1(context);
        Thread thread = new Thread(runnable, f());
        this.f28201b = thread;
        OSUtils.X(thread);
    }

    /* access modifiers changed from: protected */
    public abstract Class c();

    /* access modifiers changed from: protected */
    public abstract Class d();

    /* access modifiers changed from: protected */
    public abstract int e();

    /* access modifiers changed from: protected */
    public abstract String f();

    /* access modifiers changed from: protected */
    public void i(Context context, long j10) {
        synchronized (f28199c) {
            if (n()) {
                k(context, j10);
            } else {
                j(context, j10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        Thread thread = this.f28201b;
        if (thread == null || !thread.isAlive()) {
            return false;
        }
        this.f28201b.interrupt();
        return true;
    }
}
