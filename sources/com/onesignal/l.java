package com.onesignal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.onesignal.k3;
import na.b;
import na.c;

/* compiled from: BadgeCountUpdater */
class l {

    /* renamed from: a  reason: collision with root package name */
    private static int f28030a = -1;

    private static boolean a(Context context) {
        int i10 = f28030a;
        if (i10 != -1) {
            return i10 == 1;
        }
        ApplicationInfo a10 = j.f27861a.a(context);
        if (a10 == null) {
            f28030a = 0;
            k3.a(k3.r0.ERROR, "Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.");
            return false;
        }
        Bundle bundle = a10.metaData;
        if (bundle != null) {
            f28030a = "DISABLE".equals(bundle.getString("com.onesignal.BadgeCount")) ^ true ? 1 : 0;
        } else {
            f28030a = 1;
        }
        if (f28030a == 1) {
            return true;
        }
        return false;
    }

    private static boolean b(Context context) {
        return a(context) && OSUtils.a(context);
    }

    static void c(q3 q3Var, Context context) {
        if (b(context)) {
            if (Build.VERSION.SDK_INT >= 23) {
                f(context);
            } else {
                e(q3Var, context);
            }
        }
    }

    static void d(int i10, Context context) {
        if (a(context)) {
            try {
                c.a(context, i10);
            } catch (b unused) {
            }
        }
    }

    private static void e(q3 q3Var, Context context) {
        Cursor i10 = q3Var.i("notification", (String[]) null, r3.Z().toString(), (String[]) null, (String) null, (String) null, (String) null, m0.f28046a);
        int count = i10.getCount();
        i10.close();
        d(count, context);
    }

    private static void f(Context context) {
        int i10 = 0;
        for (StatusBarNotification f10 : s3.d(context)) {
            if (!m0.f(f10)) {
                i10++;
            }
        }
        d(i10, context);
    }
}
