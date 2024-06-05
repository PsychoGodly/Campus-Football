package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import java.util.List;

public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f26004a = 0;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f26005a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f26006b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h6.a f26007c;

        a(View view, int i10, h6.a aVar) {
            this.f26005a = view;
            this.f26006b = i10;
            this.f26007c = aVar;
        }

        public boolean onPreDraw() {
            this.f26005a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f26004a == this.f26006b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                h6.a aVar = this.f26007c;
                expandableBehavior.H((View) aVar, this.f26005a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    private boolean F(boolean z10) {
        if (z10) {
            int i10 = this.f26004a;
            return i10 == 0 || i10 == 2;
        } else if (this.f26004a == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public h6.a G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> l10 = coordinatorLayout.l(view);
        int size = l10.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = l10.get(i10);
            if (e(coordinatorLayout, view, view2)) {
                return (h6.a) view2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract boolean H(View view, View view2, boolean z10, boolean z11);

    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        h6.a aVar = (h6.a) view2;
        if (!F(aVar.a())) {
            return false;
        }
        this.f26004a = aVar.a() ? 1 : 2;
        return H((View) aVar, view, aVar.a(), true);
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        h6.a G;
        if (a0.R(view) || (G = G(coordinatorLayout, view)) == null || !F(G.a())) {
            return false;
        }
        int i11 = G.a() ? 1 : 2;
        this.f26004a = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, G));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
