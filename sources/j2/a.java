package j2;

import com.applovin.mediation.MaxReward;
import j2.e;

/* compiled from: AutoValue_EventStoreConfig */
final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    private final long f19229b;

    /* renamed from: c  reason: collision with root package name */
    private final int f19230c;

    /* renamed from: d  reason: collision with root package name */
    private final int f19231d;

    /* renamed from: e  reason: collision with root package name */
    private final long f19232e;

    /* renamed from: f  reason: collision with root package name */
    private final int f19233f;

    /* compiled from: AutoValue_EventStoreConfig */
    static final class b extends e.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f19234a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f19235b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f19236c;

        /* renamed from: d  reason: collision with root package name */
        private Long f19237d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f19238e;

        b() {
        }

        /* access modifiers changed from: package-private */
        public e a() {
            Long l10 = this.f19234a;
            String str = MaxReward.DEFAULT_LABEL;
            if (l10 == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f19235b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f19236c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f19237d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f19238e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f19234a.longValue(), this.f19235b.intValue(), this.f19236c.intValue(), this.f19237d.longValue(), this.f19238e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public e.a b(int i10) {
            this.f19236c = Integer.valueOf(i10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public e.a c(long j10) {
            this.f19237d = Long.valueOf(j10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public e.a d(int i10) {
            this.f19235b = Integer.valueOf(i10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public e.a e(int i10) {
            this.f19238e = Integer.valueOf(i10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public e.a f(long j10) {
            this.f19234a = Long.valueOf(j10);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f19231d;
    }

    /* access modifiers changed from: package-private */
    public long c() {
        return this.f19232e;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f19230c;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f19233f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f19229b == eVar.f() && this.f19230c == eVar.d() && this.f19231d == eVar.b() && this.f19232e == eVar.c() && this.f19233f == eVar.e()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public long f() {
        return this.f19229b;
    }

    public int hashCode() {
        long j10 = this.f19229b;
        long j11 = this.f19232e;
        return this.f19233f ^ ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f19230c) * 1000003) ^ this.f19231d) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f19229b + ", loadBatchSize=" + this.f19230c + ", criticalSectionEnterTimeoutMs=" + this.f19231d + ", eventCleanUpAge=" + this.f19232e + ", maxBlobByteSizePerRow=" + this.f19233f + "}";
    }

    private a(long j10, int i10, int i11, long j11, int i12) {
        this.f19229b = j10;
        this.f19230c = i10;
        this.f19231d = i11;
        this.f19232e = j11;
        this.f19233f = i12;
    }
}
