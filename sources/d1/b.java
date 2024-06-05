package d1;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import c1.c;
import java.io.File;

/* compiled from: FrameworkSQLiteOpenHelper */
class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f17640a;

    /* renamed from: b  reason: collision with root package name */
    private final String f17641b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a f17642c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f17643d;

    /* renamed from: f  reason: collision with root package name */
    private final Object f17644f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private a f17645g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f17646h;

    /* compiled from: FrameworkSQLiteOpenHelper */
    static class a extends SQLiteOpenHelper {

        /* renamed from: a  reason: collision with root package name */
        final a[] f17647a;

        /* renamed from: b  reason: collision with root package name */
        final c.a f17648b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f17649c;

        /* renamed from: d1.b$a$a  reason: collision with other inner class name */
        /* compiled from: FrameworkSQLiteOpenHelper */
        class C0177a implements DatabaseErrorHandler {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c.a f17650a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a[] f17651b;

            C0177a(c.a aVar, a[] aVarArr) {
                this.f17650a = aVar;
                this.f17651b = aVarArr;
            }

            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f17650a.c(a.i(this.f17651b, sQLiteDatabase));
            }
        }

        a(Context context, String str, a[] aVarArr, c.a aVar) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f5575a, new C0177a(aVar, aVarArr));
            this.f17648b = aVar;
            this.f17647a = aVarArr;
        }

        static a i(a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            a aVar = aVarArr[0];
            if (aVar == null || !aVar.h(sQLiteDatabase)) {
                aVarArr[0] = new a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        public synchronized void close() {
            super.close();
            this.f17647a[0] = null;
        }

        /* access modifiers changed from: package-private */
        public a h(SQLiteDatabase sQLiteDatabase) {
            return i(this.f17647a, sQLiteDatabase);
        }

        /* access modifiers changed from: package-private */
        public synchronized c1.b j() {
            this.f17649c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f17649c) {
                close();
                return j();
            }
            return h(writableDatabase);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f17648b.b(h(sQLiteDatabase));
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f17648b.d(h(sQLiteDatabase));
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f17649c = true;
            this.f17648b.e(h(sQLiteDatabase), i10, i11);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f17649c) {
                this.f17648b.f(h(sQLiteDatabase));
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f17649c = true;
            this.f17648b.g(h(sQLiteDatabase), i10, i11);
        }
    }

    b(Context context, String str, c.a aVar, boolean z10) {
        this.f17640a = context;
        this.f17641b = str;
        this.f17642c = aVar;
        this.f17643d = z10;
    }

    private a h() {
        a aVar;
        synchronized (this.f17644f) {
            if (this.f17645g == null) {
                a[] aVarArr = new a[1];
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 23 || this.f17641b == null || !this.f17643d) {
                    this.f17645g = new a(this.f17640a, this.f17641b, aVarArr, this.f17642c);
                } else {
                    this.f17645g = new a(this.f17640a, new File(this.f17640a.getNoBackupFilesDir(), this.f17641b).getAbsolutePath(), aVarArr, this.f17642c);
                }
                if (i10 >= 16) {
                    this.f17645g.setWriteAheadLoggingEnabled(this.f17646h);
                }
            }
            aVar = this.f17645g;
        }
        return aVar;
    }

    public c1.b U() {
        return h().j();
    }

    public void close() {
        h().close();
    }

    public String getDatabaseName() {
        return this.f17641b;
    }

    public void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this.f17644f) {
            a aVar = this.f17645g;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z10);
            }
            this.f17646h = z10;
        }
    }
}
