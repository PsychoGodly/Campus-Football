package com.applovin.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.applovin.exoplayer2.ui.i;
import com.applovin.impl.a1;
import com.applovin.impl.yp;
import com.applovin.sdk.R;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

public class b extends View implements i {
    private final float A;
    private int B;
    private long C;
    private int D;
    private Rect E;
    private ValueAnimator F;
    private float G;
    private boolean H;
    private boolean I;
    private long J;
    private long K;
    private long L;
    private long M;
    private int N;
    private long[] O;
    private boolean[] P;

    /* renamed from: a  reason: collision with root package name */
    private final Rect f6132a;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f6133b;

    /* renamed from: c  reason: collision with root package name */
    private final Rect f6134c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f6135d;

    /* renamed from: f  reason: collision with root package name */
    private final Paint f6136f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f6137g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f6138h;

    /* renamed from: i  reason: collision with root package name */
    private final Paint f6139i;

    /* renamed from: j  reason: collision with root package name */
    private final Paint f6140j;

    /* renamed from: k  reason: collision with root package name */
    private final Paint f6141k;

    /* renamed from: l  reason: collision with root package name */
    private final Drawable f6142l;

    /* renamed from: m  reason: collision with root package name */
    private final int f6143m;

    /* renamed from: n  reason: collision with root package name */
    private final int f6144n;

    /* renamed from: o  reason: collision with root package name */
    private final int f6145o;

    /* renamed from: p  reason: collision with root package name */
    private final int f6146p;

    /* renamed from: q  reason: collision with root package name */
    private final int f6147q;

    /* renamed from: r  reason: collision with root package name */
    private final int f6148r;

    /* renamed from: s  reason: collision with root package name */
    private final int f6149s;

    /* renamed from: t  reason: collision with root package name */
    private final int f6150t;

    /* renamed from: u  reason: collision with root package name */
    private final int f6151u;

    /* renamed from: v  reason: collision with root package name */
    private final StringBuilder f6152v;

    /* renamed from: w  reason: collision with root package name */
    private final Formatter f6153w;

    /* renamed from: x  reason: collision with root package name */
    private final Runnable f6154x;

    /* renamed from: y  reason: collision with root package name */
    private final CopyOnWriteArraySet f6155y;

    /* renamed from: z  reason: collision with root package name */
    private final Point f6156z;

    public b(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        this(context, attributeSet, i10, attributeSet2, 0);
    }

    private static int a(float f10, int i10) {
        return (int) ((((float) i10) * f10) + 0.5f);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        a(false);
    }

    private static int b(float f10, int i10) {
        return (int) (((float) i10) / f10);
    }

    private void b(long j10) {
        this.J = j10;
        this.I = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f6155y.iterator();
        while (it.hasNext()) {
            ((i.a) it.next()).a(this, j10);
        }
    }

    private void c(long j10) {
        if (this.J != j10) {
            this.J = j10;
            Iterator it = this.f6155y.iterator();
            while (it.hasNext()) {
                ((i.a) it.next()).b(this, j10);
            }
        }
    }

    private long getPositionIncrement() {
        long j10 = this.C;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = this.K;
        if (j11 == -9223372036854775807L) {
            return 0;
        }
        return j11 / ((long) this.B);
    }

    private String getProgressText() {
        return yp.a(this.f6152v, this.f6153w, this.L);
    }

    private long getScrubberPosition() {
        if (this.f6133b.width() <= 0 || this.K == -9223372036854775807L) {
            return 0;
        }
        return (((long) this.f6135d.width()) * this.K) / ((long) this.f6133b.width());
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        c();
    }

    public long getPreferredUpdateDelay() {
        int b10 = b(this.A, this.f6133b.width());
        if (b10 != 0) {
            long j10 = this.K;
            if (!(j10 == 0 || j10 == -9223372036854775807L)) {
                return j10 / ((long) b10);
            }
        }
        return Long.MAX_VALUE;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f6142l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onDraw(Canvas canvas) {
        canvas.save();
        b(canvas);
        a(canvas);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.I && !z10) {
            a(false);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.K > 0) {
            if (yp.f13662a >= 21) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
                return;
            }
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (a(r0) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        removeCallbacks(r4.f6154x);
        postDelayed(r4.f6154x, 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x0030
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L_0x0027
            switch(r5) {
                case 21: goto L_0x0013;
                case 22: goto L_0x0014;
                case 23: goto L_0x0027;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0030
        L_0x0013:
            long r0 = -r0
        L_0x0014:
            boolean r0 = r4.a((long) r0)
            if (r0 == 0) goto L_0x0030
            java.lang.Runnable r5 = r4.f6154x
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f6154x
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L_0x0027:
            boolean r0 = r4.I
            if (r0 == 0) goto L_0x0030
            r5 = 0
            r4.a((boolean) r5)
            return r3
        L_0x0030:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.b.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i16 - getPaddingRight();
        int i18 = this.H ? 0 : this.f6150t;
        if (this.f6145o == 1) {
            i15 = (i17 - getPaddingBottom()) - this.f6144n;
            int i19 = this.f6143m;
            i14 = ((i17 - getPaddingBottom()) - i19) - Math.max(i18 - (i19 / 2), 0);
        } else {
            i15 = (i17 - this.f6144n) / 2;
            i14 = (i17 - this.f6143m) / 2;
        }
        this.f6132a.set(paddingLeft, i15, paddingRight, this.f6144n + i15);
        Rect rect = this.f6133b;
        Rect rect2 = this.f6132a;
        rect.set(rect2.left + i18, i14, rect2.right - i18, this.f6143m + i14);
        if (yp.f13662a >= 29) {
            a(i16, i17);
        }
        b();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            size = this.f6144n;
        } else if (mode != 1073741824) {
            size = Math.min(this.f6144n, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        c();
    }

    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f6142l;
        if (drawable != null && a(drawable, i10)) {
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r3 != 3) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x0076
            long r2 = r7.K
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0010
            goto L_0x0076
        L_0x0010:
            android.graphics.Point r0 = r7.a((android.view.MotionEvent) r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L_0x005d
            r5 = 3
            if (r3 == r4) goto L_0x004e
            r6 = 2
            if (r3 == r6) goto L_0x0028
            if (r3 == r5) goto L_0x004e
            goto L_0x0076
        L_0x0028:
            boolean r8 = r7.I
            if (r8 == 0) goto L_0x0076
            int r8 = r7.f6151u
            if (r0 >= r8) goto L_0x003a
            int r8 = r7.D
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.a((float) r8)
            goto L_0x0040
        L_0x003a:
            r7.D = r2
            float r8 = (float) r2
            r7.a((float) r8)
        L_0x0040:
            long r0 = r7.getScrubberPosition()
            r7.c(r0)
            r7.b()
            r7.invalidate()
            return r4
        L_0x004e:
            boolean r0 = r7.I
            if (r0 == 0) goto L_0x0076
            int r8 = r8.getAction()
            if (r8 != r5) goto L_0x0059
            r1 = 1
        L_0x0059:
            r7.a((boolean) r1)
            return r4
        L_0x005d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.a((float) r8, (float) r0)
            if (r0 == 0) goto L_0x0076
            r7.a((float) r8)
            long r0 = r7.getScrubberPosition()
            r7.b((long) r0)
            r7.b()
            r7.invalidate()
            return r4
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.K <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (a(-getPositionIncrement())) {
                a(false);
            }
        } else if (i10 != 4096) {
            return false;
        } else {
            if (a(getPositionIncrement())) {
                a(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i10) {
        this.f6139i.setColor(i10);
        invalidate(this.f6132a);
    }

    public void setBufferedColor(int i10) {
        this.f6137g.setColor(i10);
        invalidate(this.f6132a);
    }

    public void setBufferedPosition(long j10) {
        if (this.M != j10) {
            this.M = j10;
            b();
        }
    }

    public void setDuration(long j10) {
        if (this.K != j10) {
            this.K = j10;
            if (this.I && j10 == -9223372036854775807L) {
                a(true);
            }
            b();
        }
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (this.I && !z10) {
            a(true);
        }
    }

    public void setKeyCountIncrement(int i10) {
        a1.a(i10 > 0);
        this.B = i10;
        this.C = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j10) {
        a1.a(j10 > 0);
        this.B = -1;
        this.C = j10;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.f6140j.setColor(i10);
        invalidate(this.f6132a);
    }

    public void setPlayedColor(int i10) {
        this.f6136f.setColor(i10);
        invalidate(this.f6132a);
    }

    public void setPosition(long j10) {
        if (this.L != j10) {
            this.L = j10;
            setContentDescription(getProgressText());
            b();
        }
    }

    public void setScrubberColor(int i10) {
        this.f6141k.setColor(i10);
        invalidate(this.f6132a);
    }

    public void setUnplayedColor(int i10) {
        this.f6138h.setColor(i10);
        invalidate(this.f6132a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2, int i11) {
        super(context, attributeSet, i10);
        AttributeSet attributeSet3 = attributeSet2;
        this.f6132a = new Rect();
        this.f6133b = new Rect();
        this.f6134c = new Rect();
        this.f6135d = new Rect();
        Paint paint = new Paint();
        this.f6136f = paint;
        Paint paint2 = new Paint();
        this.f6137g = paint2;
        Paint paint3 = new Paint();
        this.f6138h = paint3;
        Paint paint4 = new Paint();
        this.f6139i = paint4;
        Paint paint5 = new Paint();
        this.f6140j = paint5;
        Paint paint6 = new Paint();
        this.f6141k = paint6;
        paint6.setAntiAlias(true);
        this.f6155y = new CopyOnWriteArraySet();
        this.f6156z = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.A = f10;
        this.f6151u = a(f10, -50);
        int a10 = a(f10, 4);
        int a11 = a(f10, 26);
        int a12 = a(f10, 4);
        int a13 = a(f10, 12);
        int a14 = a(f10, 0);
        int a15 = a(f10, 16);
        if (attributeSet3 != null) {
            Paint paint7 = paint4;
            Paint paint8 = paint5;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet3, R.styleable.AppLovinDefaultTimeBar, i10, i11);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.AppLovinDefaultTimeBar_al_scrubber_drawable);
                this.f6142l = drawable;
                if (drawable != null) {
                    a(drawable);
                    a11 = Math.max(drawable.getMinimumHeight(), a11);
                }
                this.f6143m = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_bar_height, a10);
                this.f6144n = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_touch_target_height, a11);
                this.f6145o = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_bar_gravity, 0);
                this.f6146p = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_ad_marker_width, a12);
                this.f6147q = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_enabled_size, a13);
                this.f6148r = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_disabled_size, a14);
                this.f6149s = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_dragged_size, a15);
                int i12 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_played_color, -1);
                int i13 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_scrubber_color, -1);
                int i14 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_buffered_color, -855638017);
                int i15 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_unplayed_color, 872415231);
                int i16 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_ad_marker_color, -1291845888);
                int i17 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_played_ad_marker_color, 872414976);
                paint.setColor(i12);
                paint6.setColor(i13);
                paint2.setColor(i14);
                paint3.setColor(i15);
                paint7.setColor(i16);
                paint8.setColor(i17);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.f6143m = a10;
            this.f6144n = a11;
            this.f6145o = 0;
            this.f6146p = a12;
            this.f6147q = a13;
            this.f6148r = a14;
            this.f6149s = a15;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f6142l = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f6152v = sb2;
        this.f6153w = new Formatter(sb2, Locale.getDefault());
        this.f6154x = new l(this);
        Drawable drawable2 = this.f6142l;
        if (drawable2 != null) {
            this.f6150t = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f6150t = (Math.max(this.f6148r, Math.max(this.f6147q, this.f6149s)) + 1) / 2;
        }
        this.G = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.F = valueAnimator;
        valueAnimator.addUpdateListener(new k(this));
        this.K = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.B = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ValueAnimator valueAnimator) {
        this.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f6132a);
    }

    public void a(i.a aVar) {
        a1.a((Object) aVar);
        this.f6155y.add(aVar);
    }

    private void c() {
        Drawable drawable = this.f6142l;
        if (drawable != null && drawable.isStateful() && this.f6142l.setState(getDrawableState())) {
            invalidate();
        }
    }

    public void a(long[] jArr, boolean[] zArr, int i10) {
        a1.a(i10 == 0 || !(jArr == null || zArr == null));
        this.N = i10;
        this.O = jArr;
        this.P = zArr;
        b();
    }

    private void b() {
        this.f6134c.set(this.f6133b);
        this.f6135d.set(this.f6133b);
        long j10 = this.I ? this.J : this.L;
        if (this.K > 0) {
            int width = (int) ((((long) this.f6133b.width()) * this.M) / this.K);
            Rect rect = this.f6134c;
            Rect rect2 = this.f6133b;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((((long) this.f6133b.width()) * j10) / this.K);
            Rect rect3 = this.f6135d;
            Rect rect4 = this.f6133b;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.f6134c;
            int i10 = this.f6133b.left;
            rect5.right = i10;
            this.f6135d.right = i10;
        }
        invalidate(this.f6132a);
    }

    private void a(boolean z10) {
        removeCallbacks(this.f6154x);
        this.I = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f6155y.iterator();
        while (it.hasNext()) {
            ((i.a) it.next()).a(this, this.J, z10);
        }
    }

    private boolean a(long j10) {
        long j11 = this.K;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.I ? this.J : this.L;
        long b10 = yp.b(j12 + j10, 0, j11);
        if (b10 == j12) {
            return false;
        }
        if (!this.I) {
            b(b10);
        } else {
            c(b10);
        }
        b();
        return true;
    }

    private void b(Canvas canvas) {
        int height = this.f6133b.height();
        int centerY = this.f6133b.centerY() - (height / 2);
        int i10 = height + centerY;
        if (this.K <= 0) {
            Rect rect = this.f6133b;
            canvas.drawRect((float) rect.left, (float) centerY, (float) rect.right, (float) i10, this.f6138h);
            return;
        }
        Rect rect2 = this.f6134c;
        int i11 = rect2.left;
        int i12 = rect2.right;
        int max = Math.max(Math.max(this.f6133b.left, i12), this.f6135d.right);
        int i13 = this.f6133b.right;
        if (max < i13) {
            canvas.drawRect((float) max, (float) centerY, (float) i13, (float) i10, this.f6138h);
        }
        int max2 = Math.max(i11, this.f6135d.right);
        if (i12 > max2) {
            canvas.drawRect((float) max2, (float) centerY, (float) i12, (float) i10, this.f6137g);
        }
        if (this.f6135d.width() > 0) {
            Rect rect3 = this.f6135d;
            canvas.drawRect((float) rect3.left, (float) centerY, (float) rect3.right, (float) i10, this.f6136f);
        }
        if (this.N != 0) {
            long[] jArr = (long[]) a1.a((Object) this.O);
            boolean[] zArr = (boolean[]) a1.a((Object) this.P);
            int i14 = this.f6146p / 2;
            for (int i15 = 0; i15 < this.N; i15++) {
                long b10 = yp.b(jArr[i15], 0, this.K);
                Rect rect4 = this.f6133b;
                int min = rect4.left + Math.min(rect4.width() - this.f6146p, Math.max(0, ((int) ((((long) this.f6133b.width()) * b10) / this.K)) - i14));
                canvas.drawRect((float) min, (float) centerY, (float) (min + this.f6146p), (float) i10, zArr[i15] ? this.f6140j : this.f6139i);
            }
        }
    }

    private void a(float f10) {
        Rect rect = this.f6135d;
        Rect rect2 = this.f6133b;
        rect.right = yp.a((int) f10, rect2.left, rect2.right);
    }

    private Point a(MotionEvent motionEvent) {
        this.f6156z.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f6156z;
    }

    private boolean a(float f10, float f11) {
        return this.f6132a.contains((int) f10, (int) f11);
    }

    private void a(Canvas canvas) {
        int i10;
        if (this.K > 0) {
            Rect rect = this.f6135d;
            int a10 = yp.a(rect.right, rect.left, this.f6133b.right);
            int centerY = this.f6135d.centerY();
            Drawable drawable = this.f6142l;
            if (drawable == null) {
                if (this.I || isFocused()) {
                    i10 = this.f6149s;
                } else {
                    i10 = isEnabled() ? this.f6147q : this.f6148r;
                }
                canvas.drawCircle((float) a10, (float) centerY, (float) ((int) ((((float) i10) * this.G) / 2.0f)), this.f6141k);
                return;
            }
            int intrinsicWidth = ((int) (((float) drawable.getIntrinsicWidth()) * this.G)) / 2;
            int intrinsicHeight = ((int) (((float) this.f6142l.getIntrinsicHeight()) * this.G)) / 2;
            this.f6142l.setBounds(a10 - intrinsicWidth, centerY - intrinsicHeight, a10 + intrinsicWidth, centerY + intrinsicHeight);
            this.f6142l.draw(canvas);
        }
    }

    private void a(int i10, int i11) {
        Rect rect = this.E;
        if (rect == null || rect.width() != i10 || this.E.height() != i11) {
            Rect rect2 = new Rect(0, 0, i10, i11);
            this.E = rect2;
            setSystemGestureExclusionRects(Collections.singletonList(rect2));
        }
    }

    private boolean a(Drawable drawable) {
        return yp.f13662a >= 23 && a(drawable, getLayoutDirection());
    }

    private static boolean a(Drawable drawable, int i10) {
        return yp.f13662a >= 23 && drawable.setLayoutDirection(i10);
    }
}
