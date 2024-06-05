package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.DisplayMessage;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import se.u;
import xd.d;

@f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$1$1", f = "FullScreenWebViewDisplay.kt", l = {29}, m = "invokeSuspend")
/* compiled from: FullScreenWebViewDisplay.kt */
final class FullScreenWebViewDisplay$onCreate$1$1 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ FullScreenWebViewDisplay $this_run;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FullScreenWebViewDisplay$onCreate$1$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, d<? super FullScreenWebViewDisplay$onCreate$1$1> dVar) {
        super(2, dVar);
        this.$this_run = fullScreenWebViewDisplay;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new FullScreenWebViewDisplay$onCreate$1$1(this.$this_run, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((FullScreenWebViewDisplay$onCreate$1$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            u<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
            DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(this.$this_run.opportunityId, "Opportunity ID not found");
            this.label = 1;
            if (displayMessages.emit(displayError, this) == c10) {
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
