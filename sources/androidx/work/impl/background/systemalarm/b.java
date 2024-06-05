package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.p;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CommandHandler */
public class b implements k1.b {

    /* renamed from: d  reason: collision with root package name */
    private static final String f5209d = p.f("CommandHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f5210a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, k1.b> f5211b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Object f5212c = new Object();

    b(Context context) {
        this.f5210a = context;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent c(Context context, String str, boolean z10) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        return intent;
    }

    static Intent e(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    static Intent f(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent g(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void h(Intent intent, int i10, e eVar) {
        p.c().a(f5209d, String.format("Handling constraints changed %s", new Object[]{intent}), new Throwable[0]);
        new c(this.f5210a, i10, eVar).a();
    }

    private void i(Intent intent, int i10, e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f5212c) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            p c10 = p.c();
            String str = f5209d;
            c10.a(str, String.format("Handing delay met for %s", new Object[]{string}), new Throwable[0]);
            if (!this.f5211b.containsKey(string)) {
                d dVar = new d(this.f5210a, i10, string, eVar);
                this.f5211b.put(string, dVar);
                dVar.e();
            } else {
                p.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string}), new Throwable[0]);
            }
        }
    }

    private void j(Intent intent, int i10) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z10 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        p.c().a(f5209d, String.format("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i10)}), new Throwable[0]);
        d(string, z10);
    }

    private void k(Intent intent, int i10, e eVar) {
        p.c().a(f5209d, String.format("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i10)}), new Throwable[0]);
        eVar.g().u();
    }

    private void l(Intent intent, int i10, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        p c10 = p.c();
        String str = f5209d;
        c10.a(str, String.format("Handling schedule work for %s", new Object[]{string}), new Throwable[0]);
        WorkDatabase q10 = eVar.g().q();
        q10.c();
        try {
            r1.p m10 = q10.B().m(string);
            if (m10 == null) {
                p c11 = p.c();
                c11.h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (m10.f21927b.a()) {
                p c12 = p.c();
                c12.h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                q10.g();
            } else {
                long a10 = m10.a();
                if (!m10.b()) {
                    p.c().a(str, String.format("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(a10)}), new Throwable[0]);
                    a.c(this.f5210a, eVar.g(), string, a10);
                } else {
                    p.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(a10)}), new Throwable[0]);
                    a.c(this.f5210a, eVar.g(), string, a10);
                    eVar.k(new e.b(eVar, a(this.f5210a), i10));
                }
                q10.r();
                q10.g();
            }
        } finally {
            q10.g();
        }
    }

    private void m(Intent intent, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        p.c().a(f5209d, String.format("Handing stopWork work for %s", new Object[]{string}), new Throwable[0]);
        eVar.g().z(string);
        a.a(this.f5210a, eVar.g(), string);
        eVar.d(string, false);
    }

    private static boolean n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    public void d(String str, boolean z10) {
        synchronized (this.f5212c) {
            k1.b remove = this.f5211b.remove(str);
            if (remove != null) {
                remove.d(str, z10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        boolean z10;
        synchronized (this.f5212c) {
            z10 = !this.f5211b.isEmpty();
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void p(Intent intent, int i10, e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            h(intent, i10, eVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            k(intent, i10, eVar);
        } else if (!n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            p.c().b(f5209d, String.format("Invalid request for %s, requires %s.", new Object[]{action, "KEY_WORKSPEC_ID"}), new Throwable[0]);
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            l(intent, i10, eVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            i(intent, i10, eVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            m(intent, eVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            j(intent, i10);
        } else {
            p.c().h(f5209d, String.format("Ignoring intent %s", new Object[]{intent}), new Throwable[0]);
        }
    }
}
