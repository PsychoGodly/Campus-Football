package com.unity3d.ads.adplayer;

import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import org.json.JSONArray;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$1", f = "CommonWebViewBridge.kt", l = {103, 105, 106, 106, 112}, m = "invokeSuspend")
/* compiled from: CommonWebViewBridge.kt */
final class CommonWebViewBridge$handleInvocation$1 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ String $callback;
    final /* synthetic */ String $location;
    final /* synthetic */ JSONArray $parameters;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ CommonWebViewBridge this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonWebViewBridge$handleInvocation$1(String str, JSONArray jSONArray, CommonWebViewBridge commonWebViewBridge, String str2, d<? super CommonWebViewBridge$handleInvocation$1> dVar) {
        super(2, dVar);
        this.$location = str;
        this.$parameters = jSONArray;
        this.this$0 = commonWebViewBridge;
        this.$callback = str2;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new CommonWebViewBridge$handleInvocation$1(this.$location, this.$parameters, this.this$0, this.$callback, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((CommonWebViewBridge$handleInvocation$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a8 A[Catch:{ Exception -> 0x002b }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9 A[Catch:{ Exception -> 0x002b }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c1 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = yd.d.c()
            int r1 = r12.label
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r1 == 0) goto L_0x0058
            if (r1 == r7) goto L_0x0050
            if (r1 == r6) goto L_0x0048
            if (r1 == r5) goto L_0x002e
            if (r1 == r4) goto L_0x0026
            if (r1 != r3) goto L_0x001e
            sd.p.b(r13)
            goto L_0x0104
        L_0x001e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0026:
            sd.p.b(r13)     // Catch:{ Exception -> 0x002b }
            goto L_0x0104
        L_0x002b:
            r13 = move-exception
            goto L_0x00c2
        L_0x002e:
            int r1 = r12.I$0
            java.lang.Object r5 = r12.L$4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            java.lang.Object r6 = r12.L$3
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r9 = r12.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r12.L$1
            com.unity3d.ads.adplayer.CommonWebViewBridge r10 = (com.unity3d.ads.adplayer.CommonWebViewBridge) r10
            java.lang.Object r11 = r12.L$0
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            sd.p.b(r13)     // Catch:{ Exception -> 0x002b }
            goto L_0x00ad
        L_0x0048:
            java.lang.Object r1 = r12.L$0
            com.unity3d.ads.adplayer.Invocation r1 = (com.unity3d.ads.adplayer.Invocation) r1
            sd.p.b(r13)     // Catch:{ Exception -> 0x002b }
            goto L_0x008c
        L_0x0050:
            java.lang.Object r1 = r12.L$0
            com.unity3d.ads.adplayer.Invocation r1 = (com.unity3d.ads.adplayer.Invocation) r1
            sd.p.b(r13)
            goto L_0x007a
        L_0x0058:
            sd.p.b(r13)
            com.unity3d.ads.adplayer.Invocation r13 = new com.unity3d.ads.adplayer.Invocation
            java.lang.String r1 = r12.$location
            org.json.JSONArray r9 = r12.$parameters
            java.lang.Object[] r9 = com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.toTypedArray(r9)
            r13.<init>(r1, r9)
            com.unity3d.ads.adplayer.CommonWebViewBridge r1 = r12.this$0
            se.u r1 = r1._onInvocation
            r12.L$0 = r13
            r12.label = r7
            java.lang.Object r1 = r1.emit(r13, r12)
            if (r1 != r0) goto L_0x0079
            return r0
        L_0x0079:
            r1 = r13
        L_0x007a:
            r9 = 5000(0x1388, double:2.4703E-320)
            com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$1$1 r13 = new com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$1$1     // Catch:{ Exception -> 0x002b }
            r13.<init>(r1, r8)     // Catch:{ Exception -> 0x002b }
            r12.L$0 = r1     // Catch:{ Exception -> 0x002b }
            r12.label = r6     // Catch:{ Exception -> 0x002b }
            java.lang.Object r13 = pe.g3.c(r9, r13, r12)     // Catch:{ Exception -> 0x002b }
            if (r13 != r0) goto L_0x008c
            return r0
        L_0x008c:
            com.unity3d.ads.adplayer.CommonWebViewBridge r10 = r12.this$0     // Catch:{ Exception -> 0x002b }
            java.lang.String r9 = r12.$callback     // Catch:{ Exception -> 0x002b }
            java.lang.String r6 = "OK"
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x002b }
            r12.L$0 = r13     // Catch:{ Exception -> 0x002b }
            r12.L$1 = r10     // Catch:{ Exception -> 0x002b }
            r12.L$2 = r9     // Catch:{ Exception -> 0x002b }
            r12.L$3 = r6     // Catch:{ Exception -> 0x002b }
            r12.L$4 = r13     // Catch:{ Exception -> 0x002b }
            r12.I$0 = r2     // Catch:{ Exception -> 0x002b }
            r12.label = r5     // Catch:{ Exception -> 0x002b }
            java.lang.Object r1 = r1.getResult(r12)     // Catch:{ Exception -> 0x002b }
            if (r1 != r0) goto L_0x00a9
            return r0
        L_0x00a9:
            r5 = r13
            r11 = r5
            r13 = r1
            r1 = 0
        L_0x00ad:
            r5[r1] = r13     // Catch:{ Exception -> 0x002b }
            r12.L$0 = r8     // Catch:{ Exception -> 0x002b }
            r12.L$1 = r8     // Catch:{ Exception -> 0x002b }
            r12.L$2 = r8     // Catch:{ Exception -> 0x002b }
            r12.L$3 = r8     // Catch:{ Exception -> 0x002b }
            r12.L$4 = r8     // Catch:{ Exception -> 0x002b }
            r12.label = r4     // Catch:{ Exception -> 0x002b }
            java.lang.Object r13 = r10.respond(r9, r6, r11, r12)     // Catch:{ Exception -> 0x002b }
            if (r13 != r0) goto L_0x0104
            return r0
        L_0x00c2:
            boolean r1 = r13 instanceof pe.e3
            if (r1 == 0) goto L_0x00df
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = "Invocation("
            r13.append(r1)
            java.lang.String r1 = r12.$location
            r13.append(r1)
            java.lang.String r1 = ") is not handled"
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            goto L_0x00e7
        L_0x00df:
            java.lang.String r13 = r13.getMessage()
            if (r13 != 0) goto L_0x00e7
            java.lang.String r13 = "Unknown error"
        L_0x00e7:
            com.unity3d.ads.adplayer.CommonWebViewBridge r1 = r12.this$0
            java.lang.String r4 = r12.$callback
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r5[r2] = r13
            r12.L$0 = r8
            r12.L$1 = r8
            r12.L$2 = r8
            r12.L$3 = r8
            r12.L$4 = r8
            r12.label = r3
            java.lang.String r13 = "ERROR"
            java.lang.Object r13 = r1.respond(r4, r13, r5, r12)
            if (r13 != r0) goto L_0x0104
            return r0
        L_0x0104:
            sd.w r13 = sd.w.f38141a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
