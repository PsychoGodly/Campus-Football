package i2;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JobInfoSchedulerService f33243a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ JobParameters f33244b;

    public /* synthetic */ f(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f33243a = jobInfoSchedulerService;
        this.f33244b = jobParameters;
    }

    public final void run() {
        this.f33243a.b(this.f33244b);
    }
}
