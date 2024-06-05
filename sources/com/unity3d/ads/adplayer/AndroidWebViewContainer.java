package com.unity3d.ads.adplayer;

import android.webkit.WebView;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import pe.k0;
import pe.o0;
import pe.p0;
import pe.q0;
import sd.w;
import se.g;
import xd.d;

/* compiled from: AndroidWebViewContainer.kt */
public final class AndroidWebViewContainer implements WebViewContainer {
    private final p0 scope;
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;
    private final WebView webView;
    private final AndroidWebViewClient webViewClient;

    @f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$2", f = "AndroidWebViewContainer.kt", l = {28}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$2  reason: invalid class name */
    /* compiled from: AndroidWebViewContainer.kt */
    static final class AnonymousClass2 extends l implements p<Boolean, d<? super w>, Object> {
        int label;
        final /* synthetic */ AndroidWebViewContainer this$0;

        {
            this.this$0 = r1;
        }

        public final d<w> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.this$0, dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (d<? super w>) (d) obj2);
        }

        public final Object invoke(boolean z10, d<? super w> dVar) {
            return ((AnonymousClass2) create(Boolean.valueOf(z10), dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                sd.p.b(obj);
                AndroidWebViewContainer androidWebViewContainer = this.this$0;
                this.label = 1;
                if (androidWebViewContainer.onRenderProcessGone(this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                sd.p.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return w.f38141a;
        }
    }

    public AndroidWebViewContainer(WebView webView2, AndroidWebViewClient androidWebViewClient, SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics2, k0 k0Var, k0 k0Var2, p0 p0Var) {
        m.e(webView2, "webView");
        m.e(androidWebViewClient, "webViewClient");
        m.e(sendWebViewClientErrorDiagnostics2, "sendWebViewClientErrorDiagnostics");
        m.e(k0Var, "mainDispatcher");
        m.e(k0Var2, "defaultDispatcher");
        m.e(p0Var, "adPlayerScope");
        this.webView = webView2;
        this.webViewClient = androidWebViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics2;
        p0 h10 = q0.h(q0.h(p0Var, k0Var), new o0("AndroidWebViewContainer"));
        this.scope = h10;
        g.u(g.x(new AndroidWebViewContainer$special$$inlined$filter$1(androidWebViewClient.isRenderProcessGone()), new AnonymousClass2(this, (d<? super AnonymousClass2>) null)), q0.h(h10, k0Var2));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object onRenderProcessGone(xd.d<? super sd.w> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r0
            sd.p.b(r8)
            goto L_0x0044
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0035:
            sd.p.b(r8)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r7.destroy(r0)
            if (r8 != r1) goto L_0x0043
            return r1
        L_0x0043:
            r0 = r7
        L_0x0044:
            com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics r8 = r0.sendWebViewClientErrorDiagnostics
            com.unity3d.ads.adplayer.model.WebViewClientError r6 = new com.unity3d.ads.adplayer.model.WebViewClientError
            com.unity3d.ads.adplayer.model.ErrorReason r2 = com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE
            r3 = 0
            r4 = 4
            r5 = 0
            java.lang.String r1 = "Render process gone"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.List r0 = td.p.b(r6)
            r8.invoke(r0)
            sd.w r8 = sd.w.f38141a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.onRenderProcessGone(xd.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object addJavascriptInterface(com.unity3d.ads.adplayer.WebViewBridge r6, java.lang.String r7, xd.d<? super sd.w> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sd.p.b(r8)     // Catch:{ CancellationException -> 0x0049 }
            goto L_0x0049
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            sd.p.b(r8)
            pe.p0 r8 = r5.scope     // Catch:{ CancellationException -> 0x0049 }
            xd.g r8 = r8.getCoroutineContext()     // Catch:{ CancellationException -> 0x0049 }
            com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2 r2 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2     // Catch:{ CancellationException -> 0x0049 }
            r4 = 0
            r2.<init>(r5, r7, r6, r4)     // Catch:{ CancellationException -> 0x0049 }
            r0.label = r3     // Catch:{ CancellationException -> 0x0049 }
            java.lang.Object r6 = pe.i.g(r8, r2, r0)     // Catch:{ CancellationException -> 0x0049 }
            if (r6 != r1) goto L_0x0049
            return r1
        L_0x0049:
            sd.w r6 = sd.w.f38141a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.addJavascriptInterface(com.unity3d.ads.adplayer.WebViewBridge, java.lang.String, xd.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object destroy(xd.d<? super sd.w> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r0
            sd.p.b(r6)
            goto L_0x0056
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0036:
            sd.p.b(r6)
            pe.p0 r6 = r5.scope
            xd.g r6 = r6.getCoroutineContext()
            pe.q2 r2 = pe.q2.f37387a
            xd.g r6 = r6.plus(r2)
            com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2 r2 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2
            r2.<init>(r5, r3)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = pe.i.g(r6, r2, r0)
            if (r6 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r0 = r5
        L_0x0056:
            pe.p0 r6 = r0.scope
            pe.q0.d(r6, r3, r4, r3)
            sd.w r6 = sd.w.f38141a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.destroy(xd.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object evaluateJavascript(java.lang.String r6, xd.d<? super sd.w> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sd.p.b(r7)     // Catch:{ CancellationException -> 0x0049 }
            goto L_0x0049
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            sd.p.b(r7)
            pe.p0 r7 = r5.scope     // Catch:{ CancellationException -> 0x0049 }
            xd.g r7 = r7.getCoroutineContext()     // Catch:{ CancellationException -> 0x0049 }
            com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2 r2 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2     // Catch:{ CancellationException -> 0x0049 }
            r4 = 0
            r2.<init>(r5, r6, r4)     // Catch:{ CancellationException -> 0x0049 }
            r0.label = r3     // Catch:{ CancellationException -> 0x0049 }
            java.lang.Object r6 = pe.i.g(r7, r2, r0)     // Catch:{ CancellationException -> 0x0049 }
            if (r6 != r1) goto L_0x0049
            return r1
        L_0x0049:
            sd.w r6 = sd.w.f38141a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.evaluateJavascript(java.lang.String, xd.d):java.lang.Object");
    }

    public final p0 getScope() {
        return this.scope;
    }

    public final WebView getWebView() {
        return this.webView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object loadUrl(java.lang.String r8, xd.d<? super sd.w> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004f
            if (r2 == r5) goto L_0x0047
            if (r2 == r4) goto L_0x003f
            if (r2 == r3) goto L_0x0033
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            java.lang.Object r8 = r0.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r0
            sd.p.b(r9)
            goto L_0x0093
        L_0x003f:
            java.lang.Object r8 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r8 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r8
            sd.p.b(r9)
            goto L_0x007b
        L_0x0047:
            java.lang.Object r8 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r8 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r8
            sd.p.b(r9)
            goto L_0x006a
        L_0x004f:
            sd.p.b(r9)
            pe.p0 r9 = r7.scope
            xd.g r9 = r9.getCoroutineContext()
            com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2 r2 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2
            r6 = 0
            r2.<init>(r7, r8, r6)
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = pe.i.g(r9, r2, r0)
            if (r8 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r8 = r7
        L_0x006a:
            com.unity3d.ads.adplayer.AndroidWebViewClient r9 = r8.webViewClient
            pe.x0 r9 = r9.getOnLoadFinished()
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r9 = r9.E0(r0)
            if (r9 != r1) goto L_0x007b
            return r1
        L_0x007b:
            java.util.List r9 = (java.util.List) r9
            boolean r2 = r9.isEmpty()
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x009e
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r0 = r8.destroy(r0)
            if (r0 != r1) goto L_0x0091
            return r1
        L_0x0091:
            r0 = r8
            r8 = r9
        L_0x0093:
            com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics r9 = r0.sendWebViewClientErrorDiagnostics
            r9.invoke(r8)
            com.unity3d.ads.adplayer.LoadWebViewError r9 = new com.unity3d.ads.adplayer.LoadWebViewError
            r9.<init>(r8)
            throw r9
        L_0x009e:
            sd.w r8 = sd.w.f38141a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.loadUrl(java.lang.String, xd.d):java.lang.Object");
    }
}
