package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.material.internal.g;
import x5.j;
import x5.k;

public class ChipGroup extends com.google.android.material.internal.c {

    /* renamed from: d  reason: collision with root package name */
    private int f25558d;

    /* renamed from: f  reason: collision with root package name */
    private int f25559f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f25560g;

    /* renamed from: h  reason: collision with root package name */
    private d f25561h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final b f25562i;

    /* renamed from: j  reason: collision with root package name */
    private e f25563j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public int f25564k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public boolean f25565l;

    private class b implements CompoundButton.OnCheckedChangeListener {
        private b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (!ChipGroup.this.f25565l) {
                int id2 = compoundButton.getId();
                if (z10) {
                    if (!(ChipGroup.this.f25564k == -1 || ChipGroup.this.f25564k == id2 || !ChipGroup.this.f25560g)) {
                        ChipGroup chipGroup = ChipGroup.this;
                        chipGroup.k(chipGroup.f25564k, false);
                    }
                    ChipGroup.this.setCheckedId(id2);
                } else if (ChipGroup.this.f25564k == id2) {
                    ChipGroup.this.setCheckedId(-1);
                }
            }
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }
    }

    public interface d {
        void a(ChipGroup chipGroup, int i10);
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f25567a;

        private e() {
        }

        public void onChildViewAdded(View view, View view2) {
            int i10;
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        i10 = View.generateViewId();
                    } else {
                        i10 = view2.hashCode();
                    }
                    view2.setId(i10);
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.f25562i);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f25567a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f25567a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5.b.chipGroupStyle);
    }

    /* access modifiers changed from: private */
    public void k(int i10, boolean z10) {
        View findViewById = findViewById(i10);
        if (findViewById instanceof Chip) {
            this.f25565l = true;
            ((Chip) findViewById).setChecked(z10);
            this.f25565l = false;
        }
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i10) {
        this.f25564k = i10;
        d dVar = this.f25561h;
        if (dVar != null && this.f25560g) {
            dVar.a(this, i10);
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i11 = this.f25564k;
                if (i11 != -1 && this.f25560g) {
                    k(i11, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i10, layoutParams);
    }

    public boolean b() {
        return super.b();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f25560g) {
            return this.f25564k;
        }
        return -1;
    }

    public int getChipSpacingHorizontal() {
        return this.f25558d;
    }

    public int getChipSpacingVertical() {
        return this.f25559f;
    }

    public void j() {
        this.f25565l = true;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f25565l = false;
        setCheckedId(-1);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f25564k;
        if (i10 != -1) {
            k(i10, true);
            setCheckedId(this.f25564k);
        }
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f25558d != i10) {
            this.f25558d = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f25559f != i10) {
            this.f25559f = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(d dVar) {
        this.f25561h = dVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        ViewGroup.OnHierarchyChangeListener unused = this.f25563j.f25567a = onHierarchyChangeListener;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        if (this.f25560g != z10) {
            this.f25560g = z10;
            j();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f25562i = new b();
        this.f25563j = new e();
        this.f25564k = -1;
        this.f25565l = false;
        TypedArray k10 = g.k(context, attributeSet, k.f31004y0, i10, j.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = k10.getDimensionPixelOffset(k.A0, 0);
        setChipSpacingHorizontal(k10.getDimensionPixelOffset(k.B0, dimensionPixelOffset));
        setChipSpacingVertical(k10.getDimensionPixelOffset(k.C0, dimensionPixelOffset));
        setSingleLine(k10.getBoolean(k.D0, false));
        setSingleSelection(k10.getBoolean(k.E0, false));
        int resourceId = k10.getResourceId(k.f31009z0, -1);
        if (resourceId != -1) {
            this.f25564k = resourceId;
        }
        k10.recycle();
        super.setOnHierarchyChangeListener(this.f25563j);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
