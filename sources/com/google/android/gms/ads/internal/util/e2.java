package com.google.android.gms.ads.internal.util;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class e2 extends d2 {
    public final void f(Context context, String str, String str2) {
        NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", 2);
        notificationChannel.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    public final boolean g(Context context, String str) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        if (notificationChannel != null && notificationChannel.getImportance() == 0) {
            return true;
        }
        return false;
    }

    public final int h(Context context, TelephonyManager telephonyManager) {
        t.r();
        if (!b2.V(context, "android.permission.ACCESS_NETWORK_STATE") || !telephonyManager.isDataEnabled()) {
            return 1;
        }
        return 2;
    }
}
