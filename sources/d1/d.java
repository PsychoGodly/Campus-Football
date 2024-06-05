package d1;

import android.database.sqlite.SQLiteProgram;

/* compiled from: FrameworkSQLiteProgram */
class d implements c1.d {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteProgram f17652a;

    d(SQLiteProgram sQLiteProgram) {
        this.f17652a = sQLiteProgram;
    }

    public void C(int i10, double d10) {
        this.f17652a.bindDouble(i10, d10);
    }

    public void N(int i10, long j10) {
        this.f17652a.bindLong(i10, j10);
    }

    public void S(int i10, byte[] bArr) {
        this.f17652a.bindBlob(i10, bArr);
    }

    public void close() {
        this.f17652a.close();
    }

    public void j0(int i10) {
        this.f17652a.bindNull(i10);
    }

    public void t(int i10, String str) {
        this.f17652a.bindString(i10, str);
    }
}
