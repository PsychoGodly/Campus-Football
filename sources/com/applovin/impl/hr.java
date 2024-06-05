package com.applovin.impl;

import android.content.Context;
import android.os.PowerManager;

final class hr {

    /* renamed from: a  reason: collision with root package name */
    private final PowerManager f8363a;

    /* renamed from: b  reason: collision with root package name */
    private PowerManager.WakeLock f8364b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8365c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8366d;

    public hr(Context context) {
        this.f8363a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public void a(boolean z10) {
        if (z10 && this.f8364b == null) {
            PowerManager powerManager = this.f8363a;
            if (powerManager == null) {
                kc.d("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.f8364b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.f8365c = z10;
        a();
    }

    public void b(boolean z10) {
        this.f8366d = z10;
        a();
    }

    private void a() {
        PowerManager.WakeLock wakeLock = this.f8364b;
        if (wakeLock != null) {
            if (!this.f8365c || !this.f8366d) {
                wakeLock.release();
            } else {
                wakeLock.acquire();
            }
        }
    }
}
