package x7;

import com.google.protobuf.i;
import g7.e;
import u7.l;

/* compiled from: TargetChange */
public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    private final i f31144a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f31145b;

    /* renamed from: c  reason: collision with root package name */
    private final e<l> f31146c;

    /* renamed from: d  reason: collision with root package name */
    private final e<l> f31147d;

    /* renamed from: e  reason: collision with root package name */
    private final e<l> f31148e;

    public u0(i iVar, boolean z10, e<l> eVar, e<l> eVar2, e<l> eVar3) {
        this.f31144a = iVar;
        this.f31145b = z10;
        this.f31146c = eVar;
        this.f31147d = eVar2;
        this.f31148e = eVar3;
    }

    public static u0 a(boolean z10, i iVar) {
        return new u0(iVar, z10, l.e(), l.e(), l.e());
    }

    public e<l> b() {
        return this.f31146c;
    }

    public e<l> c() {
        return this.f31147d;
    }

    public e<l> d() {
        return this.f31148e;
    }

    public i e() {
        return this.f31144a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u0.class != obj.getClass()) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (this.f31145b == u0Var.f31145b && this.f31144a.equals(u0Var.f31144a) && this.f31146c.equals(u0Var.f31146c) && this.f31147d.equals(u0Var.f31147d)) {
            return this.f31148e.equals(u0Var.f31148e);
        }
        return false;
    }

    public boolean f() {
        return this.f31145b;
    }

    public int hashCode() {
        return (((((((this.f31144a.hashCode() * 31) + (this.f31145b ? 1 : 0)) * 31) + this.f31146c.hashCode()) * 31) + this.f31147d.hashCode()) * 31) + this.f31148e.hashCode();
    }
}
