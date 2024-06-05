package ke;

import kotlin.jvm.internal.h;
import td.f0;
import zd.c;

/* compiled from: Progressions.kt */
public class d implements Iterable<Long>, ge.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f36015d = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f36016a;

    /* renamed from: b  reason: collision with root package name */
    private final long f36017b;

    /* renamed from: c  reason: collision with root package name */
    private final long f36018c;

    /* compiled from: Progressions.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    public d(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j12 != Long.MIN_VALUE) {
            this.f36016a = j10;
            this.f36017b = c.d(j10, j11, j12);
            this.f36018c = j12;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final long b() {
        return this.f36016a;
    }

    public final long e() {
        return this.f36017b;
    }

    /* renamed from: f */
    public f0 iterator() {
        return new e(this.f36016a, this.f36017b, this.f36018c);
    }
}
