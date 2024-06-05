package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.a0;
import androidx.core.view.g0;
import androidx.core.view.h0;
import androidx.recyclerview.widget.RecyclerView;
import h.j;

/* compiled from: AbsActionBarView */
abstract class a extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    protected final C0015a f1479a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f1480b;

    /* renamed from: c  reason: collision with root package name */
    protected ActionMenuView f1481c;

    /* renamed from: d  reason: collision with root package name */
    protected c f1482d;

    /* renamed from: f  reason: collision with root package name */
    protected int f1483f;

    /* renamed from: g  reason: collision with root package name */
    protected g0 f1484g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1485h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1486i;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AbsActionBarView */
    protected class C0015a implements h0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1487a = false;

        /* renamed from: b  reason: collision with root package name */
        int f1488b;

        protected C0015a() {
        }

        public void a(View view) {
            this.f1487a = true;
        }

        public void b(View view) {
            if (!this.f1487a) {
                a aVar = a.this;
                aVar.f1484g = null;
                a.super.setVisibility(this.f1488b);
            }
        }

        public void c(View view) {
            a.super.setVisibility(0);
            this.f1487a = false;
        }

        public C0015a d(g0 g0Var, int i10) {
            a.this.f1484g = g0Var;
            this.f1488b = i10;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    /* access modifiers changed from: protected */
    public int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, RecyclerView.UNDEFINED_DURATION), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    /* access modifiers changed from: protected */
    public int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public g0 f(int i10, long j10) {
        g0 g0Var = this.f1484g;
        if (g0Var != null) {
            g0Var.c();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            g0 b10 = a0.d(this).b(1.0f);
            b10.f(j10);
            b10.h(this.f1479a.d(b10, i10));
            return b10;
        }
        g0 b11 = a0.d(this).b(0.0f);
        b11.f(j10);
        b11.h(this.f1479a.d(b11, i10));
        return b11;
    }

    public int getAnimatedVisibility() {
        if (this.f1484g != null) {
            return this.f1479a.f1488b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1483f;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, j.f18304a, h.a.f18167c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(j.f18349j, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f1482d;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1486i = false;
        }
        if (!this.f1486i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1486i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1486i = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1485h = false;
        }
        if (!this.f1485h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1485h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1485h = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f1483f = i10;
        requestLayout();
    }

    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            g0 g0Var = this.f1484g;
            if (g0Var != null) {
                g0Var.c();
            }
            super.setVisibility(i10);
        }
    }

    a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1479a = new C0015a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(h.a.f18165a, typedValue, true) || typedValue.resourceId == 0) {
            this.f1480b = context;
        } else {
            this.f1480b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
