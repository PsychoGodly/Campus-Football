package com.unity3d.services.core.network.core;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.network.model.HttpResponse;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import pe.o;
import sd.o;
import sd.p;

/* compiled from: CronetClient.kt */
public final class CronetClient$execute$2$cronetRequest$1 extends UnityAdsUrlRequestCallback {
    final /* synthetic */ o<HttpResponse> $cont;
    final /* synthetic */ CronetClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CronetClient$execute$2$cronetRequest$1(o<? super HttpResponse> oVar, CronetClient cronetClient, File file) {
        super(file);
        this.$cont = oVar;
        this.this$0 = cronetClient;
    }

    public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        String str = null;
        NetworkException networkException = cronetException instanceof NetworkException ? (NetworkException) cronetException : null;
        Integer valueOf = networkException != null ? Integer.valueOf(networkException.getCronetInternalErrorCode()) : null;
        Integer valueOf2 = urlResponseInfo != null ? Integer.valueOf(urlResponseInfo.getHttpStatusCode()) : null;
        String url = urlResponseInfo != null ? urlResponseInfo.getUrl() : null;
        if (urlResponseInfo != null) {
            str = urlResponseInfo.getNegotiatedProtocol();
        }
        UnityAdsNetworkException unityAdsNetworkException = new UnityAdsNetworkException("Network request failed", (OperationType) null, valueOf2, url, str, valueOf, "cronet", 2, (h) null);
        o<HttpResponse> oVar = this.$cont;
        o.a aVar = sd.o.f38128b;
        oVar.resumeWith(sd.o.b(p.a(unityAdsNetworkException)));
    }

    public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, byte[] bArr) {
        m.e(urlRequest, "request");
        m.e(urlResponseInfo, "info");
        m.e(bArr, "bodyBytes");
        pe.o<HttpResponse> oVar = this.$cont;
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
        String url = urlResponseInfo.getUrl();
        String negotiatedProtocol = urlResponseInfo.getNegotiatedProtocol();
        long access$getContentSize = this.this$0.getContentSize(urlResponseInfo);
        m.d(allHeaders, "allHeaders");
        m.d(url, "url");
        m.d(negotiatedProtocol, "negotiatedProtocol");
        HttpResponse httpResponse = new HttpResponse(bArr, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", access$getContentSize);
        o.a aVar = sd.o.f38128b;
        oVar.resumeWith(sd.o.b(httpResponse));
    }
}
