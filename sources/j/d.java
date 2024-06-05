package j;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import j.b;

/* compiled from: StateListDrawableCompat */
public class d extends b {

    /* renamed from: n  reason: collision with root package name */
    private a f19186n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f19187o;

    /* compiled from: StateListDrawableCompat */
    static class a extends b.d {
        int[][] J;

        a(a aVar, d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[f()][];
            }
        }

        /* access modifiers changed from: package-private */
        public int A(int[] iArr) {
            int[][] iArr2 = this.J;
            int h10 = h();
            for (int i10 = 0; i10 < h10; i10++) {
                if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                    return i10;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new d(this, (Resources) null);
        }

        public void o(int i10, int i11) {
            super.o(i10, i11);
            int[][] iArr = new int[i11][];
            System.arraycopy(this.J, 0, iArr, 0, i10);
            this.J = iArr;
        }

        /* access modifiers changed from: package-private */
        public void r() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.J = iArr2;
        }

        /* access modifiers changed from: package-private */
        public int z(int[] iArr, Drawable drawable) {
            int a10 = a(drawable);
            this.J[a10] = iArr;
            return a10;
        }

        public Drawable newDrawable(Resources resources) {
            return new d(this, resources);
        }
    }

    d(a aVar, Resources resources) {
        h(new a(aVar, this, resources));
        onStateChange(getState());
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: package-private */
    public void h(b.d dVar) {
        super.h(dVar);
        if (dVar instanceof a) {
            this.f19186n = (a) dVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public a b() {
        return new a(this.f19186n, this, (Resources) null);
    }

    /* access modifiers changed from: package-private */
    public int[] k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i10 = 0;
        for (int i11 = 0; i11 < attributeCount; i11++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i11);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i12 = i10 + 1;
                if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i10] = attributeNameResource;
                i10 = i12;
            }
        }
        return StateSet.trimStateSet(iArr, i10);
    }

    public Drawable mutate() {
        if (!this.f19187o && super.mutate() == this) {
            this.f19186n.r();
            this.f19187o = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A = this.f19186n.A(iArr);
        if (A < 0) {
            A = this.f19186n.A(StateSet.WILD_CARD);
        }
        return g(A) || onStateChange;
    }

    d(a aVar) {
        if (aVar != null) {
            h(aVar);
        }
    }
}
