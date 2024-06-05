package tb;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* compiled from: Connectivity */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final ConnectivityManager f38541a;

    public a(ConnectivityManager connectivityManager) {
        this.f38541a = connectivityManager;
    }

    private String c() {
        NetworkInfo activeNetworkInfo = this.f38541a.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "none";
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            return "mobile";
        }
        if (type == 1) {
            return "wifi";
        }
        if (type == 4 || type == 5) {
            return "mobile";
        }
        if (type == 6) {
            return "wifi";
        }
        if (type == 7) {
            return "bluetooth";
        }
        if (type == 9) {
            return "ethernet";
        }
        if (type != 17) {
            return "none";
        }
        return "vpn";
    }

    public ConnectivityManager a() {
        return this.f38541a;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        if (Build.VERSION.SDK_INT >= 23) {
            NetworkCapabilities networkCapabilities = this.f38541a.getNetworkCapabilities(this.f38541a.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return "wifi";
            }
            if (networkCapabilities.hasTransport(3)) {
                return "ethernet";
            }
            if (networkCapabilities.hasTransport(4)) {
                return "vpn";
            }
            if (networkCapabilities.hasTransport(0)) {
                return "mobile";
            }
            if (networkCapabilities.hasTransport(2)) {
                return "bluetooth";
            }
        }
        return c();
    }
}
