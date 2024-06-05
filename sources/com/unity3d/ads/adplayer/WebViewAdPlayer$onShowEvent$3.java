package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.ShowEvent;
import fe.q;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import sd.p;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$onShowEvent$3", f = "WebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
/* compiled from: WebViewAdPlayer.kt */
final class WebViewAdPlayer$onShowEvent$3 extends l implements q<ShowEvent, Boolean, d<? super ShowEvent>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    WebViewAdPlayer$onShowEvent$3(d<? super WebViewAdPlayer$onShowEvent$3> dVar) {
        super(3, dVar);
    }

    public final Object invoke(ShowEvent showEvent, boolean z10, d<? super ShowEvent> dVar) {
        WebViewAdPlayer$onShowEvent$3 webViewAdPlayer$onShowEvent$3 = new WebViewAdPlayer$onShowEvent$3(dVar);
        webViewAdPlayer$onShowEvent$3.L$0 = showEvent;
        webViewAdPlayer$onShowEvent$3.Z$0 = z10;
        return webViewAdPlayer$onShowEvent$3.invokeSuspend(w.f38141a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((ShowEvent) obj, ((Boolean) obj2).booleanValue(), (d<? super ShowEvent>) (d) obj3);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            p.b(obj);
            return this.Z$0 ? new ShowEvent.Completed(ShowStatus.COMPLETED) : (ShowEvent) this.L$0;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
