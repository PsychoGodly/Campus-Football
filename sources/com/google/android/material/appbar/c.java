package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ViewOffsetBehavior */
class c<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    private d f25384a;

    /* renamed from: b  reason: collision with root package name */
    private int f25385b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f25386c = 0;

    public c() {
    }

    public int E() {
        d dVar = this.f25384a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void F(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        coordinatorLayout.C(v10, i10);
    }

    public boolean G(int i10) {
        d dVar = this.f25384a;
        if (dVar != null) {
            return dVar.e(i10);
        }
        this.f25385b = i10;
        return false;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        F(coordinatorLayout, v10, i10);
        if (this.f25384a == null) {
            this.f25384a = new d(v10);
        }
        this.f25384a.c();
        this.f25384a.a();
        int i11 = this.f25385b;
        if (i11 != 0) {
            this.f25384a.e(i11);
            this.f25385b = 0;
        }
        int i12 = this.f25386c;
        if (i12 == 0) {
            return true;
        }
        this.f25384a.d(i12);
        this.f25386c = 0;
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
