package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.a0;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: FastScroller */
class d extends RecyclerView.n implements RecyclerView.s {
    private static final int[] D = {16842919};
    private static final int[] E = new int[0];
    int A;
    private final Runnable B;
    private final RecyclerView.t C;

    /* renamed from: a  reason: collision with root package name */
    private final int f4576a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4577b;

    /* renamed from: c  reason: collision with root package name */
    final StateListDrawable f4578c;

    /* renamed from: d  reason: collision with root package name */
    final Drawable f4579d;

    /* renamed from: e  reason: collision with root package name */
    private final int f4580e;

    /* renamed from: f  reason: collision with root package name */
    private final int f4581f;

    /* renamed from: g  reason: collision with root package name */
    private final StateListDrawable f4582g;

    /* renamed from: h  reason: collision with root package name */
    private final Drawable f4583h;

    /* renamed from: i  reason: collision with root package name */
    private final int f4584i;

    /* renamed from: j  reason: collision with root package name */
    private final int f4585j;

    /* renamed from: k  reason: collision with root package name */
    int f4586k;

    /* renamed from: l  reason: collision with root package name */
    int f4587l;

    /* renamed from: m  reason: collision with root package name */
    float f4588m;

    /* renamed from: n  reason: collision with root package name */
    int f4589n;

    /* renamed from: o  reason: collision with root package name */
    int f4590o;

    /* renamed from: p  reason: collision with root package name */
    float f4591p;

    /* renamed from: q  reason: collision with root package name */
    private int f4592q = 0;

    /* renamed from: r  reason: collision with root package name */
    private int f4593r = 0;

    /* renamed from: s  reason: collision with root package name */
    private RecyclerView f4594s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f4595t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f4596u = false;

    /* renamed from: v  reason: collision with root package name */
    private int f4597v = 0;

    /* renamed from: w  reason: collision with root package name */
    private int f4598w = 0;

    /* renamed from: x  reason: collision with root package name */
    private final int[] f4599x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    private final int[] f4600y = new int[2];

    /* renamed from: z  reason: collision with root package name */
    final ValueAnimator f4601z;

    /* compiled from: FastScroller */
    class a implements Runnable {
        a() {
        }

        public void run() {
            d.this.q(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        }
    }

    /* compiled from: FastScroller */
    class b extends RecyclerView.t {
        b() {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
            d.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* compiled from: FastScroller */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f4604a = false;

        c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f4604a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f4604a) {
                this.f4604a = false;
            } else if (((Float) d.this.f4601z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.A = 0;
                dVar.y(0);
            } else {
                d dVar2 = d.this;
                dVar2.A = 2;
                dVar2.v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d  reason: collision with other inner class name */
    /* compiled from: FastScroller */
    private class C0076d implements ValueAnimator.AnimatorUpdateListener {
        C0076d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f4578c.setAlpha(floatValue);
            d.this.f4579d.setAlpha(floatValue);
            d.this.v();
        }
    }

    d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f4601z = ofFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f4578c = stateListDrawable;
        this.f4579d = drawable;
        this.f4582g = stateListDrawable2;
        this.f4583h = drawable2;
        this.f4580e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f4581f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f4584i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f4585j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f4576a = i11;
        this.f4577b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new C0076d());
        j(recyclerView);
    }

    private void C(float f10) {
        int[] p10 = p();
        float max = Math.max((float) p10[0], Math.min((float) p10[1], f10));
        if (Math.abs(((float) this.f4587l) - max) >= 2.0f) {
            int x10 = x(this.f4588m, max, p10, this.f4594s.computeVerticalScrollRange(), this.f4594s.computeVerticalScrollOffset(), this.f4593r);
            if (x10 != 0) {
                this.f4594s.scrollBy(0, x10);
            }
            this.f4588m = max;
        }
    }

    private void k() {
        this.f4594s.removeCallbacks(this.B);
    }

    private void l() {
        this.f4594s.removeItemDecoration(this);
        this.f4594s.removeOnItemTouchListener(this);
        this.f4594s.removeOnScrollListener(this.C);
        k();
    }

    private void m(Canvas canvas) {
        int i10 = this.f4593r;
        int i11 = this.f4584i;
        int i12 = i10 - i11;
        int i13 = this.f4590o;
        int i14 = this.f4589n;
        int i15 = i13 - (i14 / 2);
        this.f4582g.setBounds(0, 0, i14, i11);
        this.f4583h.setBounds(0, 0, this.f4592q, this.f4585j);
        canvas.translate(0.0f, (float) i12);
        this.f4583h.draw(canvas);
        canvas.translate((float) i15, 0.0f);
        this.f4582g.draw(canvas);
        canvas.translate((float) (-i15), (float) (-i12));
    }

    private void n(Canvas canvas) {
        int i10 = this.f4592q;
        int i11 = this.f4580e;
        int i12 = i10 - i11;
        int i13 = this.f4587l;
        int i14 = this.f4586k;
        int i15 = i13 - (i14 / 2);
        this.f4578c.setBounds(0, 0, i11, i14);
        this.f4579d.setBounds(0, 0, this.f4581f, this.f4593r);
        if (s()) {
            this.f4579d.draw(canvas);
            canvas.translate((float) this.f4580e, (float) i15);
            canvas.scale(-1.0f, 1.0f);
            this.f4578c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.f4580e), (float) (-i15));
            return;
        }
        canvas.translate((float) i12, 0.0f);
        this.f4579d.draw(canvas);
        canvas.translate(0.0f, (float) i15);
        this.f4578c.draw(canvas);
        canvas.translate((float) (-i12), (float) (-i15));
    }

    private int[] o() {
        int[] iArr = this.f4600y;
        int i10 = this.f4577b;
        iArr[0] = i10;
        iArr[1] = this.f4592q - i10;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.f4599x;
        int i10 = this.f4577b;
        iArr[0] = i10;
        iArr[1] = this.f4593r - i10;
        return iArr;
    }

    private void r(float f10) {
        int[] o10 = o();
        float max = Math.max((float) o10[0], Math.min((float) o10[1], f10));
        if (Math.abs(((float) this.f4590o) - max) >= 2.0f) {
            int x10 = x(this.f4591p, max, o10, this.f4594s.computeHorizontalScrollRange(), this.f4594s.computeHorizontalScrollOffset(), this.f4592q);
            if (x10 != 0) {
                this.f4594s.scrollBy(x10, 0);
            }
            this.f4591p = max;
        }
    }

    private boolean s() {
        return a0.B(this.f4594s) == 1;
    }

    private void w(int i10) {
        k();
        this.f4594s.postDelayed(this.B, (long) i10);
    }

    private int x(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / ((float) i13)) * ((float) i14));
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    private void z() {
        this.f4594s.addItemDecoration(this);
        this.f4594s.addOnItemTouchListener(this);
        this.f4594s.addOnScrollListener(this.C);
    }

    public void A() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 == 3) {
                this.f4601z.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f4601z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f4601z.setDuration(500);
        this.f4601z.setStartDelay(0);
        this.f4601z.start();
    }

    /* access modifiers changed from: package-private */
    public void B(int i10, int i11) {
        int computeVerticalScrollRange = this.f4594s.computeVerticalScrollRange();
        int i12 = this.f4593r;
        this.f4595t = computeVerticalScrollRange - i12 > 0 && i12 >= this.f4576a;
        int computeHorizontalScrollRange = this.f4594s.computeHorizontalScrollRange();
        int i13 = this.f4592q;
        boolean z10 = computeHorizontalScrollRange - i13 > 0 && i13 >= this.f4576a;
        this.f4596u = z10;
        boolean z11 = this.f4595t;
        if (z11 || z10) {
            if (z11) {
                float f10 = (float) i12;
                this.f4587l = (int) ((f10 * (((float) i11) + (f10 / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f4586k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
            }
            if (this.f4596u) {
                float f11 = (float) i13;
                this.f4590o = (int) ((f11 * (((float) i10) + (f11 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f4589n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
            }
            int i14 = this.f4597v;
            if (i14 == 0 || i14 == 1) {
                y(1);
            }
        } else if (this.f4597v != 0) {
            y(0);
        }
    }

    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f4597v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean u10 = u(motionEvent.getX(), motionEvent.getY());
                boolean t10 = t(motionEvent.getX(), motionEvent.getY());
                if (u10 || t10) {
                    if (t10) {
                        this.f4598w = 1;
                        this.f4591p = (float) ((int) motionEvent.getX());
                    } else if (u10) {
                        this.f4598w = 2;
                        this.f4588m = (float) ((int) motionEvent.getY());
                    }
                    y(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f4597v == 2) {
                this.f4588m = 0.0f;
                this.f4591p = 0.0f;
                y(1);
                this.f4598w = 0;
            } else if (motionEvent.getAction() == 2 && this.f4597v == 2) {
                A();
                if (this.f4598w == 1) {
                    r(motionEvent.getX());
                }
                if (this.f4598w == 2) {
                    C(motionEvent.getY());
                }
            }
        }
    }

    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f4597v;
        if (i10 == 1) {
            boolean u10 = u(motionEvent.getX(), motionEvent.getY());
            boolean t10 = t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!u10 && !t10) {
                return false;
            }
            if (t10) {
                this.f4598w = 1;
                this.f4591p = (float) ((int) motionEvent.getX());
            } else if (u10) {
                this.f4598w = 2;
                this.f4588m = (float) ((int) motionEvent.getY());
            }
            y(2);
        } else if (i10 == 2) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public void c(boolean z10) {
    }

    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (this.f4592q != this.f4594s.getWidth() || this.f4593r != this.f4594s.getHeight()) {
            this.f4592q = this.f4594s.getWidth();
            this.f4593r = this.f4594s.getHeight();
            y(0);
        } else if (this.A != 0) {
            if (this.f4595t) {
                n(canvas);
            }
            if (this.f4596u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4594s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                l();
            }
            this.f4594s = recyclerView;
            if (recyclerView != null) {
                z();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int i10) {
        int i11 = this.A;
        if (i11 == 1) {
            this.f4601z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f4601z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f4601z.setDuration((long) i10);
        this.f4601z.start();
    }

    /* access modifiers changed from: package-private */
    public boolean t(float f10, float f11) {
        if (f11 >= ((float) (this.f4593r - this.f4584i))) {
            int i10 = this.f4590o;
            int i11 = this.f4589n;
            return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) (i10 + (i11 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean u(float f10, float f11) {
        if (!s() ? f10 >= ((float) (this.f4592q - this.f4580e)) : f10 <= ((float) (this.f4580e / 2))) {
            int i10 = this.f4587l;
            int i11 = this.f4586k;
            return f11 >= ((float) (i10 - (i11 / 2))) && f11 <= ((float) (i10 + (i11 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    public void v() {
        this.f4594s.invalidate();
    }

    /* access modifiers changed from: package-private */
    public void y(int i10) {
        if (i10 == 2 && this.f4597v != 2) {
            this.f4578c.setState(D);
            k();
        }
        if (i10 == 0) {
            v();
        } else {
            A();
        }
        if (this.f4597v == 2 && i10 != 2) {
            this.f4578c.setState(E);
            w(1200);
        } else if (i10 == 1) {
            w(1500);
        }
        this.f4597v = i10;
    }
}
