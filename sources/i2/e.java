package i2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import b2.o;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import j2.d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import m2.a;

/* compiled from: JobInfoScheduler */
public class e implements y {

    /* renamed from: a  reason: collision with root package name */
    private final Context f18884a;

    /* renamed from: b  reason: collision with root package name */
    private final d f18885b;

    /* renamed from: c  reason: collision with root package name */
    private final g f18886c;

    public e(Context context, d dVar, g gVar) {
        this.f18884a = context;
        this.f18885b = dVar;
        this.f18886c = gVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i12 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i10) {
                if (i12 >= i11) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public void a(o oVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f18884a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f18884a.getSystemService("jobscheduler");
        int c10 = c(oVar);
        if (z10 || !d(jobScheduler, c10, i10)) {
            long I0 = this.f18885b.I0(oVar);
            JobInfo.Builder c11 = this.f18886c.c(new JobInfo.Builder(c10, componentName), oVar.d(), I0, i10);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", oVar.b());
            persistableBundle.putInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, a.a(oVar.d()));
            if (oVar.c() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(oVar.c(), 0));
            }
            c11.setExtras(persistableBundle);
            f2.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(c10), Long.valueOf(this.f18886c.g(oVar.d(), I0, i10)), Long.valueOf(I0), Integer.valueOf(i10));
            jobScheduler.schedule(c11.build());
            return;
        }
        f2.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
    }

    public void b(o oVar, int i10) {
        a(oVar, i10, false);
    }

    /* access modifiers changed from: package-private */
    public int c(o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f18884a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(oVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(a.a(oVar.d())).array());
        if (oVar.c() != null) {
            adler32.update(oVar.c());
        }
        return (int) adler32.getValue();
    }
}
