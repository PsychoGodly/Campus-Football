package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.l0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;

public class ActionMenuView extends l0 implements g.b, n {
    private int A;
    e B;

    /* renamed from: q  reason: collision with root package name */
    private g f1352q;

    /* renamed from: r  reason: collision with root package name */
    private Context f1353r;

    /* renamed from: s  reason: collision with root package name */
    private int f1354s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1355t;

    /* renamed from: u  reason: collision with root package name */
    private c f1356u;

    /* renamed from: v  reason: collision with root package name */
    private m.a f1357v;

    /* renamed from: w  reason: collision with root package name */
    g.a f1358w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f1359x;

    /* renamed from: y  reason: collision with root package name */
    private int f1360y;

    /* renamed from: z  reason: collision with root package name */
    private int f1361z;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements m.a {
        b() {
        }

        public void a(g gVar, boolean z10) {
        }

        public boolean b(g gVar) {
            return false;
        }
    }

    public static class c extends l0.a {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f1362a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f1363b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f1364c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f1365d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f1366e;

        /* renamed from: f  reason: collision with root package name */
        boolean f1367f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f1362a = cVar.f1362a;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f1362a = false;
        }
    }

    private class d implements g.a {
        d() {
        }

        public boolean a(g gVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.B;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        public void b(g gVar) {
            g.a aVar = ActionMenuView.this.f1358w;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    static int L(View view, int i10, int i11, int i12, int i13) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z10 = true;
        boolean z11 = actionMenuItemView != null && actionMenuItemView.r();
        int i14 = 2;
        if (i11 <= 0 || (z11 && i11 < 2)) {
            i14 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i15 = measuredWidth / i10;
            if (measuredWidth % i10 != 0) {
                i15++;
            }
            if (!z11 || i15 >= 2) {
                i14 = i15;
            }
        }
        if (cVar.f1362a || !z11) {
            z10 = false;
        }
        cVar.f1365d = z10;
        cVar.f1363b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), makeMeasureSpec);
        return i14;
    }

    private void M(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        int i15;
        boolean z13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i16 = size - paddingLeft;
        int i17 = this.f1361z;
        int i18 = i16 / i17;
        int i19 = i16 % i17;
        if (i18 == 0) {
            setMeasuredDimension(i16, 0);
            return;
        }
        int i20 = i17 + (i19 / i18);
        int childCount = getChildCount();
        int i21 = 0;
        int i22 = 0;
        boolean z14 = false;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        long j10 = 0;
        while (i22 < childCount) {
            View childAt = getChildAt(i22);
            int i26 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z15 = childAt instanceof ActionMenuItemView;
                int i27 = i23 + 1;
                if (z15) {
                    int i28 = this.A;
                    i15 = i27;
                    z13 = false;
                    childAt.setPadding(i28, 0, i28, 0);
                } else {
                    i15 = i27;
                    z13 = false;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f1367f = z13;
                cVar.f1364c = z13 ? 1 : 0;
                cVar.f1363b = z13;
                cVar.f1365d = z13;
                cVar.leftMargin = z13;
                cVar.rightMargin = z13;
                cVar.f1366e = z15 && ((ActionMenuItemView) childAt).r();
                int L = L(childAt, i20, cVar.f1362a ? 1 : i18, childMeasureSpec, paddingTop);
                i24 = Math.max(i24, L);
                if (cVar.f1365d) {
                    i25++;
                }
                if (cVar.f1362a) {
                    z14 = true;
                }
                i18 -= L;
                i21 = Math.max(i21, childAt.getMeasuredHeight());
                if (L == 1) {
                    j10 |= (long) (1 << i22);
                    i21 = i21;
                } else {
                    int i29 = i21;
                }
                i23 = i15;
            }
            i22++;
            size2 = i26;
        }
        int i30 = size2;
        boolean z16 = z14 && i23 == 2;
        boolean z17 = false;
        while (true) {
            if (i25 <= 0 || i18 <= 0) {
                i14 = mode;
                i12 = i16;
                z10 = z17;
                i13 = i21;
            } else {
                int i31 = 0;
                int i32 = 0;
                int i33 = a.e.API_PRIORITY_OTHER;
                long j11 = 0;
                while (i32 < childCount) {
                    boolean z18 = z17;
                    c cVar2 = (c) getChildAt(i32).getLayoutParams();
                    int i34 = i21;
                    if (cVar2.f1365d) {
                        int i35 = cVar2.f1363b;
                        if (i35 < i33) {
                            j11 = 1 << i32;
                            i33 = i35;
                            i31 = 1;
                        } else if (i35 == i33) {
                            i31++;
                            j11 |= 1 << i32;
                        }
                    }
                    i32++;
                    i21 = i34;
                    z17 = z18;
                }
                z10 = z17;
                i13 = i21;
                j10 |= j11;
                if (i31 > i18) {
                    i14 = mode;
                    i12 = i16;
                    break;
                }
                int i36 = i33 + 1;
                int i37 = 0;
                while (i37 < childCount) {
                    View childAt2 = getChildAt(i37);
                    c cVar3 = (c) childAt2.getLayoutParams();
                    int i38 = i16;
                    int i39 = mode;
                    long j12 = (long) (1 << i37);
                    if ((j11 & j12) == 0) {
                        if (cVar3.f1363b == i36) {
                            j10 |= j12;
                        }
                        z12 = z16;
                    } else {
                        if (!z16 || !cVar3.f1366e || i18 != 1) {
                            z12 = z16;
                        } else {
                            int i40 = this.A;
                            z12 = z16;
                            childAt2.setPadding(i40 + i20, 0, i40, 0);
                        }
                        cVar3.f1363b++;
                        cVar3.f1367f = true;
                        i18--;
                    }
                    i37++;
                    mode = i39;
                    i16 = i38;
                    z16 = z12;
                }
                i21 = i13;
                z17 = true;
            }
        }
        boolean z19 = !z14 && i23 == 1;
        if (i18 <= 0 || j10 == 0 || (i18 >= i23 - 1 && !z19 && i24 <= 1)) {
            z11 = z10;
        } else {
            float bitCount = (float) Long.bitCount(j10);
            if (!z19) {
                if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f1366e) {
                    bitCount -= 0.5f;
                }
                int i41 = childCount - 1;
                if ((j10 & ((long) (1 << i41))) != 0 && !((c) getChildAt(i41).getLayoutParams()).f1366e) {
                    bitCount -= 0.5f;
                }
            }
            int i42 = bitCount > 0.0f ? (int) (((float) (i18 * i20)) / bitCount) : 0;
            z11 = z10;
            for (int i43 = 0; i43 < childCount; i43++) {
                if ((j10 & ((long) (1 << i43))) != 0) {
                    View childAt3 = getChildAt(i43);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f1364c = i42;
                        cVar4.f1367f = true;
                        if (i43 == 0 && !cVar4.f1366e) {
                            cVar4.leftMargin = (-i42) / 2;
                        }
                    } else if (cVar4.f1362a) {
                        cVar4.f1364c = i42;
                        cVar4.f1367f = true;
                        cVar4.rightMargin = (-i42) / 2;
                    } else {
                        if (i43 != 0) {
                            cVar4.leftMargin = i42 / 2;
                        }
                        if (i43 != childCount - 1) {
                            cVar4.rightMargin = i42 / 2;
                        }
                    }
                    z11 = true;
                }
            }
        }
        if (z11) {
            for (int i44 = 0; i44 < childCount; i44++) {
                View childAt4 = getChildAt(i44);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f1367f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f1363b * i20) + cVar5.f1364c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i12, i14 != 1073741824 ? i13 : i30);
    }

    public void B() {
        c cVar = this.f1356u;
        if (cVar != null) {
            cVar.y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public c m() {
        c cVar = new c(-2, -2);
        cVar.gravity = 16;
        return cVar;
    }

    /* renamed from: D */
    public c n(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public c o(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams == null) {
            return m();
        }
        if (layoutParams instanceof c) {
            cVar = new c((c) layoutParams);
        } else {
            cVar = new c(layoutParams);
        }
        if (cVar.gravity <= 0) {
            cVar.gravity = 16;
        }
        return cVar;
    }

    public c F() {
        c C = m();
        C.f1362a = true;
        return C;
    }

    /* access modifiers changed from: protected */
    public boolean G(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        View childAt = getChildAt(i10 - 1);
        View childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            z10 = false | ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? z10 : z10 | ((a) childAt2).b();
    }

    public boolean H() {
        c cVar = this.f1356u;
        return cVar != null && cVar.B();
    }

    public boolean I() {
        c cVar = this.f1356u;
        return cVar != null && cVar.D();
    }

    public boolean J() {
        c cVar = this.f1356u;
        return cVar != null && cVar.E();
    }

    public boolean K() {
        return this.f1355t;
    }

    public g N() {
        return this.f1352q;
    }

    public void O(m.a aVar, g.a aVar2) {
        this.f1357v = aVar;
        this.f1358w = aVar2;
    }

    public boolean P() {
        c cVar = this.f1356u;
        return cVar != null && cVar.K();
    }

    public boolean a(i iVar) {
        return this.f1352q.L(iVar, 0);
    }

    public void b(g gVar) {
        this.f1352q = gVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1352q == null) {
            Context context = getContext();
            g gVar = new g(context);
            this.f1352q = gVar;
            gVar.R(new d());
            c cVar = new c(context);
            this.f1356u = cVar;
            cVar.J(true);
            c cVar2 = this.f1356u;
            m.a aVar = this.f1357v;
            if (aVar == null) {
                aVar = new b();
            }
            cVar2.g(aVar);
            this.f1352q.c(this.f1356u, this.f1353r);
            this.f1356u.H(this);
        }
        return this.f1352q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1356u.A();
    }

    public int getPopupTheme() {
        return this.f1354s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c cVar = this.f1356u;
        if (cVar != null) {
            cVar.c(false);
            if (this.f1356u.E()) {
                this.f1356u.B();
                this.f1356u.K();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (!this.f1359x) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i16 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i17 = i12 - i10;
        int paddingRight = (i17 - getPaddingRight()) - getPaddingLeft();
        boolean b10 = k1.b(this);
        int i18 = 0;
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f1362a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i20)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b10) {
                        i14 = getPaddingLeft() + cVar.leftMargin;
                        i15 = i14 + measuredWidth;
                    } else {
                        i15 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i14 = i15 - measuredWidth;
                    }
                    int i21 = i16 - (measuredHeight / 2);
                    childAt.layout(i14, i21, i15, measuredHeight + i21);
                    paddingRight -= measuredWidth;
                    i18 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    G(i20);
                    i19++;
                }
            }
        }
        if (childCount == 1 && i18 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i22 = (i17 / 2) - (measuredWidth2 / 2);
            int i23 = i16 - (measuredHeight2 / 2);
            childAt2.layout(i22, i23, measuredWidth2 + i22, measuredHeight2 + i23);
            return;
        }
        int i24 = i19 - (i18 ^ 1);
        int max = Math.max(0, i24 > 0 ? paddingRight / i24 : 0);
        if (b10) {
            int width = getWidth() - getPaddingRight();
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt3 = getChildAt(i25);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1362a) {
                    int i26 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i27 = i16 - (measuredHeight3 / 2);
                    childAt3.layout(i26 - measuredWidth3, i27, i26, measuredHeight3 + i27);
                    width = i26 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt4 = getChildAt(i28);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1362a) {
                int i29 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i30 = i16 - (measuredHeight4 / 2);
                childAt4.layout(i29, i30, i29 + measuredWidth4, measuredHeight4 + i30);
                paddingLeft = i29 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        g gVar;
        boolean z10 = this.f1359x;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f1359x = z11;
        if (z10 != z11) {
            this.f1360y = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (!(!this.f1359x || (gVar = this.f1352q) == null || size == this.f1360y)) {
            this.f1360y = size;
            gVar.K(true);
        }
        int childCount = getChildCount();
        if (!this.f1359x || childCount <= 0) {
            for (int i12 = 0; i12 < childCount; i12++) {
                c cVar = (c) getChildAt(i12).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        M(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f1356u.G(z10);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.B = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1356u.I(drawable);
    }

    public void setOverflowReserved(boolean z10) {
        this.f1355t = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f1354s != i10) {
            this.f1354s = i10;
            if (i10 == 0) {
                this.f1353r = getContext();
            } else {
                this.f1353r = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(c cVar) {
        this.f1356u = cVar;
        cVar.H(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f1361z = (int) (56.0f * f10);
        this.A = (int) (f10 * 4.0f);
        this.f1353r = context;
        this.f1354s = 0;
    }
}
