package va;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: DatabaseWorkerPool */
class s implements o {

    /* renamed from: a  reason: collision with root package name */
    final String f23398a;

    /* renamed from: b  reason: collision with root package name */
    final int f23399b;

    /* renamed from: c  reason: collision with root package name */
    private HandlerThread f23400c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f23401d;

    s(String str, int i10) {
        this.f23398a = str;
        this.f23399b = i10;
    }

    public /* synthetic */ void a(i iVar, Runnable runnable) {
        n.a(this, iVar, runnable);
    }

    public void b(k kVar) {
        this.f23401d.post(kVar.f23382b);
    }

    public void c() {
        HandlerThread handlerThread = this.f23400c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f23400c = null;
            this.f23401d = null;
        }
    }

    public void start() {
        HandlerThread handlerThread = new HandlerThread(this.f23398a, this.f23399b);
        this.f23400c = handlerThread;
        handlerThread.start();
        this.f23401d = new Handler(this.f23400c.getLooper());
    }
}
