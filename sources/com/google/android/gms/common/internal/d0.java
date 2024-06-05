package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class d0 extends f0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Intent f15367a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Activity f15368b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f15369c;

    d0(Intent intent, Activity activity, int i10) {
        this.f15367a = intent;
        this.f15368b = activity;
        this.f15369c = i10;
    }

    public final void a() {
        Intent intent = this.f15367a;
        if (intent != null) {
            this.f15368b.startActivityForResult(intent, this.f15369c);
        }
    }
}
