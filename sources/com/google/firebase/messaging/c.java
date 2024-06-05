package com.google.firebase.messaging;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.l;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CommonNotificationBuilder */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f26761a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* compiled from: CommonNotificationBuilder */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final l.e f26762a;

        /* renamed from: b  reason: collision with root package name */
        public final String f26763b;

        /* renamed from: c  reason: collision with root package name */
        public final int f26764c;

        a(l.e eVar, String str, int i10) {
            this.f26762a = eVar;
            this.f26763b = str;
            this.f26764c = i10;
        }
    }

    private static PendingIntent a(Context context, k0 k0Var, String str, PackageManager packageManager) {
        Intent f10 = f(str, k0Var, packageManager);
        if (f10 == null) {
            return null;
        }
        f10.addFlags(67108864);
        f10.putExtras(k0Var.y());
        if (q(k0Var)) {
            f10.putExtra("gcm.n.analytics_data", k0Var.x());
        }
        return PendingIntent.getActivity(context, g(), f10, l(1073741824));
    }

    private static PendingIntent b(Context context, Context context2, k0 k0Var) {
        if (!q(k0Var)) {
            return null;
        }
        return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(k0Var.x()));
    }

    private static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), l(1073741824));
    }

    public static a d(Context context, Context context2, k0 k0Var, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        l.e eVar = new l.e(context2, str);
        String n10 = k0Var.n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(n10)) {
            eVar.q(n10);
        }
        String n11 = k0Var.n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(n11)) {
            eVar.p(n11);
            eVar.I(new l.c().m(n11));
        }
        eVar.G(m(packageManager, resources, packageName, k0Var.p("gcm.n.icon"), bundle));
        Uri n12 = n(packageName, k0Var, resources);
        if (n12 != null) {
            eVar.H(n12);
        }
        eVar.o(a(context, k0Var, packageName, packageManager));
        PendingIntent b10 = b(context, context2, k0Var);
        if (b10 != null) {
            eVar.s(b10);
        }
        Integer h10 = h(context2, k0Var.p("gcm.n.color"), bundle);
        if (h10 != null) {
            eVar.m(h10.intValue());
        }
        eVar.k(!k0Var.a("gcm.n.sticky"));
        eVar.z(k0Var.a("gcm.n.local_only"));
        String p10 = k0Var.p("gcm.n.ticker");
        if (p10 != null) {
            eVar.K(p10);
        }
        Integer m10 = k0Var.m();
        if (m10 != null) {
            eVar.D(m10.intValue());
        }
        Integer r10 = k0Var.r();
        if (r10 != null) {
            eVar.M(r10.intValue());
        }
        Integer l10 = k0Var.l();
        if (l10 != null) {
            eVar.A(l10.intValue());
        }
        Long j10 = k0Var.j("gcm.n.event_time");
        if (j10 != null) {
            eVar.F(true);
            eVar.N(j10.longValue());
        }
        long[] q10 = k0Var.q();
        if (q10 != null) {
            eVar.L(q10);
        }
        int[] e10 = k0Var.e();
        if (e10 != null) {
            eVar.y(e10[0], e10[1], e10[2]);
        }
        eVar.r(i(k0Var));
        return new a(eVar, o(k0Var), 0);
    }

    static a e(Context context, k0 k0Var) {
        Bundle j10 = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, k0Var, k(context, k0Var.k(), j10), j10);
    }

    private static Intent f(String str, k0 k0Var, PackageManager packageManager) {
        String p10 = k0Var.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p10)) {
            Intent intent = new Intent(p10);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f10 = k0Var.f();
        if (f10 != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f10);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int g() {
        return f26761a.incrementAndGet();
    }

    private static Integer h(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 != 0) {
            try {
                return Integer.valueOf(androidx.core.content.a.getColor(context, i10));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    private static int i(k0 k0Var) {
        boolean a10 = k0Var.a("gcm.n.default_sound");
        if (k0Var.a("gcm.n.default_vibrate_timings")) {
            a10 |= true;
        }
        return k0Var.a("gcm.n.default_light_settings") ? a10 | true ? 1 : 0 : a10 ? 1 : 0;
    }

    private static Bundle j(PackageManager packageManager, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null)) {
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        return Bundle.EMPTY;
    }

    public static String k(Context context, String str, Bundle bundle) {
        String str2;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string)) {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else if (notificationManager.getNotificationChannel(string) != null) {
                return string;
            } else {
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    str2 = "Misc";
                } else {
                    str2 = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", str2, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int l(int i10) {
        return Build.VERSION.SDK_INT >= 23 ? i10 | 67108864 : i10;
    }

    private static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 == 0 || !p(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
            }
        }
        if (i10 == 0 || !p(resources, i10)) {
            return 17301651;
        }
        return i10;
    }

    private static Uri n(String str, k0 k0Var, Resources resources) {
        String o10 = k0Var.o();
        if (TextUtils.isEmpty(o10)) {
            return null;
        }
        if ("default".equals(o10) || resources.getIdentifier(o10, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + o10);
    }

    private static String o(k0 k0Var) {
        String p10 = k0Var.p("gcm.n.tag");
        if (!TextUtils.isEmpty(p10)) {
            return p10;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    private static boolean p(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i10, (Resources.Theme) null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }

    static boolean q(k0 k0Var) {
        return k0Var.a("google.c.a.e");
    }
}
