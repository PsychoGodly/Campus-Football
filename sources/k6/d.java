package k6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.h;
import x5.k;

/* compiled from: TextAppearance */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final float f29118a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f29119b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f29120c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f29121d;

    /* renamed from: e  reason: collision with root package name */
    public final int f29122e;

    /* renamed from: f  reason: collision with root package name */
    public final int f29123f;

    /* renamed from: g  reason: collision with root package name */
    public final String f29124g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f29125h;

    /* renamed from: i  reason: collision with root package name */
    public final ColorStateList f29126i;

    /* renamed from: j  reason: collision with root package name */
    public final float f29127j;

    /* renamed from: k  reason: collision with root package name */
    public final float f29128k;

    /* renamed from: l  reason: collision with root package name */
    public final float f29129l;

    /* renamed from: m  reason: collision with root package name */
    private final int f29130m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f29131n = false;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public Typeface f29132o;

    /* compiled from: TextAppearance */
    class a extends h.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f29133a;

        a(f fVar) {
            this.f29133a = fVar;
        }

        public void h(int i10) {
            boolean unused = d.this.f29131n = true;
            this.f29133a.a(i10);
        }

        public void i(Typeface typeface) {
            d dVar = d.this;
            Typeface unused = dVar.f29132o = Typeface.create(typeface, dVar.f29122e);
            boolean unused2 = d.this.f29131n = true;
            this.f29133a.b(d.this.f29132o, false);
        }
    }

    /* compiled from: TextAppearance */
    class b extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextPaint f29135a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f29136b;

        b(TextPaint textPaint, f fVar) {
            this.f29135a = textPaint;
            this.f29136b = fVar;
        }

        public void a(int i10) {
            this.f29136b.a(i10);
        }

        public void b(Typeface typeface, boolean z10) {
            d.this.k(this.f29135a, typeface);
            this.f29136b.b(typeface, z10);
        }
    }

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, k.Z2);
        this.f29118a = obtainStyledAttributes.getDimension(k.f30868a3, 0.0f);
        this.f29119b = c.a(context, obtainStyledAttributes, k.f30886d3);
        this.f29120c = c.a(context, obtainStyledAttributes, k.f30892e3);
        this.f29121d = c.a(context, obtainStyledAttributes, k.f30898f3);
        this.f29122e = obtainStyledAttributes.getInt(k.f30880c3, 0);
        this.f29123f = obtainStyledAttributes.getInt(k.f30874b3, 1);
        int e10 = c.e(obtainStyledAttributes, k.f30934l3, k.f30928k3);
        this.f29130m = obtainStyledAttributes.getResourceId(e10, 0);
        this.f29124g = obtainStyledAttributes.getString(e10);
        this.f29125h = obtainStyledAttributes.getBoolean(k.f30940m3, false);
        this.f29126i = c.a(context, obtainStyledAttributes, k.f30904g3);
        this.f29127j = obtainStyledAttributes.getFloat(k.f30910h3, 0.0f);
        this.f29128k = obtainStyledAttributes.getFloat(k.f30916i3, 0.0f);
        this.f29129l = obtainStyledAttributes.getFloat(k.f30922j3, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private void d() {
        String str;
        if (this.f29132o == null && (str = this.f29124g) != null) {
            this.f29132o = Typeface.create(str, this.f29122e);
        }
        if (this.f29132o == null) {
            int i10 = this.f29123f;
            if (i10 == 1) {
                this.f29132o = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f29132o = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f29132o = Typeface.DEFAULT;
            } else {
                this.f29132o = Typeface.MONOSPACE;
            }
            this.f29132o = Typeface.create(this.f29132o, this.f29122e);
        }
    }

    public Typeface e() {
        d();
        return this.f29132o;
    }

    public Typeface f(Context context) {
        if (this.f29131n) {
            return this.f29132o;
        }
        if (!context.isRestricted()) {
            try {
                Typeface f10 = h.f(context, this.f29130m);
                this.f29132o = f10;
                if (f10 != null) {
                    this.f29132o = Typeface.create(f10, this.f29122e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f29124g, e10);
            }
        }
        d();
        this.f29131n = true;
        return this.f29132o;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        k(textPaint, e());
        h(context, new b(textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (e.a()) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f29130m;
        if (i10 == 0) {
            this.f29131n = true;
        }
        if (this.f29131n) {
            fVar.b(this.f29132o, true);
            return;
        }
        try {
            h.h(context, i10, new a(fVar), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f29131n = true;
            fVar.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f29124g, e10);
            this.f29131n = true;
            fVar.a(-3);
        }
    }

    public void i(Context context, TextPaint textPaint, f fVar) {
        j(context, textPaint, fVar);
        ColorStateList colorStateList = this.f29119b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f29129l;
        float f11 = this.f29127j;
        float f12 = this.f29128k;
        ColorStateList colorStateList2 = this.f29126i;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void j(Context context, TextPaint textPaint, f fVar) {
        if (e.a()) {
            k(textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void k(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f29122e;
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f29118a);
    }
}
