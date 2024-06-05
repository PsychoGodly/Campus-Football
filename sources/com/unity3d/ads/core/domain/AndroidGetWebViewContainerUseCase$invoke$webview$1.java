package com.unity3d.ads.core.domain;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$webview$1", f = "AndroidGetWebViewContainerUseCase.kt", l = {}, m = "invokeSuspend")
/* compiled from: AndroidGetWebViewContainerUseCase.kt */
final class AndroidGetWebViewContainerUseCase$invoke$webview$1 extends l implements p<p0, d<? super WebView>, Object> {
    int label;
    final /* synthetic */ AndroidGetWebViewContainerUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidGetWebViewContainerUseCase$invoke$webview$1(AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase, d<? super AndroidGetWebViewContainerUseCase$invoke$webview$1> dVar) {
        super(2, dVar);
        this.this$0 = androidGetWebViewContainerUseCase;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidGetWebViewContainerUseCase$invoke$webview$1(this.this$0, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super WebView> dVar) {
        return ((AndroidGetWebViewContainerUseCase$invoke$webview$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            WebView webView = new WebView(this.this$0.context);
            AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase = this.this$0;
            WebSettings settings = webView.getSettings();
            settings.setAllowFileAccess(false);
            settings.setBlockNetworkImage(false);
            settings.setBlockNetworkLoads(false);
            settings.setBuiltInZoomControls(false);
            settings.setCacheMode(-1);
            settings.setDatabaseEnabled(false);
            settings.setDisplayZoomControls(false);
            settings.setDomStorageEnabled(false);
            settings.setGeolocationEnabled(false);
            settings.setJavaScriptCanOpenWindowsAutomatically(false);
            settings.setJavaScriptEnabled(true);
            settings.setLoadWithOverviewMode(false);
            settings.setLoadsImagesAutomatically(true);
            settings.setMediaPlaybackRequiresUserGesture(false);
            if (Build.VERSION.SDK_INT >= 21) {
                settings.setMixedContentMode(1);
            }
            settings.setNeedInitialFocus(true);
            settings.setSupportMultipleWindows(false);
            settings.setSupportZoom(false);
            settings.setUseWideViewPort(true);
            settings.setMediaPlaybackRequiresUserGesture(false);
            webView.setWebViewClient(androidGetWebViewContainerUseCase.androidWebViewClient);
            webView.setHorizontalScrollBarEnabled(false);
            webView.setVerticalScrollBarEnabled(false);
            webView.setInitialScale(0);
            webView.setBackgroundColor(0);
            webView.setBackgroundResource(0);
            return webView;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
