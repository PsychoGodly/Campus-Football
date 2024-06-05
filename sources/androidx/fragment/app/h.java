package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.a0;
import androidx.core.view.k0;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import l0.c;

/* compiled from: FragmentContainerView */
public final class h extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<View> f3616a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<View> f3617b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f3618c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3619d = true;

    h(Context context, AttributeSet attributeSet, n nVar) {
        super(context, attributeSet);
        String str;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f19855h);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(c.f19856i) : classAttribute;
        String string = obtainStyledAttributes.getString(c.f19857j);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment h02 = nVar.h0(id2);
        if (classAttribute != null && h02 == null) {
            if (id2 <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = MaxReward.DEFAULT_LABEL;
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a10 = nVar.q0().a(context.getClassLoader(), classAttribute);
            a10.y0(context, attributeSet, (Bundle) null);
            nVar.l().o(true).c(this, a10, string).i();
        }
        nVar.T0(this);
    }

    private void a(View view) {
        ArrayList<View> arrayList = this.f3617b;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.f3616a == null) {
                this.f3616a = new ArrayList<>();
            }
            this.f3616a.add(view);
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (n.z0(view) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        if (n.z0(view) != null) {
            return super.addViewInLayout(view, i10, layoutParams, z10);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        k0 k0Var;
        k0 v10 = k0.v(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f3618c;
        if (onApplyWindowInsetsListener != null) {
            k0Var = k0.v(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            k0Var = a0.Z(this, v10);
        }
        if (!k0Var.n()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                a0.h(getChildAt(i10), k0Var);
            }
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f3619d && this.f3616a != null) {
            for (int i10 = 0; i10 < this.f3616a.size(); i10++) {
                super.drawChild(canvas, this.f3616a.get(i10), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        ArrayList<View> arrayList;
        if (!this.f3619d || (arrayList = this.f3616a) == null || arrayList.size() <= 0 || !this.f3616a.contains(view)) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f3617b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f3616a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f3619d = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z10) {
        if (z10) {
            a(view);
        }
        super.removeDetachedView(view, z10);
    }

    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i10) {
        a(getChildAt(i10));
        super.removeViewAt(i10);
    }

    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViews(i10, i11);
    }

    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViewsInLayout(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public void setDrawDisappearingViewsLast(boolean z10) {
        this.f3619d = z10;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f3618c = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f3617b == null) {
                this.f3617b = new ArrayList<>();
            }
            this.f3617b.add(view);
        }
        super.startViewTransition(view);
    }
}
