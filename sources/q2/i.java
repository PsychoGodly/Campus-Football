package q2;

import k4.a;
import n2.r1;

/* compiled from: DecoderReuseEvaluation */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f21765a;

    /* renamed from: b  reason: collision with root package name */
    public final r1 f21766b;

    /* renamed from: c  reason: collision with root package name */
    public final r1 f21767c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21768d;

    /* renamed from: e  reason: collision with root package name */
    public final int f21769e;

    public i(String str, r1 r1Var, r1 r1Var2, int i10, int i11) {
        a.a(i10 == 0 || i11 == 0);
        this.f21765a = a.d(str);
        this.f21766b = (r1) a.e(r1Var);
        this.f21767c = (r1) a.e(r1Var2);
        this.f21768d = i10;
        this.f21769e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f21768d != iVar.f21768d || this.f21769e != iVar.f21769e || !this.f21765a.equals(iVar.f21765a) || !this.f21766b.equals(iVar.f21766b) || !this.f21767c.equals(iVar.f21767c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((527 + this.f21768d) * 31) + this.f21769e) * 31) + this.f21765a.hashCode()) * 31) + this.f21766b.hashCode()) * 31) + this.f21767c.hashCode();
    }
}
