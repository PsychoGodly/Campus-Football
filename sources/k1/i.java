package k1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.a0;
import androidx.work.b;
import androidx.work.g;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.p;
import androidx.work.r;
import androidx.work.s;
import androidx.work.v;
import androidx.work.z;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import s1.e;
import s1.h;
import t1.a;

/* compiled from: WorkManagerImpl */
public class i extends z {

    /* renamed from: j  reason: collision with root package name */
    private static final String f19578j = p.f("WorkManagerImpl");

    /* renamed from: k  reason: collision with root package name */
    private static i f19579k = null;

    /* renamed from: l  reason: collision with root package name */
    private static i f19580l = null;

    /* renamed from: m  reason: collision with root package name */
    private static final Object f19581m = new Object();

    /* renamed from: a  reason: collision with root package name */
    private Context f19582a;

    /* renamed from: b  reason: collision with root package name */
    private b f19583b;

    /* renamed from: c  reason: collision with root package name */
    private WorkDatabase f19584c;

    /* renamed from: d  reason: collision with root package name */
    private a f19585d;

    /* renamed from: e  reason: collision with root package name */
    private List<e> f19586e;

    /* renamed from: f  reason: collision with root package name */
    private d f19587f;

    /* renamed from: g  reason: collision with root package name */
    private e f19588g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f19589h;

    /* renamed from: i  reason: collision with root package name */
    private BroadcastReceiver.PendingResult f19590i;

    public i(Context context, b bVar, a aVar) {
        this(context, bVar, aVar, context.getResources().getBoolean(v.workmanager_test_configuration));
    }

    public static void h(Context context, b bVar) {
        synchronized (f19581m) {
            i iVar = f19579k;
            if (iVar != null) {
                if (f19580l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            }
            if (iVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (f19580l == null) {
                    f19580l = new i(applicationContext, bVar, new t1.b(bVar.l()));
                }
                f19579k = f19580l;
            }
        }
    }

    @Deprecated
    public static i l() {
        synchronized (f19581m) {
            i iVar = f19579k;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = f19580l;
            return iVar2;
        }
    }

    public static i m(Context context) {
        i l10;
        synchronized (f19581m) {
            l10 = l();
            if (l10 == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof b.c) {
                    h(applicationContext, ((b.c) applicationContext).a());
                    l10 = m(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return l10;
    }

    private void s(Context context, b bVar, a aVar, WorkDatabase workDatabase, List<e> list, d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f19582a = applicationContext;
        this.f19583b = bVar;
        this.f19585d = aVar;
        this.f19584c = workDatabase;
        this.f19586e = list;
        this.f19587f = dVar;
        this.f19588g = new e(workDatabase);
        this.f19589h = false;
        if (Build.VERSION.SDK_INT < 24 || !applicationContext.isDeviceProtectedStorage()) {
            this.f19585d.b(new ForceStopRunnable(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    public s a(String str) {
        s1.a d10 = s1.a.d(str, this);
        this.f19585d.b(d10);
        return d10.e();
    }

    public s b(UUID uuid) {
        s1.a b10 = s1.a.b(uuid, this);
        this.f19585d.b(b10);
        return b10.e();
    }

    public s d(List<? extends a0> list) {
        if (!list.isEmpty()) {
            return new g(this, list).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public s f(String str, g gVar, List<r> list) {
        return new g(this, str, gVar, list).a();
    }

    public List<e> i(Context context, b bVar, a aVar) {
        return Arrays.asList(new e[]{f.a(context, this), new l1.b(context, bVar, aVar, this)});
    }

    public Context j() {
        return this.f19582a;
    }

    public b k() {
        return this.f19583b;
    }

    public e n() {
        return this.f19588g;
    }

    public d o() {
        return this.f19587f;
    }

    public List<e> p() {
        return this.f19586e;
    }

    public WorkDatabase q() {
        return this.f19584c;
    }

    public a r() {
        return this.f19585d;
    }

    public void t() {
        synchronized (f19581m) {
            this.f19589h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f19590i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f19590i = null;
            }
        }
    }

    public void u() {
        if (Build.VERSION.SDK_INT >= 23) {
            m1.b.b(j());
        }
        q().B().u();
        f.b(k(), q(), p());
    }

    public void v(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f19581m) {
            this.f19590i = pendingResult;
            if (this.f19589h) {
                pendingResult.finish();
                this.f19590i = null;
            }
        }
    }

    public void w(String str) {
        x(str, (WorkerParameters.a) null);
    }

    public void x(String str, WorkerParameters.a aVar) {
        this.f19585d.b(new h(this, str, aVar));
    }

    public void y(String str) {
        this.f19585d.b(new s1.i(this, str, true));
    }

    public void z(String str) {
        this.f19585d.b(new s1.i(this, str, false));
    }

    public i(Context context, b bVar, a aVar, boolean z10) {
        this(context, bVar, aVar, WorkDatabase.s(context.getApplicationContext(), aVar.c(), z10));
    }

    public i(Context context, b bVar, a aVar, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        p.e(new p.a(bVar.j()));
        Context context2 = context;
        b bVar2 = bVar;
        a aVar2 = aVar;
        WorkDatabase workDatabase2 = workDatabase;
        List<e> i10 = i(applicationContext, bVar, aVar);
        s(context2, bVar2, aVar2, workDatabase2, i10, new d(context2, bVar2, aVar2, workDatabase2, i10));
    }
}
