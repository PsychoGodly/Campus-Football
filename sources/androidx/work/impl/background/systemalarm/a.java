package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.p;
import k1.i;
import r1.g;
import r1.h;
import s1.c;

/* compiled from: Alarms */
class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5208a = p.f("Alarms");

    public static void a(Context context, i iVar, String str) {
        h y10 = iVar.q().y();
        g c10 = y10.c(str);
        if (c10 != null) {
            b(context, str, c10.f21904b);
            p.c().a(f5208a, String.format("Removing SystemIdInfo for workSpecId (%s)", new Object[]{str}), new Throwable[0]);
            y10.d(str);
        }
    }

    private static void b(Context context, String str, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service != null && alarmManager != null) {
            p.c().a(f5208a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i10)}), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void c(Context context, i iVar, String str, long j10) {
        WorkDatabase q10 = iVar.q();
        h y10 = q10.y();
        g c10 = y10.c(str);
        if (c10 != null) {
            b(context, str, c10.f21904b);
            d(context, str, c10.f21904b, j10);
            return;
        }
        int b10 = new c(q10).b();
        y10.b(new g(str, b10));
        d(context, str, b10, j10);
    }

    private static void d(Context context, String str, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i11 = Build.VERSION.SDK_INT;
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, str), i11 >= 23 ? 201326592 : 134217728);
        if (alarmManager == null) {
            return;
        }
        if (i11 >= 19) {
            alarmManager.setExact(0, j10, service);
        } else {
            alarmManager.set(0, j10, service);
        }
    }
}
