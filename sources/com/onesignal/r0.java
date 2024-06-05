package com.onesignal;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.onesignal.k3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NotificationSummaryManager */
class r0 {
    static void a(Context context, r3 r3Var, String str) {
        Integer b10 = b(r3Var, str);
        boolean equals = str.equals(s3.g());
        NotificationManager i10 = s3.i(context);
        Integer h10 = s3.h(r3Var, str, equals);
        if (h10 == null) {
            return;
        }
        if (k3.Y()) {
            if (equals) {
                b10 = Integer.valueOf(s3.f());
            }
            if (b10 != null) {
                i10.cancel(b10.intValue());
                return;
            }
            return;
        }
        k3.R1(h10.intValue());
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Integer b(com.onesignal.q3 r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "android_notification_id"
            java.lang.String r4 = "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 1"
            r1 = 1
            java.lang.String[] r5 = new java.lang.String[r1]
            r1 = 0
            r5[r1] = r12
            r9 = 0
            java.lang.String r2 = "notification"
            java.lang.String[] r3 = new java.lang.String[]{r0}     // Catch:{ all -> 0x004a }
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r11
            android.database.Cursor r11 = r1.j(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x004a }
            boolean r1 = r11.moveToFirst()     // Catch:{ all -> 0x0045 }
            if (r1 != 0) goto L_0x002c
            r11.close()     // Catch:{ all -> 0x0045 }
            boolean r12 = r11.isClosed()
            if (r12 != 0) goto L_0x002b
            r11.close()
        L_0x002b:
            return r9
        L_0x002c:
            int r0 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0045 }
            int r0 = r11.getInt(r0)     // Catch:{ all -> 0x0045 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0045 }
            r11.close()     // Catch:{ all -> 0x0045 }
            boolean r12 = r11.isClosed()
            if (r12 != 0) goto L_0x006e
            r11.close()
            goto L_0x006e
        L_0x0045:
            r0 = move-exception
            r10 = r9
            r9 = r11
            r11 = r10
            goto L_0x004c
        L_0x004a:
            r0 = move-exception
            r11 = r9
        L_0x004c:
            com.onesignal.k3$r0 r1 = com.onesignal.k3.r0.ERROR     // Catch:{ all -> 0x006f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r2.<init>()     // Catch:{ all -> 0x006f }
            java.lang.String r3 = "Error getting android notification id for summary notification group: "
            r2.append(r3)     // Catch:{ all -> 0x006f }
            r2.append(r12)     // Catch:{ all -> 0x006f }
            java.lang.String r12 = r2.toString()     // Catch:{ all -> 0x006f }
            com.onesignal.k3.b(r1, r12, r0)     // Catch:{ all -> 0x006f }
            if (r9 == 0) goto L_0x006d
            boolean r12 = r9.isClosed()
            if (r12 != 0) goto L_0x006d
            r9.close()
        L_0x006d:
            r9 = r11
        L_0x006e:
            return r9
        L_0x006f:
            r11 = move-exception
            if (r9 == 0) goto L_0x007b
            boolean r12 = r9.isClosed()
            if (r12 != 0) goto L_0x007b
            r9.close()
        L_0x007b:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.r0.b(com.onesignal.q3, java.lang.String):java.lang.Integer");
    }

    private static Cursor c(Context context, q3 q3Var, String str, boolean z10) {
        Cursor j10 = q3Var.j("notification", new String[]{"android_notification_id", "created_time", "full_data"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{str}, (String) null, (String) null, "_id DESC");
        int count = j10.getCount();
        if (count == 0 && !str.equals(s3.g())) {
            j10.close();
            Integer b10 = b(q3Var, str);
            if (b10 == null) {
                return j10;
            }
            s3.i(context).cancel(b10.intValue());
            ContentValues contentValues = new ContentValues();
            contentValues.put(z10 ? "dismissed" : "opened", 1);
            q3Var.h("notification", contentValues, "android_notification_id = " + b10, (String[]) null);
            return j10;
        } else if (count == 1) {
            j10.close();
            if (b(q3Var, str) == null) {
                return j10;
            }
            d(context, str);
            return j10;
        } else {
            try {
                j10.moveToFirst();
                Long valueOf = Long.valueOf(j10.getLong(j10.getColumnIndex("created_time")));
                String string = j10.getString(j10.getColumnIndex("full_data"));
                j10.close();
                if (b(q3Var, str) == null) {
                    return j10;
                }
                b2 b2Var = new b2(context);
                b2Var.y(true);
                b2Var.z(valueOf);
                b2Var.q(new JSONObject(string));
                v.N(b2Var);
                return j10;
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    private static void d(Context context, String str) {
        String[] strArr = {str};
        Cursor cursor = null;
        try {
            cursor = r3.A(context).j("notification", OSNotificationRestoreWorkManager.f27502a, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", strArr, (String) null, (String) null, (String) null);
            OSNotificationRestoreWorkManager.e(context, cursor, 0);
            if (cursor == null || cursor.isClosed()) {
                return;
            }
        } catch (Throwable th) {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
        cursor.close();
    }

    static void e(Context context, q3 q3Var, int i10) {
        Cursor j10 = q3Var.j("notification", new String[]{"group_id"}, "android_notification_id = " + i10, (String[]) null, (String) null, (String) null, (String) null);
        if (j10.moveToFirst()) {
            String string = j10.getString(j10.getColumnIndex("group_id"));
            j10.close();
            if (string != null) {
                f(context, q3Var, string, true);
                return;
            }
            return;
        }
        j10.close();
    }

    static void f(Context context, q3 q3Var, String str, boolean z10) {
        try {
            Cursor c10 = c(context, q3Var, str, z10);
            if (c10 != null && !c10.isClosed()) {
                c10.close();
            }
        } catch (Throwable th) {
            k3.b(k3.r0.ERROR, "Error running updateSummaryNotificationAfterChildRemoved!", th);
        }
    }
}
