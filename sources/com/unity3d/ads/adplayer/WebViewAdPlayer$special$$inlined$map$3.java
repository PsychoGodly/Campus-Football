package com.unity3d.ads.adplayer;

import sd.n;
import sd.w;
import se.e;
import se.f;
import xd.d;

/* compiled from: SafeCollector.common.kt */
public final class WebViewAdPlayer$special$$inlined$map$3 implements e<n<? extends byte[], ? extends Integer>> {
    final /* synthetic */ e $this_unsafeTransform$inlined;

    public WebViewAdPlayer$special$$inlined$map$3(e eVar) {
        this.$this_unsafeTransform$inlined = eVar;
    }

    public Object collect(final f fVar, d dVar) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new f() {
            /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x0092 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, xd.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = yd.d.c()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L_0x0041
                    if (r2 == r4) goto L_0x0035
                    if (r2 != r3) goto L_0x002d
                    sd.p.b(r8)
                    goto L_0x0093
                L_0x002d:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0035:
                    java.lang.Object r7 = r0.L$1
                    com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                    java.lang.Object r2 = r0.L$0
                    se.f r2 = (se.f) r2
                    sd.p.b(r8)
                    goto L_0x0055
                L_0x0041:
                    sd.p.b(r8)
                    se.f r2 = r3
                    com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                    r0.L$0 = r2
                    r0.L$1 = r7
                    r0.label = r4
                    java.lang.Object r8 = com.unity3d.ads.adplayer.Invocation.handle$default(r7, r5, r0, r4, r5)
                    if (r8 != r1) goto L_0x0055
                    return r1
                L_0x0055:
                    java.lang.Object[] r7 = r7.getParameters()
                    java.lang.Object r7 = td.m.m(r7)
                    java.lang.String r8 = "null cannot be cast to non-null type org.json.JSONObject"
                    kotlin.jvm.internal.m.c(r7, r8)
                    org.json.JSONObject r7 = (org.json.JSONObject) r7
                    java.lang.String r8 = "data"
                    java.lang.String r4 = r7.optString(r8)
                    kotlin.jvm.internal.m.d(r4, r8)
                    java.nio.charset.Charset r8 = ne.c.f36517g
                    byte[] r8 = r4.getBytes(r8)
                    java.lang.String r4 = "this as java.lang.String).getBytes(charset)"
                    kotlin.jvm.internal.m.d(r8, r4)
                    java.lang.String r4 = "dataVersion"
                    int r7 = r7.optInt(r4)
                    java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.c(r7)
                    sd.n r7 = sd.s.a(r8, r7)
                    r0.L$0 = r5
                    r0.L$1 = r5
                    r0.label = r3
                    java.lang.Object r7 = r2.emit(r7, r0)
                    if (r7 != r1) goto L_0x0093
                    return r1
                L_0x0093:
                    sd.w r7 = sd.w.f38141a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, xd.d):java.lang.Object");
            }
        }, dVar);
        if (collect == d.c()) {
            return collect;
        }
        return w.f38141a;
    }
}
