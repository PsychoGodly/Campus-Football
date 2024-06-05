package com.onesignal;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import androidx.core.app.l;
import androidx.core.app.o;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: OneSignalNotificationManager */
public class s3 {
    public static boolean a(Context context, String str) {
        NotificationChannel notificationChannel;
        if (!o.e(context).a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = i(context).getNotificationChannel(str)) == null || notificationChannel.getImportance() != 0) {
            return true;
        }
        return false;
    }

    static void b(Context context, ArrayList<StatusBarNotification> arrayList) {
        Iterator<StatusBarNotification> it = arrayList.iterator();
        while (it.hasNext()) {
            StatusBarNotification next = it.next();
            o.e(context).g(next.getId(), Notification.Builder.recoverBuilder(context, next.getNotification()).setGroup("os_group_undefined").setOnlyAlertOnce(true).build());
        }
    }

    static ArrayList<StatusBarNotification> c(Context context) {
        ArrayList<StatusBarNotification> arrayList = new ArrayList<>();
        for (StatusBarNotification statusBarNotification : d(context)) {
            Notification notification = statusBarNotification.getNotification();
            boolean f10 = m0.f(statusBarNotification);
            boolean z10 = notification.getGroup() == null || notification.getGroup().equals(g());
            if (!f10 && z10) {
                arrayList.add(statusBarNotification);
            }
        }
        return arrayList;
    }

    static StatusBarNotification[] d(Context context) {
        try {
            return i(context).getActiveNotifications();
        } catch (Throwable unused) {
            return new StatusBarNotification[0];
        }
    }

    static Integer e(Context context) {
        int i10 = 0;
        for (StatusBarNotification statusBarNotification : d(context)) {
            if (!l.b(statusBarNotification.getNotification()) && "os_group_undefined".equals(statusBarNotification.getNotification().getGroup())) {
                i10++;
            }
        }
        return Integer.valueOf(i10);
    }

    static int f() {
        return -718463522;
    }

    static String g() {
        return "os_group_undefined";
    }

    static Integer h(r3 r3Var, String str, boolean z10) {
        String str2 = z10 ? "group_id IS NULL" : "group_id = ?";
        Cursor i10 = r3Var.i("notification", (String[]) null, str2 + " AND dismissed = 0 AND opened = 0 AND is_summary = 0", z10 ? null : new String[]{str}, (String) null, (String) null, "created_time DESC", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        if (!i10.moveToFirst()) {
            i10.close();
            return null;
        }
        Integer valueOf = Integer.valueOf(i10.getInt(i10.getColumnIndex("android_notification_id")));
        i10.close();
        return valueOf;
    }

    static NotificationManager i(Context context) {
        return (NotificationManager) context.getSystemService("notification");
    }
}
