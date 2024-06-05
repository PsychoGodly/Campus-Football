package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.i;
import pe.k0;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1", f = "InitializeStateReset.kt", l = {42}, m = "invokeSuspend")
/* compiled from: InitializeStateReset.kt */
final class InitializeStateReset$doWork$2$1$success$1 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ WebViewApp $currentApp;
    int label;
    final /* synthetic */ InitializeStateReset this$0;

    @f(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1$1", f = "InitializeStateReset.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1$1  reason: invalid class name */
    /* compiled from: InitializeStateReset.kt */
    static final class AnonymousClass1 extends l implements p<p0, d<? super w>, Object> {
        int label;

        public final d<w> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(webViewApp, dVar);
        }

        public final Object invoke(p0 p0Var, d<? super w> dVar) {
            return ((AnonymousClass1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                sd.p.b(obj);
                WebView webView = webViewApp.getWebView();
                if (webView != null) {
                    webView.destroy();
                }
                webViewApp.setWebView((WebView) null);
                return w.f38141a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateReset$doWork$2$1$success$1(InitializeStateReset initializeStateReset, WebViewApp webViewApp, d<? super InitializeStateReset$doWork$2$1$success$1> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateReset;
        this.$currentApp = webViewApp;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new InitializeStateReset$doWork$2$1$success$1(this.this$0, this.$currentApp, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((InitializeStateReset$doWork$2$1$success$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            k0 main = this.this$0.dispatchers.getMain();
            final WebViewApp webViewApp = this.$currentApp;
            AnonymousClass1 r12 = new AnonymousClass1((d<? super AnonymousClass1>) null);
            this.label = 1;
            if (i.g(main, r12, this) == c10) {
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
