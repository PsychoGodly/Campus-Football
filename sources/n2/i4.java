package n2;

import android.content.Context;
import android.os.PowerManager;
import k4.r;

/* compiled from: WakeLockManager */
final class i4 {

    /* renamed from: a  reason: collision with root package name */
    private final PowerManager f20454a;

    /* renamed from: b  reason: collision with root package name */
    private PowerManager.WakeLock f20455b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f20456c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f20457d;

    public i4(Context context) {
        this.f20454a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    private void c() {
        PowerManager.WakeLock wakeLock = this.f20455b;
        if (wakeLock != null) {
            if (!this.f20456c || !this.f20457d) {
                wakeLock.release();
            } else {
                wakeLock.acquire();
            }
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f20455b == null) {
            PowerManager powerManager = this.f20454a;
            if (powerManager == null) {
                r.i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.f20455b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.f20456c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f20457d = z10;
        c();
    }
}
