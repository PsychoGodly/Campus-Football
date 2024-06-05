package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.aa;
import n0.a;
import r5.d0;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class AppMeasurementService extends Service implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private aa<AppMeasurementService> f24324a;

    private final aa<AppMeasurementService> c() {
        if (this.f24324a == null) {
            this.f24324a = new aa<>(this);
        }
        return this.f24324a;
    }

    public final void a(Intent intent) {
        a.b(intent);
    }

    public final void b(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    public final IBinder onBind(Intent intent) {
        return c().b(intent);
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

    public final int onStartCommand(Intent intent, int i10, int i11) {
        return c().a(intent, i10, i11);
    }

    public final boolean onUnbind(Intent intent) {
        return c().k(intent);
    }

    public final boolean zza(int i10) {
        return stopSelfResult(i10);
    }
}
