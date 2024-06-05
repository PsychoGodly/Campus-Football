package com.unity3d.ads.core.domain;

import android.content.Context;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import kotlin.jvm.internal.m;
import pe.k0;

/* compiled from: AndroidGetWebViewContainerUseCase.kt */
public final class AndroidGetWebViewContainerUseCase implements GetWebViewContainerUseCase {
    /* access modifiers changed from: private */
    public final AndroidWebViewClient androidWebViewClient;
    /* access modifiers changed from: private */
    public final Context context;
    private final k0 defaultDispatcher;
    private final k0 mainDispatcher;
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;

    public AndroidGetWebViewContainerUseCase(Context context2, AndroidWebViewClient androidWebViewClient2, SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics2, k0 k0Var, k0 k0Var2) {
        m.e(context2, "context");
        m.e(androidWebViewClient2, "androidWebViewClient");
        m.e(sendWebViewClientErrorDiagnostics2, "sendWebViewClientErrorDiagnostics");
        m.e(k0Var, "mainDispatcher");
        m.e(k0Var2, "defaultDispatcher");
        this.context = context2;
        this.androidWebViewClient = androidWebViewClient2;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics2;
        this.mainDispatcher = k0Var;
        this.defaultDispatcher = k0Var2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(pe.p0 r10, xd.d<? super com.unity3d.ads.adplayer.AndroidWebViewContainer> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r10 = r0.L$1
            pe.p0 r10 = (pe.p0) r10
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase r0 = (com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase) r0
            sd.p.b(r11)
            goto L_0x0052
        L_0x0031:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0039:
            sd.p.b(r11)
            pe.k0 r11 = r9.mainDispatcher
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$webview$1 r2 = new com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$webview$1
            r4 = 0
            r2.<init>(r9, r4)
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r3
            java.lang.Object r11 = pe.i.g(r11, r2, r0)
            if (r11 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r0 = r9
        L_0x0052:
            r8 = r10
            r3 = r11
            android.webkit.WebView r3 = (android.webkit.WebView) r3
            com.unity3d.ads.adplayer.AndroidWebViewContainer r10 = new com.unity3d.ads.adplayer.AndroidWebViewContainer
            com.unity3d.ads.adplayer.AndroidWebViewClient r4 = r0.androidWebViewClient
            com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics r5 = r0.sendWebViewClientErrorDiagnostics
            pe.k0 r6 = r0.mainDispatcher
            pe.k0 r7 = r0.defaultDispatcher
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.invoke(pe.p0, xd.d):java.lang.Object");
    }
}
