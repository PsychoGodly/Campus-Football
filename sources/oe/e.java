package oe;

import java.util.concurrent.TimeUnit;

/* compiled from: DurationUnitJvm.kt */
public enum e {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    

    /* renamed from: a  reason: collision with root package name */
    private final TimeUnit f36783a;

    private e(TimeUnit timeUnit) {
        this.f36783a = timeUnit;
    }

    public final TimeUnit c() {
        return this.f36783a;
    }
}
