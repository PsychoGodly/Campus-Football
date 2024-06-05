package com.unity3d.services.core.network.core;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import xd.d;

/* compiled from: HttpClient.kt */
public interface HttpClient {
    Object execute(HttpRequest httpRequest, d<? super HttpResponse> dVar);

    HttpResponse executeBlocking(HttpRequest httpRequest) throws Exception;
}
