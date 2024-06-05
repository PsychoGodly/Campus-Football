package com.onesignal;

import android.content.Context;
import com.onesignal.k3;
import org.json.JSONObject;

/* compiled from: OSNotificationController */
public class y1 {

    /* renamed from: a  reason: collision with root package name */
    private final b2 f28446a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f28447b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f28448c;

    y1(b2 b2Var, boolean z10, boolean z11) {
        this.f28447b = z10;
        this.f28448c = z11;
        this.f28446a = b2Var;
    }

    private b2 a(Context context, w1 w1Var, JSONObject jSONObject, Long l10) {
        b2 b2Var = new b2(context);
        b2Var.q(jSONObject);
        b2Var.z(l10);
        b2Var.y(this.f28447b);
        b2Var.r(w1Var);
        return b2Var;
    }

    private void e(w1 w1Var) {
        this.f28446a.r(w1Var);
        if (this.f28447b) {
            k0.e(this.f28446a);
            return;
        }
        this.f28446a.p(false);
        k0.n(this.f28446a, true, false);
        k3.X0(this.f28446a);
    }

    static void h(Context context) {
        String f10 = OSUtils.f(context, "com.onesignal.NotificationServiceExtension");
        if (f10 == null) {
            k3.A1(k3.r0.VERBOSE, "No class found, not setting up OSRemoteNotificationReceivedHandler");
            return;
        }
        k3.r0 r0Var = k3.r0.VERBOSE;
        k3.A1(r0Var, "Found class: " + f10 + ", attempting to call constructor");
        try {
            Object newInstance = Class.forName(f10).newInstance();
            if ((newInstance instanceof k3.a1) && k3.f27934q == null) {
                k3.A2((k3.a1) newInstance);
            }
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        } catch (InstantiationException e11) {
            e11.printStackTrace();
        } catch (ClassNotFoundException e12) {
            e12.printStackTrace();
        }
    }

    public b2 b() {
        return this.f28446a;
    }

    public g2 c() {
        return new g2(this, this.f28446a.f());
    }

    public boolean d() {
        if (!k3.A0().m()) {
            return true;
        }
        if (this.f28446a.f().w() + ((long) this.f28446a.f().D()) > k3.N0().b() / 1000) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void f(w1 w1Var, w1 w1Var2) {
        if (w1Var2 != null) {
            boolean I = OSUtils.I(w1Var2.i());
            boolean d10 = d();
            if (!I || !d10) {
                e(w1Var);
            } else {
                this.f28446a.r(w1Var2);
                k0.k(this, this.f28448c);
            }
            if (this.f28447b) {
                OSUtils.W(100);
                return;
            }
            return;
        }
        e(w1Var);
    }

    public void g(boolean z10) {
        this.f28448c = z10;
    }

    public String toString() {
        return "OSNotificationController{notificationJob=" + this.f28446a + ", isRestoring=" + this.f28447b + ", isBackgroundLogic=" + this.f28448c + '}';
    }

    y1(Context context, w1 w1Var, JSONObject jSONObject, boolean z10, boolean z11, Long l10) {
        this.f28447b = z10;
        this.f28448c = z11;
        this.f28446a = a(context, w1Var, jSONObject, l10);
    }
}
