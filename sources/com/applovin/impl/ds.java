package com.applovin.impl;

import android.content.Context;
import android.net.wifi.WifiManager;

final class ds {

    /* renamed from: a  reason: collision with root package name */
    private final WifiManager f7324a;

    /* renamed from: b  reason: collision with root package name */
    private WifiManager.WifiLock f7325b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7326c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7327d;

    public ds(Context context) {
        this.f7324a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public void a(boolean z10) {
        if (z10 && this.f7325b == null) {
            WifiManager wifiManager = this.f7324a;
            if (wifiManager == null) {
                kc.d("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.f7325b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.f7326c = z10;
        a();
    }

    public void b(boolean z10) {
        this.f7327d = z10;
        a();
    }

    private void a() {
        WifiManager.WifiLock wifiLock = this.f7325b;
        if (wifiLock != null) {
            if (!this.f7326c || !this.f7327d) {
                wifiLock.release();
            } else {
                wifiLock.acquire();
            }
        }
    }
}
