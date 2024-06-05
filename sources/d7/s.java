package d7;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzg;
import k5.a;
import m5.h;
import y6.f;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class s {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static a f28610h = new a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a  reason: collision with root package name */
    private final f f28611a;

    /* renamed from: b  reason: collision with root package name */
    volatile long f28612b;

    /* renamed from: c  reason: collision with root package name */
    volatile long f28613c;

    /* renamed from: d  reason: collision with root package name */
    private long f28614d;

    /* renamed from: e  reason: collision with root package name */
    private HandlerThread f28615e;

    /* renamed from: f  reason: collision with root package name */
    private Handler f28616f = new zzg(this.f28615e.getLooper());

    /* renamed from: g  reason: collision with root package name */
    private Runnable f28617g;

    public s(f fVar) {
        f28610h.g("Initializing TokenRefresher", new Object[0]);
        f fVar2 = (f) q.k(fVar);
        this.f28611a = fVar2;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f28615e = handlerThread;
        handlerThread.start();
        this.f28617g = new r(this, fVar2.q());
        this.f28614d = 300000;
    }

    public final void b() {
        this.f28616f.removeCallbacks(this.f28617g);
    }

    public final void c() {
        a aVar = f28610h;
        long j10 = this.f28612b - this.f28614d;
        aVar.g("Scheduling refresh for " + j10, new Object[0]);
        b();
        this.f28613c = Math.max((this.f28612b - h.d().a()) - this.f28614d, 0) / 1000;
        this.f28616f.postDelayed(this.f28617g, this.f28613c * 1000);
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        long j10;
        int i10 = (int) this.f28613c;
        if (i10 == 30 || i10 == 60 || i10 == 120 || i10 == 240 || i10 == 480) {
            j10 = 2 * this.f28613c;
        } else {
            j10 = i10 != 960 ? 30 : 960;
        }
        this.f28613c = j10;
        this.f28612b = h.d().a() + (this.f28613c * 1000);
        a aVar = f28610h;
        long j11 = this.f28612b;
        aVar.g("Scheduling refresh for " + j11, new Object[0]);
        this.f28616f.postDelayed(this.f28617g, this.f28613c * 1000);
    }
}
