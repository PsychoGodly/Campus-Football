package io.flutter.plugin.platform;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.plugin.platform.SingleViewPresentation;
import io.flutter.view.f;

/* compiled from: VirtualDisplayController */
class r {

    /* renamed from: a  reason: collision with root package name */
    SingleViewPresentation f33762a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f33763b;

    /* renamed from: c  reason: collision with root package name */
    private final a f33764c;

    /* renamed from: d  reason: collision with root package name */
    private final int f33765d;

    /* renamed from: e  reason: collision with root package name */
    private final f.c f33766e;

    /* renamed from: f  reason: collision with root package name */
    private final View.OnFocusChangeListener f33767f;

    /* renamed from: g  reason: collision with root package name */
    private final Surface f33768g;

    /* renamed from: h  reason: collision with root package name */
    private VirtualDisplay f33769h;

    /* renamed from: i  reason: collision with root package name */
    private int f33770i;

    /* renamed from: j  reason: collision with root package name */
    private int f33771j;

    /* compiled from: VirtualDisplayController */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f33772a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f33773b;

        /* renamed from: io.flutter.plugin.platform.r$a$a  reason: collision with other inner class name */
        /* compiled from: VirtualDisplayController */
        class C0384a implements Runnable {
            C0384a() {
            }

            public void run() {
                a aVar = a.this;
                aVar.f33772a.postDelayed(aVar.f33773b, 128);
            }
        }

        a(View view, Runnable runnable) {
            this.f33772a = view;
            this.f33773b = runnable;
        }

        public void onViewAttachedToWindow(View view) {
            b.a(this.f33772a, new C0384a());
            this.f33772a.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: VirtualDisplayController */
    static class b implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final View f33776a;

        /* renamed from: b  reason: collision with root package name */
        Runnable f33777b;

        /* compiled from: VirtualDisplayController */
        class a implements Runnable {
            a() {
            }

            public void run() {
                b.this.f33776a.getViewTreeObserver().removeOnDrawListener(b.this);
            }
        }

        b(View view, Runnable runnable) {
            this.f33776a = view;
            this.f33777b = runnable;
        }

        static void a(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new b(view, runnable));
        }

        public void onDraw() {
            Runnable runnable = this.f33777b;
            if (runnable != null) {
                runnable.run();
                this.f33777b = null;
                this.f33776a.post(new a());
            }
        }
    }

    private r(Context context, a aVar, VirtualDisplay virtualDisplay, f fVar, Surface surface, f.c cVar, View.OnFocusChangeListener onFocusChangeListener, int i10, Object obj) {
        Context context2 = context;
        this.f33763b = context2;
        a aVar2 = aVar;
        this.f33764c = aVar2;
        this.f33766e = cVar;
        View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
        this.f33767f = onFocusChangeListener2;
        this.f33768g = surface;
        this.f33769h = virtualDisplay;
        this.f33765d = context.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context2, this.f33769h.getDisplay(), fVar, aVar2, i10, onFocusChangeListener2);
        this.f33762a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public static r a(Context context, a aVar, f fVar, f.c cVar, int i10, int i11, int i12, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        int i13 = i10;
        int i14 = i11;
        context.getResources().getDisplayMetrics();
        if (i13 == 0 || i14 == 0) {
            return null;
        }
        cVar.b().setDefaultBufferSize(i13, i14);
        Surface surface = new Surface(cVar.b());
        VirtualDisplay createVirtualDisplay = ((DisplayManager) context.getSystemService("display")).createVirtualDisplay("flutter-vd", i10, i11, context.getResources().getDisplayMetrics().densityDpi, surface, 0);
        if (createVirtualDisplay == null) {
            return null;
        }
        r rVar = new r(context, aVar, createVirtualDisplay, fVar, surface, cVar, onFocusChangeListener, i12, obj);
        rVar.f33770i = i13;
        rVar.f33771j = i14;
        return rVar;
    }

    public void b(MotionEvent motionEvent) {
        SingleViewPresentation singleViewPresentation = this.f33762a;
        if (singleViewPresentation != null) {
            singleViewPresentation.dispatchTouchEvent(motionEvent);
        }
    }

    public int c() {
        return this.f33771j;
    }

    public int d() {
        return this.f33770i;
    }

    public View e() {
        SingleViewPresentation singleViewPresentation = this.f33762a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }

    /* access modifiers changed from: package-private */
    public void f() {
        SingleViewPresentation singleViewPresentation = this.f33762a;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.f33762a.getView().onInputConnectionLocked();
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        SingleViewPresentation singleViewPresentation = this.f33762a;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.f33762a.getView().onInputConnectionUnlocked();
        }
    }

    public void h(int i10, int i11, Runnable runnable) {
        boolean isFocused = e().isFocused();
        SingleViewPresentation.e detachState = this.f33762a.detachState();
        this.f33769h.setSurface((Surface) null);
        this.f33769h.release();
        this.f33770i = i10;
        this.f33771j = i11;
        this.f33766e.b().setDefaultBufferSize(i10, i11);
        this.f33769h = ((DisplayManager) this.f33763b.getSystemService("display")).createVirtualDisplay("flutter-vd", i10, i11, this.f33765d, this.f33768g, 0);
        View e10 = e();
        e10.addOnAttachStateChangeListener(new a(e10, runnable));
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f33763b, this.f33769h.getDisplay(), this.f33764c, detachState, this.f33767f, isFocused);
        singleViewPresentation.show();
        this.f33762a.cancel();
        this.f33762a = singleViewPresentation;
    }
}
