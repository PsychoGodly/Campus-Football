package k1;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import androidx.work.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import k1.j;
import s1.j;
import w6.f;

/* compiled from: Processor */
public class d implements b, q1.a {

    /* renamed from: m  reason: collision with root package name */
    private static final String f19550m = p.f("Processor");

    /* renamed from: a  reason: collision with root package name */
    private PowerManager.WakeLock f19551a;

    /* renamed from: b  reason: collision with root package name */
    private Context f19552b;

    /* renamed from: c  reason: collision with root package name */
    private b f19553c;

    /* renamed from: d  reason: collision with root package name */
    private t1.a f19554d;

    /* renamed from: f  reason: collision with root package name */
    private WorkDatabase f19555f;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, j> f19556g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private Map<String, j> f19557h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private List<e> f19558i;

    /* renamed from: j  reason: collision with root package name */
    private Set<String> f19559j;

    /* renamed from: k  reason: collision with root package name */
    private final List<b> f19560k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f19561l;

    /* compiled from: Processor */
    private static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private b f19562a;

        /* renamed from: b  reason: collision with root package name */
        private String f19563b;

        /* renamed from: c  reason: collision with root package name */
        private f<Boolean> f19564c;

        a(b bVar, String str, f<Boolean> fVar) {
            this.f19562a = bVar;
            this.f19563b = str;
            this.f19564c = fVar;
        }

        public void run() {
            boolean z10;
            try {
                z10 = this.f19564c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z10 = true;
            }
            this.f19562a.d(this.f19563b, z10);
        }
    }

    public d(Context context, b bVar, t1.a aVar, WorkDatabase workDatabase, List<e> list) {
        this.f19552b = context;
        this.f19553c = bVar;
        this.f19554d = aVar;
        this.f19555f = workDatabase;
        this.f19558i = list;
        this.f19559j = new HashSet();
        this.f19560k = new ArrayList();
        this.f19551a = null;
        this.f19561l = new Object();
    }

    private static boolean e(String str, j jVar) {
        if (jVar != null) {
            jVar.d();
            p.c().a(f19550m, String.format("WorkerWrapper interrupted for %s", new Object[]{str}), new Throwable[0]);
            return true;
        }
        p.c().a(f19550m, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
        return false;
    }

    private void m() {
        synchronized (this.f19561l) {
            if (!(!this.f19556g.isEmpty())) {
                try {
                    this.f19552b.startService(androidx.work.impl.foreground.a.e(this.f19552b));
                } catch (Throwable th) {
                    p.c().b(f19550m, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f19551a;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f19551a = null;
                }
            }
        }
    }

    public void a(String str, h hVar) {
        synchronized (this.f19561l) {
            p.c().d(f19550m, String.format("Moving WorkSpec (%s) to the foreground", new Object[]{str}), new Throwable[0]);
            j remove = this.f19557h.remove(str);
            if (remove != null) {
                if (this.f19551a == null) {
                    PowerManager.WakeLock b10 = j.b(this.f19552b, "ProcessorForegroundLck");
                    this.f19551a = b10;
                    b10.acquire();
                }
                this.f19556g.put(str, remove);
                androidx.core.content.a.startForegroundService(this.f19552b, androidx.work.impl.foreground.a.c(this.f19552b, str, hVar));
            }
        }
    }

    public void b(String str) {
        synchronized (this.f19561l) {
            this.f19556g.remove(str);
            m();
        }
    }

    public void c(b bVar) {
        synchronized (this.f19561l) {
            this.f19560k.add(bVar);
        }
    }

    public void d(String str, boolean z10) {
        synchronized (this.f19561l) {
            this.f19557h.remove(str);
            p.c().a(f19550m, String.format("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z10)}), new Throwable[0]);
            for (b d10 : this.f19560k) {
                d10.d(str, z10);
            }
        }
    }

    public boolean f(String str) {
        boolean contains;
        synchronized (this.f19561l) {
            contains = this.f19559j.contains(str);
        }
        return contains;
    }

    public boolean g(String str) {
        boolean z10;
        synchronized (this.f19561l) {
            if (!this.f19557h.containsKey(str)) {
                if (!this.f19556g.containsKey(str)) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public boolean h(String str) {
        boolean containsKey;
        synchronized (this.f19561l) {
            containsKey = this.f19556g.containsKey(str);
        }
        return containsKey;
    }

    public void i(b bVar) {
        synchronized (this.f19561l) {
            this.f19560k.remove(bVar);
        }
    }

    public boolean j(String str) {
        return k(str, (WorkerParameters.a) null);
    }

    public boolean k(String str, WorkerParameters.a aVar) {
        synchronized (this.f19561l) {
            if (g(str)) {
                p.c().a(f19550m, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            j a10 = new j.c(this.f19552b, this.f19553c, this.f19554d, this, this.f19555f, str).c(this.f19558i).b(aVar).a();
            f<Boolean> b10 = a10.b();
            b10.a(new a(this, str, b10), this.f19554d.a());
            this.f19557h.put(str, a10);
            this.f19554d.c().execute(a10);
            p.c().a(f19550m, String.format("%s: processing %s", new Object[]{getClass().getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    public boolean l(String str) {
        boolean e10;
        synchronized (this.f19561l) {
            boolean z10 = true;
            p.c().a(f19550m, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            this.f19559j.add(str);
            j remove = this.f19556g.remove(str);
            if (remove == null) {
                z10 = false;
            }
            if (remove == null) {
                remove = this.f19557h.remove(str);
            }
            e10 = e(str, remove);
            if (z10) {
                m();
            }
        }
        return e10;
    }

    public boolean n(String str) {
        boolean e10;
        synchronized (this.f19561l) {
            p.c().a(f19550m, String.format("Processor stopping foreground work %s", new Object[]{str}), new Throwable[0]);
            e10 = e(str, this.f19556g.remove(str));
        }
        return e10;
    }

    public boolean o(String str) {
        boolean e10;
        synchronized (this.f19561l) {
            p.c().a(f19550m, String.format("Processor stopping background work %s", new Object[]{str}), new Throwable[0]);
            e10 = e(str, this.f19557h.remove(str));
        }
        return e10;
    }
}
