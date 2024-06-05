package com.onesignal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.onesignal.k3;
import com.onesignal.s;
import com.onesignal.x4;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;

/* compiled from: InAppMessageView */
class d0 {

    /* renamed from: v  reason: collision with root package name */
    private static final int f27591v = Color.parseColor("#00000000");

    /* renamed from: w  reason: collision with root package name */
    private static final int f27592w = Color.parseColor("#BB000000");

    /* renamed from: x  reason: collision with root package name */
    private static final int f27593x = h3.b(4);

    /* renamed from: a  reason: collision with root package name */
    private PopupWindow f27594a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Activity f27595b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f27596c = new Handler();

    /* renamed from: d  reason: collision with root package name */
    private int f27597d;

    /* renamed from: e  reason: collision with root package name */
    private int f27598e;

    /* renamed from: f  reason: collision with root package name */
    private int f27599f = h3.b(24);

    /* renamed from: g  reason: collision with root package name */
    private int f27600g = h3.b(24);

    /* renamed from: h  reason: collision with root package name */
    private int f27601h = h3.b(24);

    /* renamed from: i  reason: collision with root package name */
    private int f27602i = h3.b(24);

    /* renamed from: j  reason: collision with root package name */
    private double f27603j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public boolean f27604k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public boolean f27605l = false;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public boolean f27606m = false;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f27607n = false;

    /* renamed from: o  reason: collision with root package name */
    private e1 f27608o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public x4.m f27609p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public WebView f27610q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public RelativeLayout f27611r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public s f27612s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public j f27613t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public Runnable f27614u;

    /* compiled from: InAppMessageView */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f27615a;

        a(int i10) {
            this.f27615a = i10;
        }

        public void run() {
            if (d0.this.f27610q == null) {
                k3.A1(k3.r0.WARN, "WebView height update skipped, new height will be used once it is displayed.");
                return;
            }
            ViewGroup.LayoutParams layoutParams = d0.this.f27610q.getLayoutParams();
            if (layoutParams == null) {
                k3.A1(k3.r0.WARN, "WebView height update skipped because of null layoutParams, new height will be used once it is displayed.");
                return;
            }
            layoutParams.height = this.f27615a;
            d0.this.f27610q.setLayoutParams(layoutParams);
            if (d0.this.f27612s != null) {
                s b10 = d0.this.f27612s;
                d0 d0Var = d0.this;
                b10.i(d0Var.F(this.f27615a, d0Var.f27609p, d0.this.f27607n));
            }
        }
    }

    /* compiled from: InAppMessageView */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RelativeLayout.LayoutParams f27617a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RelativeLayout.LayoutParams f27618b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s.c f27619c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x4.m f27620d;

        b(RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, s.c cVar, x4.m mVar) {
            this.f27617a = layoutParams;
            this.f27618b = layoutParams2;
            this.f27619c = cVar;
            this.f27620d = mVar;
        }

        public void run() {
            if (d0.this.f27610q != null) {
                d0.this.f27610q.setLayoutParams(this.f27617a);
                Context applicationContext = d0.this.f27595b.getApplicationContext();
                d0.this.S(applicationContext, this.f27618b, this.f27619c);
                d0.this.T(applicationContext);
                d0 d0Var = d0.this;
                d0Var.H(d0Var.f27611r);
                if (d0.this.f27613t != null) {
                    d0 d0Var2 = d0.this;
                    d0Var2.z(this.f27620d, d0Var2.f27612s, d0.this.f27611r);
                }
                d0.this.Y();
            }
        }
    }

    /* compiled from: InAppMessageView */
    class c implements s.b {
        c() {
        }

        public void a() {
            boolean unused = d0.this.f27606m = true;
        }

        public void b() {
            boolean unused = d0.this.f27606m = false;
        }

        public void onDismiss() {
            if (d0.this.f27613t != null) {
                d0.this.f27613t.c();
            }
            d0.this.L((x4.l) null);
        }
    }

    /* compiled from: InAppMessageView */
    class d implements Runnable {
        d() {
        }

        public void run() {
            if (d0.this.f27613t != null) {
                d0.this.f27613t.c();
            }
            if (d0.this.f27595b != null) {
                d0.this.K((x4.l) null);
                Runnable unused = d0.this.f27614u = null;
                return;
            }
            boolean unused2 = d0.this.f27605l = true;
        }
    }

    /* compiled from: InAppMessageView */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f27624a;

        e(Activity activity) {
            this.f27624a = activity;
        }

        public void run() {
            d0.this.I(this.f27624a);
        }
    }

    /* compiled from: InAppMessageView */
    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x4.l f27626a;

        f(x4.l lVar) {
            this.f27626a = lVar;
        }

        public void run() {
            if (!d0.this.f27604k || d0.this.f27611r == null) {
                d0.this.C();
                x4.l lVar = this.f27626a;
                if (lVar != null) {
                    lVar.a();
                    return;
                }
                return;
            }
            d0 d0Var = d0.this;
            d0Var.v(d0Var.f27611r, this.f27626a);
        }
    }

    /* compiled from: InAppMessageView */
    class g implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r.a f27628a;

        g(r.a aVar) {
            this.f27628a = aVar;
        }

        public void onAnimationEnd(Animation animation) {
            if (Build.VERSION.SDK_INT == 23) {
                this.f27628a.setCardElevation((float) h3.b(5));
            }
            if (d0.this.f27613t != null) {
                d0.this.f27613t.b();
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: InAppMessageView */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x4.l f27630a;

        h(x4.l lVar) {
            this.f27630a = lVar;
        }

        public void onAnimationEnd(Animator animator) {
            d0.this.C();
            x4.l lVar = this.f27630a;
            if (lVar != null) {
                lVar.a();
            }
        }
    }

    /* compiled from: InAppMessageView */
    static /* synthetic */ class i {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27632a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.onesignal.x4$m[] r0 = com.onesignal.x4.m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27632a = r0
                com.onesignal.x4$m r1 = com.onesignal.x4.m.TOP_BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27632a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onesignal.x4$m r1 = com.onesignal.x4.m.BOTTOM_BANNER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27632a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onesignal.x4$m r1 = com.onesignal.x4.m.CENTER_MODAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27632a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onesignal.x4$m r1 = com.onesignal.x4.m.FULL_SCREEN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.d0.i.<clinit>():void");
        }
    }

    /* compiled from: InAppMessageView */
    interface j {
        void a();

        void b();

        void c();
    }

    d0(WebView webView, e1 e1Var, boolean z10) {
        this.f27610q = webView;
        this.f27609p = e1Var.c();
        this.f27598e = e1Var.d();
        this.f27597d = -1;
        this.f27603j = e1Var.b() == null ? 0.0d : e1Var.b().doubleValue();
        this.f27604k = !this.f27609p.a();
        this.f27607n = z10;
        this.f27608o = e1Var;
        Q(e1Var);
    }

    private void A(View view, int i10, Animation.AnimationListener animationListener) {
        m3.a(view, (float) ((-i10) - this.f27601h), 0.0f, 1000, new o3(0.1d, 8.0d), animationListener).start();
    }

    /* access modifiers changed from: private */
    public void C() {
        P();
        j jVar = this.f27613t;
        if (jVar != null) {
            jVar.a();
        }
    }

    private Animation.AnimationListener D(r.a aVar) {
        return new g(aVar);
    }

    private r.a E(Context context) {
        r.a aVar = new r.a(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f27609p == x4.m.FULL_SCREEN ? -1 : -2);
        layoutParams.addRule(13);
        aVar.setLayoutParams(layoutParams);
        if (Build.VERSION.SDK_INT == 23) {
            aVar.setCardElevation(0.0f);
        } else {
            aVar.setCardElevation((float) h3.b(5));
        }
        aVar.setRadius((float) h3.b(8));
        aVar.setClipChildren(false);
        aVar.setClipToPadding(false);
        aVar.setPreventCornerOverlap(false);
        aVar.setCardBackgroundColor(0);
        return aVar;
    }

    /* access modifiers changed from: private */
    public s.c F(int i10, x4.m mVar, boolean z10) {
        s.c cVar = new s.c();
        cVar.f28129d = this.f27600g;
        cVar.f28127b = this.f27601h;
        cVar.f28133h = z10;
        cVar.f28131f = i10;
        cVar.f28130e = N();
        int i11 = i.f27632a[mVar.ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            cVar.f28128c = this.f27601h - f27593x;
        } else if (i11 != 2) {
            if (i11 != 3) {
                if (i11 == 4) {
                    i10 = N() - (this.f27602i + this.f27601h);
                    cVar.f28131f = i10;
                }
            }
            int N = (N() / 2) - (i10 / 2);
            cVar.f28128c = f27593x + N;
            cVar.f28127b = N;
            cVar.f28126a = N;
        } else {
            cVar.f28126a = N() - i10;
            cVar.f28128c = this.f27602i + f27593x;
        }
        if (mVar == x4.m.TOP_BANNER) {
            i12 = 0;
        }
        cVar.f28132g = i12;
        return cVar;
    }

    private RelativeLayout.LayoutParams G() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f27597d, -1);
        int i10 = i.f27632a[this.f27609p.ordinal()];
        if (i10 == 1) {
            layoutParams.addRule(10);
            layoutParams.addRule(14);
        } else if (i10 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(14);
        } else if (i10 == 3 || i10 == 4) {
            layoutParams.addRule(13);
        }
        return layoutParams;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r5 != 4) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void H(android.widget.RelativeLayout r5) {
        /*
            r4 = this;
            android.widget.PopupWindow r0 = new android.widget.PopupWindow
            boolean r1 = r4.f27604k
            r2 = -1
            if (r1 == 0) goto L_0x0009
            r3 = -1
            goto L_0x000b
        L_0x0009:
            int r3 = r4.f27597d
        L_0x000b:
            if (r1 == 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r2 = -2
        L_0x000f:
            r1 = 1
            r0.<init>(r5, r3, r2, r1)
            r4.f27594a = r0
            android.graphics.drawable.ColorDrawable r5 = new android.graphics.drawable.ColorDrawable
            r2 = 0
            r5.<init>(r2)
            r0.setBackgroundDrawable(r5)
            android.widget.PopupWindow r5 = r4.f27594a
            r5.setTouchable(r1)
            android.widget.PopupWindow r5 = r4.f27594a
            r5.setClippingEnabled(r2)
            boolean r5 = r4.f27604k
            if (r5 != 0) goto L_0x0048
            int[] r5 = com.onesignal.d0.i.f27632a
            com.onesignal.x4$m r0 = r4.f27609p
            int r0 = r0.ordinal()
            r5 = r5[r0]
            if (r5 == r1) goto L_0x0045
            r0 = 2
            if (r5 == r0) goto L_0x0042
            r0 = 3
            if (r5 == r0) goto L_0x0049
            r0 = 4
            if (r5 == r0) goto L_0x0049
            goto L_0x0048
        L_0x0042:
            r1 = 81
            goto L_0x0049
        L_0x0045:
            r1 = 49
            goto L_0x0049
        L_0x0048:
            r1 = 0
        L_0x0049:
            com.onesignal.e1 r5 = r4.f27608o
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x0054
            r5 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0056
        L_0x0054:
            r5 = 1003(0x3eb, float:1.406E-42)
        L_0x0056:
            android.widget.PopupWindow r0 = r4.f27594a
            androidx.core.widget.h.b(r0, r5)
            android.widget.PopupWindow r5 = r4.f27594a
            android.app.Activity r0 = r4.f27595b
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.View r0 = r0.getRootView()
            r5.showAtLocation(r0, r1, r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.d0.H(android.widget.RelativeLayout):void");
    }

    /* access modifiers changed from: private */
    public void I(Activity activity) {
        if (!h3.k(activity) || this.f27611r != null) {
            new Handler().postDelayed(new e(activity), 200);
        } else {
            W(activity);
        }
    }

    private void J() {
        this.f27611r = null;
        this.f27612s = null;
        this.f27610q = null;
    }

    /* access modifiers changed from: private */
    public void L(x4.l lVar) {
        OSUtils.S(new f(lVar), 600);
    }

    private int N() {
        return h3.f(this.f27595b);
    }

    private void Q(e1 e1Var) {
        int i10 = 0;
        this.f27601h = e1Var.e() ? h3.b(24) : 0;
        this.f27602i = e1Var.e() ? h3.b(24) : 0;
        this.f27599f = e1Var.f() ? h3.b(24) : 0;
        if (e1Var.f()) {
            i10 = h3.b(24);
        }
        this.f27600g = i10;
    }

    /* access modifiers changed from: private */
    public void S(Context context, RelativeLayout.LayoutParams layoutParams, s.c cVar) {
        s sVar = new s(context);
        this.f27612s = sVar;
        if (layoutParams != null) {
            sVar.setLayoutParams(layoutParams);
        }
        this.f27612s.i(cVar);
        this.f27612s.h(new c());
        if (this.f27610q.getParent() != null) {
            ((ViewGroup) this.f27610q.getParent()).removeAllViews();
        }
        r.a E = E(context);
        E.setTag("IN_APP_MESSAGE_CARD_VIEW_TAG");
        E.addView(this.f27610q);
        this.f27612s.setPadding(this.f27599f, this.f27601h, this.f27600g, this.f27602i);
        this.f27612s.setClipChildren(false);
        this.f27612s.setClipToPadding(false);
        this.f27612s.addView(E);
    }

    /* access modifiers changed from: private */
    public void T(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f27611r = relativeLayout;
        relativeLayout.setBackgroundDrawable(new ColorDrawable(0));
        this.f27611r.setClipChildren(false);
        this.f27611r.setClipToPadding(false);
        this.f27611r.addView(this.f27612s);
    }

    private void V(x4.m mVar, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, s.c cVar) {
        OSUtils.T(new b(layoutParams, layoutParams2, cVar, mVar));
    }

    /* access modifiers changed from: private */
    public void Y() {
        if (this.f27603j > 0.0d && this.f27614u == null) {
            d dVar = new d();
            this.f27614u = dVar;
            this.f27596c.postDelayed(dVar, ((long) this.f27603j) * 1000);
        }
    }

    /* access modifiers changed from: private */
    public void v(View view, x4.l lVar) {
        View view2 = view;
        w(view2, CommonGatewayClient.CODE_400, f27592w, f27591v, new h(lVar)).start();
    }

    private ValueAnimator w(View view, int i10, int i11, int i12, Animator.AnimatorListener animatorListener) {
        return m3.b(view, i10, i11, i12, animatorListener);
    }

    private void x(View view, int i10, Animation.AnimationListener animationListener) {
        m3.a(view, (float) (i10 + this.f27602i), 0.0f, 1000, new o3(0.1d, 8.0d), animationListener).start();
    }

    private void y(View view, View view2, Animation.AnimationListener animationListener, Animator.AnimatorListener animatorListener) {
        Animation c10 = m3.c(view, 1000, new o3(0.1d, 8.0d), animationListener);
        ValueAnimator w10 = w(view2, CommonGatewayClient.CODE_400, f27591v, f27592w, animatorListener);
        c10.start();
        w10.start();
    }

    /* access modifiers changed from: private */
    public void z(x4.m mVar, View view, View view2) {
        r.a aVar = (r.a) view.findViewWithTag("IN_APP_MESSAGE_CARD_VIEW_TAG");
        Animation.AnimationListener D = D(aVar);
        int i10 = i.f27632a[mVar.ordinal()];
        if (i10 == 1) {
            A(aVar, this.f27610q.getHeight(), D);
        } else if (i10 == 2) {
            x(aVar, this.f27610q.getHeight(), D);
        } else if (i10 == 3 || i10 == 4) {
            y(view, view2, D, (Animator.AnimatorListener) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void B() {
        if (this.f27605l) {
            this.f27605l = false;
            L((x4.l) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void K(x4.l lVar) {
        s sVar = this.f27612s;
        if (sVar == null) {
            k3.b(k3.r0.ERROR, "No host presenter to trigger dismiss animation, counting as dismissed already", new Throwable());
            J();
            if (lVar != null) {
                lVar.a();
                return;
            }
            return;
        }
        sVar.g();
        L(lVar);
    }

    /* access modifiers changed from: package-private */
    public x4.m M() {
        return this.f27609p;
    }

    /* access modifiers changed from: package-private */
    public boolean O() {
        return this.f27606m;
    }

    /* access modifiers changed from: package-private */
    public void P() {
        k3.A1(k3.r0.DEBUG, "InAppMessageView removing views");
        Runnable runnable = this.f27614u;
        if (runnable != null) {
            this.f27596c.removeCallbacks(runnable);
            this.f27614u = null;
        }
        s sVar = this.f27612s;
        if (sVar != null) {
            sVar.removeAllViews();
        }
        PopupWindow popupWindow = this.f27594a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        J();
    }

    /* access modifiers changed from: package-private */
    public void R(j jVar) {
        this.f27613t = jVar;
    }

    /* access modifiers changed from: package-private */
    public void U(WebView webView) {
        this.f27610q = webView;
        webView.setBackgroundColor(0);
    }

    /* access modifiers changed from: package-private */
    public void W(Activity activity) {
        this.f27595b = activity;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f27598e);
        layoutParams.addRule(13);
        RelativeLayout.LayoutParams G = this.f27604k ? G() : null;
        x4.m mVar = this.f27609p;
        V(mVar, layoutParams, G, F(this.f27598e, mVar, this.f27607n));
    }

    /* access modifiers changed from: package-private */
    public void X(Activity activity) {
        I(activity);
    }

    /* access modifiers changed from: package-private */
    public void Z(int i10) {
        this.f27598e = i10;
        OSUtils.T(new a(i10));
    }

    public String toString() {
        return "InAppMessageView{currentActivity=" + this.f27595b + ", pageWidth=" + this.f27597d + ", pageHeight=" + this.f27598e + ", displayDuration=" + this.f27603j + ", hasBackground=" + this.f27604k + ", shouldDismissWhenActive=" + this.f27605l + ", isDragging=" + this.f27606m + ", disableDragDismiss=" + this.f27607n + ", displayLocation=" + this.f27609p + ", webView=" + this.f27610q + '}';
    }
}
