package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* compiled from: TintableBackgroundView */
public interface y {
    ColorStateList getSupportBackgroundTintList();

    PorterDuff.Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(ColorStateList colorStateList);

    void setSupportBackgroundTintMode(PorterDuff.Mode mode);
}
