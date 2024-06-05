package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.view.d;
import androidx.appcompat.widget.z0;
import x5.b;
import x5.k;

/* compiled from: ThemeEnforcement */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f25853a = {b.f30859h};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f25854b = {b.colorPrimaryVariant};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f25855c = {16842752, b.f30862z};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f25856d = {b.materialThemeOverlay};

    public static void a(Context context) {
        e(context, f25853a, "Theme.AppCompat");
    }

    private static void b(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f30929k4, i10, i11);
        boolean z10 = obtainStyledAttributes.getBoolean(k.f30941m4, false);
        obtainStyledAttributes.recycle();
        if (z10) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(Context context) {
        e(context, f25854b, "Theme.MaterialComponents");
    }

    private static void d(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        boolean z10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f30929k4, i10, i11);
        boolean z11 = false;
        if (!obtainStyledAttributes.getBoolean(k.f30947n4, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(k.f30935l4, -1) != -1) {
                z11 = true;
            }
            z10 = z11;
        } else {
            z10 = g(context, attributeSet, iArr, i10, i11, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z10) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void e(Context context, int[] iArr, String str) {
        if (!h(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    public static Context f(Context context, AttributeSet attributeSet, int i10, int i11) {
        int j10 = j(context, attributeSet, i10, i11);
        if (j10 == 0) {
            return context;
        }
        if ((context instanceof d) && ((d) context).c() == j10) {
            return context;
        }
        d dVar = new d(context, j10);
        int i12 = i(dVar, attributeSet);
        return i12 != 0 ? new d((Context) dVar, i12) : dVar;
    }

    private static boolean g(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    private static boolean h(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (!obtainStyledAttributes.hasValue(i10)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    private static int i(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f25855c);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    private static int j(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f25856d, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static TypedArray k(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        b(context, attributeSet, i10, i11);
        d(context, attributeSet, iArr, i10, i11, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
    }

    public static z0 l(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        b(context, attributeSet, i10, i11);
        d(context, attributeSet, iArr, i10, i11, iArr2);
        return z0.v(context, attributeSet, iArr, i10, i11);
    }
}
