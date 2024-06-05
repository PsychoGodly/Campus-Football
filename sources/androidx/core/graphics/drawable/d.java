package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* compiled from: WrappedDrawableApi14 */
class d extends Drawable implements Drawable.Callback, c, b {

    /* renamed from: h  reason: collision with root package name */
    static final PorterDuff.Mode f2918h = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    private int f2919a;

    /* renamed from: b  reason: collision with root package name */
    private PorterDuff.Mode f2920b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2921c;

    /* renamed from: d  reason: collision with root package name */
    f f2922d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2923f;

    /* renamed from: g  reason: collision with root package name */
    Drawable f2924g;

    d(f fVar, Resources resources) {
        this.f2922d = fVar;
        e(resources);
    }

    private f d() {
        return new f(this.f2922d);
    }

    private void e(Resources resources) {
        Drawable.ConstantState constantState;
        f fVar = this.f2922d;
        if (fVar != null && (constantState = fVar.f2927b) != null) {
            a(constantState.newDrawable(resources));
        }
    }

    private boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        f fVar = this.f2922d;
        ColorStateList colorStateList = fVar.f2928c;
        PorterDuff.Mode mode = fVar.f2929d;
        if (colorStateList == null || mode == null) {
            this.f2921c = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f2921c && colorForState == this.f2919a && mode == this.f2920b)) {
                setColorFilter(colorForState, mode);
                this.f2919a = colorForState;
                this.f2920b = mode;
                this.f2921c = true;
                return true;
            }
        }
        return false;
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f2924g;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f2924g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.f2922d;
            if (fVar != null) {
                fVar.f2927b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final Drawable b() {
        return this.f2924g;
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f2924g.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.f2922d;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f2924g.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        f fVar = this.f2922d;
        if (fVar == null || !fVar.a()) {
            return null;
        }
        this.f2922d.f2926a = getChangingConfigurations();
        return this.f2922d;
    }

    public Drawable getCurrent() {
        return this.f2924g.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f2924g.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2924g.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return a.f(this.f2924g);
    }

    public int getMinimumHeight() {
        return this.f2924g.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f2924g.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f2924g.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f2924g.getPadding(rect);
    }

    public int[] getState() {
        return this.f2924g.getState();
    }

    public Region getTransparentRegion() {
        return this.f2924g.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.h(this.f2924g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f2922d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.c()
            if (r0 == 0) goto L_0x000d
            androidx.core.graphics.drawable.f r0 = r1.f2922d
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f2928c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f2924g
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.d.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f2924g.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f2923f && super.mutate() == this) {
            this.f2922d = d();
            Drawable drawable = this.f2924g;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.f2922d;
            if (fVar != null) {
                Drawable drawable2 = this.f2924g;
                fVar.f2927b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2923f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2924g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i10) {
        return a.m(this.f2924g, i10);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        return this.f2924g.setLevel(i10);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public void setAlpha(int i10) {
        this.f2924g.setAlpha(i10);
    }

    public void setAutoMirrored(boolean z10) {
        a.j(this.f2924g, z10);
    }

    public void setChangingConfigurations(int i10) {
        this.f2924g.setChangingConfigurations(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2924g.setColorFilter(colorFilter);
    }

    public void setDither(boolean z10) {
        this.f2924g.setDither(z10);
    }

    public void setFilterBitmap(boolean z10) {
        this.f2924g.setFilterBitmap(z10);
    }

    public boolean setState(int[] iArr) {
        return f(iArr) || this.f2924g.setState(iArr);
    }

    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f2922d.f2928c = colorStateList;
        f(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f2922d.f2929d = mode;
        f(getState());
    }

    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f2924g.setVisible(z10, z11);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    d(Drawable drawable) {
        this.f2922d = d();
        a(drawable);
    }
}
