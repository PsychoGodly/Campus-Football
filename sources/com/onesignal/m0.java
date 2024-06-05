package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: NotificationLimitManager */
class m0 {

    /* renamed from: a  reason: collision with root package name */
    static final String f28046a = Integer.toString(49);

    static void a(Context context, int i10) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                c(context, i10);
            } else {
                b(context, i10);
            }
        } catch (Throwable unused) {
            b(context, i10);
        }
    }

    static void b(Context context, int i10) {
        r3 A = r3.A(context);
        Cursor cursor = null;
        try {
            cursor = A.i("notification", new String[]{"android_notification_id"}, r3.Z().toString(), (String[]) null, (String) null, (String) null, "_id", e() + i10);
            int count = (cursor.getCount() - d()) + i10;
            if (count >= 1) {
                do {
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    k3.R1(cursor.getInt(cursor.getColumnIndex("android_notification_id")));
                    count--;
                } while (count > 0);
                if (cursor.isClosed()) {
                    return;
                }
                cursor.close();
            } else if (!cursor.isClosed()) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
    }

    static void c(Context context, int i10) throws Throwable {
        StatusBarNotification[] d10 = s3.d(context);
        int length = (d10.length - d()) + i10;
        if (length >= 1) {
            TreeMap treeMap = new TreeMap();
            for (StatusBarNotification statusBarNotification : d10) {
                if (!f(statusBarNotification)) {
                    treeMap.put(Long.valueOf(statusBarNotification.getNotification().when), Integer.valueOf(statusBarNotification.getId()));
                }
            }
            for (Map.Entry value : treeMap.entrySet()) {
                k3.R1(((Integer) value.getValue()).intValue());
                length--;
                if (length <= 0) {
                    return;
                }
            }
        }
    }

    private static int d() {
        return 49;
    }

    private static String e() {
        return f28046a;
    }

    static boolean f(StatusBarNotification statusBarNotification) {
        return (statusBarNotification.getNotification().flags & 512) != 0;
    }
}
