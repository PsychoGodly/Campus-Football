package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import org.json.JSONArray;
import sd.w;
import xd.d;

/* compiled from: CacheRepository.kt */
public interface CacheRepository {

    /* compiled from: CacheRepository.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheRepository cacheRepository, String str, String str2, JSONArray jSONArray, int i10, d dVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 4) != 0) {
                    jSONArray = null;
                }
                return cacheRepository.getFile(str, str2, jSONArray, (i11 & 8) != 0 ? 0 : i10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
        }
    }

    Object clearCache(d<? super w> dVar);

    Object doesFileExist(String str, d<? super Boolean> dVar);

    Object getCacheSize(d<? super Long> dVar);

    Object getFile(String str, String str2, JSONArray jSONArray, int i10, d<? super CacheResult> dVar);

    void removeFile(CachedFile cachedFile);

    CacheResult retrieveFile(String str);
}
