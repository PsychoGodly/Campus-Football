package nf;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: TaskDbHelper.kt */
public final class k extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final a f36577a = new a((h) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static k f36578b;

    /* compiled from: TaskDbHelper.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final k a(Context context) {
            if (k.f36578b == null) {
                m.b(context);
                Context applicationContext = context.getApplicationContext();
                m.d(applicationContext, "ctx!!.applicationContext");
                k.f36578b = new k(applicationContext, (h) null);
            }
            k h10 = k.f36578b;
            m.b(h10);
            return h10;
        }
    }

    private k(Context context) {
        super(context, "download_tasks.db", (SQLiteDatabase.CursorFactory) null, 4);
    }

    public /* synthetic */ k(Context context, h hVar) {
        this(context);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m.e(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("CREATE TABLE task (_id INTEGER PRIMARY KEY,task_id VARCHAR(256), url TEXT, status INTEGER DEFAULT 0, progress INTEGER DEFAULT 0, file_name TEXT, saved_dir TEXT, headers TEXT, mime_type VARCHAR(128), resumable TINYINT DEFAULT 0, show_notification TINYINT DEFAULT 0, open_file_from_notification TINYINT DEFAULT 0, time_created INTEGER DEFAULT 0, save_in_public_storage TINYINT DEFAULT 0, allow_cellular TINYINT DEFAULT 1)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        m.e(sQLiteDatabase, "db");
        onUpgrade(sQLiteDatabase, i10, i11);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        m.e(sQLiteDatabase, "db");
        if (i11 == 4) {
            sQLiteDatabase.execSQL("ALTER TABLE task ADD COLUMN allow_cellular TINYINT DEFAULT 1");
        } else if (i10 == 2 && i11 == 3) {
            sQLiteDatabase.execSQL("ALTER TABLE task ADD COLUMN save_in_public_storage TINYINT DEFAULT 0");
        } else {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS task");
            onCreate(sQLiteDatabase);
        }
    }
}
