package androidx.room;

import android.database.Cursor;
import c1.c;
import java.util.List;

/* compiled from: RoomOpenHelper */
public class i extends c.a {

    /* renamed from: b  reason: collision with root package name */
    private a f4772b;

    /* renamed from: c  reason: collision with root package name */
    private final a f4773c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4774d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4775e;

    /* compiled from: RoomOpenHelper */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f4776a;

        public a(int i10) {
            this.f4776a = i10;
        }

        /* access modifiers changed from: protected */
        public abstract void a(c1.b bVar);

        /* access modifiers changed from: protected */
        public abstract void b(c1.b bVar);

        /* access modifiers changed from: protected */
        public abstract void c(c1.b bVar);

        /* access modifiers changed from: protected */
        public abstract void d(c1.b bVar);

        /* access modifiers changed from: protected */
        public abstract void e(c1.b bVar);

        /* access modifiers changed from: protected */
        public abstract void f(c1.b bVar);

        /* access modifiers changed from: protected */
        public abstract b g(c1.b bVar);
    }

    /* compiled from: RoomOpenHelper */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f4777a;

        /* renamed from: b  reason: collision with root package name */
        public final String f4778b;

        public b(boolean z10, String str) {
            this.f4777a = z10;
            this.f4778b = str;
        }
    }

    public i(a aVar, a aVar2, String str, String str2) {
        super(aVar2.f4776a);
        this.f4772b = aVar;
        this.f4773c = aVar2;
        this.f4774d = str;
        this.f4775e = str2;
    }

    /* JADX INFO: finally extract failed */
    private void h(c1.b bVar) {
        if (k(bVar)) {
            String str = null;
            Cursor s02 = bVar.s0(new c1.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (s02.moveToFirst()) {
                    str = s02.getString(0);
                }
                s02.close();
                if (!this.f4774d.equals(str) && !this.f4775e.equals(str)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
            } catch (Throwable th) {
                s02.close();
                throw th;
            }
        } else {
            b g10 = this.f4773c.g(bVar);
            if (g10.f4777a) {
                this.f4773c.e(bVar);
                l(bVar);
                return;
            }
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f4778b);
        }
    }

    private void i(c1.b bVar) {
        bVar.s("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean j(c1.b bVar) {
        Cursor V = bVar.V("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (V.moveToFirst() && V.getInt(0) == 0) {
                z10 = true;
            }
            return z10;
        } finally {
            V.close();
        }
    }

    private static boolean k(c1.b bVar) {
        Cursor V = bVar.V("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z10 = false;
            if (V.moveToFirst() && V.getInt(0) != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            V.close();
        }
    }

    private void l(c1.b bVar) {
        i(bVar);
        bVar.s(y0.b.a(this.f4774d));
    }

    public void b(c1.b bVar) {
        super.b(bVar);
    }

    public void d(c1.b bVar) {
        boolean j10 = j(bVar);
        this.f4773c.a(bVar);
        if (!j10) {
            b g10 = this.f4773c.g(bVar);
            if (!g10.f4777a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f4778b);
            }
        }
        l(bVar);
        this.f4773c.c(bVar);
    }

    public void e(c1.b bVar, int i10, int i11) {
        g(bVar, i10, i11);
    }

    public void f(c1.b bVar) {
        super.f(bVar);
        h(bVar);
        this.f4773c.d(bVar);
        this.f4772b = null;
    }

    public void g(c1.b bVar, int i10, int i11) {
        boolean z10;
        List<z0.a> c10;
        a aVar = this.f4772b;
        if (aVar == null || (c10 = aVar.f4678d.c(i10, i11)) == null) {
            z10 = false;
        } else {
            this.f4773c.f(bVar);
            for (z0.a a10 : c10) {
                a10.a(bVar);
            }
            b g10 = this.f4773c.g(bVar);
            if (g10.f4777a) {
                this.f4773c.e(bVar);
                l(bVar);
                z10 = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + g10.f4778b);
            }
        }
        if (!z10) {
            a aVar2 = this.f4772b;
            if (aVar2 == null || aVar2.a(i10, i11)) {
                throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f4773c.b(bVar);
            this.f4773c.a(bVar);
        }
    }
}
