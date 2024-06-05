package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.q;
import h5.b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class w2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final u2 f15319a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ x2 f15320b;

    w2(x2 x2Var, u2 u2Var) {
        this.f15320b = x2Var;
        this.f15319a = u2Var;
    }

    public final void run() {
        if (this.f15320b.f15325a) {
            b b10 = this.f15319a.b();
            if (b10.y()) {
                x2 x2Var = this.f15320b;
                x2Var.mLifecycleFragment.startActivityForResult(GoogleApiActivity.a(x2Var.getActivity(), (PendingIntent) q.k(b10.x()), this.f15319a.a(), false), 1);
                return;
            }
            x2 x2Var2 = this.f15320b;
            if (x2Var2.f15328d.d(x2Var2.getActivity(), b10.v(), (String) null) != null) {
                x2 x2Var3 = this.f15320b;
                x2Var3.f15328d.z(x2Var3.getActivity(), this.f15320b.mLifecycleFragment, b10.v(), 2, this.f15320b);
            } else if (b10.v() == 18) {
                x2 x2Var4 = this.f15320b;
                Dialog u10 = x2Var4.f15328d.u(x2Var4.getActivity(), this.f15320b);
                x2 x2Var5 = this.f15320b;
                x2Var5.f15328d.v(x2Var5.getActivity().getApplicationContext(), new v2(this, u10));
            } else {
                this.f15320b.a(b10, this.f15319a.a());
            }
        }
    }
}
