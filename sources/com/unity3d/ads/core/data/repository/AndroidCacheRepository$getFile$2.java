package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.model.CacheResult;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2", f = "AndroidCacheRepository.kt", l = {49, 56, 132}, m = "invokeSuspend")
/* compiled from: AndroidCacheRepository.kt */
final class AndroidCacheRepository$getFile$2 extends l implements p<p0, d<? super CacheResult>, Object> {
    final /* synthetic */ String $objectId;
    final /* synthetic */ int $priority;
    final /* synthetic */ String $url;
    Object L$0;
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidCacheRepository$getFile$2(AndroidCacheRepository androidCacheRepository, String str, int i10, String str2, d<? super AndroidCacheRepository$getFile$2> dVar) {
        super(2, dVar);
        this.this$0 = androidCacheRepository;
        this.$url = str;
        this.$priority = i10;
        this.$objectId = str2;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidCacheRepository$getFile$2(this.this$0, this.$url, this.$priority, this.$objectId, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super CacheResult> dVar) {
        return ((AndroidCacheRepository$getFile$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r6 = r23
            java.lang.Object r7 = yd.d.c()
            int r0 = r6.label
            r8 = 3
            r1 = 1
            r9 = 2
            r10 = 0
            if (r0 == 0) goto L_0x0039
            if (r0 == r1) goto L_0x002e
            if (r0 == r9) goto L_0x0023
            if (r0 != r8) goto L_0x001b
            sd.p.b(r24)
            r0 = r24
            goto L_0x00cd
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0023:
            java.lang.Object r0 = r6.L$0
            java.lang.String r0 = (java.lang.String) r0
            sd.p.b(r24)     // Catch:{ IOException -> 0x00f3 }
            r16 = r0
            goto L_0x00b0
        L_0x002e:
            java.lang.Object r0 = r6.L$0
            java.lang.String r0 = (java.lang.String) r0
            sd.p.b(r24)
            r11 = r0
            r0 = r24
            goto L_0x0067
        L_0x0039:
            sd.p.b(r24)
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = r6.this$0
            java.lang.String r2 = r6.$url
            java.lang.String r11 = r0.getHash(r2)
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = r6.this$0
            com.unity3d.ads.core.data.datasource.CacheDataSource r0 = r0.localCacheDataSource
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r2 = r6.this$0
            java.io.File r2 = r2.cacheDir
            java.lang.String r3 = r6.$url
            int r4 = r6.$priority
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.c(r4)
            r6.L$0 = r11
            r6.label = r1
            r1 = r2
            r2 = r11
            r5 = r23
            java.lang.Object r0 = r0.getFile(r1, r2, r3, r4, r5)
            if (r0 != r7) goto L_0x0067
            return r7
        L_0x0067:
            com.unity3d.ads.core.data.model.CacheResult r0 = (com.unity3d.ads.core.data.model.CacheResult) r0
            boolean r1 = r0 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
            if (r1 == 0) goto L_0x008d
            com.unity3d.ads.core.data.model.CacheResult$Success r0 = (com.unity3d.ads.core.data.model.CacheResult.Success) r0
            com.unity3d.ads.core.data.model.CachedFile r11 = r0.getCachedFile()
            java.lang.String r12 = r6.$objectId
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 254(0xfe, float:3.56E-43)
            r22 = 0
            com.unity3d.ads.core.data.model.CachedFile r1 = com.unity3d.ads.core.data.model.CachedFile.copy$default(r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22)
            com.unity3d.ads.core.data.model.CacheResult$Success r0 = com.unity3d.ads.core.data.model.CacheResult.Success.copy$default(r0, r1, r10, r9, r10)
            return r0
        L_0x008d:
            java.io.File r0 = new java.io.File
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r1 = r6.this$0
            java.lang.String r1 = r1.getFilePath(r11)
            r0.<init>(r1)
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r1 = r6.this$0     // Catch:{ IOException -> 0x00f3 }
            pe.k0 r1 = r1.ioDispatcher     // Catch:{ IOException -> 0x00f3 }
            com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2$1 r2 = new com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2$1     // Catch:{ IOException -> 0x00f3 }
            r2.<init>(r0, r10)     // Catch:{ IOException -> 0x00f3 }
            r6.L$0 = r11     // Catch:{ IOException -> 0x00f3 }
            r6.label = r9     // Catch:{ IOException -> 0x00f3 }
            java.lang.Object r0 = pe.i.g(r1, r2, r6)     // Catch:{ IOException -> 0x00f3 }
            if (r0 != r7) goto L_0x00ae
            return r7
        L_0x00ae:
            r16 = r11
        L_0x00b0:
            java.lang.String r0 = r6.$url
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r15 = r6.this$0
            int r1 = r6.$priority
            com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2$invokeSuspend$$inlined$memoize$1 r2 = new com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2$invokeSuspend$$inlined$memoize$1
            r14 = 0
            r12 = r2
            r13 = r0
            r17 = r0
            r18 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r6.L$0 = r10
            r6.label = r8
            java.lang.Object r0 = pe.q0.e(r2, r6)
            if (r0 != r7) goto L_0x00cd
            return r7
        L_0x00cd:
            com.unity3d.ads.core.data.model.CacheResult r0 = (com.unity3d.ads.core.data.model.CacheResult) r0
            boolean r1 = r0 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
            if (r1 == 0) goto L_0x00f2
            r1 = r0
            com.unity3d.ads.core.data.model.CacheResult$Success r1 = (com.unity3d.ads.core.data.model.CacheResult.Success) r1
            com.unity3d.ads.core.data.model.CachedFile r7 = r1.getCachedFile()
            java.lang.String r8 = r6.$objectId
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 254(0xfe, float:3.56E-43)
            r18 = 0
            com.unity3d.ads.core.data.model.CachedFile r1 = com.unity3d.ads.core.data.model.CachedFile.copy$default(r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18)
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r2 = r6.this$0
            r2.addFileToCache(r1)
        L_0x00f2:
            return r0
        L_0x00f3:
            com.unity3d.ads.core.data.model.CacheResult$Failure r0 = new com.unity3d.ads.core.data.model.CacheResult$Failure
            com.unity3d.ads.core.data.model.CacheError r1 = com.unity3d.ads.core.data.model.CacheError.FILE_IO_CREATE
            r0.<init>(r1, r10, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
