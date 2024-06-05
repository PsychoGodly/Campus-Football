package td;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: AbstractIterator.kt */
public abstract class b<T> implements Iterator<T>, ge.a {

    /* renamed from: a  reason: collision with root package name */
    private t0 f38598a = t0.NotReady;

    /* renamed from: b  reason: collision with root package name */
    private T f38599b;

    /* compiled from: AbstractIterator.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f38600a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                td.t0[] r0 = td.t0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                td.t0 r1 = td.t0.Done     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                td.t0 r1 = td.t0.Ready     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f38600a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: td.b.a.<clinit>():void");
        }
    }

    private final boolean e() {
        this.f38598a = t0.Failed;
        a();
        return this.f38598a == t0.Ready;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public final void b() {
        this.f38598a = t0.Done;
    }

    /* access modifiers changed from: protected */
    public final void d(T t10) {
        this.f38599b = t10;
        this.f38598a = t0.Ready;
    }

    public boolean hasNext() {
        t0 t0Var = this.f38598a;
        if (t0Var != t0.Failed) {
            int i10 = a.f38600a[t0Var.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 != 2) {
                return e();
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public T next() {
        if (hasNext()) {
            this.f38598a = t0.NotReady;
            return this.f38599b;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
