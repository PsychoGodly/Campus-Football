package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import v.e;
import v.h;

/* compiled from: ConstraintHelper */
public abstract class c extends View {

    /* renamed from: a  reason: collision with root package name */
    protected int[] f2236a = new int[32];

    /* renamed from: b  reason: collision with root package name */
    protected int f2237b;

    /* renamed from: c  reason: collision with root package name */
    protected Context f2238c;

    /* renamed from: d  reason: collision with root package name */
    protected h f2239d;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f2240f = false;

    /* renamed from: g  reason: collision with root package name */
    protected String f2241g;

    /* renamed from: h  reason: collision with root package name */
    protected String f2242h;

    /* renamed from: i  reason: collision with root package name */
    private View[] f2243i = null;

    /* renamed from: j  reason: collision with root package name */
    protected HashMap<Integer, String> f2244j = new HashMap<>();

    public c(Context context) {
        super(context);
        this.f2238c = context;
        m((AttributeSet) null);
    }

    private void d(String str) {
        if (str != null && str.length() != 0 && this.f2238c != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int k10 = k(trim);
            if (k10 != 0) {
                this.f2244j.put(Integer.valueOf(k10), trim);
                e(k10);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    private void e(int i10) {
        if (i10 != getId()) {
            int i11 = this.f2237b + 1;
            int[] iArr = this.f2236a;
            if (i11 > iArr.length) {
                this.f2236a = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f2236a;
            int i12 = this.f2237b;
            iArr2[i12] = i10;
            this.f2237b = i12 + 1;
        }
    }

    private void f(String str) {
        if (str != null && str.length() != 0 && this.f2238c != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = constraintLayout.getChildAt(i10);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).f2162c0)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                    } else {
                        e(childAt.getId());
                    }
                }
            }
        }
    }

    private int j(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f2238c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int k(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i10 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object f10 = constraintLayout.f(0, str);
            if (f10 instanceof Integer) {
                i10 = ((Integer) f10).intValue();
            }
        }
        if (i10 == 0 && constraintLayout != null) {
            i10 = j(constraintLayout, str);
        }
        if (i10 == 0) {
            try {
                i10 = j.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        return i10 == 0 ? this.f2238c.getResources().getIdentifier(str, "id", this.f2238c.getPackageName()) : i10;
    }

    /* access modifiers changed from: protected */
    public void g() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            h((ConstraintLayout) parent);
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2236a, this.f2237b);
    }

    /* access modifiers changed from: protected */
    public void h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i10 = 0; i10 < this.f2237b; i10++) {
            View h10 = constraintLayout.h(this.f2236a[i10]);
            if (h10 != null) {
                h10.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    h10.setTranslationZ(h10.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void i(ConstraintLayout constraintLayout) {
    }

    /* access modifiers changed from: protected */
    public View[] l(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f2243i;
        if (viewArr == null || viewArr.length != this.f2237b) {
            this.f2243i = new View[this.f2237b];
        }
        for (int i10 = 0; i10 < this.f2237b; i10++) {
            this.f2243i[i10] = constraintLayout.h(this.f2236a[i10]);
        }
        return this.f2243i;
    }

    /* access modifiers changed from: protected */
    public void m(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f2495n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.f2603z1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2241g = string;
                    setIds(string);
                } else if (index == k.A1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f2242h = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void n(e eVar, boolean z10) {
    }

    public void o(ConstraintLayout constraintLayout) {
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2241g;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2242h;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        if (this.f2240f) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(ConstraintLayout constraintLayout) {
    }

    public void q(ConstraintLayout constraintLayout) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = r5.f2244j.get(java.lang.Integer.valueOf(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void r(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.f2241g
            r5.setIds(r0)
        L_0x000b:
            v.h r0 = r5.f2239d
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r0.a()
            r0 = 0
        L_0x0014:
            int r1 = r5.f2237b
            if (r0 >= r1) goto L_0x0053
            int[] r1 = r5.f2236a
            r1 = r1[r0]
            android.view.View r2 = r6.h(r1)
            if (r2 != 0) goto L_0x0045
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r5.f2244j
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.j(r6, r1)
            if (r3 == 0) goto L_0x0045
            int[] r2 = r5.f2236a
            r2[r0] = r3
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r5.f2244j
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.h(r3)
        L_0x0045:
            if (r2 == 0) goto L_0x0050
            v.h r1 = r5.f2239d
            v.e r2 = r6.i(r2)
            r1.b(r2)
        L_0x0050:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0053:
            v.h r0 = r5.f2239d
            v.f r6 = r6.f2135c
            r0.c(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.r(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    public void s() {
        if (this.f2239d != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.b) {
                ((ConstraintLayout.b) layoutParams).f2200v0 = (e) this.f2239d;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setIds(String str) {
        this.f2241g = str;
        if (str != null) {
            int i10 = 0;
            this.f2237b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i10);
                if (indexOf == -1) {
                    d(str.substring(i10));
                    return;
                } else {
                    d(str.substring(i10, indexOf));
                    i10 = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setReferenceTags(String str) {
        this.f2242h = str;
        if (str != null) {
            int i10 = 0;
            this.f2237b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i10);
                if (indexOf == -1) {
                    f(str.substring(i10));
                    return;
                } else {
                    f(str.substring(i10, indexOf));
                    i10 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2241g = null;
        this.f2237b = 0;
        for (int e10 : iArr) {
            e(e10);
        }
    }

    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f2241g == null) {
            e(i10);
        }
    }
}
