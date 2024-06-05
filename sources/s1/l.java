package s1;

import android.content.Context;
import androidx.work.h;
import androidx.work.i;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.c;
import androidx.work.p;
import androidx.work.y;
import java.util.UUID;
import r1.q;
import w6.f;

/* compiled from: WorkForegroundUpdater */
public class l implements i {

    /* renamed from: d  reason: collision with root package name */
    private static final String f22329d = p.f("WMFgUpdater");

    /* renamed from: a  reason: collision with root package name */
    private final t1.a f22330a;

    /* renamed from: b  reason: collision with root package name */
    final q1.a f22331b;

    /* renamed from: c  reason: collision with root package name */
    final q f22332c;

    /* compiled from: WorkForegroundUpdater */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f22333a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UUID f22334b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f22335c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f22336d;

        a(c cVar, UUID uuid, h hVar, Context context) {
            this.f22333a = cVar;
            this.f22334b = uuid;
            this.f22335c = hVar;
            this.f22336d = context;
        }

        public void run() {
            try {
                if (!this.f22333a.isCancelled()) {
                    String uuid = this.f22334b.toString();
                    y.a l10 = l.this.f22332c.l(uuid);
                    if (l10 == null || l10.a()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    l.this.f22331b.a(uuid, this.f22335c);
                    this.f22336d.startService(androidx.work.impl.foreground.a.a(this.f22336d, uuid, this.f22335c));
                }
                this.f22333a.p(null);
            } catch (Throwable th) {
                this.f22333a.q(th);
            }
        }
    }

    public l(WorkDatabase workDatabase, q1.a aVar, t1.a aVar2) {
        this.f22331b = aVar;
        this.f22330a = aVar2;
        this.f22332c = workDatabase.B();
    }

    public f<Void> a(Context context, UUID uuid, h hVar) {
        c t10 = c.t();
        this.f22330a.b(new a(t10, uuid, hVar, context));
        return t10;
    }
}
