package v7;

import u7.s;
import u7.w;
import y7.b;

/* compiled from: Precondition */
public final class m {

    /* renamed from: c  reason: collision with root package name */
    public static final m f30717c = new m((w) null, (Boolean) null);

    /* renamed from: a  reason: collision with root package name */
    private final w f30718a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f30719b;

    private m(w wVar, Boolean bool) {
        b.d(wVar == null || bool == null, "Precondition can specify \"exists\" or \"updateTime\" but not both", new Object[0]);
        this.f30718a = wVar;
        this.f30719b = bool;
    }

    public static m a(boolean z10) {
        return new m((w) null, Boolean.valueOf(z10));
    }

    public static m f(w wVar) {
        return new m(wVar, (Boolean) null);
    }

    public Boolean b() {
        return this.f30719b;
    }

    public w c() {
        return this.f30718a;
    }

    public boolean d() {
        return this.f30718a == null && this.f30719b == null;
    }

    public boolean e(s sVar) {
        if (this.f30718a == null) {
            Boolean bool = this.f30719b;
            if (bool == null) {
                b.d(d(), "Precondition should be empty", new Object[0]);
                return true;
            } else if (bool.booleanValue() == sVar.b()) {
                return true;
            } else {
                return false;
            }
        } else if (!sVar.b() || !sVar.getVersion().equals(this.f30718a)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        w wVar = this.f30718a;
        if (wVar == null ? mVar.f30718a != null : !wVar.equals(mVar.f30718a)) {
            return false;
        }
        Boolean bool = this.f30719b;
        Boolean bool2 = mVar.f30719b;
        if (bool != null) {
            return bool.equals(bool2);
        }
        if (bool2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        w wVar = this.f30718a;
        int i10 = 0;
        int hashCode = (wVar != null ? wVar.hashCode() : 0) * 31;
        Boolean bool = this.f30719b;
        if (bool != null) {
            i10 = bool.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        if (d()) {
            return "Precondition{<none>}";
        }
        if (this.f30718a != null) {
            return "Precondition{updateTime=" + this.f30718a + "}";
        } else if (this.f30719b != null) {
            return "Precondition{exists=" + this.f30719b + "}";
        } else {
            throw b.a("Invalid Precondition", new Object[0]);
        }
    }
}
