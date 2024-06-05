package com.unity3d.services.core.network.core;

import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import pe.i;
import xd.d;

/* compiled from: LegacyHttpClient.kt */
public final class LegacyHttpClient implements HttpClient {
    public static final Companion Companion = new Companion((h) null);
    private static final String NETWORK_CLIENT_LEGACY = "legacy";
    private final ISDKDispatchers dispatchers;

    /* compiled from: LegacyHttpClient.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public LegacyHttpClient(ISDKDispatchers iSDKDispatchers) {
        m.e(iSDKDispatchers, "dispatchers");
        this.dispatchers = iSDKDispatchers;
    }

    public Object execute(HttpRequest httpRequest, d<? super HttpResponse> dVar) {
        return i.g(this.dispatchers.getIo(), new LegacyHttpClient$execute$2(httpRequest, (d<? super LegacyHttpClient$execute$2>) null), dVar);
    }

    public HttpResponse executeBlocking(HttpRequest httpRequest) {
        m.e(httpRequest, "request");
        return (HttpResponse) i.e(this.dispatchers.getIo(), new LegacyHttpClient$executeBlocking$1(this, httpRequest, (d<? super LegacyHttpClient$executeBlocking$1>) null));
    }
}
