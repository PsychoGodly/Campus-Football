package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.os.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.j;
import androidx.work.p;
import androidx.work.y;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k1.f;
import k1.h;
import k1.i;
import m1.b;
import r1.n;
import r1.q;

public class ForceStopRunnable implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    private static final String f5279d = p.f("ForceStopRunnable");

    /* renamed from: f  reason: collision with root package name */
    private static final long f5280f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a  reason: collision with root package name */
    private final Context f5281a;

    /* renamed from: b  reason: collision with root package name */
    private final i f5282b;

    /* renamed from: c  reason: collision with root package name */
    private int f5283c = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private static final String f5284a = p.f("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                p.c().g(f5284a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
                ForceStopRunnable.g(context);
            }
        }
    }

    public ForceStopRunnable(Context context, i iVar) {
        this.f5281a = context.getApplicationContext();
        this.f5282b = iVar;
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d10 = d(context, a.c() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f5280f;
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, currentTimeMillis, d10);
        } else {
            alarmManager.set(0, currentTimeMillis, d10);
        }
    }

    public boolean a() {
        boolean i10 = Build.VERSION.SDK_INT >= 23 ? b.i(this.f5281a, this.f5282b) : false;
        WorkDatabase q10 = this.f5282b.q();
        q B = q10.B();
        n A = q10.A();
        q10.c();
        try {
            List<r1.p> i11 = B.i();
            boolean z10 = i11 != null && !i11.isEmpty();
            if (z10) {
                for (r1.p next : i11) {
                    B.b(y.a.ENQUEUED, next.f21926a);
                    B.c(next.f21926a, -1);
                }
            }
            A.c();
            q10.r();
            if (z10 || i10) {
                return true;
            }
            return false;
        } finally {
            q10.g();
        }
    }

    public void b() {
        boolean a10 = a();
        if (h()) {
            p.c().a(f5279d, "Rescheduling Workers.", new Throwable[0]);
            this.f5282b.u();
            this.f5282b.n().c(false);
        } else if (e()) {
            p.c().a(f5279d, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f5282b.u();
        } else if (a10) {
            p.c().a(f5279d, "Found unfinished work, scheduling it.", new Throwable[0]);
            f.b(this.f5282b.k(), this.f5282b.q(), this.f5282b.p());
        }
    }

    public boolean e() {
        int i10 = 536870912;
        try {
            if (a.c()) {
                i10 = 570425344;
            }
            PendingIntent d10 = d(this.f5281a, i10);
            if (Build.VERSION.SDK_INT >= 30) {
                if (d10 != null) {
                    d10.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f5281a.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                        if (((ApplicationExitInfo) historicalProcessExitReasons.get(i11)).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (d10 == null) {
                g(this.f5281a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e10) {
            p.c().h(f5279d, "Ignoring exception", e10);
            return true;
        }
    }

    public boolean f() {
        androidx.work.b k10 = this.f5282b.k();
        if (TextUtils.isEmpty(k10.c())) {
            p.c().a(f5279d, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean b10 = s1.f.b(this.f5281a, k10);
        p.c().a(f5279d, String.format("Is default app process = %s", new Object[]{Boolean.valueOf(b10)}), new Throwable[0]);
        return b10;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return this.f5282b.n().a();
    }

    public void i(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    public void run() {
        try {
            if (!f()) {
                this.f5282b.t();
                return;
            }
            while (true) {
                h.e(this.f5281a);
                p.c().a(f5279d, "Performing cleanup operations.", new Throwable[0]);
                b();
                break;
            }
            this.f5282b.t();
        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
            int i10 = this.f5283c + 1;
            this.f5283c = i10;
            if (i10 >= 3) {
                p c10 = p.c();
                String str = f5279d;
                c10.b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                j d10 = this.f5282b.k().d();
                if (d10 != null) {
                    p.c().a(str, "Routing exception to the specified exception handler", illegalStateException);
                    d10.a(illegalStateException);
                } else {
                    throw illegalStateException;
                }
            } else {
                p.c().a(f5279d, String.format("Retrying after %s", new Object[]{Long.valueOf(((long) i10) * 300)}), e10);
                i(((long) this.f5283c) * 300);
            }
        } catch (Throwable th) {
            this.f5282b.t();
            throw th;
        }
    }
}
