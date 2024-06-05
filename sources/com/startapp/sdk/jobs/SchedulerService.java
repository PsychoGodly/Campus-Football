package com.startapp.sdk.jobs;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.jobs.b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: Sta */
public class SchedulerService extends JobService {

    /* renamed from: a  reason: collision with root package name */
    public ExecutorService f17244a;

    /* renamed from: b  reason: collision with root package name */
    public final a f17245b = new a();

    /* compiled from: Sta */
    public class a extends a {
        public a() {
        }

        public void a(b bVar) {
            ExecutorService executorService = SchedulerService.this.f17244a;
            if (executorService != null) {
                executorService.execute(bVar);
            }
        }
    }

    /* compiled from: Sta */
    public class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JobParameters f17247a;

        public b(PersistableBundle persistableBundle, JobParameters jobParameters) {
            this.f17247a = jobParameters;
        }

        public void a(b bVar, boolean z10) {
            SchedulerService.this.jobFinished(this.f17247a, z10);
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f17244a = Executors.newSingleThreadExecutor(new ComponentLocator.m0("scheduler"));
    }

    public void onDestroy() {
        super.onDestroy();
        ExecutorService executorService = this.f17244a;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        Bundle bundle;
        if (this.f17244a == null) {
            return false;
        }
        PersistableBundle extras = jobParameters.getExtras();
        if (extras.containsKey("extraKeyDuplicate")) {
            return false;
        }
        PersistableBundle persistableBundle = extras.getPersistableBundle("extraKeyBundle");
        if (persistableBundle != null) {
            bundle = new Bundle();
            bundle.putAll(persistableBundle);
        } else {
            bundle = null;
        }
        return this.f17245b.a(this, extras.getStringArray("extraKeyTags"), new b(extras, jobParameters), bundle);
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
