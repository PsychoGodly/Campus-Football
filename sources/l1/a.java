package l1;

import androidx.work.p;
import androidx.work.w;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DelayedWorkTracker */
public class a {

    /* renamed from: d  reason: collision with root package name */
    static final String f19860d = p.f("DelayedWorkTracker");

    /* renamed from: a  reason: collision with root package name */
    final b f19861a;

    /* renamed from: b  reason: collision with root package name */
    private final w f19862b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Runnable> f19863c = new HashMap();

    /* renamed from: l1.a$a  reason: collision with other inner class name */
    /* compiled from: DelayedWorkTracker */
    class C0211a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r1.p f19864a;

        C0211a(r1.p pVar) {
            this.f19864a = pVar;
        }

        public void run() {
            p.c().a(a.f19860d, String.format("Scheduling work %s", new Object[]{this.f19864a.f21926a}), new Throwable[0]);
            a.this.f19861a.a(this.f19864a);
        }
    }

    public a(b bVar, w wVar) {
        this.f19861a = bVar;
        this.f19862b = wVar;
    }

    public void a(r1.p pVar) {
        Runnable remove = this.f19863c.remove(pVar.f21926a);
        if (remove != null) {
            this.f19862b.b(remove);
        }
        C0211a aVar = new C0211a(pVar);
        this.f19863c.put(pVar.f21926a, aVar);
        long currentTimeMillis = System.currentTimeMillis();
        this.f19862b.a(pVar.a() - currentTimeMillis, aVar);
    }

    public void b(String str) {
        Runnable remove = this.f19863c.remove(str);
        if (remove != null) {
            this.f19862b.b(remove);
        }
    }
}
