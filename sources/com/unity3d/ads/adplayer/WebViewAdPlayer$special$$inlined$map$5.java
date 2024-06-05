package com.unity3d.ads.adplayer;

import sd.w;
import se.e;
import se.f;
import xd.d;

/* compiled from: SafeCollector.common.kt */
public final class WebViewAdPlayer$special$$inlined$map$5 implements e<w> {
    final /* synthetic */ e $this_unsafeTransform$inlined;
    final /* synthetic */ WebViewAdPlayer this$0;

    public WebViewAdPlayer$special$$inlined$map$5(e eVar, WebViewAdPlayer webViewAdPlayer) {
        this.$this_unsafeTransform$inlined = eVar;
        this.this$0 = webViewAdPlayer;
    }

    public Object collect(final f fVar, d dVar) {
        e eVar = this.$this_unsafeTransform$inlined;
        final WebViewAdPlayer webViewAdPlayer = this.this$0;
        Object collect = eVar.collect(new f() {
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.String} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:25:0x008c  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x00cd  */
            /* JADX WARNING: Removed duplicated region for block: B:41:0x00ed  */
            /* JADX WARNING: Removed duplicated region for block: B:47:0x0111 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:48:0x0112  */
            /* JADX WARNING: Removed duplicated region for block: B:52:0x011f A[Catch:{ Exception -> 0x0078 }] */
            /* JADX WARNING: Removed duplicated region for block: B:53:0x0122 A[Catch:{ Exception -> 0x0078 }] */
            /* JADX WARNING: Removed duplicated region for block: B:59:0x0172 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:73:0x01bf A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r17, xd.d r18) {
                /*
                    r16 = this;
                    r1 = r16
                    r0 = r18
                    boolean r2 = r0 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1
                    if (r2 == 0) goto L_0x0017
                    r2 = r0
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1 r2 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) r2
                    int r3 = r2.label
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.label = r3
                    goto L_0x001c
                L_0x0017:
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1 r2 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1
                    r2.<init>(r1, r0)
                L_0x001c:
                    java.lang.Object r0 = r2.result
                    java.lang.Object r3 = yd.d.c()
                    int r4 = r2.label
                    r5 = 0
                    r6 = 5
                    r7 = 4
                    r8 = 3
                    r9 = 2
                    r10 = 1
                    r11 = 0
                    if (r4 == 0) goto L_0x008c
                    if (r4 == r10) goto L_0x007b
                    if (r4 == r9) goto L_0x0063
                    if (r4 == r8) goto L_0x004e
                    if (r4 == r7) goto L_0x0044
                    if (r4 != r6) goto L_0x003c
                    sd.p.b(r0)
                    goto L_0x01c0
                L_0x003c:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r2)
                    throw r0
                L_0x0044:
                    java.lang.Object r4 = r2.L$0
                    se.f r4 = (se.f) r4
                    sd.p.b(r0)
                    r7 = r11
                    goto L_0x01ac
                L_0x004e:
                    java.lang.Object r4 = r2.L$3
                    java.lang.String r4 = (java.lang.String) r4
                    java.lang.Object r12 = r2.L$2
                    java.lang.String r12 = (java.lang.String) r12
                    java.lang.Object r13 = r2.L$1
                    se.f r13 = (se.f) r13
                    java.lang.Object r14 = r2.L$0
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2 r14 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2) r14
                    sd.p.b(r0)     // Catch:{ Exception -> 0x0078 }
                    goto L_0x0173
                L_0x0063:
                    java.lang.Object r4 = r2.L$3
                    java.lang.String r4 = (java.lang.String) r4
                    java.lang.Object r12 = r2.L$2
                    java.lang.String r12 = (java.lang.String) r12
                    java.lang.Object r13 = r2.L$1
                    se.f r13 = (se.f) r13
                    java.lang.Object r14 = r2.L$0
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2 r14 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2) r14
                    sd.p.b(r0)     // Catch:{ Exception -> 0x0078 }
                    goto L_0x0115
                L_0x0078:
                    r0 = move-exception
                    goto L_0x0179
                L_0x007b:
                    java.lang.Object r4 = r2.L$2
                    com.unity3d.ads.adplayer.Invocation r4 = (com.unity3d.ads.adplayer.Invocation) r4
                    java.lang.Object r12 = r2.L$1
                    se.f r12 = (se.f) r12
                    java.lang.Object r13 = r2.L$0
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2 r13 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2) r13
                    sd.p.b(r0)
                    r14 = r13
                    goto L_0x00a5
                L_0x008c:
                    sd.p.b(r0)
                    se.f r12 = r4
                    r4 = r17
                    com.unity3d.ads.adplayer.Invocation r4 = (com.unity3d.ads.adplayer.Invocation) r4
                    r2.L$0 = r1
                    r2.L$1 = r12
                    r2.L$2 = r4
                    r2.label = r10
                    java.lang.Object r0 = com.unity3d.ads.adplayer.Invocation.handle$default(r4, r11, r2, r10, r11)
                    if (r0 != r3) goto L_0x00a4
                    return r3
                L_0x00a4:
                    r14 = r1
                L_0x00a5:
                    java.lang.Object[] r0 = r4.getParameters()
                    java.lang.Object r0 = td.m.m(r0)
                    java.lang.String r13 = "null cannot be cast to non-null type kotlin.String"
                    kotlin.jvm.internal.m.c(r0, r13)
                    r13 = r0
                    java.lang.String r13 = (java.lang.String) r13
                    java.lang.Object[] r0 = r4.getParameters()
                    java.lang.Object r0 = td.m.o(r0, r10)
                    r15 = r0
                    java.lang.String r15 = (java.lang.String) r15
                    java.lang.String r0 = r4.getLocation()
                    int r11 = r0.hashCode()
                    r7 = -934922905(0xffffffffc8463567, float:-202965.61)
                    if (r11 == r7) goto L_0x00ed
                    r7 = -934674393(0xffffffffc84a0027, float:-206848.61)
                    if (r11 == r7) goto L_0x00e2
                    r7 = -445801745(0xffffffffe56d9aef, float:-7.012868E22)
                    if (r11 != r7) goto L_0x01c3
                    java.lang.String r7 = "com.unity3d.services.core.api.Request.get"
                    boolean r0 = r0.equals(r7)
                    if (r0 == 0) goto L_0x01c3
                    com.unity3d.services.core.network.model.RequestType r0 = com.unity3d.services.core.network.model.RequestType.GET
                    goto L_0x00f7
                L_0x00e2:
                    java.lang.String r7 = "com.unity3d.services.core.api.Request.post"
                    boolean r0 = r0.equals(r7)
                    if (r0 == 0) goto L_0x01c3
                    com.unity3d.services.core.network.model.RequestType r0 = com.unity3d.services.core.network.model.RequestType.POST
                    goto L_0x00f7
                L_0x00ed:
                    java.lang.String r7 = "com.unity3d.services.core.api.Request.head"
                    boolean r0 = r0.equals(r7)
                    if (r0 == 0) goto L_0x01c3
                    com.unity3d.services.core.network.model.RequestType r0 = com.unity3d.services.core.network.model.RequestType.HEAD
                L_0x00f7:
                    com.unity3d.ads.adplayer.WebViewAdPlayer r7 = r2     // Catch:{ Exception -> 0x0175 }
                    com.unity3d.ads.core.domain.ExecuteAdViewerRequest r7 = r7.executeAdViewerRequest     // Catch:{ Exception -> 0x0175 }
                    java.lang.Object[] r4 = r4.getParameters()     // Catch:{ Exception -> 0x0175 }
                    r2.L$0 = r14     // Catch:{ Exception -> 0x0175 }
                    r2.L$1 = r12     // Catch:{ Exception -> 0x0175 }
                    r2.L$2 = r15     // Catch:{ Exception -> 0x0175 }
                    r2.L$3 = r13     // Catch:{ Exception -> 0x0175 }
                    r2.label = r9     // Catch:{ Exception -> 0x0175 }
                    java.lang.Object r0 = r7.invoke(r0, r4, r2)     // Catch:{ Exception -> 0x0175 }
                    if (r0 != r3) goto L_0x0112
                    return r3
                L_0x0112:
                    r4 = r13
                    r13 = r12
                    r12 = r15
                L_0x0115:
                    com.unity3d.services.core.network.model.HttpResponse r0 = (com.unity3d.services.core.network.model.HttpResponse) r0     // Catch:{ Exception -> 0x0078 }
                    java.lang.Object r7 = r0.getBody()     // Catch:{ Exception -> 0x0078 }
                    boolean r11 = r7 instanceof java.lang.String     // Catch:{ Exception -> 0x0078 }
                    if (r11 == 0) goto L_0x0122
                    java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0078 }
                    goto L_0x0132
                L_0x0122:
                    boolean r11 = r7 instanceof byte[]     // Catch:{ Exception -> 0x0078 }
                    if (r11 == 0) goto L_0x0131
                    java.lang.String r11 = new java.lang.String     // Catch:{ Exception -> 0x0078 }
                    byte[] r7 = (byte[]) r7     // Catch:{ Exception -> 0x0078 }
                    java.nio.charset.Charset r15 = ne.c.f36512b     // Catch:{ Exception -> 0x0078 }
                    r11.<init>(r7, r15)     // Catch:{ Exception -> 0x0078 }
                    r7 = r11
                    goto L_0x0132
                L_0x0131:
                    r7 = 0
                L_0x0132:
                    java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0078 }
                    r11[r5] = r4     // Catch:{ Exception -> 0x0078 }
                    java.lang.String r15 = r0.getUrlString()     // Catch:{ Exception -> 0x0078 }
                    r11[r10] = r15     // Catch:{ Exception -> 0x0078 }
                    r11[r9] = r7     // Catch:{ Exception -> 0x0078 }
                    int r7 = r0.getStatusCode()     // Catch:{ Exception -> 0x0078 }
                    java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.c(r7)     // Catch:{ Exception -> 0x0078 }
                    r11[r8] = r7     // Catch:{ Exception -> 0x0078 }
                    java.util.Map r0 = r0.getHeaders()     // Catch:{ Exception -> 0x0078 }
                    org.json.JSONArray r0 = com.unity3d.services.core.network.mapper.HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(r0)     // Catch:{ Exception -> 0x0078 }
                    r7 = 4
                    r11[r7] = r0     // Catch:{ Exception -> 0x0078 }
                    java.util.List r0 = td.q.f(r11)     // Catch:{ Exception -> 0x0078 }
                    com.unity3d.ads.adplayer.WebViewAdPlayer r7 = r2     // Catch:{ Exception -> 0x0078 }
                    com.unity3d.ads.adplayer.WebViewBridge r7 = r7.bridge     // Catch:{ Exception -> 0x0078 }
                    com.unity3d.ads.adplayer.model.OnWebRequestComplete r11 = new com.unity3d.ads.adplayer.model.OnWebRequestComplete     // Catch:{ Exception -> 0x0078 }
                    r11.<init>(r0)     // Catch:{ Exception -> 0x0078 }
                    r2.L$0 = r14     // Catch:{ Exception -> 0x0078 }
                    r2.L$1 = r13     // Catch:{ Exception -> 0x0078 }
                    r2.L$2 = r12     // Catch:{ Exception -> 0x0078 }
                    r2.L$3 = r4     // Catch:{ Exception -> 0x0078 }
                    r2.label = r8     // Catch:{ Exception -> 0x0078 }
                    java.lang.Object r0 = r7.sendEvent(r11, r2)     // Catch:{ Exception -> 0x0078 }
                    if (r0 != r3) goto L_0x0173
                    return r3
                L_0x0173:
                    r7 = 0
                    goto L_0x01ad
                L_0x0175:
                    r0 = move-exception
                    r4 = r13
                    r13 = r12
                    r12 = r15
                L_0x0179:
                    java.lang.String[] r7 = new java.lang.String[r8]
                    r7[r5] = r4
                    r7[r10] = r12
                    java.lang.String r0 = r0.getMessage()
                    if (r0 != 0) goto L_0x0187
                    java.lang.String r0 = ""
                L_0x0187:
                    r7[r9] = r0
                    java.util.List r0 = td.q.f(r7)
                    com.unity3d.ads.adplayer.WebViewAdPlayer r4 = r2
                    com.unity3d.ads.adplayer.WebViewBridge r4 = r4.bridge
                    com.unity3d.ads.adplayer.model.OnWebRequestFailed r5 = new com.unity3d.ads.adplayer.model.OnWebRequestFailed
                    r5.<init>(r0)
                    r2.L$0 = r13
                    r7 = 0
                    r2.L$1 = r7
                    r2.L$2 = r7
                    r2.L$3 = r7
                    r8 = 4
                    r2.label = r8
                    java.lang.Object r0 = r4.sendEvent(r5, r2)
                    if (r0 != r3) goto L_0x01ab
                    return r3
                L_0x01ab:
                    r4 = r13
                L_0x01ac:
                    r13 = r4
                L_0x01ad:
                    sd.w r0 = sd.w.f38141a
                    r2.L$0 = r7
                    r2.L$1 = r7
                    r2.L$2 = r7
                    r2.L$3 = r7
                    r2.label = r6
                    java.lang.Object r0 = r13.emit(r0, r2)
                    if (r0 != r3) goto L_0x01c0
                    return r3
                L_0x01c0:
                    sd.w r0 = sd.w.f38141a
                    return r0
                L_0x01c3:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Unexpected location: "
                    r2.append(r3)
                    java.lang.String r3 = r4.getLocation()
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    r0.<init>(r2)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.emit(java.lang.Object, xd.d):java.lang.Object");
            }
        }, dVar);
        if (collect == d.c()) {
            return collect;
        }
        return w.f38141a;
    }
}
