package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.util.h;
import androidx.core.view.a0;
import k6.c;
import n6.g;
import n6.k;

/* compiled from: CalendarItemStyle */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f25612a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorStateList f25613b;

    /* renamed from: c  reason: collision with root package name */
    private final ColorStateList f25614c;

    /* renamed from: d  reason: collision with root package name */
    private final ColorStateList f25615d;

    /* renamed from: e  reason: collision with root package name */
    private final int f25616e;

    /* renamed from: f  reason: collision with root package name */
    private final k f25617f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, k kVar, Rect rect) {
        h.c(rect.left);
        h.c(rect.top);
        h.c(rect.right);
        h.c(rect.bottom);
        this.f25612a = rect;
        this.f25613b = colorStateList2;
        this.f25614c = colorStateList;
        this.f25615d = colorStateList3;
        this.f25616e = i10;
        this.f25617f = kVar;
    }

    static b a(Context context, int i10) {
        h.a(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, x5.k.M1);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(x5.k.N1, 0), obtainStyledAttributes.getDimensionPixelOffset(x5.k.P1, 0), obtainStyledAttributes.getDimensionPixelOffset(x5.k.O1, 0), obtainStyledAttributes.getDimensionPixelOffset(x5.k.Q1, 0));
        ColorStateList a10 = c.a(context, obtainStyledAttributes, x5.k.R1);
        ColorStateList a11 = c.a(context, obtainStyledAttributes, x5.k.W1);
        ColorStateList a12 = c.a(context, obtainStyledAttributes, x5.k.U1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(x5.k.V1, 0);
        k m10 = k.b(context, obtainStyledAttributes.getResourceId(x5.k.S1, 0), obtainStyledAttributes.getResourceId(x5.k.T1, 0)).m();
        obtainStyledAttributes.recycle();
        return new b(a10, a11, a12, dimensionPixelSize, m10, rect);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f25612a.bottom;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f25612a.top;
    }

    /* access modifiers changed from: package-private */
    public void d(TextView textView) {
        g gVar = new g();
        g gVar2 = new g();
        gVar.setShapeAppearanceModel(this.f25617f);
        gVar2.setShapeAppearanceModel(this.f25617f);
        gVar.T(this.f25614c);
        gVar.Z((float) this.f25616e, this.f25615d);
        textView.setTextColor(this.f25613b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f25613b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.f25612a;
        a0.r0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
