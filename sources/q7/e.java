package q7;

import u7.w;

/* compiled from: BundleMetadata */
public class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f29685a;

    /* renamed from: b  reason: collision with root package name */
    private final int f29686b;

    /* renamed from: c  reason: collision with root package name */
    private final w f29687c;

    /* renamed from: d  reason: collision with root package name */
    private final int f29688d;

    /* renamed from: e  reason: collision with root package name */
    private final long f29689e;

    public e(String str, int i10, w wVar, int i11, long j10) {
        this.f29685a = str;
        this.f29686b = i10;
        this.f29687c = wVar;
        this.f29688d = i11;
        this.f29689e = j10;
    }

    public String a() {
        return this.f29685a;
    }

    public w b() {
        return this.f29687c;
    }

    public int c() {
        return this.f29686b;
    }

    public long d() {
        return this.f29689e;
    }

    public int e() {
        return this.f29688d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f29686b == eVar.f29686b && this.f29688d == eVar.f29688d && this.f29689e == eVar.f29689e && this.f29685a.equals(eVar.f29685a)) {
            return this.f29687c.equals(eVar.f29687c);
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f29689e;
        return (((((((this.f29685a.hashCode() * 31) + this.f29686b) * 31) + this.f29688d) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f29687c.hashCode();
    }
}
