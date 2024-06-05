package com.unity3d.services.core.network.core;

import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import ne.c;
import org.chromium.net.CronetEngine;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import pe.i;
import pe.p;
import pe.u1;
import xd.d;

/* compiled from: CronetClient.kt */
public final class CronetClient implements HttpClient {
    public static final Companion Companion = new Companion((h) null);
    private static final String MSG_CONNECTION_FAILED = "Network request failed";
    private static final String NETWORK_CLIENT_CRONET = "cronet";
    /* access modifiers changed from: private */
    public final ISDKDispatchers dispatchers;
    /* access modifiers changed from: private */
    public final CronetEngine engine;

    /* compiled from: CronetClient.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public CronetClient(CronetEngine cronetEngine, ISDKDispatchers iSDKDispatchers) {
        m.e(cronetEngine, "engine");
        m.e(iSDKDispatchers, "dispatchers");
        this.engine = cronetEngine;
        this.dispatchers = iSDKDispatchers;
    }

    /* access modifiers changed from: private */
    public final String buildUrl(HttpRequest httpRequest) {
        return p.Z(p.A0(httpRequest.getBaseURL(), '/') + '/' + p.A0(httpRequest.getPath(), '/'), UnityAdsConstants.DefaultUrls.AD_ASSET_PATH);
    }

    /* access modifiers changed from: private */
    public final long getContentSize(UrlResponseInfo urlResponseInfo) {
        String str;
        Long h10;
        List list = urlResponseInfo.getAllHeaders().get("Content-Length");
        if (list == null || (str = (String) list.get(0)) == null || (h10 = n.h(str)) == null) {
            return -1;
        }
        return h10.longValue();
    }

    /* access modifiers changed from: private */
    public final int getPriority(int i10) {
        if (i10 == 0) {
            return 4;
        }
        if (i10 != 1) {
            return i10 != 2 ? 1 : 2;
        }
        return 3;
    }

    public Object execute(HttpRequest httpRequest, d<? super HttpResponse> dVar) {
        byte[] bArr;
        p pVar = new p(c.b(dVar), 1);
        pVar.C();
        UrlRequest.Builder newUrlRequestBuilder = this.engine.newUrlRequestBuilder(buildUrl(httpRequest), new CronetClient$execute$2$cronetRequest$1(pVar, this, httpRequest.getDownloadDestination()), u1.a(this.dispatchers.getIo()));
        for (Map.Entry next : httpRequest.getHeaders().entrySet()) {
            String str = (String) next.getKey();
            for (String addHeader : (List) next.getValue()) {
                newUrlRequestBuilder.addHeader(str, addHeader);
            }
        }
        if (httpRequest.getMethod() == RequestType.POST) {
            Object body = httpRequest.getBody();
            if (body instanceof byte[]) {
                bArr = (byte[]) httpRequest.getBody();
            } else if (body instanceof String) {
                bArr = ((String) httpRequest.getBody()).getBytes(c.f36517g);
                m.d(bArr, "this as java.lang.String).getBytes(charset)");
            } else {
                bArr = new byte[0];
            }
            newUrlRequestBuilder.setUploadDataProvider(UploadDataProviders.create(bArr), u1.a(this.dispatchers.getIo()));
        }
        newUrlRequestBuilder.setHttpMethod(httpRequest.getMethod().toString()).setPriority(getPriority(httpRequest.getPriority())).build().start();
        Object z10 = pVar.z();
        if (z10 == d.c()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return z10;
    }

    public HttpResponse executeBlocking(HttpRequest httpRequest) {
        m.e(httpRequest, "request");
        return (HttpResponse) i.e(this.dispatchers.getIo(), new CronetClient$executeBlocking$1(this, httpRequest, (d<? super CronetClient$executeBlocking$1>) null));
    }
}
