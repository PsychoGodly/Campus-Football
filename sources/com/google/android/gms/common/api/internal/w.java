package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class w implements f.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BasePendingResult f15292a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ y f15293b;

    w(y yVar, BasePendingResult basePendingResult) {
        this.f15293b = yVar;
        this.f15292a = basePendingResult;
    }

    public final void a(Status status) {
        this.f15293b.f15329a.remove(this.f15292a);
    }
}
