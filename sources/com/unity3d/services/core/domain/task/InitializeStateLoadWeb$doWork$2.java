package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.o;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2", f = "InitializeStateLoadWeb.kt", l = {46, 64, 71}, m = "invokeSuspend")
/* compiled from: InitializeStateLoadWeb.kt */
final class InitializeStateLoadWeb$doWork$2 extends l implements p<p0, d<? super o<? extends InitializeStateLoadWeb.LoadWebResult>>, Object> {
    final /* synthetic */ InitializeStateLoadWeb.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateLoadWeb$doWork$2(InitializeStateLoadWeb.Params params, InitializeStateLoadWeb initializeStateLoadWeb, d<? super InitializeStateLoadWeb$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
        this.this$0 = initializeStateLoadWeb;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2 = new InitializeStateLoadWeb$doWork$2(this.$params, this.this$0, dVar);
        initializeStateLoadWeb$doWork$2.L$0 = obj;
        return initializeStateLoadWeb$doWork$2;
    }

    public final Object invoke(p0 p0Var, d<? super o<InitializeStateLoadWeb.LoadWebResult>> dVar) {
        return ((InitializeStateLoadWeb$doWork$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: com.unity3d.services.core.network.model.HttpRequest} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v52, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: com.unity3d.services.core.domain.task.InitializeStateLoadWeb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: com.unity3d.services.core.network.model.HttpRequest} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v58, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: com.unity3d.services.core.domain.task.InitializeStateLoadWeb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012f A[SYNTHETIC, Splitter:B:41:0x012f] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0169 A[Catch:{ CancellationException -> 0x021c, all -> 0x01ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x018b A[Catch:{ CancellationException -> 0x021c, all -> 0x01ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x019e A[Catch:{ CancellationException -> 0x021c, all -> 0x01ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01b5 A[Catch:{ CancellationException -> 0x021c, all -> 0x01ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01d5 A[Catch:{ CancellationException -> 0x021c, all -> 0x01ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0207  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            r36 = this;
            r9 = r36
            java.lang.Object r10 = yd.d.c()
            int r0 = r9.label
            r11 = 3
            r12 = 2
            r1 = 1
            r13 = 0
            if (r0 == 0) goto L_0x0064
            if (r0 == r1) goto L_0x0047
            if (r0 == r12) goto L_0x0028
            if (r0 != r11) goto L_0x0020
            java.lang.Object r0 = r9.L$0
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params r0 = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params) r0
            sd.p.b(r37)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            r3 = r0
            r0 = r37
            goto L_0x0188
        L_0x0020:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0028:
            java.lang.Object r0 = r9.L$2
            r1 = r0
            com.unity3d.services.core.network.model.HttpRequest r1 = (com.unity3d.services.core.network.model.HttpRequest) r1
            java.lang.Object r0 = r9.L$1
            r2 = r0
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb r2 = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb) r2
            java.lang.Object r0 = r9.L$0
            r3 = r0
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params r3 = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params) r3
            sd.p.b(r37)     // Catch:{ all -> 0x0044 }
            r0 = r37
            sd.o r0 = (sd.o) r0     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r0.i()     // Catch:{ all -> 0x0044 }
            goto L_0x0150
        L_0x0044:
            r0 = move-exception
            goto L_0x0159
        L_0x0047:
            java.lang.Object r0 = r9.L$3
            r1 = r0
            com.unity3d.services.core.network.model.HttpRequest r1 = (com.unity3d.services.core.network.model.HttpRequest) r1
            java.lang.Object r0 = r9.L$2
            r2 = r0
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb r2 = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb) r2
            java.lang.Object r0 = r9.L$1
            r3 = r0
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params r3 = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params) r3
            java.lang.Object r0 = r9.L$0
            pe.p0 r0 = (pe.p0) r0
            sd.p.b(r37)     // Catch:{ all -> 0x0061 }
            r0 = r37
            goto L_0x0111
        L_0x0061:
            r0 = move-exception
            goto L_0x011f
        L_0x0064:
            sd.p.b(r37)
            java.lang.Object r0 = r9.L$0
            pe.p0 r0 = (pe.p0) r0
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params r14 = r9.$params
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb r15 = r9.this$0
            sd.o$a r2 = sd.o.f38128b     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            r2.<init>()     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            java.lang.String r3 = "Unity Ads init: loading webapp from "
            r2.append(r3)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            com.unity3d.services.core.configuration.Configuration r3 = r14.getConfig()     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            java.lang.String r3 = r3.getWebViewUrl()     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            r2.append(r3)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            java.lang.String r2 = r2.toString()     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            com.unity3d.services.core.log.DeviceLog.info(r2)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            com.unity3d.services.core.network.model.HttpRequest r8 = new com.unity3d.services.core.network.model.HttpRequest     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            com.unity3d.services.core.configuration.Configuration r2 = r14.getConfig()     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            java.lang.String r2 = r2.getWebViewUrl()     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            java.lang.String r3 = "params.config.webViewUrl"
            kotlin.jvm.internal.m.d(r2, r3)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            r18 = 0
            com.unity3d.services.core.network.model.RequestType r19 = com.unity3d.services.core.network.model.RequestType.GET     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 131066(0x1fffa, float:1.83663E-40)
            r35 = 0
            r16 = r8
            r17 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            com.unity3d.services.core.configuration.Configuration r2 = r14.getConfig()     // Catch:{ all -> 0x011a }
            int r3 = r2.getMaxRetries()     // Catch:{ all -> 0x011a }
            com.unity3d.services.core.configuration.Configuration r2 = r14.getConfig()     // Catch:{ all -> 0x011a }
            double r4 = r2.getRetryScalingFactor()     // Catch:{ all -> 0x011a }
            com.unity3d.services.core.configuration.Configuration r2 = r14.getConfig()     // Catch:{ all -> 0x011a }
            long r6 = r2.getRetryDelay()     // Catch:{ all -> 0x011a }
            com.unity3d.services.core.domain.task.InitializationException r2 = new com.unity3d.services.core.domain.task.InitializationException     // Catch:{ all -> 0x011a }
            com.unity3d.services.core.configuration.ErrorState r11 = com.unity3d.services.core.configuration.ErrorState.NetworkWebviewRequest     // Catch:{ all -> 0x011a }
            java.lang.Exception r12 = new java.lang.Exception     // Catch:{ all -> 0x011a }
            r12.<init>()     // Catch:{ all -> 0x011a }
            com.unity3d.services.core.configuration.Configuration r1 = r14.getConfig()     // Catch:{ all -> 0x011a }
            r2.<init>(r11, r12, r1)     // Catch:{ all -> 0x011a }
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1 r11 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1     // Catch:{ all -> 0x011a }
            r11.<init>(r15, r8, r13)     // Catch:{ all -> 0x011a }
            r9.L$0 = r0     // Catch:{ all -> 0x011a }
            r9.L$1 = r14     // Catch:{ all -> 0x011a }
            r9.L$2 = r15     // Catch:{ all -> 0x011a }
            r9.L$3 = r8     // Catch:{ all -> 0x011a }
            r0 = 1
            r9.label = r0     // Catch:{ all -> 0x011a }
            r0 = r2
            r1 = r6
            r6 = r0
            r7 = r11
            r11 = r8
            r8 = r36
            java.lang.Object r0 = com.unity3d.services.core.extensions.TaskExtensionsKt.withRetry(r1, r3, r4, r6, r7, r8)     // Catch:{ all -> 0x0118 }
            if (r0 != r10) goto L_0x010e
            return r10
        L_0x010e:
            r1 = r11
            r3 = r14
            r2 = r15
        L_0x0111:
            com.unity3d.services.core.network.model.HttpResponse r0 = (com.unity3d.services.core.network.model.HttpResponse) r0     // Catch:{ all -> 0x0061 }
            java.lang.Object r0 = sd.o.b(r0)     // Catch:{ all -> 0x0061 }
            goto L_0x0129
        L_0x0118:
            r0 = move-exception
            goto L_0x011c
        L_0x011a:
            r0 = move-exception
            r11 = r8
        L_0x011c:
            r1 = r11
            r3 = r14
            r2 = r15
        L_0x011f:
            sd.o$a r4 = sd.o.f38128b     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            java.lang.Object r0 = sd.p.a(r0)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            java.lang.Object r0 = sd.o.b(r0)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
        L_0x0129:
            boolean r4 = sd.o.f(r0)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            if (r4 == 0) goto L_0x019e
            sd.o$a r0 = sd.o.f38128b     // Catch:{ all -> 0x0044 }
            com.unity3d.services.core.domain.task.InitializeStateNetworkError r0 = r2.initializeStateNetworkError     // Catch:{ all -> 0x0044 }
            com.unity3d.services.core.domain.task.InitializeStateNetworkError$Params r4 = new com.unity3d.services.core.domain.task.InitializeStateNetworkError$Params     // Catch:{ all -> 0x0044 }
            com.unity3d.services.core.configuration.Configuration r5 = r3.getConfig()     // Catch:{ all -> 0x0044 }
            r4.<init>(r5)     // Catch:{ all -> 0x0044 }
            r9.L$0 = r3     // Catch:{ all -> 0x0044 }
            r9.L$1 = r2     // Catch:{ all -> 0x0044 }
            r9.L$2 = r1     // Catch:{ all -> 0x0044 }
            r9.L$3 = r13     // Catch:{ all -> 0x0044 }
            r5 = 2
            r9.label = r5     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r0.m65invokegIAlus(r4, r9)     // Catch:{ all -> 0x0044 }
            if (r0 != r10) goto L_0x0150
            return r10
        L_0x0150:
            sd.o r0 = sd.o.a(r0)     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = sd.o.b(r0)     // Catch:{ all -> 0x0044 }
            goto L_0x0163
        L_0x0159:
            sd.o$a r4 = sd.o.f38128b     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            java.lang.Object r0 = sd.p.a(r0)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            java.lang.Object r0 = sd.o.b(r0)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
        L_0x0163:
            boolean r0 = sd.o.g(r0)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            if (r0 == 0) goto L_0x018b
            com.unity3d.services.core.domain.ISDKDispatchers r0 = r2.dispatchers     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            pe.k0 r0 = r0.getIo()     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1 r4 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            r4.<init>(r2, r1, r13)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            r9.L$0 = r3     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            r9.L$1 = r13     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            r9.L$2 = r13     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            r9.L$3 = r13     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            r1 = 3
            r9.label = r1     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            java.lang.Object r0 = pe.i.g(r0, r4, r9)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            if (r0 != r10) goto L_0x0188
            return r10
        L_0x0188:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            goto L_0x01ab
        L_0x018b:
            com.unity3d.services.core.domain.task.InitializationException r0 = new com.unity3d.services.core.domain.task.InitializationException     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            com.unity3d.services.core.configuration.ErrorState r1 = com.unity3d.services.core.configuration.ErrorState.NetworkWebviewRequest     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            java.lang.String r4 = "No connected events within the timeout!"
            r2.<init>(r4)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            com.unity3d.services.core.configuration.Configuration r3 = r3.getConfig()     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            r0.<init>(r1, r2, r3)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            throw r0     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
        L_0x019e:
            sd.p.b(r0)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            com.unity3d.services.core.network.model.HttpResponse r0 = (com.unity3d.services.core.network.model.HttpResponse) r0     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            java.lang.Object r0 = r0.getBody()     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            java.lang.String r0 = r0.toString()     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
        L_0x01ab:
            com.unity3d.services.core.configuration.Configuration r1 = r3.getConfig()     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            java.lang.String r1 = r1.getWebViewHash()     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            if (r1 == 0) goto L_0x01d3
            java.lang.String r2 = com.unity3d.services.core.misc.Utilities.Sha256((java.lang.String) r0)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            boolean r2 = kotlin.jvm.internal.m.a(r2, r1)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            if (r2 == 0) goto L_0x01c0
            goto L_0x01d3
        L_0x01c0:
            com.unity3d.services.core.domain.task.InitializationException r0 = new com.unity3d.services.core.domain.task.InitializationException     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            com.unity3d.services.core.configuration.ErrorState r1 = com.unity3d.services.core.configuration.ErrorState.InvalidHash     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            java.lang.String r4 = "Invalid webViewHash"
            r2.<init>(r4)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            com.unity3d.services.core.configuration.Configuration r3 = r3.getConfig()     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            r0.<init>(r1, r2, r3)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            throw r0     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
        L_0x01d3:
            if (r1 == 0) goto L_0x01e1
            java.io.File r1 = new java.io.File     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            java.lang.String r2 = com.unity3d.services.core.properties.SdkProperties.getLocalWebViewFile()     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            r1.<init>(r2)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            com.unity3d.services.core.misc.Utilities.writeFile(r1, r0)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
        L_0x01e1:
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$LoadWebResult r1 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$LoadWebResult     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            com.unity3d.services.core.configuration.Configuration r2 = r3.getConfig()     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            r1.<init>(r2, r0)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            java.lang.Object r0 = sd.o.b(r1)     // Catch:{ CancellationException -> 0x021c, all -> 0x01ef }
            goto L_0x01fa
        L_0x01ef:
            r0 = move-exception
            sd.o$a r1 = sd.o.f38128b
            java.lang.Object r0 = sd.p.a(r0)
            java.lang.Object r0 = sd.o.b(r0)
        L_0x01fa:
            boolean r1 = sd.o.g(r0)
            if (r1 == 0) goto L_0x0207
            sd.o$a r1 = sd.o.f38128b
            java.lang.Object r0 = sd.o.b(r0)
            goto L_0x0217
        L_0x0207:
            java.lang.Throwable r1 = sd.o.d(r0)
            if (r1 == 0) goto L_0x0217
            sd.o$a r0 = sd.o.f38128b
            java.lang.Object r0 = sd.p.a(r1)
            java.lang.Object r0 = sd.o.b(r0)
        L_0x0217:
            sd.o r0 = sd.o.a(r0)
            return r0
        L_0x021c:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
