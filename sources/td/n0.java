package td;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.m;

/* compiled from: SlidingWindow.kt */
final class n0<T> extends c<T> implements RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f38619b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f38620c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f38621d;

    /* renamed from: f  reason: collision with root package name */
    private int f38622f;

    /* compiled from: SlidingWindow.kt */
    public static final class a extends b<T> {

        /* renamed from: c  reason: collision with root package name */
        private int f38623c;

        /* renamed from: d  reason: collision with root package name */
        private int f38624d;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ n0<T> f38625f;

        a(n0<T> n0Var) {
            this.f38625f = n0Var;
            this.f38623c = n0Var.size();
            this.f38624d = n0Var.f38621d;
        }

        /* access modifiers changed from: protected */
        public void a() {
            if (this.f38623c == 0) {
                b();
                return;
            }
            d(this.f38625f.f38619b[this.f38624d]);
            this.f38624d = (this.f38624d + 1) % this.f38625f.f38620c;
            this.f38623c--;
        }
    }

    public n0(Object[] objArr, int i10) {
        m.e(objArr, "buffer");
        this.f38619b = objArr;
        boolean z10 = true;
        if (i10 >= 0) {
            if (i10 > objArr.length ? false : z10) {
                this.f38620c = objArr.length;
                this.f38622f = i10;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i10 + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i10).toString());
    }

    public int b() {
        return this.f38622f;
    }

    public T get(int i10) {
        c.f38602a.a(i10, size());
        return this.f38619b[(this.f38621d + i10) % this.f38620c];
    }

    public final void h(T t10) {
        if (!n()) {
            this.f38619b[(this.f38621d + size()) % this.f38620c] = t10;
            this.f38622f = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    public Iterator<T> iterator() {
        return new a(this);
    }

    public final n0<T> m(int i10) {
        Object[] objArr;
        int i11 = this.f38620c;
        int c10 = i.c(i11 + (i11 >> 1) + 1, i10);
        if (this.f38621d == 0) {
            objArr = Arrays.copyOf(this.f38619b, c10);
            m.d(objArr, "copyOf(this, newSize)");
        } else {
            objArr = toArray(new Object[c10]);
        }
        return new n0<>(objArr, size());
    }

    public final boolean n() {
        return size() == this.f38620c;
    }

    public final void o(int i10) {
        boolean z10 = true;
        if (i10 >= 0) {
            if (i10 > size()) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i10 + ", size = " + size()).toString());
            } else if (i10 > 0) {
                int i11 = this.f38621d;
                int f10 = (i11 + i10) % this.f38620c;
                if (i11 > f10) {
                    l.f(this.f38619b, null, i11, this.f38620c);
                    l.f(this.f38619b, null, 0, f10);
                } else {
                    l.f(this.f38619b, null, i11, f10);
                }
                this.f38621d = f10;
                this.f38622f = size() - i10;
            }
        } else {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i10).toString());
        }
    }

    public <T> T[] toArray(T[] tArr) {
        m.e(tArr, "array");
        if (tArr.length < size()) {
            tArr = Arrays.copyOf(tArr, size());
            m.d(tArr, "copyOf(this, newSize)");
        }
        int size = size();
        int i10 = this.f38621d;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size && i10 < this.f38620c) {
            tArr[i12] = this.f38619b[i10];
            i12++;
            i10++;
        }
        while (i12 < size) {
            tArr[i12] = this.f38619b[i11];
            i12++;
            i11++;
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    public n0(int i10) {
        this(new Object[i10], 0);
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
