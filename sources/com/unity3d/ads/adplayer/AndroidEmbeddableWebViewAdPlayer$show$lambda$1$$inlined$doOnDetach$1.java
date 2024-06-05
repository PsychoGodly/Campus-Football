package com.unity3d.ads.adplayer;

import android.view.View;
import kotlin.jvm.internal.m;
import pe.c2;
import pe.r0;
import xd.d;
import xd.g;

/* compiled from: View.kt */
public final class AndroidEmbeddableWebViewAdPlayer$show$lambda$1$$inlined$doOnDetach$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ View $this_doOnDetach;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    public AndroidEmbeddableWebViewAdPlayer$show$lambda$1$$inlined$doOnDetach$1(View view, AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer) {
        this.$this_doOnDetach = view;
        this.this$0 = androidEmbeddableWebViewAdPlayer;
    }

    public void onViewAttachedToWindow(View view) {
        m.e(view, "view");
    }

    public void onViewDetachedFromWindow(View view) {
        m.e(view, "view");
        this.$this_doOnDetach.removeOnAttachStateChangeListener(this);
        c2 unused = k.d(this.this$0.webViewAdPlayer.getScope(), (g) null, (r0) null, new AndroidEmbeddableWebViewAdPlayer$show$2$2$1(this.this$0, (d<? super AndroidEmbeddableWebViewAdPlayer$show$2$2$1>) null), 3, (Object) null);
    }
}
