package com.startapp.sdk.ads.list3d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.startapp.a0;
import com.startapp.b2;
import com.startapp.p4;
import com.startapp.q4;
import java.util.LinkedList;

/* compiled from: Sta */
public class List3DView extends AdapterView<Adapter> {

    /* renamed from: a  reason: collision with root package name */
    public Adapter f16506a;

    /* renamed from: b  reason: collision with root package name */
    public int f16507b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f16508c;

    /* renamed from: d  reason: collision with root package name */
    public int f16509d;

    /* renamed from: e  reason: collision with root package name */
    public int f16510e;

    /* renamed from: f  reason: collision with root package name */
    public int f16511f;

    /* renamed from: g  reason: collision with root package name */
    public int f16512g;

    /* renamed from: h  reason: collision with root package name */
    public int f16513h;

    /* renamed from: i  reason: collision with root package name */
    public int f16514i;

    /* renamed from: j  reason: collision with root package name */
    public int f16515j;

    /* renamed from: k  reason: collision with root package name */
    public VelocityTracker f16516k;

    /* renamed from: l  reason: collision with root package name */
    public b2 f16517l;

    /* renamed from: m  reason: collision with root package name */
    public Runnable f16518m;

    /* renamed from: n  reason: collision with root package name */
    public final LinkedList<View> f16519n = new LinkedList<>();

    /* renamed from: o  reason: collision with root package name */
    public Runnable f16520o;

    /* renamed from: p  reason: collision with root package name */
    public Rect f16521p;

    /* renamed from: q  reason: collision with root package name */
    public Camera f16522q;

    /* renamed from: r  reason: collision with root package name */
    public Matrix f16523r;

    /* renamed from: s  reason: collision with root package name */
    public Paint f16524s;

    /* renamed from: t  reason: collision with root package name */
    public int f16525t = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: u  reason: collision with root package name */
    public boolean f16526u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f16527v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f16528w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f16529x = false;

    public List3DView(Context context, AttributeSet attributeSet, String str, String str2) {
        super(context, (AttributeSet) null);
    }

    public final boolean a() {
        int i10 = a0.f15596a;
        return Build.VERSION.SDK_INT >= 12;
    }

    public int b(int i10, int i11) {
        if (this.f16521p == null) {
            this.f16521p = new Rect();
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).getHitRect(this.f16521p);
            if (this.f16521p.contains(i10, i11)) {
                return i12;
            }
        }
        return -1;
    }

    public final int c(View view) {
        return (int) ((((float) view.getMeasuredHeight()) * 0.35000002f) / 2.0f);
    }

    public int d(View view) {
        return view.getTop() - c(view);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean drawChild(Canvas canvas, View view, long j10) {
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return super.drawChild(canvas, view, j10);
        }
        int top = view.getTop();
        int left = view.getLeft();
        int width = view.getWidth() / 2;
        int height = view.getHeight() / 2;
        float height2 = (float) (getHeight() / 2);
        float f10 = (((float) (top + height)) - height2) / height2;
        float cos = (float) (1.0d - ((1.0d - Math.cos((double) f10)) * 0.15000000596046448d));
        float f11 = (((float) this.f16513h) - (f10 * 20.0f)) % 90.0f;
        if (f11 < 0.0f) {
            f11 += 90.0f;
        }
        float f12 = f11;
        if (f12 < 45.0f) {
            Canvas canvas2 = canvas;
            Bitmap bitmap = drawingCache;
            int i10 = top;
            int i11 = left;
            int i12 = width;
            int i13 = height;
            float f13 = cos;
            a(canvas2, bitmap, i10, i11, i12, i13, f13, f12 - 90.0f);
            a(canvas2, bitmap, i10, i11, i12, i13, f13, f12);
            return false;
        }
        Canvas canvas3 = canvas;
        Bitmap bitmap2 = drawingCache;
        int i14 = top;
        int i15 = left;
        int i16 = width;
        int i17 = height;
        float f14 = cos;
        a(canvas3, bitmap2, i14, i15, i16, i17, f14, f12);
        a(canvas3, bitmap2, i14, i15, i16, i17, f14, f12 - 90.0f);
        return false;
    }

    public Adapter getAdapter() {
        return this.f16506a;
    }

    public View getSelectedView() {
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f16518m);
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f16526u && this.f16506a != null) {
            if (getChildCount() == 0) {
                if (this.f16528w) {
                    this.f16511f = getHeight() / 3;
                }
                this.f16515j = -1;
                a(this.f16511f, 0);
            } else {
                int d10 = (this.f16511f + this.f16512g) - d(getChildAt(0));
                int childCount = getChildCount();
                if (this.f16515j != this.f16506a.getCount() - 1 && childCount > 1) {
                    View childAt = getChildAt(0);
                    while (childAt != null && a(childAt) + d10 < 0) {
                        removeViewInLayout(childAt);
                        childCount--;
                        this.f16519n.addLast(childAt);
                        this.f16514i++;
                        this.f16512g = b(childAt) + this.f16512g;
                        childAt = childCount > 1 ? getChildAt(0) : null;
                    }
                }
                if (this.f16514i != 0 && childCount > 1) {
                    View childAt2 = getChildAt(childCount - 1);
                    while (childAt2 != null && d(childAt2) + d10 > getHeight()) {
                        removeViewInLayout(childAt2);
                        childCount--;
                        this.f16519n.addLast(childAt2);
                        this.f16515j--;
                        childAt2 = childCount > 1 ? getChildAt(childCount - 1) : null;
                    }
                }
                a(a(getChildAt(getChildCount() - 1)), d10);
                int d11 = d(getChildAt(0));
                while (d11 + d10 > 0 && (i14 = this.f16514i) > 0) {
                    int i15 = i14 - 1;
                    this.f16514i = i15;
                    View view = this.f16506a.getView(i15, this.f16519n.size() != 0 ? this.f16519n.removeFirst() : null, this);
                    a(view, 1);
                    int b10 = b(view);
                    d11 -= b10;
                    this.f16512g -= b10;
                }
            }
            int i16 = this.f16511f + this.f16512g;
            float width = ((float) getWidth()) * 0.0f;
            float height = 1.0f / (((float) getHeight()) * 0.9f);
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                View childAt3 = getChildAt(i17);
                int sin = (int) (Math.sin(((double) height) * 6.283185307179586d * ((double) i16)) * ((double) width));
                int measuredWidth = childAt3.getMeasuredWidth();
                int measuredHeight = childAt3.getMeasuredHeight();
                int width2 = ((getWidth() - measuredWidth) / 2) + sin;
                int c10 = c(childAt3);
                int i18 = i16 + c10;
                childAt3.layout(width2, i18, measuredWidth + width2, i18 + measuredHeight);
                i16 += (c10 * 2) + measuredHeight;
            }
            if (this.f16528w && !this.f16529x) {
                this.f16529x = true;
                dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 0, 0.0f, 0.0f, 0));
                postDelayed(new p4(this), 5);
            }
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r1 <= (r0 + 10)) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r6.getChildCount()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = r7.getAction()
            r2 = 1
            if (r0 == 0) goto L_0x0097
            r1 = 0
            r3 = 2
            if (r0 == r2) goto L_0x0059
            if (r0 == r3) goto L_0x001a
            r6.a((float) r1)
            goto L_0x00f9
        L_0x001a:
            int r0 = r6.f16507b
            if (r0 != r2) goto L_0x0043
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            int r4 = r6.f16508c
            int r5 = r4 + -10
            if (r0 < r5) goto L_0x003c
            int r4 = r4 + 10
            if (r0 > r4) goto L_0x003c
            int r0 = r6.f16509d
            int r4 = r0 + -10
            if (r1 < r4) goto L_0x003c
            int r0 = r0 + 10
            if (r1 <= r0) goto L_0x0043
        L_0x003c:
            java.lang.Runnable r0 = r6.f16520o
            r6.removeCallbacks(r0)
            r6.f16507b = r3
        L_0x0043:
            int r0 = r6.f16507b
            if (r0 != r3) goto L_0x00f9
            android.view.VelocityTracker r0 = r6.f16516k
            r0.addMovement(r7)
            float r7 = r7.getY()
            int r7 = (int) r7
            int r0 = r6.f16509d
            int r7 = r7 - r0
            r6.a((int) r7)
            goto L_0x00f9
        L_0x0059:
            int r0 = r6.f16507b
            if (r0 != r2) goto L_0x007f
            float r0 = r7.getX()
            int r0 = (int) r0
            float r7 = r7.getY()
            int r7 = (int) r7
            int r7 = r6.b(r0, r7)
            r0 = -1
            if (r7 == r0) goto L_0x0093
            android.view.View r0 = r6.getChildAt(r7)
            int r3 = r6.f16514i
            int r3 = r3 + r7
            android.widget.Adapter r7 = r6.f16506a
            long r4 = r7.getItemId(r3)
            r6.performItemClick(r0, r3, r4)
            goto L_0x0093
        L_0x007f:
            if (r0 != r3) goto L_0x0093
            android.view.VelocityTracker r0 = r6.f16516k
            r0.addMovement(r7)
            android.view.VelocityTracker r7 = r6.f16516k
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r0)
            android.view.VelocityTracker r7 = r6.f16516k
            float r1 = r7.getYVelocity()
        L_0x0093:
            r6.a((float) r1)
            goto L_0x00f9
        L_0x0097:
            boolean r0 = r6.a()
            if (r0 == 0) goto L_0x00b9
            r3 = 1500(0x5dc, double:7.41E-321)
            int r0 = com.startapp.a0.f15596a
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 12
            if (r0 < r5) goto L_0x00b9
            android.view.ViewPropertyAnimator r0 = r6.animate()
            r5 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r5)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r3)
            r3 = 0
            r0.setListener(r3)
        L_0x00b9:
            java.lang.Runnable r0 = r6.f16518m
            r6.removeCallbacks(r0)
            float r0 = r7.getX()
            int r0 = (int) r0
            r6.f16508c = r0
            float r0 = r7.getY()
            int r0 = (int) r0
            r6.f16509d = r0
            android.view.View r0 = r6.getChildAt(r1)
            int r0 = r6.d(r0)
            int r1 = r6.f16512g
            int r0 = r0 - r1
            r6.f16510e = r0
            java.lang.Runnable r0 = r6.f16520o
            if (r0 != 0) goto L_0x00e4
            com.startapp.r4 r0 = new com.startapp.r4
            r0.<init>(r6)
            r6.f16520o = r0
        L_0x00e4:
            java.lang.Runnable r0 = r6.f16520o
            int r1 = android.view.ViewConfiguration.getLongPressTimeout()
            long r3 = (long) r1
            r6.postDelayed(r0, r3)
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f16516k = r0
            r0.addMovement(r7)
            r6.f16507b = r2
        L_0x00f9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.list3d.List3DView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAdapter(Adapter adapter) {
        if (a() && this.f16527v) {
            int i10 = a0.f15596a;
            if (Build.VERSION.SDK_INT >= 11) {
                setAlpha(0.0f);
            }
        }
        this.f16506a = adapter;
        removeAllViewsInLayout();
        requestLayout();
    }

    public void setDynamics(b2 b2Var) {
        b2 b2Var2 = this.f16517l;
        if (b2Var2 != null) {
            float f10 = b2Var2.f15634a;
            float f11 = b2Var2.f15635b;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            b2Var.f15635b = f11;
            b2Var.f15634a = f10;
            b2Var.f15638e = currentAnimationTimeMillis;
        }
        this.f16517l = b2Var;
    }

    public void setFade(boolean z10) {
        this.f16527v = z10;
    }

    public void setHint(boolean z10) {
        this.f16528w = z10;
    }

    public void setSelection(int i10) {
        throw new UnsupportedOperationException();
    }

    public void setStarted() {
        this.f16526u = true;
    }

    public void setTag(String str) {
    }

    public final void a(Canvas canvas, Bitmap bitmap, int i10, int i11, int i12, int i13, float f10, float f11) {
        if (this.f16522q == null) {
            this.f16522q = new Camera();
        }
        this.f16522q.save();
        this.f16522q.translate(0.0f, 0.0f, (float) i13);
        this.f16522q.rotateX(f11);
        float f12 = (float) (-i13);
        this.f16522q.translate(0.0f, 0.0f, f12);
        if (this.f16523r == null) {
            this.f16523r = new Matrix();
        }
        this.f16522q.getMatrix(this.f16523r);
        this.f16522q.restore();
        this.f16523r.preTranslate((float) (-i12), f12);
        this.f16523r.postScale(f10, f10);
        this.f16523r.postTranslate((float) (i11 + i12), (float) (i10 + i13));
        if (this.f16524s == null) {
            Paint paint = new Paint();
            this.f16524s = paint;
            paint.setAntiAlias(true);
            this.f16524s.setFilterBitmap(true);
        }
        Paint paint2 = this.f16524s;
        double cos = Math.cos((((double) f11) * 3.141592653589793d) / 180.0d);
        int i14 = ((int) (cos * 200.0d)) + 55;
        int pow = (int) (Math.pow(cos, 200.0d) * 70.0d);
        if (i14 > 255) {
            i14 = 255;
        }
        if (pow > 255) {
            pow = 255;
        }
        paint2.setColorFilter(new LightingColorFilter(Color.rgb(i14, i14, i14), Color.rgb(pow, pow, pow)));
        canvas.drawBitmap(bitmap, this.f16523r, this.f16524s);
    }

    public final int b(View view) {
        return (c(view) * 2) + view.getMeasuredHeight();
    }

    public final void a(float f10) {
        VelocityTracker velocityTracker = this.f16516k;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f16516k = null;
            removeCallbacks(this.f16520o);
            if (this.f16518m == null) {
                this.f16518m = new q4(this);
            }
            b2 b2Var = this.f16517l;
            if (b2Var != null) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                b2Var.f15635b = f10;
                b2Var.f15634a = (float) this.f16511f;
                b2Var.f15638e = currentAnimationTimeMillis;
                post(this.f16518m);
            }
            this.f16507b = 0;
        }
    }

    public void a(int i10) {
        int i11;
        int i12 = this.f16510e + i10;
        this.f16511f = i12;
        int height = (-(i12 * 270)) / getHeight();
        this.f16513h = height;
        int i13 = height % 90;
        if (i13 < 45) {
            i11 = (getHeight() * (-(height - i13))) / 270;
        } else {
            i11 = (getHeight() * (-((height + 90) - i13))) / 270;
        }
        if (this.f16525t == Integer.MIN_VALUE && this.f16515j == this.f16506a.getCount() - 1 && a(getChildAt(getChildCount() - 1)) < getHeight()) {
            this.f16525t = i11;
        }
        if (i11 > 0) {
            i11 = 0;
        } else {
            int i14 = this.f16525t;
            if (i11 < i14) {
                i11 = i14;
            }
        }
        b2 b2Var = this.f16517l;
        float f10 = (float) i11;
        b2Var.f15636c = f10;
        b2Var.f15637d = f10;
        requestLayout();
    }

    public final void a(int i10, int i11) {
        while (i10 + i11 < getHeight() && this.f16515j < this.f16506a.getCount() - 1) {
            int i12 = this.f16515j + 1;
            this.f16515j = i12;
            View view = this.f16506a.getView(i12, this.f16519n.size() != 0 ? this.f16519n.removeFirst() : null, this);
            a(view, 0);
            i10 += b(view);
        }
    }

    public final void a(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i11 = i10 == 1 ? 0 : -1;
        view.setDrawingCacheEnabled(true);
        addViewInLayout(view, i11, layoutParams, true);
        view.measure(((int) (((float) getWidth()) * 0.85f)) | 1073741824, 0);
    }

    public final int a(View view) {
        return c(view) + view.getBottom();
    }
}
