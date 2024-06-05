package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class v2 extends o1 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Dialog f15290a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ w2 f15291b;

    v2(w2 w2Var, Dialog dialog) {
        this.f15291b = w2Var;
        this.f15290a = dialog;
    }

    public final void a() {
        this.f15291b.f15320b.d();
        if (this.f15290a.isShowing()) {
            this.f15290a.dismiss();
        }
    }
}
