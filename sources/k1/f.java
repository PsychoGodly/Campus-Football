package k1;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.p;
import java.util.List;
import m1.b;
import r1.q;
import s1.d;

/* compiled from: Schedulers */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f19565a = p.f("Schedulers");

    static e a(Context context, i iVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            b bVar = new b(context, iVar);
            d.a(context, SystemJobService.class, true);
            p.c().a(f19565a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return bVar;
        }
        e c10 = c(context);
        if (c10 != null) {
            return c10;
        }
        androidx.work.impl.background.systemalarm.f fVar = new androidx.work.impl.background.systemalarm.f(context);
        d.a(context, SystemAlarmService.class, true);
        p.c().a(f19565a, "Created SystemAlarmScheduler", new Throwable[0]);
        return fVar;
    }

    public static void b(androidx.work.b bVar, WorkDatabase workDatabase, List<e> list) {
        if (list != null && list.size() != 0) {
            q B = workDatabase.B();
            workDatabase.c();
            try {
                List<r1.p> f10 = B.f(bVar.h());
                List<r1.p> t10 = B.t(200);
                if (f10 != null && f10.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (r1.p pVar : f10) {
                        B.c(pVar.f21926a, currentTimeMillis);
                    }
                }
                workDatabase.r();
                if (f10 != null && f10.size() > 0) {
                    r1.p[] pVarArr = (r1.p[]) f10.toArray(new r1.p[f10.size()]);
                    for (e next : list) {
                        if (next.c()) {
                            next.a(pVarArr);
                        }
                    }
                }
                if (t10 != null && t10.size() > 0) {
                    r1.p[] pVarArr2 = (r1.p[]) t10.toArray(new r1.p[t10.size()]);
                    for (e next2 : list) {
                        if (!next2.c()) {
                            next2.a(pVarArr2);
                        }
                    }
                }
            } finally {
                workDatabase.g();
            }
        }
    }

    private static e c(Context context) {
        try {
            e eVar = (e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            p.c().a(f19565a, String.format("Created %s", new Object[]{"androidx.work.impl.background.gcm.GcmScheduler"}), new Throwable[0]);
            return eVar;
        } catch (Throwable th) {
            p.c().a(f19565a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
