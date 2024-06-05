package com.unity3d.ads.core.domain;

import com.google.protobuf.i;
import kotlin.jvm.internal.m;
import vb.g;
import vb.i;
import vb.o3;
import vb.p3;
import vb.t3;
import xd.d;

/* compiled from: GetAndroidAdPlayerConfigRequest.kt */
public final class GetAndroidAdPlayerConfigRequest implements GetAdPlayerConfigRequest {
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public GetAndroidAdPlayerConfigRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2) {
        m.e(getUniversalRequestForPayLoad2, "getUniversalRequestForPayLoad");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad2;
    }

    public Object invoke(String str, i iVar, i iVar2, d<? super t3> dVar) {
        g.a aVar = g.f38954b;
        i.a i02 = vb.i.i0();
        m.d(i02, "newBuilder()");
        g a10 = aVar.a(i02);
        a10.b(iVar2);
        a10.d(str);
        a10.c(iVar);
        vb.i a11 = a10.a();
        o3 o3Var = o3.f39052a;
        p3.a aVar2 = p3.f39058b;
        t3.b.a q02 = t3.b.q0();
        m.d(q02, "newBuilder()");
        p3 a12 = aVar2.a(q02);
        a12.d(a11);
        return this.getUniversalRequestForPayLoad.invoke(a12.a(), dVar);
    }
}
