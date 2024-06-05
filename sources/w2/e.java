package w2;

import k4.a0;
import n2.y2;
import s2.e0;

/* compiled from: TagPayloadReader */
abstract class e {

    /* renamed from: a  reason: collision with root package name */
    protected final e0 f23541a;

    /* compiled from: TagPayloadReader */
    public static final class a extends y2 {
        public a(String str) {
            super(str, (Throwable) null, false, 1);
        }
    }

    protected e(e0 e0Var) {
        this.f23541a = e0Var;
    }

    public final boolean a(a0 a0Var, long j10) throws y2 {
        return b(a0Var) && c(a0Var, j10);
    }

    /* access modifiers changed from: protected */
    public abstract boolean b(a0 a0Var) throws y2;

    /* access modifiers changed from: protected */
    public abstract boolean c(a0 a0Var, long j10) throws y2;
}
