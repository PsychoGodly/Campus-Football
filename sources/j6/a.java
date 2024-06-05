package j6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.u;
import androidx.core.widget.c;
import x5.b;
import x5.j;

/* compiled from: MaterialRadioButton */
public class a extends u {

    /* renamed from: h  reason: collision with root package name */
    private static final int f29029h = j.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: i  reason: collision with root package name */
    private static final int[][] f29030i = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f29031f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f29032g;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f30861r);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f29031f == null) {
            int c10 = d6.a.c(this, b.f30857e);
            int c11 = d6.a.c(this, b.colorOnSurface);
            int c12 = d6.a.c(this, b.colorSurface);
            int[][] iArr = f29030i;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = d6.a.f(c12, c10, 1.0f);
            iArr2[1] = d6.a.f(c12, c11, 0.54f);
            iArr2[2] = d6.a.f(c12, c11, 0.38f);
            iArr2[3] = d6.a.f(c12, c11, 0.38f);
            this.f29031f = new ColorStateList(iArr, iArr2);
        }
        return this.f29031f;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f29032g && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f29032g = z10;
        if (z10) {
            c.c(this, getMaterialThemeColorsTintList());
        } else {
            c.c(this, (ColorStateList) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f29029h
            android.content.Context r7 = com.google.android.material.internal.g.f(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            int[] r2 = x5.k.f30873b2
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.g.k(r0, r1, r2, r3, r4, r5)
            int r9 = x5.k.f30879c2
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f29032g = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
