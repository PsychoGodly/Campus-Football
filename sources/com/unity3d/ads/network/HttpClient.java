package com.unity3d.ads.network;

import com.unity3d.ads.network.model.HttpRequest;
import com.unity3d.ads.network.model.HttpResponse;
import xd.d;

/* compiled from: HttpClient.kt */
public interface HttpClient {
    Object execute(HttpRequest httpRequest, d<? super HttpResponse> dVar);
}
