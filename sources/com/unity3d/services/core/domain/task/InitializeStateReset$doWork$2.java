package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.o;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2", f = "InitializeStateReset.kt", l = {41}, m = "invokeSuspend")
/* compiled from: InitializeStateReset.kt */
final class InitializeStateReset$doWork$2 extends l implements p<p0, d<? super o<? extends Configuration>>, Object> {
    final /* synthetic */ InitializeStateReset.Params $params;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateReset$doWork$2(InitializeStateReset.Params params, InitializeStateReset initializeStateReset, d<? super InitializeStateReset$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
        this.this$0 = initializeStateReset;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new InitializeStateReset$doWork$2(this.$params, this.this$0, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super o<? extends Configuration>> dVar) {
        return ((InitializeStateReset$doWork$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0077 A[Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad A[Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = yd.d.c()
            int r1 = r8.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 != r3) goto L_0x0018
            java.lang.Object r0 = r8.L$1
            com.unity3d.services.core.domain.task.InitializeStateReset r0 = (com.unity3d.services.core.domain.task.InitializeStateReset) r0
            java.lang.Object r1 = r8.L$0
            com.unity3d.services.core.domain.task.InitializeStateReset$Params r1 = (com.unity3d.services.core.domain.task.InitializeStateReset.Params) r1
            sd.p.b(r9)     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            goto L_0x005d
        L_0x0018:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0020:
            sd.p.b(r9)
            com.unity3d.services.core.domain.task.InitializeStateReset$Params r1 = r8.$params
            com.unity3d.services.core.domain.task.InitializeStateReset r9 = r8.this$0
            sd.o$a r4 = sd.o.f38128b     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            java.lang.String r4 = "Unity Ads init: starting init"
            com.unity3d.services.core.log.DeviceLog.debug(r4)     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            com.unity3d.services.core.webview.WebViewApp r4 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            if (r4 == 0) goto L_0x0037
            r4.resetWebViewAppInitialization()     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
        L_0x0037:
            if (r4 == 0) goto L_0x003e
            com.unity3d.services.core.webview.WebView r5 = r4.getWebView()     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            goto L_0x003f
        L_0x003e:
            r5 = r2
        L_0x003f:
            if (r5 == 0) goto L_0x006b
            com.unity3d.services.core.configuration.Configuration r5 = r1.getConfig()     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            long r5 = r5.getWebViewAppCreateTimeout()     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1 r7 = new com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            r7.<init>(r9, r4, r2)     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            r8.L$0 = r1     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            r8.L$1 = r9     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            r8.label = r3     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            java.lang.Object r3 = pe.g3.d(r5, r7, r8)     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            if (r3 != r0) goto L_0x005b
            return r0
        L_0x005b:
            r0 = r9
            r9 = r3
        L_0x005d:
            sd.w r9 = (sd.w) r9     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            if (r9 == 0) goto L_0x0063
            r9 = r0
            goto L_0x006b
        L_0x0063:
            java.lang.Exception r9 = new java.lang.Exception     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            java.lang.String r0 = "Reset failed on opening ConditionVariable"
            r9.<init>(r0)     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            throw r9     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
        L_0x006b:
            r9.unregisterLifecycleCallbacks()     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            com.unity3d.services.core.properties.SdkProperties.setCacheDirectory(r2)     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            java.io.File r9 = com.unity3d.services.core.properties.SdkProperties.getCacheDirectory()     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            if (r9 == 0) goto L_0x00ad
            r9 = 0
            com.unity3d.services.core.properties.SdkProperties.setInitialized(r9)     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            com.unity3d.services.core.configuration.Configuration r0 = r1.getConfig()     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            java.lang.Class[] r0 = r0.getModuleConfigurationList()     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            if (r0 != 0) goto L_0x0087
            java.lang.Class[] r0 = new java.lang.Class[r9]     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
        L_0x0087:
            int r2 = r0.length     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
        L_0x0088:
            if (r9 >= r2) goto L_0x00a4
            r3 = r0[r9]     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            com.unity3d.services.core.configuration.Configuration r4 = r1.getConfig()     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            com.unity3d.services.core.configuration.IModuleConfiguration r3 = r4.getModuleConfiguration(r3)     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            if (r3 == 0) goto L_0x00a1
            com.unity3d.services.core.configuration.Configuration r4 = r1.getConfig()     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            boolean r3 = r3.resetState(r4)     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            kotlin.coroutines.jvm.internal.b.a(r3)     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
        L_0x00a1:
            int r9 = r9 + 1
            goto L_0x0088
        L_0x00a4:
            com.unity3d.services.core.configuration.Configuration r9 = r1.getConfig()     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            java.lang.Object r9 = sd.o.b(r9)     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            goto L_0x00c0
        L_0x00ad:
            java.lang.Exception r9 = new java.lang.Exception     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            java.lang.String r0 = "Cache directory is NULL"
            r9.<init>(r0)     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
            throw r9     // Catch:{ CancellationException -> 0x00e2, all -> 0x00b5 }
        L_0x00b5:
            r9 = move-exception
            sd.o$a r0 = sd.o.f38128b
            java.lang.Object r9 = sd.p.a(r9)
            java.lang.Object r9 = sd.o.b(r9)
        L_0x00c0:
            boolean r0 = sd.o.g(r9)
            if (r0 == 0) goto L_0x00cd
            sd.o$a r0 = sd.o.f38128b
            java.lang.Object r9 = sd.o.b(r9)
            goto L_0x00dd
        L_0x00cd:
            java.lang.Throwable r0 = sd.o.d(r9)
            if (r0 == 0) goto L_0x00dd
            sd.o$a r9 = sd.o.f38128b
            java.lang.Object r9 = sd.p.a(r0)
            java.lang.Object r9 = sd.o.b(r9)
        L_0x00dd:
            sd.o r9 = sd.o.a(r9)
            return r9
        L_0x00e2:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
