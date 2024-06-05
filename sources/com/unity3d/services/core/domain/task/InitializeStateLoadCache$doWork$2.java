package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.o;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2", f = "InitializeStateLoadCache.kt", l = {}, m = "invokeSuspend")
/* compiled from: InitializeStateLoadCache.kt */
final class InitializeStateLoadCache$doWork$2 extends l implements p<p0, d<? super o<? extends InitializeStateLoadCache.LoadCacheResult>>, Object> {
    final /* synthetic */ InitializeStateLoadCache.Params $params;
    int label;
    final /* synthetic */ InitializeStateLoadCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateLoadCache$doWork$2(InitializeStateLoadCache initializeStateLoadCache, InitializeStateLoadCache.Params params, d<? super InitializeStateLoadCache$doWork$2> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateLoadCache;
        this.$params = params;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new InitializeStateLoadCache$doWork$2(this.this$0, this.$params, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super o<InitializeStateLoadCache.LoadCacheResult>> dVar) {
        return ((InitializeStateLoadCache$doWork$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f A[Catch:{ CancellationException -> 0x0090, all -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058 A[Catch:{ CancellationException -> 0x0090, all -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059 A[Catch:{ CancellationException -> 0x0090, all -> 0x0063 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object unused = yd.d.c()
            int r0 = r5.label
            if (r0 != 0) goto L_0x0092
            sd.p.b(r6)
            com.unity3d.services.core.domain.task.InitializeStateLoadCache r6 = r5.this$0
            com.unity3d.services.core.domain.task.InitializeStateLoadCache$Params r0 = r5.$params
            sd.o$a r1 = sd.o.f38128b     // Catch:{ CancellationException -> 0x0090, all -> 0x0063 }
            java.lang.String r1 = "Unity Ads init: check if webapp can be loaded from local cache"
            com.unity3d.services.core.log.DeviceLog.debug(r1)     // Catch:{ CancellationException -> 0x0090, all -> 0x0063 }
            byte[] r6 = r6.getWebViewData()     // Catch:{ CancellationException -> 0x0090, all -> 0x0063 }
            r1 = 1
            if (r6 != 0) goto L_0x0024
            com.unity3d.services.core.domain.task.InitializeStateLoadCache$LoadCacheResult r6 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache$LoadCacheResult     // Catch:{ CancellationException -> 0x0090, all -> 0x0063 }
            r0 = 2
            r2 = 0
            r6.<init>(r1, r2, r0, r2)     // Catch:{ CancellationException -> 0x0090, all -> 0x0063 }
            goto L_0x005e
        L_0x0024:
            java.lang.String r2 = com.unity3d.services.core.misc.Utilities.Sha256((byte[]) r6)     // Catch:{ CancellationException -> 0x0090, all -> 0x0063 }
            java.lang.String r3 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)     // Catch:{ CancellationException -> 0x0090, all -> 0x0063 }
            java.lang.String r4 = "forName(\"UTF-8\")"
            kotlin.jvm.internal.m.d(r3, r4)     // Catch:{ CancellationException -> 0x0090, all -> 0x0063 }
            java.lang.String r4 = new java.lang.String     // Catch:{ CancellationException -> 0x0090, all -> 0x0063 }
            r4.<init>(r6, r3)     // Catch:{ CancellationException -> 0x0090, all -> 0x0063 }
            r6 = 0
            if (r2 == 0) goto L_0x004c
            com.unity3d.services.core.configuration.Configuration r0 = r0.getConfig()     // Catch:{ CancellationException -> 0x0090, all -> 0x0063 }
            java.lang.String r0 = r0.getWebViewHash()     // Catch:{ CancellationException -> 0x0090, all -> 0x0063 }
            boolean r0 = kotlin.jvm.internal.m.a(r2, r0)     // Catch:{ CancellationException -> 0x0090, all -> 0x0063 }
            if (r0 != 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r0 = 0
            goto L_0x004d
        L_0x004c:
            r0 = 1
        L_0x004d:
            if (r0 != 0) goto L_0x0054
            java.lang.String r2 = "Unity Ads init: webapp loaded from local cache"
            com.unity3d.services.core.log.DeviceLog.info(r2)     // Catch:{ CancellationException -> 0x0090, all -> 0x0063 }
        L_0x0054:
            com.unity3d.services.core.domain.task.InitializeStateLoadCache$LoadCacheResult r2 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache$LoadCacheResult     // Catch:{ CancellationException -> 0x0090, all -> 0x0063 }
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            r2.<init>(r1, r4)     // Catch:{ CancellationException -> 0x0090, all -> 0x0063 }
            r6 = r2
        L_0x005e:
            java.lang.Object r6 = sd.o.b(r6)     // Catch:{ CancellationException -> 0x0090, all -> 0x0063 }
            goto L_0x006e
        L_0x0063:
            r6 = move-exception
            sd.o$a r0 = sd.o.f38128b
            java.lang.Object r6 = sd.p.a(r6)
            java.lang.Object r6 = sd.o.b(r6)
        L_0x006e:
            boolean r0 = sd.o.g(r6)
            if (r0 == 0) goto L_0x007b
            sd.o$a r0 = sd.o.f38128b
            java.lang.Object r6 = sd.o.b(r6)
            goto L_0x008b
        L_0x007b:
            java.lang.Throwable r0 = sd.o.d(r6)
            if (r0 == 0) goto L_0x008b
            sd.o$a r6 = sd.o.f38128b
            java.lang.Object r6 = sd.p.a(r0)
            java.lang.Object r6 = sd.o.b(r6)
        L_0x008b:
            sd.o r6 = sd.o.a(r6)
            return r6
        L_0x0090:
            r6 = move-exception
            throw r6
        L_0x0092:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
