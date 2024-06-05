package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class k0 extends q0 {

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<a.f> f15170b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0 f15171c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k0(r0 r0Var, ArrayList<a.f> arrayList) {
        super(r0Var, (p0) null);
        this.f15171c = r0Var;
        this.f15170b = arrayList;
    }

    public final void a() {
        r0 r0Var = this.f15171c;
        r0Var.f15223a.f15062o.f15308p = r0.x(r0Var);
        ArrayList<a.f> arrayList = this.f15170b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            r0 r0Var2 = this.f15171c;
            arrayList.get(i10).getRemoteService(r0Var2.f15237o, r0Var2.f15223a.f15062o.f15308p);
        }
    }
}
