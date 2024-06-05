package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.a0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import h.f;
import h.j;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f1300a;

    /* renamed from: b  reason: collision with root package name */
    private View f1301b;

    /* renamed from: c  reason: collision with root package name */
    private View f1302c;

    /* renamed from: d  reason: collision with root package name */
    private View f1303d;

    /* renamed from: f  reason: collision with root package name */
    Drawable f1304f;

    /* renamed from: g  reason: collision with root package name */
    Drawable f1305g;

    /* renamed from: h  reason: collision with root package name */
    Drawable f1306h;

    /* renamed from: i  reason: collision with root package name */
    boolean f1307i;

    /* renamed from: j  reason: collision with root package name */
    boolean f1308j;

    /* renamed from: k  reason: collision with root package name */
    private int f1309k;

    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a0.r0(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f18304a);
        this.f1304f = obtainStyledAttributes.getDrawable(j.f18309b);
        this.f1305g = obtainStyledAttributes.getDrawable(j.f18319d);
        this.f1309k = obtainStyledAttributes.getDimensionPixelSize(j.f18349j, -1);
        boolean z10 = true;
        if (getId() == f.H) {
            this.f1307i = true;
            this.f1306h = obtainStyledAttributes.getDrawable(j.f18314c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1307i ? !(this.f1304f == null && this.f1305g == null) : this.f1306h != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1304f;
        if (drawable != null && drawable.isStateful()) {
            this.f1304f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1305g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1305g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1306h;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1306h.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f1301b;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1304f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1305g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1306h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1302c = findViewById(f.f18241a);
        this.f1303d = findViewById(f.f18246f);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1300a || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f1301b;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i14 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i10, (measuredHeight - view.getMeasuredHeight()) - i14, i12, measuredHeight - i14);
        }
        if (this.f1307i) {
            Drawable drawable2 = this.f1306h;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = false;
            }
        } else {
            if (this.f1304f != null) {
                if (this.f1302c.getVisibility() == 0) {
                    this.f1304f.setBounds(this.f1302c.getLeft(), this.f1302c.getTop(), this.f1302c.getRight(), this.f1302c.getBottom());
                } else {
                    View view2 = this.f1303d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f1304f.setBounds(0, 0, 0, 0);
                    } else {
                        this.f1304f.setBounds(this.f1303d.getLeft(), this.f1303d.getTop(), this.f1303d.getRight(), this.f1303d.getBottom());
                    }
                }
                z12 = true;
            }
            this.f1308j = z13;
            if (!z13 || (drawable = this.f1305g) == null) {
                z11 = z12;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z11) {
            invalidate();
        }
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        if (this.f1302c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i13 = this.f1309k) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i13, View.MeasureSpec.getSize(i11)), RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(i10, i11);
        if (this.f1302c != null) {
            int mode = View.MeasureSpec.getMode(i11);
            View view = this.f1301b;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!b(this.f1302c)) {
                    i12 = a(this.f1302c);
                } else {
                    i12 = !b(this.f1303d) ? a(this.f1303d) : 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i12 + a(this.f1301b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : a.e.API_PRIORITY_OTHER));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1304f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1304f);
        }
        this.f1304f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1302c;
            if (view != null) {
                this.f1304f.setBounds(view.getLeft(), this.f1302c.getTop(), this.f1302c.getRight(), this.f1302c.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f1307i ? !(this.f1304f == null && this.f1305g == null) : this.f1306h != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            a.a(this);
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1306h;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1306h);
        }
        this.f1306h = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1307i && (drawable2 = this.f1306h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1307i ? this.f1304f == null && this.f1305g == null : this.f1306h == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            a.a(this);
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1305g;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1305g);
        }
        this.f1305g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1308j && (drawable2 = this.f1305g) != null) {
                drawable2.setBounds(this.f1301b.getLeft(), this.f1301b.getTop(), this.f1301b.getRight(), this.f1301b.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f1307i ? !(this.f1304f == null && this.f1305g == null) : this.f1306h != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            a.a(this);
        }
    }

    public void setTabContainer(s0 s0Var) {
        View view = this.f1301b;
        if (view != null) {
            removeView(view);
        }
        this.f1301b = s0Var;
        if (s0Var != null) {
            addView(s0Var);
            ViewGroup.LayoutParams layoutParams = s0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            s0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f1300a = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f1304f;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f1305g;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f1306h;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1304f && !this.f1307i) || (drawable == this.f1305g && this.f1308j) || ((drawable == this.f1306h && this.f1307i) || super.verifyDrawable(drawable));
    }
}
