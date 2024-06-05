package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.onesignal.k3;
import java.util.ArrayList;
import la.i;

/* compiled from: OneSignalDbHelper */
class r3 extends SQLiteOpenHelper implements q3 {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f28113a = new Object();

    /* renamed from: b  reason: collision with root package name */
    protected static final String[] f28114b = {"CREATE INDEX notification_notification_id_idx ON notification(notification_id); ", "CREATE INDEX notification_android_notification_id_idx ON notification(android_notification_id); ", "CREATE INDEX notification_group_id_idx ON notification(group_id); ", "CREATE INDEX notification_collapse_id_idx ON notification(collapse_id); ", "CREATE INDEX notification_created_time_idx ON notification(created_time); ", "CREATE INDEX notification_expire_time_idx ON notification(expire_time); "};

    /* renamed from: c  reason: collision with root package name */
    private static v1 f28115c = new u1();

    /* renamed from: d  reason: collision with root package name */
    private static r3 f28116d;

    /* renamed from: f  reason: collision with root package name */
    private static i f28117f = new i();

    r3(Context context) {
        super(context, "OneSignal.db", (SQLiteDatabase.CursorFactory) null, u());
    }

    public static r3 A(Context context) {
        if (f28116d == null) {
            synchronized (f28113a) {
                if (f28116d == null) {
                    f28116d = new r3(context.getApplicationContext());
                }
            }
        }
        return f28116d;
    }

    private SQLiteDatabase B() {
        SQLiteDatabase writableDatabase;
        synchronized (f28113a) {
            try {
                writableDatabase = getWritableDatabase();
            } catch (SQLiteCantOpenDatabaseException e10) {
                e = e10;
                throw e;
            } catch (SQLiteDatabaseLockedException e11) {
                e = e11;
                throw e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return writableDatabase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0012 A[Catch:{ SQLiteCantOpenDatabaseException -> 0x000f, SQLiteDatabaseLockedException -> 0x000d, all -> 0x000b }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0018 A[Catch:{ SQLiteCantOpenDatabaseException -> 0x000f, SQLiteDatabaseLockedException -> 0x000d, all -> 0x000b }, LOOP:0: B:3:0x0005->B:17:0x0018, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x001f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.database.sqlite.SQLiteDatabase J() {
        /*
            r5 = this;
            java.lang.Object r0 = f28113a
            monitor-enter(r0)
            r1 = 0
            r2 = 0
        L_0x0005:
            android.database.sqlite.SQLiteDatabase r1 = r5.B()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x000f, SQLiteDatabaseLockedException -> 0x000d }
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            return r1
        L_0x000b:
            r1 = move-exception
            goto L_0x0020
        L_0x000d:
            r3 = move-exception
            goto L_0x0010
        L_0x000f:
            r3 = move-exception
        L_0x0010:
            if (r1 != 0) goto L_0x0013
            r1 = r3
        L_0x0013:
            int r2 = r2 + 1
            r3 = 5
            if (r2 >= r3) goto L_0x001f
            int r3 = r2 * 400
            long r3 = (long) r3     // Catch:{ all -> 0x000b }
            android.os.SystemClock.sleep(r3)     // Catch:{ all -> 0x000b }
            goto L_0x0005
        L_0x001f:
            throw r1     // Catch:{ all -> 0x000b }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.r3.J():android.database.sqlite.SQLiteDatabase");
    }

    private void R(SQLiteDatabase sQLiteDatabase, int i10) {
        if (i10 < 2) {
            h0(sQLiteDatabase);
        }
        if (i10 < 3) {
            i0(sQLiteDatabase);
        }
        if (i10 < 4) {
            l0(sQLiteDatabase);
        }
        if (i10 < 5) {
            n0(sQLiteDatabase);
        }
        if (i10 == 5) {
            g0(sQLiteDatabase);
        }
        if (i10 < 7) {
            u0(sQLiteDatabase);
        }
        if (i10 < 8) {
            v0(sQLiteDatabase);
        }
    }

    static StringBuilder Z() {
        long b10 = k3.N0().b() / 1000;
        StringBuilder sb2 = new StringBuilder("created_time > " + (b10 - 604800) + " AND " + "dismissed" + " = 0 AND " + "opened" + " = 0 AND " + "is_summary" + " = 0");
        if (k3.A0().m()) {
            sb2.append(" AND expire_time > " + b10);
        }
        return sb2;
    }

    private static void e0(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (SQLiteException e10) {
            e10.printStackTrace();
        }
    }

    private static void g0(SQLiteDatabase sQLiteDatabase) {
        f28117f.b(sQLiteDatabase);
    }

    private static void h0(SQLiteDatabase sQLiteDatabase) {
        e0(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN collapse_id TEXT;");
        e0(sQLiteDatabase, "CREATE INDEX notification_group_id_idx ON notification(group_id); ");
    }

    private static void i0(SQLiteDatabase sQLiteDatabase) {
        e0(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN expire_time TIMESTAMP;");
        e0(sQLiteDatabase, "UPDATE notification SET expire_time = created_time + 259200;");
        e0(sQLiteDatabase, "CREATE INDEX notification_expire_time_idx ON notification(expire_time); ");
    }

    private static void l0(SQLiteDatabase sQLiteDatabase) {
        e0(sQLiteDatabase, "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_ids TEXT,name TEXT,session TEXT,params TEXT,timestamp TIMESTAMP);");
    }

    private static void n0(SQLiteDatabase sQLiteDatabase) {
        e0(sQLiteDatabase, "CREATE TABLE cached_unique_outcome_notification (_id INTEGER PRIMARY KEY,notification_id TEXT,name TEXT);");
        g0(sQLiteDatabase);
    }

    private static int u() {
        return 8;
    }

    private static void u0(SQLiteDatabase sQLiteDatabase) {
        e0(sQLiteDatabase, "CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);");
    }

    private void v0(SQLiteDatabase sQLiteDatabase) {
        f28117f.c(sQLiteDatabase);
        f28117f.a(sQLiteDatabase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r8 = f28115c;
        r9 = "Error closing transaction! ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r8 = f28115c;
        r9 = "Error closing transaction! ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a0, code lost:
        if (r1 != null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r1.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        f28115c.c("Error closing transaction! ", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00af, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b0, code lost:
        f28115c.c("Error closing transaction! ", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b7, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r7 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x0010, B:17:0x002d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void L(java.lang.String r7, java.lang.String r8, android.content.ContentValues r9) throws android.database.SQLException {
        /*
            r6 = this;
            java.lang.Object r0 = f28113a
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = r6.J()     // Catch:{ all -> 0x00b8 }
            r1.beginTransaction()     // Catch:{ SQLiteException -> 0x0065, IllegalStateException -> 0x002c }
            r1.insertOrThrow(r7, r8, r9)     // Catch:{ SQLiteException -> 0x0065, IllegalStateException -> 0x002c }
            r1.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x0065, IllegalStateException -> 0x002c }
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x001f, SQLiteException -> 0x0015 }
            goto L_0x009e
        L_0x0015:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
        L_0x001a:
            r8.c(r9, r7)     // Catch:{ all -> 0x00b8 }
            goto L_0x009e
        L_0x001f:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
        L_0x0024:
            r8.c(r9, r7)     // Catch:{ all -> 0x00b8 }
            goto L_0x009e
        L_0x0029:
            r7 = move-exception
            goto L_0x00a0
        L_0x002c:
            r2 = move-exception
            com.onesignal.v1 r3 = f28115c     // Catch:{ all -> 0x0029 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
            r4.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r5 = "Error under inserting or throw transaction under table: "
            r4.append(r5)     // Catch:{ all -> 0x0029 }
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " with nullColumnHack: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r8)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " and values: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r9)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0029 }
            r3.c(r7, r2)     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x009e
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x005f, SQLiteException -> 0x0059 }
            goto L_0x009e
        L_0x0059:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x001a
        L_0x005f:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0024
        L_0x0065:
            r2 = move-exception
            com.onesignal.v1 r3 = f28115c     // Catch:{ all -> 0x0029 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
            r4.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r5 = "Error inserting or throw on table: "
            r4.append(r5)     // Catch:{ all -> 0x0029 }
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " with nullColumnHack: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r8)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " and values: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r9)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0029 }
            r3.c(r7, r2)     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x009e
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x0098, SQLiteException -> 0x0092 }
            goto L_0x009e
        L_0x0092:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x001a
        L_0x0098:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0024
        L_0x009e:
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            return
        L_0x00a0:
            if (r1 == 0) goto L_0x00b7
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x00af, SQLiteException -> 0x00a6 }
            goto L_0x00b7
        L_0x00a6:
            r8 = move-exception
            com.onesignal.v1 r9 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = "Error closing transaction! "
            r9.c(r1, r8)     // Catch:{ all -> 0x00b8 }
            goto L_0x00b7
        L_0x00af:
            r8 = move-exception
            com.onesignal.v1 r9 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = "Error closing transaction! "
            r9.c(r1, r8)     // Catch:{ all -> 0x00b8 }
        L_0x00b7:
            throw r7     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.r3.L(java.lang.String, java.lang.String, android.content.ContentValues):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r8 = f28115c;
        r9 = "Error closing transaction! ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        r8 = f28115c;
        r9 = "Error closing transaction! ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b0, code lost:
        if (r2 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r2.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b6, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        f28115c.c("Error closing transaction! ", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bf, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c0, code lost:
        f28115c.c("Error closing transaction! ", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c7, code lost:
        throw r7;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0020, B:21:0x003d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int h(java.lang.String r7, android.content.ContentValues r8, java.lang.String r9, java.lang.String[] r10) {
        /*
            r6 = this;
            r0 = 0
            if (r8 == 0) goto L_0x00cb
            java.lang.String r1 = r8.toString()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x000f
            goto L_0x00cb
        L_0x000f:
            java.lang.Object r1 = f28113a
            monitor-enter(r1)
            android.database.sqlite.SQLiteDatabase r2 = r6.J()     // Catch:{ all -> 0x00c8 }
            r2.beginTransaction()     // Catch:{ SQLiteException -> 0x0075, IllegalStateException -> 0x003c }
            int r0 = r2.update(r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0075, IllegalStateException -> 0x003c }
            r2.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x0075, IllegalStateException -> 0x003c }
            r2.endTransaction()     // Catch:{ IllegalStateException -> 0x002f, SQLiteException -> 0x0025 }
            goto L_0x00ae
        L_0x0025:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00c8 }
            java.lang.String r9 = "Error closing transaction! "
        L_0x002a:
            r8.c(r9, r7)     // Catch:{ all -> 0x00c8 }
            goto L_0x00ae
        L_0x002f:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00c8 }
            java.lang.String r9 = "Error closing transaction! "
        L_0x0034:
            r8.c(r9, r7)     // Catch:{ all -> 0x00c8 }
            goto L_0x00ae
        L_0x0039:
            r7 = move-exception
            goto L_0x00b0
        L_0x003c:
            r8 = move-exception
            com.onesignal.v1 r3 = f28115c     // Catch:{ all -> 0x0039 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            r4.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r5 = "Error under update transaction under table: "
            r4.append(r5)     // Catch:{ all -> 0x0039 }
            r4.append(r7)     // Catch:{ all -> 0x0039 }
            java.lang.String r7 = " with whereClause: "
            r4.append(r7)     // Catch:{ all -> 0x0039 }
            r4.append(r9)     // Catch:{ all -> 0x0039 }
            java.lang.String r7 = " and whereArgs: "
            r4.append(r7)     // Catch:{ all -> 0x0039 }
            r4.append(r10)     // Catch:{ all -> 0x0039 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0039 }
            r3.c(r7, r8)     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x00ae
            r2.endTransaction()     // Catch:{ IllegalStateException -> 0x006f, SQLiteException -> 0x0069 }
            goto L_0x00ae
        L_0x0069:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00c8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x002a
        L_0x006f:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00c8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0034
        L_0x0075:
            r8 = move-exception
            com.onesignal.v1 r3 = f28115c     // Catch:{ all -> 0x0039 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            r4.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r5 = "Error updating on table: "
            r4.append(r5)     // Catch:{ all -> 0x0039 }
            r4.append(r7)     // Catch:{ all -> 0x0039 }
            java.lang.String r7 = " with whereClause: "
            r4.append(r7)     // Catch:{ all -> 0x0039 }
            r4.append(r9)     // Catch:{ all -> 0x0039 }
            java.lang.String r7 = " and whereArgs: "
            r4.append(r7)     // Catch:{ all -> 0x0039 }
            r4.append(r10)     // Catch:{ all -> 0x0039 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0039 }
            r3.c(r7, r8)     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x00ae
            r2.endTransaction()     // Catch:{ IllegalStateException -> 0x00a8, SQLiteException -> 0x00a2 }
            goto L_0x00ae
        L_0x00a2:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00c8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x002a
        L_0x00a8:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00c8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0034
        L_0x00ae:
            monitor-exit(r1)     // Catch:{ all -> 0x00c8 }
            return r0
        L_0x00b0:
            if (r2 == 0) goto L_0x00c7
            r2.endTransaction()     // Catch:{ IllegalStateException -> 0x00bf, SQLiteException -> 0x00b6 }
            goto L_0x00c7
        L_0x00b6:
            r8 = move-exception
            com.onesignal.v1 r9 = f28115c     // Catch:{ all -> 0x00c8 }
            java.lang.String r10 = "Error closing transaction! "
            r9.c(r10, r8)     // Catch:{ all -> 0x00c8 }
            goto L_0x00c7
        L_0x00bf:
            r8 = move-exception
            com.onesignal.v1 r9 = f28115c     // Catch:{ all -> 0x00c8 }
            java.lang.String r10 = "Error closing transaction! "
            r9.c(r10, r8)     // Catch:{ all -> 0x00c8 }
        L_0x00c7:
            throw r7     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c8 }
            throw r7
        L_0x00cb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.r3.h(java.lang.String, android.content.ContentValues, java.lang.String, java.lang.String[]):int");
    }

    public Cursor i(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        Cursor query;
        synchronized (f28113a) {
            query = J().query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        }
        return query;
    }

    public Cursor j(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        Cursor query;
        synchronized (f28113a) {
            query = J().query(str, strArr, str2, strArr2, str3, str4, str5);
        }
        return query;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r8 = f28115c;
        r9 = "Error closing transaction! ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r8 = f28115c;
        r9 = "Error closing transaction! ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a0, code lost:
        if (r1 != null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r1.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        f28115c.c("Error closing transaction! ", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00af, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b0, code lost:
        f28115c.c("Error closing transaction! ", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b7, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r7 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x0010, B:17:0x002d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(java.lang.String r7, java.lang.String r8, java.lang.String[] r9) {
        /*
            r6 = this;
            java.lang.Object r0 = f28113a
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = r6.J()     // Catch:{ all -> 0x00b8 }
            r1.beginTransaction()     // Catch:{ SQLiteException -> 0x0065, IllegalStateException -> 0x002c }
            r1.delete(r7, r8, r9)     // Catch:{ SQLiteException -> 0x0065, IllegalStateException -> 0x002c }
            r1.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x0065, IllegalStateException -> 0x002c }
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x001f, SQLiteException -> 0x0015 }
            goto L_0x009e
        L_0x0015:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
        L_0x001a:
            r8.c(r9, r7)     // Catch:{ all -> 0x00b8 }
            goto L_0x009e
        L_0x001f:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
        L_0x0024:
            r8.c(r9, r7)     // Catch:{ all -> 0x00b8 }
            goto L_0x009e
        L_0x0029:
            r7 = move-exception
            goto L_0x00a0
        L_0x002c:
            r2 = move-exception
            com.onesignal.v1 r3 = f28115c     // Catch:{ all -> 0x0029 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
            r4.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r5 = "Error under delete transaction under table: "
            r4.append(r5)     // Catch:{ all -> 0x0029 }
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " with whereClause: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r8)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " and whereArgs: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r9)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0029 }
            r3.c(r7, r2)     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x009e
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x005f, SQLiteException -> 0x0059 }
            goto L_0x009e
        L_0x0059:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x001a
        L_0x005f:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0024
        L_0x0065:
            r2 = move-exception
            com.onesignal.v1 r3 = f28115c     // Catch:{ all -> 0x0029 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
            r4.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r5 = "Error deleting on table: "
            r4.append(r5)     // Catch:{ all -> 0x0029 }
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " with whereClause: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r8)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " and whereArgs: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r9)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0029 }
            r3.c(r7, r2)     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x009e
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x0098, SQLiteException -> 0x0092 }
            goto L_0x009e
        L_0x0092:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x001a
        L_0x0098:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0024
        L_0x009e:
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            return
        L_0x00a0:
            if (r1 == 0) goto L_0x00b7
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x00af, SQLiteException -> 0x00a6 }
            goto L_0x00b7
        L_0x00a6:
            r8 = move-exception
            com.onesignal.v1 r9 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = "Error closing transaction! "
            r9.c(r1, r8)     // Catch:{ all -> 0x00b8 }
            goto L_0x00b7
        L_0x00af:
            r8 = move-exception
            com.onesignal.v1 r9 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = "Error closing transaction! "
            r9.c(r1, r8)     // Catch:{ all -> 0x00b8 }
        L_0x00b7:
            throw r7     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.r3.n(java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (f28113a) {
            sQLiteDatabase.execSQL("CREATE TABLE notification (_id INTEGER PRIMARY KEY,notification_id TEXT,android_notification_id INTEGER,group_id TEXT,collapse_id TEXT,is_summary INTEGER DEFAULT 0,opened INTEGER DEFAULT 0,dismissed INTEGER DEFAULT 0,title TEXT,message TEXT,full_data TEXT,created_time TIMESTAMP DEFAULT (strftime('%s', 'now')),expire_time TIMESTAMP);");
            sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
            sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);");
            for (String execSQL : f28114b) {
                sQLiteDatabase.execSQL(execSQL);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        k3.a(k3.r0.WARN, "SDK version rolled back! Clearing OneSignal.db as it could be in an unexpected state.");
        synchronized (f28113a) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", (String[]) null);
            try {
                ArrayList<String> arrayList = new ArrayList<>(rawQuery.getCount());
                while (rawQuery.moveToNext()) {
                    arrayList.add(rawQuery.getString(0));
                }
                for (String str : arrayList) {
                    if (!str.startsWith("sqlite_")) {
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                    }
                }
                rawQuery.close();
                onCreate(sQLiteDatabase);
            } catch (Throwable th) {
                rawQuery.close();
                throw th;
            }
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.a(r0Var, "OneSignal Database onUpgrade from: " + i10 + " to: " + i11);
        synchronized (f28113a) {
            try {
                R(sQLiteDatabase, i10);
            } catch (SQLiteException e10) {
                k3.b(k3.r0.ERROR, "Error in upgrade, migration may have already run! Skipping!", e10);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r8 = f28115c;
        r9 = "Error closing transaction! ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r8 = f28115c;
        r9 = "Error closing transaction! ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a0, code lost:
        if (r1 != null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r1.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        f28115c.c("Error closing transaction! ", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00af, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b0, code lost:
        f28115c.c("Error closing transaction! ", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b7, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r7 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x0010, B:17:0x002d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(java.lang.String r7, java.lang.String r8, android.content.ContentValues r9) {
        /*
            r6 = this;
            java.lang.Object r0 = f28113a
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = r6.J()     // Catch:{ all -> 0x00b8 }
            r1.beginTransaction()     // Catch:{ SQLiteException -> 0x0065, IllegalStateException -> 0x002c }
            r1.insert(r7, r8, r9)     // Catch:{ SQLiteException -> 0x0065, IllegalStateException -> 0x002c }
            r1.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x0065, IllegalStateException -> 0x002c }
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x001f, SQLiteException -> 0x0015 }
            goto L_0x009e
        L_0x0015:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
        L_0x001a:
            r8.c(r9, r7)     // Catch:{ all -> 0x00b8 }
            goto L_0x009e
        L_0x001f:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
        L_0x0024:
            r8.c(r9, r7)     // Catch:{ all -> 0x00b8 }
            goto L_0x009e
        L_0x0029:
            r7 = move-exception
            goto L_0x00a0
        L_0x002c:
            r2 = move-exception
            com.onesignal.v1 r3 = f28115c     // Catch:{ all -> 0x0029 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
            r4.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r5 = "Error under inserting transaction under table: "
            r4.append(r5)     // Catch:{ all -> 0x0029 }
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " with nullColumnHack: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r8)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " and values: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r9)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0029 }
            r3.c(r7, r2)     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x009e
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x005f, SQLiteException -> 0x0059 }
            goto L_0x009e
        L_0x0059:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x001a
        L_0x005f:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0024
        L_0x0065:
            r2 = move-exception
            com.onesignal.v1 r3 = f28115c     // Catch:{ all -> 0x0029 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
            r4.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r5 = "Error inserting on table: "
            r4.append(r5)     // Catch:{ all -> 0x0029 }
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " with nullColumnHack: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r8)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " and values: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r9)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0029 }
            r3.c(r7, r2)     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x009e
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x0098, SQLiteException -> 0x0092 }
            goto L_0x009e
        L_0x0092:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x001a
        L_0x0098:
            r7 = move-exception
            com.onesignal.v1 r8 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0024
        L_0x009e:
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            return
        L_0x00a0:
            if (r1 == 0) goto L_0x00b7
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x00af, SQLiteException -> 0x00a6 }
            goto L_0x00b7
        L_0x00a6:
            r8 = move-exception
            com.onesignal.v1 r9 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = "Error closing transaction! "
            r9.c(r1, r8)     // Catch:{ all -> 0x00b8 }
            goto L_0x00b7
        L_0x00af:
            r8 = move-exception
            com.onesignal.v1 r9 = f28115c     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = "Error closing transaction! "
            r9.c(r1, r8)     // Catch:{ all -> 0x00b8 }
        L_0x00b7:
            throw r7     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.r3.q(java.lang.String, java.lang.String, android.content.ContentValues):void");
    }
}
