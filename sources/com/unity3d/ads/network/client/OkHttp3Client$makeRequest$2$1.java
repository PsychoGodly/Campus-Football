package com.unity3d.ads.network.client;

import bf.d;
import bf.e;
import bf.z;
import java.io.IOException;
import kotlin.jvm.internal.m;
import pe.o;
import sd.o;
import sd.p;

/* compiled from: OkHttp3Client.kt */
public final class OkHttp3Client$makeRequest$2$1 implements e {
    final /* synthetic */ o<z> $continuation;

    OkHttp3Client$makeRequest$2$1(o<? super z> oVar) {
        this.$continuation = oVar;
    }

    public void onFailure(d dVar, IOException iOException) {
        m.e(dVar, "call");
        m.e(iOException, "e");
        o<z> oVar = this.$continuation;
        o.a aVar = sd.o.f38128b;
        oVar.resumeWith(sd.o.b(p.a(iOException)));
    }

    public void onResponse(d dVar, z zVar) {
        m.e(dVar, "call");
        m.e(zVar, "response");
        pe.o<z> oVar = this.$continuation;
        o.a aVar = sd.o.f38128b;
        oVar.resumeWith(sd.o.b(zVar));
    }
}
