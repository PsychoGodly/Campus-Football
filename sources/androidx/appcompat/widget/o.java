package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.core.view.y;
import androidx.core.widget.n;
import h.a;

/* compiled from: AppCompatImageButton */
public class o extends ImageButton implements y, n {

    /* renamed from: a  reason: collision with root package name */
    private final e f1745a;

    /* renamed from: b  reason: collision with root package name */
    private final p f1746b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1747c;

    public o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.C);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1745a;
        if (eVar != null) {
            eVar.b();
        }
        p pVar = this.f1746b;
        if (pVar != null) {
            pVar.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1745a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1745a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        p pVar = this.f1746b;
        if (pVar != null) {
            return pVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        p pVar = this.f1746b;
        if (pVar != null) {
            return pVar.e();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f1746b.f() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1745a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1745a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        p pVar = this.f1746b;
        if (pVar != null) {
            pVar.c();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        p pVar = this.f1746b;
        if (!(pVar == null || drawable == null || this.f1747c)) {
            pVar.h(drawable);
        }
        super.setImageDrawable(drawable);
        p pVar2 = this.f1746b;
        if (pVar2 != null) {
            pVar2.c();
            if (!this.f1747c) {
                this.f1746b.b();
            }
        }
    }

    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f1747c = true;
    }

    public void setImageResource(int i10) {
        this.f1746b.i(i10);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        p pVar = this.f1746b;
        if (pVar != null) {
            pVar.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1745a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1745a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        p pVar = this.f1746b;
        if (pVar != null) {
            pVar.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        p pVar = this.f1746b;
        if (pVar != null) {
            pVar.k(mode);
        }
    }

    public o(Context context, AttributeSet attributeSet, int i10) {
        super(w0.b(context), attributeSet, i10);
        this.f1747c = false;
        u0.a(this, getContext());
        e eVar = new e(this);
        this.f1745a = eVar;
        eVar.e(attributeSet, i10);
        p pVar = new p(this);
        this.f1746b = pVar;
        pVar.g(attributeSet, i10);
    }
}
