package r3;

import java.util.NoSuchElementException;

/* compiled from: BaseMediaChunkIterator */
public abstract class b implements o {

    /* renamed from: b  reason: collision with root package name */
    private final long f22104b;

    /* renamed from: c  reason: collision with root package name */
    private final long f22105c;

    /* renamed from: d  reason: collision with root package name */
    private long f22106d;

    public b(long j10, long j11) {
        this.f22104b = j10;
        this.f22105c = j11;
        f();
    }

    /* access modifiers changed from: protected */
    public final void c() {
        long j10 = this.f22106d;
        if (j10 < this.f22104b || j10 > this.f22105c) {
            throw new NoSuchElementException();
        }
    }

    /* access modifiers changed from: protected */
    public final long d() {
        return this.f22106d;
    }

    public boolean e() {
        return this.f22106d > this.f22105c;
    }

    public void f() {
        this.f22106d = this.f22104b - 1;
    }

    public boolean next() {
        this.f22106d++;
        return !e();
    }
}
