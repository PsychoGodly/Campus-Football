package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class d1 implements c.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f15088a;

    d1(f fVar) {
        this.f15088a = fVar;
    }

    public final void a(boolean z10) {
        f fVar = this.f15088a;
        fVar.f15120q.sendMessage(fVar.f15120q.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
