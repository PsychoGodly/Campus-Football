package t7;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b3 implements SQLiteDatabase.CursorFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object[] f38386a;

    public /* synthetic */ b3(Object[] objArr) {
        this.f38386a = objArr;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return a3.r(sQLiteQuery, this.f38386a);
    }
}
