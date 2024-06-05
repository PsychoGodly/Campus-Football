package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.g;
import androidx.work.r;
import com.onesignal.k3;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

class OSNotificationRestoreWorkManager {

    /* renamed from: a  reason: collision with root package name */
    static final String[] f27502a = {"notification_id", "android_notification_id", "full_data", "created_time"};

    /* renamed from: b  reason: collision with root package name */
    private static final String f27503b = NotificationRestoreWorker.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    public static boolean f27504c;

    public static class NotificationRestoreWorker extends Worker {
        public NotificationRestoreWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        public ListenableWorker.a doWork() {
            Context applicationContext = getApplicationContext();
            if (k3.f27912f == null) {
                k3.e1(applicationContext);
            }
            if (!OSUtils.a(applicationContext)) {
                return ListenableWorker.a.a();
            }
            if (OSNotificationRestoreWorkManager.f27504c) {
                return ListenableWorker.a.a();
            }
            OSNotificationRestoreWorkManager.f27504c = true;
            k3.a(k3.r0.INFO, "Restoring notifications");
            r3 A = r3.A(applicationContext);
            StringBuilder Z = r3.Z();
            OSNotificationRestoreWorkManager.f(applicationContext, Z);
            OSNotificationRestoreWorkManager.d(applicationContext, A, Z);
            return ListenableWorker.a.c();
        }
    }

    public static void c(Context context, boolean z10) {
        j3.a(context).e(f27503b, g.KEEP, (r) ((r.a) new r.a(NotificationRestoreWorker.class).g((long) (z10 ? 15 : 0), TimeUnit.SECONDS)).b());
    }

    /* access modifiers changed from: private */
    public static void d(Context context, r3 r3Var, StringBuilder sb2) {
        k3.r0 r0Var = k3.r0.INFO;
        k3.a(r0Var, "Querying DB for notifications to restore: " + sb2.toString());
        Cursor cursor = null;
        try {
            cursor = r3Var.i("notification", f27502a, sb2.toString(), (String[]) null, (String) null, (String) null, "_id DESC", m0.f28046a);
            e(context, cursor, 200);
            l.c(r3Var, context);
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

    static void e(Context context, Cursor cursor, int i10) {
        if (cursor.moveToFirst()) {
            do {
                OSNotificationWorkManager.b(context, cursor.getString(cursor.getColumnIndex("notification_id")), cursor.getInt(cursor.getColumnIndex("android_notification_id")), cursor.getString(cursor.getColumnIndex("full_data")), cursor.getLong(cursor.getColumnIndex("created_time")), true, false);
                if (i10 > 0) {
                    OSUtils.W(i10);
                }
            } while (cursor.moveToNext());
        }
    }

    /* access modifiers changed from: private */
    public static void f(Context context, StringBuilder sb2) {
        if (Build.VERSION.SDK_INT >= 23) {
            StatusBarNotification[] d10 = s3.d(context);
            if (d10.length != 0) {
                ArrayList arrayList = new ArrayList();
                for (StatusBarNotification id2 : d10) {
                    arrayList.add(Integer.valueOf(id2.getId()));
                }
                sb2.append(" AND android_notification_id NOT IN (");
                sb2.append(TextUtils.join(",", arrayList));
                sb2.append(")");
            }
        }
    }
}
