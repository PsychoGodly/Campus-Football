package com.onesignal;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import androidx.core.app.o;
import com.onesignal.k3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NotificationOpenedProcessor */
class n0 {
    private static void a(JSONArray jSONArray, String str, r3 r3Var) {
        r3 r3Var2 = r3Var;
        Cursor j10 = r3Var2.j("notification", new String[]{"full_data"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{str}, (String) null, (String) null, (String) null);
        if (j10.getCount() > 1) {
            j10.moveToFirst();
            do {
                try {
                    jSONArray.put(new JSONObject(j10.getString(j10.getColumnIndex("full_data"))));
                } catch (JSONException unused) {
                    k3.r0 r0Var = k3.r0.ERROR;
                    k3.a(r0Var, "Could not parse JSON of sub notification in group: " + str);
                }
            } while (j10.moveToNext());
        }
        j10.close();
    }

    private static void b(Context context, r3 r3Var, String str) {
        if (str != null) {
            r0.a(context, r3Var, str);
        } else if (Build.VERSION.SDK_INT >= 23 && s3.e(context).intValue() < 1) {
            s3.i(context).cancel(s3.f());
        }
    }

    private static void c(Context context, Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            o.e(context).b(intent.getIntExtra("androidNotificationId", 0));
            if (Build.VERSION.SDK_INT < 31) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
    }

    private static boolean d(Intent intent) {
        return intent.hasExtra("onesignalData") || intent.hasExtra("summary") || intent.hasExtra("androidNotificationId");
    }

    private static void e(Context context, Intent intent, r3 r3Var, boolean z10) {
        String str;
        String stringExtra = intent.getStringExtra("summary");
        String[] strArr = null;
        if (stringExtra != null) {
            boolean equals = stringExtra.equals(s3.g());
            if (equals) {
                str = "group_id IS NULL";
            } else {
                strArr = new String[]{stringExtra};
                str = "group_id = ?";
            }
            if (!z10 && !k3.Y()) {
                String valueOf = String.valueOf(s3.h(r3Var, stringExtra, equals));
                str = str + " AND android_notification_id = ?";
                strArr = equals ? new String[]{valueOf} : new String[]{stringExtra, valueOf};
            }
        } else {
            str = "android_notification_id = " + intent.getIntExtra("androidNotificationId", 0);
        }
        b(context, r3Var, stringExtra);
        r3Var.h("notification", f(intent), str, strArr);
        l.c(r3Var, context);
    }

    private static ContentValues f(Intent intent) {
        ContentValues contentValues = new ContentValues();
        if (intent.getBooleanExtra("dismissed", false)) {
            contentValues.put("dismissed", 1);
        } else {
            contentValues.put("opened", 1);
        }
        return contentValues;
    }

    static void g(Context context, Intent intent) {
        if (d(intent)) {
            if (context != null) {
                k3.e1(context.getApplicationContext());
            }
            c(context, intent);
            h(context, intent);
        }
    }

    static void h(Context context, Intent intent) {
        c2 c2Var;
        String stringExtra;
        r3 A = r3.A(context);
        String stringExtra2 = intent.getStringExtra("summary");
        boolean booleanExtra = intent.getBooleanExtra("dismissed", false);
        if (!booleanExtra) {
            c2Var = i(context, intent, A, stringExtra2);
            if (c2Var == null) {
                return;
            }
        } else {
            c2Var = null;
        }
        e(context, intent, A, booleanExtra);
        if (stringExtra2 == null && (stringExtra = intent.getStringExtra("grp")) != null) {
            r0.f(context, A, stringExtra, booleanExtra);
        }
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.A1(r0Var, "processIntent from context: " + context + " and intent: " + intent);
        if (intent.getExtras() != null) {
            k3.A1(r0Var, "processIntent intent extras: " + intent.getExtras().toString());
        }
        if (booleanExtra) {
            return;
        }
        if (!(context instanceof Activity)) {
            k3.r0 r0Var2 = k3.r0.ERROR;
            k3.A1(r0Var2, "NotificationOpenedProcessor processIntent from an non Activity context: " + context);
            return;
        }
        k3.W0((Activity) context, c2Var.a(), a2.b(c2Var.b()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.onesignal.c2 i(android.content.Context r7, android.content.Intent r8, com.onesignal.r3 r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "androidNotificationId"
            java.lang.String r1 = "onesignalData"
            r2 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0051 }
            java.lang.String r4 = r8.getStringExtra(r1)     // Catch:{ JSONException -> 0x0051 }
            r3.<init>(r4)     // Catch:{ JSONException -> 0x0051 }
            boolean r4 = r7 instanceof android.app.Activity     // Catch:{ JSONException -> 0x004f }
            if (r4 != 0) goto L_0x0029
            com.onesignal.k3$r0 r4 = com.onesignal.k3.r0.ERROR     // Catch:{ JSONException -> 0x004f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x004f }
            r5.<init>()     // Catch:{ JSONException -> 0x004f }
            java.lang.String r6 = "NotificationOpenedProcessor processIntent from an non Activity context: "
            r5.append(r6)     // Catch:{ JSONException -> 0x004f }
            r5.append(r7)     // Catch:{ JSONException -> 0x004f }
            java.lang.String r7 = r5.toString()     // Catch:{ JSONException -> 0x004f }
            com.onesignal.k3.A1(r4, r7)     // Catch:{ JSONException -> 0x004f }
            goto L_0x0032
        L_0x0029:
            android.app.Activity r7 = (android.app.Activity) r7     // Catch:{ JSONException -> 0x004f }
            boolean r7 = com.onesignal.n1.b(r7, r3)     // Catch:{ JSONException -> 0x004f }
            if (r7 == 0) goto L_0x0032
            return r2
        L_0x0032:
            r7 = 0
            int r7 = r8.getIntExtra(r0, r7)     // Catch:{ JSONException -> 0x004f }
            r3.put(r0, r7)     // Catch:{ JSONException -> 0x004f }
            java.lang.String r7 = r3.toString()     // Catch:{ JSONException -> 0x004f }
            r8.putExtra(r1, r7)     // Catch:{ JSONException -> 0x004f }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x004f }
            java.lang.String r8 = r8.getStringExtra(r1)     // Catch:{ JSONException -> 0x004f }
            r7.<init>(r8)     // Catch:{ JSONException -> 0x004f }
            org.json.JSONArray r2 = com.onesignal.k0.g(r7)     // Catch:{ JSONException -> 0x004f }
            goto L_0x0056
        L_0x004f:
            r7 = move-exception
            goto L_0x0053
        L_0x0051:
            r7 = move-exception
            r3 = r2
        L_0x0053:
            r7.printStackTrace()
        L_0x0056:
            if (r10 == 0) goto L_0x005b
            a(r2, r10, r9)
        L_0x005b:
            com.onesignal.c2 r7 = new com.onesignal.c2
            r7.<init>(r2, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.n0.i(android.content.Context, android.content.Intent, com.onesignal.r3, java.lang.String):com.onesignal.c2");
    }
}
