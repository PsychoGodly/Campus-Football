package p7;

import c7.a;
import c7.b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import y6.c;
import y7.p;
import y7.u;

/* compiled from: FirebaseAppCheckTokenProvider */
public final class e extends a<String> {

    /* renamed from: a  reason: collision with root package name */
    private u<String> f29499a;

    /* renamed from: b  reason: collision with root package name */
    private b f29500b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f29501c;

    /* renamed from: d  reason: collision with root package name */
    private final a f29502d = new c(this);

    public e(b8.a<b> aVar) {
        aVar.a(new b(this));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Task g(Task task) throws Exception {
        if (task.isSuccessful()) {
            return Tasks.forResult(((b7.a) task.getResult()).b());
        }
        return Tasks.forException(task.getException());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(b8.b bVar) {
        synchronized (this) {
            b bVar2 = (b) bVar.get();
            this.f29500b = bVar2;
            if (bVar2 != null) {
                bVar2.c(this.f29502d);
            }
        }
    }

    public synchronized Task<String> a() {
        b bVar = this.f29500b;
        if (bVar == null) {
            return Tasks.forException(new c("AppCheck is not available"));
        }
        Task<b7.a> a10 = bVar.a(this.f29501c);
        this.f29501c = false;
        return a10.continueWithTask(p.f31400b, d.f36883a);
    }

    public synchronized void b() {
        this.f29501c = true;
    }

    public synchronized void c() {
        this.f29499a = null;
        b bVar = this.f29500b;
        if (bVar != null) {
            bVar.b(this.f29502d);
        }
    }

    public synchronized void d(u<String> uVar) {
        this.f29499a = uVar;
    }
}
