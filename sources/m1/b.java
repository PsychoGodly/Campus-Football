package m1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.p;
import androidx.work.t;
import androidx.work.y;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k1.e;
import k1.i;
import r1.g;
import r1.q;
import s1.c;

/* compiled from: SystemJobScheduler */
public class b implements e {

    /* renamed from: f  reason: collision with root package name */
    private static final String f20033f = p.f("SystemJobScheduler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f20034a;

    /* renamed from: b  reason: collision with root package name */
    private final JobScheduler f20035b;

    /* renamed from: c  reason: collision with root package name */
    private final i f20036c;

    /* renamed from: d  reason: collision with root package name */
    private final a f20037d;

    public b(Context context, i iVar) {
        this(context, iVar, (JobScheduler) context.getSystemService("jobscheduler"), new a(context));
    }

    public static void b(Context context) {
        List<JobInfo> g10;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (g10 = g(context, jobScheduler)) != null && !g10.isEmpty()) {
            for (JobInfo id2 : g10) {
                d(jobScheduler, id2.getId());
            }
        }
    }

    private static void d(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            p.c().b(f20033f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i10)}), th);
        }
    }

    private static List<Integer> f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g10 = g(context, jobScheduler);
        if (g10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo next : g10) {
            if (str.equals(h(next))) {
                arrayList.add(Integer.valueOf(next.getId()));
            }
        }
        return arrayList;
    }

    private static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            p.c().b(f20033f, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private static String h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, i iVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g10 = g(context, jobScheduler);
        List<String> a10 = iVar.q().y().a();
        boolean z10 = false;
        HashSet hashSet = new HashSet(g10 != null ? g10.size() : 0);
        if (g10 != null && !g10.isEmpty()) {
            for (JobInfo next : g10) {
                String h10 = h(next);
                if (!TextUtils.isEmpty(h10)) {
                    hashSet.add(h10);
                } else {
                    d(jobScheduler, next.getId());
                }
            }
        }
        Iterator<String> it = a10.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    p.c().a(f20033f, "Reconciling jobs", new Throwable[0]);
                    z10 = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z10) {
            WorkDatabase q10 = iVar.q();
            q10.c();
            try {
                q B = q10.B();
                for (String c10 : a10) {
                    B.c(c10, -1);
                }
                q10.r();
            } finally {
                q10.g();
            }
        }
        return z10;
    }

    /* JADX INFO: finally extract failed */
    public void a(r1.p... pVarArr) {
        int i10;
        List<Integer> f10;
        int i11;
        WorkDatabase q10 = this.f20036c.q();
        c cVar = new c(q10);
        int length = pVarArr.length;
        int i12 = 0;
        while (i12 < length) {
            r1.p pVar = pVarArr[i12];
            q10.c();
            try {
                r1.p m10 = q10.B().m(pVar.f21926a);
                if (m10 == null) {
                    p c10 = p.c();
                    String str = f20033f;
                    c10.h(str, "Skipping scheduling " + pVar.f21926a + " because it's no longer in the DB", new Throwable[0]);
                    q10.r();
                } else if (m10.f21927b != y.a.ENQUEUED) {
                    p c11 = p.c();
                    String str2 = f20033f;
                    c11.h(str2, "Skipping scheduling " + pVar.f21926a + " because it is no longer enqueued", new Throwable[0]);
                    q10.r();
                } else {
                    g c12 = q10.y().c(pVar.f21926a);
                    if (c12 != null) {
                        i10 = c12.f21904b;
                    } else {
                        i10 = cVar.d(this.f20036c.k().i(), this.f20036c.k().g());
                    }
                    if (c12 == null) {
                        this.f20036c.q().y().b(new g(pVar.f21926a, i10));
                    }
                    j(pVar, i10);
                    if (Build.VERSION.SDK_INT == 23 && (f10 = f(this.f20034a, this.f20035b, pVar.f21926a)) != null) {
                        int indexOf = f10.indexOf(Integer.valueOf(i10));
                        if (indexOf >= 0) {
                            f10.remove(indexOf);
                        }
                        if (!f10.isEmpty()) {
                            i11 = f10.get(0).intValue();
                        } else {
                            i11 = cVar.d(this.f20036c.k().i(), this.f20036c.k().g());
                        }
                        j(pVar, i11);
                    }
                    q10.r();
                }
                q10.g();
                i12++;
            } catch (Throwable th) {
                q10.g();
                throw th;
            }
        }
    }

    public boolean c() {
        return true;
    }

    public void e(String str) {
        List<Integer> f10 = f(this.f20034a, this.f20035b, str);
        if (f10 != null && !f10.isEmpty()) {
            for (Integer intValue : f10) {
                d(this.f20035b, intValue.intValue());
            }
            this.f20036c.q().y().d(str);
        }
    }

    public void j(r1.p pVar, int i10) {
        JobInfo a10 = this.f20037d.a(pVar, i10);
        p c10 = p.c();
        String str = f20033f;
        c10.a(str, String.format("Scheduling work ID %s Job ID %s", new Object[]{pVar.f21926a, Integer.valueOf(i10)}), new Throwable[0]);
        try {
            if (this.f20035b.schedule(a10) == 0) {
                p.c().h(str, String.format("Unable to schedule work ID %s", new Object[]{pVar.f21926a}), new Throwable[0]);
                if (pVar.f21942q && pVar.f21943r == t.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f21942q = false;
                    p.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{pVar.f21926a}), new Throwable[0]);
                    j(pVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            List<JobInfo> g10 = g(this.f20034a, this.f20035b);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(g10 != null ? g10.size() : 0), Integer.valueOf(this.f20036c.q().B().g().size()), Integer.valueOf(this.f20036c.k().h())});
            p.c().b(f20033f, format, new Throwable[0]);
            throw new IllegalStateException(format, e10);
        } catch (Throwable th) {
            p.c().b(f20033f, String.format("Unable to schedule %s", new Object[]{pVar}), th);
        }
    }

    public b(Context context, i iVar, JobScheduler jobScheduler, a aVar) {
        this.f20034a = context;
        this.f20036c = iVar;
        this.f20035b = jobScheduler;
        this.f20037d = aVar;
    }
}
