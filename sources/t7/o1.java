package t7;

import android.database.Cursor;
import com.google.protobuf.e0;
import o8.a;
import q7.e;
import q7.j;
import u7.w;
import y6.q;
import y7.b;

/* compiled from: SQLiteBundleCache */
class o1 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a3 f30510a;

    /* renamed from: b  reason: collision with root package name */
    private final o f30511b;

    o1(a3 a3Var, o oVar) {
        this.f30510a = a3Var;
        this.f30511b = oVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ e g(String str, Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        return new e(str, cursor.getInt(0), new w(new q(cursor.getLong(1), cursor.getInt(2))), cursor.getInt(3), cursor.getLong(4));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ j h(String str, Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            return new j(str, this.f30511b.a(a.m0(cursor.getBlob(2))), new w(new q(cursor.getLong(0), cursor.getInt(1))));
        } catch (e0 e10) {
            throw b.a("NamedQuery failed to parse: %s", e10);
        }
    }

    public e a(String str) {
        return (e) this.f30510a.E("SELECT schema_version, create_time_seconds, create_time_nanos, total_documents,  total_bytes FROM bundles WHERE bundle_id = ?").b(str).d(new m1(str));
    }

    public void b(j jVar) {
        a j10 = this.f30511b.j(jVar.a());
        this.f30510a.v("INSERT OR REPLACE INTO named_queries (name, read_time_seconds, read_time_nanos, bundled_query_proto) VALUES (?, ?, ?, ?)", jVar.b(), Long.valueOf(jVar.c().c().d()), Integer.valueOf(jVar.c().c().c()), j10.i());
    }

    public void c(e eVar) {
        this.f30510a.v("INSERT OR REPLACE INTO bundles (bundle_id, schema_version, create_time_seconds, create_time_nanos, total_documents, total_bytes) VALUES (?, ?, ?, ?, ?, ?)", eVar.a(), Integer.valueOf(eVar.c()), Long.valueOf(eVar.b().c().d()), Integer.valueOf(eVar.b().c().c()), Integer.valueOf(eVar.e()), Long.valueOf(eVar.d()));
    }

    public j d(String str) {
        return (j) this.f30510a.E("SELECT read_time_seconds, read_time_nanos, bundled_query_proto FROM named_queries WHERE name = ?").b(str).d(new n1(this, str));
    }
}
