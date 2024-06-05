package l1;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.p;
import androidx.work.y;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k1.e;
import k1.i;
import n1.c;
import n1.d;
import s1.f;
import t1.a;

/* compiled from: GreedyScheduler */
public class b implements e, c, k1.b {

    /* renamed from: j  reason: collision with root package name */
    private static final String f19866j = p.f("GreedyScheduler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f19867a;

    /* renamed from: b  reason: collision with root package name */
    private final i f19868b;

    /* renamed from: c  reason: collision with root package name */
    private final d f19869c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<r1.p> f19870d = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private a f19871f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f19872g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f19873h;

    /* renamed from: i  reason: collision with root package name */
    Boolean f19874i;

    public b(Context context, androidx.work.b bVar, a aVar, i iVar) {
        this.f19867a = context;
        this.f19868b = iVar;
        this.f19869c = new d(context, aVar, this);
        this.f19871f = new a(this, bVar.k());
        this.f19873h = new Object();
    }

    private void g() {
        this.f19874i = Boolean.valueOf(f.b(this.f19867a, this.f19868b.k()));
    }

    private void h() {
        if (!this.f19872g) {
            this.f19868b.o().c(this);
            this.f19872g = true;
        }
    }

    private void i(String str) {
        synchronized (this.f19873h) {
            Iterator<r1.p> it = this.f19870d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r1.p next = it.next();
                if (next.f21926a.equals(str)) {
                    p.c().a(f19866j, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                    this.f19870d.remove(next);
                    this.f19869c.d(this.f19870d);
                    break;
                }
            }
        }
    }

    public void a(r1.p... pVarArr) {
        if (this.f19874i == null) {
            g();
        }
        if (!this.f19874i.booleanValue()) {
            p.c().d(f19866j, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (r1.p pVar : pVarArr) {
            long a10 = pVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f21927b == y.a.ENQUEUED) {
                if (currentTimeMillis < a10) {
                    a aVar = this.f19871f;
                    if (aVar != null) {
                        aVar.a(pVar);
                    }
                } else if (pVar.b()) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 23 && pVar.f21935j.h()) {
                        p.c().a(f19866j, String.format("Ignoring WorkSpec %s, Requires device idle.", new Object[]{pVar}), new Throwable[0]);
                    } else if (i10 < 24 || !pVar.f21935j.e()) {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f21926a);
                    } else {
                        p.c().a(f19866j, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", new Object[]{pVar}), new Throwable[0]);
                    }
                } else {
                    p.c().a(f19866j, String.format("Starting work for %s", new Object[]{pVar.f21926a}), new Throwable[0]);
                    this.f19868b.w(pVar.f21926a);
                }
            }
        }
        synchronized (this.f19873h) {
            if (!hashSet.isEmpty()) {
                p.c().a(f19866j, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", hashSet2)}), new Throwable[0]);
                this.f19870d.addAll(hashSet);
                this.f19869c.d(this.f19870d);
            }
        }
    }

    public void b(List<String> list) {
        for (String next : list) {
            p.c().a(f19866j, String.format("Constraints not met: Cancelling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f19868b.z(next);
        }
    }

    public boolean c() {
        return false;
    }

    public void d(String str, boolean z10) {
        i(str);
    }

    public void e(String str) {
        if (this.f19874i == null) {
            g();
        }
        if (!this.f19874i.booleanValue()) {
            p.c().d(f19866j, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        p.c().a(f19866j, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        a aVar = this.f19871f;
        if (aVar != null) {
            aVar.b(str);
        }
        this.f19868b.z(str);
    }

    public void f(List<String> list) {
        for (String next : list) {
            p.c().a(f19866j, String.format("Constraints met: Scheduling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f19868b.w(next);
        }
    }
}
