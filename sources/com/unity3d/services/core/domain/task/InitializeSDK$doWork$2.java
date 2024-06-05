package com.unity3d.services.core.domain.task;

import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.o;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2", f = "InitializeSDK.kt", l = {44, 49, 51, 56, 58, 62, 65, 80, 83, 91, 94, 97}, m = "invokeSuspend")
/* compiled from: InitializeSDK.kt */
final class InitializeSDK$doWork$2 extends l implements p<p0, d<? super o<? extends w>>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeSDK$doWork$2(InitializeSDK initializeSDK, d<? super InitializeSDK$doWork$2> dVar) {
        super(2, dVar);
        this.this$0 = initializeSDK;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        InitializeSDK$doWork$2 initializeSDK$doWork$2 = new InitializeSDK$doWork$2(this.this$0, dVar);
        initializeSDK$doWork$2.L$0 = obj;
        return initializeSDK$doWork$2;
    }

    public final Object invoke(p0 p0Var, d<? super o<w>> dVar) {
        return ((InitializeSDK$doWork$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x026b, code lost:
        if (sd.o.f(r1) == false) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x026d, code lost:
        r12 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(r1);
        r11.L$0 = r4;
        r11.L$1 = r3;
        r11.L$2 = r1;
        r11.label = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x027f, code lost:
        if (r4.handleInitializationException(r12, r11) != r0) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0281, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0282, code lost:
        sd.p.b(r1);
        r12 = ((com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult) r1).getWebViewDataString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x028c, code lost:
        r12 = r12.getWebViewData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0290, code lost:
        if (r12 == null) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0292, code lost:
        r1 = r4.initializeStateCreate;
        sd.p.b(r3);
        r5 = new com.unity3d.services.core.domain.task.InitializeStateCreate.Params((com.unity3d.services.core.configuration.Configuration) r3, r12);
        r11.L$0 = r4;
        r11.L$1 = r3;
        r11.L$2 = null;
        r11.L$3 = null;
        r11.label = 10;
        r12 = r1.m65invokegIAlus(r5, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02b1, code lost:
        if (r12 != r0) goto L_0x02b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02b3, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02b4, code lost:
        r1 = r3;
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02ba, code lost:
        if (sd.o.f(r12) == false) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02bc, code lost:
        r12 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(r12);
        r11.L$0 = r3;
        r11.L$1 = r1;
        r11.label = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02cc, code lost:
        if (r3.handleInitializationException(r12, r11) != r0) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02ce, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02cf, code lost:
        r12 = r3.initializeStateComplete;
        sd.p.b(r1);
        r3 = new com.unity3d.services.core.domain.task.InitializeStateComplete.Params((com.unity3d.services.core.configuration.Configuration) r1);
        r11.L$0 = null;
        r11.L$1 = null;
        r11.label = 12;
        r12 = r12.m65invokegIAlus(r3, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02e9, code lost:
        if (r12 != r0) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02eb, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02ec, code lost:
        sd.p.b(r12);
        r12 = sd.o.b(sd.w.f38141a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0301, code lost:
        throw new java.lang.IllegalStateException("WebView is missing.".toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r1 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a7, code lost:
        r5 = r4;
        r4 = r3;
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e1, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0117, code lost:
        r1 = sd.o.d(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011b, code lost:
        if (r1 == null) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011d, code lost:
        com.unity3d.services.core.log.DeviceLog.debug("Unity Ads Init: Could not load config file from local storage: " + r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0135, code lost:
        r1 = new com.unity3d.services.core.configuration.Configuration();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x013e, code lost:
        if (sd.o.f(r12) == false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0140, code lost:
        r12 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0141, code lost:
        r1 = (com.unity3d.services.core.configuration.Configuration) r12;
        r12 = r3.initializeStateReset;
        r5 = new com.unity3d.services.core.domain.task.InitializeStateReset.Params(r1);
        r11.L$0 = r4;
        r11.L$1 = r3;
        r11.L$2 = r1;
        r11.label = 2;
        r12 = r12.m65invokegIAlus(r5, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015a, code lost:
        if (r12 != r0) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x015c, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0161, code lost:
        if (sd.o.f(r12) == false) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0163, code lost:
        r4 = com.unity3d.services.core.configuration.ErrorState.ResetWebApp;
        r5 = sd.o.d(r12);
        r11.L$0 = r12;
        r11.L$1 = null;
        r11.L$2 = null;
        r11.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0176, code lost:
        if (r3.m40executeErrorStateBWLJW6A(r4, r5, r1, r11) != r0) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0178, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0179, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x017a, code lost:
        r12 = sd.o.d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x017e, code lost:
        if (r12 != null) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0180, code lost:
        r12 = new java.lang.Exception(com.unity3d.services.core.configuration.ErrorState.ResetWebApp.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018b, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018c, code lost:
        r12 = r3.initializeStateConfig;
        r5 = new com.unity3d.services.core.domain.task.InitializeStateConfig.Params(r1);
        r11.L$0 = r4;
        r11.L$1 = r3;
        r11.L$2 = r1;
        r11.label = 4;
        r12 = r12.m65invokegIAlus(r5, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a2, code lost:
        if (r12 != r0) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a4, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a9, code lost:
        if (sd.o.f(r3) == false) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ab, code lost:
        r12 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(r3);
        r11.L$0 = r5;
        r11.L$1 = r4;
        r11.L$2 = r3;
        r11.L$3 = r1;
        r11.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01be, code lost:
        if (r4.handleInitializationException(r12, r11) != r0) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c0, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c1, code lost:
        r12 = r4.initializeStateLoadCache;
        sd.p.b(r3);
        r6 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params((com.unity3d.services.core.configuration.Configuration) r3);
        r11.L$0 = r5;
        r11.L$1 = r4;
        r11.L$2 = r3;
        r11.L$3 = r1;
        r11.label = 6;
        r12 = r12.m65invokegIAlus(r6, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01df, code lost:
        if (r12 != r0) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e1, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e6, code lost:
        if (sd.o.f(r12) == false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e8, code lost:
        r3 = com.unity3d.services.core.configuration.ErrorState.LoadCache;
        r5 = sd.o.d(r12);
        r11.L$0 = r12;
        r11.L$1 = null;
        r11.L$2 = null;
        r11.L$3 = null;
        r11.label = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01fd, code lost:
        if (r4.m40executeErrorStateBWLJW6A(r3, r5, r1, r11) != r0) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ff, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0200, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0201, code lost:
        r12 = sd.o.d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0205, code lost:
        if (r12 != null) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0207, code lost:
        r12 = new java.lang.Exception(com.unity3d.services.core.configuration.ErrorState.LoadCache.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0212, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0213, code lost:
        sd.p.b(r12);
        r12 = (com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x021c, code lost:
        if (r12.getHasHashMismatch() == false) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0226, code lost:
        if (r1.getExperiments().isWebViewAsyncDownloadEnabled() == false) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x022c, code lost:
        if (r12.getWebViewData() == null) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x022e, code lost:
        pe.c2 unused = pe.k.d(r5, new pe.o0("LaunchLoadWeb"), (pe.r0) null, new com.unity3d.services.core.domain.task.InitializeSDK$doWork$2$1$webViewData$1(r4, r3, (xd.d<? super com.unity3d.services.core.domain.task.InitializeSDK$doWork$2$1$webViewData$1>) null), 2, (java.lang.Object) null);
        r12 = r12.getWebViewData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0245, code lost:
        r12 = r4.initializeStateLoadWeb;
        sd.p.b(r3);
        r1 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params((com.unity3d.services.core.configuration.Configuration) r3);
        r11.L$0 = r4;
        r11.L$1 = r3;
        r11.L$2 = null;
        r11.L$3 = null;
        r11.label = 8;
        r12 = r12.m65invokegIAlus(r1, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0264, code lost:
        if (r12 != r0) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0266, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = yd.d.c()
            int r1 = r11.label
            r2 = 0
            switch(r1) {
                case 0: goto L_0x00e3;
                case 1: goto L_0x00cf;
                case 2: goto L_0x00b8;
                case 3: goto L_0x00ac;
                case 4: goto L_0x0092;
                case 5: goto L_0x007f;
                case 6: goto L_0x0066;
                case 7: goto L_0x005a;
                case 8: goto L_0x0046;
                case 9: goto L_0x0039;
                case 10: goto L_0x0028;
                case 11: goto L_0x001d;
                case 12: goto L_0x0012;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0012:
            sd.p.b(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            sd.o r12 = (sd.o) r12     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.Object r12 = r12.i()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            goto L_0x02ec
        L_0x001d:
            java.lang.Object r1 = r11.L$1
            java.lang.Object r3 = r11.L$0
            com.unity3d.services.core.domain.task.InitializeSDK r3 = (com.unity3d.services.core.domain.task.InitializeSDK) r3
            sd.p.b(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            goto L_0x02cf
        L_0x0028:
            java.lang.Object r1 = r11.L$1
            java.lang.Object r3 = r11.L$0
            com.unity3d.services.core.domain.task.InitializeSDK r3 = (com.unity3d.services.core.domain.task.InitializeSDK) r3
            sd.p.b(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            sd.o r12 = (sd.o) r12     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.Object r12 = r12.i()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            goto L_0x02b6
        L_0x0039:
            java.lang.Object r1 = r11.L$2
            java.lang.Object r3 = r11.L$1
            java.lang.Object r4 = r11.L$0
            com.unity3d.services.core.domain.task.InitializeSDK r4 = (com.unity3d.services.core.domain.task.InitializeSDK) r4
            sd.p.b(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            goto L_0x0282
        L_0x0046:
            java.lang.Object r1 = r11.L$1
            java.lang.Object r3 = r11.L$0
            com.unity3d.services.core.domain.task.InitializeSDK r3 = (com.unity3d.services.core.domain.task.InitializeSDK) r3
            sd.p.b(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            sd.o r12 = (sd.o) r12     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.Object r12 = r12.i()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r4 = r3
            r3 = r1
        L_0x0057:
            r1 = r12
            goto L_0x0267
        L_0x005a:
            java.lang.Object r0 = r11.L$0
            sd.p.b(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            sd.o r12 = (sd.o) r12     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r12.i()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            goto L_0x0201
        L_0x0066:
            java.lang.Object r1 = r11.L$3
            com.unity3d.services.core.configuration.Configuration r1 = (com.unity3d.services.core.configuration.Configuration) r1
            java.lang.Object r3 = r11.L$2
            java.lang.Object r4 = r11.L$1
            com.unity3d.services.core.domain.task.InitializeSDK r4 = (com.unity3d.services.core.domain.task.InitializeSDK) r4
            java.lang.Object r5 = r11.L$0
            pe.p0 r5 = (pe.p0) r5
            sd.p.b(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            sd.o r12 = (sd.o) r12     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.Object r12 = r12.i()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            goto L_0x01e2
        L_0x007f:
            java.lang.Object r1 = r11.L$3
            com.unity3d.services.core.configuration.Configuration r1 = (com.unity3d.services.core.configuration.Configuration) r1
            java.lang.Object r3 = r11.L$2
            java.lang.Object r4 = r11.L$1
            com.unity3d.services.core.domain.task.InitializeSDK r4 = (com.unity3d.services.core.domain.task.InitializeSDK) r4
            java.lang.Object r5 = r11.L$0
            pe.p0 r5 = (pe.p0) r5
            sd.p.b(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            goto L_0x01c1
        L_0x0092:
            java.lang.Object r1 = r11.L$2
            com.unity3d.services.core.configuration.Configuration r1 = (com.unity3d.services.core.configuration.Configuration) r1
            java.lang.Object r3 = r11.L$1
            com.unity3d.services.core.domain.task.InitializeSDK r3 = (com.unity3d.services.core.domain.task.InitializeSDK) r3
            java.lang.Object r4 = r11.L$0
            pe.p0 r4 = (pe.p0) r4
            sd.p.b(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            sd.o r12 = (sd.o) r12     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.Object r12 = r12.i()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
        L_0x00a7:
            r5 = r4
            r4 = r3
            r3 = r12
            goto L_0x01a5
        L_0x00ac:
            java.lang.Object r0 = r11.L$0
            sd.p.b(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            sd.o r12 = (sd.o) r12     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r12.i()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            goto L_0x017a
        L_0x00b8:
            java.lang.Object r1 = r11.L$2
            com.unity3d.services.core.configuration.Configuration r1 = (com.unity3d.services.core.configuration.Configuration) r1
            java.lang.Object r3 = r11.L$1
            com.unity3d.services.core.domain.task.InitializeSDK r3 = (com.unity3d.services.core.domain.task.InitializeSDK) r3
            java.lang.Object r4 = r11.L$0
            pe.p0 r4 = (pe.p0) r4
            sd.p.b(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            sd.o r12 = (sd.o) r12     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.Object r12 = r12.i()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            goto L_0x015d
        L_0x00cf:
            java.lang.Object r1 = r11.L$1
            com.unity3d.services.core.domain.task.InitializeSDK r1 = (com.unity3d.services.core.domain.task.InitializeSDK) r1
            java.lang.Object r3 = r11.L$0
            pe.p0 r3 = (pe.p0) r3
            sd.p.b(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            sd.o r12 = (sd.o) r12     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.Object r12 = r12.i()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r4 = r3
        L_0x00e1:
            r3 = r1
            goto L_0x0117
        L_0x00e3:
            sd.p.b(r12)
            java.lang.Object r12 = r11.L$0
            pe.p0 r12 = (pe.p0) r12
            com.unity3d.services.core.domain.task.InitializeSDK r1 = r11.this$0
            sd.o$a r3 = sd.o.f38128b     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            com.unity3d.services.core.configuration.IInitializeEventsMetricSender r3 = com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r3.didInitStart()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            com.unity3d.services.core.lifecycle.CachedLifecycle.register()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.String r3 = "Unity Ads Init: Loading Config File From Local Storage"
            com.unity3d.services.core.log.DeviceLog.debug(r3)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage r3 = r1.configFileFromLocalStorage     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$Params r4 = new com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$Params     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r5 = 1
            r4.<init>(r2, r5, r2)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$0 = r12     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$1 = r1     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.label = r5     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.Object r3 = r3.m65invokegIAlus(r4, r11)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r3 != r0) goto L_0x0114
            return r0
        L_0x0114:
            r4 = r12
            r12 = r3
            goto L_0x00e1
        L_0x0117:
            java.lang.Throwable r1 = sd.o.d(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r1 == 0) goto L_0x0135
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r5.<init>()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.String r6 = "Unity Ads Init: Could not load config file from local storage: "
            r5.append(r6)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r5.append(r1)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.String r1 = r5.toString()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            com.unity3d.services.core.log.DeviceLog.debug(r1)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
        L_0x0135:
            com.unity3d.services.core.configuration.Configuration r1 = new com.unity3d.services.core.configuration.Configuration     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r1.<init>()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            boolean r5 = sd.o.f(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r5 == 0) goto L_0x0141
            r12 = r1
        L_0x0141:
            r1 = r12
            com.unity3d.services.core.configuration.Configuration r1 = (com.unity3d.services.core.configuration.Configuration) r1     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            com.unity3d.services.core.domain.task.InitializeStateReset r12 = r3.initializeStateReset     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            com.unity3d.services.core.domain.task.InitializeStateReset$Params r5 = new com.unity3d.services.core.domain.task.InitializeStateReset$Params     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r5.<init>(r1)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$0 = r4     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$1 = r3     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$2 = r1     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r6 = 2
            r11.label = r6     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.Object r12 = r12.m65invokegIAlus(r5, r11)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r12 != r0) goto L_0x015d
            return r0
        L_0x015d:
            boolean r5 = sd.o.f(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r5 == 0) goto L_0x018c
            com.unity3d.services.core.configuration.ErrorState r4 = com.unity3d.services.core.configuration.ErrorState.ResetWebApp     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.Throwable r5 = sd.o.d(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$0 = r12     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$1 = r2     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$2 = r2     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r2 = 3
            r11.label = r2     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.Object r1 = r3.m40executeErrorStateBWLJW6A(r4, r5, r1, r11)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r1 != r0) goto L_0x0179
            return r0
        L_0x0179:
            r0 = r12
        L_0x017a:
            java.lang.Throwable r12 = sd.o.d(r0)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r12 != 0) goto L_0x018b
            java.lang.Exception r12 = new java.lang.Exception     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            com.unity3d.services.core.configuration.ErrorState r0 = com.unity3d.services.core.configuration.ErrorState.ResetWebApp     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.String r0 = r0.toString()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r12.<init>(r0)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
        L_0x018b:
            throw r12     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
        L_0x018c:
            com.unity3d.services.core.domain.task.InitializeStateConfig r12 = r3.initializeStateConfig     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            com.unity3d.services.core.domain.task.InitializeStateConfig$Params r5 = new com.unity3d.services.core.domain.task.InitializeStateConfig$Params     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r5.<init>(r1)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$0 = r4     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$1 = r3     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$2 = r1     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r6 = 4
            r11.label = r6     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.Object r12 = r12.m65invokegIAlus(r5, r11)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r12 != r0) goto L_0x00a7
            return r0
        L_0x01a5:
            boolean r12 = sd.o.f(r3)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r12 == 0) goto L_0x01c1
            com.unity3d.services.core.domain.task.InitializationException r12 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(r3)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$0 = r5     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$1 = r4     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$2 = r3     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$3 = r1     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r6 = 5
            r11.label = r6     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.Object r12 = r4.handleInitializationException(r12, r11)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r12 != r0) goto L_0x01c1
            return r0
        L_0x01c1:
            com.unity3d.services.core.domain.task.InitializeStateLoadCache r12 = r4.initializeStateLoadCache     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            com.unity3d.services.core.domain.task.InitializeStateLoadCache$Params r6 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache$Params     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            sd.p.b(r3)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r7 = r3
            com.unity3d.services.core.configuration.Configuration r7 = (com.unity3d.services.core.configuration.Configuration) r7     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r6.<init>(r7)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$0 = r5     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$1 = r4     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$2 = r3     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$3 = r1     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r7 = 6
            r11.label = r7     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.Object r12 = r12.m65invokegIAlus(r6, r11)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r12 != r0) goto L_0x01e2
            return r0
        L_0x01e2:
            boolean r6 = sd.o.f(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r6 == 0) goto L_0x0213
            com.unity3d.services.core.configuration.ErrorState r3 = com.unity3d.services.core.configuration.ErrorState.LoadCache     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.Throwable r5 = sd.o.d(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$0 = r12     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$1 = r2     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$2 = r2     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$3 = r2     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r2 = 7
            r11.label = r2     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.Object r1 = r4.m40executeErrorStateBWLJW6A(r3, r5, r1, r11)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r1 != r0) goto L_0x0200
            return r0
        L_0x0200:
            r0 = r12
        L_0x0201:
            java.lang.Throwable r12 = sd.o.d(r0)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r12 != 0) goto L_0x0212
            java.lang.Exception r12 = new java.lang.Exception     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            com.unity3d.services.core.configuration.ErrorState r0 = com.unity3d.services.core.configuration.ErrorState.LoadCache     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.String r0 = r0.toString()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r12.<init>(r0)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
        L_0x0212:
            throw r12     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
        L_0x0213:
            sd.p.b(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            com.unity3d.services.core.domain.task.InitializeStateLoadCache$LoadCacheResult r12 = (com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult) r12     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            boolean r6 = r12.getHasHashMismatch()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r6 == 0) goto L_0x028c
            com.unity3d.services.core.configuration.IExperiments r1 = r1.getExperiments()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            boolean r1 = r1.isWebViewAsyncDownloadEnabled()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r1 == 0) goto L_0x0245
            java.lang.String r1 = r12.getWebViewData()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r1 == 0) goto L_0x0245
            pe.o0 r6 = new pe.o0     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.String r1 = "LaunchLoadWeb"
            r6.<init>(r1)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r7 = 0
            com.unity3d.services.core.domain.task.InitializeSDK$doWork$2$1$webViewData$1 r8 = new com.unity3d.services.core.domain.task.InitializeSDK$doWork$2$1$webViewData$1     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r8.<init>(r4, r3, r2)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r9 = 2
            r10 = 0
            pe.c2 unused = pe.k.d(r5, r6, r7, r8, r9, r10)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.String r12 = r12.getWebViewData()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            goto L_0x0292
        L_0x0245:
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb r12 = r4.initializeStateLoadWeb     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params r1 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            sd.p.b(r3)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r5 = r3
            com.unity3d.services.core.configuration.Configuration r5 = (com.unity3d.services.core.configuration.Configuration) r5     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r1.<init>(r5)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$0 = r4     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$1 = r3     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$2 = r2     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$3 = r2     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r5 = 8
            r11.label = r5     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.Object r12 = r12.m65invokegIAlus(r1, r11)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r12 != r0) goto L_0x0057
            return r0
        L_0x0267:
            boolean r12 = sd.o.f(r1)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r12 == 0) goto L_0x0282
            com.unity3d.services.core.domain.task.InitializationException r12 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(r1)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$0 = r4     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$1 = r3     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$2 = r1     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r5 = 9
            r11.label = r5     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.Object r12 = r4.handleInitializationException(r12, r11)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r12 != r0) goto L_0x0282
            return r0
        L_0x0282:
            sd.p.b(r1)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$LoadWebResult r1 = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult) r1     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.String r12 = r1.getWebViewDataString()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            goto L_0x0292
        L_0x028c:
            java.lang.String r12 = r12.getWebViewData()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r12 == 0) goto L_0x02f6
        L_0x0292:
            com.unity3d.services.core.domain.task.InitializeStateCreate r1 = r4.initializeStateCreate     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            com.unity3d.services.core.domain.task.InitializeStateCreate$Params r5 = new com.unity3d.services.core.domain.task.InitializeStateCreate$Params     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            sd.p.b(r3)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r6 = r3
            com.unity3d.services.core.configuration.Configuration r6 = (com.unity3d.services.core.configuration.Configuration) r6     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r5.<init>(r6, r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$0 = r4     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$1 = r3     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$2 = r2     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$3 = r2     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r12 = 10
            r11.label = r12     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.Object r12 = r1.m65invokegIAlus(r5, r11)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r12 != r0) goto L_0x02b4
            return r0
        L_0x02b4:
            r1 = r3
            r3 = r4
        L_0x02b6:
            boolean r4 = sd.o.f(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r4 == 0) goto L_0x02cf
            com.unity3d.services.core.domain.task.InitializationException r12 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$0 = r3     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$1 = r1     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r4 = 11
            r11.label = r4     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.Object r12 = r3.handleInitializationException(r12, r11)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r12 != r0) goto L_0x02cf
            return r0
        L_0x02cf:
            com.unity3d.services.core.domain.task.InitializeStateComplete r12 = r3.initializeStateComplete     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            com.unity3d.services.core.domain.task.InitializeStateComplete$Params r3 = new com.unity3d.services.core.domain.task.InitializeStateComplete$Params     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            sd.p.b(r1)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            com.unity3d.services.core.configuration.Configuration r1 = (com.unity3d.services.core.configuration.Configuration) r1     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r3.<init>(r1)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$0 = r2     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r11.L$1 = r2     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r1 = 12
            r11.label = r1     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.Object r12 = r12.m65invokegIAlus(r3, r11)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            if (r12 != r0) goto L_0x02ec
            return r0
        L_0x02ec:
            sd.p.b(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            sd.w r12 = sd.w.f38141a     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.Object r12 = sd.o.b(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            goto L_0x030d
        L_0x02f6:
            java.lang.String r12 = "WebView is missing."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            java.lang.String r12 = r12.toString()     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            r0.<init>(r12)     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
            throw r0     // Catch:{ CancellationException -> 0x032f, all -> 0x0302 }
        L_0x0302:
            r12 = move-exception
            sd.o$a r0 = sd.o.f38128b
            java.lang.Object r12 = sd.p.a(r12)
            java.lang.Object r12 = sd.o.b(r12)
        L_0x030d:
            boolean r0 = sd.o.g(r12)
            if (r0 == 0) goto L_0x031a
            sd.o$a r0 = sd.o.f38128b
            java.lang.Object r12 = sd.o.b(r12)
            goto L_0x032a
        L_0x031a:
            java.lang.Throwable r0 = sd.o.d(r12)
            if (r0 == 0) goto L_0x032a
            sd.o$a r12 = sd.o.f38128b
            java.lang.Object r12 = sd.p.a(r0)
            java.lang.Object r12 = sd.o.b(r12)
        L_0x032a:
            sd.o r12 = sd.o.a(r12)
            return r12
        L_0x032f:
            r12 = move-exception
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
