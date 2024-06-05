package com.unity3d.services.core.network.core;

import bf.a0;
import bf.d;
import bf.e;
import bf.z;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import lf.l;
import pe.o;
import sd.o;
import sd.p;

/* compiled from: OkHttp3Client.kt */
public final class OkHttp3Client$makeRequest$2$1 implements e {
    final /* synthetic */ o<z> $continuation;
    final /* synthetic */ HttpRequest $request;

    OkHttp3Client$makeRequest$2$1(HttpRequest httpRequest, o<? super z> oVar) {
        this.$request = httpRequest;
        this.$continuation = oVar;
    }

    public void onFailure(d dVar, IOException iOException) {
        m.e(dVar, "call");
        m.e(iOException, "e");
        UnityAdsNetworkException unityAdsNetworkException = new UnityAdsNetworkException("Network request failed", (OperationType) null, (Integer) null, dVar.h().h().toString(), (String) null, (Integer) null, "okhttp", 54, (h) null);
        o<z> oVar = this.$continuation;
        o.a aVar = sd.o.f38128b;
        oVar.resumeWith(sd.o.b(p.a(unityAdsNetworkException)));
    }

    public void onResponse(d dVar, z zVar) {
        lf.e u10;
        m.e(dVar, "call");
        m.e(zVar, "response");
        File downloadDestination = this.$request.getDownloadDestination();
        boolean z10 = true;
        if (downloadDestination == null || !downloadDestination.exists()) {
            z10 = false;
        }
        if (z10) {
            lf.d a10 = l.a(l.d(downloadDestination));
            a0 h10 = zVar.h();
            if (!(h10 == null || (u10 = h10.u()) == null)) {
                a10.p(u10);
            }
            a10.close();
        }
        pe.o<z> oVar = this.$continuation;
        o.a aVar = sd.o.f38128b;
        oVar.resumeWith(sd.o.b(zVar));
    }
}
