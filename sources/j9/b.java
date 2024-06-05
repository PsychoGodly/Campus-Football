package j9;

import i9.c;

/* compiled from: ExpandedPair */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f29084a;

    /* renamed from: b  reason: collision with root package name */
    private final i9.b f29085b;

    /* renamed from: c  reason: collision with root package name */
    private final i9.b f29086c;

    /* renamed from: d  reason: collision with root package name */
    private final c f29087d;

    b(i9.b bVar, i9.b bVar2, c cVar, boolean z10) {
        this.f29085b = bVar;
        this.f29086c = bVar2;
        this.f29087d = cVar;
        this.f29084a = z10;
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* access modifiers changed from: package-private */
    public c b() {
        return this.f29087d;
    }

    /* access modifiers changed from: package-private */
    public i9.b c() {
        return this.f29085b;
    }

    /* access modifiers changed from: package-private */
    public i9.b d() {
        return this.f29086c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!a(this.f29085b, bVar.f29085b) || !a(this.f29086c, bVar.f29086c) || !a(this.f29087d, bVar.f29087d)) {
            return false;
        }
        return true;
    }

    public boolean f() {
        return this.f29086c == null;
    }

    public int hashCode() {
        return (e(this.f29085b) ^ e(this.f29086c)) ^ e(this.f29087d);
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("[ ");
        sb2.append(this.f29085b);
        sb2.append(" , ");
        sb2.append(this.f29086c);
        sb2.append(" : ");
        c cVar = this.f29087d;
        if (cVar == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(cVar.c());
        }
        sb2.append(obj);
        sb2.append(" ]");
        return sb2.toString();
    }
}
