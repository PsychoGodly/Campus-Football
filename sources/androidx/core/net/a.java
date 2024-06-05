package androidx.core.net;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;

/* compiled from: ConnectivityManagerCompat */
public final class a {

    /* renamed from: androidx.core.net.a$a  reason: collision with other inner class name */
    /* compiled from: ConnectivityManagerCompat */
    static class C0036a {
        static boolean a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    public static boolean a(ConnectivityManager connectivityManager) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C0036a.a(connectivityManager);
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return true;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1 || type == 7 || type == 9) {
            return false;
        }
        return true;
    }
}
