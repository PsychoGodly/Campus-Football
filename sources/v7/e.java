package v7;

import u7.r;

/* compiled from: FieldTransform */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final r f30698a;

    /* renamed from: b  reason: collision with root package name */
    private final p f30699b;

    public e(r rVar, p pVar) {
        this.f30698a = rVar;
        this.f30699b = pVar;
    }

    public r a() {
        return this.f30698a;
    }

    public p b() {
        return this.f30699b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f30698a.equals(eVar.f30698a)) {
            return false;
        }
        return this.f30699b.equals(eVar.f30699b);
    }

    public int hashCode() {
        return (this.f30698a.hashCode() * 31) + this.f30699b.hashCode();
    }
}
