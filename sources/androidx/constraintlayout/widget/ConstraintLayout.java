package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import v.d;
import v.e;
import v.f;
import v.g;
import v.j;
import v.k;
import w.b;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: y  reason: collision with root package name */
    private static l f2132y;

    /* renamed from: a  reason: collision with root package name */
    SparseArray<View> f2133a = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<c> f2134b = new ArrayList<>(4);

    /* renamed from: c  reason: collision with root package name */
    protected f f2135c = new f();

    /* renamed from: d  reason: collision with root package name */
    private int f2136d = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f2137f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f2138g = a.e.API_PRIORITY_OTHER;

    /* renamed from: h  reason: collision with root package name */
    private int f2139h = a.e.API_PRIORITY_OTHER;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f2140i = true;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public int f2141j = 257;

    /* renamed from: k  reason: collision with root package name */
    private e f2142k = null;

    /* renamed from: l  reason: collision with root package name */
    protected d f2143l = null;

    /* renamed from: m  reason: collision with root package name */
    private int f2144m = -1;

    /* renamed from: n  reason: collision with root package name */
    private HashMap<String, Integer> f2145n = new HashMap<>();

    /* renamed from: o  reason: collision with root package name */
    private int f2146o = -1;

    /* renamed from: p  reason: collision with root package name */
    private int f2147p = -1;

    /* renamed from: q  reason: collision with root package name */
    int f2148q = -1;

    /* renamed from: r  reason: collision with root package name */
    int f2149r = -1;

    /* renamed from: s  reason: collision with root package name */
    int f2150s = 0;

    /* renamed from: t  reason: collision with root package name */
    int f2151t = 0;

    /* renamed from: u  reason: collision with root package name */
    private SparseArray<e> f2152u = new SparseArray<>();

    /* renamed from: v  reason: collision with root package name */
    c f2153v = new c(this);

    /* renamed from: w  reason: collision with root package name */
    private int f2154w = 0;

    /* renamed from: x  reason: collision with root package name */
    private int f2155x = 0;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2156a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                v.e$b[] r0 = v.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2156a = r0
                v.e$b r1 = v.e.b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2156a     // Catch:{ NoSuchFieldError -> 0x001d }
                v.e$b r1 = v.e.b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2156a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v.e$b r1 = v.e.b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2156a     // Catch:{ NoSuchFieldError -> 0x0033 }
                v.e$b r1 = v.e.b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.<clinit>():void");
        }
    }

    class c implements b.C0242b {

        /* renamed from: a  reason: collision with root package name */
        ConstraintLayout f2207a;

        /* renamed from: b  reason: collision with root package name */
        int f2208b;

        /* renamed from: c  reason: collision with root package name */
        int f2209c;

        /* renamed from: d  reason: collision with root package name */
        int f2210d;

        /* renamed from: e  reason: collision with root package name */
        int f2211e;

        /* renamed from: f  reason: collision with root package name */
        int f2212f;

        /* renamed from: g  reason: collision with root package name */
        int f2213g;

        public c(ConstraintLayout constraintLayout) {
            this.f2207a = constraintLayout;
        }

        private boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 != 1073741824) {
                return false;
            }
            if ((mode == Integer.MIN_VALUE || mode == 0) && i12 == size) {
                return true;
            }
            return false;
        }

        public final void a() {
            int childCount = this.f2207a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f2207a.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).a(this.f2207a);
                }
            }
            int size = this.f2207a.f2134b.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((c) this.f2207a.f2134b.get(i11)).p(this.f2207a);
                }
            }
        }

        public final void b(e eVar, b.a aVar) {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            e eVar2 = eVar;
            b.a aVar2 = aVar;
            if (eVar2 != null) {
                if (eVar.T() == 8 && !eVar.h0()) {
                    aVar2.f23415e = 0;
                    aVar2.f23416f = 0;
                    aVar2.f23417g = 0;
                } else if (eVar.I() != null) {
                    e.b bVar = aVar2.f23411a;
                    e.b bVar2 = aVar2.f23412b;
                    int i17 = aVar2.f23413c;
                    int i18 = aVar2.f23414d;
                    int i19 = this.f2208b + this.f2209c;
                    int i20 = this.f2210d;
                    View view = (View) eVar.q();
                    int[] iArr = a.f2156a;
                    int i21 = iArr[bVar.ordinal()];
                    if (i21 == 1) {
                        i10 = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
                    } else if (i21 == 2) {
                        i10 = ViewGroup.getChildMeasureSpec(this.f2212f, i20, -2);
                    } else if (i21 == 3) {
                        i10 = ViewGroup.getChildMeasureSpec(this.f2212f, i20 + eVar.z(), -1);
                    } else if (i21 != 4) {
                        i10 = 0;
                    } else {
                        i10 = ViewGroup.getChildMeasureSpec(this.f2212f, i20, -2);
                        boolean z10 = eVar2.f23113w == 1;
                        int i22 = aVar2.f23420j;
                        if (i22 == b.a.f23409l || i22 == b.a.f23410m) {
                            if (aVar2.f23420j == b.a.f23410m || !z10 || (z10 && (view.getMeasuredHeight() == eVar.v())) || (view instanceof i) || eVar.l0()) {
                                i10 = View.MeasureSpec.makeMeasureSpec(eVar.U(), 1073741824);
                            }
                        }
                    }
                    int i23 = iArr[bVar2.ordinal()];
                    if (i23 == 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                    } else if (i23 == 2) {
                        i11 = ViewGroup.getChildMeasureSpec(this.f2213g, i19, -2);
                    } else if (i23 == 3) {
                        i11 = ViewGroup.getChildMeasureSpec(this.f2213g, i19 + eVar.S(), -1);
                    } else if (i23 != 4) {
                        i11 = 0;
                    } else {
                        i11 = ViewGroup.getChildMeasureSpec(this.f2213g, i19, -2);
                        boolean z11 = eVar2.f23115x == 1;
                        int i24 = aVar2.f23420j;
                        if (i24 == b.a.f23409l || i24 == b.a.f23410m) {
                            if (aVar2.f23420j == b.a.f23410m || !z11 || (z11 && (view.getMeasuredWidth() == eVar.U())) || (view instanceof i) || eVar.m0()) {
                                i11 = View.MeasureSpec.makeMeasureSpec(eVar.v(), 1073741824);
                            }
                        }
                    }
                    f fVar = (f) eVar.I();
                    if (fVar != null && j.b(ConstraintLayout.this.f2141j, 256) && view.getMeasuredWidth() == eVar.U() && view.getMeasuredWidth() < fVar.U() && view.getMeasuredHeight() == eVar.v() && view.getMeasuredHeight() < fVar.v() && view.getBaseline() == eVar.n() && !eVar.k0()) {
                        if (d(eVar.A(), i10, eVar.U()) && d(eVar.B(), i11, eVar.v())) {
                            aVar2.f23415e = eVar.U();
                            aVar2.f23416f = eVar.v();
                            aVar2.f23417g = eVar.n();
                            return;
                        }
                    }
                    e.b bVar3 = e.b.MATCH_CONSTRAINT;
                    boolean z12 = bVar == bVar3;
                    boolean z13 = bVar2 == bVar3;
                    e.b bVar4 = e.b.MATCH_PARENT;
                    boolean z14 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
                    boolean z15 = bVar == bVar4 || bVar == e.b.FIXED;
                    boolean z16 = z12 && eVar2.f23076d0 > 0.0f;
                    boolean z17 = z13 && eVar2.f23076d0 > 0.0f;
                    if (view != null) {
                        b bVar5 = (b) view.getLayoutParams();
                        int i25 = aVar2.f23420j;
                        if (i25 == b.a.f23409l || i25 == b.a.f23410m || !z12 || eVar2.f23113w != 0 || !z13 || eVar2.f23115x != 0) {
                            if (!(view instanceof m) || !(eVar2 instanceof k)) {
                                view.measure(i10, i11);
                            } else {
                                ((m) view).t((k) eVar2, i10, i11);
                            }
                            eVar2.S0(i10, i11);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            i13 = view.getBaseline();
                            int i26 = eVar2.f23119z;
                            i12 = i26 > 0 ? Math.max(i26, measuredWidth) : measuredWidth;
                            int i27 = eVar2.A;
                            if (i27 > 0) {
                                i12 = Math.min(i27, i12);
                            }
                            int i28 = eVar2.C;
                            if (i28 > 0) {
                                i14 = Math.max(i28, measuredHeight);
                                i16 = i10;
                            } else {
                                i16 = i10;
                                i14 = measuredHeight;
                            }
                            int i29 = eVar2.D;
                            if (i29 > 0) {
                                i14 = Math.min(i29, i14);
                            }
                            if (!j.b(ConstraintLayout.this.f2141j, 1)) {
                                if (z16 && z14) {
                                    i12 = (int) ((((float) i14) * eVar2.f23076d0) + 0.5f);
                                } else if (z17 && z15) {
                                    i14 = (int) ((((float) i12) / eVar2.f23076d0) + 0.5f);
                                }
                            }
                            if (!(measuredWidth == i12 && measuredHeight == i14)) {
                                int makeMeasureSpec = measuredWidth != i12 ? View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : i16;
                                if (measuredHeight != i14) {
                                    i11 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                                }
                                view.measure(makeMeasureSpec, i11);
                                eVar2.S0(makeMeasureSpec, i11);
                                i12 = view.getMeasuredWidth();
                                i14 = view.getMeasuredHeight();
                                i13 = view.getBaseline();
                            }
                            i15 = -1;
                        } else {
                            i15 = -1;
                            i14 = 0;
                            i13 = 0;
                            i12 = 0;
                        }
                        boolean z18 = i13 != i15;
                        aVar2.f23419i = (i12 == aVar2.f23413c && i14 == aVar2.f23414d) ? false : true;
                        if (bVar5.f2170g0) {
                            z18 = true;
                        }
                        if (!(!z18 || i13 == -1 || eVar.n() == i13)) {
                            aVar2.f23419i = true;
                        }
                        aVar2.f23415e = i12;
                        aVar2.f23416f = i14;
                        aVar2.f23418h = z18;
                        aVar2.f23417g = i13;
                    }
                }
            }
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f2208b = i12;
            this.f2209c = i13;
            this.f2210d = i14;
            this.f2211e = i15;
            this.f2212f = i10;
            this.f2213g = i11;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j(attributeSet, 0, 0);
    }

    private final e g(int i10) {
        if (i10 == 0) {
            return this.f2135c;
        }
        View view = this.f2133a.get(i10);
        if (view == null && (view = findViewById(i10)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f2135c;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f2200v0;
    }

    private int getPaddingWidth() {
        int i10 = 0;
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        if (Build.VERSION.SDK_INT >= 17) {
            i10 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        }
        return i10 > 0 ? i10 : max;
    }

    public static l getSharedValues() {
        if (f2132y == null) {
            f2132y = new l();
        }
        return f2132y;
    }

    private void j(AttributeSet attributeSet, int i10, int i11) {
        this.f2135c.y0(this);
        this.f2135c.R1(this.f2153v);
        this.f2133a.put(getId(), this);
        this.f2142k = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f2495n1, i10, i11);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == k.f2540s1) {
                    this.f2136d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2136d);
                } else if (index == k.f2549t1) {
                    this.f2137f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2137f);
                } else if (index == k.f2522q1) {
                    this.f2138g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2138g);
                } else if (index == k.f2531r1) {
                    this.f2139h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2139h);
                } else if (index == k.H2) {
                    this.f2141j = obtainStyledAttributes.getInt(index, this.f2141j);
                } else if (index == k.C1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f2143l = null;
                        }
                    }
                } else if (index == k.f2594y1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        e eVar = new e();
                        this.f2142k = eVar;
                        eVar.j(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f2142k = null;
                    }
                    this.f2144m = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2135c.S1(this.f2141j);
    }

    private void l() {
        this.f2140i = true;
        this.f2146o = -1;
        this.f2147p = -1;
        this.f2148q = -1;
        this.f2149r = -1;
        this.f2150s = 0;
        this.f2151t = 0;
    }

    private void p() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            e i11 = i(getChildAt(i10));
            if (i11 != null) {
                i11.r0();
            }
        }
        if (isInEditMode) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    g(childAt.getId()).z0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f2144m != -1) {
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt2 = getChildAt(i13);
                if (childAt2.getId() == this.f2144m && (childAt2 instanceof f)) {
                    this.f2142k = ((f) childAt2).getConstraintSet();
                }
            }
        }
        e eVar = this.f2142k;
        if (eVar != null) {
            eVar.d(this, true);
        }
        this.f2135c.r1();
        int size = this.f2134b.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                this.f2134b.get(i14).r(this);
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt3 = getChildAt(i15);
            if (childAt3 instanceof i) {
                ((i) childAt3).b(this);
            }
        }
        this.f2152u.clear();
        this.f2152u.put(0, this.f2135c);
        this.f2152u.put(getId(), this.f2135c);
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt4 = getChildAt(i16);
            this.f2152u.put(childAt4.getId(), i(childAt4));
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt5 = getChildAt(i17);
            e i18 = i(childAt5);
            if (i18 != null) {
                this.f2135c.b(i18);
                c(isInEditMode, childAt5, i18, (b) childAt5.getLayoutParams(), this.f2152u);
            }
        }
    }

    private void s(e eVar, b bVar, SparseArray<e> sparseArray, int i10, d.b bVar2) {
        View view = this.f2133a.get(i10);
        e eVar2 = sparseArray.get(i10);
        if (eVar2 != null && view != null && (view.getLayoutParams() instanceof b)) {
            bVar.f2170g0 = true;
            d.b bVar3 = d.b.BASELINE;
            if (bVar2 == bVar3) {
                b bVar4 = (b) view.getLayoutParams();
                bVar4.f2170g0 = true;
                bVar4.f2200v0.H0(true);
            }
            eVar.m(bVar3).a(eVar2.m(bVar2), bVar.D, bVar.C, true);
            eVar.H0(true);
            eVar.m(d.b.TOP).p();
            eVar.m(d.b.BOTTOM).p();
        }
    }

    private boolean t() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            p();
        }
        return z10;
    }

    /* access modifiers changed from: protected */
    public void c(boolean z10, View view, e eVar, b bVar, SparseArray<e> sparseArray) {
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        e eVar2;
        e eVar3;
        e eVar4;
        e eVar5;
        View view2 = view;
        e eVar6 = eVar;
        b bVar2 = bVar;
        SparseArray<e> sparseArray2 = sparseArray;
        bVar.a();
        bVar2.f2202w0 = false;
        eVar6.g1(view.getVisibility());
        if (bVar2.f2176j0) {
            eVar6.Q0(true);
            eVar6.g1(8);
        }
        eVar6.y0(view2);
        if (view2 instanceof c) {
            ((c) view2).n(eVar6, this.f2135c.L1());
        }
        if (bVar2.f2172h0) {
            g gVar = (g) eVar6;
            int i14 = bVar2.f2194s0;
            int i15 = bVar2.f2196t0;
            float f11 = bVar2.f2198u0;
            if (Build.VERSION.SDK_INT < 17) {
                i14 = bVar2.f2157a;
                i15 = bVar2.f2159b;
                f11 = bVar2.f2161c;
            }
            if (f11 != -1.0f) {
                gVar.w1(f11);
            } else if (i14 != -1) {
                gVar.u1(i14);
            } else if (i15 != -1) {
                gVar.v1(i15);
            }
        } else {
            int i16 = bVar2.f2180l0;
            int i17 = bVar2.f2182m0;
            int i18 = bVar2.f2184n0;
            int i19 = bVar2.f2186o0;
            int i20 = bVar2.f2188p0;
            int i21 = bVar2.f2190q0;
            float f12 = bVar2.f2192r0;
            if (Build.VERSION.SDK_INT < 17) {
                i16 = bVar2.f2165e;
                int i22 = bVar2.f2167f;
                int i23 = bVar2.f2169g;
                int i24 = bVar2.f2171h;
                int i25 = bVar2.f2201w;
                int i26 = bVar2.f2204y;
                float f13 = bVar2.G;
                if (i16 == -1 && i22 == -1) {
                    int i27 = bVar2.f2195t;
                    if (i27 != -1) {
                        i16 = i27;
                    } else {
                        int i28 = bVar2.f2193s;
                        if (i28 != -1) {
                            i22 = i28;
                        }
                    }
                }
                if (i23 == -1 && i24 == -1) {
                    i12 = bVar2.f2197u;
                    if (i12 == -1) {
                        int i29 = bVar2.f2199v;
                        if (i29 != -1) {
                            i10 = i26;
                            f10 = f13;
                            i20 = i25;
                            i11 = i29;
                            i17 = i22;
                            i12 = i23;
                        }
                    }
                    i10 = i26;
                    f10 = f13;
                    i20 = i25;
                    i11 = i24;
                    i17 = i22;
                }
                i12 = i23;
                i10 = i26;
                f10 = f13;
                i20 = i25;
                i11 = i24;
                i17 = i22;
            } else {
                i10 = i21;
                f10 = f12;
                i12 = i18;
                i11 = i19;
            }
            int i30 = bVar2.f2187p;
            if (i30 != -1) {
                e eVar7 = sparseArray2.get(i30);
                if (eVar7 != null) {
                    eVar6.j(eVar7, bVar2.f2191r, bVar2.f2189q);
                }
            } else {
                if (i16 != -1) {
                    e eVar8 = sparseArray2.get(i16);
                    if (eVar8 != null) {
                        d.b bVar3 = d.b.LEFT;
                        eVar.c0(bVar3, eVar8, bVar3, bVar2.leftMargin, i20);
                    }
                } else if (!(i17 == -1 || (eVar5 = sparseArray2.get(i17)) == null)) {
                    eVar.c0(d.b.LEFT, eVar5, d.b.RIGHT, bVar2.leftMargin, i20);
                }
                if (i12 != -1) {
                    e eVar9 = sparseArray2.get(i12);
                    if (eVar9 != null) {
                        eVar.c0(d.b.RIGHT, eVar9, d.b.LEFT, bVar2.rightMargin, i10);
                    }
                } else if (!(i11 == -1 || (eVar4 = sparseArray2.get(i11)) == null)) {
                    d.b bVar4 = d.b.RIGHT;
                    eVar.c0(bVar4, eVar4, bVar4, bVar2.rightMargin, i10);
                }
                int i31 = bVar2.f2173i;
                if (i31 != -1) {
                    e eVar10 = sparseArray2.get(i31);
                    if (eVar10 != null) {
                        d.b bVar5 = d.b.TOP;
                        eVar.c0(bVar5, eVar10, bVar5, bVar2.topMargin, bVar2.f2203x);
                    }
                } else {
                    int i32 = bVar2.f2175j;
                    if (!(i32 == -1 || (eVar3 = sparseArray2.get(i32)) == null)) {
                        eVar.c0(d.b.TOP, eVar3, d.b.BOTTOM, bVar2.topMargin, bVar2.f2203x);
                    }
                }
                int i33 = bVar2.f2177k;
                if (i33 != -1) {
                    e eVar11 = sparseArray2.get(i33);
                    if (eVar11 != null) {
                        eVar.c0(d.b.BOTTOM, eVar11, d.b.TOP, bVar2.bottomMargin, bVar2.f2205z);
                    }
                } else {
                    int i34 = bVar2.f2179l;
                    if (!(i34 == -1 || (eVar2 = sparseArray2.get(i34)) == null)) {
                        d.b bVar6 = d.b.BOTTOM;
                        eVar.c0(bVar6, eVar2, bVar6, bVar2.bottomMargin, bVar2.f2205z);
                    }
                }
                int i35 = bVar2.f2181m;
                if (i35 != -1) {
                    s(eVar, bVar, sparseArray, i35, d.b.BASELINE);
                } else {
                    int i36 = bVar2.f2183n;
                    if (i36 != -1) {
                        s(eVar, bVar, sparseArray, i36, d.b.TOP);
                    } else {
                        int i37 = bVar2.f2185o;
                        if (i37 != -1) {
                            s(eVar, bVar, sparseArray, i37, d.b.BOTTOM);
                        }
                    }
                }
                if (f10 >= 0.0f) {
                    eVar6.J0(f10);
                }
                float f14 = bVar2.H;
                if (f14 >= 0.0f) {
                    eVar6.a1(f14);
                }
            }
            if (z10 && !((i13 = bVar2.X) == -1 && bVar2.Y == -1)) {
                eVar6.Y0(i13, bVar2.Y);
            }
            if (bVar2.f2166e0) {
                eVar6.M0(e.b.FIXED);
                eVar6.h1(bVar2.width);
                if (bVar2.width == -2) {
                    eVar6.M0(e.b.WRAP_CONTENT);
                }
            } else if (bVar2.width == -1) {
                if (bVar2.f2158a0) {
                    eVar6.M0(e.b.MATCH_CONSTRAINT);
                } else {
                    eVar6.M0(e.b.MATCH_PARENT);
                }
                eVar6.m(d.b.LEFT).f23055g = bVar2.leftMargin;
                eVar6.m(d.b.RIGHT).f23055g = bVar2.rightMargin;
            } else {
                eVar6.M0(e.b.MATCH_CONSTRAINT);
                eVar6.h1(0);
            }
            if (bVar2.f2168f0) {
                eVar6.d1(e.b.FIXED);
                eVar6.I0(bVar2.height);
                if (bVar2.height == -2) {
                    eVar6.d1(e.b.WRAP_CONTENT);
                }
            } else if (bVar2.height == -1) {
                if (bVar2.f2160b0) {
                    eVar6.d1(e.b.MATCH_CONSTRAINT);
                } else {
                    eVar6.d1(e.b.MATCH_PARENT);
                }
                eVar6.m(d.b.TOP).f23055g = bVar2.topMargin;
                eVar6.m(d.b.BOTTOM).f23055g = bVar2.bottomMargin;
            } else {
                eVar6.d1(e.b.MATCH_CONSTRAINT);
                eVar6.I0(0);
            }
            eVar6.A0(bVar2.I);
            eVar6.O0(bVar2.L);
            eVar6.f1(bVar2.M);
            eVar6.K0(bVar2.N);
            eVar6.b1(bVar2.O);
            eVar6.i1(bVar2.f2164d0);
            eVar6.N0(bVar2.P, bVar2.R, bVar2.T, bVar2.V);
            eVar6.e1(bVar2.Q, bVar2.S, bVar2.U, bVar2.W);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<c> arrayList = this.f2134b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f2134b.get(i10).q(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i13 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = (float) i12;
                        float f11 = (float) (i12 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f12 = (float) i13;
                        float f13 = f10;
                        float f14 = f10;
                        float f15 = f12;
                        Paint paint2 = paint;
                        float f16 = f11;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f13, f15, f16, f12, paint3);
                        float parseInt4 = (float) (i13 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f17 = f11;
                        float f18 = parseInt4;
                        canvas2.drawLine(f17, f15, f16, f18, paint3);
                        float f19 = parseInt4;
                        float f20 = f14;
                        canvas2.drawLine(f17, f19, f20, f18, paint3);
                        float f21 = f14;
                        canvas2.drawLine(f21, f19, f20, f12, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f22 = f11;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f21, f12, f22, parseInt4, paint6);
                        canvas2.drawLine(f21, parseInt4, f22, f12, paint6);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f2145n;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f2145n.get(str);
    }

    public void forceLayout() {
        l();
        super.forceLayout();
    }

    public int getMaxHeight() {
        return this.f2139h;
    }

    public int getMaxWidth() {
        return this.f2138g;
    }

    public int getMinHeight() {
        return this.f2137f;
    }

    public int getMinWidth() {
        return this.f2136d;
    }

    public int getOptimizationLevel() {
        return this.f2135c.G1();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f2135c.f23097o == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f2135c.f23097o = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f2135c.f23097o = "parent";
            }
        }
        if (this.f2135c.r() == null) {
            f fVar = this.f2135c;
            fVar.z0(fVar.f23097o);
            Log.v("ConstraintLayout", " setDebugName " + this.f2135c.r());
        }
        Iterator<e> it = this.f2135c.o1().iterator();
        while (it.hasNext()) {
            e next = it.next();
            View view = (View) next.q();
            if (view != null) {
                if (next.f23097o == null && (id2 = view.getId()) != -1) {
                    next.f23097o = getContext().getResources().getResourceEntryName(id2);
                }
                if (next.r() == null) {
                    next.z0(next.f23097o);
                    Log.v("ConstraintLayout", " setDebugName " + next.r());
                }
            }
        }
        this.f2135c.M(sb2);
        return sb2.toString();
    }

    public View h(int i10) {
        return this.f2133a.get(i10);
    }

    public final e i(View view) {
        if (view == this) {
            return this.f2135c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f2200v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f2200v0;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean k() {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        if (!((getContext().getApplicationInfo().flags & 4194304) != 0) || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void m(int i10) {
        this.f2143l = new d(getContext(), this, i10);
    }

    /* access modifiers changed from: protected */
    public void n(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.f2153v;
        int i14 = cVar.f2211e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i12 + cVar.f2210d, i10, 0);
        int min = Math.min(this.f2138g, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f2139h, ViewGroup.resolveSizeAndState(i13 + i14, i11, 0) & 16777215);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f2146o = min;
        this.f2147p = min2;
    }

    /* access modifiers changed from: protected */
    public void o(f fVar, int i10, int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i14 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f2153v.c(i11, i12, max, max2, paddingWidth, i14);
        if (Build.VERSION.SDK_INT >= 17) {
            int max3 = Math.max(0, getPaddingStart());
            int max4 = Math.max(0, getPaddingEnd());
            if (max3 <= 0 && max4 <= 0) {
                max3 = Math.max(0, getPaddingLeft());
            } else if (k()) {
                max3 = max4;
            }
            i13 = max3;
        } else {
            i13 = Math.max(0, getPaddingLeft());
        }
        int i15 = size - paddingWidth;
        int i16 = size2 - i14;
        r(fVar, mode, i15, mode2, i16);
        fVar.N1(i10, mode, i15, mode2, i16, this.f2146o, this.f2147p, i13, max);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            e eVar = bVar.f2200v0;
            if ((childAt.getVisibility() != 8 || bVar.f2172h0 || bVar.f2174i0 || bVar.f2178k0 || isInEditMode) && !bVar.f2176j0) {
                int V = eVar.V();
                int W = eVar.W();
                int U = eVar.U() + V;
                int v10 = eVar.v() + W;
                childAt.layout(V, W, U, v10);
                if ((childAt instanceof i) && (content = ((i) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(V, W, U, v10);
                }
            }
        }
        int size = this.f2134b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.f2134b.get(i15).o(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        if (this.f2154w == i10) {
            int i12 = this.f2155x;
        }
        if (!this.f2140i) {
            int childCount = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                } else if (getChildAt(i13).isLayoutRequested()) {
                    this.f2140i = true;
                    break;
                } else {
                    i13++;
                }
            }
        }
        boolean z10 = this.f2140i;
        this.f2154w = i10;
        this.f2155x = i11;
        this.f2135c.U1(k());
        if (this.f2140i) {
            this.f2140i = false;
            if (t()) {
                this.f2135c.W1();
            }
        }
        o(this.f2135c, this.f2141j, i10, i11);
        n(i10, i11, this.f2135c.U(), this.f2135c.v(), this.f2135c.M1(), this.f2135c.K1());
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        e i10 = i(view);
        if ((view instanceof h) && !(i10 instanceof g)) {
            b bVar = (b) view.getLayoutParams();
            g gVar = new g();
            bVar.f2200v0 = gVar;
            bVar.f2172h0 = true;
            gVar.x1(bVar.Z);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.s();
            ((b) view.getLayoutParams()).f2174i0 = true;
            if (!this.f2134b.contains(cVar)) {
                this.f2134b.add(cVar);
            }
        }
        this.f2133a.put(view.getId(), view);
        this.f2140i = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f2133a.remove(view.getId());
        this.f2135c.q1(i(view));
        this.f2134b.remove(view);
        this.f2140i = true;
    }

    public void q(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f2145n == null) {
                this.f2145n = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH);
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f2145n.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* access modifiers changed from: protected */
    public void r(f fVar, int i10, int i11, int i12, int i13) {
        e.b bVar;
        c cVar = this.f2153v;
        int i14 = cVar.f2211e;
        int i15 = cVar.f2210d;
        e.b bVar2 = e.b.FIXED;
        int childCount = getChildCount();
        if (i10 != Integer.MIN_VALUE) {
            if (i10 == 0) {
                bVar = e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i11 = Math.max(0, this.f2136d);
                }
            } else if (i10 != 1073741824) {
                bVar = bVar2;
            } else {
                i11 = Math.min(this.f2138g - i15, i11);
                bVar = bVar2;
            }
            i11 = 0;
        } else {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f2136d);
            }
        }
        if (i12 != Integer.MIN_VALUE) {
            if (i12 == 0) {
                bVar2 = e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i13 = Math.max(0, this.f2137f);
                }
            } else if (i12 == 1073741824) {
                i13 = Math.min(this.f2139h - i14, i13);
            }
            i13 = 0;
        } else {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f2137f);
            }
        }
        if (!(i11 == fVar.U() && i13 == fVar.v())) {
            fVar.J1();
        }
        fVar.j1(0);
        fVar.k1(0);
        fVar.U0(this.f2138g - i15);
        fVar.T0(this.f2139h - i14);
        fVar.X0(0);
        fVar.W0(0);
        fVar.M0(bVar);
        fVar.h1(i11);
        fVar.d1(bVar2);
        fVar.I0(i13);
        fVar.X0(this.f2136d - i15);
        fVar.W0(this.f2137f - i14);
    }

    public void requestLayout() {
        l();
        super.requestLayout();
    }

    public void setConstraintSet(e eVar) {
        this.f2142k = eVar;
    }

    public void setId(int i10) {
        this.f2133a.remove(getId());
        super.setId(i10);
        this.f2133a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 != this.f2139h) {
            this.f2139h = i10;
            requestLayout();
        }
    }

    public void setMaxWidth(int i10) {
        if (i10 != this.f2138g) {
            this.f2138g = i10;
            requestLayout();
        }
    }

    public void setMinHeight(int i10) {
        if (i10 != this.f2137f) {
            this.f2137f = i10;
            requestLayout();
        }
    }

    public void setMinWidth(int i10) {
        if (i10 != this.f2136d) {
            this.f2136d = i10;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(g gVar) {
        d dVar = this.f2143l;
        if (dVar != null) {
            dVar.c(gVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f2141j = i10;
        this.f2135c.S1(i10);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A = RecyclerView.UNDEFINED_DURATION;
        public int B = RecyclerView.UNDEFINED_DURATION;
        public int C = RecyclerView.UNDEFINED_DURATION;
        public int D = 0;
        boolean E = true;
        boolean F = true;
        public float G = 0.5f;
        public float H = 0.5f;
        public String I = null;
        float J = 0.0f;
        int K = 1;
        public float L = -1.0f;
        public float M = -1.0f;
        public int N = 0;
        public int O = 0;
        public int P = 0;
        public int Q = 0;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public float V = 1.0f;
        public float W = 1.0f;
        public int X = -1;
        public int Y = -1;
        public int Z = -1;

        /* renamed from: a  reason: collision with root package name */
        public int f2157a = -1;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f2158a0 = false;

        /* renamed from: b  reason: collision with root package name */
        public int f2159b = -1;

        /* renamed from: b0  reason: collision with root package name */
        public boolean f2160b0 = false;

        /* renamed from: c  reason: collision with root package name */
        public float f2161c = -1.0f;

        /* renamed from: c0  reason: collision with root package name */
        public String f2162c0 = null;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2163d = true;

        /* renamed from: d0  reason: collision with root package name */
        public int f2164d0 = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f2165e = -1;

        /* renamed from: e0  reason: collision with root package name */
        boolean f2166e0 = true;

        /* renamed from: f  reason: collision with root package name */
        public int f2167f = -1;

        /* renamed from: f0  reason: collision with root package name */
        boolean f2168f0 = true;

        /* renamed from: g  reason: collision with root package name */
        public int f2169g = -1;

        /* renamed from: g0  reason: collision with root package name */
        boolean f2170g0 = false;

        /* renamed from: h  reason: collision with root package name */
        public int f2171h = -1;

        /* renamed from: h0  reason: collision with root package name */
        boolean f2172h0 = false;

        /* renamed from: i  reason: collision with root package name */
        public int f2173i = -1;

        /* renamed from: i0  reason: collision with root package name */
        boolean f2174i0 = false;

        /* renamed from: j  reason: collision with root package name */
        public int f2175j = -1;

        /* renamed from: j0  reason: collision with root package name */
        boolean f2176j0 = false;

        /* renamed from: k  reason: collision with root package name */
        public int f2177k = -1;

        /* renamed from: k0  reason: collision with root package name */
        boolean f2178k0 = false;

        /* renamed from: l  reason: collision with root package name */
        public int f2179l = -1;

        /* renamed from: l0  reason: collision with root package name */
        int f2180l0 = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f2181m = -1;

        /* renamed from: m0  reason: collision with root package name */
        int f2182m0 = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f2183n = -1;

        /* renamed from: n0  reason: collision with root package name */
        int f2184n0 = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f2185o = -1;

        /* renamed from: o0  reason: collision with root package name */
        int f2186o0 = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f2187p = -1;

        /* renamed from: p0  reason: collision with root package name */
        int f2188p0 = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: q  reason: collision with root package name */
        public int f2189q = 0;

        /* renamed from: q0  reason: collision with root package name */
        int f2190q0 = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: r  reason: collision with root package name */
        public float f2191r = 0.0f;

        /* renamed from: r0  reason: collision with root package name */
        float f2192r0 = 0.5f;

        /* renamed from: s  reason: collision with root package name */
        public int f2193s = -1;

        /* renamed from: s0  reason: collision with root package name */
        int f2194s0;

        /* renamed from: t  reason: collision with root package name */
        public int f2195t = -1;

        /* renamed from: t0  reason: collision with root package name */
        int f2196t0;

        /* renamed from: u  reason: collision with root package name */
        public int f2197u = -1;

        /* renamed from: u0  reason: collision with root package name */
        float f2198u0;

        /* renamed from: v  reason: collision with root package name */
        public int f2199v = -1;

        /* renamed from: v0  reason: collision with root package name */
        e f2200v0 = new e();

        /* renamed from: w  reason: collision with root package name */
        public int f2201w = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: w0  reason: collision with root package name */
        public boolean f2202w0 = false;

        /* renamed from: x  reason: collision with root package name */
        public int f2203x = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: y  reason: collision with root package name */
        public int f2204y = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: z  reason: collision with root package name */
        public int f2205z = RecyclerView.UNDEFINED_DURATION;

        private static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f2206a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2206a = sparseIntArray;
                sparseIntArray.append(k.f2541s2, 64);
                sparseIntArray.append(k.V1, 65);
                sparseIntArray.append(k.f2415e2, 8);
                sparseIntArray.append(k.f2424f2, 9);
                sparseIntArray.append(k.f2442h2, 10);
                sparseIntArray.append(k.f2451i2, 11);
                sparseIntArray.append(k.f2505o2, 12);
                sparseIntArray.append(k.f2496n2, 13);
                sparseIntArray.append(k.L1, 14);
                sparseIntArray.append(k.K1, 15);
                sparseIntArray.append(k.G1, 16);
                sparseIntArray.append(k.I1, 52);
                sparseIntArray.append(k.H1, 53);
                sparseIntArray.append(k.M1, 2);
                sparseIntArray.append(k.O1, 3);
                sparseIntArray.append(k.N1, 4);
                sparseIntArray.append(k.f2586x2, 49);
                sparseIntArray.append(k.f2595y2, 50);
                sparseIntArray.append(k.S1, 5);
                sparseIntArray.append(k.T1, 6);
                sparseIntArray.append(k.U1, 7);
                sparseIntArray.append(k.B1, 67);
                sparseIntArray.append(k.f2504o1, 1);
                sparseIntArray.append(k.f2460j2, 17);
                sparseIntArray.append(k.f2469k2, 18);
                sparseIntArray.append(k.R1, 19);
                sparseIntArray.append(k.Q1, 20);
                sparseIntArray.append(k.C2, 21);
                sparseIntArray.append(k.F2, 22);
                sparseIntArray.append(k.D2, 23);
                sparseIntArray.append(k.A2, 24);
                sparseIntArray.append(k.E2, 25);
                sparseIntArray.append(k.B2, 26);
                sparseIntArray.append(k.f2604z2, 55);
                sparseIntArray.append(k.G2, 54);
                sparseIntArray.append(k.f2379a2, 29);
                sparseIntArray.append(k.f2514p2, 30);
                sparseIntArray.append(k.P1, 44);
                sparseIntArray.append(k.f2397c2, 45);
                sparseIntArray.append(k.f2532r2, 46);
                sparseIntArray.append(k.f2388b2, 47);
                sparseIntArray.append(k.f2523q2, 48);
                sparseIntArray.append(k.E1, 27);
                sparseIntArray.append(k.D1, 28);
                sparseIntArray.append(k.f2550t2, 31);
                sparseIntArray.append(k.W1, 32);
                sparseIntArray.append(k.f2568v2, 33);
                sparseIntArray.append(k.f2559u2, 34);
                sparseIntArray.append(k.f2577w2, 35);
                sparseIntArray.append(k.Y1, 36);
                sparseIntArray.append(k.X1, 37);
                sparseIntArray.append(k.Z1, 38);
                sparseIntArray.append(k.f2406d2, 39);
                sparseIntArray.append(k.f2487m2, 40);
                sparseIntArray.append(k.f2433g2, 41);
                sparseIntArray.append(k.J1, 42);
                sparseIntArray.append(k.F1, 43);
                sparseIntArray.append(k.f2478l2, 51);
                sparseIntArray.append(k.I2, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f2495n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = a.f2206a.get(index);
                switch (i11) {
                    case 1:
                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f2187p);
                        this.f2187p = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f2187p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f2189q = obtainStyledAttributes.getDimensionPixelSize(index, this.f2189q);
                        break;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f2191r) % 360.0f;
                        this.f2191r = f10;
                        if (f10 >= 0.0f) {
                            break;
                        } else {
                            this.f2191r = (360.0f - f10) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f2157a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2157a);
                        break;
                    case 6:
                        this.f2159b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2159b);
                        break;
                    case 7:
                        this.f2161c = obtainStyledAttributes.getFloat(index, this.f2161c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f2165e);
                        this.f2165e = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f2165e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f2167f);
                        this.f2167f = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f2167f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f2169g);
                        this.f2169g = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f2169g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f2171h);
                        this.f2171h = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f2171h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f2173i);
                        this.f2173i = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f2173i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f2175j);
                        this.f2175j = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f2175j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f2177k);
                        this.f2177k = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f2177k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f2179l);
                        this.f2179l = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f2179l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f2181m);
                        this.f2181m = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f2181m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f2193s);
                        this.f2193s = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f2193s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f2195t);
                        this.f2195t = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f2195t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f2197u);
                        this.f2197u = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f2197u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f2199v);
                        this.f2199v = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f2199v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f2201w = obtainStyledAttributes.getDimensionPixelSize(index, this.f2201w);
                        break;
                    case 22:
                        this.f2203x = obtainStyledAttributes.getDimensionPixelSize(index, this.f2203x);
                        break;
                    case 23:
                        this.f2204y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2204y);
                        break;
                    case 24:
                        this.f2205z = obtainStyledAttributes.getDimensionPixelSize(index, this.f2205z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.f2158a0 = obtainStyledAttributes.getBoolean(index, this.f2158a0);
                        break;
                    case 28:
                        this.f2160b0 = obtainStyledAttributes.getBoolean(index, this.f2160b0);
                        break;
                    case 29:
                        this.G = obtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case 30:
                        this.H = obtainStyledAttributes.getFloat(index, this.H);
                        break;
                    case 31:
                        int i12 = obtainStyledAttributes.getInt(index, 0);
                        this.P = i12;
                        if (i12 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.Q = i13;
                        if (i13 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.R) != -2) {
                                break;
                            } else {
                                this.R = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.T) != -2) {
                                break;
                            } else {
                                this.T = -2;
                                break;
                            }
                        }
                    case 35:
                        this.V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    case 36:
                        try {
                            this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.S) != -2) {
                                break;
                            } else {
                                this.S = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.U) != -2) {
                                break;
                            } else {
                                this.U = -2;
                                break;
                            }
                        }
                    case 38:
                        this.W = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                e.o(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.L = obtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case 46:
                                this.M = obtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case 47:
                                this.N = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.O = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.X = obtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case 50:
                                this.Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                break;
                            case 51:
                                this.f2162c0 = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f2183n);
                                this.f2183n = resourceId15;
                                if (resourceId15 != -1) {
                                    break;
                                } else {
                                    this.f2183n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f2185o);
                                this.f2185o = resourceId16;
                                if (resourceId16 != -1) {
                                    break;
                                } else {
                                    this.f2185o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        e.m(this, obtainStyledAttributes, index, 0);
                                        this.E = true;
                                        break;
                                    case 65:
                                        e.m(this, obtainStyledAttributes, index, 1);
                                        this.F = true;
                                        break;
                                    case 66:
                                        this.f2164d0 = obtainStyledAttributes.getInt(index, this.f2164d0);
                                        break;
                                    case 67:
                                        this.f2163d = obtainStyledAttributes.getBoolean(index, this.f2163d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.f2172h0 = false;
            this.f2166e0 = true;
            this.f2168f0 = true;
            int i10 = this.width;
            if (i10 == -2 && this.f2158a0) {
                this.f2166e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i11 = this.height;
            if (i11 == -2 && this.f2160b0) {
                this.f2168f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f2166e0 = false;
                if (i10 == 0 && this.P == 1) {
                    this.width = -2;
                    this.f2158a0 = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f2168f0 = false;
                if (i11 == 0 && this.Q == 1) {
                    this.height = -2;
                    this.f2160b0 = true;
                }
            }
            if (this.f2161c != -1.0f || this.f2157a != -1 || this.f2159b != -1) {
                this.f2172h0 = true;
                this.f2166e0 = true;
                this.f2168f0 = true;
                if (!(this.f2200v0 instanceof g)) {
                    this.f2200v0 = new g();
                }
                ((g) this.f2200v0).x1(this.Z);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x00d2  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 0
                r4 = 1
                r5 = 17
                if (r2 < r5) goto L_0x0017
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                if (r4 != r11) goto L_0x0017
                r11 = 1
                goto L_0x0018
            L_0x0017:
                r11 = 0
            L_0x0018:
                r2 = -1
                r10.f2184n0 = r2
                r10.f2186o0 = r2
                r10.f2180l0 = r2
                r10.f2182m0 = r2
                r10.f2188p0 = r2
                r10.f2190q0 = r2
                int r5 = r10.f2201w
                r10.f2188p0 = r5
                int r5 = r10.f2204y
                r10.f2190q0 = r5
                float r5 = r10.G
                r10.f2192r0 = r5
                int r6 = r10.f2157a
                r10.f2194s0 = r6
                int r7 = r10.f2159b
                r10.f2196t0 = r7
                float r8 = r10.f2161c
                r10.f2198u0 = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x009e
                int r11 = r10.f2193s
                if (r11 == r2) goto L_0x0049
                r10.f2184n0 = r11
            L_0x0047:
                r3 = 1
                goto L_0x0050
            L_0x0049:
                int r11 = r10.f2195t
                if (r11 == r2) goto L_0x0050
                r10.f2186o0 = r11
                goto L_0x0047
            L_0x0050:
                int r11 = r10.f2197u
                if (r11 == r2) goto L_0x0057
                r10.f2182m0 = r11
                r3 = 1
            L_0x0057:
                int r11 = r10.f2199v
                if (r11 == r2) goto L_0x005e
                r10.f2180l0 = r11
                r3 = 1
            L_0x005e:
                int r11 = r10.A
                if (r11 == r9) goto L_0x0064
                r10.f2190q0 = r11
            L_0x0064:
                int r11 = r10.B
                if (r11 == r9) goto L_0x006a
                r10.f2188p0 = r11
            L_0x006a:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x0072
                float r3 = r11 - r5
                r10.f2192r0 = r3
            L_0x0072:
                boolean r3 = r10.f2172h0
                if (r3 == 0) goto L_0x00c2
                int r3 = r10.Z
                if (r3 != r4) goto L_0x00c2
                boolean r3 = r10.f2163d
                if (r3 == 0) goto L_0x00c2
                r3 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r4 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r4 == 0) goto L_0x008c
                float r11 = r11 - r8
                r10.f2198u0 = r11
                r10.f2194s0 = r2
                r10.f2196t0 = r2
                goto L_0x00c2
            L_0x008c:
                if (r6 == r2) goto L_0x0095
                r10.f2196t0 = r6
                r10.f2194s0 = r2
                r10.f2198u0 = r3
                goto L_0x00c2
            L_0x0095:
                if (r7 == r2) goto L_0x00c2
                r10.f2194s0 = r7
                r10.f2196t0 = r2
                r10.f2198u0 = r3
                goto L_0x00c2
            L_0x009e:
                int r11 = r10.f2193s
                if (r11 == r2) goto L_0x00a4
                r10.f2182m0 = r11
            L_0x00a4:
                int r11 = r10.f2195t
                if (r11 == r2) goto L_0x00aa
                r10.f2180l0 = r11
            L_0x00aa:
                int r11 = r10.f2197u
                if (r11 == r2) goto L_0x00b0
                r10.f2184n0 = r11
            L_0x00b0:
                int r11 = r10.f2199v
                if (r11 == r2) goto L_0x00b6
                r10.f2186o0 = r11
            L_0x00b6:
                int r11 = r10.A
                if (r11 == r9) goto L_0x00bc
                r10.f2188p0 = r11
            L_0x00bc:
                int r11 = r10.B
                if (r11 == r9) goto L_0x00c2
                r10.f2190q0 = r11
            L_0x00c2:
                int r11 = r10.f2197u
                if (r11 != r2) goto L_0x010c
                int r11 = r10.f2199v
                if (r11 != r2) goto L_0x010c
                int r11 = r10.f2195t
                if (r11 != r2) goto L_0x010c
                int r11 = r10.f2193s
                if (r11 != r2) goto L_0x010c
                int r11 = r10.f2169g
                if (r11 == r2) goto L_0x00e1
                r10.f2184n0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00ef
                if (r1 <= 0) goto L_0x00ef
                r10.rightMargin = r1
                goto L_0x00ef
            L_0x00e1:
                int r11 = r10.f2171h
                if (r11 == r2) goto L_0x00ef
                r10.f2186o0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00ef
                if (r1 <= 0) goto L_0x00ef
                r10.rightMargin = r1
            L_0x00ef:
                int r11 = r10.f2165e
                if (r11 == r2) goto L_0x00fe
                r10.f2180l0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x010c
                if (r0 <= 0) goto L_0x010c
                r10.leftMargin = r0
                goto L_0x010c
            L_0x00fe:
                int r11 = r10.f2167f
                if (r11 == r2) goto L_0x010c
                r10.f2182m0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x010c
                if (r0 <= 0) goto L_0x010c
                r10.leftMargin = r0
            L_0x010c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i10, int i11) {
            super(i10, i11);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
