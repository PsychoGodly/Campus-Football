package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import kotlin.jvm.internal.m;
import xd.d;

/* compiled from: CommonGetAdObject.kt */
public final class CommonGetAdObject implements GetAdObject {
    private final AdRepository adRepository;

    public CommonGetAdObject(AdRepository adRepository2) {
        m.e(adRepository2, "adRepository");
        this.adRepository = adRepository2;
    }

    public Object invoke(String str, d<? super AdObject> dVar) {
        return this.adRepository.getAd(ProtobufExtensionsKt.toISO8859ByteString(str), dVar);
    }
}
