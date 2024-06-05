package j2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* compiled from: SchemaManager */
final class t0 extends SQLiteOpenHelper {

    /* renamed from: c  reason: collision with root package name */
    private static final String f19260c = ("INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")");

    /* renamed from: d  reason: collision with root package name */
    static int f19261d = 5;

    /* renamed from: f  reason: collision with root package name */
    private static final a f19262f;

    /* renamed from: g  reason: collision with root package name */
    private static final a f19263g;

    /* renamed from: h  reason: collision with root package name */
    private static final a f19264h;

    /* renamed from: i  reason: collision with root package name */
    private static final a f19265i;

    /* renamed from: j  reason: collision with root package name */
    private static final a f19266j;

    /* renamed from: k  reason: collision with root package name */
    private static final List<a> f19267k;

    /* renamed from: a  reason: collision with root package name */
    private final int f19268a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f19269b = false;

    /* compiled from: SchemaManager */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        r0 r0Var = r0.f35697a;
        f19262f = r0Var;
        o0 o0Var = o0.f35687a;
        f19263g = o0Var;
        p0 p0Var = p0.f35691a;
        f19264h = p0Var;
        q0 q0Var = q0.f35695a;
        f19265i = q0Var;
        s0 s0Var = s0.f35699a;
        f19266j = s0Var;
        f19267k = Arrays.asList(new a[]{r0Var, o0Var, p0Var, q0Var, s0Var});
    }

    t0(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f19268a = i10;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void A(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void B(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void L(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void R(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f19260c);
    }

    private void Z(SQLiteDatabase sQLiteDatabase, int i10) {
        u(sQLiteDatabase);
        e0(sQLiteDatabase, 0, i10);
    }

    private void e0(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = f19267k;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                f19267k.get(i10).a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    private void u(SQLiteDatabase sQLiteDatabase) {
        if (!this.f19269b) {
            onConfigure(sQLiteDatabase);
        }
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f19269b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Z(sQLiteDatabase, this.f19268a);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        Z(sQLiteDatabase, i11);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        u(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        u(sQLiteDatabase);
        e0(sQLiteDatabase, i10, i11);
    }
}
