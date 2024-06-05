package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.aa;
import r5.d0;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class AppMeasurementJobService extends JobService implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private aa<AppMeasurementJobService> f24322a;

    private final aa<AppMeasurementJobService> c() {
        if (this.f24322a == null) {
            this.f24322a = new aa<>(this);
        }
        return this.f24322a;
    }

    public final void a(Intent intent) {
    }

    public final void b(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
    }

    public final void onCreate() {
        super.onCreate();
        c().c();
    }

    public final void onDestroy() {
        c().h();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        c().i(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return c().g(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        return c().k(intent);
    }

    public final boolean zza(int i10) {
        throw new UnsupportedOperationException();
    }
}
