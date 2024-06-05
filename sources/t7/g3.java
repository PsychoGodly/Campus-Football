package t7;

import android.database.Cursor;
import com.google.android.gms.common.api.a;
import com.google.protobuf.e0;
import g7.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import r7.a1;
import t7.a3;
import u7.i;
import u7.j;
import u7.l;
import u7.q;
import u7.s;
import u7.u;
import u7.w;
import w7.a;
import y6.q;
import y7.b;
import y7.g0;
import y7.m;
import y7.p;
import y7.t;

/* compiled from: SQLiteRemoteDocumentCache */
final class g3 implements l1 {

    /* renamed from: a  reason: collision with root package name */
    private final a3 f30420a;

    /* renamed from: b  reason: collision with root package name */
    private final o f30421b;

    /* renamed from: c  reason: collision with root package name */
    private l f30422c;

    g3(a3 a3Var, o oVar) {
        this.f30420a = a3Var;
        this.f30421b = oVar;
    }

    private s k(byte[] bArr, int i10, int i11) {
        try {
            return this.f30421b.d(a.p0(bArr)).t(new w(new q((long) i10, i11)));
        } catch (e0 e10) {
            throw b.a("MaybeDocument failed to parse: %s", e10);
        }
    }

    private Map<l, s> l(List<u> list, q.a aVar, int i10, t<s, Boolean> tVar) {
        return m(list, aVar, i10, tVar, (f1) null);
    }

    private Map<l, s> m(List<u> list, q.a aVar, int i10, t<s, Boolean> tVar, f1 f1Var) {
        y6.q c10 = aVar.i().c();
        l g10 = aVar.g();
        StringBuilder z10 = g0.z("SELECT contents, read_time_seconds, read_time_nanos, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) ", list.size(), " UNION ");
        z10.append("ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?");
        Object[] objArr = new Object[((list.size() * 9) + 1)];
        int i11 = 0;
        for (u next : list) {
            String c11 = f.c(next);
            int i12 = i11 + 1;
            objArr[i11] = c11;
            int i13 = i12 + 1;
            objArr[i12] = f.f(c11);
            int i14 = i13 + 1;
            objArr[i13] = Integer.valueOf(next.k() + 1);
            int i15 = i14 + 1;
            objArr[i14] = Long.valueOf(c10.d());
            int i16 = i15 + 1;
            objArr[i15] = Long.valueOf(c10.d());
            int i17 = i16 + 1;
            objArr[i16] = Integer.valueOf(c10.c());
            int i18 = i17 + 1;
            objArr[i17] = Long.valueOf(c10.d());
            int i19 = i18 + 1;
            objArr[i18] = Integer.valueOf(c10.c());
            objArr[i19] = f.c(g10.l());
            i11 = i19 + 1;
        }
        objArr[i11] = Integer.valueOf(i10);
        m mVar = new m();
        HashMap hashMap = new HashMap();
        this.f30420a.E(z10.toString()).b(objArr).e(new e3(this, mVar, hashMap, tVar, f1Var));
        mVar.b();
        return hashMap;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void n(m mVar, Map map, Cursor cursor) {
        r(mVar, map, cursor, (t<s, Boolean>) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o(m mVar, Map map, t tVar, f1 f1Var, Cursor cursor) {
        r(mVar, map, cursor, tVar);
        if (f1Var != null) {
            f1Var.b();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean p(a1 a1Var, Set set, s sVar) {
        return Boolean.valueOf(a1Var.u(sVar) || set.contains(sVar.getKey()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q(byte[] bArr, int i10, int i11, t tVar, Map map) {
        s k10 = k(bArr, i10, i11);
        if (tVar == null || ((Boolean) tVar.apply(k10)).booleanValue()) {
            synchronized (map) {
                map.put(k10.getKey(), k10);
            }
        }
    }

    private void r(m mVar, Map<l, s> map, Cursor cursor, t<s, Boolean> tVar) {
        byte[] blob = cursor.getBlob(0);
        int i10 = cursor.getInt(1);
        int i11 = cursor.getInt(2);
        Executor executor = mVar;
        if (cursor.isLast()) {
            executor = p.f31400b;
        }
        executor.execute(new c3(this, blob, i10, i11, tVar, map));
    }

    public Map<l, s> a(a1 a1Var, q.a aVar, Set<l> set, f1 f1Var) {
        return m(Collections.singletonList(a1Var.n()), aVar, a.e.API_PRIORITY_OTHER, new f3(a1Var, set), f1Var);
    }

    public s b(l lVar) {
        return d(Collections.singletonList(lVar)).get(lVar);
    }

    public Map<l, s> c(String str, q.a aVar, int i10) {
        List<u> g10 = this.f30422c.g(str);
        ArrayList arrayList = new ArrayList(g10.size());
        for (u a10 : g10) {
            arrayList.add((u) a10.a(str));
        }
        if (arrayList.isEmpty()) {
            return Collections.emptyMap();
        }
        if (arrayList.size() * 9 < 900) {
            return l(arrayList, aVar, i10, (t<s, Boolean>) null);
        }
        HashMap hashMap = new HashMap();
        int i11 = 0;
        while (i11 < arrayList.size()) {
            int i12 = i11 + 100;
            hashMap.putAll(l(arrayList.subList(i11, Math.min(arrayList.size(), i12)), aVar, i10, (t<s, Boolean>) null));
            i11 = i12;
        }
        return g0.u(hashMap, i10, q.a.f30628b);
    }

    public Map<l, s> d(Iterable<l> iterable) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (l next : iterable) {
            arrayList.add(f.c(next.l()));
            hashMap.put(next, s.o(next));
        }
        a3.b bVar = new a3.b(this.f30420a, "SELECT contents, read_time_seconds, read_time_nanos FROM remote_documents WHERE path IN (", arrayList, ") ORDER BY path");
        m mVar = new m();
        while (bVar.d()) {
            bVar.e().e(new d3(this, mVar, hashMap));
        }
        mVar.b();
        return hashMap;
    }

    public void e(l lVar) {
        this.f30422c = lVar;
    }

    public void f(s sVar, w wVar) {
        b.d(!wVar.equals(w.f30653b), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        l key = sVar.getKey();
        y6.q c10 = wVar.c();
        w7.a m10 = this.f30421b.m(sVar);
        this.f30420a.v("INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, contents) VALUES (?, ?, ?, ?, ?)", f.c(key.l()), Integer.valueOf(key.l().k()), Long.valueOf(c10.d()), Integer.valueOf(c10.c()), m10.i());
        this.f30422c.m(sVar.getKey().j());
    }

    public void removeAll(Collection<l> collection) {
        if (!collection.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            c<l, i> a10 = j.a();
            for (l next : collection) {
                arrayList.add(f.c(next.l()));
                a10 = a10.h(next, s.p(next, w.f30653b));
            }
            a3.b bVar = new a3.b(this.f30420a, "DELETE FROM remote_documents WHERE path IN (", arrayList, ")");
            while (bVar.d()) {
                bVar.a();
            }
            this.f30422c.c(a10);
        }
    }
}
