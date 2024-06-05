package t7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.google.protobuf.e0;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import t7.a3;
import t7.t0;
import u7.u;
import w7.c;
import y7.b;
import y7.v;

/* compiled from: SQLiteSchema */
class z3 {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f30559a;

    /* renamed from: b  reason: collision with root package name */
    private final o f30560b;

    z3(SQLiteDatabase sQLiteDatabase, o oVar) {
        this.f30559a = sQLiteDatabase;
        this.f30560b = oVar;
    }

    private void A() {
        N(new String[]{"document_overlays"}, new r3(this));
    }

    private void B() {
        N(new String[]{"mutation_queues", "mutations", "document_mutations"}, new w3(this));
    }

    private void C() {
        N(new String[]{"remote_documents"}, new h3(this));
    }

    private void D() {
        N(new String[]{"targets", "target_globals", "target_documents"}, new q3(this));
    }

    private void E() {
        N(new String[]{"collection_parents"}, new s3(this));
        x3 x3Var = new x3(new t0.a(), this.f30559a.compileStatement("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)"));
        new a3.d(this.f30559a, "SELECT path FROM remote_documents").e(new l3(x3Var));
        new a3.d(this.f30559a, "SELECT path FROM document_mutations").e(new m3(x3Var));
    }

    private void F() {
        new a3.d(this.f30559a, "SELECT target_id, target_proto FROM targets").e(new y3(this));
    }

    private void G() {
        if (m0("targets")) {
            this.f30559a.execSQL("DROP TABLE targets");
        }
        if (m0("target_globals")) {
            this.f30559a.execSQL("DROP TABLE target_globals");
        }
        if (m0("target_documents")) {
            this.f30559a.execSQL("DROP TABLE target_documents");
        }
    }

    private void H() {
        a3.d b10 = new a3.d(this.f30559a, "SELECT path FROM remote_documents WHERE path_length IS NULL LIMIT ?").b(100);
        SQLiteStatement compileStatement = this.f30559a.compileStatement("UPDATE remote_documents SET path_length = ? WHERE path = ?");
        boolean[] zArr = new boolean[1];
        do {
            zArr[0] = false;
            b10.e(new n3(zArr, compileStatement));
        } while (zArr[0]);
    }

    private void I() {
        this.f30559a.execSQL("UPDATE remote_documents SET read_time_seconds = 0, read_time_nanos = 0 WHERE read_time_seconds IS NULL");
    }

    private void J() {
        Long l10 = (Long) new a3.d(this.f30559a, "SELECT highest_listen_sequence_number FROM target_globals LIMIT 1").d(p3.f38476a);
        b.d(l10 != null, "Missing highest sequence number", new Object[0]);
        long longValue = l10.longValue();
        SQLiteStatement compileStatement = this.f30559a.compileStatement("INSERT INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)");
        a3.d b10 = new a3.d(this.f30559a, "SELECT RD.path FROM remote_documents AS RD WHERE NOT EXISTS (SELECT TD.path FROM target_documents AS TD WHERE RD.path = TD.path AND TD.target_id = 0) LIMIT ?").b(100);
        boolean[] zArr = new boolean[1];
        do {
            zArr[0] = false;
            b10.e(new o3(zArr, compileStatement, longValue));
        } while (zArr[0]);
    }

    private void K() {
        if (!(DatabaseUtils.queryNumEntries(this.f30559a, "target_globals") == 1)) {
            this.f30559a.execSQL("INSERT INTO target_globals (highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos) VALUES (?, ?, ?, ?)", new String[]{"0", "0", "0", "0"});
        }
    }

    private boolean M() {
        boolean l02 = l0("remote_documents", "read_time_seconds");
        boolean l03 = l0("remote_documents", "read_time_nanos");
        b.d(l02 == l03, "Table contained just one of read_time_seconds or read_time_nanos", new Object[0]);
        if (!l02 || !l03) {
            return false;
        }
        return true;
    }

    private void N(String[] strArr, Runnable runnable) {
        String str;
        String str2 = "[" + TextUtils.join(", ", strArr) + "]";
        boolean z10 = false;
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str3 = strArr[i10];
            boolean m02 = m0(str3);
            if (i10 == 0) {
                z10 = m02;
            } else if (m02 != z10) {
                String str4 = "Expected all of " + str2 + " to either exist or not, but ";
                if (z10) {
                    str = str4 + strArr[0] + " exists and " + str3 + " does not";
                } else {
                    str = str4 + strArr[0] + " does not exist and " + str3 + " does";
                }
                throw new IllegalStateException(str);
            }
        }
        if (!z10) {
            runnable.run();
            return;
        }
        v.a("SQLiteSchema", "Skipping migration because all of " + str2 + " already exist", new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void O() {
        this.f30559a.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
        this.f30559a.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void P() {
        this.f30559a.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Q() {
        this.f30559a.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
        this.f30559a.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
        this.f30559a.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
        this.f30559a.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void R() {
        this.f30559a.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
        this.f30559a.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
        this.f30559a.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void S() {
        this.f30559a.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
        this.f30559a.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
        this.f30559a.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void T() {
        this.f30559a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void U() {
        this.f30559a.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
        this.f30559a.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
        this.f30559a.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
        this.f30559a.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
        this.f30559a.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void V(t0.a aVar, SQLiteStatement sQLiteStatement, u uVar) {
        if (aVar.a(uVar)) {
            String g10 = uVar.g();
            sQLiteStatement.clearBindings();
            sQLiteStatement.bindString(1, g10);
            sQLiteStatement.bindString(2, f.c((u) uVar.m()));
            sQLiteStatement.execute();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Y() {
        this.f30559a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Z(Cursor cursor) {
        int i10 = cursor.getInt(0);
        try {
            this.f30559a.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{((c) ((c.b) c.x0(cursor.getBlob(1)).b()).F().build()).i(), Integer.valueOf(i10)});
        } catch (e0 unused) {
            throw b.a("Failed to decode Query data for target %s", Integer.valueOf(i10));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a0(boolean[] zArr, SQLiteStatement sQLiteStatement, Cursor cursor) {
        boolean z10 = true;
        zArr[0] = true;
        String string = cursor.getString(0);
        u b10 = f.b(string);
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, (long) b10.k());
        sQLiteStatement.bindString(2, string);
        if (sQLiteStatement.executeUpdateDelete() == -1) {
            z10 = false;
        }
        b.d(z10, "Failed to update document path", new Object[0]);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c0(boolean[] zArr, SQLiteStatement sQLiteStatement, long j10, Cursor cursor) {
        boolean z10 = true;
        zArr[0] = true;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, cursor.getString(0));
        sQLiteStatement.bindLong(2, j10);
        if (sQLiteStatement.executeInsert() == -1) {
            z10 = false;
        }
        b.d(z10, "Failed to insert a sentinel row", new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d0(String str, Cursor cursor) {
        h0(str, cursor.getInt(0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e0(Cursor cursor) {
        String string = cursor.getString(0);
        long j10 = cursor.getLong(1);
        new a3.d(this.f30559a, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?").b(string, Long.valueOf(j10)).e(new k3(this, string));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f0(Cursor cursor) {
        int i10 = cursor.getInt(0);
        try {
            String c10 = this.f30560b.h(c.x0(cursor.getBlob(1))).g().c();
            this.f30559a.execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{c10, Integer.valueOf(i10)});
        } catch (e0 unused) {
            throw b.a("Failed to decode Query data for target %s", Integer.valueOf(i10));
        }
    }

    private void g0() {
        new a3.d(this.f30559a, "SELECT uid, last_acknowledged_batch_id FROM mutation_queues").e(new j3(this));
    }

    private void h0(String str, int i10) {
        SQLiteStatement compileStatement = this.f30559a.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        compileStatement.bindString(1, str);
        compileStatement.bindLong(2, (long) i10);
        b.d(compileStatement.executeUpdateDelete() != 0, "Mutation batch (%s, %d) did not exist", str, Integer.valueOf(i10));
        this.f30559a.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{str, Integer.valueOf(i10)});
    }

    private void i0() {
        new a3.d(this.f30559a, "SELECT target_id, target_proto FROM targets").e(new i3(this));
    }

    private boolean l0(String str, String str2) {
        return L(str).indexOf(str2) != -1;
    }

    private boolean m0(String str) {
        return !new a3.d(this.f30559a, "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?").b(str).f();
    }

    private void s() {
        if (!l0("remote_documents", "path_length")) {
            this.f30559a.execSQL("ALTER TABLE remote_documents ADD COLUMN path_length INTEGER");
        }
    }

    private void t(String str) {
        this.f30559a.execSQL("INSERT OR IGNORE INTO data_migrations (migration_name) VALUES (?)", new String[]{str});
    }

    private void u() {
        this.f30559a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_seconds INTEGER");
        this.f30559a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_nanos INTEGER");
    }

    private void v() {
        if (!l0("target_documents", "sequence_number")) {
            this.f30559a.execSQL("ALTER TABLE target_documents ADD COLUMN sequence_number INTEGER");
        }
    }

    private void w() {
        if (!l0("target_globals", "target_count")) {
            this.f30559a.execSQL("ALTER TABLE target_globals ADD COLUMN target_count INTEGER");
        }
        long queryNumEntries = DatabaseUtils.queryNumEntries(this.f30559a, "targets");
        ContentValues contentValues = new ContentValues();
        contentValues.put("target_count", Long.valueOf(queryNumEntries));
        this.f30559a.update("target_globals", contentValues, (String) null, (String[]) null);
    }

    private void x() {
        N(new String[]{"bundles", "named_queries"}, new u3(this));
    }

    private void y() {
        N(new String[]{"data_migrations"}, new t3(this));
    }

    private void z() {
        N(new String[]{"index_configuration", "index_state", "index_entries"}, new v3(this));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.String[], android.database.Cursor] */
    /* access modifiers changed from: package-private */
    public List<String> L(String str) {
        ArrayList arrayList = new ArrayList();
        ? r12 = 0;
        try {
            SQLiteDatabase sQLiteDatabase = this.f30559a;
            Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA table_info(" + str + ")", r12);
            int columnIndex = rawQuery.getColumnIndex(MediationMetaData.KEY_NAME);
            while (rawQuery.moveToNext()) {
                arrayList.add(rawQuery.getString(columnIndex));
            }
            rawQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (r12 != 0) {
                r12.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void j0(int i10) {
        k0(i10, 16);
    }

    /* access modifiers changed from: package-private */
    public void k0(int i10, int i11) {
        long currentTimeMillis = System.currentTimeMillis();
        if (i10 < 1 && i11 >= 1) {
            B();
            D();
            C();
        }
        if (i10 < 3 && i11 >= 3 && i10 != 0) {
            G();
            D();
        }
        if (i10 < 4 && i11 >= 4) {
            K();
            w();
        }
        if (i10 < 5 && i11 >= 5) {
            v();
        }
        if (i10 < 6 && i11 >= 6) {
            g0();
        }
        if (i10 < 7 && i11 >= 7) {
            J();
        }
        if (i10 < 8 && i11 >= 8) {
            E();
        }
        if (i10 < 9 && i11 >= 9) {
            if (!M()) {
                u();
            } else {
                F();
            }
        }
        if (i10 == 9 && i11 >= 10) {
            F();
        }
        if (i10 < 11 && i11 >= 11) {
            i0();
        }
        if (i10 < 12 && i11 >= 12) {
            x();
        }
        if (i10 < 13 && i11 >= 13) {
            s();
            H();
        }
        if (i10 < 14 && i11 >= 14) {
            A();
            y();
            t(e1.f30392b);
        }
        if (i10 < 15 && i11 >= 15) {
            I();
        }
        if (i10 < 16 && i11 >= 16) {
            z();
        }
        v.a("SQLiteSchema", "Migration from version %s to %s took %s milliseconds", Integer.valueOf(i10), Integer.valueOf(i11), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }
}
