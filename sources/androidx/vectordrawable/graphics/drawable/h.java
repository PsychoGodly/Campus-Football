package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import androidx.core.graphics.e;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VectorDrawableCompat */
public class h extends g {

    /* renamed from: l  reason: collision with root package name */
    static final PorterDuff.Mode f4890l = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    private C0086h f4891b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuffColorFilter f4892c;

    /* renamed from: d  reason: collision with root package name */
    private ColorFilter f4893d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4894f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f4895g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable.ConstantState f4896h;

    /* renamed from: i  reason: collision with root package name */
    private final float[] f4897i;

    /* renamed from: j  reason: collision with root package name */
    private final Matrix f4898j;

    /* renamed from: k  reason: collision with root package name */
    private final Rect f4899k;

    /* compiled from: VectorDrawableCompat */
    private static class b extends f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4926b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f4925a = androidx.core.graphics.e.d(string2);
            }
            this.f4927c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.j(xmlPullParser, "pathData")) {
                TypedArray k10 = k.k(resources, theme, attributeSet, a.f4863d);
                f(k10, xmlPullParser);
                k10.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* compiled from: VectorDrawableCompat */
    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$h  reason: collision with other inner class name */
    /* compiled from: VectorDrawableCompat */
    private static class C0086h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f4946a;

        /* renamed from: b  reason: collision with root package name */
        g f4947b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f4948c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f4949d;

        /* renamed from: e  reason: collision with root package name */
        boolean f4950e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f4951f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f4952g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f4953h;

        /* renamed from: i  reason: collision with root package name */
        int f4954i;

        /* renamed from: j  reason: collision with root package name */
        boolean f4955j;

        /* renamed from: k  reason: collision with root package name */
        boolean f4956k;

        /* renamed from: l  reason: collision with root package name */
        Paint f4957l;

        public C0086h(C0086h hVar) {
            this.f4948c = null;
            this.f4949d = h.f4890l;
            if (hVar != null) {
                this.f4946a = hVar.f4946a;
                g gVar = new g(hVar.f4947b);
                this.f4947b = gVar;
                if (hVar.f4947b.f4934e != null) {
                    gVar.f4934e = new Paint(hVar.f4947b.f4934e);
                }
                if (hVar.f4947b.f4933d != null) {
                    this.f4947b.f4933d = new Paint(hVar.f4947b.f4933d);
                }
                this.f4948c = hVar.f4948c;
                this.f4949d = hVar.f4949d;
                this.f4950e = hVar.f4950e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f4951f.getWidth() && i11 == this.f4951f.getHeight();
        }

        public boolean b() {
            return !this.f4956k && this.f4952g == this.f4948c && this.f4953h == this.f4949d && this.f4955j == this.f4950e && this.f4954i == this.f4947b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f4951f == null || !a(i10, i11)) {
                this.f4951f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f4956k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f4951f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f4957l == null) {
                Paint paint = new Paint();
                this.f4957l = paint;
                paint.setFilterBitmap(true);
            }
            this.f4957l.setAlpha(this.f4947b.getRootAlpha());
            this.f4957l.setColorFilter(colorFilter);
            return this.f4957l;
        }

        public boolean f() {
            return this.f4947b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f4947b.f();
        }

        public int getChangingConfigurations() {
            return this.f4946a;
        }

        public boolean h(int[] iArr) {
            boolean g10 = this.f4947b.g(iArr);
            this.f4956k |= g10;
            return g10;
        }

        public void i() {
            this.f4952g = this.f4948c;
            this.f4953h = this.f4949d;
            this.f4954i = this.f4947b.getRootAlpha();
            this.f4955j = this.f4950e;
            this.f4956k = false;
        }

        public void j(int i10, int i11) {
            this.f4951f.eraseColor(0);
            this.f4947b.b(new Canvas(this.f4951f), i10, i11, (ColorFilter) null);
        }

        public Drawable newDrawable() {
            return new h(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }

        public C0086h() {
            this.f4948c = null;
            this.f4949d = h.f4890l;
            this.f4947b = new g();
        }
    }

    h() {
        this.f4895g = true;
        this.f4897i = new float[9];
        this.f4898j = new Matrix();
        this.f4899k = new Rect();
        this.f4891b = new C0086h();
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (((float) Color.alpha(i10)) * f10)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.vectordrawable.graphics.drawable.h b(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0023
            androidx.vectordrawable.graphics.drawable.h r0 = new androidx.vectordrawable.graphics.drawable.h
            r0.<init>()
            android.graphics.drawable.Drawable r6 = androidx.core.content.res.h.d(r6, r7, r8)
            r0.f4889a = r6
            androidx.vectordrawable.graphics.drawable.h$i r6 = new androidx.vectordrawable.graphics.drawable.h$i
            android.graphics.drawable.Drawable r7 = r0.f4889a
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            r0.f4896h = r6
            return r0
        L_0x0023:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
        L_0x002b:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            r4 = 2
            if (r3 == r4) goto L_0x0036
            r5 = 1
            if (r3 == r5) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            if (r3 != r4) goto L_0x003d
            androidx.vectordrawable.graphics.drawable.h r6 = c(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            return r6
        L_0x003d:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            throw r6     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
        L_0x0045:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            goto L_0x004e
        L_0x004a:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L_0x004e:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.h.b(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.vectordrawable.graphics.drawable.h");
    }

    public static h c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = new h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C0086h hVar = this.f4891b;
        g gVar = hVar.f4947b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f4937h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4913b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f4945p.put(cVar.getPathName(), cVar);
                    }
                    z10 = false;
                    hVar.f4946a = cVar.f4928d | hVar.f4946a;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4913b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f4945p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f4946a = bVar.f4928d | hVar.f4946a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4913b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f4945p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f4946a = dVar2.f4922k | hVar.f4946a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        if (Build.VERSION.SDK_INT < 17 || !isAutoMirrored() || androidx.core.graphics.drawable.a.f(this) != 1) {
            return false;
        }
        return true;
    }

    private static PorterDuff.Mode g(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C0086h hVar = this.f4891b;
        g gVar = hVar.f4947b;
        hVar.f4949d = g(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c10 = k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c10 != null) {
            hVar.f4948c = c10;
        }
        hVar.f4950e = k.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f4950e);
        gVar.f4940k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f4940k);
        float f10 = k.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f4941l);
        gVar.f4941l = f10;
        if (gVar.f4940k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f10 > 0.0f) {
            gVar.f4938i = typedArray.getDimension(3, gVar.f4938i);
            float dimension = typedArray.getDimension(2, gVar.f4939j);
            gVar.f4939j = dimension;
            if (gVar.f4938i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f4943n = string;
                    gVar.f4945p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f4889a;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* access modifiers changed from: package-private */
    public Object d(String str) {
        return this.f4891b.f4947b.f4945p.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f4899k);
        if (this.f4899k.width() > 0 && this.f4899k.height() > 0) {
            ColorFilter colorFilter = this.f4893d;
            if (colorFilter == null) {
                colorFilter = this.f4892c;
            }
            canvas.getMatrix(this.f4898j);
            this.f4898j.getValues(this.f4897i);
            float abs = Math.abs(this.f4897i[0]);
            float abs2 = Math.abs(this.f4897i[4]);
            float abs3 = Math.abs(this.f4897i[1]);
            float abs4 = Math.abs(this.f4897i[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f4899k.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f4899k.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f4899k;
                canvas.translate((float) rect.left, (float) rect.top);
                if (f()) {
                    canvas.translate((float) this.f4899k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f4899k.offsetTo(0, 0);
                this.f4891b.c(min, min2);
                if (!this.f4895g) {
                    this.f4891b.j(min, min2);
                } else if (!this.f4891b.b()) {
                    this.f4891b.j(min, min2);
                    this.f4891b.i();
                }
                this.f4891b.d(canvas, colorFilter, this.f4899k);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.f4891b.f4947b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4891b.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.e(drawable);
        }
        return this.f4893d;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f4889a != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f4889a.getConstantState());
        }
        this.f4891b.f4946a = getChangingConfigurations();
        return this.f4891b;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f4891b.f4947b.f4939j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f4891b.f4947b.f4938i;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* access modifiers changed from: package-private */
    public void h(boolean z10) {
        this.f4895g = z10;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return this.f4891b.f4950e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f4891b.f4948c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f4891b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f4889a
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.h$h r0 = r1.f4891b
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.h$h r0 = r1.f4891b
            android.content.res.ColorStateList r0 = r0.f4948c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.h.isStateful():boolean");
    }

    /* access modifiers changed from: package-private */
    public PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4894f && super.mutate() == this) {
            this.f4891b = new C0086h(this.f4891b);
            this.f4894f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z10 = false;
        C0086h hVar = this.f4891b;
        ColorStateList colorStateList = hVar.f4948c;
        if (!(colorStateList == null || (mode = hVar.f4949d) == null)) {
            this.f4892c = j(this.f4892c, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    public void setAlpha(int i10) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f4891b.f4947b.getRootAlpha() != i10) {
            this.f4891b.f4947b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z10);
        } else {
            this.f4891b.f4950e = z10;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i10) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            return;
        }
        C0086h hVar = this.f4891b;
        if (hVar.f4948c != colorStateList) {
            hVar.f4948c = colorStateList;
            this.f4892c = j(this.f4892c, colorStateList, hVar.f4949d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
            return;
        }
        C0086h hVar = this.f4891b;
        if (hVar.f4949d != mode) {
            hVar.f4949d = mode;
            this.f4892c = j(this.f4892c, hVar.f4948c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat */
    private static class i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f4958a;

        public i(Drawable.ConstantState constantState) {
            this.f4958a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f4958a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f4958a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            h hVar = new h();
            hVar.f4889a = (VectorDrawable) this.f4958a.newDrawable();
            return hVar;
        }

        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.f4889a = (VectorDrawable) this.f4958a.newDrawable(resources);
            return hVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.f4889a = (VectorDrawable) this.f4958a.newDrawable(resources, theme);
            return hVar;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f4893d = colorFilter;
        invalidateSelf();
    }

    /* compiled from: VectorDrawableCompat */
    private static abstract class f extends e {

        /* renamed from: a  reason: collision with root package name */
        protected e.b[] f4925a = null;

        /* renamed from: b  reason: collision with root package name */
        String f4926b;

        /* renamed from: c  reason: collision with root package name */
        int f4927c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f4928d;

        public f() {
            super();
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            e.b[] bVarArr = this.f4925a;
            if (bVarArr != null) {
                e.b.e(bVarArr, path);
            }
        }

        public e.b[] getPathData() {
            return this.f4925a;
        }

        public String getPathName() {
            return this.f4926b;
        }

        public void setPathData(e.b[] bVarArr) {
            if (!androidx.core.graphics.e.b(this.f4925a, bVarArr)) {
                this.f4925a = androidx.core.graphics.e.f(bVarArr);
            } else {
                androidx.core.graphics.e.j(this.f4925a, bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f4926b = fVar.f4926b;
            this.f4928d = fVar.f4928d;
            this.f4925a = androidx.core.graphics.e.f(fVar.f4925a);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0086h hVar = this.f4891b;
        hVar.f4947b = new g();
        TypedArray k10 = k.k(resources, theme, attributeSet, a.f4860a);
        i(k10, xmlPullParser, theme);
        k10.recycle();
        hVar.f4946a = getChangingConfigurations();
        hVar.f4956k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f4892c = j(this.f4892c, hVar.f4948c, hVar.f4949d);
    }

    h(C0086h hVar) {
        this.f4895g = true;
        this.f4897i = new float[9];
        this.f4898j = new Matrix();
        this.f4899k = new Rect();
        this.f4891b = hVar;
        this.f4892c = j(this.f4892c, hVar.f4948c, hVar.f4949d);
    }

    /* compiled from: VectorDrawableCompat */
    private static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private int[] f4900e;

        /* renamed from: f  reason: collision with root package name */
        androidx.core.content.res.d f4901f;

        /* renamed from: g  reason: collision with root package name */
        float f4902g = 0.0f;

        /* renamed from: h  reason: collision with root package name */
        androidx.core.content.res.d f4903h;

        /* renamed from: i  reason: collision with root package name */
        float f4904i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        float f4905j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        float f4906k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        float f4907l = 1.0f;

        /* renamed from: m  reason: collision with root package name */
        float f4908m = 0.0f;

        /* renamed from: n  reason: collision with root package name */
        Paint.Cap f4909n = Paint.Cap.BUTT;

        /* renamed from: o  reason: collision with root package name */
        Paint.Join f4910o = Paint.Join.MITER;

        /* renamed from: p  reason: collision with root package name */
        float f4911p = 4.0f;

        c() {
        }

        private Paint.Cap e(int i10, Paint.Cap cap) {
            if (i10 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i10 != 1) {
                return i10 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join f(int i10, Paint.Join join) {
            if (i10 == 0) {
                return Paint.Join.MITER;
            }
            if (i10 != 1) {
                return i10 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f4900e = null;
            if (k.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f4926b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f4925a = androidx.core.graphics.e.d(string2);
                }
                Resources.Theme theme2 = theme;
                this.f4903h = k.e(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f4905j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f4905j);
                this.f4909n = e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f4909n);
                this.f4910o = f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f4910o);
                this.f4911p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f4911p);
                this.f4901f = k.e(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f4904i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f4904i);
                this.f4902g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f4902g);
                this.f4907l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f4907l);
                this.f4908m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f4908m);
                this.f4906k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f4906k);
                this.f4927c = k.g(typedArray, xmlPullParser, "fillType", 13, this.f4927c);
            }
        }

        public boolean a() {
            return this.f4903h.i() || this.f4901f.i();
        }

        public boolean b(int[] iArr) {
            return this.f4901f.j(iArr) | this.f4903h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k10 = k.k(resources, theme, attributeSet, a.f4862c);
            h(k10, xmlPullParser, theme);
            k10.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f4905j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f4903h.e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f4904i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f4901f.e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f4902g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f4907l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f4908m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f4906k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f10) {
            this.f4905j = f10;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i10) {
            this.f4903h.k(i10);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f10) {
            this.f4904i = f10;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i10) {
            this.f4901f.k(i10);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f10) {
            this.f4902g = f10;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f10) {
            this.f4907l = f10;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f10) {
            this.f4908m = f10;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f10) {
            this.f4906k = f10;
        }

        c(c cVar) {
            super(cVar);
            this.f4900e = cVar.f4900e;
            this.f4901f = cVar.f4901f;
            this.f4902g = cVar.f4902g;
            this.f4904i = cVar.f4904i;
            this.f4903h = cVar.f4903h;
            this.f4927c = cVar.f4927c;
            this.f4905j = cVar.f4905j;
            this.f4906k = cVar.f4906k;
            this.f4907l = cVar.f4907l;
            this.f4908m = cVar.f4908m;
            this.f4909n = cVar.f4909n;
            this.f4910o = cVar.f4910o;
            this.f4911p = cVar.f4911p;
        }
    }

    /* compiled from: VectorDrawableCompat */
    private static class g {

        /* renamed from: q  reason: collision with root package name */
        private static final Matrix f4929q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        private final Path f4930a;

        /* renamed from: b  reason: collision with root package name */
        private final Path f4931b;

        /* renamed from: c  reason: collision with root package name */
        private final Matrix f4932c;

        /* renamed from: d  reason: collision with root package name */
        Paint f4933d;

        /* renamed from: e  reason: collision with root package name */
        Paint f4934e;

        /* renamed from: f  reason: collision with root package name */
        private PathMeasure f4935f;

        /* renamed from: g  reason: collision with root package name */
        private int f4936g;

        /* renamed from: h  reason: collision with root package name */
        final d f4937h;

        /* renamed from: i  reason: collision with root package name */
        float f4938i;

        /* renamed from: j  reason: collision with root package name */
        float f4939j;

        /* renamed from: k  reason: collision with root package name */
        float f4940k;

        /* renamed from: l  reason: collision with root package name */
        float f4941l;

        /* renamed from: m  reason: collision with root package name */
        int f4942m;

        /* renamed from: n  reason: collision with root package name */
        String f4943n;

        /* renamed from: o  reason: collision with root package name */
        Boolean f4944o;

        /* renamed from: p  reason: collision with root package name */
        final androidx.collection.a<String, Object> f4945p;

        public g() {
            this.f4932c = new Matrix();
            this.f4938i = 0.0f;
            this.f4939j = 0.0f;
            this.f4940k = 0.0f;
            this.f4941l = 0.0f;
            this.f4942m = 255;
            this.f4943n = null;
            this.f4944o = null;
            this.f4945p = new androidx.collection.a<>();
            this.f4937h = new d();
            this.f4930a = new Path();
            this.f4931b = new Path();
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            dVar.f4912a.set(matrix);
            dVar.f4912a.preConcat(dVar.f4921j);
            canvas.save();
            for (int i12 = 0; i12 < dVar.f4913b.size(); i12++) {
                e eVar = dVar.f4913b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f4912a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i10, i11, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = ((float) i10) / this.f4940k;
            float f11 = ((float) i11) / this.f4941l;
            float min = Math.min(f10, f11);
            Matrix matrix = dVar.f4912a;
            this.f4932c.set(matrix);
            this.f4932c.postScale(f10, f11);
            float e10 = e(matrix);
            if (e10 != 0.0f) {
                fVar.d(this.f4930a);
                Path path = this.f4930a;
                this.f4931b.reset();
                if (fVar.c()) {
                    this.f4931b.setFillType(fVar.f4927c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f4931b.addPath(path, this.f4932c);
                    canvas.clipPath(this.f4931b);
                    return;
                }
                c cVar = (c) fVar;
                float f12 = cVar.f4906k;
                if (!(f12 == 0.0f && cVar.f4907l == 1.0f)) {
                    float f13 = cVar.f4908m;
                    float f14 = (f12 + f13) % 1.0f;
                    float f15 = (cVar.f4907l + f13) % 1.0f;
                    if (this.f4935f == null) {
                        this.f4935f = new PathMeasure();
                    }
                    this.f4935f.setPath(this.f4930a, false);
                    float length = this.f4935f.getLength();
                    float f16 = f14 * length;
                    float f17 = f15 * length;
                    path.reset();
                    if (f16 > f17) {
                        this.f4935f.getSegment(f16, length, path, true);
                        this.f4935f.getSegment(0.0f, f17, path, true);
                    } else {
                        this.f4935f.getSegment(f16, f17, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f4931b.addPath(path, this.f4932c);
                if (cVar.f4903h.l()) {
                    androidx.core.content.res.d dVar2 = cVar.f4903h;
                    if (this.f4934e == null) {
                        Paint paint = new Paint(1);
                        this.f4934e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f4934e;
                    if (dVar2.h()) {
                        Shader f18 = dVar2.f();
                        f18.setLocalMatrix(this.f4932c);
                        paint2.setShader(f18);
                        paint2.setAlpha(Math.round(cVar.f4905j * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(h.a(dVar2.e(), cVar.f4905j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f4931b.setFillType(cVar.f4927c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f4931b, paint2);
                }
                if (cVar.f4901f.l()) {
                    androidx.core.content.res.d dVar3 = cVar.f4901f;
                    if (this.f4933d == null) {
                        Paint paint3 = new Paint(1);
                        this.f4933d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f4933d;
                    Paint.Join join = cVar.f4910o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f4909n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f4911p);
                    if (dVar3.h()) {
                        Shader f19 = dVar3.f();
                        f19.setLocalMatrix(this.f4932c);
                        paint4.setShader(f19);
                        paint4.setAlpha(Math.round(cVar.f4904i * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(h.a(dVar3.e(), cVar.f4904i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f4902g * min * e10);
                    canvas.drawPath(this.f4931b, paint4);
                }
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a10 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a10) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f4937h, f4929q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f4944o == null) {
                this.f4944o = Boolean.valueOf(this.f4937h.a());
            }
            return this.f4944o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f4937h.b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f4942m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f4942m = i10;
        }

        public g(g gVar) {
            this.f4932c = new Matrix();
            this.f4938i = 0.0f;
            this.f4939j = 0.0f;
            this.f4940k = 0.0f;
            this.f4941l = 0.0f;
            this.f4942m = 255;
            this.f4943n = null;
            this.f4944o = null;
            androidx.collection.a<String, Object> aVar = new androidx.collection.a<>();
            this.f4945p = aVar;
            this.f4937h = new d(gVar.f4937h, aVar);
            this.f4930a = new Path(gVar.f4930a);
            this.f4931b = new Path(gVar.f4931b);
            this.f4938i = gVar.f4938i;
            this.f4939j = gVar.f4939j;
            this.f4940k = gVar.f4940k;
            this.f4941l = gVar.f4941l;
            this.f4936g = gVar.f4936g;
            this.f4942m = gVar.f4942m;
            this.f4943n = gVar.f4943n;
            String str = gVar.f4943n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f4944o = gVar.f4944o;
        }
    }

    /* compiled from: VectorDrawableCompat */
    private static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final Matrix f4912a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<e> f4913b;

        /* renamed from: c  reason: collision with root package name */
        float f4914c;

        /* renamed from: d  reason: collision with root package name */
        private float f4915d;

        /* renamed from: e  reason: collision with root package name */
        private float f4916e;

        /* renamed from: f  reason: collision with root package name */
        private float f4917f;

        /* renamed from: g  reason: collision with root package name */
        private float f4918g;

        /* renamed from: h  reason: collision with root package name */
        private float f4919h;

        /* renamed from: i  reason: collision with root package name */
        private float f4920i;

        /* renamed from: j  reason: collision with root package name */
        final Matrix f4921j;

        /* renamed from: k  reason: collision with root package name */
        int f4922k;

        /* renamed from: l  reason: collision with root package name */
        private int[] f4923l;

        /* renamed from: m  reason: collision with root package name */
        private String f4924m;

        public d(d dVar, androidx.collection.a<String, Object> aVar) {
            super();
            f fVar;
            this.f4912a = new Matrix();
            this.f4913b = new ArrayList<>();
            this.f4914c = 0.0f;
            this.f4915d = 0.0f;
            this.f4916e = 0.0f;
            this.f4917f = 1.0f;
            this.f4918g = 1.0f;
            this.f4919h = 0.0f;
            this.f4920i = 0.0f;
            Matrix matrix = new Matrix();
            this.f4921j = matrix;
            this.f4924m = null;
            this.f4914c = dVar.f4914c;
            this.f4915d = dVar.f4915d;
            this.f4916e = dVar.f4916e;
            this.f4917f = dVar.f4917f;
            this.f4918g = dVar.f4918g;
            this.f4919h = dVar.f4919h;
            this.f4920i = dVar.f4920i;
            this.f4923l = dVar.f4923l;
            String str = dVar.f4924m;
            this.f4924m = str;
            this.f4922k = dVar.f4922k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f4921j);
            ArrayList<e> arrayList = dVar.f4913b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f4913b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        fVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f4913b.add(fVar);
                    String str2 = fVar.f4926b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        private void d() {
            this.f4921j.reset();
            this.f4921j.postTranslate(-this.f4915d, -this.f4916e);
            this.f4921j.postScale(this.f4917f, this.f4918g);
            this.f4921j.postRotate(this.f4914c, 0.0f, 0.0f);
            this.f4921j.postTranslate(this.f4919h + this.f4915d, this.f4920i + this.f4916e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f4923l = null;
            this.f4914c = k.f(typedArray, xmlPullParser, "rotation", 5, this.f4914c);
            this.f4915d = typedArray.getFloat(1, this.f4915d);
            this.f4916e = typedArray.getFloat(2, this.f4916e);
            this.f4917f = k.f(typedArray, xmlPullParser, "scaleX", 3, this.f4917f);
            this.f4918g = k.f(typedArray, xmlPullParser, "scaleY", 4, this.f4918g);
            this.f4919h = k.f(typedArray, xmlPullParser, "translateX", 6, this.f4919h);
            this.f4920i = k.f(typedArray, xmlPullParser, "translateY", 7, this.f4920i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4924m = string;
            }
            d();
        }

        public boolean a() {
            for (int i10 = 0; i10 < this.f4913b.size(); i10++) {
                if (this.f4913b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        public boolean b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f4913b.size(); i10++) {
                z10 |= this.f4913b.get(i10).b(iArr);
            }
            return z10;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k10 = k.k(resources, theme, attributeSet, a.f4861b);
            e(k10, xmlPullParser);
            k10.recycle();
        }

        public String getGroupName() {
            return this.f4924m;
        }

        public Matrix getLocalMatrix() {
            return this.f4921j;
        }

        public float getPivotX() {
            return this.f4915d;
        }

        public float getPivotY() {
            return this.f4916e;
        }

        public float getRotation() {
            return this.f4914c;
        }

        public float getScaleX() {
            return this.f4917f;
        }

        public float getScaleY() {
            return this.f4918g;
        }

        public float getTranslateX() {
            return this.f4919h;
        }

        public float getTranslateY() {
            return this.f4920i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f4915d) {
                this.f4915d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f4916e) {
                this.f4916e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f4914c) {
                this.f4914c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f4917f) {
                this.f4917f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f4918g) {
                this.f4918g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f4919h) {
                this.f4919h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f4920i) {
                this.f4920i = f10;
                d();
            }
        }

        public d() {
            super();
            this.f4912a = new Matrix();
            this.f4913b = new ArrayList<>();
            this.f4914c = 0.0f;
            this.f4915d = 0.0f;
            this.f4916e = 0.0f;
            this.f4917f = 1.0f;
            this.f4918g = 1.0f;
            this.f4919h = 0.0f;
            this.f4920i = 0.0f;
            this.f4921j = new Matrix();
            this.f4924m = null;
        }
    }
}
