package p7;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.c0;
import d7.a;
import d7.b;
import y6.c;
import y7.p;
import y7.u;
import y7.v;

/* compiled from: FirebaseAuthCredentialsProvider */
public final class i extends a<j> {

    /* renamed from: a  reason: collision with root package name */
    private final a f29503a = new h(this);

    /* renamed from: b  reason: collision with root package name */
    private b f29504b;

    /* renamed from: c  reason: collision with root package name */
    private u<j> f29505c;

    /* renamed from: d  reason: collision with root package name */
    private int f29506d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f29507e;

    public i(b8.a<b> aVar) {
        aVar.a(new f(this));
    }

    private synchronized j h() {
        String c10;
        b bVar = this.f29504b;
        c10 = bVar == null ? null : bVar.c();
        return c10 != null ? new j(c10) : j.f29508b;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task i(int i10, Task task) throws Exception {
        synchronized (this) {
            if (i10 != this.f29506d) {
                v.a("FirebaseAuthCredentialsProvider", "getToken aborted due to token change", new Object[0]);
                Task<String> a10 = a();
                return a10;
            } else if (task.isSuccessful()) {
                Task forResult = Tasks.forResult(((c0) task.getResult()).g());
                return forResult;
            } else {
                Task forException = Tasks.forException(task.getException());
                return forException;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void j(h8.b bVar) {
        l();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k(b8.b bVar) {
        synchronized (this) {
            this.f29504b = (b) bVar.get();
            l();
            this.f29504b.b(this.f29503a);
        }
    }

    private synchronized void l() {
        this.f29506d++;
        u<j> uVar = this.f29505c;
        if (uVar != null) {
            uVar.a(h());
        }
    }

    public synchronized Task<String> a() {
        b bVar = this.f29504b;
        if (bVar == null) {
            return Tasks.forException(new c("auth is not available"));
        }
        Task<c0> d10 = bVar.d(this.f29507e);
        this.f29507e = false;
        return d10.continueWithTask(p.f31400b, new g(this, this.f29506d));
    }

    public synchronized void b() {
        this.f29507e = true;
    }

    public synchronized void c() {
        this.f29505c = null;
        b bVar = this.f29504b;
        if (bVar != null) {
            bVar.a(this.f29503a);
        }
    }

    public synchronized void d(u<j> uVar) {
        this.f29505c = uVar;
        uVar.a(h());
    }
}
