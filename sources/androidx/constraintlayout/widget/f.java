package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: Constraints */
public class f extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    e f2368a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    /* renamed from: b */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public e getConstraintSet() {
        if (this.f2368a == null) {
            this.f2368a = new e();
        }
        this.f2368a.g(this);
        return this.f2368a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    /* compiled from: Constraints */
    public static class a extends ConstraintLayout.b {
        public float A0;
        public float B0;
        public float C0;
        public float D0;
        public float E0;
        public float F0;
        public float G0;
        public float H0;
        public float I0;
        public float J0;

        /* renamed from: x0  reason: collision with root package name */
        public float f2369x0;

        /* renamed from: y0  reason: collision with root package name */
        public boolean f2370y0;

        /* renamed from: z0  reason: collision with root package name */
        public float f2371z0;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f2369x0 = 1.0f;
            this.f2370y0 = false;
            this.f2371z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 1.0f;
            this.E0 = 1.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
            this.J0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2369x0 = 1.0f;
            this.f2370y0 = false;
            this.f2371z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 1.0f;
            this.E0 = 1.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
            this.J0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f2480l4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.f2489m4) {
                    this.f2369x0 = obtainStyledAttributes.getFloat(index, this.f2369x0);
                } else if (index == k.f2588x4) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f2371z0 = obtainStyledAttributes.getFloat(index, this.f2371z0);
                        this.f2370y0 = true;
                    }
                } else if (index == k.f2561u4) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == k.f2570v4) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == k.f2552t4) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == k.f2534r4) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                } else if (index == k.f2543s4) {
                    this.E0 = obtainStyledAttributes.getFloat(index, this.E0);
                } else if (index == k.f2498n4) {
                    this.F0 = obtainStyledAttributes.getFloat(index, this.F0);
                } else if (index == k.f2507o4) {
                    this.G0 = obtainStyledAttributes.getFloat(index, this.G0);
                } else if (index == k.f2516p4) {
                    this.H0 = obtainStyledAttributes.getFloat(index, this.H0);
                } else if (index == k.f2525q4) {
                    this.I0 = obtainStyledAttributes.getFloat(index, this.I0);
                } else if (index == k.f2579w4 && Build.VERSION.SDK_INT >= 21) {
                    this.J0 = obtainStyledAttributes.getFloat(index, this.J0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
