package com.google.android.material.theme;

import a6.a;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.appcompat.app.l;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.u;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

@Keep
public class MaterialComponentsViewInflater extends l {
    private static int floatingToolbarItemBackgroundResId = -1;

    /* access modifiers changed from: protected */
    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        if (shouldInflateAppCompatButton(context, attributeSet)) {
            return new AppCompatButton(context, attributeSet);
        }
        return new MaterialButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public f createCheckBox(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public u createRadioButton(Context context, AttributeSet attributeSet) {
        return new j6.a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public c0 createTextView(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean shouldInflateAppCompatButton(Context context, AttributeSet attributeSet) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 != 23 && i10 != 24 && i10 != 25) {
            return false;
        }
        if (floatingToolbarItemBackgroundResId == -1) {
            floatingToolbarItemBackgroundResId = context.getResources().getIdentifier("floatingToolbarItemBackgroundDrawable", "^attr-private", "android");
        }
        int i11 = floatingToolbarItemBackgroundResId;
        if (!(i11 == 0 || i11 == -1)) {
            for (int i12 = 0; i12 < attributeSet.getAttributeCount(); i12++) {
                if (attributeSet.getAttributeNameResource(i12) == 16842964 && floatingToolbarItemBackgroundResId == attributeSet.getAttributeListValue(i12, (String[]) null, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
