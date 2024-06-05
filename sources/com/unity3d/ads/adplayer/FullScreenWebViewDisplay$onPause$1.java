package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.DisplayMessage;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import se.u;
import xd.d;

@f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onPause$1", f = "FullScreenWebViewDisplay.kt", l = {76}, m = "invokeSuspend")
/* compiled from: FullScreenWebViewDisplay.kt */
final class FullScreenWebViewDisplay$onPause$1 extends l implements p<p0, d<? super w>, Object> {
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FullScreenWebViewDisplay$onPause$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, d<? super FullScreenWebViewDisplay$onPause$1> dVar) {
        super(2, dVar);
        this.this$0 = fullScreenWebViewDisplay;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new FullScreenWebViewDisplay$onPause$1(this.this$0, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((FullScreenWebViewDisplay$onPause$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            u<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
            DisplayMessage.VisibilityChanged visibilityChanged = new DisplayMessage.VisibilityChanged(this.this$0.opportunityId, false);
            this.label = 1;
            if (displayMessages.emit(visibilityChanged, this) == c10) {
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
