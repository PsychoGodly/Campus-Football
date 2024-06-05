package n6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import n6.k;
import n6.l;
import n6.m;

/* compiled from: MaterialShapeDrawable */
public class g extends Drawable implements androidx.core.graphics.drawable.b, n {

    /* renamed from: w  reason: collision with root package name */
    private static final Paint f29302w = new Paint(1);

    /* renamed from: a  reason: collision with root package name */
    private c f29303a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final m.g[] f29304b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final m.g[] f29305c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f29306d;

    /* renamed from: f  reason: collision with root package name */
    private final Matrix f29307f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f29308g;

    /* renamed from: h  reason: collision with root package name */
    private final Path f29309h;

    /* renamed from: i  reason: collision with root package name */
    private final RectF f29310i;

    /* renamed from: j  reason: collision with root package name */
    private final RectF f29311j;

    /* renamed from: k  reason: collision with root package name */
    private final Region f29312k;

    /* renamed from: l  reason: collision with root package name */
    private final Region f29313l;

    /* renamed from: m  reason: collision with root package name */
    private k f29314m;

    /* renamed from: n  reason: collision with root package name */
    private final Paint f29315n;

    /* renamed from: o  reason: collision with root package name */
    private final Paint f29316o;

    /* renamed from: p  reason: collision with root package name */
    private final m6.a f29317p;

    /* renamed from: q  reason: collision with root package name */
    private final l.a f29318q;

    /* renamed from: r  reason: collision with root package name */
    private final l f29319r;

    /* renamed from: s  reason: collision with root package name */
    private PorterDuffColorFilter f29320s;

    /* renamed from: t  reason: collision with root package name */
    private PorterDuffColorFilter f29321t;

    /* renamed from: u  reason: collision with root package name */
    private Rect f29322u;

    /* renamed from: v  reason: collision with root package name */
    private final RectF f29323v;

    /* compiled from: MaterialShapeDrawable */
    class a implements l.a {
        a() {
        }

        public void a(m mVar, Matrix matrix, int i10) {
            g.this.f29304b[i10] = mVar.e(matrix);
        }

        public void b(m mVar, Matrix matrix, int i10) {
            g.this.f29305c[i10] = mVar.e(matrix);
        }
    }

    /* compiled from: MaterialShapeDrawable */
    class b implements k.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f29325a;

        b(float f10) {
            this.f29325a = f10;
        }

        public c a(c cVar) {
            return cVar instanceof i ? cVar : new b(this.f29325a, cVar);
        }
    }

    /* synthetic */ g(c cVar, a aVar) {
        this(cVar);
    }

    private float C() {
        if (K()) {
            return this.f29316o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean I() {
        c cVar = this.f29303a;
        int i10 = cVar.f29343q;
        if (i10 == 1 || cVar.f29344r <= 0 || (i10 != 2 && !R())) {
            return false;
        }
        return true;
    }

    private boolean J() {
        Paint.Style style = this.f29303a.f29348v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean K() {
        Paint.Style style = this.f29303a.f29348v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f29316o.getStrokeWidth() > 0.0f;
    }

    private void M() {
        super.invalidateSelf();
    }

    private static int P(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    private void Q(Canvas canvas) {
        int y10 = y();
        int z10 = z();
        if (Build.VERSION.SDK_INT < 21) {
            Rect clipBounds = canvas.getClipBounds();
            int i10 = this.f29303a.f29344r;
            clipBounds.inset(-i10, -i10);
            clipBounds.offset(y10, z10);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate((float) y10, (float) z10);
    }

    private boolean R() {
        return Build.VERSION.SDK_INT < 21 || (!O() && !this.f29308g.isConvex());
    }

    private boolean c0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f29303a.f29330d == null || (color2 = this.f29315n.getColor()) == (colorForState2 = this.f29303a.f29330d.getColorForState(iArr, color2))) {
            z10 = false;
        } else {
            this.f29315n.setColor(colorForState2);
            z10 = true;
        }
        if (this.f29303a.f29331e == null || (color = this.f29316o.getColor()) == (colorForState = this.f29303a.f29331e.getColorForState(iArr, color))) {
            return z10;
        }
        this.f29316o.setColor(colorForState);
        return true;
    }

    private boolean d0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f29320s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f29321t;
        c cVar = this.f29303a;
        this.f29320s = j(cVar.f29333g, cVar.f29334h, this.f29315n, true);
        c cVar2 = this.f29303a;
        this.f29321t = j(cVar2.f29332f, cVar2.f29334h, this.f29316o, false);
        c cVar3 = this.f29303a;
        if (cVar3.f29347u) {
            this.f29317p.d(cVar3.f29333g.getColorForState(getState(), 0));
        }
        if (!androidx.core.util.c.a(porterDuffColorFilter, this.f29320s) || !androidx.core.util.c.a(porterDuffColorFilter2, this.f29321t)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r2 = r2.getColor();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.PorterDuffColorFilter e(android.graphics.Paint r2, boolean r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0014
            int r2 = r2.getColor()
            int r3 = r1.k(r2)
            if (r3 == r2) goto L_0x0014
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r0)
            return r2
        L_0x0014:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.g.e(android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    private void e0() {
        float H = H();
        this.f29303a.f29344r = (int) Math.ceil((double) (0.75f * H));
        this.f29303a.f29345s = (int) Math.ceil((double) (H * 0.25f));
        d0();
        M();
    }

    private void f(RectF rectF, Path path) {
        g(rectF, path);
        if (this.f29303a.f29336j != 1.0f) {
            this.f29307f.reset();
            Matrix matrix = this.f29307f;
            float f10 = this.f29303a.f29336j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f29307f);
        }
        path.computeBounds(this.f29323v, true);
    }

    private void h() {
        k x10 = B().x(new b(-C()));
        this.f29314m = x10;
        this.f29319r.d(x10, this.f29303a.f29337k, u(), this.f29309h);
    }

    private PorterDuffColorFilter i(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = k(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        if (colorStateList == null || mode == null) {
            return e(paint, z10);
        }
        return i(colorStateList, mode, z10);
    }

    private int k(int i10) {
        float H = H() + x();
        g6.a aVar = this.f29303a.f29328b;
        return aVar != null ? aVar.c(i10, H) : i10;
    }

    public static g l(Context context, float f10) {
        int b10 = d6.a.b(context, x5.b.colorSurface, g.class.getSimpleName());
        g gVar = new g();
        gVar.L(context);
        gVar.T(ColorStateList.valueOf(b10));
        gVar.S(f10);
        return gVar;
    }

    private void m(Canvas canvas) {
        if (this.f29303a.f29345s != 0) {
            canvas.drawPath(this.f29308g, this.f29317p.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f29304b[i10].b(this.f29317p, this.f29303a.f29344r, canvas);
            this.f29305c[i10].b(this.f29317p, this.f29303a.f29344r, canvas);
        }
        int y10 = y();
        int z10 = z();
        canvas.translate((float) (-y10), (float) (-z10));
        canvas.drawPath(this.f29308g, f29302w);
        canvas.translate((float) y10, (float) z10);
    }

    private void n(Canvas canvas) {
        p(canvas, this.f29315n, this.f29308g, this.f29303a.f29327a, t());
    }

    private void p(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.u(rectF)) {
            float a10 = kVar.t().a(rectF);
            canvas.drawRoundRect(rectF, a10, a10, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void q(Canvas canvas) {
        p(canvas, this.f29316o, this.f29309h, this.f29314m, u());
    }

    private RectF u() {
        RectF t10 = t();
        float C = C();
        this.f29311j.set(t10.left + C, t10.top + C, t10.right - C, t10.bottom - C);
        return this.f29311j;
    }

    public int A() {
        return this.f29303a.f29344r;
    }

    public k B() {
        return this.f29303a.f29327a;
    }

    public ColorStateList D() {
        return this.f29303a.f29333g;
    }

    public float E() {
        return this.f29303a.f29327a.r().a(t());
    }

    public float F() {
        return this.f29303a.f29327a.t().a(t());
    }

    public float G() {
        return this.f29303a.f29342p;
    }

    public float H() {
        return v() + G();
    }

    public void L(Context context) {
        this.f29303a.f29328b = new g6.a(context);
        e0();
    }

    public boolean N() {
        g6.a aVar = this.f29303a.f29328b;
        return aVar != null && aVar.d();
    }

    public boolean O() {
        return this.f29303a.f29327a.u(t());
    }

    public void S(float f10) {
        c cVar = this.f29303a;
        if (cVar.f29341o != f10) {
            cVar.f29341o = f10;
            e0();
        }
    }

    public void T(ColorStateList colorStateList) {
        c cVar = this.f29303a;
        if (cVar.f29330d != colorStateList) {
            cVar.f29330d = colorStateList;
            onStateChange(getState());
        }
    }

    public void U(float f10) {
        c cVar = this.f29303a;
        if (cVar.f29337k != f10) {
            cVar.f29337k = f10;
            this.f29306d = true;
            invalidateSelf();
        }
    }

    public void V(int i10, int i11, int i12, int i13) {
        c cVar = this.f29303a;
        if (cVar.f29335i == null) {
            cVar.f29335i = new Rect();
        }
        this.f29303a.f29335i.set(i10, i11, i12, i13);
        this.f29322u = this.f29303a.f29335i;
        invalidateSelf();
    }

    public void W(float f10) {
        c cVar = this.f29303a;
        if (cVar.f29340n != f10) {
            cVar.f29340n = f10;
            e0();
        }
    }

    public void X(int i10) {
        c cVar = this.f29303a;
        if (cVar.f29346t != i10) {
            cVar.f29346t = i10;
            M();
        }
    }

    public void Y(float f10, int i10) {
        b0(f10);
        a0(ColorStateList.valueOf(i10));
    }

    public void Z(float f10, ColorStateList colorStateList) {
        b0(f10);
        a0(colorStateList);
    }

    public void a0(ColorStateList colorStateList) {
        c cVar = this.f29303a;
        if (cVar.f29331e != colorStateList) {
            cVar.f29331e = colorStateList;
            onStateChange(getState());
        }
    }

    public void b0(float f10) {
        this.f29303a.f29338l = f10;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f29315n.setColorFilter(this.f29320s);
        int alpha = this.f29315n.getAlpha();
        this.f29315n.setAlpha(P(alpha, this.f29303a.f29339m));
        this.f29316o.setColorFilter(this.f29321t);
        this.f29316o.setStrokeWidth(this.f29303a.f29338l);
        int alpha2 = this.f29316o.getAlpha();
        this.f29316o.setAlpha(P(alpha2, this.f29303a.f29339m));
        if (this.f29306d) {
            h();
            f(t(), this.f29308g);
            this.f29306d = false;
        }
        if (I()) {
            canvas.save();
            Q(canvas);
            int width = (int) (this.f29323v.width() - ((float) getBounds().width()));
            int height = (int) (this.f29323v.height() - ((float) getBounds().height()));
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f29323v.width()) + (this.f29303a.f29344r * 2) + width, ((int) this.f29323v.height()) + (this.f29303a.f29344r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f10 = (float) ((getBounds().left - this.f29303a.f29344r) - width);
            float f11 = (float) ((getBounds().top - this.f29303a.f29344r) - height);
            canvas2.translate(-f10, -f11);
            m(canvas2);
            canvas.drawBitmap(createBitmap, f10, f11, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
        if (J()) {
            n(canvas);
        }
        if (K()) {
            q(canvas);
        }
        this.f29315n.setAlpha(alpha);
        this.f29316o.setAlpha(alpha2);
    }

    /* access modifiers changed from: protected */
    public final void g(RectF rectF, Path path) {
        l lVar = this.f29319r;
        c cVar = this.f29303a;
        k kVar = cVar.f29327a;
        float f10 = cVar.f29337k;
        lVar.e(kVar, f10, rectF, this.f29318q, path);
    }

    public Drawable.ConstantState getConstantState() {
        return this.f29303a;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        if (this.f29303a.f29343q != 2) {
            if (O()) {
                outline.setRoundRect(getBounds(), E());
                return;
            }
            f(t(), this.f29308g);
            if (this.f29308g.isConvex()) {
                outline.setConvexPath(this.f29308g);
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f29322u;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f29312k.set(getBounds());
        f(t(), this.f29308g);
        this.f29313l.setPath(this.f29308g, this.f29312k);
        this.f29312k.op(this.f29313l, Region.Op.DIFFERENCE);
        return this.f29312k;
    }

    public void invalidateSelf() {
        this.f29306d = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f29303a.f29331e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f29303a.f29330d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f29303a.f29333g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f29303a.f29332f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            n6.g$c r0 = r1.f29303a
            android.content.res.ColorStateList r0 = r0.f29333g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            n6.g$c r0 = r1.f29303a
            android.content.res.ColorStateList r0 = r0.f29332f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            n6.g$c r0 = r1.f29303a
            android.content.res.ColorStateList r0 = r0.f29331e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            n6.g$c r0 = r1.f29303a
            android.content.res.ColorStateList r0 = r0.f29330d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.g.isStateful():boolean");
    }

    public Drawable mutate() {
        this.f29303a = new c(this.f29303a);
        return this;
    }

    /* access modifiers changed from: protected */
    public void o(Canvas canvas, Paint paint, Path path, RectF rectF) {
        p(canvas, paint, path, this.f29303a.f29327a, rectF);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f29306d = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z10 = c0(iArr) || d0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public float r() {
        return this.f29303a.f29327a.j().a(t());
    }

    public float s() {
        return this.f29303a.f29327a.l().a(t());
    }

    public void setAlpha(int i10) {
        c cVar = this.f29303a;
        if (cVar.f29339m != i10) {
            cVar.f29339m = i10;
            M();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f29303a.f29329c = colorFilter;
        M();
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f29303a.f29327a = kVar;
        invalidateSelf();
    }

    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f29303a.f29333g = colorStateList;
        d0();
        M();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f29303a;
        if (cVar.f29334h != mode) {
            cVar.f29334h = mode;
            d0();
            M();
        }
    }

    /* access modifiers changed from: protected */
    public RectF t() {
        Rect bounds = getBounds();
        this.f29310i.set((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom);
        return this.f29310i;
    }

    public float v() {
        return this.f29303a.f29341o;
    }

    public ColorStateList w() {
        return this.f29303a.f29330d;
    }

    public float x() {
        return this.f29303a.f29340n;
    }

    public int y() {
        c cVar = this.f29303a;
        return (int) (((double) cVar.f29345s) * Math.sin(Math.toRadians((double) cVar.f29346t)));
    }

    public int z() {
        c cVar = this.f29303a;
        return (int) (((double) cVar.f29345s) * Math.cos(Math.toRadians((double) cVar.f29346t)));
    }

    public g() {
        this(new k());
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(k.e(context, attributeSet, i10, i11).m());
    }

    public g(k kVar) {
        this(new c(kVar, (g6.a) null));
    }

    private g(c cVar) {
        this.f29304b = new m.g[4];
        this.f29305c = new m.g[4];
        this.f29307f = new Matrix();
        this.f29308g = new Path();
        this.f29309h = new Path();
        this.f29310i = new RectF();
        this.f29311j = new RectF();
        this.f29312k = new Region();
        this.f29313l = new Region();
        Paint paint = new Paint(1);
        this.f29315n = paint;
        Paint paint2 = new Paint(1);
        this.f29316o = paint2;
        this.f29317p = new m6.a();
        this.f29319r = new l();
        this.f29323v = new RectF();
        this.f29303a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f29302w;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        d0();
        c0(getState());
        this.f29318q = new a();
    }

    /* compiled from: MaterialShapeDrawable */
    static final class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public k f29327a;

        /* renamed from: b  reason: collision with root package name */
        public g6.a f29328b;

        /* renamed from: c  reason: collision with root package name */
        public ColorFilter f29329c;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f29330d = null;

        /* renamed from: e  reason: collision with root package name */
        public ColorStateList f29331e = null;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f29332f = null;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f29333g = null;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f29334h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i  reason: collision with root package name */
        public Rect f29335i = null;

        /* renamed from: j  reason: collision with root package name */
        public float f29336j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f29337k = 1.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f29338l;

        /* renamed from: m  reason: collision with root package name */
        public int f29339m = 255;

        /* renamed from: n  reason: collision with root package name */
        public float f29340n = 0.0f;

        /* renamed from: o  reason: collision with root package name */
        public float f29341o = 0.0f;

        /* renamed from: p  reason: collision with root package name */
        public float f29342p = 0.0f;

        /* renamed from: q  reason: collision with root package name */
        public int f29343q = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f29344r = 0;

        /* renamed from: s  reason: collision with root package name */
        public int f29345s = 0;

        /* renamed from: t  reason: collision with root package name */
        public int f29346t = 0;

        /* renamed from: u  reason: collision with root package name */
        public boolean f29347u = false;

        /* renamed from: v  reason: collision with root package name */
        public Paint.Style f29348v = Paint.Style.FILL_AND_STROKE;

        public c(k kVar, g6.a aVar) {
            this.f29327a = kVar;
            this.f29328b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            g gVar = new g(this, (a) null);
            boolean unused = gVar.f29306d = true;
            return gVar;
        }

        public c(c cVar) {
            this.f29327a = cVar.f29327a;
            this.f29328b = cVar.f29328b;
            this.f29338l = cVar.f29338l;
            this.f29329c = cVar.f29329c;
            this.f29330d = cVar.f29330d;
            this.f29331e = cVar.f29331e;
            this.f29334h = cVar.f29334h;
            this.f29333g = cVar.f29333g;
            this.f29339m = cVar.f29339m;
            this.f29336j = cVar.f29336j;
            this.f29345s = cVar.f29345s;
            this.f29343q = cVar.f29343q;
            this.f29347u = cVar.f29347u;
            this.f29337k = cVar.f29337k;
            this.f29340n = cVar.f29340n;
            this.f29341o = cVar.f29341o;
            this.f29342p = cVar.f29342p;
            this.f29344r = cVar.f29344r;
            this.f29346t = cVar.f29346t;
            this.f29332f = cVar.f29332f;
            this.f29348v = cVar.f29348v;
            if (cVar.f29335i != null) {
                this.f29335i = new Rect(cVar.f29335i);
            }
        }
    }
}
