package com.unity3d.services.core.domain.task;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.jvm.internal.m;
import sd.w;

/* compiled from: InitializeSDK.kt */
public final class InitializeSDK extends MetricTask<EmptyParams, w> {
    /* access modifiers changed from: private */
    public final ConfigFileFromLocalStorage configFileFromLocalStorage;
    private final ISDKDispatchers dispatchers;
    /* access modifiers changed from: private */
    public final InitializeStateComplete initializeStateComplete;
    /* access modifiers changed from: private */
    public final InitializeStateConfig initializeStateConfig;
    /* access modifiers changed from: private */
    public final InitializeStateCreate initializeStateCreate;
    private final InitializeStateError initializeStateError;
    /* access modifiers changed from: private */
    public final InitializeStateLoadCache initializeStateLoadCache;
    /* access modifiers changed from: private */
    public final InitializeStateLoadWeb initializeStateLoadWeb;
    /* access modifiers changed from: private */
    public final InitializeStateReset initializeStateReset;

    public InitializeSDK(ISDKDispatchers iSDKDispatchers, ConfigFileFromLocalStorage configFileFromLocalStorage2, InitializeStateReset initializeStateReset2, InitializeStateError initializeStateError2, InitializeStateConfig initializeStateConfig2, InitializeStateCreate initializeStateCreate2, InitializeStateLoadCache initializeStateLoadCache2, InitializeStateLoadWeb initializeStateLoadWeb2, InitializeStateComplete initializeStateComplete2) {
        m.e(iSDKDispatchers, "dispatchers");
        m.e(configFileFromLocalStorage2, "configFileFromLocalStorage");
        m.e(initializeStateReset2, "initializeStateReset");
        m.e(initializeStateError2, "initializeStateError");
        m.e(initializeStateConfig2, "initializeStateConfig");
        m.e(initializeStateCreate2, "initializeStateCreate");
        m.e(initializeStateLoadCache2, "initializeStateLoadCache");
        m.e(initializeStateLoadWeb2, "initializeStateLoadWeb");
        m.e(initializeStateComplete2, "initializeStateComplete");
        this.dispatchers = iSDKDispatchers;
        this.configFileFromLocalStorage = configFileFromLocalStorage2;
        this.initializeStateReset = initializeStateReset2;
        this.initializeStateError = initializeStateError2;
        this.initializeStateConfig = initializeStateConfig2;
        this.initializeStateCreate = initializeStateCreate2;
        this.initializeStateLoadCache = initializeStateLoadCache2;
        this.initializeStateLoadWeb = initializeStateLoadWeb2;
        this.initializeStateComplete = initializeStateComplete2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: executeErrorState-BWLJW6A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m40executeErrorStateBWLJW6A(com.unity3d.services.core.configuration.ErrorState r6, java.lang.Throwable r7, com.unity3d.services.core.configuration.Configuration r8, xd.d<? super sd.o<sd.w>> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1 r0 = (com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1 r0 = new com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            sd.p.b(r9)
            sd.o r9 = (sd.o) r9
            java.lang.Object r6 = r9.i()
            goto L_0x0057
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            sd.p.b(r9)
            com.unity3d.services.core.domain.task.InitializeStateError r9 = r5.initializeStateError
            com.unity3d.services.core.domain.task.InitializeStateError$Params r2 = new com.unity3d.services.core.domain.task.InitializeStateError$Params
            java.lang.Exception r4 = new java.lang.Exception
            if (r7 == 0) goto L_0x0047
            java.lang.String r7 = r7.getMessage()
            goto L_0x0048
        L_0x0047:
            r7 = 0
        L_0x0048:
            r4.<init>(r7)
            r2.<init>(r6, r4, r8)
            r0.label = r3
            java.lang.Object r6 = r9.m65invokegIAlus(r2, r0)
            if (r6 != r1) goto L_0x0057
            return r1
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK.m40executeErrorStateBWLJW6A(com.unity3d.services.core.configuration.ErrorState, java.lang.Throwable, com.unity3d.services.core.configuration.Configuration, xd.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object handleInitializationException(com.unity3d.services.core.domain.task.InitializationException r6, xd.d<? super sd.w> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1 r0 = (com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1 r0 = new com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002d:
            java.lang.Object r6 = r0.L$0
            com.unity3d.services.core.domain.task.InitializationException r6 = (com.unity3d.services.core.domain.task.InitializationException) r6
            sd.p.b(r7)
            sd.o r7 = (sd.o) r7
            r7.i()
            goto L_0x0054
        L_0x003a:
            sd.p.b(r7)
            com.unity3d.services.core.configuration.ErrorState r7 = r6.getErrorState()
            java.lang.Exception r2 = r6.getOriginalException()
            com.unity3d.services.core.configuration.Configuration r4 = r6.getConfig()
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r5.m40executeErrorStateBWLJW6A(r7, r2, r4, r0)
            if (r7 != r1) goto L_0x0054
            return r1
        L_0x0054:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK.handleInitializationException(com.unity3d.services.core.domain.task.InitializationException, xd.d):java.lang.Object");
    }

    public String getMetricName() {
        return getMetricNameForInitializeTask(MobileAdsBridgeBase.initializeMethodName);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: doWork-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m41doWorkgIAlus(com.unity3d.services.core.domain.task.EmptyParams r5, xd.d<? super sd.o<sd.w>> r6) {
        /*
            r4 = this;
            boolean r5 = r6 instanceof com.unity3d.services.core.domain.task.InitializeSDK$doWork$1
            if (r5 == 0) goto L_0x0013
            r5 = r6
            com.unity3d.services.core.domain.task.InitializeSDK$doWork$1 r5 = (com.unity3d.services.core.domain.task.InitializeSDK$doWork$1) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r5.label = r0
            goto L_0x0018
        L_0x0013:
            com.unity3d.services.core.domain.task.InitializeSDK$doWork$1 r5 = new com.unity3d.services.core.domain.task.InitializeSDK$doWork$1
            r5.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r5.result
            java.lang.Object r0 = yd.d.c()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 != r2) goto L_0x0029
            sd.p.b(r6)
            goto L_0x0049
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            sd.p.b(r6)
            com.unity3d.services.core.domain.ISDKDispatchers r6 = r4.dispatchers
            pe.k0 r6 = r6.getDefault()
            com.unity3d.services.core.domain.task.InitializeSDK$doWork$2 r1 = new com.unity3d.services.core.domain.task.InitializeSDK$doWork$2
            r3 = 0
            r1.<init>(r4, r3)
            r5.label = r2
            java.lang.Object r6 = pe.i.g(r6, r1, r5)
            if (r6 != r0) goto L_0x0049
            return r0
        L_0x0049:
            sd.o r6 = (sd.o) r6
            java.lang.Object r5 = r6.i()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK.m41doWorkgIAlus(com.unity3d.services.core.domain.task.EmptyParams, xd.d):java.lang.Object");
    }
}
