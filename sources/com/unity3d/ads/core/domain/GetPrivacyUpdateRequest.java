package com.unity3d.ads.core.domain;

import com.google.protobuf.i;
import kotlin.jvm.internal.m;
import vb.n2;
import vb.o3;
import vb.p2;
import vb.p3;
import vb.t3;
import xd.d;

/* compiled from: GetPrivacyUpdateRequest.kt */
public final class GetPrivacyUpdateRequest {
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public GetPrivacyUpdateRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2) {
        m.e(getUniversalRequestForPayLoad2, "getUniversalRequestForPayLoad");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad2;
    }

    public final Object invoke(int i10, i iVar, d<? super t3> dVar) {
        n2.a aVar = n2.f39029b;
        p2.a h02 = p2.h0();
        m.d(h02, "newBuilder()");
        n2 a10 = aVar.a(h02);
        a10.c(i10);
        a10.b(iVar);
        p2 a11 = a10.a();
        o3 o3Var = o3.f39052a;
        p3.a aVar2 = p3.f39058b;
        t3.b.a q02 = t3.b.q0();
        m.d(q02, "newBuilder()");
        p3 a12 = aVar2.a(q02);
        a12.j(a11);
        return this.getUniversalRequestForPayLoad.invoke(a12.a(), dVar);
    }
}
