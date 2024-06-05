package t7;

import android.database.Cursor;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import r7.u0;
import t7.o0;
import u7.l;
import y7.b;
import y7.n;

/* compiled from: SQLiteLruReferenceDelegate */
class i2 implements j1, k0 {

    /* renamed from: a  reason: collision with root package name */
    private final a3 f30448a;

    /* renamed from: b  reason: collision with root package name */
    private u0 f30449b;

    /* renamed from: c  reason: collision with root package name */
    private long f30450c = -1;

    /* renamed from: d  reason: collision with root package name */
    private final o0 f30451d;

    /* renamed from: e  reason: collision with root package name */
    private k1 f30452e;

    i2(a3 a3Var, o0.b bVar) {
        this.f30448a = a3Var;
        this.f30451d = new o0(this, bVar);
    }

    private void A(l lVar) {
        String c10 = f.c(lVar.l());
        this.f30448a.v("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", c10, Long.valueOf(k()));
    }

    private boolean t(l lVar) {
        if (this.f30452e.c(lVar)) {
            return true;
        }
        return x(lVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w(int[] iArr, List list, Cursor cursor) {
        l g10 = l.g(f.b(cursor.getString(0)));
        if (!t(g10)) {
            iArr[0] = iArr[0] + 1;
            list.add(g10);
            y(g10);
        }
    }

    private boolean x(l lVar) {
        return !this.f30448a.E("SELECT 1 FROM document_mutations WHERE path = ?").b(f.c(lVar.l())).f();
    }

    private void y(l lVar) {
        this.f30448a.v("DELETE FROM target_documents WHERE path = ? AND target_id = 0", f.c(lVar.l()));
    }

    public int a(long j10, SparseArray<?> sparseArray) {
        return this.f30448a.h().y(j10, sparseArray);
    }

    public void b(n<i4> nVar) {
        this.f30448a.h().q(nVar);
    }

    public void c(l lVar) {
        A(lVar);
    }

    public void d(k1 k1Var) {
        this.f30452e = k1Var;
    }

    public void e() {
        b.d(this.f30450c != -1, "Committing a transaction without having started one", new Object[0]);
        this.f30450c = -1;
    }

    public o0 f() {
        return this.f30451d;
    }

    public void g() {
        b.d(this.f30450c == -1, "Starting a transaction without committing the previous one", new Object[0]);
        this.f30450c = this.f30449b.a();
    }

    public void h(i4 i4Var) {
        this.f30448a.h().i(i4Var.l(k()));
    }

    public void i(l lVar) {
        A(lVar);
    }

    public void j(l lVar) {
        A(lVar);
    }

    public long k() {
        b.d(this.f30450c != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f30450c;
    }

    public void l(l lVar) {
        A(lVar);
    }

    public long m() {
        return this.f30448a.h().s() + ((Long) this.f30448a.E("SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)").d(h2.f38439a)).longValue();
    }

    public int n(long j10) {
        int[] iArr = new int[1];
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean z10 = true;
            while (true) {
                if (z10) {
                    if (this.f30448a.E("select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? LIMIT ?").b(Long.valueOf(j10), 100).e(new f2(this, iArr, arrayList)) != 100) {
                        z10 = false;
                    }
                } else {
                    this.f30448a.g().removeAll(arrayList);
                    return iArr[0];
                }
            }
        }
    }

    public long o() {
        return this.f30448a.w();
    }

    public void p(n<Long> nVar) {
        this.f30448a.E("select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0").e(new g2(nVar));
    }

    /* access modifiers changed from: package-private */
    public void z(long j10) {
        this.f30449b = new u0(j10);
    }
}
