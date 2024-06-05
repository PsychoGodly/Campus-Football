package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.l0;

/* compiled from: ScrollingTabContainerView */
public class s0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: k  reason: collision with root package name */
    private static final Interpolator f1785k = new DecelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    Runnable f1786a;

    /* renamed from: b  reason: collision with root package name */
    private c f1787b;

    /* renamed from: c  reason: collision with root package name */
    l0 f1788c;

    /* renamed from: d  reason: collision with root package name */
    private Spinner f1789d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1790f;

    /* renamed from: g  reason: collision with root package name */
    int f1791g;

    /* renamed from: h  reason: collision with root package name */
    int f1792h;

    /* renamed from: i  reason: collision with root package name */
    private int f1793i;

    /* renamed from: j  reason: collision with root package name */
    private int f1794j;

    /* compiled from: ScrollingTabContainerView */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f1795a;

        a(View view) {
            this.f1795a = view;
        }

        public void run() {
            s0.this.smoothScrollTo(this.f1795a.getLeft() - ((s0.this.getWidth() - this.f1795a.getWidth()) / 2), 0);
            s0.this.f1786a = null;
        }
    }

    /* compiled from: ScrollingTabContainerView */
    private class b extends BaseAdapter {
        b() {
        }

        public int getCount() {
            return s0.this.f1788c.getChildCount();
        }

        public Object getItem(int i10) {
            return ((d) s0.this.f1788c.getChildAt(i10)).b();
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return s0.this.c((a.c) getItem(i10), true);
            }
            ((d) view).a((a.c) getItem(i10));
            return view;
        }
    }

    /* compiled from: ScrollingTabContainerView */
    private class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = s0.this.f1788c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = s0.this.f1788c.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* compiled from: ScrollingTabContainerView */
    private class d extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f1799a;

        /* renamed from: b  reason: collision with root package name */
        private a.c f1800b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f1801c;

        /* renamed from: d  reason: collision with root package name */
        private ImageView f1802d;

        /* renamed from: f  reason: collision with root package name */
        private View f1803f;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d(android.content.Context r6, androidx.appcompat.app.a.c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.s0.this = r5
                int r5 = h.a.f18168d
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1799a = r1
                r4.f1800b = r7
                androidx.appcompat.widget.z0 r5 = androidx.appcompat.widget.z0.v(r6, r0, r1, r5, r3)
                boolean r6 = r5.s(r3)
                if (r6 == 0) goto L_0x0026
                android.graphics.drawable.Drawable r6 = r5.g(r3)
                r4.setBackgroundDrawable(r6)
            L_0x0026:
                r5.w()
                if (r8 == 0) goto L_0x0031
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L_0x0031:
                r4.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.s0.d.<init>(androidx.appcompat.widget.s0, android.content.Context, androidx.appcompat.app.a$c, boolean):void");
        }

        public void a(a.c cVar) {
            this.f1800b = cVar;
            c();
        }

        public a.c b() {
            return this.f1800b;
        }

        public void c() {
            a.c cVar = this.f1800b;
            View b10 = cVar.b();
            CharSequence charSequence = null;
            if (b10 != null) {
                ViewParent parent = b10.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b10);
                    }
                    addView(b10);
                }
                this.f1803f = b10;
                TextView textView = this.f1801c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1802d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1802d.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f1803f;
            if (view != null) {
                removeView(view);
                this.f1803f = null;
            }
            Drawable c10 = cVar.c();
            CharSequence d10 = cVar.d();
            if (c10 != null) {
                if (this.f1802d == null) {
                    q qVar = new q(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    qVar.setLayoutParams(layoutParams);
                    addView(qVar, 0);
                    this.f1802d = qVar;
                }
                this.f1802d.setImageDrawable(c10);
                this.f1802d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1802d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1802d.setImageDrawable((Drawable) null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(d10);
            if (z10) {
                if (this.f1801c == null) {
                    c0 c0Var = new c0(getContext(), (AttributeSet) null, h.a.f18169e);
                    c0Var.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    c0Var.setLayoutParams(layoutParams2);
                    addView(c0Var);
                    this.f1801c = c0Var;
                }
                this.f1801c.setText(d10);
                this.f1801c.setVisibility(0);
            } else {
                TextView textView2 = this.f1801c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1801c.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1802d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            if (!z10) {
                charSequence = cVar.a();
            }
            e1.a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i10, int i11) {
            int i12;
            super.onMeasure(i10, i11);
            if (s0.this.f1791g > 0 && getMeasuredWidth() > (i12 = s0.this.f1791g)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
            }
        }

        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private Spinner b() {
        z zVar = new z(getContext(), (AttributeSet) null, h.a.f18172h);
        zVar.setLayoutParams(new l0.a(-2, -1));
        zVar.setOnItemSelectedListener(this);
        return zVar;
    }

    private boolean d() {
        Spinner spinner = this.f1789d;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (!d()) {
            if (this.f1789d == null) {
                this.f1789d = b();
            }
            removeView(this.f1788c);
            addView(this.f1789d, new ViewGroup.LayoutParams(-2, -1));
            if (this.f1789d.getAdapter() == null) {
                this.f1789d.setAdapter(new b());
            }
            Runnable runnable = this.f1786a;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f1786a = null;
            }
            this.f1789d.setSelection(this.f1794j);
        }
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f1789d);
        addView(this.f1788c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1789d.getSelectedItemPosition());
        return false;
    }

    public void a(int i10) {
        View childAt = this.f1788c.getChildAt(i10);
        Runnable runnable = this.f1786a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1786a = aVar;
        post(aVar);
    }

    /* access modifiers changed from: package-private */
    public d c(a.c cVar, boolean z10) {
        d dVar = new d(getContext(), cVar, z10);
        if (z10) {
            dVar.setBackgroundDrawable((Drawable) null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1793i));
        } else {
            dVar.setFocusable(true);
            if (this.f1787b == null) {
                this.f1787b = new c();
            }
            dVar.setOnClickListener(this.f1787b);
        }
        return dVar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1786a;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.view.a b10 = androidx.appcompat.view.a.b(getContext());
        setContentHeight(b10.f());
        this.f1792h = b10.e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1786a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((d) view).b().e();
    }

    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = true;
        boolean z11 = mode == 1073741824;
        setFillViewport(z11);
        int childCount = this.f1788c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1791g = -1;
        } else {
            if (childCount > 2) {
                this.f1791g = (int) (((float) View.MeasureSpec.getSize(i10)) * 0.4f);
            } else {
                this.f1791g = View.MeasureSpec.getSize(i10) / 2;
            }
            this.f1791g = Math.min(this.f1791g, this.f1792h);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1793i, 1073741824);
        if (z11 || !this.f1790f) {
            z10 = false;
        }
        if (z10) {
            this.f1788c.measure(0, makeMeasureSpec);
            if (this.f1788c.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                e();
            } else {
                f();
            }
        } else {
            f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i10, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z11 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f1794j);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z10) {
        this.f1790f = z10;
    }

    public void setContentHeight(int i10) {
        this.f1793i = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f1794j = i10;
        int childCount = this.f1788c.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f1788c.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                a(i10);
            }
            i11++;
        }
        Spinner spinner = this.f1789d;
        if (spinner != null && i10 >= 0) {
            spinner.setSelection(i10);
        }
    }
}
