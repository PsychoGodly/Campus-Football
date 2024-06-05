package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SimpleItemAnimator */
public abstract class m extends RecyclerView.l {

    /* renamed from: g  reason: collision with root package name */
    boolean f4649g = true;

    public final void A(RecyclerView.d0 d0Var) {
        I(d0Var);
        h(d0Var);
    }

    public final void B(RecyclerView.d0 d0Var) {
        J(d0Var);
    }

    public final void C(RecyclerView.d0 d0Var, boolean z10) {
        K(d0Var, z10);
        h(d0Var);
    }

    public final void D(RecyclerView.d0 d0Var, boolean z10) {
        L(d0Var, z10);
    }

    public final void E(RecyclerView.d0 d0Var) {
        M(d0Var);
        h(d0Var);
    }

    public final void F(RecyclerView.d0 d0Var) {
        N(d0Var);
    }

    public final void G(RecyclerView.d0 d0Var) {
        O(d0Var);
        h(d0Var);
    }

    public final void H(RecyclerView.d0 d0Var) {
        P(d0Var);
    }

    public void I(RecyclerView.d0 d0Var) {
    }

    public void J(RecyclerView.d0 d0Var) {
    }

    public void K(RecyclerView.d0 d0Var, boolean z10) {
    }

    public void L(RecyclerView.d0 d0Var, boolean z10) {
    }

    public void M(RecyclerView.d0 d0Var) {
    }

    public void N(RecyclerView.d0 d0Var) {
    }

    public void O(RecyclerView.d0 d0Var) {
    }

    public void P(RecyclerView.d0 d0Var) {
    }

    public boolean a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i10;
        int i11;
        if (cVar == null || ((i10 = cVar.f4404a) == (i11 = cVar2.f4404a) && cVar.f4405b == cVar2.f4405b)) {
            return w(d0Var);
        }
        return y(d0Var, i10, cVar.f4405b, i11, cVar2.f4405b);
    }

    public boolean b(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f4404a;
        int i13 = cVar.f4405b;
        if (d0Var2.shouldIgnore()) {
            int i14 = cVar.f4404a;
            i10 = cVar.f4405b;
            i11 = i14;
        } else {
            i11 = cVar2.f4404a;
            i10 = cVar2.f4405b;
        }
        return x(d0Var, d0Var2, i12, i13, i11, i10);
    }

    public boolean c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i10 = cVar.f4404a;
        int i11 = cVar.f4405b;
        View view = d0Var.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f4404a;
        int top = cVar2 == null ? view.getTop() : cVar2.f4405b;
        if (d0Var.isRemoved() || (i10 == left && i11 == top)) {
            return z(d0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(d0Var, i10, i11, left, top);
    }

    public boolean d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i10 = cVar.f4404a;
        int i11 = cVar2.f4404a;
        if (i10 == i11 && cVar.f4405b == cVar2.f4405b) {
            E(d0Var);
            return false;
        }
        return y(d0Var, i10, cVar.f4405b, i11, cVar2.f4405b);
    }

    public boolean f(RecyclerView.d0 d0Var) {
        return !this.f4649g || d0Var.isInvalid();
    }

    public abstract boolean w(RecyclerView.d0 d0Var);

    public abstract boolean x(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i10, int i11, int i12, int i13);

    public abstract boolean y(RecyclerView.d0 d0Var, int i10, int i11, int i12, int i13);

    public abstract boolean z(RecyclerView.d0 d0Var);
}
