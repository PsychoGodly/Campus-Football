package y0;

import androidx.room.h;
import c1.f;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SharedSQLiteStatement */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f23722a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private final h f23723b;

    /* renamed from: c  reason: collision with root package name */
    private volatile f f23724c;

    public d(h hVar) {
        this.f23723b = hVar;
    }

    private f c() {
        return this.f23723b.d(d());
    }

    private f e(boolean z10) {
        if (!z10) {
            return c();
        }
        if (this.f23724c == null) {
            this.f23724c = c();
        }
        return this.f23724c;
    }

    public f a() {
        b();
        return e(this.f23722a.compareAndSet(false, true));
    }

    /* access modifiers changed from: protected */
    public void b() {
        this.f23723b.a();
    }

    /* access modifiers changed from: protected */
    public abstract String d();

    public void f(f fVar) {
        if (fVar == this.f23724c) {
            this.f23722a.set(false);
        }
    }
}
