package h2;

import b2.i;
import b2.o;
import b2.t;
import c2.e;
import c2.m;
import i2.y;
import j2.d;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import k2.b;
import z1.h;

/* compiled from: DefaultScheduler */
public class c implements e {

    /* renamed from: f  reason: collision with root package name */
    private static final Logger f18718f = Logger.getLogger(t.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final y f18719a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f18720b;

    /* renamed from: c  reason: collision with root package name */
    private final e f18721c;

    /* renamed from: d  reason: collision with root package name */
    private final d f18722d;

    /* renamed from: e  reason: collision with root package name */
    private final b f18723e;

    public c(Executor executor, e eVar, y yVar, d dVar, b bVar) {
        this.f18720b = executor;
        this.f18721c = eVar;
        this.f18719a = yVar;
        this.f18722d = dVar;
        this.f18723e = bVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object d(o oVar, i iVar) {
        this.f18722d.J0(oVar, iVar);
        this.f18719a.b(oVar, 1);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(o oVar, h hVar, i iVar) {
        try {
            m mVar = this.f18721c.get(oVar.b());
            if (mVar == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{oVar.b()});
                f18718f.warning(format);
                hVar.a(new IllegalArgumentException(format));
                return;
            }
            this.f18723e.i(new b(this, oVar, mVar.a(iVar)));
            hVar.a((Exception) null);
        } catch (Exception e10) {
            Logger logger = f18718f;
            logger.warning("Error scheduling event " + e10.getMessage());
            hVar.a(e10);
        }
    }

    public void a(o oVar, i iVar, h hVar) {
        this.f18720b.execute(new a(this, oVar, hVar, iVar));
    }
}
