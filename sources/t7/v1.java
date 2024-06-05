package t7;

import android.database.Cursor;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import p7.j;
import p8.e0;
import t7.a3;
import u7.l;
import u7.u;
import v7.f;
import v7.k;
import y7.b;
import y7.m;
import y7.p;
import y7.x;

/* compiled from: SQLiteDocumentOverlayCache */
public class v1 implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a3 f30536a;

    /* renamed from: b  reason: collision with root package name */
    private final o f30537b;

    /* renamed from: c  reason: collision with root package name */
    private final String f30538c;

    public v1(a3 a3Var, o oVar, j jVar) {
        this.f30536a = a3Var;
        this.f30537b = oVar;
        this.f30538c = jVar.b() ? jVar.a() : MaxReward.DEFAULT_LABEL;
    }

    private k m(byte[] bArr, int i10) {
        try {
            return k.a(i10, this.f30537b.e(e0.B0(bArr)));
        } catch (com.google.protobuf.e0 e10) {
            throw b.a("Overlay failed to parse: %s", e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ k n(Cursor cursor) {
        return m(cursor.getBlob(0), cursor.getInt(1));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void p(int[] iArr, String[] strArr, String[] strArr2, m mVar, Map map, Cursor cursor) {
        iArr[0] = cursor.getInt(1);
        strArr[0] = cursor.getString(2);
        strArr2[0] = cursor.getString(3);
        s(mVar, map, cursor);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r(byte[] bArr, int i10, Map map) {
        k m10 = m(bArr, i10);
        synchronized (map) {
            map.put(m10.b(), m10);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void s(m mVar, Map<l, k> map, Cursor cursor) {
        byte[] blob = cursor.getBlob(0);
        int i10 = cursor.getInt(1);
        Executor executor = mVar;
        if (cursor.isLast()) {
            executor = p.f31400b;
        }
        executor.execute(new p1(this, blob, i10, map));
    }

    private void u(Map<l, k> map, m mVar, u uVar, List<Object> list) {
        if (!list.isEmpty()) {
            a3.b bVar = new a3.b(this.f30536a, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id IN (", Arrays.asList(new Object[]{this.f30538c, f.c(uVar)}), list, ")");
            while (bVar.d()) {
                bVar.e().e(new s1(this, mVar, map));
            }
        }
    }

    private void v(int i10, l lVar, f fVar) {
        String i11 = lVar.i();
        String c10 = f.c((u) lVar.l().m());
        String g10 = lVar.l().g();
        this.f30536a.v("INSERT OR REPLACE INTO document_overlays (uid, collection_group, collection_path, document_id, largest_batch_id, overlay_mutation) VALUES (?, ?, ?, ?, ?, ?)", this.f30538c, i11, c10, g10, Integer.valueOf(i10), this.f30537b.n(fVar).i());
    }

    public Map<l, k> a(u uVar, int i10) {
        HashMap hashMap = new HashMap();
        m mVar = new m();
        this.f30536a.E("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND largest_batch_id > ?").b(this.f30538c, f.c(uVar), Integer.valueOf(i10)).e(new q1(this, mVar, hashMap));
        mVar.b();
        return hashMap;
    }

    public k b(l lVar) {
        String c10 = f.c((u) lVar.l().m());
        String g10 = lVar.l().g();
        return (k) this.f30536a.E("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id = ?").b(this.f30538c, c10, g10).d(new u1(this));
    }

    public Map<l, k> c(SortedSet<l> sortedSet) {
        b.d(sortedSet.comparator() == null, "getOverlays() requires natural order", new Object[0]);
        HashMap hashMap = new HashMap();
        m mVar = new m();
        u uVar = u.f30652b;
        ArrayList arrayList = new ArrayList();
        for (l lVar : sortedSet) {
            if (!uVar.equals(lVar.j())) {
                u(hashMap, mVar, uVar, arrayList);
                uVar = lVar.j();
                arrayList.clear();
            }
            arrayList.add(lVar.k());
        }
        u(hashMap, mVar, uVar, arrayList);
        mVar.b();
        return hashMap;
    }

    public void d(int i10) {
        this.f30536a.v("DELETE FROM document_overlays WHERE uid = ? AND largest_batch_id = ?", this.f30538c, Integer.valueOf(i10));
    }

    public void e(int i10, Map<l, f> map) {
        for (Map.Entry next : map.entrySet()) {
            l lVar = (l) next.getKey();
            v(i10, lVar, (f) x.d((f) next.getValue(), "null value for key: %s", lVar));
        }
    }

    public Map<l, k> f(String str, int i10, int i11) {
        HashMap hashMap = new HashMap();
        String[] strArr = new String[1];
        String[] strArr2 = new String[1];
        int[] iArr = new int[1];
        m mVar = new m();
        t1 t1Var = r0;
        t1 t1Var2 = new t1(this, iArr, strArr, strArr2, mVar, hashMap);
        this.f30536a.E("SELECT overlay_mutation, largest_batch_id, collection_path, document_id  FROM document_overlays WHERE uid = ? AND collection_group = ? AND largest_batch_id > ? ORDER BY largest_batch_id, collection_path, document_id LIMIT ?").b(this.f30538c, str, Integer.valueOf(i10), Integer.valueOf(i11)).e(t1Var);
        if (strArr[0] == null) {
            return hashMap;
        }
        this.f30536a.E("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_group = ? AND (collection_path > ? OR (collection_path = ? AND document_id > ?)) AND largest_batch_id = ?").b(this.f30538c, str, strArr[0], strArr[0], strArr2[0], Integer.valueOf(iArr[0])).e(new r1(this, mVar, hashMap));
        mVar.b();
        return hashMap;
    }
}
