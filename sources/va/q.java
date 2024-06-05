package va;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* compiled from: DatabaseWorkerPool */
class q implements o {

    /* renamed from: a  reason: collision with root package name */
    final String f23391a;

    /* renamed from: b  reason: collision with root package name */
    final int f23392b;

    /* renamed from: c  reason: collision with root package name */
    final int f23393c;

    /* renamed from: d  reason: collision with root package name */
    private final LinkedList<k> f23394d = new LinkedList<>();

    /* renamed from: e  reason: collision with root package name */
    private final Set<m> f23395e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private final Set<m> f23396f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private final Map<Integer, m> f23397g = new HashMap();

    q(String str, int i10, int i11) {
        this.f23391a = str;
        this.f23392b = i10;
        this.f23393c = i11;
    }

    private synchronized k f(m mVar) {
        k kVar;
        ListIterator listIterator = this.f23394d.listIterator();
        while (true) {
            m mVar2 = null;
            if (!listIterator.hasNext()) {
                return null;
            }
            kVar = (k) listIterator.next();
            if (kVar.a() != null) {
                mVar2 = this.f23397g.get(kVar.a());
            }
            if (mVar2 == null || mVar2 == mVar) {
                listIterator.remove();
            }
        }
        listIterator.remove();
        return kVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public synchronized void g(m mVar) {
        HashSet<m> hashSet = new HashSet<>(this.f23395e);
        this.f23396f.remove(mVar);
        this.f23395e.add(mVar);
        if (!mVar.b() && mVar.d() != null) {
            this.f23397g.remove(mVar.d());
        }
        i(mVar);
        for (m i10 : hashSet) {
            i(i10);
        }
    }

    private synchronized void i(m mVar) {
        k f10 = f(mVar);
        if (f10 != null) {
            this.f23396f.add(mVar);
            this.f23395e.remove(mVar);
            if (f10.a() != null) {
                this.f23397g.put(f10.a(), mVar);
            }
            mVar.e(f10);
        }
    }

    public /* synthetic */ void a(i iVar, Runnable runnable) {
        n.a(this, iVar, runnable);
    }

    public synchronized void b(k kVar) {
        this.f23394d.add(kVar);
        for (m i10 : new HashSet(this.f23395e)) {
            i(i10);
        }
    }

    public synchronized void c() {
        for (m f10 : this.f23395e) {
            f10.f();
        }
        for (m f11 : this.f23396f) {
            f11.f();
        }
    }

    /* access modifiers changed from: protected */
    public m e(String str, int i10) {
        return new m(str, i10);
    }

    public synchronized void start() {
        for (int i10 = 0; i10 < this.f23392b; i10++) {
            m e10 = e(this.f23391a + i10, this.f23393c);
            e10.g(new p(this, e10));
            this.f23395e.add(e10);
        }
    }
}
