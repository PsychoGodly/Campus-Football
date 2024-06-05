package com.unity3d.ads.core.data.datasource;

import com.applovin.mediation.MaxReward;
import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import java.io.File;
import kotlin.jvm.internal.h;
import xd.d;

/* compiled from: AndroidLocalCacheDataSource.kt */
public final class AndroidLocalCacheDataSource implements CacheDataSource {
    public Object getFile(File file, String str, String str2, Integer num, d<? super CacheResult> dVar) {
        File file2 = file;
        String str3 = str;
        File file3 = new File(file, str);
        if (!file3.exists()) {
            return new CacheResult.Failure(CacheError.FILE_NOT_FOUND, CacheSource.LOCAL);
        }
        return new CacheResult.Success(new CachedFile(MaxReward.DEFAULT_LABEL, str2 == null ? MaxReward.DEFAULT_LABEL : str2, str, file3, (String) null, 0, (String) null, 0, 240, (h) null), CacheSource.LOCAL);
    }
}
