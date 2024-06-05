package t7;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.util.SparseArray;
import com.google.protobuf.e0;
import g7.e;
import java.util.Iterator;
import r7.f1;
import u7.l;
import u7.w;
import y6.q;
import y7.n;

/* compiled from: SQLiteTargetCache */
final class f4 implements h4 {

    /* renamed from: a  reason: collision with root package name */
    private final a3 f30406a;

    /* renamed from: b  reason: collision with root package name */
    private final o f30407b;

    /* renamed from: c  reason: collision with root package name */
    private int f30408c;

    /* renamed from: d  reason: collision with root package name */
    private long f30409d;

    /* renamed from: e  reason: collision with root package name */
    private w f30410e = w.f30653b;

    /* renamed from: f  reason: collision with root package name */
    private long f30411f;

    /* compiled from: SQLiteTargetCache */
    private static class b {
        /* access modifiers changed from: package-private */

        /* renamed from: a  reason: collision with root package name */
        public e<l> f30412a;

        private b() {
            this.f30412a = l.e();
        }
    }

    /* compiled from: SQLiteTargetCache */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        i4 f30413a;

        private c() {
        }
    }

    f4(a3 a3Var, o oVar) {
        this.f30406a = a3Var;
        this.f30407b = oVar;
    }

    private void A(i4 i4Var) {
        int h10 = i4Var.h();
        String c10 = i4Var.g().c();
        q c11 = i4Var.f().c();
        w7.c q10 = this.f30407b.q(i4Var);
        this.f30406a.v("INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(h10), c10, Long.valueOf(c11.d()), Integer.valueOf(c11.c()), i4Var.d().J(), Long.valueOf(i4Var.e()), q10.i());
    }

    private boolean C(i4 i4Var) {
        boolean z10;
        if (i4Var.h() > this.f30408c) {
            this.f30408c = i4Var.h();
            z10 = true;
        } else {
            z10 = false;
        }
        if (i4Var.e() <= this.f30409d) {
            return z10;
        }
        this.f30409d = i4Var.e();
        return true;
    }

    private void D() {
        this.f30406a.v("UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?", Integer.valueOf(this.f30408c), Long.valueOf(this.f30409d), Long.valueOf(this.f30410e.c().d()), Integer.valueOf(this.f30410e.c().c()), Long.valueOf(this.f30411f));
    }

    private i4 p(byte[] bArr) {
        try {
            return this.f30407b.h(w7.c.x0(bArr));
        } catch (e0 e10) {
            throw y7.b.a("TargetData failed to parse: %s", e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void t(n nVar, Cursor cursor) {
        nVar.accept(p(cursor.getBlob(0)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void v(f1 f1Var, c cVar, Cursor cursor) {
        i4 p10 = p(cursor.getBlob(0));
        if (f1Var.equals(p10.g())) {
            cVar.f30413a = p10;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w(SparseArray sparseArray, int[] iArr, Cursor cursor) {
        int i10 = cursor.getInt(0);
        if (sparseArray.get(i10) == null) {
            z(i10);
            iArr[0] = iArr[0] + 1;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x(Cursor cursor) {
        this.f30408c = cursor.getInt(0);
        this.f30409d = (long) cursor.getInt(1);
        this.f30410e = new w(new q(cursor.getLong(2), cursor.getInt(3)));
        this.f30411f = cursor.getLong(4);
    }

    private void z(int i10) {
        h(i10);
        this.f30406a.v("DELETE FROM targets WHERE target_id = ?", Integer.valueOf(i10));
        this.f30411f--;
    }

    /* access modifiers changed from: package-private */
    public void B() {
        boolean z10 = true;
        if (this.f30406a.E("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1").c(new b4(this)) != 1) {
            z10 = false;
        }
        y7.b.d(z10, "Missing target_globals entry", new Object[0]);
    }

    public void a(w wVar) {
        this.f30410e = wVar;
        D();
    }

    public void b(i4 i4Var) {
        A(i4Var);
        C(i4Var);
        this.f30411f++;
        D();
    }

    public void c(e<l> eVar, int i10) {
        SQLiteStatement D = this.f30406a.D("DELETE FROM target_documents WHERE target_id = ? AND path = ?");
        i2 z10 = this.f30406a.f();
        Iterator<l> it = eVar.iterator();
        while (it.hasNext()) {
            l next = it.next();
            String c10 = f.c(next.l());
            this.f30406a.u(D, Integer.valueOf(i10), c10);
            z10.j(next);
        }
    }

    public int d() {
        return this.f30408c;
    }

    public e<l> e(int i10) {
        b bVar = new b();
        this.f30406a.E("SELECT path FROM target_documents WHERE target_id = ?").b(Integer.valueOf(i10)).e(new a4(bVar));
        return bVar.f30412a;
    }

    public w f() {
        return this.f30410e;
    }

    public i4 g(f1 f1Var) {
        String c10 = f1Var.c();
        c cVar = new c();
        this.f30406a.E("SELECT target_proto FROM targets WHERE canonical_id = ?").b(c10).e(new d4(this, f1Var, cVar));
        return cVar.f30413a;
    }

    public void h(int i10) {
        this.f30406a.v("DELETE FROM target_documents WHERE target_id = ?", Integer.valueOf(i10));
    }

    public void i(i4 i4Var) {
        A(i4Var);
        if (C(i4Var)) {
            D();
        }
    }

    public void j(e<l> eVar, int i10) {
        SQLiteStatement D = this.f30406a.D("INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)");
        i2 z10 = this.f30406a.f();
        Iterator<l> it = eVar.iterator();
        while (it.hasNext()) {
            l next = it.next();
            String c10 = f.c(next.l());
            this.f30406a.u(D, Integer.valueOf(i10), c10);
            z10.i(next);
        }
    }

    public void q(n<i4> nVar) {
        this.f30406a.E("SELECT target_proto FROM targets").e(new e4(this, nVar));
    }

    public long r() {
        return this.f30409d;
    }

    public long s() {
        return this.f30411f;
    }

    /* access modifiers changed from: package-private */
    public int y(long j10, SparseArray<?> sparseArray) {
        int[] iArr = new int[1];
        this.f30406a.E("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?").b(Long.valueOf(j10)).e(new c4(this, sparseArray, iArr));
        D();
        return iArr[0];
    }
}
