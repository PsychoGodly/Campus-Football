package r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import q.b;
import q.d;
import q.e;

/* compiled from: CardView */
public class a extends FrameLayout {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f21836i = {16842801};

    /* renamed from: j  reason: collision with root package name */
    private static final f f21837j;

    /* renamed from: a  reason: collision with root package name */
    private boolean f21838a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f21839b;

    /* renamed from: c  reason: collision with root package name */
    int f21840c;

    /* renamed from: d  reason: collision with root package name */
    int f21841d;

    /* renamed from: f  reason: collision with root package name */
    final Rect f21842f;

    /* renamed from: g  reason: collision with root package name */
    final Rect f21843g;

    /* renamed from: h  reason: collision with root package name */
    private final e f21844h;

    /* renamed from: r.a$a  reason: collision with other inner class name */
    /* compiled from: CardView */
    class C0226a implements e {

        /* renamed from: a  reason: collision with root package name */
        private Drawable f21845a;

        C0226a() {
        }

        public void a(int i10, int i11) {
            a aVar = a.this;
            if (i10 > aVar.f21840c) {
                a.super.setMinimumWidth(i10);
            }
            a aVar2 = a.this;
            if (i11 > aVar2.f21841d) {
                a.super.setMinimumHeight(i11);
            }
        }

        public void b(int i10, int i11, int i12, int i13) {
            a.this.f21843g.set(i10, i11, i12, i13);
            a aVar = a.this;
            Rect rect = aVar.f21842f;
            a.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        public void c(Drawable drawable) {
            this.f21845a = drawable;
            a.this.setBackgroundDrawable(drawable);
        }

        public boolean d() {
            return a.this.getPreventCornerOverlap();
        }

        public boolean e() {
            return a.this.getUseCompatPadding();
        }

        public Drawable f() {
            return this.f21845a;
        }

        public View g() {
            return a.this;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            f21837j = new c();
        } else if (i10 >= 17) {
            f21837j = new b();
        } else {
            f21837j = new d();
        }
        f21837j.l();
    }

    public a(Context context) {
        this(context, (AttributeSet) null);
    }

    public ColorStateList getCardBackgroundColor() {
        return f21837j.c(this.f21844h);
    }

    public float getCardElevation() {
        return f21837j.d(this.f21844h);
    }

    public int getContentPaddingBottom() {
        return this.f21842f.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f21842f.left;
    }

    public int getContentPaddingRight() {
        return this.f21842f.right;
    }

    public int getContentPaddingTop() {
        return this.f21842f.top;
    }

    public float getMaxCardElevation() {
        return f21837j.g(this.f21844h);
    }

    public boolean getPreventCornerOverlap() {
        return this.f21839b;
    }

    public float getRadius() {
        return f21837j.k(this.f21844h);
    }

    public boolean getUseCompatPadding() {
        return this.f21838a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        f fVar = f21837j;
        if (!(fVar instanceof c)) {
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) fVar.h(this.f21844h)), View.MeasureSpec.getSize(i10)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) fVar.b(this.f21844h)), View.MeasureSpec.getSize(i11)), mode2);
            }
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f21837j.n(this.f21844h, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f21837j.e(this.f21844h, f10);
    }

    public void setMaxCardElevation(float f10) {
        f21837j.m(this.f21844h, f10);
    }

    public void setMinimumHeight(int i10) {
        this.f21841d = i10;
        super.setMinimumHeight(i10);
    }

    public void setMinimumWidth(int i10) {
        this.f21840c = i10;
        super.setMinimumWidth(i10);
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f21839b) {
            this.f21839b = z10;
            f21837j.f(this.f21844h);
        }
    }

    public void setRadius(float f10) {
        f21837j.j(this.f21844h, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f21838a != z10) {
            this.f21838a = z10;
            f21837j.i(this.f21844h);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q.a.cardViewStyle);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f21837j.n(this.f21844h, colorStateList);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int i11;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f21842f = rect;
        this.f21843g = new Rect();
        C0226a aVar = new C0226a();
        this.f21844h = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f21715a, i10, d.CardView);
        int i12 = e.f21718d;
        if (obtainStyledAttributes.hasValue(i12)) {
            valueOf = obtainStyledAttributes.getColorStateList(i12);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f21836i);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i11 = getResources().getColor(b.cardview_light_background);
            } else {
                i11 = getResources().getColor(b.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(i11);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(e.f21719e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(e.f21720f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(e.f21721g, 0.0f);
        this.f21838a = obtainStyledAttributes.getBoolean(e.f21723i, false);
        this.f21839b = obtainStyledAttributes.getBoolean(e.f21722h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(e.f21724j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(e.f21726l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(e.f21728n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(e.f21727m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(e.f21725k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f21840c = obtainStyledAttributes.getDimensionPixelSize(e.f21716b, 0);
        this.f21841d = obtainStyledAttributes.getDimensionPixelSize(e.f21717c, 0);
        obtainStyledAttributes.recycle();
        f21837j.a(aVar, context, colorStateList, dimension, dimension2, f10);
    }
}
