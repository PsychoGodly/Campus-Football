package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class k4 extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ l4 f24741a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    k4(l4 l4Var, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f24741a = l4Var;
    }

    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e10) {
            throw e10;
        } catch (SQLiteException unused) {
            this.f24741a.zzj().B().a("Opening the local database failed, dropping and recreating it");
            if (!this.f24741a.zza().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f24741a.zzj().B().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e11) {
                this.f24741a.zzj().B().b("Failed to open local database. Events will bypass local storage", e11);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        r.b(this.f24741a.zzj(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        r.c(this.f24741a.zzj(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
