package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.h;
import i.a;

/* compiled from: TintTypedArray */
public class z0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1882a;

    /* renamed from: b  reason: collision with root package name */
    private final TypedArray f1883b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f1884c;

    private z0(Context context, TypedArray typedArray) {
        this.f1882a = context;
        this.f1883b = typedArray;
    }

    public static z0 t(Context context, int i10, int[] iArr) {
        return new z0(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static z0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new z0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static z0 v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new z0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f1883b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f1883b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList a10;
        if (!this.f1883b.hasValue(i10) || (resourceId = this.f1883b.getResourceId(i10, 0)) == 0 || (a10 = a.a(this.f1882a, resourceId)) == null) {
            return this.f1883b.getColorStateList(i10);
        }
        return a10;
    }

    public float d(int i10, float f10) {
        return this.f1883b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f1883b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f1883b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        if (!this.f1883b.hasValue(i10) || (resourceId = this.f1883b.getResourceId(i10, 0)) == 0) {
            return this.f1883b.getDrawable(i10);
        }
        return a.b(this.f1882a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.f1883b.hasValue(i10) || (resourceId = this.f1883b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return j.b().d(this.f1882a, resourceId, true);
    }

    public float i(int i10, float f10) {
        return this.f1883b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, h.f fVar) {
        int resourceId = this.f1883b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1884c == null) {
            this.f1884c = new TypedValue();
        }
        return h.g(this.f1882a, resourceId, this.f1884c, i11, fVar);
    }

    public int k(int i10, int i11) {
        return this.f1883b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f1883b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f1883b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f1883b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f1883b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f1883b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f1883b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f1883b;
    }

    public boolean s(int i10) {
        return this.f1883b.hasValue(i10);
    }

    public void w() {
        this.f1883b.recycle();
    }
}
