package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.LoadEvent;
import sd.w;
import se.e;
import se.f;
import xd.d;

/* compiled from: SafeCollector.common.kt */
public final class WebViewAdPlayer$special$$inlined$map$2 implements e<LoadEvent> {
    final /* synthetic */ e $this_unsafeTransform$inlined;

    public WebViewAdPlayer$special$$inlined$map$2(e eVar) {
        this.$this_unsafeTransform$inlined = eVar;
    }

    public Object collect(final f fVar, d dVar) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new f() {
            /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0095 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r8, xd.d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.result
                    java.lang.Object r1 = yd.d.c()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L_0x0041
                    if (r2 == r4) goto L_0x0035
                    if (r2 != r3) goto L_0x002d
                    sd.p.b(r9)
                    goto L_0x0096
                L_0x002d:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0035:
                    java.lang.Object r8 = r0.L$1
                    com.unity3d.ads.adplayer.Invocation r8 = (com.unity3d.ads.adplayer.Invocation) r8
                    java.lang.Object r2 = r0.L$0
                    se.f r2 = (se.f) r2
                    sd.p.b(r9)
                    goto L_0x0055
                L_0x0041:
                    sd.p.b(r9)
                    se.f r2 = r3
                    com.unity3d.ads.adplayer.Invocation r8 = (com.unity3d.ads.adplayer.Invocation) r8
                    r0.L$0 = r2
                    r0.L$1 = r8
                    r0.label = r4
                    java.lang.Object r9 = com.unity3d.ads.adplayer.Invocation.handle$default(r8, r5, r0, r4, r5)
                    if (r9 != r1) goto L_0x0055
                    return r1
                L_0x0055:
                    java.lang.String r9 = r8.getLocation()
                    java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.loadError"
                    boolean r9 = kotlin.jvm.internal.m.a(r9, r4)
                    if (r9 == 0) goto L_0x0087
                    java.lang.Object[] r8 = r8.getParameters()
                    java.lang.Object r8 = td.m.m(r8)
                    java.lang.String r9 = "null cannot be cast to non-null type org.json.JSONObject"
                    kotlin.jvm.internal.m.c(r8, r9)
                    org.json.JSONObject r8 = (org.json.JSONObject) r8
                    java.lang.String r9 = "code"
                    int r9 = r8.optInt(r9)
                    java.lang.String r4 = "message"
                    java.lang.String r8 = r8.optString(r4)
                    com.unity3d.ads.adplayer.model.LoadEvent$Error r4 = new com.unity3d.ads.adplayer.model.LoadEvent$Error
                    java.lang.String r6 = "errorMessage"
                    kotlin.jvm.internal.m.d(r8, r6)
                    r4.<init>(r8, r9)
                    goto L_0x0089
                L_0x0087:
                    com.unity3d.ads.adplayer.model.LoadEvent$Completed r4 = com.unity3d.ads.adplayer.model.LoadEvent.Completed.INSTANCE
                L_0x0089:
                    r0.L$0 = r5
                    r0.L$1 = r5
                    r0.label = r3
                    java.lang.Object r8 = r2.emit(r4, r0)
                    if (r8 != r1) goto L_0x0096
                    return r1
                L_0x0096:
                    sd.w r8 = sd.w.f38141a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, xd.d):java.lang.Object");
            }
        }, dVar);
        if (collect == d.c()) {
            return collect;
        }
        return w.f38141a;
    }
}
