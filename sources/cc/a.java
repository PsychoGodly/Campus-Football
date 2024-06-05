package cc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import bd.h;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;

/* compiled from: FlutterMutatorView */
public class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private FlutterMutatorsStack f31960a;

    /* renamed from: b  reason: collision with root package name */
    private float f31961b;

    /* renamed from: c  reason: collision with root package name */
    private int f31962c;

    /* renamed from: d  reason: collision with root package name */
    private int f31963d;

    /* renamed from: f  reason: collision with root package name */
    private int f31964f;

    /* renamed from: g  reason: collision with root package name */
    private int f31965g;

    /* renamed from: h  reason: collision with root package name */
    private final io.flutter.embedding.android.a f31966h;

    /* renamed from: i  reason: collision with root package name */
    ViewTreeObserver.OnGlobalFocusChangeListener f31967i;

    /* renamed from: cc.a$a  reason: collision with other inner class name */
    /* compiled from: FlutterMutatorView */
    class C0356a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f31968a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f31969b;

        C0356a(View.OnFocusChangeListener onFocusChangeListener, View view) {
            this.f31968a = onFocusChangeListener;
            this.f31969b = view;
        }

        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f31968a;
            View view3 = this.f31969b;
            onFocusChangeListener.onFocusChange(view3, h.d(view3));
        }
    }

    public a(Context context, float f10, io.flutter.embedding.android.a aVar) {
        super(context, (AttributeSet) null);
        this.f31961b = f10;
        this.f31966h = aVar;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f31960a.getFinalMatrix());
        float f10 = this.f31961b;
        matrix.preScale(1.0f / f10, 1.0f / f10);
        matrix.postTranslate((float) (-this.f31962c), (float) (-this.f31963d));
        return matrix;
    }

    public void a(FlutterMutatorsStack flutterMutatorsStack, int i10, int i11, int i12, int i13) {
        this.f31960a = flutterMutatorsStack;
        this.f31962c = i10;
        this.f31963d = i11;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = i11;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    public void b() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (onGlobalFocusChangeListener = this.f31967i) != null) {
            this.f31967i = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public void draw(Canvas canvas) {
        canvas.save();
        for (Path path : this.f31960a.getFinalClippingPaths()) {
            Path path2 = new Path(path);
            path2.offset((float) (-this.f31962c), (float) (-this.f31963d));
            canvas.clipPath(path2);
        }
        super.draw(canvas);
        canvas.restore();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f31966h == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i10 = this.f31962c;
            this.f31964f = i10;
            int i11 = this.f31963d;
            this.f31965g = i11;
            matrix.postTranslate((float) i10, (float) i11);
        } else if (action != 2) {
            matrix.postTranslate((float) this.f31962c, (float) this.f31963d);
        } else {
            matrix.postTranslate((float) this.f31964f, (float) this.f31965g);
            this.f31964f = this.f31962c;
            this.f31965g = this.f31963d;
        }
        return this.f31966h.g(motionEvent, matrix);
    }

    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f31967i == null) {
            C0356a aVar = new C0356a(onFocusChangeListener, this);
            this.f31967i = aVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(aVar);
        }
    }
}
