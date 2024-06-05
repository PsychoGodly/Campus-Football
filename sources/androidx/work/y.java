package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: WorkInfo */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private UUID f5347a;

    /* renamed from: b  reason: collision with root package name */
    private a f5348b;

    /* renamed from: c  reason: collision with root package name */
    private e f5349c;

    /* renamed from: d  reason: collision with root package name */
    private Set<String> f5350d;

    /* renamed from: e  reason: collision with root package name */
    private e f5351e;

    /* renamed from: f  reason: collision with root package name */
    private int f5352f;

    /* compiled from: WorkInfo */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean a() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public y(UUID uuid, a aVar, e eVar, List<String> list, e eVar2, int i10) {
        this.f5347a = uuid;
        this.f5348b = aVar;
        this.f5349c = eVar;
        this.f5350d = new HashSet(list);
        this.f5351e = eVar2;
        this.f5352f = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f5352f == yVar.f5352f && this.f5347a.equals(yVar.f5347a) && this.f5348b == yVar.f5348b && this.f5349c.equals(yVar.f5349c) && this.f5350d.equals(yVar.f5350d)) {
            return this.f5351e.equals(yVar.f5351e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f5347a.hashCode() * 31) + this.f5348b.hashCode()) * 31) + this.f5349c.hashCode()) * 31) + this.f5350d.hashCode()) * 31) + this.f5351e.hashCode()) * 31) + this.f5352f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f5347a + '\'' + ", mState=" + this.f5348b + ", mOutputData=" + this.f5349c + ", mTags=" + this.f5350d + ", mProgress=" + this.f5351e + '}';
    }
}
