package q2;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: Buffer */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private int f21729a;

    public final void f(int i10) {
        this.f21729a = i10 | this.f21729a;
    }

    public void g() {
        this.f21729a = 0;
    }

    public final void h(int i10) {
        this.f21729a = (~i10) & this.f21729a;
    }

    /* access modifiers changed from: protected */
    public final boolean i(int i10) {
        return (this.f21729a & i10) == i10;
    }

    public final boolean j() {
        return i(268435456);
    }

    public final boolean k() {
        return i(RecyclerView.UNDEFINED_DURATION);
    }

    public final boolean l() {
        return i(4);
    }

    public final boolean m() {
        return i(134217728);
    }

    public final boolean n() {
        return i(1);
    }

    public final boolean o() {
        return i(536870912);
    }

    public final void p(int i10) {
        this.f21729a = i10;
    }
}
