package dd;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: Deadline */
public final class t implements Comparable<t> {

    /* renamed from: d  reason: collision with root package name */
    private static final b f32359d = new b();

    /* renamed from: f  reason: collision with root package name */
    private static final long f32360f;

    /* renamed from: g  reason: collision with root package name */
    private static final long f32361g;

    /* renamed from: h  reason: collision with root package name */
    private static final long f32362h = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: a  reason: collision with root package name */
    private final c f32363a;

    /* renamed from: b  reason: collision with root package name */
    private final long f32364b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f32365c;

    /* compiled from: Deadline */
    private static class b extends c {
        private b() {
        }

        public long a() {
            return System.nanoTime();
        }
    }

    /* compiled from: Deadline */
    public static abstract class c {
        public abstract long a();
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500);
        f32360f = nanos;
        f32361g = -nanos;
    }

    private t(c cVar, long j10, boolean z10) {
        this(cVar, cVar.a(), j10, z10);
    }

    public static t a(long j10, TimeUnit timeUnit) {
        return c(j10, timeUnit, f32359d);
    }

    public static t c(long j10, TimeUnit timeUnit, c cVar) {
        d(timeUnit, "units");
        return new t(cVar, timeUnit.toNanos(j10), true);
    }

    private static <T> T d(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    private void e(t tVar) {
        if (this.f32363a != tVar.f32363a) {
            throw new AssertionError("Tickers (" + this.f32363a + " and " + tVar.f32363a + ") don't match. Custom Ticker should only be used in tests!");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        c cVar = this.f32363a;
        if (cVar != null ? cVar == tVar.f32363a : tVar.f32363a == null) {
            return this.f32364b == tVar.f32364b;
        }
        return false;
    }

    /* renamed from: f */
    public int compareTo(t tVar) {
        e(tVar);
        int i10 = ((this.f32364b - tVar.f32364b) > 0 ? 1 : ((this.f32364b - tVar.f32364b) == 0 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        return i10 > 0 ? 1 : 0;
    }

    public boolean g(t tVar) {
        e(tVar);
        return this.f32364b - tVar.f32364b < 0;
    }

    public boolean h() {
        if (!this.f32365c) {
            if (this.f32364b - this.f32363a.a() > 0) {
                return false;
            }
            this.f32365c = true;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.asList(new Object[]{this.f32363a, Long.valueOf(this.f32364b)}).hashCode();
    }

    public t i(t tVar) {
        e(tVar);
        return g(tVar) ? this : tVar;
    }

    public long j(TimeUnit timeUnit) {
        long a10 = this.f32363a.a();
        if (!this.f32365c && this.f32364b - a10 <= 0) {
            this.f32365c = true;
        }
        return timeUnit.convert(this.f32364b - a10, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long j10 = j(TimeUnit.NANOSECONDS);
        long abs = Math.abs(j10);
        long j11 = f32362h;
        long j12 = abs / j11;
        long abs2 = Math.abs(j10) % j11;
        StringBuilder sb2 = new StringBuilder();
        if (j10 < 0) {
            sb2.append('-');
        }
        sb2.append(j12);
        if (abs2 > 0) {
            sb2.append(String.format(Locale.US, ".%09d", new Object[]{Long.valueOf(abs2)}));
        }
        sb2.append("s from now");
        if (this.f32363a != f32359d) {
            sb2.append(" (ticker=" + this.f32363a + ")");
        }
        return sb2.toString();
    }

    private t(c cVar, long j10, long j11, boolean z10) {
        this.f32363a = cVar;
        long min = Math.min(f32360f, Math.max(f32361g, j11));
        this.f32364b = j10 + min;
        this.f32365c = z10 && min <= 0;
    }
}
