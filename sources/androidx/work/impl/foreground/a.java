package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import androidx.work.p;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import k1.i;
import n1.c;
import n1.d;

/* compiled from: SystemForegroundDispatcher */
public class a implements c, k1.b {

    /* renamed from: l  reason: collision with root package name */
    static final String f5265l = p.f("SystemFgDispatcher");

    /* renamed from: a  reason: collision with root package name */
    private Context f5266a;

    /* renamed from: b  reason: collision with root package name */
    private i f5267b;

    /* renamed from: c  reason: collision with root package name */
    private final t1.a f5268c;

    /* renamed from: d  reason: collision with root package name */
    final Object f5269d = new Object();

    /* renamed from: f  reason: collision with root package name */
    String f5270f;

    /* renamed from: g  reason: collision with root package name */
    final Map<String, h> f5271g;

    /* renamed from: h  reason: collision with root package name */
    final Map<String, r1.p> f5272h;

    /* renamed from: i  reason: collision with root package name */
    final Set<r1.p> f5273i;

    /* renamed from: j  reason: collision with root package name */
    final d f5274j;

    /* renamed from: k  reason: collision with root package name */
    private b f5275k;

    /* renamed from: androidx.work.impl.foreground.a$a  reason: collision with other inner class name */
    /* compiled from: SystemForegroundDispatcher */
    class C0093a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WorkDatabase f5276a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5277b;

        C0093a(WorkDatabase workDatabase, String str) {
            this.f5276a = workDatabase;
            this.f5277b = str;
        }

        public void run() {
            r1.p m10 = this.f5276a.B().m(this.f5277b);
            if (m10 != null && m10.b()) {
                synchronized (a.this.f5269d) {
                    a.this.f5272h.put(this.f5277b, m10);
                    a.this.f5273i.add(m10);
                    a aVar = a.this;
                    aVar.f5274j.d(aVar.f5273i);
                }
            }
        }
    }

    /* compiled from: SystemForegroundDispatcher */
    interface b {
        void b(int i10, int i11, Notification notification);

        void c(int i10, Notification notification);

        void d(int i10);

        void stop();
    }

    a(Context context) {
        this.f5266a = context;
        i m10 = i.m(context);
        this.f5267b = m10;
        t1.a r10 = m10.r();
        this.f5268c = r10;
        this.f5270f = null;
        this.f5271g = new LinkedHashMap();
        this.f5273i = new HashSet();
        this.f5272h = new HashMap();
        this.f5274j = new d(this.f5266a, r10, this);
        this.f5267b.o().c(this);
    }

    public static Intent a(Context context, String str, h hVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.a());
        intent.putExtra("KEY_NOTIFICATION", hVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, h hVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.a());
        intent.putExtra("KEY_NOTIFICATION", hVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent e(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void g(Intent intent) {
        p.c().d(f5265l, String.format("Stopping foreground work for %s", new Object[]{intent}), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.f5267b.b(UUID.fromString(stringExtra));
        }
    }

    private void h(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        p.c().a(f5265l, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", new Object[]{Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)}), new Throwable[0]);
        if (notification != null && this.f5275k != null) {
            this.f5271g.put(stringExtra, new h(intExtra, notification, intExtra2));
            if (TextUtils.isEmpty(this.f5270f)) {
                this.f5270f = stringExtra;
                this.f5275k.b(intExtra, intExtra2, notification);
                return;
            }
            this.f5275k.c(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry<String, h> value : this.f5271g.entrySet()) {
                    i10 |= ((h) value.getValue()).a();
                }
                h hVar = this.f5271g.get(this.f5270f);
                if (hVar != null) {
                    this.f5275k.b(hVar.c(), i10, hVar.b());
                }
            }
        }
    }

    private void i(Intent intent) {
        p.c().d(f5265l, String.format("Started foreground service %s", new Object[]{intent}), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        this.f5268c.b(new C0093a(this.f5267b.q(), stringExtra));
    }

    public void b(List<String> list) {
        if (!list.isEmpty()) {
            for (String next : list) {
                p.c().a(f5265l, String.format("Constraints unmet for WorkSpec %s", new Object[]{next}), new Throwable[0]);
                this.f5267b.y(next);
            }
        }
    }

    public void d(String str, boolean z10) {
        Map.Entry entry;
        synchronized (this.f5269d) {
            r1.p remove = this.f5272h.remove(str);
            if (remove != null ? this.f5273i.remove(remove) : false) {
                this.f5274j.d(this.f5273i);
            }
        }
        h remove2 = this.f5271g.remove(str);
        if (str.equals(this.f5270f) && this.f5271g.size() > 0) {
            Iterator it = this.f5271g.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f5270f = (String) entry.getKey();
            if (this.f5275k != null) {
                h hVar = (h) entry.getValue();
                this.f5275k.b(hVar.c(), hVar.a(), hVar.b());
                this.f5275k.d(hVar.c());
            }
        }
        b bVar = this.f5275k;
        if (remove2 != null && bVar != null) {
            p.c().a(f5265l, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", new Object[]{Integer.valueOf(remove2.c()), str, Integer.valueOf(remove2.a())}), new Throwable[0]);
            bVar.d(remove2.c());
        }
    }

    public void f(List<String> list) {
    }

    /* access modifiers changed from: package-private */
    public void j(Intent intent) {
        p.c().d(f5265l, "Stopping foreground service", new Throwable[0]);
        b bVar = this.f5275k;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* access modifiers changed from: package-private */
    public void k() {
        this.f5275k = null;
        synchronized (this.f5269d) {
            this.f5274j.e();
        }
        this.f5267b.o().i(this);
    }

    /* access modifiers changed from: package-private */
    public void l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            i(intent);
            h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            j(intent);
        }
    }

    /* access modifiers changed from: package-private */
    public void m(b bVar) {
        if (this.f5275k != null) {
            p.c().b(f5265l, "A callback already exists.", new Throwable[0]);
        } else {
            this.f5275k = bVar;
        }
    }
}
