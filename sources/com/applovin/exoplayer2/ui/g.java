package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.applovin.impl.a1;
import com.applovin.impl.v2;
import com.applovin.impl.yp;
import com.applovin.impl.z4;

final class g {
    private int A;
    private int B;
    private int C;
    private int D;
    private StaticLayout E;
    private StaticLayout F;
    private int G;
    private int H;
    private int I;
    private Rect J;

    /* renamed from: a  reason: collision with root package name */
    private final float f6228a;

    /* renamed from: b  reason: collision with root package name */
    private final float f6229b;

    /* renamed from: c  reason: collision with root package name */
    private final float f6230c;

    /* renamed from: d  reason: collision with root package name */
    private final float f6231d;

    /* renamed from: e  reason: collision with root package name */
    private final float f6232e;

    /* renamed from: f  reason: collision with root package name */
    private final TextPaint f6233f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f6234g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f6235h;

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f6236i;

    /* renamed from: j  reason: collision with root package name */
    private Layout.Alignment f6237j;

    /* renamed from: k  reason: collision with root package name */
    private Bitmap f6238k;

    /* renamed from: l  reason: collision with root package name */
    private float f6239l;

    /* renamed from: m  reason: collision with root package name */
    private int f6240m;

    /* renamed from: n  reason: collision with root package name */
    private int f6241n;

    /* renamed from: o  reason: collision with root package name */
    private float f6242o;

    /* renamed from: p  reason: collision with root package name */
    private int f6243p;

    /* renamed from: q  reason: collision with root package name */
    private float f6244q;

    /* renamed from: r  reason: collision with root package name */
    private float f6245r;

    /* renamed from: s  reason: collision with root package name */
    private int f6246s;

    /* renamed from: t  reason: collision with root package name */
    private int f6247t;

    /* renamed from: u  reason: collision with root package name */
    private int f6248u;

    /* renamed from: v  reason: collision with root package name */
    private int f6249v;

    /* renamed from: w  reason: collision with root package name */
    private int f6250w;

    /* renamed from: x  reason: collision with root package name */
    private float f6251x;

    /* renamed from: y  reason: collision with root package name */
    private float f6252y;

    /* renamed from: z  reason: collision with root package name */
    private float f6253z;

    public g(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{16843287, 16843288}, 0, 0);
        this.f6232e = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f6231d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = (float) Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) * 2.0f) / 160.0f);
        this.f6228a = round;
        this.f6229b = round;
        this.f6230c = round;
        TextPaint textPaint = new TextPaint();
        this.f6233f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f6234g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f6235h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
            r26 = this;
            r0 = r26
            java.lang.CharSequence r1 = r0.f6236i
            boolean r2 = r1 instanceof android.text.SpannableStringBuilder
            if (r2 == 0) goto L_0x000b
            android.text.SpannableStringBuilder r1 = (android.text.SpannableStringBuilder) r1
            goto L_0x0012
        L_0x000b:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r2 = r0.f6236i
            r1.<init>(r2)
        L_0x0012:
            int r2 = r0.C
            int r3 = r0.A
            int r2 = r2 - r3
            int r3 = r0.D
            int r4 = r0.B
            int r11 = r3 - r4
            android.text.TextPaint r3 = r0.f6233f
            float r4 = r0.f6251x
            r3.setTextSize(r4)
            float r3 = r0.f6251x
            r4 = 1040187392(0x3e000000, float:0.125)
            float r3 = r3 * r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r12 = (int) r3
            int r13 = r12 * 2
            int r3 = r2 - r13
            float r4 = r0.f6244q
            r14 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r5 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x003f
            float r3 = (float) r3
            float r3 = r3 * r4
            int r3 = (int) r3
        L_0x003f:
            r15 = r3
            java.lang.String r10 = "SubtitlePainter"
            if (r15 > 0) goto L_0x004a
            java.lang.String r1 = "Skipped drawing subtitle cue (insufficient space)"
            com.applovin.impl.kc.d(r10, r1)
            return
        L_0x004a:
            float r3 = r0.f6252y
            r16 = 0
            r4 = 16711680(0xff0000, float:2.3418052E-38)
            r9 = 0
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x0064
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan
            float r5 = r0.f6252y
            int r5 = (int) r5
            r3.<init>(r5)
            int r5 = r1.length()
            r1.setSpan(r3, r9, r5, r4)
        L_0x0064:
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>(r1)
            int r3 = r0.f6250w
            r7 = 1
            if (r3 != r7) goto L_0x0087
            int r3 = r8.length()
            java.lang.Class<android.text.style.ForegroundColorSpan> r5 = android.text.style.ForegroundColorSpan.class
            java.lang.Object[] r3 = r8.getSpans(r9, r3, r5)
            android.text.style.ForegroundColorSpan[] r3 = (android.text.style.ForegroundColorSpan[]) r3
            int r5 = r3.length
            r6 = 0
        L_0x007c:
            if (r6 >= r5) goto L_0x0087
            r7 = r3[r6]
            r8.removeSpan(r7)
            int r6 = r6 + 1
            r7 = 1
            goto L_0x007c
        L_0x0087:
            int r3 = r0.f6247t
            int r3 = android.graphics.Color.alpha(r3)
            r7 = 2
            if (r3 <= 0) goto L_0x00b4
            int r3 = r0.f6250w
            if (r3 == 0) goto L_0x00a6
            if (r3 != r7) goto L_0x0097
            goto L_0x00a6
        L_0x0097:
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            int r5 = r0.f6247t
            r3.<init>(r5)
            int r5 = r8.length()
            r8.setSpan(r3, r9, r5, r4)
            goto L_0x00b4
        L_0x00a6:
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            int r5 = r0.f6247t
            r3.<init>(r5)
            int r5 = r1.length()
            r1.setSpan(r3, r9, r5, r4)
        L_0x00b4:
            android.text.Layout$Alignment r3 = r0.f6237j
            if (r3 != 0) goto L_0x00ba
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x00ba:
            r21 = r3
            android.text.StaticLayout r6 = new android.text.StaticLayout
            android.text.TextPaint r5 = r0.f6233f
            float r4 = r0.f6231d
            float r3 = r0.f6232e
            r18 = 1
            r19 = r3
            r3 = r6
            r20 = r4
            r4 = r1
            r14 = r6
            r6 = r15
            r7 = r21
            r23 = r8
            r8 = r20
            r25 = r12
            r12 = 0
            r9 = r19
            r12 = r10
            r10 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.E = r14
            int r3 = r14.getHeight()
            android.text.StaticLayout r4 = r0.E
            int r4 = r4.getLineCount()
            r5 = 0
            r9 = 0
        L_0x00ed:
            if (r9 >= r4) goto L_0x0102
            android.text.StaticLayout r6 = r0.E
            float r6 = r6.getLineWidth(r9)
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            int r5 = java.lang.Math.max(r6, r5)
            int r9 = r9 + 1
            goto L_0x00ed
        L_0x0102:
            float r4 = r0.f6244q
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x010e
            if (r5 >= r15) goto L_0x010e
            goto L_0x010f
        L_0x010e:
            r15 = r5
        L_0x010f:
            int r15 = r15 + r13
            float r4 = r0.f6242o
            int r5 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x013b
            float r2 = (float) r2
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            int r4 = r0.A
            int r2 = r2 + r4
            int r5 = r0.f6243p
            r6 = 1
            r7 = 2
            if (r5 == r6) goto L_0x012b
            if (r5 == r7) goto L_0x0129
            goto L_0x012f
        L_0x0129:
            int r2 = r2 - r15
            goto L_0x012f
        L_0x012b:
            int r2 = r2 * 2
            int r2 = r2 - r15
            int r2 = r2 / r7
        L_0x012f:
            int r2 = java.lang.Math.max(r2, r4)
            int r15 = r15 + r2
            int r4 = r0.C
            int r4 = java.lang.Math.min(r15, r4)
            goto L_0x0144
        L_0x013b:
            r6 = 1
            r7 = 2
            int r2 = r2 - r15
            int r2 = r2 / r7
            int r4 = r0.A
            int r2 = r2 + r4
            int r4 = r2 + r15
        L_0x0144:
            int r20 = r4 - r2
            if (r20 > 0) goto L_0x014e
            java.lang.String r1 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            com.applovin.impl.kc.d(r12, r1)
            return
        L_0x014e:
            float r4 = r0.f6239l
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x01ad
            int r5 = r0.f6240m
            if (r5 != 0) goto L_0x0171
            float r5 = (float) r11
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r5 = r0.B
            int r4 = r4 + r5
            int r5 = r0.f6241n
            if (r5 != r7) goto L_0x016a
            goto L_0x019d
        L_0x016a:
            if (r5 != r6) goto L_0x019e
            int r4 = r4 * 2
            int r4 = r4 - r3
            int r4 = r4 / r7
            goto L_0x019e
        L_0x0171:
            android.text.StaticLayout r4 = r0.E
            r5 = 0
            int r4 = r4.getLineBottom(r5)
            android.text.StaticLayout r6 = r0.E
            int r5 = r6.getLineTop(r5)
            int r4 = r4 - r5
            float r5 = r0.f6239l
            int r6 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r6 < 0) goto L_0x0190
            float r4 = (float) r4
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r5 = r0.B
            int r4 = r4 + r5
            goto L_0x019e
        L_0x0190:
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r6
            float r4 = (float) r4
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r5 = r0.D
            int r4 = r4 + r5
        L_0x019d:
            int r4 = r4 - r3
        L_0x019e:
            int r5 = r4 + r3
            int r6 = r0.D
            if (r5 <= r6) goto L_0x01a7
            int r4 = r6 - r3
            goto L_0x01b7
        L_0x01a7:
            int r3 = r0.B
            if (r4 >= r3) goto L_0x01b7
            r11 = r3
            goto L_0x01b8
        L_0x01ad:
            int r4 = r0.D
            int r4 = r4 - r3
            float r3 = (float) r11
            float r5 = r0.f6253z
            float r3 = r3 * r5
            int r3 = (int) r3
            int r4 = r4 - r3
        L_0x01b7:
            r11 = r4
        L_0x01b8:
            android.text.StaticLayout r12 = new android.text.StaticLayout
            android.text.TextPaint r5 = r0.f6233f
            float r8 = r0.f6231d
            float r9 = r0.f6232e
            r10 = 1
            r3 = r12
            r4 = r1
            r6 = r20
            r7 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.E = r12
            android.text.StaticLayout r1 = new android.text.StaticLayout
            android.text.TextPaint r3 = r0.f6233f
            float r4 = r0.f6231d
            float r5 = r0.f6232e
            r24 = 1
            r17 = r1
            r18 = r23
            r19 = r3
            r22 = r4
            r23 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r0.F = r1
            r0.G = r2
            r0.H = r11
            r1 = r25
            r0.I = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.g.b():void");
    }

    public void a(z4 z4Var, v2 v2Var, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        boolean z10 = z4Var.f13755d == null;
        int i14 = -16777216;
        if (z10) {
            if (!TextUtils.isEmpty(z4Var.f13752a)) {
                i14 = z4Var.f13763m ? z4Var.f13764n : v2Var.f12660c;
            } else {
                return;
            }
        }
        if (a(this.f6236i, z4Var.f13752a) && yp.a((Object) this.f6237j, (Object) z4Var.f13753b) && this.f6238k == z4Var.f13755d && this.f6239l == z4Var.f13756f && this.f6240m == z4Var.f13757g && yp.a((Object) Integer.valueOf(this.f6241n), (Object) Integer.valueOf(z4Var.f13758h)) && this.f6242o == z4Var.f13759i && yp.a((Object) Integer.valueOf(this.f6243p), (Object) Integer.valueOf(z4Var.f13760j)) && this.f6244q == z4Var.f13761k && this.f6245r == z4Var.f13762l && this.f6246s == v2Var.f12658a && this.f6247t == v2Var.f12659b && this.f6248u == i14 && this.f6250w == v2Var.f12661d && this.f6249v == v2Var.f12662e && yp.a((Object) this.f6233f.getTypeface(), (Object) v2Var.f12663f) && this.f6251x == f10 && this.f6252y == f11 && this.f6253z == f12 && this.A == i10 && this.B == i11 && this.C == i12 && this.D == i13) {
            a(canvas, z10);
            return;
        }
        this.f6236i = z4Var.f13752a;
        this.f6237j = z4Var.f13753b;
        this.f6238k = z4Var.f13755d;
        this.f6239l = z4Var.f13756f;
        this.f6240m = z4Var.f13757g;
        this.f6241n = z4Var.f13758h;
        this.f6242o = z4Var.f13759i;
        this.f6243p = z4Var.f13760j;
        this.f6244q = z4Var.f13761k;
        this.f6245r = z4Var.f13762l;
        this.f6246s = v2Var.f12658a;
        this.f6247t = v2Var.f12659b;
        this.f6248u = i14;
        this.f6250w = v2Var.f12661d;
        this.f6249v = v2Var.f12662e;
        this.f6233f.setTypeface(v2Var.f12663f);
        this.f6251x = f10;
        this.f6252y = f11;
        this.f6253z = f12;
        this.A = i10;
        this.B = i11;
        this.C = i12;
        this.D = i13;
        if (z10) {
            a1.a((Object) this.f6236i);
            b();
        } else {
            a1.a((Object) this.f6238k);
            a();
        }
        a(canvas, z10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f6238k
            int r1 = r7.C
            int r2 = r7.A
            int r1 = r1 - r2
            int r3 = r7.D
            int r4 = r7.B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f6242o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f6239l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f6244q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f6245r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0032
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            goto L_0x0044
        L_0x0032:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
        L_0x0044:
            int r3 = r7.f6243p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L_0x004d
            float r3 = (float) r1
        L_0x004b:
            float r2 = r2 - r3
            goto L_0x0053
        L_0x004d:
            if (r3 != r5) goto L_0x0053
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L_0x004b
        L_0x0053:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f6241n
            if (r3 != r6) goto L_0x005e
            float r3 = (float) r0
        L_0x005c:
            float r4 = r4 - r3
            goto L_0x0064
        L_0x005e:
            if (r3 != r5) goto L_0x0064
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L_0x005c
        L_0x0064:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.g.a():void");
    }

    private void a(Canvas canvas, boolean z10) {
        if (z10) {
            b(canvas);
            return;
        }
        a1.a((Object) this.J);
        a1.a((Object) this.f6238k);
        a(canvas);
    }

    private void a(Canvas canvas) {
        canvas.drawBitmap(this.f6238k, (Rect) null, this.J, this.f6235h);
    }

    private void b(Canvas canvas) {
        int i10;
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout != null && staticLayout2 != null) {
            int save = canvas.save();
            canvas.translate((float) this.G, (float) this.H);
            if (Color.alpha(this.f6248u) > 0) {
                this.f6234g.setColor(this.f6248u);
                canvas.drawRect((float) (-this.I), 0.0f, (float) (staticLayout.getWidth() + this.I), (float) staticLayout.getHeight(), this.f6234g);
            }
            int i11 = this.f6250w;
            boolean z10 = true;
            if (i11 == 1) {
                this.f6233f.setStrokeJoin(Paint.Join.ROUND);
                this.f6233f.setStrokeWidth(this.f6228a);
                this.f6233f.setColor(this.f6249v);
                this.f6233f.setStyle(Paint.Style.FILL_AND_STROKE);
                staticLayout2.draw(canvas);
            } else if (i11 == 2) {
                TextPaint textPaint = this.f6233f;
                float f10 = this.f6229b;
                float f11 = this.f6230c;
                textPaint.setShadowLayer(f10, f11, f11, this.f6249v);
            } else if (i11 == 3 || i11 == 4) {
                if (i11 != 3) {
                    z10 = false;
                }
                int i12 = -1;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = this.f6249v;
                }
                if (z10) {
                    i12 = this.f6249v;
                }
                float f12 = this.f6229b / 2.0f;
                this.f6233f.setColor(this.f6246s);
                this.f6233f.setStyle(Paint.Style.FILL);
                float f13 = -f12;
                this.f6233f.setShadowLayer(this.f6229b, f13, f13, i10);
                staticLayout2.draw(canvas);
                this.f6233f.setShadowLayer(this.f6229b, f12, f12, i12);
            }
            this.f6233f.setColor(this.f6246s);
            this.f6233f.setStyle(Paint.Style.FILL);
            staticLayout.draw(canvas);
            this.f6233f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            canvas.restoreToCount(save);
        }
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }
}
