package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.onesignal.k3;
import com.onesignal.x2;

public class SyncJobService extends JobService {
    public boolean onStartJob(JobParameters jobParameters) {
        x2.q().b(this, new x2.b(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        boolean l10 = x2.q().l();
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.a(r0Var, "SyncJobService onStopJob called, system conditions not available reschedule: " + l10);
        return l10;
    }
}
