package ke;

import java.util.NoSuchElementException;
import td.f0;

/* compiled from: ProgressionIterators.kt */
public final class e extends f0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f36019a;

    /* renamed from: b  reason: collision with root package name */
    private final long f36020b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36021c;

    /* renamed from: d  reason: collision with root package name */
    private long f36022d;

    public e(long j10, long j11, long j12) {
        this.f36019a = j12;
        this.f36020b = j11;
        boolean z10 = true;
        int i10 = (j12 > 0 ? 1 : (j12 == 0 ? 0 : -1));
        int i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 <= 0 ? i11 < 0 : i11 > 0) {
            z10 = false;
        }
        this.f36021c = z10;
        this.f36022d = !z10 ? j11 : j10;
    }

    public long a() {
        long j10 = this.f36022d;
        if (j10 != this.f36020b) {
            this.f36022d = this.f36019a + j10;
        } else if (this.f36021c) {
            this.f36021c = false;
        } else {
            throw new NoSuchElementException();
        }
        return j10;
    }

    public boolean hasNext() {
        return this.f36021c;
    }
}
