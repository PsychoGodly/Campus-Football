package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.g0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: DropDownListView */
class i0 extends ListView {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f1636a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    private int f1637b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f1638c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f1639d = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f1640f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f1641g;

    /* renamed from: h  reason: collision with root package name */
    private d f1642h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1643i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1644j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1645k;

    /* renamed from: l  reason: collision with root package name */
    private g0 f1646l;

    /* renamed from: m  reason: collision with root package name */
    private androidx.core.widget.f f1647m;

    /* renamed from: n  reason: collision with root package name */
    f f1648n;

    /* compiled from: DropDownListView */
    static class a {
        static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    /* compiled from: DropDownListView */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        private static Method f1649a;

        /* renamed from: b  reason: collision with root package name */
        private static Method f1650b;

        /* renamed from: c  reason: collision with root package name */
        private static Method f1651c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f1652d = true;

        static {
            Class<AbsListView> cls = AbsListView.class;
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("positionSelector", new Class[]{cls2, View.class, Boolean.TYPE, cls3, cls3});
                f1649a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", new Class[]{cls2});
                f1650b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{cls2});
                f1651c = declaredMethod3;
                declaredMethod3.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }

        static boolean a() {
            return f1652d;
        }

        static void b(i0 i0Var, int i10, View view) {
            try {
                f1649a.invoke(i0Var, new Object[]{Integer.valueOf(i10), view, Boolean.FALSE, -1, -1});
                f1650b.invoke(i0Var, new Object[]{Integer.valueOf(i10)});
                f1651c.invoke(i0Var, new Object[]{Integer.valueOf(i10)});
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* compiled from: DropDownListView */
    static class c {
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    /* compiled from: DropDownListView */
    private static class d extends j.c {

        /* renamed from: b  reason: collision with root package name */
        private boolean f1653b = true;

        d(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z10) {
            this.f1653b = z10;
        }

        public void draw(Canvas canvas) {
            if (this.f1653b) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f10, float f11) {
            if (this.f1653b) {
                super.setHotspot(f10, f11);
            }
        }

        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f1653b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f1653b) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f1653b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* compiled from: DropDownListView */
    static class e {

        /* renamed from: a  reason: collision with root package name */
        private static final Field f1654a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f1654a = field;
        }

        static boolean a(AbsListView absListView) {
            Field field = f1654a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return false;
            }
        }

        static void b(AbsListView absListView, boolean z10) {
            Field field = f1654a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z10));
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* compiled from: DropDownListView */
    private class f implements Runnable {
        f() {
        }

        public void a() {
            i0 i0Var = i0.this;
            i0Var.f1648n = null;
            i0Var.removeCallbacks(this);
        }

        public void b() {
            i0.this.post(this);
        }

        public void run() {
            i0 i0Var = i0.this;
            i0Var.f1648n = null;
            i0Var.drawableStateChanged();
        }
    }

    i0(Context context, boolean z10) {
        super(context, (AttributeSet) null, h.a.A);
        this.f1644j = z10;
        setCacheColorHint(0);
    }

    private void a() {
        this.f1645k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1641g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        g0 g0Var = this.f1646l;
        if (g0Var != null) {
            g0Var.c();
            this.f1646l = null;
        }
    }

    private void b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (!this.f1636a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1636a);
            selector.draw(canvas);
        }
    }

    private void f(int i10, View view) {
        Rect rect = this.f1636a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1637b;
        rect.top -= this.f1638c;
        rect.right += this.f1639d;
        rect.bottom += this.f1640f;
        boolean j10 = j();
        if (view.isEnabled() != j10) {
            k(!j10);
            if (i10 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void g(int i10, View view) {
        Drawable selector = getSelector();
        boolean z10 = true;
        boolean z11 = (selector == null || i10 == -1) ? false : true;
        if (z11) {
            selector.setVisible(false, false);
        }
        f(i10, view);
        if (z11) {
            Rect rect = this.f1636a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z10 = false;
            }
            selector.setVisible(z10, false);
            androidx.core.graphics.drawable.a.k(selector, exactCenterX, exactCenterY);
        }
    }

    private void h(int i10, View view, float f10, float f11) {
        g(i10, view);
        Drawable selector = getSelector();
        if (selector != null && i10 != -1) {
            androidx.core.graphics.drawable.a.k(selector, f10, f11);
        }
    }

    private void i(View view, int i10, float f10, float f11) {
        View childAt;
        this.f1645k = true;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 21) {
            a.a(this, f10, f11);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i12 = this.f1641g;
        if (!(i12 == -1 || (childAt = getChildAt(i12 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f1641g = i10;
        float left = f10 - ((float) view.getLeft());
        float top = f11 - ((float) view.getTop());
        if (i11 >= 21) {
            a.a(view, left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i10, view, f10, f11);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean j() {
        if (androidx.core.os.a.d()) {
            return c.a(this);
        }
        return e.a(this);
    }

    private void k(boolean z10) {
        if (androidx.core.os.a.d()) {
            c.b(this, z10);
        } else {
            e.b(this, z10);
        }
    }

    private boolean l() {
        return this.f1645k;
    }

    private void m() {
        Drawable selector = getSelector();
        if (selector != null && l() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z10) {
        d dVar = this.f1642h;
        if (dVar != null) {
            dVar.c(z10);
        }
    }

    public int d(int i10, int i11, int i12, int i13, int i14) {
        int i15;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i16 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < count) {
            int itemViewType = adapter.getItemViewType(i17);
            if (itemViewType != i18) {
                view = null;
                i18 = itemViewType;
            }
            view = adapter.getView(i17, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i20 = layoutParams.height;
            if (i20 > 0) {
                i15 = View.MeasureSpec.makeMeasureSpec(i20, 1073741824);
            } else {
                i15 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i10, i15);
            view.forceLayout();
            if (i17 > 0) {
                i16 += dividerHeight;
            }
            i16 += view.getMeasuredHeight();
            if (i16 >= i13) {
                return (i14 < 0 || i17 <= i14 || i19 <= 0 || i16 == i13) ? i13 : i19;
            }
            if (i14 >= 0 && i17 >= i14) {
                i19 = i16;
            }
            i17++;
        }
        return i16;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f1648n == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = 0
            r3 = 1
            goto L_0x0046
        L_0x0011:
            r9 = 0
            r3 = 0
            goto L_0x0046
        L_0x0014:
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = 1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x000e
            r7.b(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.f r9 = r7.f1647m
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.f1647m = r9
        L_0x005a:
            androidx.core.widget.f r9 = r7.f1647m
            r9.m(r2)
            androidx.core.widget.f r9 = r7.f1647m
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.f r8 = r7.f1647m
            if (r8 == 0) goto L_0x006c
            r8.m(r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i0.e(android.view.MotionEvent, int):boolean");
    }

    public boolean hasFocus() {
        return this.f1644j || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f1644j || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f1644j || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f1644j && this.f1643i) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f1648n = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1648n == null) {
            f fVar = new f();
            this.f1648n = fVar;
            fVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 < 30 || !b.a()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        b.b(this, pointToPosition, childAt);
                    }
                }
                m();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1641g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f1648n;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z10) {
        this.f1643i = z10;
    }

    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f1642h = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1637b = rect.left;
        this.f1638c = rect.top;
        this.f1639d = rect.right;
        this.f1640f = rect.bottom;
    }
}
