package com.unity3d.ads.core.data.repository;

import com.google.protobuf.i;
import com.unity3d.ads.core.data.model.AdObject;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.b;
import sd.w;
import xd.d;

/* compiled from: AndroidAdRepository.kt */
public final class AndroidAdRepository implements AdRepository {
    private final ConcurrentHashMap<i, AdObject> loadedAds = new ConcurrentHashMap<>();

    public Object addAd(i iVar, AdObject adObject, d<? super w> dVar) {
        this.loadedAds.put(iVar, adObject);
        return w.f38141a;
    }

    public Object getAd(i iVar, d<? super AdObject> dVar) {
        return this.loadedAds.get(iVar);
    }

    public Object hasOpportunityId(i iVar, d<? super Boolean> dVar) {
        return b.a(this.loadedAds.containsKey(iVar));
    }

    public Object removeAd(i iVar, d<? super w> dVar) {
        this.loadedAds.remove(iVar);
        return w.f38141a;
    }
}
