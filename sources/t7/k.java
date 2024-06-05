package t7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import r6.v;
import u7.i;
import u7.l;
import u7.q;
import y7.g;

/* compiled from: IndexBackfiller */
public class k {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final long f30466f = TimeUnit.SECONDS.toMillis(15);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final long f30467g = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: a  reason: collision with root package name */
    private final a f30468a;

    /* renamed from: b  reason: collision with root package name */
    private final e1 f30469b;

    /* renamed from: c  reason: collision with root package name */
    private final v<l> f30470c;

    /* renamed from: d  reason: collision with root package name */
    private final v<n> f30471d;

    /* renamed from: e  reason: collision with root package name */
    private int f30472e;

    /* compiled from: IndexBackfiller */
    public class a implements g4 {

        /* renamed from: a  reason: collision with root package name */
        private g.b f30473a;

        /* renamed from: b  reason: collision with root package name */
        private final g f30474b;

        public a(g gVar) {
            this.f30474b = gVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b() {
            y7.v.a("IndexBackfiller", "Documents written: %s", Integer.valueOf(k.this.d()));
            c(k.f30467g);
        }

        private void c(long j10) {
            this.f30473a = this.f30474b.k(g.d.INDEX_BACKFILL, j10, new j(this));
        }

        public void start() {
            c(k.f30466f);
        }

        public void stop() {
            g.b bVar = this.f30473a;
            if (bVar != null) {
                bVar.c();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public k(e1 e1Var, g gVar, i0 i0Var) {
        this(e1Var, gVar, new g(i0Var), new h(i0Var));
        Objects.requireNonNull(i0Var);
    }

    private q.a e(q.a aVar, m mVar) {
        Iterator<Map.Entry<l, i>> it = mVar.c().iterator();
        q.a aVar2 = aVar;
        while (it.hasNext()) {
            q.a f10 = q.a.f((i) it.next().getValue());
            if (f10.compareTo(aVar2) > 0) {
                aVar2 = f10;
            }
        }
        return q.a.d(aVar2.i(), aVar2.g(), Math.max(mVar.b(), aVar.h()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer g() {
        return Integer.valueOf(i());
    }

    private int h(String str, int i10) {
        l lVar = this.f30470c.get();
        q.a i11 = lVar.i(str);
        m k10 = this.f30471d.get().k(str, i11, i10);
        lVar.c(k10.c());
        q.a e10 = e(i11, k10);
        y7.v.a("IndexBackfiller", "Updating offset: %s", e10);
        lVar.h(str, e10);
        return k10.c().size();
    }

    private int i() {
        l lVar = this.f30470c.get();
        HashSet hashSet = new HashSet();
        int i10 = this.f30472e;
        while (i10 > 0) {
            String f10 = lVar.f();
            if (f10 == null || hashSet.contains(f10)) {
                break;
            }
            y7.v.a("IndexBackfiller", "Processing collection: %s", f10);
            i10 -= h(f10, i10);
            hashSet.add(f10);
        }
        return this.f30472e - i10;
    }

    public int d() {
        return ((Integer) this.f30469b.j("Backfill Indexes", new i(this))).intValue();
    }

    public a f() {
        return this.f30468a;
    }

    public k(e1 e1Var, g gVar, v<l> vVar, v<n> vVar2) {
        this.f30472e = 50;
        this.f30469b = e1Var;
        this.f30468a = new a(gVar);
        this.f30470c = vVar;
        this.f30471d = vVar2;
    }
}
