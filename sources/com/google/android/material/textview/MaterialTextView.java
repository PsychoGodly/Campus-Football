package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.c0;
import k6.b;
import k6.c;
import x5.k;

public class MaterialTextView extends c0 {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private void r(Resources.Theme theme, int i10) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, k.f30903g2);
        int u10 = u(getContext(), obtainStyledAttributes, k.f30909h2, k.f30915i2);
        obtainStyledAttributes.recycle();
        if (u10 >= 0) {
            setLineHeight(u10);
        }
    }

    private static boolean s(Context context) {
        return b.b(context, x5.b.textAppearanceLineHeightEnabled, true);
    }

    private static int t(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.f30921j2, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(k.f30927k2, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int u(Context context, TypedArray typedArray, int... iArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < iArr.length && i10 < 0; i11++) {
            i10 = c.c(context, typedArray, iArr[i11], -1);
        }
        return i10;
    }

    private static boolean v(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.f30921j2, i10, i11);
        int u10 = u(context, obtainStyledAttributes, k.f30933l2, k.f30939m2);
        obtainStyledAttributes.recycle();
        if (u10 != -1) {
            return true;
        }
        return false;
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (s(context)) {
            r(context.getTheme(), i10);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        int t10;
        if (s(context)) {
            Resources.Theme theme = context.getTheme();
            if (!v(context, theme, attributeSet, i10, i11) && (t10 = t(theme, attributeSet, i10, i11)) != -1) {
                r(theme, t10);
            }
        }
    }
}
