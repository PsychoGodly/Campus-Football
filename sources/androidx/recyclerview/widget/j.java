package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    protected final RecyclerView.o f4642a;

    /* renamed from: b  reason: collision with root package name */
    private int f4643b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f4644c;

    /* compiled from: OrientationHelper */
    static class a extends j {
        a(RecyclerView.o oVar) {
            super(oVar, (a) null);
        }

        public int d(View view) {
            return this.f4642a.T(view) + ((RecyclerView.p) view.getLayoutParams()).rightMargin;
        }

        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f4642a.S(view) + pVar.leftMargin + pVar.rightMargin;
        }

        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f4642a.R(view) + pVar.topMargin + pVar.bottomMargin;
        }

        public int g(View view) {
            return this.f4642a.Q(view) - ((RecyclerView.p) view.getLayoutParams()).leftMargin;
        }

        public int h() {
            return this.f4642a.o0();
        }

        public int i() {
            return this.f4642a.o0() - this.f4642a.f0();
        }

        public int j() {
            return this.f4642a.f0();
        }

        public int k() {
            return this.f4642a.p0();
        }

        public int l() {
            return this.f4642a.X();
        }

        public int m() {
            return this.f4642a.e0();
        }

        public int n() {
            return (this.f4642a.o0() - this.f4642a.e0()) - this.f4642a.f0();
        }

        public int p(View view) {
            this.f4642a.n0(view, true, this.f4644c);
            return this.f4644c.right;
        }

        public int q(View view) {
            this.f4642a.n0(view, true, this.f4644c);
            return this.f4644c.left;
        }

        public void r(int i10) {
            this.f4642a.C0(i10);
        }
    }

    /* compiled from: OrientationHelper */
    static class b extends j {
        b(RecyclerView.o oVar) {
            super(oVar, (a) null);
        }

        public int d(View view) {
            return this.f4642a.O(view) + ((RecyclerView.p) view.getLayoutParams()).bottomMargin;
        }

        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f4642a.R(view) + pVar.topMargin + pVar.bottomMargin;
        }

        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f4642a.S(view) + pVar.leftMargin + pVar.rightMargin;
        }

        public int g(View view) {
            return this.f4642a.U(view) - ((RecyclerView.p) view.getLayoutParams()).topMargin;
        }

        public int h() {
            return this.f4642a.W();
        }

        public int i() {
            return this.f4642a.W() - this.f4642a.d0();
        }

        public int j() {
            return this.f4642a.d0();
        }

        public int k() {
            return this.f4642a.X();
        }

        public int l() {
            return this.f4642a.p0();
        }

        public int m() {
            return this.f4642a.g0();
        }

        public int n() {
            return (this.f4642a.W() - this.f4642a.g0()) - this.f4642a.d0();
        }

        public int p(View view) {
            this.f4642a.n0(view, true, this.f4644c);
            return this.f4644c.bottom;
        }

        public int q(View view) {
            this.f4642a.n0(view, true, this.f4644c);
            return this.f4644c.top;
        }

        public void r(int i10) {
            this.f4642a.D0(i10);
        }
    }

    /* synthetic */ j(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static j a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static j b(RecyclerView.o oVar, int i10) {
        if (i10 == 0) {
            return a(oVar);
        }
        if (i10 == 1) {
            return c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static j c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f4643b) {
            return 0;
        }
        return n() - this.f4643b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i10);

    public void s() {
        this.f4643b = n();
    }

    private j(RecyclerView.o oVar) {
        this.f4643b = RecyclerView.UNDEFINED_DURATION;
        this.f4644c = new Rect();
        this.f4642a = oVar;
    }
}
