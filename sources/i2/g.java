package i2;

import android.app.job.JobInfo;
import com.google.auto.value.AutoValue;
import i2.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import z1.d;

@AutoValue
/* compiled from: SchedulerConfig */
public abstract class g {

    /* compiled from: SchedulerConfig */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private l2.a f18887a;

        /* renamed from: b  reason: collision with root package name */
        private Map<d, b> f18888b = new HashMap();

        public a a(d dVar, b bVar) {
            this.f18888b.put(dVar, bVar);
            return this;
        }

        public g b() {
            Objects.requireNonNull(this.f18887a, "missing required property: clock");
            if (this.f18888b.keySet().size() >= d.values().length) {
                Map<d, b> map = this.f18888b;
                this.f18888b = new HashMap();
                return g.d(this.f18887a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        public a c(l2.a aVar) {
            this.f18887a = aVar;
            return this;
        }
    }

    @AutoValue
    /* compiled from: SchedulerConfig */
    public static abstract class b {

        @AutoValue.Builder
        /* compiled from: SchedulerConfig */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set<c> set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new d.b().c(Collections.emptySet());
        }

        /* access modifiers changed from: package-private */
        public abstract long b();

        /* access modifiers changed from: package-private */
        public abstract Set<c> c();

        /* access modifiers changed from: package-private */
        public abstract long d();
    }

    /* compiled from: SchedulerConfig */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j10) {
        int i11 = i10 - 1;
        return (long) (Math.pow(3.0d, (double) i11) * ((double) j10) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((j10 > 1 ? j10 : 2) * ((long) i11)))));
    }

    public static a b() {
        return new a();
    }

    static g d(l2.a aVar, Map<z1.d, b> map) {
        return new c(aVar, map);
    }

    public static g f(l2.a aVar) {
        return b().a(z1.d.DEFAULT, b.a().b(30000).d(86400000).a()).a(z1.d.HIGHEST, b.a().b(1000).d(86400000).a()).a(z1.d.VERY_LOW, b.a().b(86400000).d(86400000).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, z1.d dVar, long j10, int i10) {
        builder.setMinimumLatency(g(dVar, j10, i10));
        j(builder, h().get(dVar).c());
        return builder;
    }

    /* access modifiers changed from: package-private */
    public abstract l2.a e();

    public long g(z1.d dVar, long j10, int i10) {
        long a10 = j10 - e().a();
        b bVar = h().get(dVar);
        return Math.min(Math.max(a(i10, bVar.b()), a10), bVar.d());
    }

    /* access modifiers changed from: package-private */
    public abstract Map<z1.d, b> h();
}
