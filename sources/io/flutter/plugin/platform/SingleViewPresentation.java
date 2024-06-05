package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Keep
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private a rootView;
    private boolean startFocused = false;
    private final e state;
    private int viewId;

    private static class a extends FrameLayout {

        /* renamed from: a  reason: collision with root package name */
        private final a f33679a;

        /* renamed from: b  reason: collision with root package name */
        private final View f33680b;

        public a(Context context, a aVar, View view) {
            super(context);
            this.f33679a = aVar;
            this.f33680b = view;
        }

        public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f33679a.b(this.f33680b, view, accessibilityEvent);
        }
    }

    static class b extends ViewGroup {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f33681a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        private final Rect f33682b = new Rect();

        public b(Context context) {
            super(context);
        }

        private static int a(int i10) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), RecyclerView.UNDEFINED_DURATION);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
                this.f33681a.set(i10, i11, i12, i13);
                Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f33681a, layoutParams.x, layoutParams.y, this.f33682b);
                Rect rect = this.f33682b;
                childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i10, int i11) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                getChildAt(i12).measure(a(i10), a(i11));
            }
            super.onMeasure(i10, i11);
        }
    }

    private static class c extends ContextWrapper {

        /* renamed from: a  reason: collision with root package name */
        private final InputMethodManager f33683a;

        c(Context context) {
            this(context, (InputMethodManager) null);
        }

        public Context createDisplayContext(Display display) {
            return new c(super.createDisplayContext(display), this.f33683a);
        }

        public Object getSystemService(String str) {
            if ("input_method".equals(str)) {
                return this.f33683a;
            }
            return super.getSystemService(str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.view.inputmethod.InputMethodManager} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private c(android.content.Context r1, android.view.inputmethod.InputMethodManager r2) {
            /*
                r0 = this;
                r0.<init>(r1)
                if (r2 == 0) goto L_0x0006
                goto L_0x000f
            L_0x0006:
                java.lang.String r2 = "input_method"
                java.lang.Object r1 = r1.getSystemService(r2)
                r2 = r1
                android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            L_0x000f:
                r0.f33683a = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.platform.SingleViewPresentation.c.<init>(android.content.Context, android.view.inputmethod.InputMethodManager):void");
        }
    }

    private static class d extends ContextWrapper {

        /* renamed from: a  reason: collision with root package name */
        private final f f33684a;

        /* renamed from: b  reason: collision with root package name */
        private WindowManager f33685b;

        /* renamed from: c  reason: collision with root package name */
        private final Context f33686c;

        d(Context context, f fVar, Context context2) {
            super(context);
            this.f33684a = fVar;
            this.f33686c = context2;
        }

        private WindowManager a() {
            if (this.f33685b == null) {
                this.f33685b = this.f33684a.b();
            }
            return this.f33685b;
        }

        private boolean b() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            int i10 = 0;
            while (i10 < stackTrace.length && i10 < 11) {
                if (stackTrace[i10].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i10].getMethodName().equals("<init>")) {
                    return true;
                }
                i10++;
            }
            return false;
        }

        public Object getSystemService(String str) {
            if (!"window".equals(str)) {
                return super.getSystemService(str);
            }
            if (b()) {
                return this.f33686c.getSystemService(str);
            }
            return a();
        }
    }

    static class e {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public f f33687a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public f f33688b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public b f33689c;

        e() {
        }
    }

    static class f implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final WindowManager f33690a;

        /* renamed from: b  reason: collision with root package name */
        b f33691b;

        f(WindowManager windowManager, b bVar) {
            this.f33690a = windowManager;
            this.f33691b = bVar;
        }

        private void a(Object[] objArr) {
            b bVar = this.f33691b;
            if (bVar == null) {
                xb.b.g(SingleViewPresentation.TAG, "Embedded view called addView while detached from presentation");
            } else {
                bVar.addView(objArr[0], objArr[1]);
            }
        }

        private void c(Object[] objArr) {
            b bVar = this.f33691b;
            if (bVar == null) {
                xb.b.g(SingleViewPresentation.TAG, "Embedded view called removeView while detached from presentation");
            } else {
                bVar.removeView(objArr[0]);
            }
        }

        private void d(Object[] objArr) {
            if (this.f33691b == null) {
                xb.b.g(SingleViewPresentation.TAG, "Embedded view called removeViewImmediate while detached from presentation");
                return;
            }
            View view = objArr[0];
            view.clearAnimation();
            this.f33691b.removeView(view);
        }

        private void e(Object[] objArr) {
            b bVar = this.f33691b;
            if (bVar == null) {
                xb.b.g(SingleViewPresentation.TAG, "Embedded view called updateViewLayout while detached from presentation");
            } else {
                bVar.updateViewLayout(objArr[0], objArr[1]);
            }
        }

        public WindowManager b() {
            return (WindowManager) Proxy.newProxyInstance(WindowManager.class.getClassLoader(), new Class[]{WindowManager.class}, this);
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            name.hashCode();
            char c10 = 65535;
            switch (name.hashCode()) {
                case -1148522778:
                    if (name.equals("addView")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 542766184:
                    if (name.equals("removeViewImmediate")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 931413976:
                    if (name.equals("updateViewLayout")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1098630473:
                    if (name.equals("removeView")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a(objArr);
                    return null;
                case 1:
                    d(objArr);
                    return null;
                case 2:
                    e(objArr);
                    return null;
                case 3:
                    c(objArr);
                    return null;
                default:
                    try {
                        return method.invoke(this.f33690a, objArr);
                    } catch (InvocationTargetException e10) {
                        throw e10.getCause();
                    }
            }
        }
    }

    public SingleViewPresentation(Context context, Display display, f fVar, a aVar, int i10, View.OnFocusChangeListener onFocusChangeListener) {
        super(new c(context), display);
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i10;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        e eVar = new e();
        this.state = eVar;
        f unused = eVar.f33687a = fVar;
        getWindow().setFlags(8, 8);
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().setType(2030);
        }
    }

    public e detachState() {
        this.container.removeAllViews();
        this.rootView.removeAllViews();
        return this.state;
    }

    public f getView() {
        return this.state.f33687a;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (this.state.f33689c == null) {
            b unused = this.state.f33689c = new b(getContext());
        }
        if (this.state.f33688b == null) {
            e eVar = this.state;
            f unused2 = eVar.f33688b = new f((WindowManager) getContext().getSystemService("window"), eVar.f33689c);
        }
        this.container = new FrameLayout(getContext());
        d dVar = new d(getContext(), this.state.f33688b, this.outerContext);
        View view = this.state.f33687a.getView();
        if (view.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) view.getContext()).setBaseContext(dVar);
        } else {
            xb.b.g(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(view);
        a aVar = new a(getContext(), this.accessibilityEventsDelegate, view);
        this.rootView = aVar;
        aVar.addView(this.container);
        this.rootView.addView(this.state.f33689c);
        view.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public SingleViewPresentation(Context context, Display display, a aVar, e eVar, View.OnFocusChangeListener onFocusChangeListener, boolean z10) {
        super(new c(context), display);
        this.accessibilityEventsDelegate = aVar;
        this.state = eVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z10;
    }
}
