package pe;

import sd.w;

/* compiled from: CancellableContinuation.kt */
final class j1 extends m {

    /* renamed from: a  reason: collision with root package name */
    private final i1 f37325a;

    public j1(i1 i1Var) {
        this.f37325a = i1Var;
    }

    public void d(Throwable th) {
        this.f37325a.dispose();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        d((Throwable) obj);
        return w.f38141a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f37325a + ']';
    }
}
