package androidx.work.impl;

import android.content.Context;
import androidx.room.g;
import androidx.room.h;
import androidx.work.impl.a;
import c1.c;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import r1.e;
import r1.k;
import r1.n;
import r1.q;
import r1.t;

public abstract class WorkDatabase extends h {

    /* renamed from: l  reason: collision with root package name */
    private static final long f5179l = TimeUnit.DAYS.toMillis(1);

    class a implements c.C0106c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f5180a;

        a(Context context) {
            this.f5180a = context;
        }

        public c a(c.b bVar) {
            c.b.a a10 = c.b.a(this.f5180a);
            a10.c(bVar.f5577b).b(bVar.f5578c).d(true);
            return new d1.c().a(a10.a());
        }
    }

    class b extends h.b {
        b() {
        }

        public void c(c1.b bVar) {
            super.c(bVar);
            bVar.k();
            try {
                bVar.s(WorkDatabase.w());
                bVar.O();
            } finally {
                bVar.a0();
            }
        }
    }

    public static WorkDatabase s(Context context, Executor executor, boolean z10) {
        h.a<WorkDatabase> aVar;
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z10) {
            aVar = g.c(context, cls).c();
        } else {
            aVar = g.a(context, cls, k1.h.d());
            aVar.f(new a(context));
        }
        return aVar.g(executor).a(u()).b(a.f5189a).b(new a.h(context, 2, 3)).b(a.f5190b).b(a.f5191c).b(new a.h(context, 5, 6)).b(a.f5192d).b(a.f5193e).b(a.f5194f).b(new a.i(context)).b(new a.h(context, 10, 11)).b(a.f5195g).e().d();
    }

    static h.b u() {
        return new b();
    }

    static long v() {
        return System.currentTimeMillis() - f5179l;
    }

    static String w() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + v() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract n A();

    public abstract q B();

    public abstract t C();

    public abstract r1.b t();

    public abstract e x();

    public abstract r1.h y();

    public abstract k z();
}
