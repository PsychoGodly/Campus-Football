package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.a0;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AutoScrollHelper */
public abstract class a implements View.OnTouchListener {

    /* renamed from: s  reason: collision with root package name */
    private static final int f3277s = ViewConfiguration.getTapTimeout();

    /* renamed from: a  reason: collision with root package name */
    final C0049a f3278a = new C0049a();

    /* renamed from: b  reason: collision with root package name */
    private final Interpolator f3279b = new AccelerateInterpolator();

    /* renamed from: c  reason: collision with root package name */
    final View f3280c;

    /* renamed from: d  reason: collision with root package name */
    private Runnable f3281d;

    /* renamed from: f  reason: collision with root package name */
    private float[] f3282f = {0.0f, 0.0f};

    /* renamed from: g  reason: collision with root package name */
    private float[] f3283g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: h  reason: collision with root package name */
    private int f3284h;

    /* renamed from: i  reason: collision with root package name */
    private int f3285i;

    /* renamed from: j  reason: collision with root package name */
    private float[] f3286j = {0.0f, 0.0f};

    /* renamed from: k  reason: collision with root package name */
    private float[] f3287k = {0.0f, 0.0f};

    /* renamed from: l  reason: collision with root package name */
    private float[] f3288l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: m  reason: collision with root package name */
    private boolean f3289m;

    /* renamed from: n  reason: collision with root package name */
    boolean f3290n;

    /* renamed from: o  reason: collision with root package name */
    boolean f3291o;

    /* renamed from: p  reason: collision with root package name */
    boolean f3292p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f3293q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f3294r;

    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AutoScrollHelper */
    private static class C0049a {

        /* renamed from: a  reason: collision with root package name */
        private int f3295a;

        /* renamed from: b  reason: collision with root package name */
        private int f3296b;

        /* renamed from: c  reason: collision with root package name */
        private float f3297c;

        /* renamed from: d  reason: collision with root package name */
        private float f3298d;

        /* renamed from: e  reason: collision with root package name */
        private long f3299e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        private long f3300f = 0;

        /* renamed from: g  reason: collision with root package name */
        private int f3301g = 0;

        /* renamed from: h  reason: collision with root package name */
        private int f3302h = 0;

        /* renamed from: i  reason: collision with root package name */
        private long f3303i = -1;

        /* renamed from: j  reason: collision with root package name */
        private float f3304j;

        /* renamed from: k  reason: collision with root package name */
        private int f3305k;

        C0049a() {
        }

        private float e(long j10) {
            long j11 = this.f3299e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f3303i;
            if (j12 < 0 || j10 < j12) {
                return a.e(((float) (j10 - j11)) / ((float) this.f3295a), 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f3304j;
            return (1.0f - f10) + (f10 * a.e(((float) (j10 - j12)) / ((float) this.f3305k), 0.0f, 1.0f));
        }

        private float g(float f10) {
            return (-4.0f * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f3300f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g10 = g(e(currentAnimationTimeMillis));
                this.f3300f = currentAnimationTimeMillis;
                float f10 = ((float) (currentAnimationTimeMillis - this.f3300f)) * g10;
                this.f3301g = (int) (this.f3297c * f10);
                this.f3302h = (int) (f10 * this.f3298d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f3301g;
        }

        public int c() {
            return this.f3302h;
        }

        public int d() {
            float f10 = this.f3297c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f3298d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f3303i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f3303i + ((long) this.f3305k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3305k = a.f((int) (currentAnimationTimeMillis - this.f3299e), 0, this.f3296b);
            this.f3304j = e(currentAnimationTimeMillis);
            this.f3303i = currentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f3296b = i10;
        }

        public void k(int i10) {
            this.f3295a = i10;
        }

        public void l(float f10, float f11) {
            this.f3297c = f10;
            this.f3298d = f11;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3299e = currentAnimationTimeMillis;
            this.f3303i = -1;
            this.f3300f = currentAnimationTimeMillis;
            this.f3304j = 0.5f;
            this.f3301g = 0;
            this.f3302h = 0;
        }
    }

    /* compiled from: AutoScrollHelper */
    private class b implements Runnable {
        b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.f3292p) {
                if (aVar.f3290n) {
                    aVar.f3290n = false;
                    aVar.f3278a.m();
                }
                C0049a aVar2 = a.this.f3278a;
                if (aVar2.h() || !a.this.u()) {
                    a.this.f3292p = false;
                    return;
                }
                a aVar3 = a.this;
                if (aVar3.f3291o) {
                    aVar3.f3291o = false;
                    aVar3.c();
                }
                aVar2.a();
                a.this.j(aVar2.b(), aVar2.c());
                a0.f0(a.this.f3280c, this);
            }
        }
    }

    public a(View view) {
        this.f3280c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (float) ((int) ((1575.0f * f10) + 0.5f));
        o(f11, f11);
        float f12 = (float) ((int) ((f10 * 315.0f) + 0.5f));
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f3277s);
        r(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        q(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float h10 = h(this.f3282f[i10], f11, this.f3283g[i10], f10);
        int i11 = (h10 > 0.0f ? 1 : (h10 == 0.0f ? 0 : -1));
        if (i11 == 0) {
            return 0.0f;
        }
        float f13 = this.f3286j[i10];
        float f14 = this.f3287k[i10];
        float f15 = this.f3288l[i10];
        float f16 = f13 * f12;
        if (i11 > 0) {
            return e(h10 * f16, f14, f15);
        }
        return -e((-h10) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f3284h;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                return (!this.f3292p || i10 != 1) ? 0.0f : 1.0f;
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
    }

    private float h(float f10, float f11, float f12, float f13) {
        float f14;
        float e10 = e(f10 * f11, 0.0f, f12);
        float g10 = g(f11 - f13, e10) - g(f13, e10);
        if (g10 < 0.0f) {
            f14 = -this.f3279b.getInterpolation(-g10);
        } else if (g10 <= 0.0f) {
            return 0.0f;
        } else {
            f14 = this.f3279b.getInterpolation(g10);
        }
        return e(f14, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f3290n) {
            this.f3292p = false;
        } else {
            this.f3278a.i();
        }
    }

    private void v() {
        int i10;
        if (this.f3281d == null) {
            this.f3281d = new b();
        }
        this.f3292p = true;
        this.f3290n = true;
        if (this.f3289m || (i10 = this.f3285i) <= 0) {
            this.f3281d.run();
        } else {
            a0.g0(this.f3280c, this.f3281d, (long) i10);
        }
        this.f3289m = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    /* access modifiers changed from: package-private */
    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f3280c.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f3285i = i10;
        return this;
    }

    public a l(int i10) {
        this.f3284h = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f3293q && !z10) {
            i();
        }
        this.f3293q = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f3283g;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f3288l;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f3293q
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.i()
            goto L_0x0058
        L_0x001a:
            r5.f3291o = r2
            r5.f3289m = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f3280c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f3280c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f3278a
            r7.l(r0, r6)
            boolean r6 = r5.f3292p
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.u()
            if (r6 == 0) goto L_0x0058
            r5.v()
        L_0x0058:
            boolean r6 = r5.f3294r
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f3292p
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f3287k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f3278a.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f3278a.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f3282f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f3286j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean u() {
        C0049a aVar = this.f3278a;
        int f10 = aVar.f();
        int d10 = aVar.d();
        return (f10 != 0 && b(f10)) || (d10 != 0 && a(d10));
    }
}
