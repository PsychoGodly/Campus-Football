package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.p;

/* compiled from: ForwardingListener */
public abstract class k0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final float f1681a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1682b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1683c;

    /* renamed from: d  reason: collision with root package name */
    final View f1684d;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f1685f;

    /* renamed from: g  reason: collision with root package name */
    private Runnable f1686g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1687h;

    /* renamed from: i  reason: collision with root package name */
    private int f1688i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f1689j = new int[2];

    /* compiled from: ForwardingListener */
    private class a implements Runnable {
        a() {
        }

        public void run() {
            ViewParent parent = k0.this.f1684d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: ForwardingListener */
    private class b implements Runnable {
        b() {
        }

        public void run() {
            k0.this.e();
        }
    }

    public k0(View view) {
        this.f1684d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1681a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1682b = tapTimeout;
        this.f1683c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f1686g;
        if (runnable != null) {
            this.f1684d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1685f;
        if (runnable2 != null) {
            this.f1684d.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        i0 i0Var;
        View view = this.f1684d;
        p b10 = b();
        if (b10 == null || !b10.b() || (i0Var = (i0) b10.i()) == null || !i0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(i0Var, obtainNoHistory);
        boolean e10 = i0Var.e(obtainNoHistory, this.f1688i);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        boolean z10 = (actionMasked == 1 || actionMasked == 3) ? false : true;
        if (!e10 || !z10) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1684d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f1688i
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1681a
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f1688i = r6
            java.lang.Runnable r6 = r5.f1685f
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.k0$a r6 = new androidx.appcompat.widget.k0$a
            r6.<init>()
            r5.f1685f = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f1685f
            int r1 = r5.f1682b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1686g
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.k0$b r6 = new androidx.appcompat.widget.k0$b
            r6.<init>()
            r5.f1686g = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f1686g
            int r1 = r5.f1683c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k0.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1689j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1689j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    public abstract p b();

    /* access modifiers changed from: protected */
    public abstract boolean c();

    /* access modifiers changed from: protected */
    public boolean d() {
        p b10 = b();
        if (b10 == null || !b10.b()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        a();
        View view = this.f1684d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1687h = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f1687h;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1684d.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1687h = z10;
        if (z10 || z11) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f1687h = false;
        this.f1688i = -1;
        Runnable runnable = this.f1685f;
        if (runnable != null) {
            this.f1684d.removeCallbacks(runnable);
        }
    }
}
