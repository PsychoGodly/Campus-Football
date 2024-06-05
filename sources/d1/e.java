package d1;

import android.database.sqlite.SQLiteStatement;
import c1.f;

/* compiled from: FrameworkSQLiteStatement */
class e extends d implements f {

    /* renamed from: b  reason: collision with root package name */
    private final SQLiteStatement f17653b;

    e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f17653b = sQLiteStatement;
    }

    public long R0() {
        return this.f17653b.executeInsert();
    }

    public int w() {
        return this.f17653b.executeUpdateDelete();
    }
}
