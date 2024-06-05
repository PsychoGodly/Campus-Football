package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;
import androidx.core.view.a0;
import androidx.core.view.e;

/* compiled from: MenuPopupHelper */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1262a;

    /* renamed from: b  reason: collision with root package name */
    private final g f1263b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f1264c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1265d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1266e;

    /* renamed from: f  reason: collision with root package name */
    private View f1267f;

    /* renamed from: g  reason: collision with root package name */
    private int f1268g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1269h;

    /* renamed from: i  reason: collision with root package name */
    private m.a f1270i;

    /* renamed from: j  reason: collision with root package name */
    private k f1271j;

    /* renamed from: k  reason: collision with root package name */
    private PopupWindow.OnDismissListener f1272k;

    /* renamed from: l  reason: collision with root package name */
    private final PopupWindow.OnDismissListener f1273l;

    /* compiled from: MenuPopupHelper */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        public void onDismiss() {
            l.this.e();
        }
    }

    /* compiled from: MenuPopupHelper */
    static class b {
        static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public l(Context context, g gVar, View view, boolean z10, int i10) {
        this(context, gVar, view, z10, i10, 0);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.q] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.k a() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f1262a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            androidx.appcompat.view.menu.l.b.a(r0, r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f1262a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = h.d.f18202c
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            androidx.appcompat.view.menu.d r0 = new androidx.appcompat.view.menu.d
            android.content.Context r2 = r14.f1262a
            android.view.View r3 = r14.f1267f
            int r4 = r14.f1265d
            int r5 = r14.f1266e
            boolean r6 = r14.f1264c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            androidx.appcompat.view.menu.q r0 = new androidx.appcompat.view.menu.q
            android.content.Context r8 = r14.f1262a
            androidx.appcompat.view.menu.g r9 = r14.f1263b
            android.view.View r10 = r14.f1267f
            int r11 = r14.f1265d
            int r12 = r14.f1266e
            boolean r13 = r14.f1264c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            androidx.appcompat.view.menu.g r1 = r14.f1263b
            r0.k(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f1273l
            r0.t(r1)
            android.view.View r1 = r14.f1267f
            r0.o(r1)
            androidx.appcompat.view.menu.m$a r1 = r14.f1270i
            r0.g(r1)
            boolean r1 = r14.f1269h
            r0.q(r1)
            int r1 = r14.f1268g
            r0.r(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.l.a():androidx.appcompat.view.menu.k");
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        k c10 = c();
        c10.u(z11);
        if (z10) {
            if ((e.b(this.f1268g, a0.B(this.f1267f)) & 7) == 5) {
                i10 -= this.f1267f.getWidth();
            }
            c10.s(i10);
            c10.v(i11);
            int i12 = (int) ((this.f1262a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c10.p(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        c10.show();
    }

    public void b() {
        if (d()) {
            this.f1271j.dismiss();
        }
    }

    public k c() {
        if (this.f1271j == null) {
            this.f1271j = a();
        }
        return this.f1271j;
    }

    public boolean d() {
        k kVar = this.f1271j;
        return kVar != null && kVar.b();
    }

    /* access modifiers changed from: protected */
    public void e() {
        this.f1271j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1272k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f1267f = view;
    }

    public void g(boolean z10) {
        this.f1269h = z10;
        k kVar = this.f1271j;
        if (kVar != null) {
            kVar.q(z10);
        }
    }

    public void h(int i10) {
        this.f1268g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1272k = onDismissListener;
    }

    public void j(m.a aVar) {
        this.f1270i = aVar;
        k kVar = this.f1271j;
        if (kVar != null) {
            kVar.g(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f1267f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f1267f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public l(Context context, g gVar, View view, boolean z10, int i10, int i11) {
        this.f1268g = 8388611;
        this.f1273l = new a();
        this.f1262a = context;
        this.f1263b = gVar;
        this.f1267f = view;
        this.f1264c = z10;
        this.f1265d = i10;
        this.f1266e = i11;
    }
}
