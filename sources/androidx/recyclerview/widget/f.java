package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LayoutState */
class f {

    /* renamed from: a  reason: collision with root package name */
    boolean f4622a = true;

    /* renamed from: b  reason: collision with root package name */
    int f4623b;

    /* renamed from: c  reason: collision with root package name */
    int f4624c;

    /* renamed from: d  reason: collision with root package name */
    int f4625d;

    /* renamed from: e  reason: collision with root package name */
    int f4626e;

    /* renamed from: f  reason: collision with root package name */
    int f4627f = 0;

    /* renamed from: g  reason: collision with root package name */
    int f4628g = 0;

    /* renamed from: h  reason: collision with root package name */
    boolean f4629h;

    /* renamed from: i  reason: collision with root package name */
    boolean f4630i;

    f() {
    }

    /* access modifiers changed from: package-private */
    public boolean a(RecyclerView.a0 a0Var) {
        int i10 = this.f4624c;
        return i10 >= 0 && i10 < a0Var.b();
    }

    /* access modifiers changed from: package-private */
    public View b(RecyclerView.v vVar) {
        View o10 = vVar.o(this.f4624c);
        this.f4624c += this.f4625d;
        return o10;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f4623b + ", mCurrentPosition=" + this.f4624c + ", mItemDirection=" + this.f4625d + ", mLayoutDirection=" + this.f4626e + ", mStartLine=" + this.f4627f + ", mEndLine=" + this.f4628g + '}';
    }
}
