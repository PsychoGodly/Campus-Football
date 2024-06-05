package of;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: LimitAdClickUtils */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static int f36793a;

    private static long a() {
        return System.currentTimeMillis();
    }

    private static SharedPreferences b(Context context) {
        return context.getSharedPreferences("ads_limit", 0);
    }

    public static void c(Context context) {
        f36793a = d(context);
    }

    private static int d(Context context) {
        long j10 = b(context).getLong("last_time_clicked", -1);
        if (j10 < 0) {
            return 0;
        }
        if (a() - j10 < 86400000) {
            return 1;
        }
        b(context).edit().putBoolean("is_blocked", false).apply();
        return 0;
    }

    public static boolean e(Context context) {
        f36793a++;
        b(context).edit().putLong("last_time_clicked", a()).apply();
        if (f36793a != 2) {
            return true;
        }
        b(context).edit().putBoolean("is_blocked", true).apply();
        return false;
    }

    public static boolean f(Context context) {
        return b(context).getBoolean("is_blocked", false);
    }
}
