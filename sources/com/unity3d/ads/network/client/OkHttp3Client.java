package com.unity3d.ads.network.client;

import bf.u;
import bf.x;
import bf.z;
import com.unity3d.ads.network.HttpClient;
import com.unity3d.ads.network.model.HttpRequest;
import com.unity3d.ads.network.model.HttpResponse;
import com.unity3d.services.core.domain.ISDKDispatchers;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.m;
import pe.i;
import pe.p;
import xd.d;

/* compiled from: OkHttp3Client.kt */
public final class OkHttp3Client implements HttpClient {
    /* access modifiers changed from: private */
    public final u client;
    private final ISDKDispatchers dispatchers;

    public OkHttp3Client(ISDKDispatchers iSDKDispatchers, u uVar) {
        m.e(iSDKDispatchers, "dispatchers");
        m.e(uVar, "client");
        this.dispatchers = iSDKDispatchers;
        this.client = uVar;
    }

    /* access modifiers changed from: private */
    public final Object makeRequest(x xVar, long j10, long j11, d<? super z> dVar) {
        p pVar = new p(c.b(dVar), 1);
        pVar.C();
        u.b t10 = this.client.t();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        t10.b(j10, timeUnit).c(j11, timeUnit).a().v(xVar).n(new OkHttp3Client$makeRequest$2$1(pVar));
        Object z10 = pVar.z();
        if (z10 == d.c()) {
            h.c(dVar);
        }
        return z10;
    }

    public Object execute(HttpRequest httpRequest, d<? super HttpResponse> dVar) {
        return i.g(this.dispatchers.getIo(), new OkHttp3Client$execute$2(httpRequest, this, (d<? super OkHttp3Client$execute$2>) null), dVar);
    }
}
