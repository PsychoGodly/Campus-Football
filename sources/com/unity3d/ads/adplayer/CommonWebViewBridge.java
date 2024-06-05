package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import fe.p;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import pe.c2;
import pe.o0;
import pe.p0;
import pe.q0;
import pe.r0;
import pe.x;
import re.a;
import sd.n;
import sd.w;
import se.b0;
import se.g;
import se.k0;
import se.u;
import se.v;
import se.z;
import xd.d;

/* compiled from: CommonWebViewBridge.kt */
public final class CommonWebViewBridge implements WebViewBridge {
    /* access modifiers changed from: private */
    public final u<Invocation> _onInvocation;
    private final v<Set<n<String, x<Object[]>>>> callbacks = k0.a(q0.b());
    private final z<Invocation> onInvocation;
    private final p0 scope;
    /* access modifiers changed from: private */
    public final WebViewContainer webViewContainer;

    @f(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$1", f = "CommonWebViewBridge.kt", l = {28}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$1  reason: invalid class name */
    /* compiled from: CommonWebViewBridge.kt */
    static final class AnonymousClass1 extends l implements p<p0, d<? super w>, Object> {
        int label;
        final /* synthetic */ CommonWebViewBridge this$0;

        {
            this.this$0 = r1;
        }

        public final d<w> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        public final Object invoke(p0 p0Var, d<? super w> dVar) {
            return ((AnonymousClass1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                sd.p.b(obj);
                WebViewContainer access$getWebViewContainer$p = this.this$0.webViewContainer;
                CommonWebViewBridge commonWebViewBridge = this.this$0;
                this.label = 1;
                if (access$getWebViewContainer$p.addJavascriptInterface(commonWebViewBridge, "webviewbridge", this) == c10) {
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

    public CommonWebViewBridge(pe.k0 k0Var, WebViewContainer webViewContainer2, p0 p0Var) {
        m.e(k0Var, "dispatcher");
        m.e(webViewContainer2, "webViewContainer");
        m.e(p0Var, "adPlayerScope");
        this.webViewContainer = webViewContainer2;
        p0 h10 = q0.h(q0.h(p0Var, k0Var), new o0("CommonWebViewBridge"));
        this.scope = h10;
        u<Invocation> b10 = b0.b(0, 0, (a) null, 7, (Object) null);
        this._onInvocation = b10;
        this.onInvocation = g.a(b10);
        c2 unused = k.d(h10, (xd.g) null, (r0) null, new AnonymousClass1(this, (d<? super AnonymousClass1>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final Object execute(HandlerType handlerType, String str, d<? super w> dVar) {
        WebViewContainer webViewContainer2 = this.webViewContainer;
        Object evaluateJavascript = webViewContainer2.evaluateJavascript("window.nativebridge." + handlerType.getJsPath() + '(' + str + ");", dVar);
        return evaluateJavascript == d.c() ? evaluateJavascript : w.f38141a;
    }

    /* access modifiers changed from: private */
    public final Object respond(String str, String str2, Object[] objArr, d<? super w> dVar) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(new JSONArray(objArr));
        HandlerType handlerType = HandlerType.CALLBACK;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(jSONArray);
        sb2.append(']');
        Object execute = execute(handlerType, sb2.toString(), dVar);
        return execute == d.c() ? execute : w.f38141a;
    }

    public z<Invocation> getOnInvocation() {
        return this.onInvocation;
    }

    public final p0 getScope() {
        return this.scope;
    }

    public void handleCallback(String str, String str2, String str3) {
        Object obj;
        Set<n<String, x<Object[]>>> value;
        m.e(str, "callbackId");
        m.e(str2, "callbackStatus");
        m.e(str3, "rawParameters");
        Object[] typedArray = JSONArrayExtensionsKt.toTypedArray(new JSONArray(str3));
        Iterator it = this.callbacks.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (m.a((String) ((n) obj).a(), str)) {
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            x xVar = (x) nVar.b();
            if (m.a(str2, "success")) {
                xVar.n0(typedArray);
            } else if (m.a(str2, "error")) {
                Object obj2 = typedArray[0];
                m.c(obj2, "null cannot be cast to non-null type kotlin.String");
                xVar.l0(new Exception((String) obj2));
            }
            v<Set<n<String, x<Object[]>>>> vVar = this.callbacks;
            do {
                value = vVar.getValue();
            } while (!vVar.a(value, r0.d(value, nVar)));
        }
    }

    public void handleInvocation(String str) {
        String str2 = str;
        m.e(str2, "message");
        JSONArray jSONArray = new JSONArray(str2);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            m.c(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            Object obj2 = jSONArray2.get(0);
            m.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) obj2;
            Object obj3 = jSONArray2.get(1);
            m.c(obj3, "null cannot be cast to non-null type kotlin.String");
            String str4 = (String) obj3;
            Object obj4 = jSONArray2.get(2);
            m.c(obj4, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray3 = (JSONArray) obj4;
            Object obj5 = jSONArray2.get(3);
            m.c(obj5, "null cannot be cast to non-null type kotlin.String");
            DeviceLog.debug("Unity Ads WebView calling for: " + str3 + '.' + str4 + '(' + jSONArray3 + ')');
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append('.');
            sb2.append(str4);
            c2 unused = k.d(this.scope, (xd.g) null, (r0) null, new CommonWebViewBridge$handleInvocation$1(sb2.toString(), jSONArray3, this, (String) obj5, (d<? super CommonWebViewBridge$handleInvocation$1>) null), 3, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f A[PHI: r14 
      PHI: (r14v2 java.lang.Object) = (r14v3 java.lang.Object), (r14v1 java.lang.Object) binds: [B:25:0x009c, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object request(java.lang.String r11, java.lang.String r12, java.lang.Object[] r13, xd.d<? super java.lang.Object[]> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.adplayer.CommonWebViewBridge$request$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 r0 = (com.unity3d.ads.adplayer.CommonWebViewBridge$request$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 r0 = new com.unity3d.ads.adplayer.CommonWebViewBridge$request$1
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 == r5) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            sd.p.b(r14)
            goto L_0x009f
        L_0x002d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0035:
            java.lang.Object r11 = r0.L$0
            pe.x r11 = (pe.x) r11
            sd.p.b(r14)
            goto L_0x0094
        L_0x003d:
            sd.p.b(r14)
            pe.x r14 = pe.z.b(r4, r5, r4)
            int r2 = r14.hashCode()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            se.v<java.util.Set<sd.n<java.lang.String, pe.x<java.lang.Object[]>>>> r6 = r10.callbacks
        L_0x004e:
            java.lang.Object r7 = r6.getValue()
            r8 = r7
            java.util.Set r8 = (java.util.Set) r8
            sd.n r9 = sd.s.a(r2, r14)
            java.util.Set r8 = td.r0.e(r8, r9)
            boolean r7 = r6.a(r7, r8)
            if (r7 == 0) goto L_0x004e
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            r6.put(r11)
            r6.put(r12)
            r6.put(r2)
            r11 = 0
            int r12 = r13.length
        L_0x0073:
            if (r11 >= r12) goto L_0x007d
            r2 = r13[r11]
            r6.put(r2)
            int r11 = r11 + 1
            goto L_0x0073
        L_0x007d:
            com.unity3d.ads.adplayer.HandlerType r11 = com.unity3d.ads.adplayer.HandlerType.INVOCATION
            java.lang.String r12 = r6.toString()
            java.lang.String r13 = "arguments.toString()"
            kotlin.jvm.internal.m.d(r12, r13)
            r0.L$0 = r14
            r0.label = r5
            java.lang.Object r11 = r10.execute(r11, r12, r0)
            if (r11 != r1) goto L_0x0093
            return r1
        L_0x0093:
            r11 = r14
        L_0x0094:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r14 = r11.E0(r0)
            if (r14 != r1) goto L_0x009f
            return r1
        L_0x009f:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.request(java.lang.String, java.lang.String, java.lang.Object[], xd.d):java.lang.Object");
    }

    public Object sendEvent(WebViewEvent webViewEvent, d<? super w> dVar) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(webViewEvent.getCategory());
        jSONArray.put(webViewEvent.getName());
        for (Object put : webViewEvent.getParameters()) {
            jSONArray.put(put);
        }
        HandlerType handlerType = HandlerType.EVENT;
        String jSONArray2 = jSONArray.toString();
        m.d(jSONArray2, "arguments.toString()");
        Object execute = execute(handlerType, jSONArray2, dVar);
        return execute == d.c() ? execute : w.f38141a;
    }
}
