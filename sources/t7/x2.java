package t7;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Set;
import p7.j;
import v7.g;
import y7.b;

/* compiled from: SQLiteOverlayMigrationManager */
public class x2 implements c1 {

    /* renamed from: a  reason: collision with root package name */
    private final a3 f30545a;

    public x2(a3 a3Var) {
        this.f30545a = a3Var;
    }

    private void d() {
        this.f30545a.k("build overlays", new u2(this));
    }

    private Set<String> e() {
        HashSet hashSet = new HashSet();
        this.f30545a.E("SELECT DISTINCT uid FROM mutation_queues").e(new v2(hashSet));
        return hashSet;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g() {
        if (f()) {
            Set<String> e10 = e();
            l1 g10 = this.f30545a.g();
            for (String jVar : e10) {
                j jVar2 = new j(jVar);
                a3 a3Var = this.f30545a;
                b1 d10 = a3Var.d(jVar2, a3Var.c(jVar2));
                HashSet hashSet = new HashSet();
                for (g f10 : d10.k()) {
                    hashSet.addAll(f10.f());
                }
                new n(g10, d10, this.f30545a.b(jVar2), this.f30545a.c(jVar2)).o(hashSet);
            }
            j();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void i(Boolean[] boolArr, Cursor cursor) {
        try {
            if (e1.f30392b.equals(cursor.getString(0))) {
                boolArr[0] = Boolean.TRUE;
            }
        } catch (IllegalArgumentException e10) {
            throw b.a("SQLitePersistence.DataMigration failed to parse: %s", e10);
        }
    }

    private void j() {
        this.f30545a.v("DELETE FROM data_migrations WHERE migration_name = ?", e1.f30392b);
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        Boolean[] boolArr = {Boolean.FALSE};
        this.f30545a.E("SELECT migration_name FROM data_migrations").e(new w2(boolArr));
        return boolArr[0].booleanValue();
    }

    public void run() {
        d();
    }
}
