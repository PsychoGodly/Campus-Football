package com.unity3d.ads.core.data.datasource;

import com.google.android.gms.common.api.a;
import com.unity3d.ads.core.data.model.CacheResult;
import java.io.File;
import xd.d;

/* compiled from: CacheDataSource.kt */
public interface CacheDataSource {

    /* compiled from: CacheDataSource.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheDataSource cacheDataSource, File file, String str, String str2, Integer num, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    str2 = null;
                }
                String str3 = str2;
                if ((i10 & 8) != 0) {
                    num = Integer.valueOf(a.e.API_PRIORITY_OTHER);
                }
                return cacheDataSource.getFile(file, str, str3, num, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
        }
    }

    Object getFile(File file, String str, String str2, Integer num, d<? super CacheResult> dVar);
}
