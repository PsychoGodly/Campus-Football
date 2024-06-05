package s6;

import java.util.NoSuchElementException;
import r6.o;

/* compiled from: AbstractIterator */
public abstract class b<T> extends d1<T> {

    /* renamed from: a  reason: collision with root package name */
    private C0334b f30120a = C0334b.NOT_READY;

    /* renamed from: b  reason: collision with root package name */
    private T f30121b;

    /* compiled from: AbstractIterator */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30122a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                s6.b$b[] r0 = s6.b.C0334b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30122a = r0
                s6.b$b r1 = s6.b.C0334b.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30122a     // Catch:{ NoSuchFieldError -> 0x001d }
                s6.b$b r1 = s6.b.C0334b.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s6.b.a.<clinit>():void");
        }
    }

    /* renamed from: s6.b$b  reason: collision with other inner class name */
    /* compiled from: AbstractIterator */
    private enum C0334b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean c() {
        this.f30120a = C0334b.FAILED;
        this.f30121b = a();
        if (this.f30120a == C0334b.DONE) {
            return false;
        }
        this.f30120a = C0334b.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    /* access modifiers changed from: protected */
    public final T b() {
        this.f30120a = C0334b.DONE;
        return null;
    }

    public final boolean hasNext() {
        o.u(this.f30120a != C0334b.FAILED);
        int i10 = a.f30122a[this.f30120a.ordinal()];
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
            this.f30120a = C0334b.NOT_READY;
            T a10 = n0.a(this.f30121b);
            this.f30121b = null;
            return a10;
        }
        throw new NoSuchElementException();
    }
}
