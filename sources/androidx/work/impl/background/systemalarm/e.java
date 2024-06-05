package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.p;
import java.util.ArrayList;
import java.util.List;
import k1.i;
import s1.g;
import s1.j;
import s1.n;

/* compiled from: SystemAlarmDispatcher */
public class e implements k1.b {

    /* renamed from: l  reason: collision with root package name */
    static final String f5228l = p.f("SystemAlarmDispatcher");

    /* renamed from: a  reason: collision with root package name */
    final Context f5229a;

    /* renamed from: b  reason: collision with root package name */
    private final t1.a f5230b;

    /* renamed from: c  reason: collision with root package name */
    private final n f5231c;

    /* renamed from: d  reason: collision with root package name */
    private final k1.d f5232d;

    /* renamed from: f  reason: collision with root package name */
    private final i f5233f;

    /* renamed from: g  reason: collision with root package name */
    final b f5234g;

    /* renamed from: h  reason: collision with root package name */
    private final Handler f5235h;

    /* renamed from: i  reason: collision with root package name */
    final List<Intent> f5236i;

    /* renamed from: j  reason: collision with root package name */
    Intent f5237j;

    /* renamed from: k  reason: collision with root package name */
    private c f5238k;

    /* compiled from: SystemAlarmDispatcher */
    class a implements Runnable {
        a() {
        }

        public void run() {
            d dVar;
            e eVar;
            synchronized (e.this.f5236i) {
                e eVar2 = e.this;
                eVar2.f5237j = eVar2.f5236i.get(0);
            }
            Intent intent = e.this.f5237j;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.f5237j.getIntExtra("KEY_START_ID", 0);
                p c10 = p.c();
                String str = e.f5228l;
                c10.a(str, String.format("Processing command %s, %s", new Object[]{e.this.f5237j, Integer.valueOf(intExtra)}), new Throwable[0]);
                PowerManager.WakeLock b10 = j.b(e.this.f5229a, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                try {
                    p.c().a(str, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, b10}), new Throwable[0]);
                    b10.acquire();
                    e eVar3 = e.this;
                    eVar3.f5234g.p(eVar3.f5237j, intExtra, eVar3);
                    p.c().a(str, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b10}), new Throwable[0]);
                    b10.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th) {
                    p.c().a(e.f5228l, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b10}), new Throwable[0]);
                    b10.release();
                    e eVar4 = e.this;
                    eVar4.k(new d(eVar4));
                    throw th;
                }
                eVar.k(dVar);
            }
        }
    }

    /* compiled from: SystemAlarmDispatcher */
    static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final e f5240a;

        /* renamed from: b  reason: collision with root package name */
        private final Intent f5241b;

        /* renamed from: c  reason: collision with root package name */
        private final int f5242c;

        b(e eVar, Intent intent, int i10) {
            this.f5240a = eVar;
            this.f5241b = intent;
            this.f5242c = i10;
        }

        public void run() {
            this.f5240a.a(this.f5241b, this.f5242c);
        }
    }

    /* compiled from: SystemAlarmDispatcher */
    interface c {
        void a();
    }

    /* compiled from: SystemAlarmDispatcher */
    static class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final e f5243a;

        d(e eVar) {
            this.f5243a = eVar;
        }

        public void run() {
            this.f5243a.c();
        }
    }

    e(Context context) {
        this(context, (k1.d) null, (i) null);
    }

    private void b() {
        if (this.f5235h.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        b();
        synchronized (this.f5236i) {
            for (Intent action : this.f5236i) {
                if (str.equals(action.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void l() {
        b();
        PowerManager.WakeLock b10 = j.b(this.f5229a, "ProcessCommand");
        try {
            b10.acquire();
            this.f5233f.r().b(new a());
        } finally {
            b10.release();
        }
    }

    public boolean a(Intent intent, int i10) {
        p c10 = p.c();
        String str = f5228l;
        boolean z10 = false;
        c10.a(str, String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i10)}), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            p.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i10);
            synchronized (this.f5236i) {
                if (!this.f5236i.isEmpty()) {
                    z10 = true;
                }
                this.f5236i.add(intent);
                if (!z10) {
                    l();
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        p c10 = p.c();
        String str = f5228l;
        c10.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.f5236i) {
            if (this.f5237j != null) {
                p.c().a(str, String.format("Removing command %s", new Object[]{this.f5237j}), new Throwable[0]);
                if (this.f5236i.remove(0).equals(this.f5237j)) {
                    this.f5237j = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            g c11 = this.f5230b.c();
            if (!this.f5234g.o() && this.f5236i.isEmpty() && !c11.a()) {
                p.c().a(str, "No more commands & intents.", new Throwable[0]);
                c cVar = this.f5238k;
                if (cVar != null) {
                    cVar.a();
                }
            } else if (!this.f5236i.isEmpty()) {
                l();
            }
        }
    }

    public void d(String str, boolean z10) {
        k(new b(this, b.c(this.f5229a, str, z10), 0));
    }

    /* access modifiers changed from: package-private */
    public k1.d e() {
        return this.f5232d;
    }

    /* access modifiers changed from: package-private */
    public t1.a f() {
        return this.f5230b;
    }

    /* access modifiers changed from: package-private */
    public i g() {
        return this.f5233f;
    }

    /* access modifiers changed from: package-private */
    public n h() {
        return this.f5231c;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        p.c().a(f5228l, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f5232d.i(this);
        this.f5231c.a();
        this.f5238k = null;
    }

    /* access modifiers changed from: package-private */
    public void k(Runnable runnable) {
        this.f5235h.post(runnable);
    }

    /* access modifiers changed from: package-private */
    public void m(c cVar) {
        if (this.f5238k != null) {
            p.c().b(f5228l, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f5238k = cVar;
        }
    }

    e(Context context, k1.d dVar, i iVar) {
        Context applicationContext = context.getApplicationContext();
        this.f5229a = applicationContext;
        this.f5234g = new b(applicationContext);
        this.f5231c = new n();
        iVar = iVar == null ? i.m(context) : iVar;
        this.f5233f = iVar;
        dVar = dVar == null ? iVar.o() : dVar;
        this.f5232d = dVar;
        this.f5230b = iVar.r();
        dVar.c(this);
        this.f5236i = new ArrayList();
        this.f5237j = null;
        this.f5235h = new Handler(Looper.getMainLooper());
    }
}
