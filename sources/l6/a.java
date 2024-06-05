package l6;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import n6.g;
import n6.k;
import n6.n;

/* compiled from: RippleDrawableCompat */
public class a extends Drawable implements n, androidx.core.graphics.drawable.b {

    /* renamed from: a  reason: collision with root package name */
    private b f29178a;

    /* renamed from: a */
    public a mutate() {
        this.f29178a = new b(this.f29178a);
        return this;
    }

    public void draw(Canvas canvas) {
        b bVar = this.f29178a;
        if (bVar.f29180b) {
            bVar.f29179a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f29178a;
    }

    public int getOpacity() {
        return this.f29178a.f29179a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f29178a.f29179a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f29178a.f29179a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b10 = b.b(iArr);
        b bVar = this.f29178a;
        if (bVar.f29180b == b10) {
            return onStateChange;
        }
        bVar.f29180b = b10;
        return true;
    }

    public void setAlpha(int i10) {
        this.f29178a.f29179a.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f29178a.f29179a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f29178a.f29179a.setShapeAppearanceModel(kVar);
    }

    public void setTint(int i10) {
        this.f29178a.f29179a.setTint(i10);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f29178a.f29179a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f29178a.f29179a.setTintMode(mode);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    /* compiled from: RippleDrawableCompat */
    static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        g f29179a;

        /* renamed from: b  reason: collision with root package name */
        boolean f29180b;

        public b(g gVar) {
            this.f29179a = gVar;
            this.f29180b = false;
        }

        /* renamed from: a */
        public a newDrawable() {
            return new a(new b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f29179a = (g) bVar.f29179a.getConstantState().newDrawable();
            this.f29180b = bVar.f29180b;
        }
    }

    private a(b bVar) {
        this.f29178a = bVar;
    }
}
