package com.onesignal;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.DeadSystemException;
import com.onesignal.k3;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NotificationChannelManager */
class l0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f28031a = Pattern.compile("^([A-Fa-f0-9]{8})$");

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(android.content.Context r7, android.app.NotificationManager r8, org.json.JSONObject r9) throws org.json.JSONException {
        /*
            java.lang.String r0 = "chnl"
            java.lang.Object r0 = r9.opt(r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0012
            org.json.JSONObject r1 = new org.json.JSONObject
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            goto L_0x0015
        L_0x0012:
            r1 = r0
            org.json.JSONObject r1 = (org.json.JSONObject) r1
        L_0x0015:
            java.lang.String r0 = "id"
            java.lang.String r2 = "fcm_fallback_notification_channel"
            java.lang.String r0 = r1.optString(r0, r2)
            java.lang.String r3 = "miscellaneous"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r2 = r0
        L_0x0027:
            java.lang.String r0 = "langs"
            boolean r3 = r1.has(r0)
            if (r3 == 0) goto L_0x0046
            org.json.JSONObject r0 = r1.getJSONObject(r0)
            ka.a r3 = ka.a.a()
            java.lang.String r3 = r3.b()
            boolean r4 = r0.has(r3)
            if (r4 == 0) goto L_0x0046
            org.json.JSONObject r0 = r0.optJSONObject(r3)
            goto L_0x0047
        L_0x0046:
            r0 = r1
        L_0x0047:
            java.lang.String r3 = "nm"
            java.lang.String r4 = "Miscellaneous"
            java.lang.String r3 = r0.optString(r3, r4)
            r4 = 6
            java.lang.String r5 = "pri"
            int r4 = r9.optInt(r5, r4)
            int r4 = f(r4)
            android.app.NotificationChannel r5 = new android.app.NotificationChannel
            r5.<init>(r2, r3, r4)
            java.lang.String r3 = "dscr"
            r4 = 0
            java.lang.String r3 = r0.optString(r3, r4)
            r5.setDescription(r3)
            java.lang.String r3 = "grp_id"
            boolean r6 = r1.has(r3)
            if (r6 == 0) goto L_0x0086
            java.lang.String r1 = r1.optString(r3)
            java.lang.String r3 = "grp_nm"
            java.lang.String r0 = r0.optString(r3)
            android.app.NotificationChannelGroup r3 = new android.app.NotificationChannelGroup
            r3.<init>(r1, r0)
            r8.createNotificationChannelGroup(r3)
            r5.setGroup(r1)
        L_0x0086:
            java.lang.String r0 = "ledc"
            boolean r1 = r9.has(r0)
            if (r1 == 0) goto L_0x00be
            java.lang.String r0 = r9.optString(r0)
            java.util.regex.Pattern r1 = f28031a
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.matches()
            if (r1 != 0) goto L_0x00a7
            com.onesignal.k3$r0 r0 = com.onesignal.k3.r0.WARN
            java.lang.String r1 = "OneSignal LED Color Settings: ARGB Hex value incorrect format (E.g: FF9900FF)"
            com.onesignal.k3.a(r0, r1)
            java.lang.String r0 = "FFFFFFFF"
        L_0x00a7:
            java.math.BigInteger r1 = new java.math.BigInteger     // Catch:{ all -> 0x00b6 }
            r3 = 16
            r1.<init>(r0, r3)     // Catch:{ all -> 0x00b6 }
            int r0 = r1.intValue()     // Catch:{ all -> 0x00b6 }
            r5.setLightColor(r0)     // Catch:{ all -> 0x00b6 }
            goto L_0x00be
        L_0x00b6:
            r0 = move-exception
            com.onesignal.k3$r0 r1 = com.onesignal.k3.r0.ERROR
            java.lang.String r3 = "Couldn't convert ARGB Hex value to BigInteger:"
            com.onesignal.k3.b(r1, r3, r0)
        L_0x00be:
            java.lang.String r0 = "led"
            r1 = 1
            int r0 = r9.optInt(r0, r1)
            r3 = 0
            if (r0 != r1) goto L_0x00ca
            r0 = 1
            goto L_0x00cb
        L_0x00ca:
            r0 = 0
        L_0x00cb:
            r5.enableLights(r0)
            java.lang.String r0 = "vib_pt"
            boolean r0 = r9.has(r0)
            if (r0 == 0) goto L_0x00df
            long[] r0 = com.onesignal.OSUtils.R(r9)
            if (r0 == 0) goto L_0x00df
            r5.setVibrationPattern(r0)
        L_0x00df:
            java.lang.String r0 = "vib"
            int r0 = r9.optInt(r0, r1)
            if (r0 != r1) goto L_0x00e9
            r0 = 1
            goto L_0x00ea
        L_0x00e9:
            r0 = 0
        L_0x00ea:
            r5.enableVibration(r0)
            java.lang.String r0 = "sound"
            boolean r6 = r9.has(r0)
            if (r6 == 0) goto L_0x0116
            java.lang.String r0 = r9.optString(r0, r4)
            android.net.Uri r7 = com.onesignal.OSUtils.n(r7, r0)
            if (r7 == 0) goto L_0x0103
            r5.setSound(r7, r4)
            goto L_0x0116
        L_0x0103:
            java.lang.String r7 = "null"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0113
            java.lang.String r7 = "nil"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0116
        L_0x0113:
            r5.setSound(r4, r4)
        L_0x0116:
            java.lang.String r7 = "vis"
            int r7 = r9.optInt(r7, r3)
            r5.setLockscreenVisibility(r7)
            java.lang.String r7 = "bdg"
            int r7 = r9.optInt(r7, r1)
            if (r7 != r1) goto L_0x0129
            r7 = 1
            goto L_0x012a
        L_0x0129:
            r7 = 0
        L_0x012a:
            r5.setShowBadge(r7)
            java.lang.String r7 = "bdnd"
            int r7 = r9.optInt(r7, r3)
            if (r7 != r1) goto L_0x0136
            goto L_0x0137
        L_0x0136:
            r1 = 0
        L_0x0137:
            r5.setBypassDnd(r1)
            com.onesignal.k3$r0 r7 = com.onesignal.k3.r0.VERBOSE
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Creating notification channel with channel:\n"
            r9.append(r0)
            java.lang.String r0 = r5.toString()
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.onesignal.k3.A1(r7, r9)
            r8.createNotificationChannel(r5)     // Catch:{ IllegalArgumentException -> 0x0158 }
            goto L_0x015c
        L_0x0158:
            r7 = move-exception
            r7.printStackTrace()
        L_0x015c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.l0.a(android.content.Context, android.app.NotificationManager, org.json.JSONObject):java.lang.String");
    }

    private static String b(NotificationManager notificationManager) {
        NotificationChannel notificationChannel = new NotificationChannel("fcm_fallback_notification_channel", "Miscellaneous", 3);
        notificationChannel.enableLights(true);
        notificationChannel.enableVibration(true);
        notificationManager.createNotificationChannel(notificationChannel);
        return "fcm_fallback_notification_channel";
    }

    static String c(b2 b2Var) {
        if (Build.VERSION.SDK_INT < 26) {
            return "fcm_fallback_notification_channel";
        }
        Context d10 = b2Var.d();
        JSONObject e10 = b2Var.e();
        NotificationManager i10 = s3.i(d10);
        if (b2Var.n()) {
            return d(i10);
        }
        if (e10.has("oth_chnl")) {
            String optString = e10.optString("oth_chnl");
            if (i10.getNotificationChannel(optString) != null) {
                return optString;
            }
        }
        if (!e10.has("chnl")) {
            return b(i10);
        }
        try {
            return a(d10, i10, e10);
        } catch (JSONException e11) {
            k3.b(k3.r0.ERROR, "Could not create notification channel due to JSON payload error!", e11);
            return "fcm_fallback_notification_channel";
        }
    }

    private static String d(NotificationManager notificationManager) {
        notificationManager.createNotificationChannel(new NotificationChannel("restored_OS_notifications", "Restored", 2));
        return "restored_OS_notifications";
    }

    private static List<NotificationChannel> e(NotificationManager notificationManager) {
        try {
            return notificationManager.getNotificationChannels();
        } catch (NullPointerException e10) {
            k3.r0 r0Var = k3.r0.ERROR;
            k3.A1(r0Var, "Error when trying to delete notification channel: " + e10.getMessage());
            return null;
        } catch (Exception e11) {
            if (e11 instanceof DeadSystemException) {
                return null;
            }
            throw e11;
        }
    }

    private static int f(int i10) {
        if (i10 > 9) {
            return 5;
        }
        if (i10 > 7) {
            return 4;
        }
        if (i10 > 5) {
            return 3;
        }
        if (i10 > 3) {
            return 2;
        }
        return i10 > 1 ? 1 : 0;
    }

    static void g(Context context, JSONArray jSONArray) {
        List<NotificationChannel> e10;
        if (Build.VERSION.SDK_INT >= 26 && jSONArray != null && jSONArray.length() != 0) {
            NotificationManager i10 = s3.i(context);
            HashSet hashSet = new HashSet();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    hashSet.add(a(context, i10, jSONArray.getJSONObject(i11)));
                } catch (JSONException e11) {
                    k3.b(k3.r0.ERROR, "Could not create notification channel due to JSON payload error!", e11);
                }
            }
            if (!hashSet.isEmpty() && (e10 = e(i10)) != null) {
                for (NotificationChannel id2 : e10) {
                    String id3 = id2.getId();
                    if (id3.startsWith("OS_") && !hashSet.contains(id3)) {
                        i10.deleteNotificationChannel(id3);
                    }
                }
            }
        }
    }
}
