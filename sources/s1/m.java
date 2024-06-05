package s1;

import android.content.Context;
import androidx.work.e;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.c;
import androidx.work.p;
import androidx.work.u;
import androidx.work.y;
import java.util.UUID;
import w6.f;

/* compiled from: WorkProgressUpdater */
public class m implements u {

    /* renamed from: c  reason: collision with root package name */
    static final String f22338c = p.f("WorkProgressUpdater");

    /* renamed from: a  reason: collision with root package name */
    final WorkDatabase f22339a;

    /* renamed from: b  reason: collision with root package name */
    final t1.a f22340b;

    /* compiled from: WorkProgressUpdater */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UUID f22341a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f22342b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f22343c;

        a(UUID uuid, e eVar, c cVar) {
            this.f22341a = uuid;
            this.f22342b = eVar;
            this.f22343c = cVar;
        }

        public void run() {
            String uuid = this.f22341a.toString();
            p c10 = p.c();
            String str = m.f22338c;
            c10.a(str, String.format("Updating progress for %s (%s)", new Object[]{this.f22341a, this.f22342b}), new Throwable[0]);
            m.this.f22339a.c();
            try {
                r1.p m10 = m.this.f22339a.B().m(uuid);
                if (m10 != null) {
                    if (m10.f21927b == y.a.RUNNING) {
                        m.this.f22339a.A().b(new r1.m(uuid, this.f22342b));
                    } else {
                        p.c().h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", new Object[]{uuid}), new Throwable[0]);
                    }
                    this.f22343c.p(null);
                    m.this.f22339a.r();
                    m.this.f22339a.g();
                    return;
                }
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            } catch (Throwable th) {
                m.this.f22339a.g();
                throw th;
            }
        }
    }

    public m(WorkDatabase workDatabase, t1.a aVar) {
        this.f22339a = workDatabase;
        this.f22340b = aVar;
    }

    public f<Void> a(Context context, UUID uuid, e eVar) {
        c t10 = c.t();
        this.f22340b.b(new a(uuid, eVar, t10));
        return t10;
    }
}
