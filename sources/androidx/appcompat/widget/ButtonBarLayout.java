package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.a0;
import androidx.recyclerview.widget.RecyclerView;
import h.f;
import h.j;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f1373a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1374b;

    /* renamed from: c  reason: collision with root package name */
    private int f1375c = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = j.N0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        a0.l0(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f1373a = obtainStyledAttributes.getBoolean(j.O0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1373a);
        }
    }

    private int a(int i10) {
        int childCount = getChildCount();
        while (i10 < childCount) {
            if (getChildAt(i10).getVisibility() == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private boolean b() {
        return this.f1374b;
    }

    private void setStacked(boolean z10) {
        if (this.f1374b == z10) {
            return;
        }
        if (!z10 || this.f1373a) {
            this.f1374b = z10;
            setOrientation(z10 ? 1 : 0);
            setGravity(z10 ? 8388613 : 80);
            View findViewById = findViewById(f.G);
            if (findViewById != null) {
                findViewById.setVisibility(z10 ? 8 : 4);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 0;
        if (this.f1373a) {
            if (size > this.f1375c && b()) {
                setStacked(false);
            }
            this.f1375c = size;
        }
        if (b() || View.MeasureSpec.getMode(i10) != 1073741824) {
            i12 = i10;
            z10 = false;
        } else {
            i12 = View.MeasureSpec.makeMeasureSpec(size, RecyclerView.UNDEFINED_DURATION);
            z10 = true;
        }
        super.onMeasure(i12, i11);
        if (this.f1373a && !b()) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z10 = true;
            }
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int a10 = a(0);
        if (a10 >= 0) {
            View childAt = getChildAt(a10);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (b()) {
                int a11 = a(a10 + 1);
                if (a11 >= 0) {
                    paddingTop += getChildAt(a11).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i13 = paddingTop;
            } else {
                i13 = paddingTop + getPaddingBottom();
            }
        }
        if (a0.C(this) != i13) {
            setMinimumHeight(i13);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f1373a != z10) {
            this.f1373a = z10;
            if (!z10 && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
