package pe;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.h;

/* compiled from: CompletionState.kt */
public class c0 {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f37279b = AtomicIntegerFieldUpdater.newUpdater(c0.class, "_handled");
    private volatile int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f37280a;

    public c0(Throwable th, boolean z10) {
        this.f37280a = th;
        this._handled = z10 ? 1 : 0;
    }

    public final boolean a() {
        return f37279b.get(this) != 0;
    }

    public final boolean b() {
        return f37279b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return u0.a(this) + '[' + this.f37280a + ']';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Throwable th, boolean z10, int i10, h hVar) {
        this(th, (i10 & 2) != 0 ? false : z10);
    }
}
