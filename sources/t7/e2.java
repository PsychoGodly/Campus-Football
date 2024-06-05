package t7;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.applovin.mediation.MaxReward;
import com.google.protobuf.e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;
import n8.a;
import p7.j;
import p8.d0;
import r7.f1;
import r7.k;
import r7.p;
import r7.z0;
import s7.c;
import s7.d;
import s7.e;
import t7.a3;
import t7.l;
import t7.t0;
import u7.i;
import u7.l;
import u7.q;
import u7.r;
import u7.u;
import u7.y;
import u7.z;
import y7.b;
import y7.g0;
import y7.v;
import y7.w;

/* compiled from: SQLiteIndexManager */
final class e2 implements l {

    /* renamed from: k  reason: collision with root package name */
    private static final String f30393k = "e2";

    /* renamed from: l  reason: collision with root package name */
    private static final byte[] f30394l = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private final a3 f30395a;

    /* renamed from: b  reason: collision with root package name */
    private final o f30396b;

    /* renamed from: c  reason: collision with root package name */
    private final String f30397c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<f1, List<f1>> f30398d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final t0.a f30399e = new t0.a();

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Map<Integer, q>> f30400f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final Queue<q> f30401g = new PriorityQueue(10, w1.f38522a);

    /* renamed from: h  reason: collision with root package name */
    private boolean f30402h = false;

    /* renamed from: i  reason: collision with root package name */
    private int f30403i = -1;

    /* renamed from: j  reason: collision with root package name */
    private long f30404j = -1;

    e2(a3 a3Var, o oVar, j jVar) {
        this.f30395a = a3Var;
        this.f30396b = oVar;
        this.f30397c = jVar.b() ? jVar.a() : MaxReward.DEFAULT_LABEL;
    }

    private byte[] A(q qVar) {
        return this.f30396b.l(qVar.h()).i();
    }

    private byte[] B(d0 d0Var) {
        d dVar = new d();
        c.f30294a.e(d0Var, dVar.b(q.c.a.ASCENDING));
        return dVar.c();
    }

    private Object[] C(q qVar, f1 f1Var, Collection<d0> collection) {
        if (collection == null) {
            return null;
        }
        List<d> arrayList = new ArrayList<>();
        arrayList.add(new d());
        Iterator<d0> it = collection.iterator();
        for (q.c next : qVar.e()) {
            d0 next2 = it.next();
            for (d dVar : arrayList) {
                if (!M(f1Var, next.d()) || !z.t(next2)) {
                    c.f30294a.e(next2, dVar.b(next.e()));
                } else {
                    arrayList = D(arrayList, next, next2);
                }
            }
        }
        return G(arrayList);
    }

    private List<d> D(List<d> list, q.c cVar, d0 d0Var) {
        ArrayList<d> arrayList = new ArrayList<>(list);
        ArrayList arrayList2 = new ArrayList();
        for (d0 next : d0Var.q0().g()) {
            for (d c10 : arrayList) {
                d dVar = new d();
                dVar.d(c10.c());
                c.f30294a.e(next, dVar.b(cVar.e()));
                arrayList2.add(dVar);
            }
        }
        return arrayList2;
    }

    private Object[] E(int i10, int i11, List<d0> list, Object[] objArr, Object[] objArr2, Object[] objArr3) {
        byte[] bArr;
        int size = i10 / (list != null ? list.size() : 1);
        int i12 = 0;
        Object[] objArr4 = new Object[((i10 * 5) + (objArr3 != null ? objArr3.length : 0))];
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            int i15 = i14 + 1;
            objArr4[i14] = Integer.valueOf(i11);
            int i16 = i15 + 1;
            objArr4[i15] = this.f30397c;
            int i17 = i16 + 1;
            if (list != null) {
                bArr = B(list.get(i13 / size));
            } else {
                bArr = f30394l;
            }
            objArr4[i16] = bArr;
            int i18 = i17 + 1;
            int i19 = i13 % size;
            objArr4[i17] = objArr[i19];
            objArr4[i18] = objArr2[i19];
            i13++;
            i14 = i18 + 1;
        }
        if (objArr3 != null) {
            int length = objArr3.length;
            while (i12 < length) {
                objArr4[i14] = objArr3[i12];
                i12++;
                i14++;
            }
        }
        return objArr4;
    }

    private Object[] F(f1 f1Var, int i10, List<d0> list, Object[] objArr, String str, Object[] objArr2, String str2, Object[] objArr3) {
        StringBuilder sb2;
        Object[] objArr4 = objArr3;
        int max = Math.max(objArr.length, objArr2.length) * (list != null ? list.size() : 1);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("SELECT document_key, directional_value FROM index_entries ");
        sb3.append("WHERE index_id = ? AND uid = ? ");
        sb3.append("AND array_value = ? ");
        sb3.append("AND directional_value ");
        String str3 = str;
        sb3.append(str);
        sb3.append(" ? ");
        sb3.append("AND directional_value ");
        String str4 = str2;
        sb3.append(str2);
        sb3.append(" ? ");
        StringBuilder z10 = g0.z(sb3, max, " UNION ");
        if (objArr4 != null) {
            StringBuilder sb4 = new StringBuilder("SELECT document_key, directional_value FROM (");
            sb4.append(z10);
            sb4.append(") WHERE directional_value NOT IN (");
            sb4.append(g0.z("?", objArr4.length, ", "));
            sb4.append(")");
            sb2 = sb4;
        } else {
            sb2 = z10;
        }
        Object[] E = E(max, i10, list, objArr, objArr2, objArr3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(sb2.toString());
        arrayList.addAll(Arrays.asList(E));
        return arrayList.toArray();
    }

    private Object[] G(List<d> list) {
        Object[] objArr = new Object[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            objArr[i10] = list.get(i10).c();
        }
        return objArr;
    }

    private SortedSet<e> H(l lVar, q qVar) {
        TreeSet treeSet = new TreeSet();
        this.f30395a.E("SELECT array_value, directional_value FROM index_entries WHERE index_id = ? AND document_key = ? AND uid = ?").b(Integer.valueOf(qVar.f()), lVar.toString(), this.f30397c).e(new a2(treeSet, qVar, lVar));
        return treeSet;
    }

    private q I(f1 f1Var) {
        String str;
        b.d(this.f30402h, "IndexManager not started", new Object[0]);
        y yVar = new y(f1Var);
        if (f1Var.d() != null) {
            str = f1Var.d();
        } else {
            str = f1Var.n().g();
        }
        Collection<q> J = J(str);
        q qVar = null;
        if (J.isEmpty()) {
            return null;
        }
        for (q next : J) {
            if (yVar.h(next) && (qVar == null || next.h().size() > qVar.h().size())) {
                qVar = next;
            }
        }
        return qVar;
    }

    private q.a K(Collection<q> collection) {
        b.d(!collection.isEmpty(), "Found empty index group when looking for least recent index offset.", new Object[0]);
        Iterator<q> it = collection.iterator();
        q.a c10 = it.next().g().c();
        int h10 = c10.h();
        while (it.hasNext()) {
            q.a c11 = it.next().g().c();
            if (c11.compareTo(c10) < 0) {
                c10 = c11;
            }
            h10 = Math.max(c11.h(), h10);
        }
        return q.a.d(c10.i(), c10.g(), h10);
    }

    private List<f1> L(f1 f1Var) {
        if (this.f30398d.containsKey(f1Var)) {
            return this.f30398d.get(f1Var);
        }
        ArrayList arrayList = new ArrayList();
        if (f1Var.h().isEmpty()) {
            arrayList.add(f1Var);
        } else {
            for (r7.q b10 : w.i(new k(f1Var.h(), k.a.AND))) {
                arrayList.add(new f1(f1Var.n(), f1Var.d(), b10.b(), f1Var.m(), f1Var.j(), f1Var.p(), f1Var.f()));
            }
        }
        this.f30398d.put(f1Var, arrayList);
        return arrayList;
    }

    private boolean M(f1 f1Var, r rVar) {
        for (r7.q next : f1Var.h()) {
            if (next instanceof p) {
                p pVar = (p) next;
                if (pVar.f().equals(rVar)) {
                    p.b g10 = pVar.g();
                    if (g10.equals(p.b.IN) || g10.equals(p.b.NOT_IN)) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int Q(q qVar, q qVar2) {
        int compare = Long.compare(qVar.g().d(), qVar2.g().d());
        return compare == 0 ? qVar.d().compareTo(qVar2.d()) : compare;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void S(Map map, Cursor cursor) {
        q.b bVar;
        try {
            int i10 = cursor.getInt(0);
            String string = cursor.getString(1);
            List<q.c> c10 = this.f30396b.c(a.l0(cursor.getBlob(2)));
            if (map.containsKey(Integer.valueOf(i10))) {
                bVar = (q.b) map.get(Integer.valueOf(i10));
            } else {
                bVar = q.f30625a;
            }
            V(q.b(i10, string, c10, bVar));
        } catch (e0 e10) {
            throw b.a("Failed to decode index: " + e10, new Object[0]);
        }
    }

    private void V(q qVar) {
        Map map = this.f30400f.get(qVar.d());
        if (map == null) {
            map = new HashMap();
            this.f30400f.put(qVar.d(), map);
        }
        q qVar2 = (q) map.get(Integer.valueOf(qVar.f()));
        if (qVar2 != null) {
            this.f30401g.remove(qVar2);
        }
        map.put(Integer.valueOf(qVar.f()), qVar);
        this.f30401g.add(qVar);
        this.f30403i = Math.max(this.f30403i, qVar.f());
        this.f30404j = Math.max(this.f30404j, qVar.g().d());
    }

    private void W(i iVar, SortedSet<e> sortedSet, SortedSet<e> sortedSet2) {
        v.a(f30393k, "Updating index entries for document '%s'", iVar.getKey());
        g0.s(sortedSet, sortedSet2, new d2(this, iVar), new c2(this, iVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void T(i iVar, e eVar) {
        this.f30395a.v("INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)", Integer.valueOf(eVar.g()), this.f30397c, eVar.d(), eVar.e(), iVar.getKey().toString());
    }

    private SortedSet<e> w(i iVar, q qVar) {
        TreeSet treeSet = new TreeSet();
        byte[] z10 = z(qVar, iVar);
        if (z10 == null) {
            return treeSet;
        }
        q.c c10 = qVar.c();
        if (c10 != null) {
            d0 h10 = iVar.h(c10.d());
            if (z.t(h10)) {
                for (d0 B : h10.q0().g()) {
                    treeSet.add(e.c(qVar.f(), iVar.getKey(), B(B), z10));
                }
            }
        } else {
            treeSet.add(e.c(qVar.f(), iVar.getKey(), new byte[0], z10));
        }
        return treeSet;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void U(i iVar, e eVar) {
        this.f30395a.v("DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?", Integer.valueOf(eVar.g()), this.f30397c, eVar.d(), eVar.e(), iVar.getKey().toString());
    }

    private Object[] y(q qVar, f1 f1Var, r7.i iVar) {
        return C(qVar, f1Var, iVar.b());
    }

    private byte[] z(q qVar, i iVar) {
        d dVar = new d();
        for (q.c next : qVar.e()) {
            d0 h10 = iVar.h(next.d());
            if (h10 == null) {
                return null;
            }
            c.f30294a.e(h10, dVar.b(next.e()));
        }
        return dVar.c();
    }

    public Collection<q> J(String str) {
        b.d(this.f30402h, "IndexManager not started", new Object[0]);
        Map map = this.f30400f.get(str);
        return map == null ? Collections.emptyList() : map.values();
    }

    public List<l> a(f1 f1Var) {
        b.d(this.f30402h, "IndexManager not started", new Object[0]);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<Pair> arrayList3 = new ArrayList<>();
        for (f1 next : L(f1Var)) {
            q I = I(next);
            if (I == null) {
                return null;
            }
            arrayList3.add(Pair.create(next, I));
        }
        for (Pair pair : arrayList3) {
            f1 f1Var2 = (f1) pair.first;
            q qVar = (q) pair.second;
            List<d0> a10 = f1Var2.a(qVar);
            Collection<d0> l10 = f1Var2.l(qVar);
            r7.i k10 = f1Var2.k(qVar);
            r7.i q10 = f1Var2.q(qVar);
            if (v.c()) {
                v.a(f30393k, "Using index '%s' to execute '%s' (Arrays: %s, Lower bound: %s, Upper bound: %s)", qVar, f1Var2, a10, k10, q10);
            }
            Object[] F = F(f1Var2, qVar.f(), a10, y(qVar, f1Var2, k10), k10.c() ? ">=" : ">", y(qVar, f1Var2, q10), q10.c() ? "<=" : "<", C(qVar, f1Var2, l10));
            arrayList.add(String.valueOf(F[0]));
            arrayList2.addAll(Arrays.asList(F).subList(1, F.length));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(TextUtils.join(" UNION ", arrayList));
        sb2.append("ORDER BY directional_value, document_key ");
        sb2.append(f1Var.i().equals(z0.a.ASCENDING) ? "asc " : "desc ");
        String str = "SELECT DISTINCT document_key FROM (" + sb2.toString() + ")";
        if (f1Var.r()) {
            str = str + " LIMIT " + f1Var.j();
        }
        b.d(arrayList2.size() < 1000, "Cannot perform query with more than 999 bind elements", new Object[0]);
        a3.d b10 = this.f30395a.E(str).b(arrayList2.toArray());
        ArrayList arrayList4 = new ArrayList();
        b10.e(new y1(arrayList4));
        v.a(f30393k, "Index scan returned %s documents", Integer.valueOf(arrayList4.size()));
        return arrayList4;
    }

    public void b(q qVar) {
        b.d(this.f30402h, "IndexManager not started", new Object[0]);
        int i10 = this.f30403i + 1;
        q b10 = q.b(i10, qVar.d(), qVar.h(), qVar.g());
        this.f30395a.v("INSERT INTO index_configuration (index_id, collection_group, index_proto) VALUES(?, ?, ?)", Integer.valueOf(i10), b10.d(), A(b10));
        V(b10);
    }

    public void c(g7.c<l, i> cVar) {
        b.d(this.f30402h, "IndexManager not started", new Object[0]);
        Iterator<Map.Entry<l, i>> it = cVar.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            for (q next2 : J(((l) next.getKey()).i())) {
                SortedSet<e> H = H((l) next.getKey(), next2);
                SortedSet<e> w10 = w((i) next.getValue(), next2);
                if (!H.equals(w10)) {
                    W((i) next.getValue(), H, w10);
                }
            }
        }
    }

    public void d(f1 f1Var) {
        q b10;
        b.d(this.f30402h, "IndexManager not started", new Object[0]);
        for (f1 next : L(f1Var)) {
            l.a l10 = l(next);
            if ((l10 == l.a.NONE || l10 == l.a.PARTIAL) && (b10 = new y(next).b()) != null) {
                b(b10);
            }
        }
    }

    public Collection<q> e() {
        ArrayList arrayList = new ArrayList();
        for (Map<Integer, q> values : this.f30400f.values()) {
            arrayList.addAll(values.values());
        }
        return arrayList;
    }

    public String f() {
        b.d(this.f30402h, "IndexManager not started", new Object[0]);
        q peek = this.f30401g.peek();
        if (peek != null) {
            return peek.d();
        }
        return null;
    }

    public List<u> g(String str) {
        b.d(this.f30402h, "IndexManager not started", new Object[0]);
        ArrayList arrayList = new ArrayList();
        this.f30395a.E("SELECT parent FROM collection_parents WHERE collection_id = ?").b(str).e(new x1(arrayList));
        return arrayList;
    }

    public void h(String str, q.a aVar) {
        b.d(this.f30402h, "IndexManager not started", new Object[0]);
        this.f30404j++;
        for (q next : J(str)) {
            q b10 = q.b(next.f(), next.d(), next.h(), q.b.a(this.f30404j, aVar));
            this.f30395a.v("REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(next.f()), this.f30397c, Long.valueOf(this.f30404j), Long.valueOf(aVar.i().c().d()), Integer.valueOf(aVar.i().c().c()), f.c(aVar.g().l()), Integer.valueOf(aVar.h()));
            V(b10);
        }
    }

    public q.a i(String str) {
        Collection<q> J = J(str);
        b.d(!J.isEmpty(), "minOffset was called for collection without indexes", new Object[0]);
        return K(J);
    }

    public q.a j(f1 f1Var) {
        ArrayList arrayList = new ArrayList();
        for (f1 I : L(f1Var)) {
            q I2 = I(I);
            if (I2 != null) {
                arrayList.add(I2);
            }
        }
        return K(arrayList);
    }

    public void k(q qVar) {
        this.f30395a.v("DELETE FROM index_configuration WHERE index_id = ?", Integer.valueOf(qVar.f()));
        this.f30395a.v("DELETE FROM index_entries WHERE index_id = ?", Integer.valueOf(qVar.f()));
        this.f30395a.v("DELETE FROM index_state WHERE index_id = ?", Integer.valueOf(qVar.f()));
        this.f30401g.remove(qVar);
        Map map = this.f30400f.get(qVar.d());
        if (map != null) {
            map.remove(Integer.valueOf(qVar.f()));
        }
    }

    public l.a l(f1 f1Var) {
        l.a aVar = l.a.FULL;
        List<f1> L = L(f1Var);
        Iterator<f1> it = L.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            f1 next = it.next();
            q I = I(next);
            if (I == null) {
                aVar = l.a.NONE;
                break;
            } else if (I.h().size() < next.o()) {
                aVar = l.a.PARTIAL;
            }
        }
        return (!f1Var.r() || L.size() <= 1 || aVar != l.a.FULL) ? aVar : l.a.PARTIAL;
    }

    public void m(u uVar) {
        b.d(this.f30402h, "IndexManager not started", new Object[0]);
        b.d(uVar.k() % 2 == 1, "Expected a collection path.", new Object[0]);
        if (this.f30399e.a(uVar)) {
            this.f30395a.v("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)", uVar.g(), f.c((u) uVar.m()));
        }
    }

    public void start() {
        HashMap hashMap = new HashMap();
        this.f30395a.E("SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?").b(this.f30397c).e(new z1(hashMap));
        this.f30395a.E("SELECT index_id, collection_group, index_proto FROM index_configuration").e(new b2(this, hashMap));
        this.f30402h = true;
    }
}
