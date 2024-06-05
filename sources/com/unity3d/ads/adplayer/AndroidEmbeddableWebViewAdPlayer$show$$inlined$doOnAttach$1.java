package com.unity3d.ads.adplayer;

import android.view.View;
import androidx.core.view.a0;
import kotlin.jvm.internal.m;
import pe.c2;
import pe.r0;
import xd.d;
import xd.g;

/* compiled from: View.kt */
public final class AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ ShowOptions $showOptions$inlined;
    final /* synthetic */ View $this_doOnAttach;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    public AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$1(View view, AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, ShowOptions showOptions) {
        this.$this_doOnAttach = view;
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$showOptions$inlined = showOptions;
    }

    public void onViewAttachedToWindow(View view) {
        m.e(view, "view");
        this.$this_doOnAttach.removeOnAttachStateChangeListener(this);
        c2 unused = k.d(this.this$0.webViewAdPlayer.getScope(), (g) null, (r0) null, new AndroidEmbeddableWebViewAdPlayer$show$2$1(this.this$0, this.$showOptions$inlined, (d<? super AndroidEmbeddableWebViewAdPlayer$show$2$1>) null), 3, (Object) null);
        if (!a0.Q(view)) {
            c2 unused2 = k.d(this.this$0.webViewAdPlayer.getScope(), (g) null, (r0) null, new AndroidEmbeddableWebViewAdPlayer$show$2$2$1(this.this$0, (d<? super AndroidEmbeddableWebViewAdPlayer$show$2$2$1>) null), 3, (Object) null);
        } else {
            view.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$1$$inlined$doOnDetach$1(view, this.this$0));
        }
    }

    public void onViewDetachedFromWindow(View view) {
        m.e(view, "view");
    }
}
