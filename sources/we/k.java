package we;

import pe.u0;

/* compiled from: Tasks.kt */
public final class k extends h {

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f39259c;

    public k(Runnable runnable, long j10, i iVar) {
        super(j10, iVar);
        this.f39259c = runnable;
    }

    public void run() {
        try {
            this.f39259c.run();
        } finally {
            this.f39257b.a();
        }
    }

    public String toString() {
        return "Task[" + u0.a(this.f39259c) + '@' + u0.b(this.f39259c) + ", " + this.f39256a + ", " + this.f39257b + ']';
    }
}
