package androidx.core.util;

/* compiled from: Pools */
public class f<T> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f3082a;

    /* renamed from: b  reason: collision with root package name */
    private int f3083b;

    public f(int i10) {
        if (i10 > 0) {
            this.f3082a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    private boolean c(T t10) {
        for (int i10 = 0; i10 < this.f3083b; i10++) {
            if (this.f3082a[i10] == t10) {
                return true;
            }
        }
        return false;
    }

    public boolean a(T t10) {
        if (!c(t10)) {
            int i10 = this.f3083b;
            Object[] objArr = this.f3082a;
            if (i10 >= objArr.length) {
                return false;
            }
            objArr[i10] = t10;
            this.f3083b = i10 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public T b() {
        int i10 = this.f3083b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        T[] tArr = this.f3082a;
        T t10 = tArr[i11];
        tArr[i11] = null;
        this.f3083b = i10 - 1;
        return t10;
    }
}
