package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.a0;
import androidx.core.view.k;
import androidx.recyclerview.widget.RecyclerView;
import h.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Toolbar extends ViewGroup {
    private ColorStateList A;
    private ColorStateList B;
    private boolean C;
    private boolean D;
    private final ArrayList<View> E;
    private final ArrayList<View> F;
    private final int[] G;
    final k H;
    private ArrayList<MenuItem> I;
    h J;
    private final ActionMenuView.e K;
    private d1 L;
    private c M;
    private f N;
    private m.a O;
    g.a P;
    private boolean Q;
    private OnBackInvokedCallback R;
    private OnBackInvokedDispatcher S;
    private boolean T;
    private final Runnable U;

    /* renamed from: a  reason: collision with root package name */
    ActionMenuView f1439a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f1440b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f1441c;

    /* renamed from: d  reason: collision with root package name */
    private ImageButton f1442d;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f1443f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f1444g;

    /* renamed from: h  reason: collision with root package name */
    private CharSequence f1445h;

    /* renamed from: i  reason: collision with root package name */
    ImageButton f1446i;

    /* renamed from: j  reason: collision with root package name */
    View f1447j;

    /* renamed from: k  reason: collision with root package name */
    private Context f1448k;

    /* renamed from: l  reason: collision with root package name */
    private int f1449l;

    /* renamed from: m  reason: collision with root package name */
    private int f1450m;

    /* renamed from: n  reason: collision with root package name */
    private int f1451n;

    /* renamed from: o  reason: collision with root package name */
    int f1452o;

    /* renamed from: p  reason: collision with root package name */
    private int f1453p;

    /* renamed from: q  reason: collision with root package name */
    private int f1454q;

    /* renamed from: r  reason: collision with root package name */
    private int f1455r;

    /* renamed from: s  reason: collision with root package name */
    private int f1456s;

    /* renamed from: t  reason: collision with root package name */
    private int f1457t;

    /* renamed from: u  reason: collision with root package name */
    private r0 f1458u;

    /* renamed from: v  reason: collision with root package name */
    private int f1459v;

    /* renamed from: w  reason: collision with root package name */
    private int f1460w;

    /* renamed from: x  reason: collision with root package name */
    private int f1461x;

    /* renamed from: y  reason: collision with root package name */
    private CharSequence f1462y;

    /* renamed from: z  reason: collision with root package name */
    private CharSequence f1463z;

    class a implements ActionMenuView.e {
        a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.H.j(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.J;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            Toolbar.this.Q();
        }
    }

    class c implements g.a {
        c() {
        }

        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            g.a aVar = Toolbar.this.P;
            return aVar != null && aVar.a(gVar, menuItem);
        }

        public void b(androidx.appcompat.view.menu.g gVar) {
            if (!Toolbar.this.f1439a.J()) {
                Toolbar.this.H.k(gVar);
            }
            g.a aVar = Toolbar.this.P;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new c1(runnable);
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class f implements m {

        /* renamed from: a  reason: collision with root package name */
        androidx.appcompat.view.menu.g f1468a;

        /* renamed from: b  reason: collision with root package name */
        androidx.appcompat.view.menu.i f1469b;

        f() {
        }

        public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
        }

        public void c(boolean z10) {
            if (this.f1469b != null) {
                androidx.appcompat.view.menu.g gVar = this.f1468a;
                boolean z11 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        } else if (this.f1468a.getItem(i10) == this.f1469b) {
                            z11 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z11) {
                    e(this.f1468a, this.f1469b);
                }
            }
        }

        public boolean d() {
            return false;
        }

        public boolean e(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            View view = Toolbar.this.f1447j;
            if (view instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) view).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1447j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1446i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1447j = null;
            toolbar3.a();
            this.f1469b = null;
            Toolbar.this.requestLayout();
            iVar.r(false);
            Toolbar.this.R();
            return true;
        }

        public boolean f(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f1446i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1446i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1446i);
            }
            Toolbar.this.f1447j = iVar.getActionView();
            this.f1469b = iVar;
            ViewParent parent2 = Toolbar.this.f1447j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1447j);
                }
                g m10 = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m10.f834a = 8388611 | (toolbar4.f1452o & 112);
                m10.f1471b = 2;
                toolbar4.f1447j.setLayoutParams(m10);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1447j);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            iVar.r(true);
            View view = Toolbar.this.f1447j;
            if (view instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) view).c();
            }
            Toolbar.this.R();
            return true;
        }

        public void h(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.i iVar;
            androidx.appcompat.view.menu.g gVar2 = this.f1468a;
            if (!(gVar2 == null || (iVar = this.f1469b) == null)) {
                gVar2.f(iVar);
            }
            this.f1468a = gVar;
        }

        public boolean j(r rVar) {
            return false;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.M);
    }

    private int C(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = gVar.leftMargin - iArr[0];
        int max = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q10, max + measuredWidth, view.getMeasuredHeight() + q10);
        return max + measuredWidth + gVar.rightMargin;
    }

    private int D(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = gVar.rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q10, max, view.getMeasuredHeight() + q10);
        return max - (measuredWidth + gVar.leftMargin);
    }

    private int E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void F(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.H.h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.I = currentMenuItems2;
    }

    private void H() {
        removeCallbacks(this.U);
        post(this.U);
    }

    private boolean O() {
        if (!this.Q) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i10) {
        boolean z10 = a0.B(this) == 1;
        int childCount = getChildCount();
        int b10 = androidx.core.view.e.b(i10, a0.B(this));
        list.clear();
        if (z10) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f1471b == 0 && P(childAt) && p(gVar.f834a) == b10) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f1471b == 0 && P(childAt2) && p(gVar2.f834a) == b10) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        g gVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            gVar = generateLayoutParams(layoutParams);
        } else {
            gVar = (g) layoutParams;
        }
        gVar.f1471b = 1;
        if (!z10 || this.f1447j == null) {
            addView(view, gVar);
            return;
        }
        view.setLayoutParams(gVar);
        this.F.add(view);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void h() {
        if (this.f1458u == null) {
            this.f1458u = new r0();
        }
    }

    private void i() {
        if (this.f1443f == null) {
            this.f1443f = new q(getContext());
        }
    }

    private void j() {
        k();
        if (this.f1439a.N() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f1439a.getMenu();
            if (this.N == null) {
                this.N = new f();
            }
            this.f1439a.setExpandedActionViewsExclusive(true);
            gVar.c(this.N, this.f1448k);
            R();
        }
    }

    private void k() {
        if (this.f1439a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1439a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1449l);
            this.f1439a.setOnMenuItemClickListener(this.K);
            this.f1439a.O(this.O, new c());
            g m10 = generateDefaultLayoutParams();
            m10.f834a = 8388613 | (this.f1452o & 112);
            this.f1439a.setLayoutParams(m10);
            c(this.f1439a, false);
        }
    }

    private void l() {
        if (this.f1442d == null) {
            this.f1442d = new o(getContext(), (AttributeSet) null, h.a.L);
            g m10 = generateDefaultLayoutParams();
            m10.f834a = 8388611 | (this.f1452o & 112);
            this.f1442d.setLayoutParams(m10);
        }
    }

    private int p(int i10) {
        int B2 = a0.B(this);
        int b10 = androidx.core.view.e.b(i10, B2) & 7;
        if (b10 == 1 || b10 == 3 || b10 == 5) {
            return b10;
        }
        return B2 == 1 ? 5 : 3;
    }

    private int q(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int r10 = r(gVar.f834a);
        if (r10 == 48) {
            return getPaddingTop() - i11;
        }
        if (r10 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - gVar.bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = gVar.topMargin;
        if (i12 < i13) {
            i12 = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
            int i15 = gVar.bottomMargin;
            if (i14 < i15) {
                i12 = Math.max(0, i12 - (i15 - i14));
            }
        }
        return paddingTop + i12;
    }

    private int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f1461x & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.h.b(marginLayoutParams) + androidx.core.view.h.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            View view = list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i14 = gVar.leftMargin - i10;
            int i15 = gVar.rightMargin - i11;
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i15);
            int max3 = Math.max(0, -i14);
            int max4 = Math.max(0, -i15);
            i13 += max + view.getMeasuredWidth() + max2;
            i12++;
            i11 = max4;
            i10 = max3;
        }
        return i13;
    }

    private boolean z(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f1439a;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f1439a;
        return actionMenuView != null && actionMenuView.J();
    }

    /* access modifiers changed from: package-private */
    public void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((g) childAt.getLayoutParams()).f1471b == 2 || childAt == this.f1439a)) {
                removeViewAt(childCount);
                this.F.add(childAt);
            }
        }
    }

    public void J(int i10, int i11) {
        h();
        this.f1458u.g(i10, i11);
    }

    public void K(androidx.appcompat.view.menu.g gVar, c cVar) {
        if (gVar != null || this.f1439a != null) {
            k();
            androidx.appcompat.view.menu.g N2 = this.f1439a.N();
            if (N2 != gVar) {
                if (N2 != null) {
                    N2.O(this.M);
                    N2.O(this.N);
                }
                if (this.N == null) {
                    this.N = new f();
                }
                cVar.G(true);
                if (gVar != null) {
                    gVar.c(cVar, this.f1448k);
                    gVar.c(this.N, this.f1448k);
                } else {
                    cVar.h(this.f1448k, (androidx.appcompat.view.menu.g) null);
                    this.N.h(this.f1448k, (androidx.appcompat.view.menu.g) null);
                    cVar.c(true);
                    this.N.c(true);
                }
                this.f1439a.setPopupTheme(this.f1449l);
                this.f1439a.setPresenter(cVar);
                this.M = cVar;
                R();
            }
        }
    }

    public void L(m.a aVar, g.a aVar2) {
        this.O = aVar;
        this.P = aVar2;
        ActionMenuView actionMenuView = this.f1439a;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void M(Context context, int i10) {
        this.f1451n = i10;
        TextView textView = this.f1441c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void N(Context context, int i10) {
        this.f1450m = i10;
        TextView textView = this.f1440b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean Q() {
        ActionMenuView actionMenuView = this.f1439a;
        return actionMenuView != null && actionMenuView.P();
    }

    /* access modifiers changed from: package-private */
    public void R() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a10 = e.a(this);
            boolean z10 = v() && a10 != null && a0.Q(this) && this.T;
            if (z10 && this.S == null) {
                if (this.R == null) {
                    this.R = e.b(new a1(this));
                }
                e.c(a10, this.R);
                this.S = a10;
            } else if (!z10 && (onBackInvokedDispatcher = this.S) != null) {
                e.d(onBackInvokedDispatcher, this.R);
                this.S = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            addView(this.F.get(size));
        }
        this.F.clear();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f1439a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1439a
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.K()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.d():boolean");
    }

    public void e() {
        androidx.appcompat.view.menu.i iVar;
        f fVar = this.N;
        if (fVar == null) {
            iVar = null;
        } else {
            iVar = fVar.f1469b;
        }
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1439a;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        if (this.f1446i == null) {
            o oVar = new o(getContext(), (AttributeSet) null, h.a.L);
            this.f1446i = oVar;
            oVar.setImageDrawable(this.f1444g);
            this.f1446i.setContentDescription(this.f1445h);
            g m10 = generateDefaultLayoutParams();
            m10.f834a = 8388611 | (this.f1452o & 112);
            m10.f1471b = 2;
            this.f1446i.setLayoutParams(m10);
            this.f1446i.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1446i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1446i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        r0 r0Var = this.f1458u;
        if (r0Var != null) {
            return r0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f1460w;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        r0 r0Var = this.f1458u;
        if (r0Var != null) {
            return r0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        r0 r0Var = this.f1458u;
        if (r0Var != null) {
            return r0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        r0 r0Var = this.f1458u;
        if (r0Var != null) {
            return r0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f1459v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.N();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1439a
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.g r0 = r0.N()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f1460w
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        if (a0.B(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (a0.B(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f1459v, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1443f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1443f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f1439a.getMenu();
    }

    /* access modifiers changed from: package-private */
    public View getNavButtonView() {
        return this.f1442d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1442d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1442d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public c getOuterActionMenuPresenter() {
        return this.M;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f1439a.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f1448k;
    }

    public int getPopupTheme() {
        return this.f1449l;
    }

    public CharSequence getSubtitle() {
        return this.f1463z;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.f1441c;
    }

    public CharSequence getTitle() {
        return this.f1462y;
    }

    public int getTitleMarginBottom() {
        return this.f1457t;
    }

    public int getTitleMarginEnd() {
        return this.f1455r;
    }

    public int getTitleMarginStart() {
        return this.f1454q;
    }

    public int getTitleMarginTop() {
        return this.f1456s;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f1440b;
    }

    public g0 getWrapper() {
        if (this.L == null) {
            this.L = new d1(this, true);
        }
        return this.L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    /* renamed from: n */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof a.C0012a) {
            return new g((a.C0012a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new g(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.U);
        R();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x029f A[LOOP:0: B:101:0x029d->B:102:0x029f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c1 A[LOOP:1: B:104:0x02bf->B:105:0x02c1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02fa A[LOOP:2: B:112:0x02f8->B:113:0x02fa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = androidx.core.view.a0.B(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.G
            r11[r2] = r3
            r11[r3] = r3
            int r12 = androidx.core.view.a0.C(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f1442d
            boolean r13 = r0.P(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f1442d
            int r13 = r0.D(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x004e:
            android.widget.ImageButton r13 = r0.f1442d
            int r13 = r0.C(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f1446i
            boolean r15 = r0.P(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f1446i
            int r14 = r0.D(r15, r14, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f1446i
            int r13 = r0.C(r15, r13, r11, r12)
        L_0x006e:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1439a
            boolean r15 = r0.P(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1439a
            int r13 = r0.C(r15, r13, r11, r12)
            goto L_0x0085
        L_0x007f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1439a
            int r14 = r0.D(r15, r14, r11, r12)
        L_0x0085:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f1447j
            boolean r13 = r0.P(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.f1447j
            int r10 = r0.D(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.f1447j
            int r2 = r0.C(r13, r2, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f1443f
            boolean r13 = r0.P(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f1443f
            int r10 = r0.D(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f1443f
            int r2 = r0.C(r13, r2, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f1440b
            boolean r13 = r0.P(r13)
            android.widget.TextView r14 = r0.f1441c
            boolean r14 = r0.P(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f1440b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r15 = (androidx.appcompat.widget.Toolbar.g) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f1440b
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x0103
        L_0x0100:
            r23 = r7
            r3 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.f1441c
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r7 = (androidx.appcompat.widget.Toolbar.g) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f1441c
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x011f
        L_0x011d:
            r16 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            r18 = r6
            r22 = r12
        L_0x0128:
            r1 = 0
            goto L_0x0290
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            android.widget.TextView r4 = r0.f1440b
            goto L_0x0132
        L_0x0130:
            android.widget.TextView r4 = r0.f1441c
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            android.widget.TextView r7 = r0.f1441c
            goto L_0x0139
        L_0x0137:
            android.widget.TextView r7 = r0.f1440b
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r4 = (androidx.appcompat.widget.Toolbar.g) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r7 = (androidx.appcompat.widget.Toolbar.g) r7
            if (r13 == 0) goto L_0x014f
            android.widget.TextView r15 = r0.f1440b
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015c
            android.widget.TextView r15 = r0.f1441c
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015c
        L_0x0159:
            r17 = 1
            goto L_0x015e
        L_0x015c:
            r17 = 0
        L_0x015e:
            int r15 = r0.f1461x
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a6
            r6 = 80
            if (r15 == r6) goto L_0x0198
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f1456s
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0181
            int r6 = r15 + r12
            goto L_0x0196
        L_0x0181:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f1457t
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0196
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0196:
            int r8 = r8 + r6
            goto L_0x01b5
        L_0x0198:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f1457t
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01b5
        L_0x01a6:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f1456s
            int r8 = r2 + r3
        L_0x01b5:
            if (r1 == 0) goto L_0x0227
            if (r17 == 0) goto L_0x01bc
            int r1 = r0.f1454q
            goto L_0x01bd
        L_0x01bc:
            r1 = 0
        L_0x01bd:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01f4
            android.widget.TextView r1 = r0.f1440b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            android.widget.TextView r2 = r0.f1440b
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f1440b
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1440b
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f1455r
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f5
        L_0x01f4:
            r2 = r10
        L_0x01f5:
            if (r14 == 0) goto L_0x021b
            android.widget.TextView r1 = r0.f1441c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f1441c
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f1441c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1441c
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f1455r
            int r1 = r10 - r1
            goto L_0x021c
        L_0x021b:
            r1 = r10
        L_0x021c:
            if (r17 == 0) goto L_0x0223
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0223:
            r2 = r24
            goto L_0x0128
        L_0x0227:
            if (r17 == 0) goto L_0x022d
            int r7 = r0.f1454q
            r1 = 0
            goto L_0x022f
        L_0x022d:
            r1 = 0
            r7 = 0
        L_0x022f:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r2 = r24 + r2
            int r3 = -r7
            int r3 = java.lang.Math.max(r1, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x0264
            android.widget.TextView r3 = r0.f1440b
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r3 = (androidx.appcompat.widget.Toolbar.g) r3
            android.widget.TextView r4 = r0.f1440b
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f1440b
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1440b
            r6.layout(r2, r8, r4, r5)
            int r6 = r0.f1455r
            int r4 = r4 + r6
            int r3 = r3.bottomMargin
            int r8 = r5 + r3
            goto L_0x0265
        L_0x0264:
            r4 = r2
        L_0x0265:
            if (r14 == 0) goto L_0x0289
            android.widget.TextView r3 = r0.f1441c
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r3 = (androidx.appcompat.widget.Toolbar.g) r3
            int r3 = r3.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f1441c
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r5 = r0.f1441c
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1441c
            r6.layout(r2, r8, r3, r5)
            int r5 = r0.f1455r
            int r3 = r3 + r5
            goto L_0x028a
        L_0x0289:
            r3 = r2
        L_0x028a:
            if (r17 == 0) goto L_0x0290
            int r2 = java.lang.Math.max(r4, r3)
        L_0x0290:
            java.util.ArrayList<android.view.View> r3 = r0.E
            r4 = 3
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.E
            int r3 = r3.size()
            r7 = 0
        L_0x029d:
            if (r7 >= r3) goto L_0x02b0
            java.util.ArrayList<android.view.View> r4 = r0.E
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r2 = r0.C(r4, r2, r11, r12)
            int r7 = r7 + 1
            goto L_0x029d
        L_0x02b0:
            r12 = r22
            java.util.ArrayList<android.view.View> r3 = r0.E
            r4 = 5
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.E
            int r3 = r3.size()
            r7 = 0
        L_0x02bf:
            if (r7 >= r3) goto L_0x02d0
            java.util.ArrayList<android.view.View> r4 = r0.E
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.D(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L_0x02bf
        L_0x02d0:
            java.util.ArrayList<android.view.View> r3 = r0.E
            r4 = 1
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.E
            int r3 = r0.u(r3, r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r3 / 2
            int r6 = r6 - r4
            int r3 = r3 + r6
            if (r6 >= r2) goto L_0x02eb
            goto L_0x02f2
        L_0x02eb:
            if (r3 <= r10) goto L_0x02f1
            int r3 = r3 - r10
            int r2 = r6 - r3
            goto L_0x02f2
        L_0x02f1:
            r2 = r6
        L_0x02f2:
            java.util.ArrayList<android.view.View> r3 = r0.E
            int r3 = r3.size()
        L_0x02f8:
            if (r1 >= r3) goto L_0x0309
            java.util.ArrayList<android.view.View> r4 = r0.E
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.C(r4, r2, r11, r12)
            int r1 = r1 + 1
            goto L_0x02f8
        L_0x0309:
            java.util.ArrayList<android.view.View> r1 = r0.E
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = this.G;
        char b10 = k1.b(this);
        int i19 = 0;
        char c10 = b10 ^ 1;
        if (P(this.f1442d)) {
            F(this.f1442d, i10, 0, i11, 0, this.f1453p);
            i14 = this.f1442d.getMeasuredWidth() + s(this.f1442d);
            i13 = Math.max(0, this.f1442d.getMeasuredHeight() + t(this.f1442d));
            i12 = View.combineMeasuredStates(0, this.f1442d.getMeasuredState());
        } else {
            i14 = 0;
            i13 = 0;
            i12 = 0;
        }
        if (P(this.f1446i)) {
            F(this.f1446i, i10, 0, i11, 0, this.f1453p);
            i14 = this.f1446i.getMeasuredWidth() + s(this.f1446i);
            i13 = Math.max(i13, this.f1446i.getMeasuredHeight() + t(this.f1446i));
            i12 = View.combineMeasuredStates(i12, this.f1446i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i14);
        iArr[b10] = Math.max(0, currentContentInsetStart - i14);
        if (P(this.f1439a)) {
            F(this.f1439a, i10, max, i11, 0, this.f1453p);
            i15 = this.f1439a.getMeasuredWidth() + s(this.f1439a);
            i13 = Math.max(i13, this.f1439a.getMeasuredHeight() + t(this.f1439a));
            i12 = View.combineMeasuredStates(i12, this.f1439a.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr[c10] = Math.max(0, currentContentInsetEnd - i15);
        if (P(this.f1447j)) {
            max2 += E(this.f1447j, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1447j.getMeasuredHeight() + t(this.f1447j));
            i12 = View.combineMeasuredStates(i12, this.f1447j.getMeasuredState());
        }
        if (P(this.f1443f)) {
            max2 += E(this.f1443f, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1443f.getMeasuredHeight() + t(this.f1443f));
            i12 = View.combineMeasuredStates(i12, this.f1443f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((g) childAt.getLayoutParams()).f1471b == 0 && P(childAt)) {
                max2 += E(childAt, i10, max2, i11, 0, iArr);
                i13 = Math.max(i13, childAt.getMeasuredHeight() + t(childAt));
                i12 = View.combineMeasuredStates(i12, childAt.getMeasuredState());
            }
        }
        int i21 = this.f1456s + this.f1457t;
        int i22 = this.f1454q + this.f1455r;
        if (P(this.f1440b)) {
            E(this.f1440b, i10, max2 + i22, i11, i21, iArr);
            int measuredWidth = this.f1440b.getMeasuredWidth() + s(this.f1440b);
            i16 = this.f1440b.getMeasuredHeight() + t(this.f1440b);
            i18 = View.combineMeasuredStates(i12, this.f1440b.getMeasuredState());
            i17 = measuredWidth;
        } else {
            i18 = i12;
            i17 = 0;
            i16 = 0;
        }
        if (P(this.f1441c)) {
            int i23 = i16 + i21;
            i17 = Math.max(i17, E(this.f1441c, i10, max2 + i22, i11, i23, iArr));
            i16 += this.f1441c.getMeasuredHeight() + t(this.f1441c);
            i18 = View.combineMeasuredStates(i18, this.f1441c.getMeasuredState());
        } else {
            int i24 = i18;
        }
        int max3 = Math.max(i13, i16);
        int paddingLeft = max2 + i17 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, -16777216 & i18);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, i18 << 16);
        if (!O()) {
            i19 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i19);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.c());
        ActionMenuView actionMenuView = this.f1439a;
        androidx.appcompat.view.menu.g N2 = actionMenuView != null ? actionMenuView.N() : null;
        int i10 = iVar.f1472c;
        if (!(i10 == 0 || this.N == null || N2 == null || (findItem = N2.findItem(i10)) == null)) {
            findItem.expandActionView();
        }
        if (iVar.f1473d) {
            H();
        }
    }

    public void onRtlPropertiesChanged(int i10) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i10);
        }
        h();
        r0 r0Var = this.f1458u;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        r0Var.f(z10);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.i iVar;
        i iVar2 = new i(super.onSaveInstanceState());
        f fVar = this.N;
        if (!(fVar == null || (iVar = fVar.f1469b) == null)) {
            iVar2.f1472c = iVar.getItemId();
        }
        iVar2.f1473d = B();
        return iVar2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            R();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(i.a.b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.Q = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = RecyclerView.UNDEFINED_DURATION;
        }
        if (i10 != this.f1460w) {
            this.f1460w = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = RecyclerView.UNDEFINED_DURATION;
        }
        if (i10 != this.f1459v) {
            this.f1459v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(i.a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(i.a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f1442d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.J = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f1439a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1449l != i10) {
            this.f1449l = i10;
            if (i10 == 0) {
                this.f1448k = getContext();
            } else {
                this.f1448k = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f1457t = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1455r = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1454q = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1456s = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public boolean v() {
        f fVar = this.N;
        return (fVar == null || fVar.f1469b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f1439a;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void y() {
        Iterator<MenuItem> it = this.I.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        G();
    }

    public static class g extends a.C0012a {

        /* renamed from: b  reason: collision with root package name */
        int f1471b = 0;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: package-private */
        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.f834a = 8388627;
        }

        public g(g gVar) {
            super((a.C0012a) gVar);
            this.f1471b = gVar.f1471b;
        }

        public g(a.C0012a aVar) {
            super(aVar);
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1461x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.H = new k(new b1(this));
        this.I = new ArrayList<>();
        this.K = new a();
        this.U = new b();
        Context context2 = getContext();
        int[] iArr = j.R2;
        z0 v10 = z0.v(context2, attributeSet, iArr, i10, 0);
        a0.l0(this, context, iArr, attributeSet, v10.r(), i10, 0);
        this.f1450m = v10.n(j.f18403t3, 0);
        this.f1451n = v10.n(j.f18358k3, 0);
        this.f1461x = v10.l(j.S2, this.f1461x);
        this.f1452o = v10.l(j.T2, 48);
        int e10 = v10.e(j.f18373n3, 0);
        int i11 = j.f18398s3;
        e10 = v10.s(i11) ? v10.e(i11, e10) : e10;
        this.f1457t = e10;
        this.f1456s = e10;
        this.f1455r = e10;
        this.f1454q = e10;
        int e11 = v10.e(j.f18388q3, -1);
        if (e11 >= 0) {
            this.f1454q = e11;
        }
        int e12 = v10.e(j.f18383p3, -1);
        if (e12 >= 0) {
            this.f1455r = e12;
        }
        int e13 = v10.e(j.f18393r3, -1);
        if (e13 >= 0) {
            this.f1456s = e13;
        }
        int e14 = v10.e(j.f18378o3, -1);
        if (e14 >= 0) {
            this.f1457t = e14;
        }
        this.f1453p = v10.f(j.f18328e3, -1);
        int e15 = v10.e(j.f18308a3, RecyclerView.UNDEFINED_DURATION);
        int e16 = v10.e(j.W2, RecyclerView.UNDEFINED_DURATION);
        int f10 = v10.f(j.Y2, 0);
        int f11 = v10.f(j.Z2, 0);
        h();
        this.f1458u.e(f10, f11);
        if (!(e15 == Integer.MIN_VALUE && e16 == Integer.MIN_VALUE)) {
            this.f1458u.g(e15, e16);
        }
        this.f1459v = v10.e(j.f18313b3, RecyclerView.UNDEFINED_DURATION);
        this.f1460w = v10.e(j.X2, RecyclerView.UNDEFINED_DURATION);
        this.f1444g = v10.g(j.V2);
        this.f1445h = v10.p(j.U2);
        CharSequence p10 = v10.p(j.f18368m3);
        if (!TextUtils.isEmpty(p10)) {
            setTitle(p10);
        }
        CharSequence p11 = v10.p(j.f18353j3);
        if (!TextUtils.isEmpty(p11)) {
            setSubtitle(p11);
        }
        this.f1448k = getContext();
        setPopupTheme(v10.n(j.f18348i3, 0));
        Drawable g10 = v10.g(j.f18343h3);
        if (g10 != null) {
            setNavigationIcon(g10);
        }
        CharSequence p12 = v10.p(j.f18338g3);
        if (!TextUtils.isEmpty(p12)) {
            setNavigationContentDescription(p12);
        }
        Drawable g11 = v10.g(j.f18318c3);
        if (g11 != null) {
            setLogo(g11);
        }
        CharSequence p13 = v10.p(j.f18323d3);
        if (!TextUtils.isEmpty(p13)) {
            setLogoDescription(p13);
        }
        int i12 = j.f18408u3;
        if (v10.s(i12)) {
            setTitleTextColor(v10.c(i12));
        }
        int i13 = j.f18363l3;
        if (v10.s(i13)) {
            setSubtitleTextColor(v10.c(i13));
        }
        int i14 = j.f18333f3;
        if (v10.s(i14)) {
            x(v10.n(i14, 0));
        }
        v10.w();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f1446i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f1446i.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1446i;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1444g);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f1443f)) {
                c(this.f1443f, true);
            }
        } else {
            ImageView imageView = this.f1443f;
            if (imageView != null && z(imageView)) {
                removeView(this.f1443f);
                this.F.remove(this.f1443f);
            }
        }
        ImageView imageView2 = this.f1443f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1443f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f1442d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            e1.a(this.f1442d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f1442d)) {
                c(this.f1442d, true);
            }
        } else {
            ImageButton imageButton = this.f1442d;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f1442d);
                this.F.remove(this.f1442d);
            }
        }
        ImageButton imageButton2 = this.f1442d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1441c == null) {
                Context context = getContext();
                c0 c0Var = new c0(context);
                this.f1441c = c0Var;
                c0Var.setSingleLine();
                this.f1441c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1451n;
                if (i10 != 0) {
                    this.f1441c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f1441c.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1441c)) {
                c(this.f1441c, true);
            }
        } else {
            TextView textView = this.f1441c;
            if (textView != null && z(textView)) {
                removeView(this.f1441c);
                this.F.remove(this.f1441c);
            }
        }
        TextView textView2 = this.f1441c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1463z = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        TextView textView = this.f1441c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1440b == null) {
                Context context = getContext();
                c0 c0Var = new c0(context);
                this.f1440b = c0Var;
                c0Var.setSingleLine();
                this.f1440b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1450m;
                if (i10 != 0) {
                    this.f1440b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f1440b.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1440b)) {
                c(this.f1440b, true);
            }
        } else {
            TextView textView = this.f1440b;
            if (textView != null && z(textView)) {
                removeView(this.f1440b);
                this.F.remove(this.f1440b);
            }
        }
        TextView textView2 = this.f1440b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1462y = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f1440b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class i extends e0.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        int f1472c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1473d;

        class a implements Parcelable.ClassLoaderCreator<i> {
            a() {
            }

            /* renamed from: a */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            /* renamed from: c */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1472c = parcel.readInt();
            this.f1473d = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1472c);
            parcel.writeInt(this.f1473d ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
