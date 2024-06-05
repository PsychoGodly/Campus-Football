package d1;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import c1.e;
import c1.f;
import com.applovin.mediation.MaxReward;
import java.io.IOException;
import java.util.List;

/* compiled from: FrameworkSQLiteDatabase */
class a implements c1.b {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f17633b = {MaxReward.DEFAULT_LABEL, " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f17634c = new String[0];

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f17635a;

    /* renamed from: d1.a$a  reason: collision with other inner class name */
    /* compiled from: FrameworkSQLiteDatabase */
    class C0176a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f17636a;

        C0176a(e eVar) {
            this.f17636a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f17636a.h(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* compiled from: FrameworkSQLiteDatabase */
    class b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f17638a;

        b(e eVar) {
            this.f17638a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f17638a.h(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    a(SQLiteDatabase sQLiteDatabase) {
        this.f17635a = sQLiteDatabase;
    }

    public void O() {
        this.f17635a.setTransactionSuccessful();
    }

    public void Q(String str, Object[] objArr) throws SQLException {
        this.f17635a.execSQL(str, objArr);
    }

    public Cursor V(String str) {
        return s0(new c1.a(str));
    }

    public void a0() {
        this.f17635a.endTransaction();
    }

    public void close() throws IOException {
        this.f17635a.close();
    }

    public Cursor f0(e eVar, CancellationSignal cancellationSignal) {
        return this.f17635a.rawQueryWithFactory(new b(eVar), eVar.i(), f17634c, (String) null, cancellationSignal);
    }

    /* access modifiers changed from: package-private */
    public boolean h(SQLiteDatabase sQLiteDatabase) {
        return this.f17635a == sQLiteDatabase;
    }

    public boolean isOpen() {
        return this.f17635a.isOpen();
    }

    public void k() {
        this.f17635a.beginTransaction();
    }

    public List<Pair<String, String>> o() {
        return this.f17635a.getAttachedDbs();
    }

    public String o0() {
        return this.f17635a.getPath();
    }

    public boolean q0() {
        return this.f17635a.inTransaction();
    }

    public void s(String str) throws SQLException {
        this.f17635a.execSQL(str);
    }

    public Cursor s0(e eVar) {
        return this.f17635a.rawQueryWithFactory(new C0176a(eVar), eVar.i(), f17634c, (String) null);
    }

    public f x(String str) {
        return new e(this.f17635a.compileStatement(str));
    }
}
