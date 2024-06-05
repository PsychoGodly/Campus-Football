package s1;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.h;
import androidx.work.i;
import androidx.work.impl.utils.futures.c;
import androidx.work.p;
import w6.f;

/* compiled from: WorkForegroundRunnable */
public class k implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    static final String f22318h = p.f("WorkForegroundRunnable");

    /* renamed from: a  reason: collision with root package name */
    final c<Void> f22319a = c.t();

    /* renamed from: b  reason: collision with root package name */
    final Context f22320b;

    /* renamed from: c  reason: collision with root package name */
    final r1.p f22321c;

    /* renamed from: d  reason: collision with root package name */
    final ListenableWorker f22322d;

    /* renamed from: f  reason: collision with root package name */
    final i f22323f;

    /* renamed from: g  reason: collision with root package name */
    final t1.a f22324g;

    /* compiled from: WorkForegroundRunnable */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f22325a;

        a(c cVar) {
            this.f22325a = cVar;
        }

        public void run() {
            this.f22325a.r(k.this.f22322d.getForegroundInfoAsync());
        }
    }

    /* compiled from: WorkForegroundRunnable */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f22327a;

        b(c cVar) {
            this.f22327a = cVar;
        }

        public void run() {
            try {
                h hVar = (h) this.f22327a.get();
                if (hVar != null) {
                    p.c().a(k.f22318h, String.format("Updating notification for %s", new Object[]{k.this.f22321c.f21928c}), new Throwable[0]);
                    k.this.f22322d.setRunInForeground(true);
                    k kVar = k.this;
                    kVar.f22319a.r(kVar.f22323f.a(kVar.f22320b, kVar.f22322d.getId(), hVar));
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", new Object[]{k.this.f22321c.f21928c}));
            } catch (Throwable th) {
                k.this.f22319a.q(th);
            }
        }
    }

    public k(Context context, r1.p pVar, ListenableWorker listenableWorker, i iVar, t1.a aVar) {
        this.f22320b = context;
        this.f22321c = pVar;
        this.f22322d = listenableWorker;
        this.f22323f = iVar;
        this.f22324g = aVar;
    }

    public f<Void> a() {
        return this.f22319a;
    }

    public void run() {
        if (!this.f22321c.f21942q || androidx.core.os.a.c()) {
            this.f22319a.p(null);
            return;
        }
        c t10 = c.t();
        this.f22324g.a().execute(new a(t10));
        t10.a(new b(t10), this.f22324g.a());
    }
}
