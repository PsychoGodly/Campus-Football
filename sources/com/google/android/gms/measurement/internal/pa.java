package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzce;
import m5.e;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class pa extends ua {

    /* renamed from: d  reason: collision with root package name */
    private final AlarmManager f24945d = ((AlarmManager) zza().getSystemService("alarm"));

    /* renamed from: e  reason: collision with root package name */
    private u f24946e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f24947f;

    protected pa(va vaVar) {
        super(vaVar);
    }

    private final int v() {
        if (this.f24947f == null) {
            String packageName = zza().getPackageName();
            this.f24947f = Integer.valueOf(("measurement" + packageName).hashCode());
        }
        return this.f24947f.intValue();
    }

    private final PendingIntent w() {
        Context zza = zza();
        return zzcc.zza(zza, 0, new Intent().setClassName(zza, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzcc.zza);
    }

    private final u x() {
        if (this.f24946e == null) {
            this.f24946e = new sa(this, this.f25029b.d0());
        }
        return this.f24946e;
    }

    private final void y() {
        JobScheduler jobScheduler = (JobScheduler) zza().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(v());
        }
    }

    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ db j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ pb k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ m l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ i5 m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ y9 n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ ta o() {
        return super.o();
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        AlarmManager alarmManager = this.f24945d;
        if (alarmManager != null) {
            alarmManager.cancel(w());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        y();
        return false;
    }

    public final void t(long j10) {
        p();
        Context zza = zza();
        if (!ib.X(zza)) {
            zzj().A().a("Receiver not registered/enabled");
        }
        if (!ib.Y(zza, false)) {
            zzj().A().a("Service not registered/enabled");
        }
        u();
        zzj().F().b("Scheduling upload, millis", Long.valueOf(j10));
        long b10 = zzb().b() + j10;
        if (j10 < Math.max(0, e0.f24542z.a(null).longValue()) && !x().e()) {
            x().b(j10);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Context zza2 = zza();
            ComponentName componentName = new ComponentName(zza2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int v10 = v();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            zzce.zza(zza2, new JobInfo.Builder(v10, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.f24945d;
        if (alarmManager != null) {
            alarmManager.setInexactRepeating(2, b10, Math.max(e0.f24532u.a(null).longValue(), j10), w());
        }
    }

    public final void u() {
        p();
        zzj().F().a("Unscheduling upload");
        AlarmManager alarmManager = this.f24945d;
        if (alarmManager != null) {
            alarmManager.cancel(w());
        }
        x().a();
        if (Build.VERSION.SDK_INT >= 24) {
            y();
        }
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ e zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ n4 zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ q5 zzl() {
        return super.zzl();
    }
}
