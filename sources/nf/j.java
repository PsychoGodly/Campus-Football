package nf;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: TaskDao.kt */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final k f36575a;

    /* renamed from: b  reason: collision with root package name */
    private final String[] f36576b = {"_id", "task_id", "progress", "status", "url", "file_name", "saved_dir", "headers", "mime_type", "resumable", "open_file_from_notification", "show_notification", "time_created", "save_in_public_storage", "allow_cellular"};

    public j(k kVar) {
        k kVar2 = kVar;
        m.e(kVar2, "dbHelper");
        this.f36575a = kVar2;
    }

    private final c f(Cursor cursor) {
        Cursor cursor2 = cursor;
        int i10 = cursor2.getInt(cursor2.getColumnIndexOrThrow("_id"));
        String string = cursor2.getString(cursor2.getColumnIndexOrThrow("task_id"));
        int i11 = cursor2.getInt(cursor2.getColumnIndexOrThrow("status"));
        int i12 = cursor2.getInt(cursor2.getColumnIndexOrThrow("progress"));
        String string2 = cursor2.getString(cursor2.getColumnIndexOrThrow("url"));
        String string3 = cursor2.getString(cursor2.getColumnIndexOrThrow("file_name"));
        String string4 = cursor2.getString(cursor2.getColumnIndexOrThrow("saved_dir"));
        String string5 = cursor2.getString(cursor2.getColumnIndexOrThrow("headers"));
        String string6 = cursor2.getString(cursor2.getColumnIndexOrThrow("mime_type"));
        short s10 = cursor2.getShort(cursor2.getColumnIndexOrThrow("resumable"));
        short s11 = cursor2.getShort(cursor2.getColumnIndexOrThrow("show_notification"));
        short s12 = cursor2.getShort(cursor2.getColumnIndexOrThrow("open_file_from_notification"));
        long j10 = cursor2.getLong(cursor2.getColumnIndexOrThrow("time_created"));
        short s13 = cursor2.getShort(cursor2.getColumnIndexOrThrow("save_in_public_storage"));
        String str = string3;
        short s14 = cursor2.getShort(cursor2.getColumnIndexOrThrow("allow_cellular"));
        m.d(string, "taskId");
        a aVar = a.values()[i11];
        m.d(string2, "url");
        m.d(string4, "savedDir");
        m.d(string5, "headers");
        m.d(string6, "mimeType");
        return new c(i10, string, aVar, i12, string2, str, string4, string5, string6, s10 == 1, s11 == 1, s12 == 1, j10, s13 == 1, s14 == 1);
    }

    public final void a(String str) {
        m.e(str, "taskId");
        SQLiteDatabase writableDatabase = this.f36575a.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.delete("task", "task_id = ?", new String[]{str});
            writableDatabase.setTransactionSuccessful();
        } catch (Exception e10) {
            e10.printStackTrace();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        writableDatabase.endTransaction();
    }

    public final void b(String str, String str2, a aVar, int i10, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, boolean z13) {
        m.e(aVar, "status");
        SQLiteDatabase writableDatabase = this.f36575a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("task_id", str);
        contentValues.put("url", str2);
        contentValues.put("status", Integer.valueOf(aVar.ordinal()));
        contentValues.put("progress", Integer.valueOf(i10));
        contentValues.put("file_name", str3);
        contentValues.put("saved_dir", str4);
        contentValues.put("headers", str5);
        contentValues.put("mime_type", "unknown");
        contentValues.put("show_notification", Integer.valueOf(z10 ? 1 : 0));
        contentValues.put("open_file_from_notification", Integer.valueOf(z11 ? 1 : 0));
        contentValues.put("resumable", 0);
        contentValues.put("time_created", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("save_in_public_storage", Integer.valueOf(z12 ? 1 : 0));
        contentValues.put("allow_cellular", Integer.valueOf(z13 ? 1 : 0));
        writableDatabase.beginTransaction();
        try {
            writableDatabase.insertWithOnConflict("task", (String) null, contentValues, 5);
            writableDatabase.setTransactionSuccessful();
        } catch (Exception e10) {
            e10.printStackTrace();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        writableDatabase.endTransaction();
    }

    public final List<c> c() {
        Cursor query = this.f36575a.getReadableDatabase().query("task", this.f36576b, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            m.d(query, "cursor");
            arrayList.add(f(query));
        }
        query.close();
        return arrayList;
    }

    public final c d(String str) {
        m.e(str, "taskId");
        Cursor query = this.f36575a.getReadableDatabase().query("task", this.f36576b, "task_id = ?", new String[]{str}, (String) null, (String) null, "_id DESC", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        c cVar = null;
        while (query.moveToNext()) {
            m.d(query, "cursor");
            cVar = f(query);
        }
        query.close();
        return cVar;
    }

    public final List<c> e(String str) {
        Cursor rawQuery = this.f36575a.getReadableDatabase().rawQuery(str, (String[]) null);
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            m.d(rawQuery, "cursor");
            arrayList.add(f(rawQuery));
        }
        rawQuery.close();
        return arrayList;
    }

    public final void g(String str, String str2, String str3) {
        m.e(str, "taskId");
        SQLiteDatabase writableDatabase = this.f36575a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("file_name", str2);
        contentValues.put("mime_type", str3);
        writableDatabase.beginTransaction();
        try {
            writableDatabase.update("task", contentValues, "task_id = ?", new String[]{str});
            writableDatabase.setTransactionSuccessful();
        } catch (Exception e10) {
            e10.printStackTrace();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        writableDatabase.endTransaction();
    }

    public final void h(String str, String str2, a aVar, int i10, boolean z10) {
        m.e(str, "currentTaskId");
        m.e(aVar, "status");
        SQLiteDatabase writableDatabase = this.f36575a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("task_id", str2);
        contentValues.put("status", Integer.valueOf(aVar.ordinal()));
        contentValues.put("progress", Integer.valueOf(i10));
        contentValues.put("resumable", Integer.valueOf(z10 ? 1 : 0));
        contentValues.put("time_created", Long.valueOf(System.currentTimeMillis()));
        writableDatabase.beginTransaction();
        try {
            writableDatabase.update("task", contentValues, "task_id = ?", new String[]{str});
            writableDatabase.setTransactionSuccessful();
        } catch (Exception e10) {
            e10.printStackTrace();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        writableDatabase.endTransaction();
    }

    public final void i(String str, a aVar, int i10) {
        m.e(str, "taskId");
        m.e(aVar, "status");
        SQLiteDatabase writableDatabase = this.f36575a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(aVar.ordinal()));
        contentValues.put("progress", Integer.valueOf(i10));
        writableDatabase.beginTransaction();
        try {
            writableDatabase.update("task", contentValues, "task_id = ?", new String[]{str});
            writableDatabase.setTransactionSuccessful();
        } catch (Exception e10) {
            e10.printStackTrace();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        writableDatabase.endTransaction();
    }

    public final void j(String str, boolean z10) {
        m.e(str, "taskId");
        SQLiteDatabase writableDatabase = this.f36575a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("resumable", Integer.valueOf(z10 ? 1 : 0));
        writableDatabase.beginTransaction();
        try {
            writableDatabase.update("task", contentValues, "task_id = ?", new String[]{str});
            writableDatabase.setTransactionSuccessful();
        } catch (Exception e10) {
            e10.printStackTrace();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        writableDatabase.endTransaction();
    }
}
