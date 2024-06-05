package a6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.f;
import androidx.core.widget.c;
import x5.b;
import x5.j;

/* compiled from: MaterialCheckBox */
public class a extends f {

    /* renamed from: h  reason: collision with root package name */
    private static final int f24249h = j.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: i  reason: collision with root package name */
    private static final int[][] f24250i = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f24251f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f24252g;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f30856b);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f24251f == null) {
            int[][] iArr = f24250i;
            int[] iArr2 = new int[iArr.length];
            int c10 = d6.a.c(this, b.f30857e);
            int c11 = d6.a.c(this, b.colorSurface);
            int c12 = d6.a.c(this, b.colorOnSurface);
            iArr2[0] = d6.a.f(c11, c10, 1.0f);
            iArr2[1] = d6.a.f(c11, c12, 0.54f);
            iArr2[2] = d6.a.f(c11, c12, 0.38f);
            iArr2[3] = d6.a.f(c11, c12, 0.38f);
            this.f24251f = new ColorStateList(iArr, iArr2);
        }
        return this.f24251f;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24252g && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f24252g = z10;
        if (z10) {
            c.c(this, getMaterialThemeColorsTintList());
        } else {
            c.c(this, (ColorStateList) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f24249h
            android.content.Context r8 = com.google.android.material.internal.g.f(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = x5.k.Y1
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.g.k(r0, r1, r2, r3, r4, r5)
            int r10 = x5.k.Z1
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = k6.c.a(r8, r9, r10)
            androidx.core.widget.c.c(r7, r8)
        L_0x0028:
            int r8 = x5.k.f30867a2
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f24252g = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
