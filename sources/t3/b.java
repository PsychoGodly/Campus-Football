package t3;

import r6.k;

/* compiled from: BaseUrl */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f22582a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22583b;

    /* renamed from: c  reason: collision with root package name */
    public final int f22584c;

    /* renamed from: d  reason: collision with root package name */
    public final int f22585d;

    public b(String str, String str2, int i10, int i11) {
        this.f22582a = str;
        this.f22583b = str2;
        this.f22584c = i10;
        this.f22585d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f22584c != bVar.f22584c || this.f22585d != bVar.f22585d || !k.a(this.f22582a, bVar.f22582a) || !k.a(this.f22583b, bVar.f22583b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return k.b(this.f22582a, this.f22583b, Integer.valueOf(this.f22584c), Integer.valueOf(this.f22585d));
    }
}
