package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.p;
import k1.e;

/* compiled from: SystemAlarmScheduler */
public class f implements e {

    /* renamed from: b  reason: collision with root package name */
    private static final String f5244b = p.f("SystemAlarmScheduler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f5245a;

    public f(Context context) {
        this.f5245a = context.getApplicationContext();
    }

    private void b(r1.p pVar) {
        p.c().a(f5244b, String.format("Scheduling work with workSpecId %s", new Object[]{pVar.f21926a}), new Throwable[0]);
        this.f5245a.startService(b.f(this.f5245a, pVar.f21926a));
    }

    public void a(r1.p... pVarArr) {
        for (r1.p b10 : pVarArr) {
            b(b10);
        }
    }

    public boolean c() {
        return true;
    }

    public void e(String str) {
        this.f5245a.startService(b.g(this.f5245a, str));
    }
}
