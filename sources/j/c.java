package j;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

/* compiled from: DrawableWrapperCompat */
public class c extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f19185a;

    public c(Drawable drawable) {
        b(drawable);
    }

    public Drawable a() {
        return this.f19185a;
    }

    public void b(Drawable drawable) {
        Drawable drawable2 = this.f19185a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f19185a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f19185a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f19185a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f19185a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f19185a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f19185a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f19185a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f19185a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f19185a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f19185a.getPadding(rect);
    }

    public int[] getState() {
        return this.f19185a.getState();
    }

    public Region getTransparentRegion() {
        return this.f19185a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.h(this.f19185a);
    }

    public boolean isStateful() {
        return this.f19185a.isStateful();
    }

    public void jumpToCurrentState() {
        this.f19185a.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f19185a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        return this.f19185a.setLevel(i10);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public void setAlpha(int i10) {
        this.f19185a.setAlpha(i10);
    }

    public void setAutoMirrored(boolean z10) {
        a.j(this.f19185a, z10);
    }

    public void setChangingConfigurations(int i10) {
        this.f19185a.setChangingConfigurations(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f19185a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z10) {
        this.f19185a.setDither(z10);
    }

    public void setFilterBitmap(boolean z10) {
        this.f19185a.setFilterBitmap(z10);
    }

    public void setHotspot(float f10, float f11) {
        a.k(this.f19185a, f10, f11);
    }

    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        a.l(this.f19185a, i10, i11, i12, i13);
    }

    public boolean setState(int[] iArr) {
        return this.f19185a.setState(iArr);
    }

    public void setTint(int i10) {
        a.n(this.f19185a, i10);
    }

    public void setTintList(ColorStateList colorStateList) {
        a.o(this.f19185a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        a.p(this.f19185a, mode);
    }

    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f19185a.setVisible(z10, z11);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
