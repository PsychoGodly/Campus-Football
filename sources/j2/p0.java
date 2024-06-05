package j2;

import android.database.sqlite.SQLiteDatabase;
import j2.t0;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class p0 implements t0.a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ p0 f35691a = new p0();

    private /* synthetic */ p0() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
