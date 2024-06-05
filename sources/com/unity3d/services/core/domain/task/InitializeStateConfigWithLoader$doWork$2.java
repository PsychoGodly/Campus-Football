package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.o;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2", f = "InitializeStateConfigWithLoader.kt", l = {58, 101, 109}, m = "invokeSuspend")
/* compiled from: InitializeStateConfigWithLoader.kt */
final class InitializeStateConfigWithLoader$doWork$2 extends l implements p<p0, d<? super o<? extends Configuration>>, Object> {
    final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateConfigWithLoader$doWork$2(InitializeStateConfigWithLoader initializeStateConfigWithLoader, InitializeStateConfigWithLoader.Params params, d<? super InitializeStateConfigWithLoader$doWork$2> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        InitializeStateConfigWithLoader$doWork$2 initializeStateConfigWithLoader$doWork$2 = new InitializeStateConfigWithLoader$doWork$2(this.this$0, this.$params, dVar);
        initializeStateConfigWithLoader$doWork$2.L$0 = obj;
        return initializeStateConfigWithLoader$doWork$2;
    }

    public final Object invoke(p0 p0Var, d<? super o<? extends Configuration>> dVar) {
        return ((InitializeStateConfigWithLoader$doWork$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v60, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: kotlin.jvm.internal.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: kotlin.jvm.internal.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$Params} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v63, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v66, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: kotlin.jvm.internal.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v67, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: kotlin.jvm.internal.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v68, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: kotlin.jvm.internal.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$Params} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v70, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader} */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0215, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0216, code lost:
        r1 = sd.o.f38128b;
        r0 = sd.o.b(sd.p.a(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0242, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0243, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x001f, B:35:0x014f] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0162 A[Catch:{ CancellationException -> 0x0242, all -> 0x0215 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01ab A[Catch:{ CancellationException -> 0x0242, all -> 0x0215 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01e3 A[Catch:{ CancellationException -> 0x0242, all -> 0x0215 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0204 A[Catch:{ CancellationException -> 0x0242, all -> 0x0215 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x022d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r9 = r17
            java.lang.Class<com.unity3d.services.core.network.core.HttpClient> r0 = com.unity3d.services.core.network.core.HttpClient.class
            java.lang.String r1 = ""
            java.lang.Object r10 = yd.d.c()
            int r2 = r9.label
            r11 = 3
            r12 = 2
            r3 = 1
            if (r2 == 0) goto L_0x0075
            if (r2 == r3) goto L_0x0055
            if (r2 == r12) goto L_0x002c
            if (r2 != r11) goto L_0x0024
            java.lang.Object r0 = r9.L$1
            kotlin.jvm.internal.z r0 = (kotlin.jvm.internal.z) r0
            java.lang.Object r1 = r9.L$0
            kotlin.jvm.internal.z r1 = (kotlin.jvm.internal.z) r1
            sd.p.b(r18)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            goto L_0x01d9
        L_0x0024:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002c:
            java.lang.Object r0 = r9.L$4
            r1 = r0
            kotlin.jvm.internal.z r1 = (kotlin.jvm.internal.z) r1
            java.lang.Object r0 = r9.L$3
            r2 = r0
            kotlin.jvm.internal.z r2 = (kotlin.jvm.internal.z) r2
            java.lang.Object r0 = r9.L$2
            r3 = r0
            kotlin.jvm.internal.z r3 = (kotlin.jvm.internal.z) r3
            java.lang.Object r0 = r9.L$1
            r4 = r0
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$Params r4 = (com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params) r4
            java.lang.Object r0 = r9.L$0
            r5 = r0
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader r5 = (com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader) r5
            sd.p.b(r18)     // Catch:{ all -> 0x0052 }
            r0 = r18
            sd.o r0 = (sd.o) r0     // Catch:{ all -> 0x0052 }
            java.lang.Object r0 = r0.i()     // Catch:{ all -> 0x0052 }
            goto L_0x018e
        L_0x0052:
            r0 = move-exception
            goto L_0x0199
        L_0x0055:
            java.lang.Object r0 = r9.L$4
            r1 = r0
            kotlin.jvm.internal.z r1 = (kotlin.jvm.internal.z) r1
            java.lang.Object r0 = r9.L$3
            r2 = r0
            kotlin.jvm.internal.z r2 = (kotlin.jvm.internal.z) r2
            java.lang.Object r0 = r9.L$2
            r3 = r0
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$Params r3 = (com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params) r3
            java.lang.Object r0 = r9.L$1
            r4 = r0
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader r4 = (com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader) r4
            java.lang.Object r0 = r9.L$0
            pe.p0 r0 = (pe.p0) r0
            sd.p.b(r18)     // Catch:{ all -> 0x0072 }
            goto L_0x0140
        L_0x0072:
            r0 = move-exception
            goto L_0x014f
        L_0x0075:
            sd.p.b(r18)
            java.lang.Object r2 = r9.L$0
            pe.p0 r2 = (pe.p0) r2
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader r14 = r9.this$0
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$Params r15 = r9.$params
            sd.o$a r4 = sd.o.f38128b     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.configuration.PrivacyConfigStorage r4 = com.unity3d.services.core.configuration.PrivacyConfigStorage.getInstance()     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.device.reader.DeviceInfoDataFactory r5 = new com.unity3d.services.core.device.reader.DeviceInfoDataFactory     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.request.metrics.SDKMetricsSender r6 = r14.sdkMetricsSender     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r5.<init>(r6)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            kotlin.jvm.internal.z r8 = new kotlin.jvm.internal.z     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r8.<init>()     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.configuration.ConfigurationLoader r6 = new com.unity3d.services.core.configuration.ConfigurationLoader     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.configuration.ConfigurationRequestFactory r7 = new com.unity3d.services.core.configuration.ConfigurationRequestFactory     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.configuration.Configuration r11 = r15.getConfig()     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.configuration.InitRequestType r12 = com.unity3d.services.core.configuration.InitRequestType.TOKEN     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.device.reader.IDeviceInfoDataContainer r12 = r5.getDeviceInfoData(r12)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r7.<init>(r11, r12)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.request.metrics.SDKMetricsSender r11 = r14.sdkMetricsSender     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.di.IServiceProvider r12 = r14.getServiceProvider()     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.di.IServicesRegistry r12 = r12.getRegistry()     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            le.c r3 = kotlin.jvm.internal.a0.b(r0)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            java.lang.Object r3 = r12.getService(r1, r3)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.network.core.HttpClient r3 = (com.unity3d.services.core.network.core.HttpClient) r3     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r6.<init>(r7, r11, r3)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r8.f36055a = r6     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.configuration.PrivacyConfigurationLoader r3 = new com.unity3d.services.core.configuration.PrivacyConfigurationLoader     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.configuration.IConfigurationLoader r6 = (com.unity3d.services.core.configuration.IConfigurationLoader) r6     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.configuration.ConfigurationRequestFactory r7 = new com.unity3d.services.core.configuration.ConfigurationRequestFactory     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.configuration.Configuration r11 = r15.getConfig()     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.configuration.InitRequestType r12 = com.unity3d.services.core.configuration.InitRequestType.PRIVACY     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.device.reader.IDeviceInfoDataContainer r5 = r5.getDeviceInfoData(r12)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r7.<init>(r11, r5)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.di.IServiceProvider r5 = r14.getServiceProvider()     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.di.IServicesRegistry r5 = r5.getRegistry()     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            le.c r0 = kotlin.jvm.internal.a0.b(r0)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            java.lang.Object r0 = r5.getService(r1, r0)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.network.core.HttpClient r0 = (com.unity3d.services.core.network.core.HttpClient) r0     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r3.<init>(r6, r7, r4, r0)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r8.f36055a = r3     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            kotlin.jvm.internal.z r11 = new kotlin.jvm.internal.z     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r11.<init>()     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.configuration.Configuration r0 = new com.unity3d.services.core.configuration.Configuration     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r0.<init>()     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r11.f36055a = r0     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.configuration.Configuration r0 = r15.getConfig()     // Catch:{ all -> 0x0149 }
            int r3 = r0.getMaxRetries()     // Catch:{ all -> 0x0149 }
            com.unity3d.services.core.configuration.Configuration r0 = r15.getConfig()     // Catch:{ all -> 0x0149 }
            double r4 = r0.getRetryScalingFactor()     // Catch:{ all -> 0x0149 }
            com.unity3d.services.core.configuration.Configuration r0 = r15.getConfig()     // Catch:{ all -> 0x0149 }
            long r0 = r0.getRetryDelay()     // Catch:{ all -> 0x0149 }
            com.unity3d.services.core.domain.task.InitializationException r6 = new com.unity3d.services.core.domain.task.InitializationException     // Catch:{ all -> 0x0149 }
            com.unity3d.services.core.configuration.ErrorState r7 = com.unity3d.services.core.configuration.ErrorState.NetworkConfigRequest     // Catch:{ all -> 0x0149 }
            java.lang.Exception r12 = new java.lang.Exception     // Catch:{ all -> 0x0149 }
            r12.<init>()     // Catch:{ all -> 0x0149 }
            com.unity3d.services.core.configuration.Configuration r13 = r15.getConfig()     // Catch:{ all -> 0x0149 }
            r6.<init>(r7, r12, r13)     // Catch:{ all -> 0x0149 }
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1 r7 = new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1     // Catch:{ all -> 0x0149 }
            r12 = 0
            r7.<init>(r14, r8, r11, r12)     // Catch:{ all -> 0x0149 }
            r9.L$0 = r2     // Catch:{ all -> 0x0149 }
            r9.L$1 = r14     // Catch:{ all -> 0x0149 }
            r9.L$2 = r15     // Catch:{ all -> 0x0149 }
            r9.L$3 = r8     // Catch:{ all -> 0x0149 }
            r9.L$4 = r11     // Catch:{ all -> 0x0149 }
            r2 = 1
            r9.label = r2     // Catch:{ all -> 0x0149 }
            r1 = r0
            r12 = r8
            r8 = r17
            java.lang.Object r0 = com.unity3d.services.core.extensions.TaskExtensionsKt.withRetry(r1, r3, r4, r6, r7, r8)     // Catch:{ all -> 0x0147 }
            if (r0 != r10) goto L_0x013c
            return r10
        L_0x013c:
            r1 = r11
            r2 = r12
            r4 = r14
            r3 = r15
        L_0x0140:
            sd.w r0 = sd.w.f38141a     // Catch:{ all -> 0x0072 }
            java.lang.Object r0 = sd.o.b(r0)     // Catch:{ all -> 0x0072 }
            goto L_0x0159
        L_0x0147:
            r0 = move-exception
            goto L_0x014b
        L_0x0149:
            r0 = move-exception
            r12 = r8
        L_0x014b:
            r1 = r11
            r2 = r12
            r4 = r14
            r3 = r15
        L_0x014f:
            sd.o$a r5 = sd.o.f38128b     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            java.lang.Object r0 = sd.p.a(r0)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            java.lang.Object r0 = sd.o.b(r0)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
        L_0x0159:
            r5 = r4
            r4 = r3
            r3 = r2
            boolean r2 = sd.o.f(r0)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            if (r2 == 0) goto L_0x0204
            java.lang.Throwable r0 = sd.o.d(r0)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            boolean r2 = r0 instanceof com.unity3d.services.core.extensions.AbortRetryException     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            if (r2 != 0) goto L_0x01f6
            sd.o$a r0 = sd.o.f38128b     // Catch:{ all -> 0x0197 }
            com.unity3d.services.core.domain.task.InitializeStateNetworkError r0 = r5.initializeStateNetworkError     // Catch:{ all -> 0x0197 }
            com.unity3d.services.core.domain.task.InitializeStateNetworkError$Params r2 = new com.unity3d.services.core.domain.task.InitializeStateNetworkError$Params     // Catch:{ all -> 0x0197 }
            com.unity3d.services.core.configuration.Configuration r6 = r4.getConfig()     // Catch:{ all -> 0x0197 }
            r2.<init>(r6)     // Catch:{ all -> 0x0197 }
            r9.L$0 = r5     // Catch:{ all -> 0x0197 }
            r9.L$1 = r4     // Catch:{ all -> 0x0197 }
            r9.L$2 = r3     // Catch:{ all -> 0x0197 }
            r9.L$3 = r1     // Catch:{ all -> 0x0197 }
            r9.L$4 = r1     // Catch:{ all -> 0x0197 }
            r6 = 2
            r9.label = r6     // Catch:{ all -> 0x0197 }
            java.lang.Object r0 = r0.m65invokegIAlus(r2, r9)     // Catch:{ all -> 0x0197 }
            if (r0 != r10) goto L_0x018d
            return r10
        L_0x018d:
            r2 = r1
        L_0x018e:
            sd.o r0 = sd.o.a(r0)     // Catch:{ all -> 0x0052 }
            java.lang.Object r0 = sd.o.b(r0)     // Catch:{ all -> 0x0052 }
            goto L_0x01a3
        L_0x0197:
            r0 = move-exception
            r2 = r1
        L_0x0199:
            sd.o$a r6 = sd.o.f38128b     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            java.lang.Object r0 = sd.p.a(r0)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            java.lang.Object r0 = sd.o.b(r0)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
        L_0x01a3:
            r8 = r2
            r6 = r4
            boolean r0 = sd.o.g(r0)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            if (r0 == 0) goto L_0x01e3
            com.unity3d.services.core.configuration.IInitializeEventsMetricSender r0 = com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance()     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r0.onRetryConfig()     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.domain.ISDKDispatchers r0 = r5.dispatchers     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            pe.k0 r0 = r0.getIo()     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1 r11 = new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r7 = 0
            r2 = r11
            r4 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r9.L$0 = r8     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r9.L$1 = r1     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r2 = 0
            r9.L$2 = r2     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r9.L$3 = r2     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r9.L$4 = r2     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r2 = 3
            r9.label = r2     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            java.lang.Object r0 = pe.i.g(r0, r11, r9)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            if (r0 != r10) goto L_0x01d7
            return r10
        L_0x01d7:
            r0 = r1
            r1 = r8
        L_0x01d9:
            T r2 = r1.f36055a     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.configuration.Configuration r2 = (com.unity3d.services.core.configuration.Configuration) r2     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r16 = r1
            r1 = r0
            r0 = r16
            goto L_0x020a
        L_0x01e3:
            com.unity3d.services.core.domain.task.InitializationException r0 = new com.unity3d.services.core.domain.task.InitializationException     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.configuration.ErrorState r1 = com.unity3d.services.core.configuration.ErrorState.NetworkConfigRequest     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            java.lang.String r3 = "No connected events within the timeout!"
            r2.<init>(r3)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.configuration.Configuration r3 = r6.getConfig()     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r0.<init>(r1, r2, r3)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            throw r0     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
        L_0x01f6:
            com.unity3d.services.core.domain.task.InitializationException r1 = new com.unity3d.services.core.domain.task.InitializationException     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.configuration.ErrorState r2 = com.unity3d.services.core.configuration.ErrorState.NetworkConfigRequest     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            java.lang.Exception r0 = (java.lang.Exception) r0     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.configuration.Configuration r3 = r4.getConfig()     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r1.<init>(r2, r0, r3)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            throw r1     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
        L_0x0204:
            T r0 = r1.f36055a     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r2 = r0
            com.unity3d.services.core.configuration.Configuration r2 = (com.unity3d.services.core.configuration.Configuration) r2     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            r0 = r1
        L_0x020a:
            r1.f36055a = r2     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            T r0 = r0.f36055a     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            com.unity3d.services.core.configuration.Configuration r0 = (com.unity3d.services.core.configuration.Configuration) r0     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            java.lang.Object r0 = sd.o.b(r0)     // Catch:{ CancellationException -> 0x0242, all -> 0x0215 }
            goto L_0x0220
        L_0x0215:
            r0 = move-exception
            sd.o$a r1 = sd.o.f38128b
            java.lang.Object r0 = sd.p.a(r0)
            java.lang.Object r0 = sd.o.b(r0)
        L_0x0220:
            boolean r1 = sd.o.g(r0)
            if (r1 == 0) goto L_0x022d
            sd.o$a r1 = sd.o.f38128b
            java.lang.Object r0 = sd.o.b(r0)
            goto L_0x023d
        L_0x022d:
            java.lang.Throwable r1 = sd.o.d(r0)
            if (r1 == 0) goto L_0x023d
            sd.o$a r0 = sd.o.f38128b
            java.lang.Object r0 = sd.p.a(r1)
            java.lang.Object r0 = sd.o.b(r0)
        L_0x023d:
            sd.o r0 = sd.o.a(r0)
            return r0
        L_0x0242:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
