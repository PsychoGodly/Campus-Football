package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import androidx.core.graphics.drawable.b;

/* compiled from: VectorDrawableCommon */
abstract class g extends Drawable implements b {

    /* renamed from: a  reason: collision with root package name */
    Drawable f4889a;

    g() {
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            a.a(drawable, theme);
        }
    }

    public void clearColorFilter() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumHeight() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    public int[] getState() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            a.i(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        return super.onLevelChange(i10);
    }

    public void setChangingConfigurations(int i10) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            drawable.setChangingConfigurations(i10);
        } else {
            super.setChangingConfigurations(i10);
        }
    }

    public void setColorFilter(int i10, PorterDuff.Mode mode) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            drawable.setColorFilter(i10, mode);
        } else {
            super.setColorFilter(i10, mode);
        }
    }

    public void setFilterBitmap(boolean z10) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            drawable.setFilterBitmap(z10);
        }
    }

    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            a.k(drawable, f10, f11);
        }
    }

    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            a.l(drawable, i10, i11, i12, i13);
        }
    }

    public boolean setState(int[] iArr) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return super.setState(iArr);
    }
}
