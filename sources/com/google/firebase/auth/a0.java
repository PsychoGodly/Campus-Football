package com.google.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzafn;
import com.google.android.gms.tasks.Task;
import i5.a;
import java.util.List;
import y6.f;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public abstract class a0 extends a implements c1 {
    public abstract String B();

    public abstract boolean C();

    public Task<i> I(h hVar) {
        q.k(hVar);
        return FirebaseAuth.getInstance(l0()).O(this, hVar);
    }

    public Task<i> J(h hVar) {
        q.k(hVar);
        return FirebaseAuth.getInstance(l0()).v0(this, hVar);
    }

    public Task<Void> K() {
        return FirebaseAuth.getInstance(l0()).n0(this);
    }

    public Task<Void> L() {
        return FirebaseAuth.getInstance(l0()).U(this, false).continueWithTask(new l1(this));
    }

    public Task<Void> Y(e eVar) {
        return FirebaseAuth.getInstance(l0()).U(this, false).continueWithTask(new k1(this, eVar));
    }

    public Task<i> Z(Activity activity, n nVar) {
        q.k(activity);
        q.k(nVar);
        return FirebaseAuth.getInstance(l0()).K(activity, nVar, this);
    }

    public abstract String c();

    public Task<i> c0(Activity activity, n nVar) {
        q.k(activity);
        q.k(nVar);
        return FirebaseAuth.getInstance(l0()).m0(activity, nVar, this);
    }

    public Task<i> d0(String str) {
        q.g(str);
        return FirebaseAuth.getInstance(l0()).o0(this, str);
    }

    public abstract Uri e();

    @Deprecated
    public Task<Void> e0(String str) {
        q.g(str);
        return FirebaseAuth.getInstance(l0()).w0(this, str);
    }

    public Task<Void> f0(String str) {
        q.g(str);
        return FirebaseAuth.getInstance(l0()).y0(this, str);
    }

    public Task<Void> g0(o0 o0Var) {
        return FirebaseAuth.getInstance(l0()).Q(this, o0Var);
    }

    public abstract String getEmail();

    public abstract String getPhoneNumber();

    public Task<Void> h0(d1 d1Var) {
        q.k(d1Var);
        return FirebaseAuth.getInstance(l0()).R(this, d1Var);
    }

    public Task<Void> i0(String str) {
        return j0(str, (e) null);
    }

    public Task<Void> j0(String str, e eVar) {
        return FirebaseAuth.getInstance(l0()).U(this, false).continueWithTask(new m1(this, str, eVar));
    }

    public abstract a0 k0(List<? extends c1> list);

    public abstract f l0();

    public abstract String m();

    public abstract void m0(zzafn zzafn);

    public abstract a0 n0();

    public abstract void o0(List<j0> list);

    public abstract zzafn p0();

    public abstract List<String> q0();

    public Task<Void> v() {
        return FirebaseAuth.getInstance(l0()).N(this);
    }

    public Task<c0> w(boolean z10) {
        return FirebaseAuth.getInstance(l0()).U(this, z10);
    }

    public abstract b0 x();

    public abstract h0 y();

    public abstract List<? extends c1> z();

    public abstract String zzd();

    public abstract String zze();
}
