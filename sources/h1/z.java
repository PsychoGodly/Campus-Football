package h1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.a0;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: ViewOverlayApi14 */
class z implements b0 {

    /* renamed from: a  reason: collision with root package name */
    protected a f18711a;

    /* compiled from: ViewOverlayApi14 */
    static class a extends ViewGroup {

        /* renamed from: g  reason: collision with root package name */
        static Method f18712g;

        /* renamed from: a  reason: collision with root package name */
        ViewGroup f18713a;

        /* renamed from: b  reason: collision with root package name */
        View f18714b;

        /* renamed from: c  reason: collision with root package name */
        ArrayList<Drawable> f18715c = null;

        /* renamed from: d  reason: collision with root package name */
        z f18716d;

        /* renamed from: f  reason: collision with root package name */
        private boolean f18717f;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                f18712g = cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{cls2, cls2, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, z zVar) {
            super(context);
            this.f18713a = viewGroup;
            this.f18714b = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f18716d = zVar;
        }

        private void c() {
            if (this.f18717f) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f18715c;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f18717f = true;
                    this.f18713a.removeView(this);
                }
            }
        }

        private void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f18713a.getLocationOnScreen(iArr2);
            this.f18714b.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void a(Drawable drawable) {
            c();
            if (this.f18715c == null) {
                this.f18715c = new ArrayList<>();
            }
            if (!this.f18715c.contains(drawable)) {
                this.f18715c.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f18713a || viewGroup.getParent() == null || !a0.Q(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f18713a.getLocationOnScreen(iArr2);
                    a0.X(view, iArr[0] - iArr2[0]);
                    a0.Y(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f18713a.getLocationOnScreen(iArr);
            this.f18714b.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f18714b.getWidth(), this.f18714b.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f18715c;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f18715c.get(i10).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public void f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f18715c;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
                d();
            }
        }

        public void g(View view) {
            super.removeView(view);
            d();
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f18713a == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f18713a instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                e(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f18715c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f18715c
                if (r0 == 0) goto L_0x0011
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0014
            L_0x0013:
                r2 = 1
            L_0x0014:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: h1.z.a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }
    }

    z(Context context, ViewGroup viewGroup, View view) {
        this.f18711a = new a(context, viewGroup, view, this);
    }

    static z e(View view) {
        ViewGroup f10 = f(view);
        if (f10 == null) {
            return null;
        }
        int childCount = f10.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = f10.getChildAt(i10);
            if (childAt instanceof a) {
                return ((a) childAt).f18716d;
            }
        }
        return new u(f10.getContext(), f10, view);
    }

    static ViewGroup f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    public void a(Drawable drawable) {
        this.f18711a.a(drawable);
    }

    public void b(Drawable drawable) {
        this.f18711a.f(drawable);
    }
}
