package r6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: AbstractIterator */
abstract class b<T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    private C0328b f29788a = C0328b.NOT_READY;

    /* renamed from: b  reason: collision with root package name */
    private T f29789b;

    /* compiled from: AbstractIterator */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29790a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                r6.b$b[] r0 = r6.b.C0328b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29790a = r0
                r6.b$b r1 = r6.b.C0328b.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29790a     // Catch:{ NoSuchFieldError -> 0x001d }
                r6.b$b r1 = r6.b.C0328b.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r6.b.a.<clinit>():void");
        }
    }

    /* renamed from: r6.b$b  reason: collision with other inner class name */
    /* compiled from: AbstractIterator */
    private enum C0328b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean c() {
        this.f29788a = C0328b.FAILED;
        this.f29789b = a();
        if (this.f29788a == C0328b.DONE) {
            return false;
        }
        this.f29788a = C0328b.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    /* access modifiers changed from: protected */
    public final T b() {
        this.f29788a = C0328b.DONE;
        return null;
    }

    public final boolean hasNext() {
        o.u(this.f29788a != C0328b.FAILED);
        int i10 = a.f29790a[this.f29788a.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return c();
        }
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.f29788a = C0328b.NOT_READY;
            T a10 = j.a(this.f29789b);
            this.f29789b = null;
            return a10;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
