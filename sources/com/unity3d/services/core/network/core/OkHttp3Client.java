package com.unity3d.services.core.network.core;

import bf.u;
import bf.x;
import bf.z;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import pe.i;
import pe.p;
import xd.d;

/* compiled from: OkHttp3Client.kt */
public final class OkHttp3Client implements HttpClient {
    public static final Companion Companion = new Companion((h) null);
    private static final String MSG_CONNECTION_FAILED = "Network request failed";
    private static final String NETWORK_CLIENT_OKHTTP = "okhttp";
    /* access modifiers changed from: private */
    public final u client;
    private final ISDKDispatchers dispatchers;

    /* compiled from: OkHttp3Client.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public OkHttp3Client(ISDKDispatchers iSDKDispatchers, u uVar) {
        m.e(iSDKDispatchers, "dispatchers");
        m.e(uVar, "client");
        this.dispatchers = iSDKDispatchers;
        this.client = uVar;
    }

    /* access modifiers changed from: private */
    public final Object makeRequest(HttpRequest httpRequest, long j10, long j11, d<? super z> dVar) {
        p pVar = new p(c.b(dVar), 1);
        pVar.C();
        x okHttpProtoRequest = httpRequest.isProtobuf() ? HttpRequestToOkHttpRequestKt.toOkHttpProtoRequest(httpRequest) : HttpRequestToOkHttpRequestKt.toOkHttpRequest(httpRequest);
        u.b t10 = this.client.t();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        t10.b(j10, timeUnit).c(j11, timeUnit).a().v(okHttpProtoRequest).n(new OkHttp3Client$makeRequest$2$1(httpRequest, pVar));
        Object z10 = pVar.z();
        if (z10 == d.c()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return z10;
    }

    public Object execute(HttpRequest httpRequest, d<? super HttpResponse> dVar) {
        return i.g(this.dispatchers.getIo(), new OkHttp3Client$execute$2(this, httpRequest, (d<? super OkHttp3Client$execute$2>) null), dVar);
    }

    public HttpResponse executeBlocking(HttpRequest httpRequest) {
        m.e(httpRequest, "request");
        return (HttpResponse) i.e(this.dispatchers.getIo(), new OkHttp3Client$executeBlocking$1(this, httpRequest, (d<? super OkHttp3Client$executeBlocking$1>) null));
    }
}
