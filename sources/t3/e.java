package t3;

import k4.n0;

/* compiled from: Descriptor */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f22613a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22614b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22615c;

    public e(String str, String str2, String str3) {
        this.f22613a = str;
        this.f22614b = str2;
        this.f22615c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!n0.c(this.f22613a, eVar.f22613a) || !n0.c(this.f22614b, eVar.f22614b) || !n0.c(this.f22615c, eVar.f22615c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.f22613a.hashCode() * 31;
        String str = this.f22614b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f22615c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }
}
