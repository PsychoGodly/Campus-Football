package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.model.ShowEvent;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$5", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {66}, m = "invokeSuspend")
/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
final class AndroidFullscreenWebViewAdPlayer$show$5 extends l implements p<ShowEvent, d<? super w>, Object> {
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidFullscreenWebViewAdPlayer$show$5(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, d<? super AndroidFullscreenWebViewAdPlayer$show$5> dVar) {
        super(2, dVar);
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidFullscreenWebViewAdPlayer$show$5(this.this$0, dVar);
    }

    public final Object invoke(ShowEvent showEvent, d<? super w> dVar) {
        return ((AndroidFullscreenWebViewAdPlayer$show$5) create(showEvent, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
            this.label = 1;
            if (androidFullscreenWebViewAdPlayer.destroy(this) == c10) {
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
