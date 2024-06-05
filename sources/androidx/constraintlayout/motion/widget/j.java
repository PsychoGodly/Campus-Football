package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.l;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MotionLayout */
public class j extends ConstraintLayout implements r {

    /* renamed from: y0  reason: collision with root package name */
    public static boolean f2071y0;
    Interpolator A;
    Interpolator B;
    float C;
    /* access modifiers changed from: private */
    public int D;
    int E;
    /* access modifiers changed from: private */
    public int F;
    private boolean G;
    HashMap<View, g> H;
    private long I;
    private float J;
    float K;
    float L;
    private long M;
    float N;
    private boolean O;
    boolean P;
    private d Q;
    int R;
    private boolean S;
    private x.b T;
    private b U;
    boolean V;
    float W;

    /* renamed from: a0  reason: collision with root package name */
    float f2072a0;

    /* renamed from: b0  reason: collision with root package name */
    long f2073b0;

    /* renamed from: c0  reason: collision with root package name */
    float f2074c0;

    /* renamed from: d0  reason: collision with root package name */
    private boolean f2075d0;

    /* renamed from: e0  reason: collision with root package name */
    private ArrayList<h> f2076e0;

    /* renamed from: f0  reason: collision with root package name */
    private ArrayList<h> f2077f0;

    /* renamed from: g0  reason: collision with root package name */
    private ArrayList<h> f2078g0;

    /* renamed from: h0  reason: collision with root package name */
    private CopyOnWriteArrayList<d> f2079h0;

    /* renamed from: i0  reason: collision with root package name */
    private int f2080i0;

    /* renamed from: j0  reason: collision with root package name */
    private float f2081j0;

    /* renamed from: k0  reason: collision with root package name */
    boolean f2082k0;

    /* renamed from: l0  reason: collision with root package name */
    protected boolean f2083l0;

    /* renamed from: m0  reason: collision with root package name */
    float f2084m0;

    /* renamed from: n0  reason: collision with root package name */
    private t.c f2085n0;

    /* renamed from: o0  reason: collision with root package name */
    private boolean f2086o0;
    /* access modifiers changed from: private */

    /* renamed from: p0  reason: collision with root package name */
    public c f2087p0;

    /* renamed from: q0  reason: collision with root package name */
    private Runnable f2088q0;

    /* renamed from: r0  reason: collision with root package name */
    private int[] f2089r0;

    /* renamed from: s0  reason: collision with root package name */
    int f2090s0;

    /* renamed from: t0  reason: collision with root package name */
    private int f2091t0;

    /* renamed from: u0  reason: collision with root package name */
    private boolean f2092u0;

    /* renamed from: v0  reason: collision with root package name */
    e f2093v0;

    /* renamed from: w0  reason: collision with root package name */
    private boolean f2094w0;

    /* renamed from: x0  reason: collision with root package name */
    ArrayList<Integer> f2095x0;

    /* renamed from: z  reason: collision with root package name */
    l f2096z;

    /* compiled from: MotionLayout */
    class a implements Runnable {
        a() {
        }

        public void run() {
            j.this.f2087p0.a();
        }
    }

    /* compiled from: MotionLayout */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2098a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.motion.widget.j$e[] r0 = androidx.constraintlayout.motion.widget.j.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2098a = r0
                androidx.constraintlayout.motion.widget.j$e r1 = androidx.constraintlayout.motion.widget.j.e.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2098a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.motion.widget.j$e r1 = androidx.constraintlayout.motion.widget.j.e.SETUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2098a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.motion.widget.j$e r1 = androidx.constraintlayout.motion.widget.j.e.MOVING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2098a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.motion.widget.j$e r1 = androidx.constraintlayout.motion.widget.j.e.FINISHED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.j.b.<clinit>():void");
        }
    }

    /* compiled from: MotionLayout */
    class c {

        /* renamed from: a  reason: collision with root package name */
        float f2099a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        float f2100b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        int f2101c = -1;

        /* renamed from: d  reason: collision with root package name */
        int f2102d = -1;

        /* renamed from: e  reason: collision with root package name */
        final String f2103e = "motion.progress";

        /* renamed from: f  reason: collision with root package name */
        final String f2104f = "motion.velocity";

        /* renamed from: g  reason: collision with root package name */
        final String f2105g = "motion.StartState";

        /* renamed from: h  reason: collision with root package name */
        final String f2106h = "motion.EndState";

        c() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i10 = this.f2101c;
            if (!(i10 == -1 && this.f2102d == -1)) {
                if (i10 == -1) {
                    j.this.H(this.f2102d);
                } else {
                    int i11 = this.f2102d;
                    if (i11 == -1) {
                        j.this.E(i10, -1, -1);
                    } else {
                        j.this.F(i10, i11);
                    }
                }
                j.this.setState(e.SETUP);
            }
            if (!Float.isNaN(this.f2100b)) {
                j.this.D(this.f2099a, this.f2100b);
                this.f2099a = Float.NaN;
                this.f2100b = Float.NaN;
                this.f2101c = -1;
                this.f2102d = -1;
            } else if (!Float.isNaN(this.f2099a)) {
                j.this.setProgress(this.f2099a);
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f2099a);
            bundle.putFloat("motion.velocity", this.f2100b);
            bundle.putInt("motion.StartState", this.f2101c);
            bundle.putInt("motion.EndState", this.f2102d);
            return bundle;
        }

        public void c() {
            this.f2102d = j.this.F;
            this.f2101c = j.this.D;
            this.f2100b = j.this.getVelocity();
            this.f2099a = j.this.getProgress();
        }

        public void d(int i10) {
            this.f2102d = i10;
        }

        public void e(float f10) {
            this.f2099a = f10;
        }

        public void f(int i10) {
            this.f2101c = i10;
        }

        public void g(Bundle bundle) {
            this.f2099a = bundle.getFloat("motion.progress");
            this.f2100b = bundle.getFloat("motion.velocity");
            this.f2101c = bundle.getInt("motion.StartState");
            this.f2102d = bundle.getInt("motion.EndState");
        }

        public void h(float f10) {
            this.f2100b = f10;
        }
    }

    /* compiled from: MotionLayout */
    public interface d {
        void a(j jVar, int i10, int i11, float f10);

        void b(j jVar, int i10, int i11);

        void c(j jVar, int i10);
    }

    /* compiled from: MotionLayout */
    enum e {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    private void C() {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if (this.Q != null || ((copyOnWriteArrayList = this.f2079h0) != null && !copyOnWriteArrayList.isEmpty())) {
            this.f2082k0 = false;
            Iterator<Integer> it = this.f2095x0.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                d dVar = this.Q;
                if (dVar != null) {
                    dVar.c(this, next.intValue());
                }
                CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.f2079h0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<d> it2 = copyOnWriteArrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().c(this, next.intValue());
                    }
                }
            }
            this.f2095x0.clear();
        }
    }

    private void z() {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if ((this.Q != null || ((copyOnWriteArrayList = this.f2079h0) != null && !copyOnWriteArrayList.isEmpty())) && this.f2081j0 != this.K) {
            if (this.f2080i0 != -1) {
                d dVar = this.Q;
                if (dVar != null) {
                    dVar.b(this, this.D, this.F);
                }
                CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.f2079h0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<d> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().b(this, this.D, this.F);
                    }
                }
                this.f2082k0 = true;
            }
            this.f2080i0 = -1;
            float f10 = this.K;
            this.f2081j0 = f10;
            d dVar2 = this.Q;
            if (dVar2 != null) {
                dVar2.a(this, this.D, this.F, f10);
            }
            CopyOnWriteArrayList<d> copyOnWriteArrayList3 = this.f2079h0;
            if (copyOnWriteArrayList3 != null) {
                Iterator<d> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this, this.D, this.F, this.K);
                }
            }
            this.f2082k0 = true;
        }
    }

    /* access modifiers changed from: protected */
    public void A() {
        int i10;
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if ((this.Q != null || ((copyOnWriteArrayList = this.f2079h0) != null && !copyOnWriteArrayList.isEmpty())) && this.f2080i0 == -1) {
            this.f2080i0 = this.E;
            if (!this.f2095x0.isEmpty()) {
                ArrayList<Integer> arrayList = this.f2095x0;
                i10 = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i10 = -1;
            }
            int i11 = this.E;
            if (!(i10 == i11 || i11 == -1)) {
                this.f2095x0.add(Integer.valueOf(i11));
            }
        }
        C();
        Runnable runnable = this.f2088q0;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.f2089r0;
        if (iArr != null && this.f2090s0 > 0) {
            H(iArr[0]);
            int[] iArr2 = this.f2089r0;
            System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
            this.f2090s0--;
        }
    }

    /* access modifiers changed from: package-private */
    public void B() {
    }

    public void D(float f10, float f11) {
        if (!isAttachedToWindow()) {
            if (this.f2087p0 == null) {
                this.f2087p0 = new c();
            }
            this.f2087p0.e(f10);
            this.f2087p0.h(f11);
            return;
        }
        setProgress(f10);
        setState(e.MOVING);
        this.C = f11;
        float f12 = 1.0f;
        int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i10 != 0) {
            if (i10 <= 0) {
                f12 = 0.0f;
            }
            x(f12);
        } else if (f10 != 0.0f && f10 != 1.0f) {
            if (f10 <= 0.5f) {
                f12 = 0.0f;
            }
            x(f12);
        }
    }

    public void E(int i10, int i11, int i12) {
        setState(e.SETUP);
        this.E = i10;
        this.D = -1;
        this.F = -1;
        androidx.constraintlayout.widget.d dVar = this.f2143l;
        if (dVar != null) {
            dVar.d(i10, (float) i11, (float) i12);
        }
    }

    public void F(int i10, int i11) {
        if (!isAttachedToWindow()) {
            if (this.f2087p0 == null) {
                this.f2087p0 = new c();
            }
            this.f2087p0.f(i10);
            this.f2087p0.d(i11);
        }
    }

    public void G() {
        x(1.0f);
        this.f2088q0 = null;
    }

    public void H(int i10) {
        if (!isAttachedToWindow()) {
            if (this.f2087p0 == null) {
                this.f2087p0 = new c();
            }
            this.f2087p0.d(i10);
            return;
        }
        I(i10, -1, -1);
    }

    public void I(int i10, int i11, int i12) {
        J(i10, i11, i12, -1);
    }

    public void J(int i10, int i11, int i12, int i13) {
        int i14 = this.E;
        if (i14 != i10) {
            if (this.D == i10) {
                x(0.0f);
                if (i13 > 0) {
                    this.J = ((float) i13) / 1000.0f;
                }
            } else if (this.F == i10) {
                x(1.0f);
                if (i13 > 0) {
                    this.J = ((float) i13) / 1000.0f;
                }
            } else {
                this.F = i10;
                if (i14 != -1) {
                    F(i14, i10);
                    x(1.0f);
                    this.L = 0.0f;
                    G();
                    if (i13 > 0) {
                        this.J = ((float) i13) / 1000.0f;
                        return;
                    }
                    return;
                }
                this.S = false;
                this.N = 1.0f;
                this.K = 0.0f;
                this.L = 0.0f;
                this.M = getNanoTime();
                this.I = getNanoTime();
                this.O = false;
                this.A = null;
                if (i13 == -1) {
                    throw null;
                }
                this.D = -1;
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        ArrayList<h> arrayList = this.f2078g0;
        if (arrayList != null) {
            Iterator<h> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().w(canvas);
            }
        }
        y(false);
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.E;
    }

    public ArrayList<l.a> getDefinedTransitions() {
        return null;
    }

    public b getDesignTool() {
        if (this.U == null) {
            this.U = new b(this);
        }
        return this.U;
    }

    public int getEndState() {
        return this.F;
    }

    /* access modifiers changed from: protected */
    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.L;
    }

    public l getScene() {
        return this.f2096z;
    }

    public int getStartState() {
        return this.D;
    }

    public float getTargetPosition() {
        return this.N;
    }

    public Bundle getTransitionState() {
        if (this.f2087p0 == null) {
            this.f2087p0 = new c();
        }
        this.f2087p0.c();
        return this.f2087p0.b();
    }

    public long getTransitionTimeMs() {
        return (long) (this.J * 1000.0f);
    }

    public float getVelocity() {
        return this.C;
    }

    public boolean isAttachedToWindow() {
        if (Build.VERSION.SDK_INT >= 19) {
            return super.isAttachedToWindow();
        }
        return getWindowToken() != null;
    }

    /* access modifiers changed from: protected */
    public void m(int i10) {
        this.f2143l = null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        Display display;
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 17 && (display = getDisplay()) != null) {
            this.f2091t0 = display.getRotation();
        }
        B();
        c cVar = this.f2087p0;
        if (cVar == null) {
            return;
        }
        if (this.f2092u0) {
            post(new a());
        } else {
            cVar.a();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f2086o0 = true;
        try {
            super.onLayout(z10, i10, i11, i12, i13);
        } finally {
            this.f2086o0 = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (!(!this.V && i10 == 0 && i11 == 0)) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.V = false;
    }

    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        this.f2073b0 = getNanoTime();
        this.f2074c0 = 0.0f;
        this.W = 0.0f;
        this.f2072a0 = 0.0f;
    }

    public void onRtlPropertiesChanged(int i10) {
    }

    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return false;
    }

    public void onStopNestedScroll(View view, int i10) {
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof h) {
            h hVar = (h) view;
            if (this.f2079h0 == null) {
                this.f2079h0 = new CopyOnWriteArrayList<>();
            }
            this.f2079h0.add(hVar);
            if (hVar.v()) {
                if (this.f2076e0 == null) {
                    this.f2076e0 = new ArrayList<>();
                }
                this.f2076e0.add(hVar);
            }
            if (hVar.u()) {
                if (this.f2077f0 == null) {
                    this.f2077f0 = new ArrayList<>();
                }
                this.f2077f0.add(hVar);
            }
            if (hVar.t()) {
                if (this.f2078g0 == null) {
                    this.f2078g0 = new ArrayList<>();
                }
                this.f2078g0.add(hVar);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<h> arrayList = this.f2076e0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<h> arrayList2 = this.f2077f0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void requestLayout() {
        if (!this.f2083l0) {
            int i10 = this.E;
        }
        super.requestLayout();
    }

    public void setDebugMode(int i10) {
        this.R = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.f2092u0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.G = z10;
    }

    public void setInterpolatedProgress(float f10) {
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<h> arrayList = this.f2077f0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f2077f0.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<h> arrayList = this.f2076e0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f2076e0.get(i10).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 < 0 || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f2087p0 == null) {
                this.f2087p0 = new c();
            }
            this.f2087p0.e(f10);
        } else if (i10 <= 0) {
            if (this.L == 1.0f && this.E == this.F) {
                setState(e.MOVING);
            }
            this.E = this.D;
            if (this.L == 0.0f) {
                setState(e.FINISHED);
            }
        } else if (f10 >= 1.0f) {
            if (this.L == 0.0f && this.E == this.D) {
                setState(e.MOVING);
            }
            this.E = this.F;
            if (this.L == 1.0f) {
                setState(e.FINISHED);
            }
        } else {
            this.E = -1;
            setState(e.MOVING);
        }
    }

    public void setScene(l lVar) {
        k();
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void setStartState(int i10) {
        if (!isAttachedToWindow()) {
            if (this.f2087p0 == null) {
                this.f2087p0 = new c();
            }
            this.f2087p0.f(i10);
            this.f2087p0.d(i10);
            return;
        }
        this.E = i10;
    }

    /* access modifiers changed from: package-private */
    public void setState(e eVar) {
        e eVar2 = e.FINISHED;
        if (eVar != eVar2 || this.E != -1) {
            e eVar3 = this.f2093v0;
            this.f2093v0 = eVar;
            e eVar4 = e.MOVING;
            if (eVar3 == eVar4 && eVar == eVar4) {
                z();
            }
            int i10 = b.f2098a[eVar3.ordinal()];
            if (i10 == 1 || i10 == 2) {
                if (eVar == eVar4) {
                    z();
                }
                if (eVar == eVar2) {
                    A();
                }
            } else if (i10 == 3 && eVar == eVar2) {
                A();
            }
        }
    }

    public void setTransition(int i10) {
    }

    /* access modifiers changed from: protected */
    public void setTransition(l.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i10) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(d dVar) {
        this.Q = dVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f2087p0 == null) {
            this.f2087p0 = new c();
        }
        this.f2087p0.g(bundle);
        if (isAttachedToWindow()) {
            this.f2087p0.a();
        }
    }

    public String toString() {
        Context context = getContext();
        return a.a(context, this.D) + "->" + a.a(context, this.F) + " (pos:" + this.L + " Dpos/Dt:" + this.C;
    }

    /* access modifiers changed from: package-private */
    public void x(float f10) {
    }

    /* access modifiers changed from: package-private */
    public void y(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        float f10;
        boolean z15;
        if (this.M == -1) {
            this.M = getNanoTime();
        }
        float f11 = this.L;
        if (f11 > 0.0f && f11 < 1.0f) {
            this.E = -1;
        }
        if (this.f2075d0 || (this.P && (z10 || this.N != f11))) {
            float signum = Math.signum(this.N - f11);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.A;
            float f12 = !(interpolator instanceof i) ? ((((float) (nanoTime - this.M)) * signum) * 1.0E-9f) / this.J : 0.0f;
            float f13 = this.L + f12;
            if (this.O) {
                f13 = this.N;
            }
            int i12 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            if ((i12 <= 0 || f13 < this.N) && (signum > 0.0f || f13 > this.N)) {
                z13 = false;
            } else {
                f13 = this.N;
                this.P = false;
                z13 = true;
            }
            this.L = f13;
            this.K = f13;
            this.M = nanoTime;
            if (interpolator == null || z13) {
                this.C = f12;
            } else {
                if (this.S) {
                    f10 = interpolator.getInterpolation(((float) (nanoTime - this.I)) * 1.0E-9f);
                    Interpolator interpolator2 = this.A;
                    if (interpolator2 != this.T) {
                        this.L = f10;
                        this.M = nanoTime;
                        if (interpolator2 instanceof i) {
                            float a10 = ((i) interpolator2).a();
                            this.C = a10;
                            int i13 = ((Math.abs(a10) * this.J) > 1.0E-5f ? 1 : ((Math.abs(a10) * this.J) == 1.0E-5f ? 0 : -1));
                            if (a10 <= 0.0f || f10 < 1.0f) {
                                z15 = false;
                            } else {
                                this.L = 1.0f;
                                z15 = false;
                                this.P = false;
                                f10 = 1.0f;
                            }
                            if (a10 < 0.0f && f10 <= 0.0f) {
                                this.L = 0.0f;
                                this.P = z15;
                                f13 = 0.0f;
                            }
                        }
                    } else {
                        throw null;
                    }
                } else {
                    f10 = interpolator.getInterpolation(f13);
                    Interpolator interpolator3 = this.A;
                    if (interpolator3 instanceof i) {
                        this.C = ((i) interpolator3).a();
                    } else {
                        this.C = ((interpolator3.getInterpolation(f13 + f12) - f10) * signum) / f12;
                    }
                }
                f13 = f10;
            }
            if (Math.abs(this.C) > 1.0E-5f) {
                setState(e.MOVING);
            }
            if ((i12 > 0 && f13 >= this.N) || (signum <= 0.0f && f13 <= this.N)) {
                f13 = this.N;
                this.P = false;
            }
            if (f13 >= 1.0f || f13 <= 0.0f) {
                z14 = false;
                this.P = false;
                setState(e.FINISHED);
            } else {
                z14 = false;
            }
            int childCount = getChildCount();
            this.f2075d0 = z14;
            long nanoTime2 = getNanoTime();
            this.f2084m0 = f13;
            Interpolator interpolator4 = this.B;
            float interpolation = interpolator4 == null ? f13 : interpolator4.getInterpolation(f13);
            Interpolator interpolator5 = this.B;
            if (interpolator5 != null) {
                float interpolation2 = interpolator5.getInterpolation((signum / this.J) + f13);
                this.C = interpolation2;
                this.C = interpolation2 - this.B.getInterpolation(f13);
            }
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                g gVar = this.H.get(childAt);
                if (gVar != null) {
                    this.f2075d0 = gVar.c(childAt, interpolation, nanoTime2, this.f2085n0) | this.f2075d0;
                }
            }
            boolean z16 = (i12 > 0 && f13 >= this.N) || (signum <= 0.0f && f13 <= this.N);
            if (!this.f2075d0 && !this.P && z16) {
                setState(e.FINISHED);
            }
            if (this.f2083l0) {
                requestLayout();
            }
            z11 = true;
            boolean z17 = this.f2075d0 | (!z16);
            this.f2075d0 = z17;
            if (f13 <= 0.0f && (i11 = this.D) != -1 && this.E != i11) {
                this.E = i11;
                throw null;
            } else if (((double) f13) < 1.0d || this.E == (i10 = this.F)) {
                if (z17 || this.P) {
                    invalidate();
                } else if ((i12 > 0 && f13 == 1.0f) || (signum < 0.0f && f13 == 0.0f)) {
                    setState(e.FINISHED);
                }
                if (!this.f2075d0 && !this.P && ((i12 > 0 && f13 == 1.0f) || (signum < 0.0f && f13 == 0.0f))) {
                    B();
                }
            } else {
                this.E = i10;
                throw null;
            }
        } else {
            z11 = true;
        }
        float f14 = this.L;
        if (f14 >= 1.0f) {
            int i15 = this.E;
            int i16 = this.F;
            if (i15 == i16) {
                z11 = false;
            }
            this.E = i16;
        } else if (f14 <= 0.0f) {
            int i17 = this.E;
            int i18 = this.D;
            if (i17 == i18) {
                z11 = false;
            }
            this.E = i18;
        } else {
            z12 = false;
            this.f2094w0 |= z12;
            if (z12 && !this.f2086o0) {
                requestLayout();
            }
            this.K = this.L;
        }
        z12 = z11;
        this.f2094w0 |= z12;
        requestLayout();
        this.K = this.L;
    }
}
