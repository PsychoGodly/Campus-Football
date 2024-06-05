package t7;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.applovin.mediation.MaxReward;
import com.google.protobuf.e0;
import com.google.protobuf.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p7.j;
import t7.a3;
import u7.l;
import v7.f;
import v7.g;
import w7.e;
import x7.a1;
import y6.q;
import y7.b;
import y7.n;
import y7.x;

/* compiled from: SQLiteMutationQueue */
final class t2 implements b1 {

    /* renamed from: a  reason: collision with root package name */
    private final a3 f30521a;

    /* renamed from: b  reason: collision with root package name */
    private final o f30522b;

    /* renamed from: c  reason: collision with root package name */
    private final l f30523c;

    /* renamed from: d  reason: collision with root package name */
    private final String f30524d;

    /* renamed from: e  reason: collision with root package name */
    private int f30525e;

    /* renamed from: f  reason: collision with root package name */
    private i f30526f;

    /* compiled from: SQLiteMutationQueue */
    private static class a implements n<Cursor> {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayList<i> f30527a = new ArrayList<>();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f30528b = true;

        a(byte[] bArr) {
            c(bArr);
        }

        private void c(byte[] bArr) {
            this.f30527a.add(i.o(bArr));
        }

        /* renamed from: a */
        public void accept(Cursor cursor) {
            byte[] blob = cursor.getBlob(0);
            c(blob);
            if (blob.length < 1000000) {
                this.f30528b = false;
            }
        }

        /* access modifiers changed from: package-private */
        public int d() {
            return this.f30527a.size();
        }

        /* access modifiers changed from: package-private */
        public i e() {
            return i.n(this.f30527a);
        }
    }

    t2(a3 a3Var, o oVar, j jVar, l lVar) {
        this.f30521a = a3Var;
        this.f30522b = oVar;
        this.f30524d = jVar.b() ? jVar.a() : MaxReward.DEFAULT_LABEL;
        this.f30526f = a1.f31013v;
        this.f30523c = lVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ g B(Cursor cursor) {
        return v(cursor.getInt(0), cursor.getBlob(1));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void D(Cursor cursor) {
        this.f30525e = Math.max(this.f30525e, cursor.getInt(0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ g E(int i10, Cursor cursor) {
        return v(i10, cursor.getBlob(0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G(Cursor cursor) {
        this.f30526f = i.o(cursor.getBlob(0));
    }

    private void H() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f30521a.E("SELECT uid FROM mutation_queues").e(new l2(arrayList));
        this.f30525e = 0;
        for (String str : arrayList) {
            this.f30521a.E("SELECT MAX(batch_id) FROM mutations WHERE uid = ?").b(str).e(new m2(this));
        }
        this.f30525e++;
    }

    private void I() {
        this.f30521a.v("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", this.f30524d, -1, this.f30526f.J());
    }

    private g v(int i10, byte[] bArr) {
        try {
            if (bArr.length < 1000000) {
                return this.f30522b.f(e.v0(bArr));
            }
            a aVar = new a(bArr);
            while (aVar.f30528b) {
                this.f30521a.E("SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?").b(Integer.valueOf((aVar.d() * 1000000) + 1), 1000000, this.f30524d, Integer.valueOf(i10)).c(aVar);
            }
            return this.f30522b.f(e.u0(aVar.e()));
        } catch (e0 e10) {
            throw b.a("MutationBatch failed to parse: %s", e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x(List list, Cursor cursor) {
        list.add(v(cursor.getInt(0), cursor.getBlob(1)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y(Set set, List list, Cursor cursor) {
        int i10 = cursor.getInt(0);
        if (!set.contains(Integer.valueOf(i10))) {
            set.add(Integer.valueOf(i10));
            list.add(v(i10, cursor.getBlob(1)));
        }
    }

    public void a() {
        if (w()) {
            ArrayList arrayList = new ArrayList();
            this.f30521a.E("SELECT path FROM document_mutations WHERE uid = ?").b(this.f30524d).e(new k2(arrayList));
            b.d(arrayList.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s", arrayList);
        }
    }

    public List<g> b(Iterable<l> iterable) {
        ArrayList arrayList = new ArrayList();
        for (l l10 : iterable) {
            arrayList.add(f.c(l10.l()));
        }
        a3.b bVar = new a3.b(this.f30521a, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(new Object[]{1000000, this.f30524d}), arrayList, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        while (bVar.d()) {
            bVar.e().e(new p2(this, hashSet, arrayList2));
        }
        if (bVar.c() > 1) {
            Collections.sort(arrayList2, j2.f38444a);
        }
        return arrayList2;
    }

    public void c(g gVar, i iVar) {
        this.f30526f = (i) x.b(iVar);
        I();
    }

    public void d(i iVar) {
        this.f30526f = (i) x.b(iVar);
        I();
    }

    public g e(int i10) {
        return (g) this.f30521a.E("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1").b(1000000, this.f30524d, Integer.valueOf(i10 + 1)).d(new q2(this));
    }

    public int f() {
        return ((Integer) this.f30521a.E("SELECT IFNULL(MAX(batch_id), ?) FROM mutations WHERE uid = ?").b(-1, this.f30524d).d(s2.f38497a)).intValue();
    }

    public g g(int i10) {
        return (g) this.f30521a.E("SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?").b(1000000, this.f30524d, Integer.valueOf(i10)).d(new r2(this, i10));
    }

    public i h() {
        return this.f30526f;
    }

    public void i(g gVar) {
        SQLiteStatement D = this.f30521a.D("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        SQLiteStatement D2 = this.f30521a.D("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
        int e10 = gVar.e();
        b.d(this.f30521a.u(D, this.f30524d, Integer.valueOf(e10)) != 0, "Mutation batch (%s, %d) did not exist", this.f30524d, Integer.valueOf(gVar.e()));
        for (f g10 : gVar.h()) {
            l g11 = g10.g();
            this.f30521a.u(D2, this.f30524d, f.c(g11.l()), Integer.valueOf(e10));
            this.f30521a.f().l(g11);
        }
    }

    public g j(q qVar, List<f> list, List<f> list2) {
        int i10 = this.f30525e;
        this.f30525e = i10 + 1;
        g gVar = new g(i10, qVar, list, list2);
        e o10 = this.f30522b.o(gVar);
        this.f30521a.v("INSERT INTO mutations (uid, batch_id, mutations) VALUES (?, ?, ?)", this.f30524d, Integer.valueOf(i10), o10.i());
        HashSet hashSet = new HashSet();
        SQLiteStatement D = this.f30521a.D("INSERT INTO document_mutations (uid, path, batch_id) VALUES (?, ?, ?)");
        for (f g10 : list2) {
            l g11 = g10.g();
            if (hashSet.add(g11)) {
                String c10 = f.c(g11.l());
                this.f30521a.u(D, this.f30524d, c10, Integer.valueOf(i10));
                this.f30523c.m(g11.j());
            }
        }
        return gVar;
    }

    public List<g> k() {
        ArrayList arrayList = new ArrayList();
        this.f30521a.E("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC").b(1000000, this.f30524d).e(new o2(this, arrayList));
        return arrayList;
    }

    public void start() {
        H();
        if (this.f30521a.E("SELECT last_stream_token FROM mutation_queues WHERE uid = ?").b(this.f30524d).c(new n2(this)) == 0) {
            I();
        }
    }

    public boolean w() {
        return this.f30521a.E("SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1").b(this.f30524d).f();
    }
}
