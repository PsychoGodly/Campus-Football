package com.onesignal;

import com.onesignal.u3;
import ia.e;

/* compiled from: OSRemoteParamController */
class o2 {

    /* renamed from: a  reason: collision with root package name */
    private u3.f f28075a = null;

    o2() {
    }

    private void q(boolean z10) {
        t3.j(t3.f28204a, "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", z10);
    }

    private void s(boolean z10) {
        t3.j(t3.f28204a, "OS_RESTORE_TTL_FILTER", this.f28075a.f28249h);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f28075a = null;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return t3.b(t3.f28204a, "OS_CLEAR_GROUP_SUMMARY_CLICK", true);
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return t3.b(t3.f28204a, "GT_FIREBASE_TRACKING_ENABLED", false);
    }

    /* access modifiers changed from: package-private */
    public u3.f d() {
        return this.f28075a;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return t3.b(t3.f28204a, "ONESIGNAL_USER_PROVIDED_CONSENT", false);
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        u3.f fVar = this.f28075a;
        return (fVar == null || fVar.f28254m == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        u3.f fVar = this.f28075a;
        return (fVar == null || fVar.f28255n == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return t3.b(t3.f28204a, "PREFS_OS_DISABLE_GMS_MISSING_PROMPT", false);
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return t3.b(t3.f28204a, "PREFS_OS_LOCATION_SHARED", true);
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return t3.b(t3.f28204a, "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", false);
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return t3.b(t3.f28204a, "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", false);
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f28075a != null;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return t3.b(t3.f28204a, "OS_RESTORE_TTL_FILTER", true);
    }

    /* access modifiers changed from: package-private */
    public void n(boolean z10) {
        t3.j(t3.f28204a, "PREFS_OS_DISABLE_GMS_MISSING_PROMPT", z10);
    }

    /* access modifiers changed from: package-private */
    public void o(boolean z10) {
        t3.j(t3.f28204a, "PREFS_OS_LOCATION_SHARED", z10);
    }

    /* access modifiers changed from: package-private */
    public void p(boolean z10) {
        t3.j(t3.f28204a, "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", z10);
    }

    /* access modifiers changed from: package-private */
    public void r(u3.f fVar, e eVar, t2 t2Var, v1 v1Var) {
        this.f28075a = fVar;
        String str = t3.f28204a;
        t3.j(str, "GT_FIREBASE_TRACKING_ENABLED", fVar.f28248g);
        s(fVar.f28249h);
        t3.j(str, "OS_CLEAR_GROUP_SUMMARY_CLICK", fVar.f28250i);
        t3.j(str, t2Var.h(), fVar.f28256o.f28241h);
        q(fVar.f28251j);
        v1Var.d("OneSignal saveInfluenceParams: " + fVar.f28256o.toString());
        eVar.j(fVar.f28256o);
        Boolean bool = fVar.f28252k;
        if (bool != null) {
            n(bool.booleanValue());
        }
        Boolean bool2 = fVar.f28253l;
        if (bool2 != null) {
            t(bool2.booleanValue());
        }
        Boolean bool3 = fVar.f28254m;
        if (bool3 != null) {
            k3.J2(bool3.booleanValue());
        }
        Boolean bool4 = fVar.f28255n;
        if (bool4 != null) {
            p(bool4.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    public void t(boolean z10) {
        t3.j(t3.f28204a, "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", z10);
    }

    /* access modifiers changed from: package-private */
    public void u(boolean z10) {
        t3.j(t3.f28204a, "ONESIGNAL_USER_PROVIDED_CONSENT", z10);
    }

    /* access modifiers changed from: package-private */
    public boolean v() {
        return t3.b(t3.f28204a, "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", true);
    }
}
