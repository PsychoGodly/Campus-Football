package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.p;
import androidx.core.view.a0;
import com.facebook.ads.AdError;
import com.google.android.gms.common.api.a;
import h.j;
import java.lang.reflect.Method;

/* compiled from: ListPopupWindow */
public class m0 implements p {
    private static Method H;
    private static Method I;
    private static Method J;
    private final e A;
    private Runnable B;
    final Handler C;
    private final Rect D;
    private Rect E;
    private boolean F;
    PopupWindow G;

    /* renamed from: a  reason: collision with root package name */
    private Context f1713a;

    /* renamed from: b  reason: collision with root package name */
    private ListAdapter f1714b;

    /* renamed from: c  reason: collision with root package name */
    i0 f1715c;

    /* renamed from: d  reason: collision with root package name */
    private int f1716d;

    /* renamed from: f  reason: collision with root package name */
    private int f1717f;

    /* renamed from: g  reason: collision with root package name */
    private int f1718g;

    /* renamed from: h  reason: collision with root package name */
    private int f1719h;

    /* renamed from: i  reason: collision with root package name */
    private int f1720i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1721j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1722k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1723l;

    /* renamed from: m  reason: collision with root package name */
    private int f1724m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f1725n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f1726o;

    /* renamed from: p  reason: collision with root package name */
    int f1727p;

    /* renamed from: q  reason: collision with root package name */
    private View f1728q;

    /* renamed from: r  reason: collision with root package name */
    private int f1729r;

    /* renamed from: s  reason: collision with root package name */
    private DataSetObserver f1730s;

    /* renamed from: t  reason: collision with root package name */
    private View f1731t;

    /* renamed from: u  reason: collision with root package name */
    private Drawable f1732u;

    /* renamed from: v  reason: collision with root package name */
    private AdapterView.OnItemClickListener f1733v;

    /* renamed from: w  reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f1734w;

    /* renamed from: x  reason: collision with root package name */
    final i f1735x;

    /* renamed from: y  reason: collision with root package name */
    private final h f1736y;

    /* renamed from: z  reason: collision with root package name */
    private final g f1737z;

    /* compiled from: ListPopupWindow */
    class a implements Runnable {
        a() {
        }

        public void run() {
            View s10 = m0.this.s();
            if (s10 != null && s10.getWindowToken() != null) {
                m0.this.show();
            }
        }
    }

    /* compiled from: ListPopupWindow */
    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            i0 i0Var;
            if (i10 != -1 && (i0Var = m0.this.f1715c) != null) {
                i0Var.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* compiled from: ListPopupWindow */
    static class c {
        static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    /* compiled from: ListPopupWindow */
    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    /* compiled from: ListPopupWindow */
    private class e implements Runnable {
        e() {
        }

        public void run() {
            m0.this.q();
        }
    }

    /* compiled from: ListPopupWindow */
    private class f extends DataSetObserver {
        f() {
        }

        public void onChanged() {
            if (m0.this.b()) {
                m0.this.show();
            }
        }

        public void onInvalidated() {
            m0.this.dismiss();
        }
    }

    /* compiled from: ListPopupWindow */
    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 == 1 && !m0.this.v() && m0.this.G.getContentView() != null) {
                m0 m0Var = m0.this;
                m0Var.C.removeCallbacks(m0Var.f1735x);
                m0.this.f1735x.run();
            }
        }
    }

    /* compiled from: ListPopupWindow */
    private class h implements View.OnTouchListener {
        h() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = m0.this.G) != null && popupWindow.isShowing() && x10 >= 0 && x10 < m0.this.G.getWidth() && y10 >= 0 && y10 < m0.this.G.getHeight()) {
                m0 m0Var = m0.this;
                m0Var.C.postDelayed(m0Var.f1735x, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                m0 m0Var2 = m0.this;
                m0Var2.C.removeCallbacks(m0Var2.f1735x);
                return false;
            }
        }
    }

    /* compiled from: ListPopupWindow */
    private class i implements Runnable {
        i() {
        }

        public void run() {
            i0 i0Var = m0.this.f1715c;
            if (i0Var != null && a0.Q(i0Var) && m0.this.f1715c.getCount() > m0.this.f1715c.getChildCount()) {
                int childCount = m0.this.f1715c.getChildCount();
                m0 m0Var = m0.this;
                if (childCount <= m0Var.f1727p) {
                    m0Var.G.setInputMethodMode(2);
                    m0.this.show();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                H = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                J = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                I = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public m0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    private void I(boolean z10) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = H;
            if (method != null) {
                try {
                    method.invoke(this.G, new Object[]{Boolean.valueOf(z10)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            d.b(this.G, z10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.i0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: androidx.appcompat.widget.i0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.appcompat.widget.i0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int p() {
        /*
            r12 = this;
            androidx.appcompat.widget.i0 r0 = r12.f1715c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00bf
            android.content.Context r0 = r12.f1713a
            androidx.appcompat.widget.m0$a r5 = new androidx.appcompat.widget.m0$a
            r5.<init>()
            r12.B = r5
            boolean r5 = r12.F
            r5 = r5 ^ r3
            androidx.appcompat.widget.i0 r5 = r12.r(r0, r5)
            r12.f1715c = r5
            android.graphics.drawable.Drawable r6 = r12.f1732u
            if (r6 == 0) goto L_0x0022
            r5.setSelector(r6)
        L_0x0022:
            androidx.appcompat.widget.i0 r5 = r12.f1715c
            android.widget.ListAdapter r6 = r12.f1714b
            r5.setAdapter(r6)
            androidx.appcompat.widget.i0 r5 = r12.f1715c
            android.widget.AdapterView$OnItemClickListener r6 = r12.f1733v
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.i0 r5 = r12.f1715c
            r5.setFocusable(r3)
            androidx.appcompat.widget.i0 r5 = r12.f1715c
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.i0 r5 = r12.f1715c
            androidx.appcompat.widget.m0$b r6 = new androidx.appcompat.widget.m0$b
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.i0 r5 = r12.f1715c
            androidx.appcompat.widget.m0$g r6 = r12.f1737z
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f1734w
            if (r5 == 0) goto L_0x0054
            androidx.appcompat.widget.i0 r6 = r12.f1715c
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            androidx.appcompat.widget.i0 r5 = r12.f1715c
            android.view.View r6 = r12.f1728q
            if (r6 == 0) goto L_0x00b8
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f1729r
            if (r8 == 0) goto L_0x008f
            if (r8 == r3) goto L_0x0088
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f1729r
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x0095
        L_0x0088:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0095
        L_0x008f:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0095:
            int r0 = r12.f1717f
            if (r0 < 0) goto L_0x009c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x009e
        L_0x009c:
            r0 = 0
            r5 = 0
        L_0x009e:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b9
        L_0x00b8:
            r0 = 0
        L_0x00b9:
            android.widget.PopupWindow r6 = r12.G
            r6.setContentView(r5)
            goto L_0x00dd
        L_0x00bf:
            android.widget.PopupWindow r0 = r12.G
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f1728q
            if (r0 == 0) goto L_0x00dc
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00dd
        L_0x00dc:
            r0 = 0
        L_0x00dd:
            android.widget.PopupWindow r5 = r12.G
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f9
            android.graphics.Rect r6 = r12.D
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.D
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f1721j
            if (r7 != 0) goto L_0x00ff
            int r6 = -r6
            r12.f1719h = r6
            goto L_0x00ff
        L_0x00f9:
            android.graphics.Rect r5 = r12.D
            r5.setEmpty()
            r5 = 0
        L_0x00ff:
            android.widget.PopupWindow r6 = r12.G
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r3 = 0
        L_0x010a:
            android.view.View r4 = r12.s()
            int r6 = r12.f1719h
            int r3 = r12.t(r4, r6, r3)
            boolean r4 = r12.f1725n
            if (r4 != 0) goto L_0x017b
            int r4 = r12.f1716d
            if (r4 != r2) goto L_0x011d
            goto L_0x017b
        L_0x011d:
            int r4 = r12.f1717f
            r6 = -2
            if (r4 == r6) goto L_0x0144
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x012b
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x015c
        L_0x012b:
            android.content.Context r2 = r12.f1713a
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.D
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x015c
        L_0x0144:
            android.content.Context r2 = r12.f1713a
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.D
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x015c:
            r7 = r1
            androidx.appcompat.widget.i0 r6 = r12.f1715c
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0179
            androidx.appcompat.widget.i0 r2 = r12.f1715c
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.i0 r3 = r12.f1715c
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0179:
            int r1 = r1 + r0
            return r1
        L_0x017b:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m0.p():int");
    }

    private int t(View view, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT > 23) {
            return c.a(this.G, view, i10, z10);
        }
        Method method = I;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.G, new Object[]{view, Integer.valueOf(i10), Boolean.valueOf(z10)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.G.getMaxAvailableHeight(view, i10);
    }

    private void x() {
        View view = this.f1728q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1728q);
            }
        }
    }

    public void A(int i10) {
        Drawable background = this.G.getBackground();
        if (background != null) {
            background.getPadding(this.D);
            Rect rect = this.D;
            this.f1717f = rect.left + rect.right + i10;
            return;
        }
        L(i10);
    }

    public void B(int i10) {
        this.f1724m = i10;
    }

    public void C(Rect rect) {
        this.E = rect != null ? new Rect(rect) : null;
    }

    public void D(int i10) {
        this.G.setInputMethodMode(i10);
    }

    public void E(boolean z10) {
        this.F = z10;
        this.G.setFocusable(z10);
    }

    public void F(PopupWindow.OnDismissListener onDismissListener) {
        this.G.setOnDismissListener(onDismissListener);
    }

    public void G(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1733v = onItemClickListener;
    }

    public void H(boolean z10) {
        this.f1723l = true;
        this.f1722k = z10;
    }

    public void J(int i10) {
        this.f1729r = i10;
    }

    public void K(int i10) {
        i0 i0Var = this.f1715c;
        if (b() && i0Var != null) {
            i0Var.setListSelectionHidden(false);
            i0Var.setSelection(i10);
            if (i0Var.getChoiceMode() != 0) {
                i0Var.setItemChecked(i10, true);
            }
        }
    }

    public void L(int i10) {
        this.f1717f = i10;
    }

    public void a(Drawable drawable) {
        this.G.setBackgroundDrawable(drawable);
    }

    public boolean b() {
        return this.G.isShowing();
    }

    public int c() {
        return this.f1718g;
    }

    public void dismiss() {
        this.G.dismiss();
        x();
        this.G.setContentView((View) null);
        this.f1715c = null;
        this.C.removeCallbacks(this.f1735x);
    }

    public void e(int i10) {
        this.f1718g = i10;
    }

    public Drawable h() {
        return this.G.getBackground();
    }

    public ListView i() {
        return this.f1715c;
    }

    public void k(int i10) {
        this.f1719h = i10;
        this.f1721j = true;
    }

    public int n() {
        if (!this.f1721j) {
            return 0;
        }
        return this.f1719h;
    }

    public void o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1730s;
        if (dataSetObserver == null) {
            this.f1730s = new f();
        } else {
            ListAdapter listAdapter2 = this.f1714b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1714b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1730s);
        }
        i0 i0Var = this.f1715c;
        if (i0Var != null) {
            i0Var.setAdapter(this.f1714b);
        }
    }

    public void q() {
        i0 i0Var = this.f1715c;
        if (i0Var != null) {
            i0Var.setListSelectionHidden(true);
            i0Var.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public i0 r(Context context, boolean z10) {
        return new i0(context, z10);
    }

    public View s() {
        return this.f1731t;
    }

    public void show() {
        int p10 = p();
        boolean v10 = v();
        androidx.core.widget.h.b(this.G, this.f1720i);
        boolean z10 = true;
        if (!this.G.isShowing()) {
            int i10 = this.f1717f;
            if (i10 == -1) {
                i10 = -1;
            } else if (i10 == -2) {
                i10 = s().getWidth();
            }
            int i11 = this.f1716d;
            if (i11 == -1) {
                p10 = -1;
            } else if (i11 != -2) {
                p10 = i11;
            }
            this.G.setWidth(i10);
            this.G.setHeight(p10);
            I(true);
            this.G.setOutsideTouchable(!this.f1726o && !this.f1725n);
            this.G.setTouchInterceptor(this.f1736y);
            if (this.f1723l) {
                androidx.core.widget.h.a(this.G, this.f1722k);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = J;
                if (method != null) {
                    try {
                        method.invoke(this.G, new Object[]{this.E});
                    } catch (Exception e10) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                    }
                }
            } else {
                d.a(this.G, this.E);
            }
            androidx.core.widget.h.c(this.G, s(), this.f1718g, this.f1719h, this.f1724m);
            this.f1715c.setSelection(-1);
            if (!this.F || this.f1715c.isInTouchMode()) {
                q();
            }
            if (!this.F) {
                this.C.post(this.A);
            }
        } else if (a0.Q(s())) {
            int i12 = this.f1717f;
            if (i12 == -1) {
                i12 = -1;
            } else if (i12 == -2) {
                i12 = s().getWidth();
            }
            int i13 = this.f1716d;
            if (i13 == -1) {
                if (!v10) {
                    p10 = -1;
                }
                if (v10) {
                    this.G.setWidth(this.f1717f == -1 ? -1 : 0);
                    this.G.setHeight(0);
                } else {
                    this.G.setWidth(this.f1717f == -1 ? -1 : 0);
                    this.G.setHeight(-1);
                }
            } else if (i13 != -2) {
                p10 = i13;
            }
            PopupWindow popupWindow = this.G;
            if (this.f1726o || this.f1725n) {
                z10 = false;
            }
            popupWindow.setOutsideTouchable(z10);
            this.G.update(s(), this.f1718g, this.f1719h, i12 < 0 ? -1 : i12, p10 < 0 ? -1 : p10);
        }
    }

    public int u() {
        return this.f1717f;
    }

    public boolean v() {
        return this.G.getInputMethodMode() == 2;
    }

    public boolean w() {
        return this.F;
    }

    public void y(View view) {
        this.f1731t = view;
    }

    public void z(int i10) {
        this.G.setAnimationStyle(i10);
    }

    public m0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1716d = -2;
        this.f1717f = -2;
        this.f1720i = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        this.f1724m = 0;
        this.f1725n = false;
        this.f1726o = false;
        this.f1727p = a.e.API_PRIORITY_OTHER;
        this.f1729r = 0;
        this.f1735x = new i();
        this.f1736y = new h();
        this.f1737z = new g();
        this.A = new e();
        this.D = new Rect();
        this.f1713a = context;
        this.C = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f18361l1, i10, i11);
        this.f1718g = obtainStyledAttributes.getDimensionPixelOffset(j.f18366m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(j.f18371n1, 0);
        this.f1719h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1721j = true;
        }
        obtainStyledAttributes.recycle();
        s sVar = new s(context, attributeSet, i10, i11);
        this.G = sVar;
        sVar.setInputMethodMode(1);
    }
}
