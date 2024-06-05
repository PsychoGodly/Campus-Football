package q7;

import r7.a1;
import r7.f1;

/* compiled from: BundledQuery */
public class i implements c {

    /* renamed from: a  reason: collision with root package name */
    private final f1 f29703a;

    /* renamed from: b  reason: collision with root package name */
    private final a1.a f29704b;

    public i(f1 f1Var, a1.a aVar) {
        this.f29703a = f1Var;
        this.f29704b = aVar;
    }

    public a1.a a() {
        return this.f29704b;
    }

    public f1 b() {
        return this.f29703a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f29703a.equals(iVar.f29703a) && this.f29704b == iVar.f29704b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f29703a.hashCode() * 31) + this.f29704b.hashCode();
    }
}
