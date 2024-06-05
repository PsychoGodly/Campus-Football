package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.model.ShowEvent;
import sd.w;
import se.e;
import se.f;
import xd.d;

/* compiled from: SafeCollector.common.kt */
public final class WebViewAdPlayer$special$$inlined$map$1 implements e<ShowEvent> {
    final /* synthetic */ e $this_unsafeTransform$inlined;

    public WebViewAdPlayer$special$$inlined$map$1(e eVar) {
        this.$this_unsafeTransform$inlined = eVar;
    }

    public Object collect(final f fVar, d dVar) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new f() {
            /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e9, code lost:
                r0.L$0 = r2;
                r0.L$1 = r11;
                r0.label = 1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f3, code lost:
                if (com.unity3d.ads.adplayer.Invocation.handle$default(r10, (fe.l) null, r0, 1, (java.lang.Object) null) != r1) goto L_0x00f6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f5, code lost:
                return r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f6, code lost:
                r10 = r11;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:55:0x0121, code lost:
                throw new java.lang.IllegalStateException("Unexpected location: " + r10.getLocation());
             */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
            /* JADX WARNING: Removed duplicated region for block: B:51:0x0103 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r10, xd.d r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r11
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1
                    r0.<init>(r9, r11)
                L_0x0018:
                    java.lang.Object r11 = r0.result
                    java.lang.Object r1 = yd.d.c()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L_0x0043
                    if (r2 == r4) goto L_0x0036
                    if (r2 != r3) goto L_0x002e
                    sd.p.b(r11)
                    goto L_0x0104
                L_0x002e:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L_0x0036:
                    java.lang.Object r10 = r0.L$1
                    com.unity3d.ads.core.data.model.ShowEvent r10 = (com.unity3d.ads.core.data.model.ShowEvent) r10
                    java.lang.Object r2 = r0.L$0
                    se.f r2 = (se.f) r2
                    sd.p.b(r11)
                    goto L_0x00f7
                L_0x0043:
                    sd.p.b(r11)
                    se.f r2 = r3
                    com.unity3d.ads.adplayer.Invocation r10 = (com.unity3d.ads.adplayer.Invocation) r10
                    java.lang.String r11 = r10.getLocation()
                    int r6 = r11.hashCode()
                    switch(r6) {
                        case -1250843874: goto L_0x00df;
                        case -928612193: goto L_0x00a9;
                        case -707523043: goto L_0x009e;
                        case -497639557: goto L_0x0093;
                        case 1039618005: goto L_0x0088;
                        case 1306610281: goto L_0x0057;
                        default: goto L_0x0055;
                    }
                L_0x0055:
                    goto L_0x0107
                L_0x0057:
                    java.lang.String r6 = "com.unity3d.services.ads.api.AdViewer.failed"
                    boolean r11 = r11.equals(r6)
                    if (r11 == 0) goto L_0x0107
                    java.lang.Object[] r11 = r10.getParameters()
                    java.lang.Object r11 = td.m.m(r11)
                    java.lang.String r6 = "null cannot be cast to non-null type org.json.JSONObject"
                    kotlin.jvm.internal.m.c(r11, r6)
                    org.json.JSONObject r11 = (org.json.JSONObject) r11
                    java.lang.String r6 = "code"
                    int r6 = r11.optInt(r6)
                    java.lang.String r7 = "message"
                    java.lang.String r11 = r11.optString(r7)
                    com.unity3d.ads.core.data.model.ShowEvent$Error r7 = new com.unity3d.ads.core.data.model.ShowEvent$Error
                    java.lang.String r8 = "errorMessage"
                    kotlin.jvm.internal.m.d(r11, r8)
                    java.lang.String r8 = "adviewer"
                    r7.<init>(r11, r6, r8)
                    r11 = r7
                    goto L_0x00e9
                L_0x0088:
                    java.lang.String r6 = "com.unity3d.services.ads.api.AdViewer.started"
                    boolean r11 = r11.equals(r6)
                    if (r11 == 0) goto L_0x0107
                    com.unity3d.ads.core.data.model.ShowEvent$Started r11 = com.unity3d.ads.core.data.model.ShowEvent.Started.INSTANCE
                    goto L_0x00e9
                L_0x0093:
                    java.lang.String r6 = "com.unity3d.services.ads.api.AdViewer.clicked"
                    boolean r11 = r11.equals(r6)
                    if (r11 == 0) goto L_0x0107
                    com.unity3d.ads.core.data.model.ShowEvent$Clicked r11 = com.unity3d.ads.core.data.model.ShowEvent.Clicked.INSTANCE
                    goto L_0x00e9
                L_0x009e:
                    java.lang.String r6 = "com.unity3d.services.ads.api.AdViewer.leftApplication"
                    boolean r11 = r11.equals(r6)
                    if (r11 == 0) goto L_0x0107
                    com.unity3d.ads.core.data.model.ShowEvent$LeftApplication r11 = com.unity3d.ads.core.data.model.ShowEvent.LeftApplication.INSTANCE
                    goto L_0x00e9
                L_0x00a9:
                    java.lang.String r6 = "com.unity3d.services.ads.api.AdViewer.completed"
                    boolean r11 = r11.equals(r6)
                    if (r11 == 0) goto L_0x0107
                    com.unity3d.ads.core.data.model.ShowEvent$Completed r11 = new com.unity3d.ads.core.data.model.ShowEvent$Completed
                    java.lang.Object[] r6 = r10.getParameters()
                    java.lang.Object r6 = td.m.m(r6)
                    boolean r7 = r6 instanceof java.lang.String
                    if (r7 == 0) goto L_0x00c2
                    java.lang.String r6 = (java.lang.String) r6
                    goto L_0x00c3
                L_0x00c2:
                    r6 = r5
                L_0x00c3:
                    java.lang.String r7 = "COMPLETED"
                    boolean r7 = kotlin.jvm.internal.m.a(r6, r7)
                    if (r7 == 0) goto L_0x00ce
                    com.unity3d.ads.adplayer.model.ShowStatus r6 = com.unity3d.ads.adplayer.model.ShowStatus.COMPLETED
                    goto L_0x00db
                L_0x00ce:
                    java.lang.String r7 = "SKIPPED"
                    boolean r6 = kotlin.jvm.internal.m.a(r6, r7)
                    if (r6 == 0) goto L_0x00d9
                    com.unity3d.ads.adplayer.model.ShowStatus r6 = com.unity3d.ads.adplayer.model.ShowStatus.SKIPPED
                    goto L_0x00db
                L_0x00d9:
                    com.unity3d.ads.adplayer.model.ShowStatus r6 = com.unity3d.ads.adplayer.model.ShowStatus.ERROR
                L_0x00db:
                    r11.<init>(r6)
                    goto L_0x00e9
                L_0x00df:
                    java.lang.String r6 = "com.unity3d.services.ads.api.AdViewer.cancelShowTimeout"
                    boolean r11 = r11.equals(r6)
                    if (r11 == 0) goto L_0x0107
                    com.unity3d.ads.core.data.model.ShowEvent$CancelTimeout r11 = com.unity3d.ads.core.data.model.ShowEvent.CancelTimeout.INSTANCE
                L_0x00e9:
                    r0.L$0 = r2
                    r0.L$1 = r11
                    r0.label = r4
                    java.lang.Object r10 = com.unity3d.ads.adplayer.Invocation.handle$default(r10, r5, r0, r4, r5)
                    if (r10 != r1) goto L_0x00f6
                    return r1
                L_0x00f6:
                    r10 = r11
                L_0x00f7:
                    r0.L$0 = r5
                    r0.L$1 = r5
                    r0.label = r3
                    java.lang.Object r10 = r2.emit(r10, r0)
                    if (r10 != r1) goto L_0x0104
                    return r1
                L_0x0104:
                    sd.w r10 = sd.w.f38141a
                    return r10
                L_0x0107:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "Unexpected location: "
                    r0.append(r1)
                    java.lang.String r10 = r10.getLocation()
                    r0.append(r10)
                    java.lang.String r10 = r0.toString()
                    r11.<init>(r10)
                    throw r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, xd.d):java.lang.Object");
            }
        }, dVar);
        if (collect == d.c()) {
            return collect;
        }
        return w.f38141a;
    }
}
