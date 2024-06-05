package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.m;
import androidx.core.view.a0;
import androidx.core.view.k0;
import androidx.core.view.q;
import androidx.core.view.r;
import androidx.core.view.s;
import androidx.core.view.t;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import h.f;

public class ActionBarOverlayLayout extends ViewGroup implements f0, s, q, r {
    static final int[] G = {h.a.f18166b, 16842841};
    private OverScroller A;
    ViewPropertyAnimator B;
    final AnimatorListenerAdapter C;
    private final Runnable D;
    private final Runnable E;
    private final t F;

    /* renamed from: a  reason: collision with root package name */
    private int f1324a;

    /* renamed from: b  reason: collision with root package name */
    private int f1325b = 0;

    /* renamed from: c  reason: collision with root package name */
    private ContentFrameLayout f1326c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarContainer f1327d;

    /* renamed from: f  reason: collision with root package name */
    private g0 f1328f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f1329g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1330h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1331i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1332j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1333k;

    /* renamed from: l  reason: collision with root package name */
    boolean f1334l;

    /* renamed from: m  reason: collision with root package name */
    private int f1335m;

    /* renamed from: n  reason: collision with root package name */
    private int f1336n;

    /* renamed from: o  reason: collision with root package name */
    private final Rect f1337o = new Rect();

    /* renamed from: p  reason: collision with root package name */
    private final Rect f1338p = new Rect();

    /* renamed from: q  reason: collision with root package name */
    private final Rect f1339q = new Rect();

    /* renamed from: r  reason: collision with root package name */
    private final Rect f1340r = new Rect();

    /* renamed from: s  reason: collision with root package name */
    private final Rect f1341s = new Rect();

    /* renamed from: t  reason: collision with root package name */
    private final Rect f1342t = new Rect();

    /* renamed from: u  reason: collision with root package name */
    private final Rect f1343u = new Rect();

    /* renamed from: v  reason: collision with root package name */
    private k0 f1344v;

    /* renamed from: w  reason: collision with root package name */
    private k0 f1345w;

    /* renamed from: x  reason: collision with root package name */
    private k0 f1346x;

    /* renamed from: y  reason: collision with root package name */
    private k0 f1347y;

    /* renamed from: z  reason: collision with root package name */
    private d f1348z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.f1334l = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.f1334l = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.f1327d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.f1327d.animate().translationY((float) (-ActionBarOverlayLayout.this.f1327d.getHeight())).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z10);

        void d();

        void e();

        void onWindowVisibilityChanged(int i10);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k0 k0Var = k0.f3200b;
        this.f1344v = k0Var;
        this.f1345w = k0Var;
        this.f1346x = k0Var;
        this.f1347y = k0Var;
        this.C = new a();
        this.D = new b();
        this.E = new c();
        p(context);
        this.F = new t(this);
    }

    private void a() {
        o();
        this.E.run();
    }

    private boolean k(View view, Rect rect, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        int i10;
        int i11;
        int i12;
        int i13;
        e eVar = (e) view.getLayoutParams();
        if (!z10 || eVar.leftMargin == (i13 = rect.left)) {
            z14 = false;
        } else {
            eVar.leftMargin = i13;
            z14 = true;
        }
        if (z11 && eVar.topMargin != (i12 = rect.top)) {
            eVar.topMargin = i12;
            z14 = true;
        }
        if (z13 && eVar.rightMargin != (i11 = rect.right)) {
            eVar.rightMargin = i11;
            z14 = true;
        }
        if (!z12 || eVar.bottomMargin == (i10 = rect.bottom)) {
            return z14;
        }
        eVar.bottomMargin = i10;
        return true;
    }

    private g0 n(View view) {
        if (view instanceof g0) {
            return (g0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void p(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(G);
        boolean z10 = false;
        this.f1324a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1329g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z10 = true;
        }
        this.f1330h = z10;
        this.A = new OverScroller(context);
    }

    private void r() {
        o();
        postDelayed(this.E, 600);
    }

    private void s() {
        o();
        postDelayed(this.D, 600);
    }

    private void u() {
        o();
        this.D.run();
    }

    private boolean v(float f10) {
        this.A.fling(0, 0, 0, (int) f10, 0, 0, RecyclerView.UNDEFINED_DURATION, a.e.API_PRIORITY_OTHER);
        return this.A.getFinalY() > this.f1327d.getHeight();
    }

    public void b(Menu menu, m.a aVar) {
        t();
        this.f1328f.b(menu, aVar);
    }

    public boolean c() {
        t();
        return this.f1328f.c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public void d() {
        t();
        this.f1328f.d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1329g != null && !this.f1330h) {
            int bottom = this.f1327d.getVisibility() == 0 ? (int) (((float) this.f1327d.getBottom()) + this.f1327d.getTranslationY() + 0.5f) : 0;
            this.f1329g.setBounds(0, bottom, getWidth(), this.f1329g.getIntrinsicHeight() + bottom);
            this.f1329g.draw(canvas);
        }
    }

    public boolean e() {
        t();
        return this.f1328f.e();
    }

    public boolean f() {
        t();
        return this.f1328f.f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        t();
        boolean k10 = k(this.f1327d, rect, true, true, false, true);
        this.f1340r.set(rect);
        k1.a(this, this.f1340r, this.f1337o);
        if (!this.f1341s.equals(this.f1340r)) {
            this.f1341s.set(this.f1340r);
            k10 = true;
        }
        if (!this.f1338p.equals(this.f1337o)) {
            this.f1338p.set(this.f1337o);
            k10 = true;
        }
        if (k10) {
            requestLayout();
        }
        return true;
    }

    public boolean g() {
        t();
        return this.f1328f.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1327d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.F.a();
    }

    public CharSequence getTitle() {
        t();
        return this.f1328f.getTitle();
    }

    public boolean h() {
        t();
        return this.f1328f.h();
    }

    public void i(int i10) {
        t();
        if (i10 == 2) {
            this.f1328f.v();
        } else if (i10 == 5) {
            this.f1328f.w();
        } else if (i10 == 109) {
            setOverlayMode(true);
        }
    }

    public void j() {
        t();
        this.f1328f.i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    /* renamed from: m */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* access modifiers changed from: package-private */
    public void o() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        t();
        k0 w10 = k0.w(windowInsets, this);
        boolean k10 = k(this.f1327d, new Rect(w10.i(), w10.k(), w10.j(), w10.h()), true, true, false, true);
        a0.g(this, w10, this.f1337o);
        Rect rect = this.f1337o;
        k0 l10 = w10.l(rect.left, rect.top, rect.right, rect.bottom);
        this.f1344v = l10;
        boolean z10 = true;
        if (!this.f1345w.equals(l10)) {
            this.f1345w = this.f1344v;
            k10 = true;
        }
        if (!this.f1338p.equals(this.f1337o)) {
            this.f1338p.set(this.f1337o);
        } else {
            z10 = k10;
        }
        if (z10) {
            requestLayout();
        }
        return w10.a().c().b().u();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p(getContext());
        a0.k0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = eVar.leftMargin + paddingLeft;
                int i16 = eVar.topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        t();
        measureChildWithMargins(this.f1327d, i10, 0, i11, 0);
        e eVar = (e) this.f1327d.getLayoutParams();
        int max = Math.max(0, this.f1327d.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f1327d.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1327d.getMeasuredState());
        boolean z10 = (a0.K(this) & 256) != 0;
        if (z10) {
            i12 = this.f1324a;
            if (this.f1332j && this.f1327d.getTabContainer() != null) {
                i12 += this.f1324a;
            }
        } else {
            i12 = this.f1327d.getVisibility() != 8 ? this.f1327d.getMeasuredHeight() : 0;
        }
        this.f1339q.set(this.f1337o);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 21) {
            this.f1346x = this.f1344v;
        } else {
            this.f1342t.set(this.f1340r);
        }
        if (!this.f1331i && !z10) {
            Rect rect = this.f1339q;
            rect.top += i12;
            rect.bottom += 0;
            if (i13 >= 21) {
                this.f1346x = this.f1346x.l(0, i12, 0, 0);
            }
        } else if (i13 >= 21) {
            this.f1346x = new k0.b(this.f1346x).c(androidx.core.graphics.c.b(this.f1346x.i(), this.f1346x.k() + i12, this.f1346x.j(), this.f1346x.h() + 0)).a();
        } else {
            Rect rect2 = this.f1342t;
            rect2.top += i12;
            rect2.bottom += 0;
        }
        k(this.f1326c, this.f1339q, true, true, true, true);
        if (i13 >= 21 && !this.f1347y.equals(this.f1346x)) {
            k0 k0Var = this.f1346x;
            this.f1347y = k0Var;
            a0.h(this.f1326c, k0Var);
        } else if (i13 < 21 && !this.f1343u.equals(this.f1342t)) {
            this.f1343u.set(this.f1342t);
            this.f1326c.a(this.f1342t);
        }
        measureChildWithMargins(this.f1326c, i10, 0, i11, 0);
        e eVar2 = (e) this.f1326c.getLayoutParams();
        int max3 = Math.max(max, this.f1326c.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f1326c.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1326c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f1333k || !z10) {
            return false;
        }
        if (v(f11)) {
            a();
        } else {
            u();
        }
        this.f1334l = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        onNestedScroll(view, i10, i11, i12, i13, i14);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    public void onStopNestedScroll(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i10);
        }
        t();
        int i11 = this.f1336n ^ i10;
        this.f1336n = i10;
        boolean z10 = false;
        boolean z11 = (i10 & 4) == 0;
        if ((i10 & 256) != 0) {
            z10 = true;
        }
        d dVar = this.f1348z;
        if (dVar != null) {
            dVar.c(!z10);
            if (z11 || !z10) {
                this.f1348z.a();
            } else {
                this.f1348z.d();
            }
        }
        if ((i11 & 256) != 0 && this.f1348z != null) {
            a0.k0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f1325b = i10;
        d dVar = this.f1348z;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i10);
        }
    }

    public boolean q() {
        return this.f1331i;
    }

    public void setActionBarHideOffset(int i10) {
        o();
        this.f1327d.setTranslationY((float) (-Math.max(0, Math.min(i10, this.f1327d.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f1348z = dVar;
        if (getWindowToken() != null) {
            this.f1348z.onWindowVisibilityChanged(this.f1325b);
            int i10 = this.f1336n;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                a0.k0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f1332j = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f1333k) {
            this.f1333k = z10;
            if (!z10) {
                o();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i10) {
        t();
        this.f1328f.setIcon(i10);
    }

    public void setLogo(int i10) {
        t();
        this.f1328f.n(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f1331i = z10;
        this.f1330h = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    public void setWindowCallback(Window.Callback callback) {
        t();
        this.f1328f.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        t();
        this.f1328f.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void t() {
        if (this.f1326c == null) {
            this.f1326c = (ContentFrameLayout) findViewById(f.f18242b);
            this.f1327d = (ActionBarContainer) findViewById(f.f18243c);
            this.f1328f = n(findViewById(f.f18241a));
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.F.b(view, view2, i10);
        this.f1335m = getActionBarHideOffset();
        o();
        d dVar = this.f1348z;
        if (dVar != null) {
            dVar.e();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f1327d.getVisibility() != 0) {
            return false;
        }
        return this.f1333k;
    }

    public void onStopNestedScroll(View view) {
        if (this.f1333k && !this.f1334l) {
            if (this.f1335m <= this.f1327d.getHeight()) {
                s();
            } else {
                r();
            }
        }
        d dVar = this.f1348z;
        if (dVar != null) {
            dVar.b();
        }
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f1335m + i11;
        this.f1335m = i14;
        setActionBarHideOffset(i14);
    }

    public void setIcon(Drawable drawable) {
        t();
        this.f1328f.setIcon(drawable);
    }
}
