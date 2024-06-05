package i4;

import k4.n0;
import n2.h4;
import n2.s3;

/* compiled from: TrackSelectorResult */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f18963a;

    /* renamed from: b  reason: collision with root package name */
    public final s3[] f18964b;

    /* renamed from: c  reason: collision with root package name */
    public final s[] f18965c;

    /* renamed from: d  reason: collision with root package name */
    public final h4 f18966d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f18967e;

    public c0(s3[] s3VarArr, s[] sVarArr, h4 h4Var, Object obj) {
        this.f18964b = s3VarArr;
        this.f18965c = (s[]) sVarArr.clone();
        this.f18966d = h4Var;
        this.f18967e = obj;
        this.f18963a = s3VarArr.length;
    }

    public boolean a(c0 c0Var) {
        if (c0Var == null || c0Var.f18965c.length != this.f18965c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f18965c.length; i10++) {
            if (!b(c0Var, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(c0 c0Var, int i10) {
        if (c0Var != null && n0.c(this.f18964b[i10], c0Var.f18964b[i10]) && n0.c(this.f18965c[i10], c0Var.f18965c[i10])) {
            return true;
        }
        return false;
    }

    public boolean c(int i10) {
        return this.f18964b[i10] != null;
    }
}
