package ke;

import java.util.NoSuchElementException;
import td.e0;

/* compiled from: ProgressionIterators.kt */
public final class b extends e0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f36009a;

    /* renamed from: b  reason: collision with root package name */
    private final int f36010b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36011c;

    /* renamed from: d  reason: collision with root package name */
    private int f36012d;

    public b(int i10, int i11, int i12) {
        this.f36009a = i12;
        this.f36010b = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f36011c = z10;
        this.f36012d = !z10 ? i11 : i10;
    }

    public int a() {
        int i10 = this.f36012d;
        if (i10 != this.f36010b) {
            this.f36012d = this.f36009a + i10;
        } else if (this.f36011c) {
            this.f36011c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i10;
    }

    public boolean hasNext() {
        return this.f36011c;
    }
}
