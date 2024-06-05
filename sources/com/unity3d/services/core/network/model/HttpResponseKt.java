package com.unity3d.services.core.network.model;

import com.applovin.mediation.MaxReward;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: HttpResponse.kt */
public final class HttpResponseKt {
    public static final boolean isSuccessful(HttpResponse httpResponse) {
        m.e(httpResponse, "<this>");
        int statusCode = httpResponse.getStatusCode();
        return 200 <= statusCode && statusCode < 300;
    }

    public static final HttpResponse toHttpResponse(UnityAdsNetworkException unityAdsNetworkException) {
        m.e(unityAdsNetworkException, "<this>");
        Integer code = unityAdsNetworkException.getCode();
        int intValue = code != null ? code.intValue() : 520;
        Map g10 = k0.g();
        String url = unityAdsNetworkException.getUrl();
        String str = url == null ? MaxReward.DEFAULT_LABEL : url;
        String protocol = unityAdsNetworkException.getProtocol();
        String str2 = protocol == null ? MaxReward.DEFAULT_LABEL : protocol;
        String client = unityAdsNetworkException.getClient();
        if (client == null) {
            client = "unknown";
        }
        return new HttpResponse(MaxReward.DEFAULT_LABEL, intValue, g10, str, str2, client, 0, 64, (h) null);
    }
}
