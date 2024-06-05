package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import androidx.core.view.e;
import androidx.core.view.k0;
import androidx.recyclerview.widget.RecyclerView;
import b0.a;
import java.util.List;

/* compiled from: HeaderScrollingViewBehavior */
abstract class b extends c<View> {

    /* renamed from: d  reason: collision with root package name */
    final Rect f25380d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    final Rect f25381e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private int f25382f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f25383g;

    public b() {
    }

    private static int N(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View H = H(coordinatorLayout.l(view));
        if (H != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f25380d;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, H.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((coordinatorLayout.getHeight() + H.getBottom()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            k0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && a0.y(coordinatorLayout) && !a0.y(view)) {
                rect.left += lastWindowInsets.i();
                rect.right -= lastWindowInsets.j();
            }
            Rect rect2 = this.f25381e;
            e.a(N(fVar.f2643c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            int I = I(H);
            view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
            this.f25382f = rect2.top - H.getBottom();
            return;
        }
        super.F(coordinatorLayout, view, i10);
        this.f25382f = 0;
    }

    /* access modifiers changed from: package-private */
    public abstract View H(List<View> list);

    /* access modifiers changed from: package-private */
    public final int I(View view) {
        if (this.f25383g == 0) {
            return 0;
        }
        float J = J(view);
        int i10 = this.f25383g;
        return a.b((int) (J * ((float) i10)), 0, i10);
    }

    /* access modifiers changed from: package-private */
    public float J(View view) {
        return 1.0f;
    }

    public final int K() {
        return this.f25383g;
    }

    /* access modifiers changed from: package-private */
    public int L(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    public final int M() {
        return this.f25382f;
    }

    public final void O(int i10) {
        this.f25383g = i10;
    }

    /* access modifiers changed from: protected */
    public boolean P() {
        return false;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View H;
        k0 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (H = H(coordinatorLayout.l(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (a0.y(H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.k() + lastWindowInsets.h();
        }
        int L = size + L(H);
        int measuredHeight = H.getMeasuredHeight();
        if (P()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            L -= measuredHeight;
        }
        coordinatorLayout.D(view, i10, i11, View.MeasureSpec.makeMeasureSpec(L, i14 == -1 ? 1073741824 : RecyclerView.UNDEFINED_DURATION), i13);
        return true;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
