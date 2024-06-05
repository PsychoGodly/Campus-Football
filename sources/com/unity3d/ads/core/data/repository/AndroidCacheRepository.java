package com.unity3d.ads.core.data.repository;

import android.content.Context;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.m;
import lf.f;
import ne.c;
import org.json.JSONArray;
import pe.i;
import pe.k0;
import sd.w;
import xd.d;

/* compiled from: AndroidCacheRepository.kt */
public final class AndroidCacheRepository implements CacheRepository {
    /* access modifiers changed from: private */
    public final File cacheDir = initCacheDir();
    private final ConcurrentHashMap<String, CachedFile> cachedFiles = new ConcurrentHashMap<>();
    private final Context context;
    /* access modifiers changed from: private */
    public final k0 ioDispatcher;
    /* access modifiers changed from: private */
    public final CacheDataSource localCacheDataSource;
    private final ConcurrentHashMap<String, Set<String>> neededFiles = new ConcurrentHashMap<>();
    /* access modifiers changed from: private */
    public final CacheDataSource remoteCacheDataSource;

    public AndroidCacheRepository(k0 k0Var, CacheDataSource cacheDataSource, CacheDataSource cacheDataSource2, Context context2) {
        m.e(k0Var, "ioDispatcher");
        m.e(cacheDataSource, "localCacheDataSource");
        m.e(cacheDataSource2, "remoteCacheDataSource");
        m.e(context2, "context");
        this.ioDispatcher = k0Var;
        this.localCacheDataSource = cacheDataSource;
        this.remoteCacheDataSource = cacheDataSource2;
        this.context = context2;
    }

    /* access modifiers changed from: private */
    public final void addFileToCache(CachedFile cachedFile) {
        this.cachedFiles.put(cachedFile.getName(), cachedFile);
        Set set = this.neededFiles.get(cachedFile.getName());
        if (set == null) {
            set = new LinkedHashSet();
        }
        set.add(cachedFile.getObjectId());
        this.neededFiles.put(cachedFile.getName(), set);
    }

    private final void deleteFile(File file) {
        if (file != null && file.exists()) {
            file.delete();
        }
    }

    private final File getCacheDirBase() {
        File cacheDir2 = this.context.getCacheDir();
        m.d(cacheDir2, "context.cacheDir");
        return cacheDir2;
    }

    private final String getCacheDirPath() {
        return UnityAdsConstants.DefaultUrls.CACHE_DIR_NAME;
    }

    /* access modifiers changed from: private */
    public final String getFilePath(String str) {
        return this.cacheDir.getAbsolutePath() + File.separator + str;
    }

    /* access modifiers changed from: private */
    public final String getHash(String str) {
        byte[] bytes = str.getBytes(c.f36512b);
        m.d(bytes, "this as java.lang.String).getBytes(charset)");
        String j10 = f.k(Arrays.copyOf(bytes, bytes.length)).o().j();
        m.d(j10, "bytes.sha256().hex()");
        return j10;
    }

    private final File initCacheDir() {
        File file = new File(getCacheDirBase(), getCacheDirPath());
        file.mkdirs();
        return file;
    }

    private final void removeFileFromCache(CachedFile cachedFile) {
        this.cachedFiles.remove(cachedFile.getName());
        Set set = this.neededFiles.get(cachedFile.getName());
        if (set != null) {
            set.remove(cachedFile.getObjectId());
        }
        deleteFile(cachedFile.getFile());
    }

    public Object clearCache(d<? super w> dVar) {
        return i.g(this.ioDispatcher, new AndroidCacheRepository$clearCache$2(this, (d<? super AndroidCacheRepository$clearCache$2>) null), dVar);
    }

    public Object doesFileExist(String str, d<? super Boolean> dVar) {
        return b.a(this.cachedFiles.containsKey(str));
    }

    public Object getCacheSize(d<? super Long> dVar) {
        return i.g(this.ioDispatcher, new AndroidCacheRepository$getCacheSize$2(this, (d<? super AndroidCacheRepository$getCacheSize$2>) null), dVar);
    }

    public final ConcurrentHashMap<String, CachedFile> getCachedFiles() {
        return this.cachedFiles;
    }

    public Object getFile(String str, String str2, JSONArray jSONArray, int i10, d<? super CacheResult> dVar) {
        return i.g(this.ioDispatcher, new AndroidCacheRepository$getFile$2(this, str, i10, str2, (d<? super AndroidCacheRepository$getFile$2>) null), dVar);
    }

    public final String getFilename(String str) {
        m.e(str, "url");
        return getHash(str);
    }

    public final ConcurrentHashMap<String, Set<String>> getNeededFiles() {
        return this.neededFiles;
    }

    public void removeFile(CachedFile cachedFile) {
        m.e(cachedFile, "cachedFile");
        removeFileFromCache(cachedFile);
    }

    public CacheResult retrieveFile(String str) {
        m.e(str, "fileName");
        CachedFile cachedFile = this.cachedFiles.get(str);
        if (cachedFile != null) {
            return new CacheResult.Success(cachedFile, CacheSource.LOCAL);
        }
        return new CacheResult.Failure(CacheError.FILE_NOT_FOUND, CacheSource.LOCAL);
    }
}
