package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: WrappedDrawableState */
final class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    int f2926a;

    /* renamed from: b  reason: collision with root package name */
    Drawable.ConstantState f2927b;

    /* renamed from: c  reason: collision with root package name */
    ColorStateList f2928c = null;

    /* renamed from: d  reason: collision with root package name */
    PorterDuff.Mode f2929d = d.f2918h;

    f(f fVar) {
        if (fVar != null) {
            this.f2926a = fVar.f2926a;
            this.f2927b = fVar.f2927b;
            this.f2928c = fVar.f2928c;
            this.f2929d = fVar.f2929d;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f2927b != null;
    }

    public int getChangingConfigurations() {
        int i10 = this.f2926a;
        Drawable.ConstantState constantState = this.f2927b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new e(this, resources);
        }
        return new d(this, resources);
    }
}
