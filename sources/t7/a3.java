package t7;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import com.google.firebase.firestore.z;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p7.j;
import t7.o0;
import u7.f;
import y7.g0;
import y7.n;
import y7.s;
import y7.t;
import y7.v;
import y7.y;

/* compiled from: SQLitePersistence */
public final class a3 extends e1 {

    /* renamed from: c  reason: collision with root package name */
    private final c f30364c;

    /* renamed from: d  reason: collision with root package name */
    private final o f30365d;

    /* renamed from: e  reason: collision with root package name */
    private final f4 f30366e;

    /* renamed from: f  reason: collision with root package name */
    private final o1 f30367f;

    /* renamed from: g  reason: collision with root package name */
    private final g3 f30368g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final i2 f30369h;

    /* renamed from: i  reason: collision with root package name */
    private final SQLiteTransactionListener f30370i;

    /* renamed from: j  reason: collision with root package name */
    private SQLiteDatabase f30371j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f30372k;

    /* compiled from: SQLitePersistence */
    class a implements SQLiteTransactionListener {
        a() {
        }

        public void onBegin() {
            a3.this.f30369h.g();
        }

        public void onCommit() {
            a3.this.f30369h.e();
        }

        public void onRollback() {
        }
    }

    /* compiled from: SQLitePersistence */
    static class c extends SQLiteOpenHelper {

        /* renamed from: a  reason: collision with root package name */
        private final o f30380a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f30381b;

        /* synthetic */ c(Context context, o oVar, String str, a aVar) {
            this(context, oVar, str);
        }

        private void h(SQLiteDatabase sQLiteDatabase) {
            if (!this.f30381b) {
                onConfigure(sQLiteDatabase);
            }
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f30381b = true;
            sQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            h(sQLiteDatabase);
            new z3(sQLiteDatabase, this.f30380a).j0(0);
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            h(sQLiteDatabase);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            h(sQLiteDatabase);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            h(sQLiteDatabase);
            new z3(sQLiteDatabase, this.f30380a).j0(i10);
        }

        private c(Context context, o oVar, String str) {
            this(context, oVar, str, 16);
        }

        c(Context context, o oVar, String str, int i10) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
            this.f30380a = oVar;
        }
    }

    /* compiled from: SQLitePersistence */
    static class d {

        /* renamed from: a  reason: collision with root package name */
        private final SQLiteDatabase f30382a;

        /* renamed from: b  reason: collision with root package name */
        private final String f30383b;

        /* renamed from: c  reason: collision with root package name */
        private SQLiteDatabase.CursorFactory f30384c;

        d(SQLiteDatabase sQLiteDatabase, String str) {
            this.f30382a = sQLiteDatabase;
            this.f30383b = str;
        }

        private Cursor h() {
            SQLiteDatabase.CursorFactory cursorFactory = this.f30384c;
            if (cursorFactory != null) {
                return this.f30382a.rawQueryWithFactory(cursorFactory, this.f30383b, (String[]) null, (String) null);
            }
            return this.f30382a.rawQuery(this.f30383b, (String[]) null);
        }

        /* access modifiers changed from: package-private */
        public d b(Object... objArr) {
            this.f30384c = new b3(objArr);
            return this;
        }

        /* access modifiers changed from: package-private */
        public int c(n<Cursor> nVar) {
            Cursor h10 = h();
            try {
                if (h10.moveToFirst()) {
                    nVar.accept(h10);
                    h10.close();
                    return 1;
                }
                h10.close();
                return 0;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        /* access modifiers changed from: package-private */
        public <T> T d(t<Cursor, T> tVar) {
            Cursor h10 = h();
            try {
                if (h10.moveToFirst()) {
                    T apply = tVar.apply(h10);
                    h10.close();
                    return apply;
                }
                h10.close();
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        /* access modifiers changed from: package-private */
        public int e(n<Cursor> nVar) {
            Cursor h10 = h();
            int i10 = 0;
            while (h10.moveToNext()) {
                try {
                    i10++;
                    nVar.accept(h10);
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            h10.close();
            return i10;
            throw th;
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            Cursor h10 = h();
            try {
                boolean z10 = !h10.moveToFirst();
                h10.close();
                return z10;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }
    }

    public a3(Context context, String str, f fVar, o oVar, o0.b bVar) {
        this(oVar, bVar, new c(context, oVar, t(str, fVar), (a) null));
    }

    /* access modifiers changed from: private */
    public static void r(SQLiteProgram sQLiteProgram, Object[] objArr) {
        for (int i10 = 0; i10 < objArr.length; i10++) {
            String str = objArr[i10];
            if (str == null) {
                sQLiteProgram.bindNull(i10 + 1);
            } else if (str instanceof String) {
                sQLiteProgram.bindString(i10 + 1, str);
            } else if (str instanceof Integer) {
                sQLiteProgram.bindLong(i10 + 1, (long) ((Integer) str).intValue());
            } else if (str instanceof Long) {
                sQLiteProgram.bindLong(i10 + 1, ((Long) str).longValue());
            } else if (str instanceof Double) {
                sQLiteProgram.bindDouble(i10 + 1, ((Double) str).doubleValue());
            } else if (str instanceof byte[]) {
                sQLiteProgram.bindBlob(i10 + 1, (byte[]) str);
            } else {
                throw y7.b.a("Unknown argument %s of type %s", str, str.getClass());
            }
        }
    }

    public static void s(Context context, f fVar, String str) throws z {
        String path = context.getDatabasePath(t(str, fVar)).getPath();
        String str2 = path + "-wal";
        File file = new File(path);
        File file2 = new File(path + "-journal");
        File file3 = new File(str2);
        try {
            s.a(file);
            s.a(file2);
            s.a(file3);
        } catch (IOException e10) {
            throw new z("Failed to clear persistence." + e10, z.a.UNKNOWN);
        }
    }

    public static String t(String str, f fVar) {
        try {
            return "firestore." + URLEncoder.encode(str, "utf-8") + "." + URLEncoder.encode(fVar.f(), "utf-8") + "." + URLEncoder.encode(fVar.e(), "utf-8");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    private long x() {
        return ((Long) E("PRAGMA page_count").d(z2.f38538a)).longValue();
    }

    private long y() {
        return ((Long) E("PRAGMA page_size").d(y2.f38534a)).longValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public f4 h() {
        return this.f30366e;
    }

    /* access modifiers changed from: package-private */
    public SQLiteStatement D(String str) {
        return this.f30371j.compileStatement(str);
    }

    /* access modifiers changed from: package-private */
    public d E(String str) {
        return new d(this.f30371j, str);
    }

    /* access modifiers changed from: package-private */
    public a a() {
        return this.f30367f;
    }

    /* access modifiers changed from: package-private */
    public b b(j jVar) {
        return new v1(this, this.f30365d, jVar);
    }

    /* access modifiers changed from: package-private */
    public l c(j jVar) {
        return new e2(this, this.f30365d, jVar);
    }

    /* access modifiers changed from: package-private */
    public b1 d(j jVar, l lVar) {
        return new t2(this, this.f30365d, jVar, lVar);
    }

    /* access modifiers changed from: package-private */
    public c1 e() {
        return new x2(this);
    }

    /* access modifiers changed from: package-private */
    public l1 g() {
        return this.f30368g;
    }

    public boolean i() {
        return this.f30372k;
    }

    /* access modifiers changed from: package-private */
    public <T> T j(String str, y<T> yVar) {
        v.a(e1.f30391a, "Starting transaction: %s", str);
        this.f30371j.beginTransactionWithListener(this.f30370i);
        try {
            T t10 = yVar.get();
            this.f30371j.setTransactionSuccessful();
            return t10;
        } finally {
            this.f30371j.endTransaction();
        }
    }

    /* access modifiers changed from: package-private */
    public void k(String str, Runnable runnable) {
        v.a(e1.f30391a, "Starting transaction: %s", str);
        this.f30371j.beginTransactionWithListener(this.f30370i);
        try {
            runnable.run();
            this.f30371j.setTransactionSuccessful();
        } finally {
            this.f30371j.endTransaction();
        }
    }

    public void l() {
        y7.b.d(this.f30372k, "SQLitePersistence shutdown without start!", new Object[0]);
        this.f30372k = false;
        this.f30371j.close();
        this.f30371j = null;
    }

    public void m() {
        y7.b.d(!this.f30372k, "SQLitePersistence double-started!", new Object[0]);
        this.f30372k = true;
        try {
            this.f30371j = this.f30364c.getWritableDatabase();
            this.f30366e.B();
            this.f30369h.z(this.f30366e.r());
        } catch (SQLiteDatabaseLockedException e10) {
            throw new RuntimeException("Failed to gain exclusive lock to the Cloud Firestore client's offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them.", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public int u(SQLiteStatement sQLiteStatement, Object... objArr) {
        sQLiteStatement.clearBindings();
        r(sQLiteStatement, objArr);
        return sQLiteStatement.executeUpdateDelete();
    }

    /* access modifiers changed from: package-private */
    public void v(String str, Object... objArr) {
        this.f30371j.execSQL(str, objArr);
    }

    /* access modifiers changed from: package-private */
    public long w() {
        return x() * y();
    }

    /* renamed from: z */
    public i2 f() {
        return this.f30369h;
    }

    public a3(o oVar, o0.b bVar, c cVar) {
        this.f30370i = new a();
        this.f30364c = cVar;
        this.f30365d = oVar;
        this.f30366e = new f4(this, oVar);
        this.f30367f = new o1(this, oVar);
        this.f30368g = new g3(this, oVar);
        this.f30369h = new i2(this, bVar);
    }

    /* compiled from: SQLitePersistence */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        private final a3 f30374a;

        /* renamed from: b  reason: collision with root package name */
        private final String f30375b;

        /* renamed from: c  reason: collision with root package name */
        private final String f30376c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Object> f30377d;

        /* renamed from: e  reason: collision with root package name */
        private int f30378e = 0;

        /* renamed from: f  reason: collision with root package name */
        private final Iterator<Object> f30379f;

        b(a3 a3Var, String str, List<Object> list, String str2) {
            this.f30374a = a3Var;
            this.f30375b = str;
            this.f30377d = Collections.emptyList();
            this.f30376c = str2;
            this.f30379f = list.iterator();
        }

        private Object[] b() {
            ArrayList arrayList = new ArrayList(this.f30377d);
            int i10 = 0;
            while (this.f30379f.hasNext() && i10 < 900 - this.f30377d.size()) {
                arrayList.add(this.f30379f.next());
                i10++;
            }
            return arrayList.toArray();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f30378e++;
            Object[] b10 = b();
            this.f30374a.v(this.f30375b + g0.z("?", b10.length, ", ") + this.f30376c, b10);
        }

        /* access modifiers changed from: package-private */
        public int c() {
            return this.f30378e;
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            return this.f30379f.hasNext();
        }

        /* access modifiers changed from: package-private */
        public d e() {
            this.f30378e++;
            Object[] b10 = b();
            return this.f30374a.E(this.f30375b + g0.z("?", b10.length, ", ") + this.f30376c).b(b10);
        }

        b(a3 a3Var, String str, List<Object> list, List<Object> list2, String str2) {
            this.f30374a = a3Var;
            this.f30375b = str;
            this.f30377d = list;
            this.f30376c = str2;
            this.f30379f = list2.iterator();
        }
    }
}
