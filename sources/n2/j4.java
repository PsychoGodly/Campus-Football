package n2;

import android.content.Context;
import android.net.wifi.WifiManager;
import k4.r;

/* compiled from: WifiLockManager */
final class j4 {

    /* renamed from: a  reason: collision with root package name */
    private final WifiManager f20484a;

    /* renamed from: b  reason: collision with root package name */
    private WifiManager.WifiLock f20485b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f20486c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f20487d;

    public j4(Context context) {
        this.f20484a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    private void c() {
        WifiManager.WifiLock wifiLock = this.f20485b;
        if (wifiLock != null) {
            if (!this.f20486c || !this.f20487d) {
                wifiLock.release();
            } else {
                wifiLock.acquire();
            }
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f20485b == null) {
            WifiManager wifiManager = this.f20484a;
            if (wifiManager == null) {
                r.i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.f20485b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.f20486c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f20487d = z10;
        c();
    }
}
