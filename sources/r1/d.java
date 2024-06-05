package r1;

/* compiled from: Preference */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public String f21898a;

    /* renamed from: b  reason: collision with root package name */
    public Long f21899b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(String str, boolean z10) {
        this(str, z10 ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f21898a.equals(dVar.f21898a)) {
            return false;
        }
        Long l10 = this.f21899b;
        Long l11 = dVar.f21899b;
        if (l10 != null) {
            return l10.equals(l11);
        }
        if (l11 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f21898a.hashCode() * 31;
        Long l10 = this.f21899b;
        return hashCode + (l10 != null ? l10.hashCode() : 0);
    }

    public d(String str, long j10) {
        this.f21898a = str;
        this.f21899b = Long.valueOf(j10);
    }
}
