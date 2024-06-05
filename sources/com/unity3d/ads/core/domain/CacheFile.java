package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import org.json.JSONArray;
import xd.d;

/* compiled from: CacheFile.kt */
public interface CacheFile {
    Object invoke(String str, AdObject adObject, JSONArray jSONArray, int i10, d<? super CacheResult> dVar);
}
