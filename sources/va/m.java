package va;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: DatabaseWorker */
class m {

    /* renamed from: a  reason: collision with root package name */
    private final String f23383a;

    /* renamed from: b  reason: collision with root package name */
    private final int f23384b;

    /* renamed from: c  reason: collision with root package name */
    private HandlerThread f23385c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f23386d;

    /* renamed from: e  reason: collision with root package name */
    protected Runnable f23387e;

    /* renamed from: f  reason: collision with root package name */
    private k f23388f;

    m(String str, int i10) {
        this.f23383a = str;
        this.f23384b = i10;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        k kVar = this.f23388f;
        return kVar != null && kVar.b();
    }

    /* access modifiers changed from: package-private */
    public Integer d() {
        k kVar = this.f23388f;
        if (kVar != null) {
            return kVar.a();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void e(k kVar) {
        this.f23386d.post(new l(this, kVar));
    }

    /* access modifiers changed from: package-private */
    public synchronized void f() {
        HandlerThread handlerThread = this.f23385c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f23385c = null;
            this.f23386d = null;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void g(Runnable runnable) {
        HandlerThread handlerThread = new HandlerThread(this.f23383a, this.f23384b);
        this.f23385c = handlerThread;
        handlerThread.start();
        this.f23386d = new Handler(this.f23385c.getLooper());
        this.f23387e = runnable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void c(k kVar) {
        kVar.f23382b.run();
        this.f23388f = kVar;
        this.f23387e.run();
    }
}
