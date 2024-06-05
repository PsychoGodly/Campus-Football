package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.a0;
import n6.g;
import n6.h;
import x5.b;
import x5.j;

public class MaterialToolbar extends Toolbar {
    private static final int V = j.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.A);
    }

    private void S(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.T(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.L(context);
            gVar.S(a0.v(this));
            a0.r0(this, gVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i10) {
        super(com.google.android.material.internal.g.f(context, attributeSet, i10, V), attributeSet, i10);
        S(getContext());
    }
}
