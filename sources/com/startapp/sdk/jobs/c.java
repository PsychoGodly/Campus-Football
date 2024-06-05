package com.startapp.sdk.jobs;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import com.startapp.a0;
import com.startapp.l7;
import com.startapp.sdk.jobs.JobRequest;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Sta */
public class c implements l7 {

    /* renamed from: a  reason: collision with root package name */
    public final JobScheduler f17249a;

    /* renamed from: b  reason: collision with root package name */
    public final ComponentName f17250b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f17251c;

    public c(Context context, Class<? extends JobService> cls) throws IllegalStateException {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            this.f17249a = jobScheduler;
            this.f17250b = new ComponentName(context, cls);
            this.f17251c = a0.a(context, "android.permission.RECEIVE_BOOT_COMPLETED");
            return;
        }
        throw new IllegalStateException();
    }

    public final JobInfo.Builder a(JobRequest jobRequest, Integer num) {
        int i10;
        int i11;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = JobRequest.a(jobRequest.f17234a);
        }
        JobInfo.Builder builder = new JobInfo.Builder(i10, this.f17250b);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("extraKeyUuid", jobRequest.f17235b.toString());
        persistableBundle.putStringArray("extraKeyTags", jobRequest.f17234a);
        if (num != null) {
            persistableBundle.putInt("extraKeyDuplicate", 1);
        }
        builder.setExtras(persistableBundle);
        JobRequest.Network network = jobRequest.f17236c;
        if (network != null) {
            if (network == JobRequest.Network.UNMETERED) {
                i11 = 2;
            } else {
                i11 = network == JobRequest.Network.ANY ? 1 : 0;
            }
            builder.setRequiredNetworkType(i11);
        }
        if (this.f17251c) {
            builder.setPersisted(true);
        }
        return builder;
    }

    public final boolean a(JobInfo jobInfo) {
        try {
            return this.f17249a.schedule(jobInfo) == 1;
        } catch (IllegalStateException unused) {
        }
    }

    public final List<JobInfo> a() {
        List<JobInfo> list;
        try {
            list = this.f17249a.getAllPendingJobs();
        } catch (Throwable unused) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (JobInfo next : list) {
            if (this.f17250b.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public boolean a(JobRequest jobRequest, long j10) {
        JobInfo.Builder a10 = a(jobRequest, (Integer) null);
        if (Build.VERSION.SDK_INT >= 24) {
            return a(a10.setPeriodic(j10, JobInfo.getMinFlexMillis()).build());
        }
        List<JobInfo> a11 = a();
        if (a11 == null) {
            return false;
        }
        for (JobInfo next : a11) {
            if (next.getId() == JobRequest.a(jobRequest.f17234a) && next.getIntervalMillis() == j10) {
                return false;
            }
        }
        return a(a10.setPeriodic(j10).build());
    }

    public boolean a(JobRequest jobRequest, Long l10, Long l11) {
        ArrayList arrayList = null;
        JobInfo.Builder a10 = a(jobRequest, (Integer) null);
        long j10 = 0;
        if (l10 != null || Build.VERSION.SDK_INT <= 28) {
            a10.setMinimumLatency(l10 != null ? l10.longValue() : 0);
        }
        JobInfo build = a10.build();
        boolean a11 = a(build);
        if (Build.VERSION.SDK_INT == 23) {
            String uuid = jobRequest.f17235b.toString();
            List<JobInfo> a12 = a();
            if (a12 != null) {
                arrayList = new ArrayList(2);
                for (JobInfo next : a12) {
                    PersistableBundle extras = next.getExtras();
                    try {
                        if (extras.containsKey("extraKeyUuid") && uuid.equals(extras.getString("extraKeyUuid"))) {
                            arrayList.add(Integer.valueOf(next.getId()));
                        }
                    } catch (NullPointerException unused) {
                    }
                }
            }
            if (arrayList != null) {
                int id2 = build.getId();
                int indexOf = arrayList.indexOf(Integer.valueOf(id2));
                if (indexOf >= 0) {
                    arrayList.remove(indexOf);
                }
                JobInfo.Builder a13 = a(jobRequest, Integer.valueOf(!arrayList.isEmpty() ? ((Integer) arrayList.get(0)).intValue() : id2 < Integer.MAX_VALUE ? id2 + 1 : id2 - 1));
                if (l10 != null || Build.VERSION.SDK_INT <= 28) {
                    if (l10 != null) {
                        j10 = l10.longValue();
                    }
                    a13.setMinimumLatency(j10);
                }
                a(a13.build());
            }
        }
        return a11;
    }

    public boolean a(int i10) {
        List<JobInfo> a10 = a();
        if (a10 == null) {
            return false;
        }
        try {
            for (JobInfo id2 : a10) {
                if (id2.getId() == i10) {
                    this.f17249a.cancel(i10);
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
