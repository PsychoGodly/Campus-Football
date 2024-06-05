package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnStorageEvent;
import com.unity3d.services.core.device.StorageEventInfo;
import fe.l;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import pe.c2;
import pe.p0;
import pe.r0;
import sd.w;
import xd.d;
import xd.g;

/* compiled from: WebViewAdPlayer.kt */
final class WebViewAdPlayer$storageEventCallback$1 extends n implements l<StorageEventInfo, w> {
    final /* synthetic */ WebViewAdPlayer this$0;

    @f(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1$1", f = "WebViewAdPlayer.kt", l = {72}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1$1  reason: invalid class name */
    /* compiled from: WebViewAdPlayer.kt */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<p0, d<? super w>, Object> {
        int label;

        public final d<w> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(webViewAdPlayer, storageEventInfo, dVar);
        }

        public final Object invoke(p0 p0Var, d<? super w> dVar) {
            return ((AnonymousClass1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                sd.p.b(obj);
                WebViewBridge access$getBridge$p = webViewAdPlayer.bridge;
                OnStorageEvent onStorageEvent = new OnStorageEvent(storageEventInfo.getEventType(), storageEventInfo.getStorageType(), storageEventInfo.getValue());
                this.label = 1;
                if (access$getBridge$p.sendEvent(onStorageEvent, this) == c10) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WebViewAdPlayer$storageEventCallback$1(WebViewAdPlayer webViewAdPlayer) {
        super(1);
        this.this$0 = webViewAdPlayer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((StorageEventInfo) obj);
        return w.f38141a;
    }

    public final void invoke(final StorageEventInfo storageEventInfo) {
        m.e(storageEventInfo, "it");
        p0 scope = this.this$0.getScope();
        final WebViewAdPlayer webViewAdPlayer = this.this$0;
        c2 unused = k.d(scope, (g) null, (r0) null, new AnonymousClass1((d<? super AnonymousClass1>) null), 3, (Object) null);
    }
}
