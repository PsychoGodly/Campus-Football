package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.i;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class e0 extends f0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Intent f15378a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i f15379b;

    e0(Intent intent, i iVar, int i10) {
        this.f15378a = intent;
        this.f15379b = iVar;
    }

    public final void a() {
        Intent intent = this.f15378a;
        if (intent != null) {
            this.f15379b.startActivityForResult(intent, 2);
        }
    }
}
