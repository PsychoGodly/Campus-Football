package r7;

import java.util.List;
import p8.d0;
import r7.z0;
import u7.l;
import u7.r;
import u7.z;
import y7.b;

/* compiled from: Bound */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f29908a;

    /* renamed from: b  reason: collision with root package name */
    private final List<d0> f29909b;

    public i(List<d0> list, boolean z10) {
        this.f29909b = list;
        this.f29908a = z10;
    }

    private int a(List<z0> list, u7.i iVar) {
        int i10;
        b.d(this.f29909b.size() <= list.size(), "Bound has more components than query's orderBy", new Object[0]);
        int i11 = 0;
        for (int i12 = 0; i12 < this.f29909b.size(); i12++) {
            z0 z0Var = list.get(i12);
            d0 d0Var = this.f29909b.get(i12);
            if (z0Var.f30060b.equals(r.f30633b)) {
                b.d(z.B(d0Var), "Bound has a non-key value where the key path is being used %s", d0Var);
                i10 = l.f(d0Var.y0()).compareTo(iVar.getKey());
            } else {
                d0 h10 = iVar.h(z0Var.c());
                b.d(h10 != null, "Field should exist since document matched the orderBy already.", new Object[0]);
                i10 = z.i(d0Var, h10);
            }
            if (z0Var.b().equals(z0.a.DESCENDING)) {
                i10 *= -1;
            }
            i11 = i10;
            if (i11 != 0) {
                break;
            }
        }
        return i11;
    }

    public List<d0> b() {
        return this.f29909b;
    }

    public boolean c() {
        return this.f29908a;
    }

    public String d() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (d0 next : this.f29909b) {
            if (!z10) {
                sb2.append(",");
            }
            z10 = false;
            sb2.append(z.b(next));
        }
        return sb2.toString();
    }

    public boolean e(List<z0> list, u7.i iVar) {
        int a10 = a(list, iVar);
        if (this.f29908a) {
            if (a10 >= 0) {
                return true;
            }
        } else if (a10 > 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f29908a != iVar.f29908a || !this.f29909b.equals(iVar.f29909b)) {
            return false;
        }
        return true;
    }

    public boolean f(List<z0> list, u7.i iVar) {
        int a10 = a(list, iVar);
        if (this.f29908a) {
            if (a10 <= 0) {
                return true;
            }
        } else if (a10 < 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f29908a ? 1 : 0) * true) + this.f29909b.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bound(inclusive=");
        sb2.append(this.f29908a);
        sb2.append(", position=");
        for (int i10 = 0; i10 < this.f29909b.size(); i10++) {
            if (i10 > 0) {
                sb2.append(" and ");
            }
            sb2.append(z.b(this.f29909b.get(i10)));
        }
        sb2.append(")");
        return sb2.toString();
    }
}
