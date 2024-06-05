package r7;

import com.applovin.mediation.MaxReward;
import p8.d0;
import u7.i;
import u7.r;
import u7.z;
import y7.b;

/* compiled from: OrderBy */
public class z0 {

    /* renamed from: a  reason: collision with root package name */
    private final a f30059a;

    /* renamed from: b  reason: collision with root package name */
    final r f30060b;

    /* compiled from: OrderBy */
    public enum a {
        ASCENDING(1),
        DESCENDING(-1);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f30064a;

        private a(int i10) {
            this.f30064a = i10;
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f30064a;
        }
    }

    private z0(a aVar, r rVar) {
        this.f30059a = aVar;
        this.f30060b = rVar;
    }

    public static z0 d(a aVar, r rVar) {
        return new z0(aVar, rVar);
    }

    /* access modifiers changed from: package-private */
    public int a(i iVar, i iVar2) {
        int a10;
        int i10;
        if (this.f30060b.equals(r.f30633b)) {
            a10 = this.f30059a.a();
            i10 = iVar.getKey().compareTo(iVar2.getKey());
        } else {
            d0 h10 = iVar.h(this.f30060b);
            d0 h11 = iVar2.h(this.f30060b);
            b.d((h10 == null || h11 == null) ? false : true, "Trying to compare documents on fields that don't exist.", new Object[0]);
            a10 = this.f30059a.a();
            i10 = z.i(h10, h11);
        }
        return a10 * i10;
    }

    public a b() {
        return this.f30059a;
    }

    public r c() {
        return this.f30060b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (this.f30059a != z0Var.f30059a || !this.f30060b.equals(z0Var.f30060b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((899 + this.f30059a.hashCode()) * 31) + this.f30060b.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30059a == a.ASCENDING ? MaxReward.DEFAULT_LABEL : "-");
        sb2.append(this.f30060b.d());
        return sb2.toString();
    }
}
