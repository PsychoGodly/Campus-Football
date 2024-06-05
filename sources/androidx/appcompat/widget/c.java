package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import java.util.ArrayList;

/* compiled from: ActionMenuPresenter */
class c extends androidx.appcompat.view.menu.b implements b.a {
    a A;
    C0016c B;
    private b C;
    final f D = new f();
    int E;

    /* renamed from: l  reason: collision with root package name */
    d f1516l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f1517m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f1518n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f1519o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f1520p;

    /* renamed from: q  reason: collision with root package name */
    private int f1521q;

    /* renamed from: r  reason: collision with root package name */
    private int f1522r;

    /* renamed from: s  reason: collision with root package name */
    private int f1523s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1524t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f1525u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f1526v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1527w;

    /* renamed from: x  reason: collision with root package name */
    private int f1528x;

    /* renamed from: y  reason: collision with root package name */
    private final SparseBooleanArray f1529y = new SparseBooleanArray();

    /* renamed from: z  reason: collision with root package name */
    e f1530z;

    /* compiled from: ActionMenuPresenter */
    private class a extends l {
        public a(Context context, r rVar, View view) {
            super(context, rVar, view, false, h.a.f18176l);
            if (!((i) rVar.getItem()).l()) {
                View view2 = c.this.f1516l;
                f(view2 == null ? (View) c.this.f1137j : view2);
            }
            j(c.this.D);
        }

        /* access modifiers changed from: protected */
        public void e() {
            c cVar = c.this;
            cVar.A = null;
            cVar.E = 0;
            super.e();
        }
    }

    /* compiled from: ActionMenuPresenter */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        public p a() {
            a aVar = c.this.A;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    /* compiled from: ActionMenuPresenter */
    private class C0016c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private e f1533a;

        public C0016c(e eVar) {
            this.f1533a = eVar;
        }

        public void run() {
            if (c.this.f1131c != null) {
                c.this.f1131c.d();
            }
            View view = (View) c.this.f1137j;
            if (!(view == null || view.getWindowToken() == null || !this.f1533a.m())) {
                c.this.f1530z = this.f1533a;
            }
            c.this.B = null;
        }
    }

    /* compiled from: ActionMenuPresenter */
    private class d extends q implements ActionMenuView.a {

        /* compiled from: ActionMenuPresenter */
        class a extends k0 {

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ c f1536k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.f1536k = cVar;
            }

            public p b() {
                e eVar = c.this.f1530z;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            public boolean c() {
                c.this.K();
                return true;
            }

            public boolean d() {
                c cVar = c.this;
                if (cVar.B != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, h.a.f18175k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            e1.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* compiled from: ActionMenuPresenter */
    private class e extends l {
        public e(Context context, g gVar, View view, boolean z10) {
            super(context, gVar, view, z10, h.a.f18176l);
            h(8388613);
            j(c.this.D);
        }

        /* access modifiers changed from: protected */
        public void e() {
            if (c.this.f1131c != null) {
                c.this.f1131c.close();
            }
            c.this.f1530z = null;
            super.e();
        }
    }

    /* compiled from: ActionMenuPresenter */
    private class f implements m.a {
        f() {
        }

        public void a(g gVar, boolean z10) {
            if (gVar instanceof r) {
                gVar.D().e(false);
            }
            m.a m10 = c.this.m();
            if (m10 != null) {
                m10.a(gVar, z10);
            }
        }

        public boolean b(g gVar) {
            if (gVar == c.this.f1131c) {
                return false;
            }
            c.this.E = ((r) gVar).getItem().getItemId();
            m.a m10 = c.this.m();
            if (m10 != null) {
                return m10.b(gVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, h.g.f18269c, h.g.f18268b);
    }

    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1137j;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f1516l;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1518n) {
            return this.f1517m;
        }
        return null;
    }

    public boolean B() {
        n nVar;
        C0016c cVar = this.B;
        if (cVar == null || (nVar = this.f1137j) == null) {
            e eVar = this.f1530z;
            if (eVar == null) {
                return false;
            }
            eVar.b();
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.B = null;
        return true;
    }

    public boolean C() {
        a aVar = this.A;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.B != null || E();
    }

    public boolean E() {
        e eVar = this.f1530z;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.f1524t) {
            this.f1523s = androidx.appcompat.view.a.b(this.f1130b).d();
        }
        g gVar = this.f1131c;
        if (gVar != null) {
            gVar.K(true);
        }
    }

    public void G(boolean z10) {
        this.f1527w = z10;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f1137j = actionMenuView;
        actionMenuView.b(this.f1131c);
    }

    public void I(Drawable drawable) {
        d dVar = this.f1516l;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1518n = true;
        this.f1517m = drawable;
    }

    public void J(boolean z10) {
        this.f1519o = z10;
        this.f1520p = true;
    }

    public boolean K() {
        g gVar;
        if (!this.f1519o || E() || (gVar = this.f1131c) == null || this.f1137j == null || this.B != null || gVar.z().isEmpty()) {
            return false;
        }
        C0016c cVar = new C0016c(new e(this.f1130b, this.f1131c, this.f1516l, true));
        this.B = cVar;
        ((View) this.f1137j).post(cVar);
        return true;
    }

    public void a(g gVar, boolean z10) {
        y();
        super.a(gVar, z10);
    }

    public void c(boolean z10) {
        n nVar;
        super.c(z10);
        ((View) this.f1137j).requestLayout();
        g gVar = this.f1131c;
        boolean z11 = false;
        if (gVar != null) {
            ArrayList<i> s10 = gVar.s();
            int size = s10.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.core.view.b b10 = s10.get(i10).b();
                if (b10 != null) {
                    b10.i(this);
                }
            }
        }
        g gVar2 = this.f1131c;
        ArrayList<i> z12 = gVar2 != null ? gVar2.z() : null;
        if (this.f1519o && z12 != null) {
            int size2 = z12.size();
            if (size2 == 1) {
                z11 = !z12.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f1516l == null) {
                this.f1516l = new d(this.f1129a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1516l.getParent();
            if (viewGroup != this.f1137j) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1516l);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1137j;
                actionMenuView.addView(this.f1516l, actionMenuView.F());
            }
        } else {
            d dVar = this.f1516l;
            if (dVar != null && dVar.getParent() == (nVar = this.f1137j)) {
                ((ViewGroup) nVar).removeView(this.f1516l);
            }
        }
        ((ActionMenuView) this.f1137j).setOverflowReserved(this.f1519o);
    }

    public boolean d() {
        int i10;
        ArrayList<i> arrayList;
        int i11;
        int i12;
        int i13;
        c cVar = this;
        g gVar = cVar.f1131c;
        View view = null;
        int i14 = 0;
        if (gVar != null) {
            arrayList = gVar.E();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i15 = cVar.f1523s;
        int i16 = cVar.f1522r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f1137j;
        boolean z10 = false;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < i10; i19++) {
            i iVar = arrayList.get(i19);
            if (iVar.o()) {
                i17++;
            } else if (iVar.n()) {
                i18++;
            } else {
                z10 = true;
            }
            if (cVar.f1527w && iVar.isActionViewExpanded()) {
                i15 = 0;
            }
        }
        if (cVar.f1519o && (z10 || i18 + i17 > i15)) {
            i15--;
        }
        int i20 = i15 - i17;
        SparseBooleanArray sparseBooleanArray = cVar.f1529y;
        sparseBooleanArray.clear();
        if (cVar.f1525u) {
            int i21 = cVar.f1528x;
            i11 = i16 / i21;
            i12 = i21 + ((i16 % i21) / i11);
        } else {
            i12 = 0;
            i11 = 0;
        }
        int i22 = 0;
        int i23 = 0;
        while (i22 < i10) {
            i iVar2 = arrayList.get(i22);
            if (iVar2.o()) {
                View n10 = cVar.n(iVar2, view, viewGroup);
                if (cVar.f1525u) {
                    i11 -= ActionMenuView.L(n10, i12, i11, makeMeasureSpec, i14);
                } else {
                    n10.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n10.getMeasuredWidth();
                i16 -= measuredWidth;
                if (i23 == 0) {
                    i23 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.u(true);
                i13 = i10;
            } else if (iVar2.n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z11 = sparseBooleanArray.get(groupId2);
                boolean z12 = (i20 > 0 || z11) && i16 > 0 && (!cVar.f1525u || i11 > 0);
                boolean z13 = z12;
                i13 = i10;
                if (z12) {
                    View n11 = cVar.n(iVar2, (View) null, viewGroup);
                    if (cVar.f1525u) {
                        int L = ActionMenuView.L(n11, i12, i11, makeMeasureSpec, 0);
                        i11 -= L;
                        if (L == 0) {
                            z13 = false;
                        }
                    } else {
                        n11.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z14 = z13;
                    int measuredWidth2 = n11.getMeasuredWidth();
                    i16 -= measuredWidth2;
                    if (i23 == 0) {
                        i23 = measuredWidth2;
                    }
                    z12 = z14 & (!cVar.f1525u ? i16 + i23 > 0 : i16 >= 0);
                }
                if (z12 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z11) {
                    sparseBooleanArray.put(groupId2, false);
                    int i24 = 0;
                    while (i24 < i22) {
                        i iVar3 = arrayList.get(i24);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.l()) {
                                i20++;
                            }
                            iVar3.u(false);
                        }
                        i24++;
                    }
                }
                if (z12) {
                    i20--;
                }
                iVar2.u(z12);
            } else {
                i13 = i10;
                iVar2.u(false);
                i22++;
                view = null;
                cVar = this;
                i10 = i13;
                i14 = 0;
            }
            i22++;
            view = null;
            cVar = this;
            i10 = i13;
            i14 = 0;
        }
        return true;
    }

    public void h(Context context, g gVar) {
        super.h(context, gVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a b10 = androidx.appcompat.view.a.b(context);
        if (!this.f1520p) {
            this.f1519o = b10.h();
        }
        if (!this.f1526v) {
            this.f1521q = b10.c();
        }
        if (!this.f1524t) {
            this.f1523s = b10.d();
        }
        int i10 = this.f1521q;
        if (this.f1519o) {
            if (this.f1516l == null) {
                d dVar = new d(this.f1129a);
                this.f1516l = dVar;
                if (this.f1518n) {
                    dVar.setImageDrawable(this.f1517m);
                    this.f1517m = null;
                    this.f1518n = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1516l.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f1516l.getMeasuredWidth();
        } else {
            this.f1516l = null;
        }
        this.f1522r = i10;
        this.f1528x = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public void i(i iVar, n.a aVar) {
        aVar.e(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1137j);
        if (this.C == null) {
            this.C = new b();
        }
        actionMenuItemView.setPopupCallback(this.C);
    }

    public boolean j(r rVar) {
        boolean z10 = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        r rVar2 = rVar;
        while (rVar2.f0() != this.f1131c) {
            rVar2 = (r) rVar2.f0();
        }
        View z11 = z(rVar2.getItem());
        if (z11 == null) {
            return false;
        }
        this.E = rVar.getItem().getItemId();
        int size = rVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f1130b, rVar, z11);
        this.A = aVar;
        aVar.g(z10);
        this.A.k();
        super.j(rVar);
        return true;
    }

    public boolean l(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f1516l) {
            return false;
        }
        return super.l(viewGroup, i10);
    }

    public View n(i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.j()) {
            actionView = super.n(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.o(layoutParams));
        }
        return actionView;
    }

    public n o(ViewGroup viewGroup) {
        n nVar = this.f1137j;
        n o10 = super.o(viewGroup);
        if (nVar != o10) {
            ((ActionMenuView) o10).setPresenter(this);
        }
        return o10;
    }

    public boolean q(int i10, i iVar) {
        return iVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
