package r6;

import java.util.concurrent.TimeUnit;

/* compiled from: Stopwatch */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final y f29831a = y.b();

    /* renamed from: b  reason: collision with root package name */
    private boolean f29832b;

    /* renamed from: c  reason: collision with root package name */
    private long f29833c;

    /* renamed from: d  reason: collision with root package name */
    private long f29834d;

    /* compiled from: Stopwatch */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29835a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29835a = r0
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29835a     // Catch:{ NoSuchFieldError -> 0x001d }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29835a     // Catch:{ NoSuchFieldError -> 0x0028 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29835a     // Catch:{ NoSuchFieldError -> 0x0033 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29835a     // Catch:{ NoSuchFieldError -> 0x003e }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29835a     // Catch:{ NoSuchFieldError -> 0x0049 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29835a     // Catch:{ NoSuchFieldError -> 0x0054 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r6.t.a.<clinit>():void");
        }
    }

    t() {
    }

    private static String a(TimeUnit timeUnit) {
        switch (a.f29835a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    private static TimeUnit b(long j10) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j10, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j10, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j10, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j10, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j10, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(j10, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    public static t c() {
        return new t();
    }

    private long e() {
        return this.f29832b ? (this.f29831a.a() - this.f29834d) + this.f29833c : this.f29833c;
    }

    public long d(TimeUnit timeUnit) {
        return timeUnit.convert(e(), TimeUnit.NANOSECONDS);
    }

    public t f() {
        this.f29833c = 0;
        this.f29832b = false;
        return this;
    }

    public t g() {
        o.v(!this.f29832b, "This stopwatch is already running.");
        this.f29832b = true;
        this.f29834d = this.f29831a.a();
        return this;
    }

    public String toString() {
        long e10 = e();
        TimeUnit b10 = b(e10);
        String a10 = n.a(((double) e10) / ((double) TimeUnit.NANOSECONDS.convert(1, b10)));
        String a11 = a(b10);
        StringBuilder sb2 = new StringBuilder(String.valueOf(a10).length() + 1 + String.valueOf(a11).length());
        sb2.append(a10);
        sb2.append(" ");
        sb2.append(a11);
        return sb2.toString();
    }
}
