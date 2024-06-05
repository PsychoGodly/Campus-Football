package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.e1;
import androidx.appcompat.widget.l0;
import androidx.core.content.res.h;
import androidx.core.view.a0;
import androidx.core.view.accessibility.c;
import x5.d;
import x5.e;
import x5.f;

public class NavigationMenuItemView extends d implements n.a {
    private static final int[] G = {16842912};
    private FrameLayout A;
    private i B;
    private ColorStateList C;
    private boolean D;
    private Drawable E;
    private final androidx.core.view.a F;

    /* renamed from: w  reason: collision with root package name */
    private int f25796w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f25797x;

    /* renamed from: y  reason: collision with root package name */
    boolean f25798y;

    /* renamed from: z  reason: collision with root package name */
    private final CheckedTextView f25799z;

    class a extends androidx.core.view.a {
        a() {
        }

        public void g(View view, c cVar) {
            super.g(view, cVar);
            cVar.V(NavigationMenuItemView.this.f25798y);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B() {
        if (D()) {
            this.f25799z.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                l0.a aVar = (l0.a) frameLayout.getLayoutParams();
                aVar.width = -1;
                this.A.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f25799z.setVisibility(0);
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            l0.a aVar2 = (l0.a) frameLayout2.getLayoutParams();
            aVar2.width = -2;
            this.A.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(h.a.f18187w, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean D() {
        return this.B.getTitle() == null && this.B.getIcon() == null && this.B.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(f.design_menu_item_action_area_stub)).inflate();
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    public boolean d() {
        return false;
    }

    public void e(i iVar, int i10) {
        this.B = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            a0.r0(this, C());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        e1.a(this, iVar.getTooltipText());
        B();
    }

    public i getItemData() {
        return this.B;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        i iVar = this.B;
        if (iVar != null && iVar.isCheckable() && this.B.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f25798y != z10) {
            this.f25798y = z10;
            this.F.l(this.f25799z, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f25799z.setChecked(z10);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, 0, i10, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
                androidx.core.graphics.drawable.a.o(drawable, this.C);
            }
            int i10 = this.f25796w;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f25797x) {
            if (this.E == null) {
                Drawable d10 = h.d(getResources(), e.navigation_empty_icon, getContext().getTheme());
                this.E = d10;
                if (d10 != null) {
                    int i11 = this.f25796w;
                    d10.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.E;
        }
        androidx.core.widget.i.i(this.f25799z, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i10) {
        this.f25799z.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f25796w = i10;
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        this.D = colorStateList != null;
        i iVar = this.B;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f25799z.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f25797x = z10;
    }

    public void setTextAppearance(int i10) {
        androidx.core.widget.i.n(this.f25799z, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f25799z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f25799z.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a aVar = new a();
        this.F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(x5.h.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(f.design_menu_item_text);
        this.f25799z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        a0.n0(checkedTextView, aVar);
    }
}
