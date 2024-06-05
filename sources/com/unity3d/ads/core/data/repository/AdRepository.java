package com.unity3d.ads.core.data.repository;

import com.google.protobuf.i;
import com.unity3d.ads.core.data.model.AdObject;
import sd.w;
import xd.d;

/* compiled from: AdRepository.kt */
public interface AdRepository {
    Object addAd(i iVar, AdObject adObject, d<? super w> dVar);

    Object getAd(i iVar, d<? super AdObject> dVar);

    Object hasOpportunityId(i iVar, d<? super Boolean> dVar);

    Object removeAd(i iVar, d<? super w> dVar);
}
