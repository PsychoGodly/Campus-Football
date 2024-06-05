package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import kotlin.jvm.internal.m;

/* compiled from: CommonCacheFile.kt */
public final class CommonCacheFile implements CacheFile {
    private final CacheRepository cacheRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCacheFile(CacheRepository cacheRepository2, SendDiagnosticEvent sendDiagnosticEvent2) {
        m.e(cacheRepository2, "cacheRepository");
        m.e(sendDiagnosticEvent2, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository2;
        this.sendDiagnosticEvent = sendDiagnosticEvent2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.String r19, com.unity3d.ads.core.data.model.AdObject r20, org.json.JSONArray r21, int r22, xd.d<? super com.unity3d.ads.core.data.model.CacheResult> r23) {
        /*
            r18 = this;
            r0 = r18
            r1 = r23
            boolean r2 = r1 instanceof com.unity3d.ads.core.domain.CommonCacheFile$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.unity3d.ads.core.domain.CommonCacheFile$invoke$1 r2 = (com.unity3d.ads.core.domain.CommonCacheFile$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.unity3d.ads.core.domain.CommonCacheFile$invoke$1 r2 = new com.unity3d.ads.core.domain.CommonCacheFile$invoke$1
            r2.<init>(r0, r1)
        L_0x001c:
            r8 = r2
            java.lang.Object r1 = r8.result
            java.lang.Object r2 = yd.d.c()
            int r3 = r8.label
            r9 = 1
            if (r3 == 0) goto L_0x0048
            if (r3 != r9) goto L_0x0040
            long r2 = r8.J$0
            java.lang.Object r4 = r8.L$2
            com.unity3d.ads.core.data.model.AdObject r4 = (com.unity3d.ads.core.data.model.AdObject) r4
            java.lang.Object r5 = r8.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r8.L$0
            com.unity3d.ads.core.domain.CommonCacheFile r6 = (com.unity3d.ads.core.domain.CommonCacheFile) r6
            sd.p.b(r1)
            r10 = r2
            r15 = r4
            r3 = r1
            r1 = r5
            goto L_0x0078
        L_0x0040:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0048:
            sd.p.b(r1)
            oe.j r1 = oe.j.f36786a
            long r10 = r1.a()
            com.unity3d.ads.core.data.repository.CacheRepository r3 = r0.cacheRepository
            com.google.protobuf.i r1 = r20.getOpportunityId()
            java.lang.String r5 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toISO8859String(r1)
            r8.L$0 = r0
            r1 = r19
            r8.L$1 = r1
            r12 = r20
            r8.L$2 = r12
            r8.J$0 = r10
            r8.label = r9
            r4 = r19
            r6 = r21
            r7 = r22
            java.lang.Object r3 = r3.getFile(r4, r5, r6, r7, r8)
            if (r3 != r2) goto L_0x0076
            return r2
        L_0x0076:
            r6 = r0
            r15 = r12
        L_0x0078:
            r8 = r3
            com.unity3d.ads.core.data.model.CacheResult r8 = (com.unity3d.ads.core.data.model.CacheResult) r8
            boolean r2 = r8 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
            r3 = 2
            java.lang.String r4 = "url"
            java.lang.String r5 = "cache_source"
            r7 = 0
            r12 = 3
            if (r2 == 0) goto L_0x00e5
            com.unity3d.ads.core.domain.SendDiagnosticEvent r2 = r6.sendDiagnosticEvent
            oe.j$a r6 = oe.j.a.c(r10)
            double r10 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r6)
            java.lang.Double r6 = kotlin.coroutines.jvm.internal.b.b(r10)
            sd.n[] r10 = new sd.n[r12]
            r11 = r8
            com.unity3d.ads.core.data.model.CacheResult$Success r11 = (com.unity3d.ads.core.data.model.CacheResult.Success) r11
            com.unity3d.ads.core.data.model.CacheSource r12 = r11.getSource()
            java.lang.String r12 = r12.toString()
            sd.n r5 = sd.s.a(r5, r12)
            r10[r7] = r5
            sd.n r1 = sd.s.a(r4, r1)
            r10[r9] = r1
            com.unity3d.ads.core.data.model.CachedFile r1 = r11.getCachedFile()
            java.lang.String r1 = r1.getProtocol()
            java.lang.String r4 = "protocol"
            sd.n r1 = sd.s.a(r4, r1)
            r10[r3] = r1
            java.util.Map r5 = td.k0.j(r10)
            com.unity3d.ads.core.data.model.CachedFile r1 = r11.getCachedFile()
            long r3 = r1.getContentLength()
            r1 = 1024(0x400, float:1.435E-42)
            long r9 = (long) r1
            long r3 = r3 / r9
            int r1 = (int) r3
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.b.c(r1)
            java.lang.String r3 = "size_kb"
            sd.n r1 = sd.s.a(r3, r1)
            java.util.Map r1 = td.j0.e(r1)
            java.lang.String r3 = "native_load_cache_success_time"
            r4 = r6
            r6 = r1
            r7 = r15
            r2.invoke(r3, r4, r5, r6, r7)
            goto L_0x0130
        L_0x00e5:
            boolean r2 = r8 instanceof com.unity3d.ads.core.data.model.CacheResult.Failure
            if (r2 == 0) goto L_0x0130
            com.unity3d.ads.core.domain.SendDiagnosticEvent r2 = r6.sendDiagnosticEvent
            oe.j$a r6 = oe.j.a.c(r10)
            double r10 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r6)
            java.lang.Double r6 = kotlin.coroutines.jvm.internal.b.b(r10)
            sd.n[] r10 = new sd.n[r12]
            r11 = r8
            com.unity3d.ads.core.data.model.CacheResult$Failure r11 = (com.unity3d.ads.core.data.model.CacheResult.Failure) r11
            com.unity3d.ads.core.data.model.CacheSource r12 = r11.getSource()
            java.lang.String r12 = r12.toString()
            sd.n r5 = sd.s.a(r5, r12)
            r10[r7] = r5
            sd.n r1 = sd.s.a(r4, r1)
            r10[r9] = r1
            com.unity3d.ads.core.data.model.CacheError r1 = r11.getError()
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "reason"
            sd.n r1 = sd.s.a(r4, r1)
            r10[r3] = r1
            java.util.Map r13 = td.k0.j(r10)
            r14 = 0
            r16 = 8
            r17 = 0
            java.lang.String r11 = "native_load_cache_failure_time"
            r10 = r2
            r12 = r6
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x0130:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonCacheFile.invoke(java.lang.String, com.unity3d.ads.core.data.model.AdObject, org.json.JSONArray, int, xd.d):java.lang.Object");
    }
}
