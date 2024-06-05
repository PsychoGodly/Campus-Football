package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import kotlin.jvm.internal.m;

/* compiled from: CommonClearCache.kt */
public final class CommonClearCache implements ClearCache {
    private final CacheRepository cacheRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonClearCache(CacheRepository cacheRepository2, SendDiagnosticEvent sendDiagnosticEvent2) {
        m.e(cacheRepository2, "cacheRepository");
        m.e(sendDiagnosticEvent2, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository2;
        this.sendDiagnosticEvent = sendDiagnosticEvent2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(xd.d<? super sd.w> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.core.domain.CommonClearCache$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.unity3d.ads.core.domain.CommonClearCache$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonClearCache$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.CommonClearCache$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonClearCache$invoke$1
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            long r1 = r0.J$1
            long r3 = r0.J$0
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.CommonClearCache r0 = (com.unity3d.ads.core.domain.CommonClearCache) r0
            sd.p.b(r14)
            goto L_0x007a
        L_0x0034:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x003c:
            long r4 = r0.J$0
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.CommonClearCache r2 = (com.unity3d.ads.core.domain.CommonClearCache) r2
            sd.p.b(r14)
            goto L_0x0060
        L_0x0046:
            sd.p.b(r14)
            oe.j r14 = oe.j.f36786a
            long r5 = r14.a()
            com.unity3d.ads.core.data.repository.CacheRepository r14 = r13.cacheRepository
            r0.L$0 = r13
            r0.J$0 = r5
            r0.label = r4
            java.lang.Object r14 = r14.getCacheSize(r0)
            if (r14 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r2 = r13
            r4 = r5
        L_0x0060:
            java.lang.Number r14 = (java.lang.Number) r14
            long r6 = r14.longValue()
            com.unity3d.ads.core.data.repository.CacheRepository r14 = r2.cacheRepository
            r0.L$0 = r2
            r0.J$0 = r4
            r0.J$1 = r6
            r0.label = r3
            java.lang.Object r14 = r14.clearCache(r0)
            if (r14 != r1) goto L_0x0077
            return r1
        L_0x0077:
            r0 = r2
            r3 = r4
            r1 = r6
        L_0x007a:
            com.unity3d.ads.core.domain.SendDiagnosticEvent r5 = r0.sendDiagnosticEvent
            oe.j$a r14 = oe.j.a.c(r3)
            double r3 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r14)
            java.lang.Double r7 = kotlin.coroutines.jvm.internal.b.b(r3)
            r8 = 0
            r14 = 1024(0x400, float:1.435E-42)
            long r3 = (long) r14
            long r1 = r1 / r3
            int r14 = (int) r1
            java.lang.Integer r14 = kotlin.coroutines.jvm.internal.b.c(r14)
            java.lang.String r0 = "size_kb"
            sd.n r14 = sd.s.a(r0, r14)
            java.util.Map r9 = td.j0.e(r14)
            r10 = 0
            r11 = 20
            r12 = 0
            java.lang.String r6 = "native_initialize_clear_cache_time"
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r5, r6, r7, r8, r9, r10, r11, r12)
            sd.w r14 = sd.w.f38141a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonClearCache.invoke(xd.d):java.lang.Object");
    }
}
