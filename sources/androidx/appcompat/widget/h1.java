package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.a0;
import androidx.core.view.c0;

/* compiled from: TooltipCompatHandler */
class h1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: l  reason: collision with root package name */
    private static h1 f1618l;

    /* renamed from: m  reason: collision with root package name */
    private static h1 f1619m;

    /* renamed from: a  reason: collision with root package name */
    private final View f1620a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f1621b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1622c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f1623d = new g1(this);

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f1624f = new f1(this);

    /* renamed from: g  reason: collision with root package name */
    private int f1625g;

    /* renamed from: h  reason: collision with root package name */
    private int f1626h;

    /* renamed from: i  reason: collision with root package name */
    private i1 f1627i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1628j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1629k;

    private h1(View view, CharSequence charSequence) {
        this.f1620a = view;
        this.f1621b = charSequence;
        this.f1622c = c0.c(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f1620a.removeCallbacks(this.f1623d);
    }

    private void c() {
        this.f1629k = true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        i(false);
    }

    private void f() {
        this.f1620a.postDelayed(this.f1623d, (long) ViewConfiguration.getLongPressTimeout());
    }

    private static void g(h1 h1Var) {
        h1 h1Var2 = f1618l;
        if (h1Var2 != null) {
            h1Var2.b();
        }
        f1618l = h1Var;
        if (h1Var != null) {
            h1Var.f();
        }
    }

    public static void h(View view, CharSequence charSequence) {
        h1 h1Var = f1618l;
        if (h1Var != null && h1Var.f1620a == view) {
            g((h1) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            h1 h1Var2 = f1619m;
            if (h1Var2 != null && h1Var2.f1620a == view) {
                h1Var2.d();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new h1(view, charSequence);
    }

    private boolean j(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f1629k && Math.abs(x10 - this.f1625g) <= this.f1622c && Math.abs(y10 - this.f1626h) <= this.f1622c) {
            return false;
        }
        this.f1625g = x10;
        this.f1626h = y10;
        this.f1629k = false;
        return true;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (f1619m == this) {
            f1619m = null;
            i1 i1Var = this.f1627i;
            if (i1Var != null) {
                i1Var.c();
                this.f1627i = null;
                c();
                this.f1620a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1618l == this) {
            g((h1) null);
        }
        this.f1620a.removeCallbacks(this.f1624f);
    }

    /* access modifiers changed from: package-private */
    public void i(boolean z10) {
        long j10;
        int i10;
        long j11;
        if (a0.Q(this.f1620a)) {
            g((h1) null);
            h1 h1Var = f1619m;
            if (h1Var != null) {
                h1Var.d();
            }
            f1619m = this;
            this.f1628j = z10;
            i1 i1Var = new i1(this.f1620a.getContext());
            this.f1627i = i1Var;
            i1Var.e(this.f1620a, this.f1625g, this.f1626h, this.f1628j, this.f1621b);
            this.f1620a.addOnAttachStateChangeListener(this);
            if (this.f1628j) {
                j10 = 2500;
            } else {
                if ((a0.K(this.f1620a) & 1) == 1) {
                    j11 = 3000;
                    i10 = ViewConfiguration.getLongPressTimeout();
                } else {
                    j11 = 15000;
                    i10 = ViewConfiguration.getLongPressTimeout();
                }
                j10 = j11 - ((long) i10);
            }
            this.f1620a.removeCallbacks(this.f1624f);
            this.f1620a.postDelayed(this.f1624f, j10);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1627i != null && this.f1628j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1620a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f1620a.isEnabled() && this.f1627i == null && j(motionEvent)) {
            g(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f1625g = view.getWidth() / 2;
        this.f1626h = view.getHeight() / 2;
        i(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
