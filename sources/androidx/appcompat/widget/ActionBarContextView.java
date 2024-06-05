package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.b;
import androidx.core.view.a0;
import androidx.core.view.g0;
import androidx.recyclerview.widget.RecyclerView;
import h.f;
import h.g;
import h.j;

public class ActionBarContextView extends a {

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f1310j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f1311k;

    /* renamed from: l  reason: collision with root package name */
    private View f1312l;

    /* renamed from: m  reason: collision with root package name */
    private View f1313m;

    /* renamed from: n  reason: collision with root package name */
    private View f1314n;

    /* renamed from: o  reason: collision with root package name */
    private LinearLayout f1315o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f1316p;

    /* renamed from: q  reason: collision with root package name */
    private TextView f1317q;

    /* renamed from: r  reason: collision with root package name */
    private int f1318r;

    /* renamed from: s  reason: collision with root package name */
    private int f1319s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1320t;

    /* renamed from: u  reason: collision with root package name */
    private int f1321u;

    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f1322a;

        a(b bVar) {
            this.f1322a = bVar;
        }

        public void onClick(View view) {
            this.f1322a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void i() {
        if (this.f1315o == null) {
            LayoutInflater.from(getContext()).inflate(g.f18267a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1315o = linearLayout;
            this.f1316p = (TextView) linearLayout.findViewById(f.f18245e);
            this.f1317q = (TextView) this.f1315o.findViewById(f.f18244d);
            if (this.f1318r != 0) {
                this.f1316p.setTextAppearance(getContext(), this.f1318r);
            }
            if (this.f1319s != 0) {
                this.f1317q.setTextAppearance(getContext(), this.f1319s);
            }
        }
        this.f1316p.setText(this.f1310j);
        this.f1317q.setText(this.f1311k);
        boolean z10 = !TextUtils.isEmpty(this.f1310j);
        boolean z11 = !TextUtils.isEmpty(this.f1311k);
        int i10 = 0;
        this.f1317q.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.f1315o;
        if (!z10 && !z11) {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        if (this.f1315o.getParent() == null) {
            addView(this.f1315o);
        }
    }

    public /* bridge */ /* synthetic */ g0 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f1312l == null) {
            k();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1311k;
    }

    public CharSequence getTitle() {
        return this.f1310j;
    }

    public void h(b bVar) {
        View view = this.f1312l;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1321u, this, false);
            this.f1312l = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1312l);
        }
        View findViewById = this.f1312l.findViewById(f.f18249i);
        this.f1313m = findViewById;
        findViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) bVar.e();
        c cVar = this.f1482d;
        if (cVar != null) {
            cVar.y();
        }
        c cVar2 = new c(getContext());
        this.f1482d = cVar2;
        cVar2.J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.c(this.f1482d, this.f1480b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f1482d.o(this);
        this.f1481c = actionMenuView;
        a0.r0(actionMenuView, (Drawable) null);
        addView(this.f1481c, layoutParams);
    }

    public boolean j() {
        return this.f1320t;
    }

    public void k() {
        removeAllViews();
        this.f1314n = null;
        this.f1481c = null;
        this.f1482d = null;
        View view = this.f1313m;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public boolean l() {
        c cVar = this.f1482d;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1482d;
        if (cVar != null) {
            cVar.B();
            this.f1482d.C();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean b10 = k1.b(this);
        int paddingRight = b10 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1312l;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1312l.getLayoutParams();
            int i14 = b10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = b10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d10 = a.d(paddingRight, i14, b10);
            paddingRight = a.d(d10 + e(this.f1312l, d10, paddingTop, paddingTop2, b10), i15, b10);
        }
        int i16 = paddingRight;
        LinearLayout linearLayout = this.f1315o;
        if (!(linearLayout == null || this.f1314n != null || linearLayout.getVisibility() == 8)) {
            i16 += e(this.f1315o, i16, paddingTop, paddingTop2, b10);
        }
        int i17 = i16;
        View view2 = this.f1314n;
        if (view2 != null) {
            e(view2, i17, paddingTop, paddingTop2, b10);
        }
        int paddingLeft = b10 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1481c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b10);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12 = 1073741824;
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i11) != 0) {
            int size = View.MeasureSpec.getSize(i10);
            int i13 = this.f1483f;
            if (i13 <= 0) {
                i13 = View.MeasureSpec.getSize(i11);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i14 = i13 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, RecyclerView.UNDEFINED_DURATION);
            View view = this.f1312l;
            if (view != null) {
                int c10 = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1312l.getLayoutParams();
                paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1481c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f1481c, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f1315o;
            if (linearLayout != null && this.f1314n == null) {
                if (this.f1320t) {
                    this.f1315o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1315o.getMeasuredWidth();
                    boolean z10 = measuredWidth <= paddingLeft;
                    if (z10) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f1315o.setVisibility(z10 ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f1314n;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i15 = layoutParams.width;
                int i16 = i15 != -2 ? 1073741824 : RecyclerView.UNDEFINED_DURATION;
                if (i15 >= 0) {
                    paddingLeft = Math.min(i15, paddingLeft);
                }
                int i17 = layoutParams.height;
                if (i17 == -2) {
                    i12 = RecyclerView.UNDEFINED_DURATION;
                }
                if (i17 >= 0) {
                    i14 = Math.min(i17, i14);
                }
                this.f1314n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i16), View.MeasureSpec.makeMeasureSpec(i14, i12));
            }
            if (this.f1483f <= 0) {
                int childCount = getChildCount();
                int i18 = 0;
                for (int i19 = 0; i19 < childCount; i19++) {
                    int measuredHeight = getChildAt(i19).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i18) {
                        i18 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i18);
                return;
            }
            setMeasuredDimension(size, i13);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i10) {
        this.f1483f = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1314n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1314n = view;
        if (!(view == null || (linearLayout = this.f1315o) == null)) {
            removeView(linearLayout);
            this.f1315o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1311k = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1310j = charSequence;
        i();
        a0.q0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f1320t) {
            requestLayout();
        }
        this.f1320t = z10;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.f18174j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        z0 v10 = z0.v(context, attributeSet, j.f18424y, i10, 0);
        a0.r0(this, v10.g(j.f18429z));
        this.f1318r = v10.n(j.D, 0);
        this.f1319s = v10.n(j.C, 0);
        this.f1483f = v10.m(j.B, 0);
        this.f1321u = v10.n(j.A, g.f18270d);
        v10.w();
    }
}
