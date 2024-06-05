package com.unity3d.ads.core.data.datasource;

import com.google.android.gms.common.api.a;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.BodyType;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import java.io.File;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import xd.d;

/* compiled from: AndroidRemoteCacheDataSource.kt */
public final class AndroidRemoteCacheDataSource implements CacheDataSource {
    private final HttpClient httpClient;

    public AndroidRemoteCacheDataSource(HttpClient httpClient2) {
        m.e(httpClient2, "httpClient");
        this.httpClient = httpClient2;
    }

    /* access modifiers changed from: private */
    public final Object downloadFile(String str, File file, Integer num, d<? super HttpResponse> dVar) {
        HttpRequest httpRequest = r0;
        HttpRequest httpRequest2 = new HttpRequest(str, (String) null, (RequestType) null, (Object) null, (Map) null, (Map) null, (BodyType) null, (String) null, (Integer) null, 0, 0, 0, 0, false, (OperationType) null, file, num != null ? num.intValue() : a.e.API_PRIORITY_OTHER, 32766, (h) null);
        return this.httpClient.execute(httpRequest, dVar);
    }

    private final File setupFile(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.createNewFile();
        } else {
            file2.delete();
            file2.createNewFile();
        }
        return file2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getFile(java.io.File r17, java.lang.String r18, java.lang.String r19, java.lang.Integer r20, xd.d<? super com.unity3d.ads.core.data.model.CacheResult> r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = r3 instanceof com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$1
            if (r4 == 0) goto L_0x001b
            r4 = r3
            com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$1 r4 = (com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$1) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.label = r5
            goto L_0x0020
        L_0x001b:
            com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$1 r4 = new com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$1
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r3 = r4.result
            java.lang.Object r5 = yd.d.c()
            int r6 = r4.label
            r7 = 1
            if (r6 == 0) goto L_0x004c
            if (r6 != r7) goto L_0x0044
            java.lang.Object r1 = r4.L$3
            java.io.File r1 = (java.io.File) r1
            java.lang.Object r2 = r4.L$2
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r5 = r4.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.L$0
            java.lang.String r4 = (java.lang.String) r4
            sd.p.b(r3)
            r10 = r1
            r9 = r4
            r8 = r5
            goto L_0x0076
        L_0x0044:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004c:
            sd.p.b(r3)
            if (r1 != 0) goto L_0x005b
            com.unity3d.ads.core.data.model.CacheResult$Failure r1 = new com.unity3d.ads.core.data.model.CacheResult$Failure
            com.unity3d.ads.core.data.model.CacheError r2 = com.unity3d.ads.core.data.model.CacheError.MALFORMED_URL
            com.unity3d.ads.core.data.model.CacheSource r3 = com.unity3d.ads.core.data.model.CacheSource.REMOTE
            r1.<init>(r2, r3)
            return r1
        L_0x005b:
            java.io.File r3 = r16.setupFile(r17, r18)
            r6 = r18
            r4.L$0 = r6
            r4.L$1 = r1
            r4.L$2 = r2
            r4.L$3 = r3
            r4.label = r7
            java.lang.Object r4 = r0.downloadFile(r1, r3, r2, r4)
            if (r4 != r5) goto L_0x0072
            return r5
        L_0x0072:
            r8 = r1
            r10 = r3
            r3 = r4
            r9 = r6
        L_0x0076:
            com.unity3d.services.core.network.model.HttpResponse r3 = (com.unity3d.services.core.network.model.HttpResponse) r3
            java.lang.String r1 = "?"
            r4 = 0
            r5 = 2
            java.lang.String r1 = ne.p.w0(r8, r1, r4, r5, r4)
            java.lang.String r6 = "."
            java.lang.String r11 = ne.p.s0(r1, r6, r4, r5, r4)
            com.unity3d.ads.core.data.model.CachedFile r1 = new com.unity3d.ads.core.data.model.CachedFile
            long r12 = r3.getContentSize()
            java.lang.String r14 = r3.getProtocol()
            if (r2 == 0) goto L_0x0098
            int r2 = r2.intValue()
            r15 = r2
            goto L_0x009e
        L_0x0098:
            r2 = 2147483647(0x7fffffff, float:NaN)
            r15 = 2147483647(0x7fffffff, float:NaN)
        L_0x009e:
            java.lang.String r7 = ""
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r14, r15)
            boolean r2 = com.unity3d.services.core.network.model.HttpResponseKt.isSuccessful(r3)
            if (r2 == 0) goto L_0x00b2
            com.unity3d.ads.core.data.model.CacheResult$Success r2 = new com.unity3d.ads.core.data.model.CacheResult$Success
            com.unity3d.ads.core.data.model.CacheSource r3 = com.unity3d.ads.core.data.model.CacheSource.REMOTE
            r2.<init>(r1, r3)
            goto L_0x00bb
        L_0x00b2:
            com.unity3d.ads.core.data.model.CacheResult$Failure r2 = new com.unity3d.ads.core.data.model.CacheResult$Failure
            com.unity3d.ads.core.data.model.CacheError r1 = com.unity3d.ads.core.data.model.CacheError.NETWORK_ERROR
            com.unity3d.ads.core.data.model.CacheSource r3 = com.unity3d.ads.core.data.model.CacheSource.REMOTE
            r2.<init>(r1, r3)
        L_0x00bb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.getFile(java.io.File, java.lang.String, java.lang.String, java.lang.Integer, xd.d):java.lang.Object");
    }
}
