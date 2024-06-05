package com.unity3d.ads.adplayer;

import sd.w;
import se.e;
import se.f;
import xd.d;

/* compiled from: SafeCollector.common.kt */
public final class WebViewAdPlayer$special$$inlined$filter$5 implements e<Invocation> {
    final /* synthetic */ e $this_unsafeTransform$inlined;

    public WebViewAdPlayer$special$$inlined$filter$5(e eVar) {
        this.$this_unsafeTransform$inlined = eVar;
    }

    public Object collect(final f fVar, d dVar) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new f() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, xd.d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = yd.d.c()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    sd.p.b(r7)
                    goto L_0x0050
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    sd.p.b(r7)
                    se.f r7 = r3
                    r2 = r6
                    com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                    java.lang.String[] r4 = com.unity3d.ads.adplayer.WebViewAdPlayerKt.REQUEST_EVENTS
                    java.lang.String r2 = r2.getLocation()
                    boolean r2 = td.m.i(r4, r2)
                    if (r2 == 0) goto L_0x0050
                    r0.label = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x0050
                    return r1
                L_0x0050:
                    sd.w r6 = sd.w.f38141a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.emit(java.lang.Object, xd.d):java.lang.Object");
            }
        }, dVar);
        if (collect == d.c()) {
            return collect;
        }
        return w.f38141a;
    }
}
