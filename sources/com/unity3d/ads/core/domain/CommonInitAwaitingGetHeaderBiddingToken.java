package com.unity3d.ads.core.domain;

import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.core.misc.Utilities;
import java.util.Map;
import kotlin.jvm.internal.m;
import oe.j;
import sd.s;
import sd.w;

/* compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
public final class CommonInitAwaitingGetHeaderBiddingToken implements GetAsyncHeaderBiddingToken {
    private final AwaitInitialization awaitInitialization;
    private final GetHeaderBiddingToken getHeaderBiddingToken;
    private final GetInitializationState getInitializationState;
    private IUnityAdsTokenListener listener;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final long startTime = j.f36786a.a();

    /* compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.unity3d.ads.core.data.model.InitializationState[] r0 = com.unity3d.ads.core.data.model.InitializationState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.unity3d.ads.core.data.model.InitializationState r1 = com.unity3d.ads.core.data.model.InitializationState.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.unity3d.ads.core.data.model.InitializationState r1 = com.unity3d.ads.core.data.model.InitializationState.FAILED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.unity3d.ads.core.data.model.InitializationState r1 = com.unity3d.ads.core.data.model.InitializationState.NOT_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.unity3d.ads.core.data.model.InitializationState r1 = com.unity3d.ads.core.data.model.InitializationState.INITIALIZING     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.WhenMappings.<clinit>():void");
        }
    }

    public CommonInitAwaitingGetHeaderBiddingToken(GetHeaderBiddingToken getHeaderBiddingToken2, SendDiagnosticEvent sendDiagnosticEvent2, GetInitializationState getInitializationState2, AwaitInitialization awaitInitialization2) {
        m.e(getHeaderBiddingToken2, "getHeaderBiddingToken");
        m.e(sendDiagnosticEvent2, "sendDiagnosticEvent");
        m.e(getInitializationState2, "getInitializationState");
        m.e(awaitInitialization2, "awaitInitialization");
        this.getHeaderBiddingToken = getHeaderBiddingToken2;
        this.sendDiagnosticEvent = sendDiagnosticEvent2;
        this.getInitializationState = getInitializationState2;
        this.awaitInitialization = awaitInitialization2;
    }

    private final void fetchToken(boolean z10) {
        String str;
        String str2;
        String str3 = null;
        try {
            str = null;
            str3 = this.getHeaderBiddingToken.invoke();
            str2 = null;
        } catch (Exception e10) {
            str2 = ExceptionExtensionsKt.retrieveUnityCrashValue(e10);
            str = "uncaught_exception";
        }
        if (str3 == null) {
            tokenFailure(z10, str, str2);
        } else {
            tokenSuccess(z10, str3);
        }
    }

    private final void tokenFailure(boolean z10, String str, String str2) {
        SendDiagnosticEvent sendDiagnosticEvent2 = this.sendDiagnosticEvent;
        Double valueOf = Double.valueOf(TimeExtensionsKt.elapsedMillis(j.a.c(this.startTime)));
        Map c10 = j0.c();
        c10.put("sync", "false");
        c10.put("state", this.getInitializationState.invoke().toString());
        c10.put("awaited_init", String.valueOf(z10));
        if (str != null) {
            String str3 = (String) c10.put("reason", str);
        }
        if (str2 != null) {
            c10.put("reason_debug", str2);
        }
        w wVar = w.f38141a;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_gateway_token_failure_time", valueOf, j0.b(c10), (Map) null, (AdObject) null, 24, (Object) null);
        Utilities.wrapCustomerListener(new a(this));
    }

    static /* synthetic */ void tokenFailure$default(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, boolean z10, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        commonInitAwaitingGetHeaderBiddingToken.tokenFailure(z10, str, str2);
    }

    /* access modifiers changed from: private */
    public static final void tokenFailure$lambda$4(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken) {
        m.e(commonInitAwaitingGetHeaderBiddingToken, "this$0");
        IUnityAdsTokenListener iUnityAdsTokenListener = commonInitAwaitingGetHeaderBiddingToken.listener;
        if (iUnityAdsTokenListener != null) {
            iUnityAdsTokenListener.onUnityAdsTokenReady((String) null);
        }
    }

    private final void tokenStart() {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_gateway_token_started", (Double) null, k0.j(s.a("sync", "false"), s.a("state", this.getInitializationState.invoke().toString())), (Map) null, (AdObject) null, 26, (Object) null);
    }

    private final void tokenSuccess(boolean z10, String str) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_gateway_token_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(j.a.c(this.startTime))), k0.j(s.a("sync", "false"), s.a("state", this.getInitializationState.invoke().toString()), s.a("awaited_init", String.valueOf(z10))), (Map) null, (AdObject) null, 24, (Object) null);
        Utilities.wrapCustomerListener(new b(this, str));
    }

    /* access modifiers changed from: private */
    public static final void tokenSuccess$lambda$0(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, String str) {
        m.e(commonInitAwaitingGetHeaderBiddingToken, "this$0");
        m.e(str, "$token");
        IUnityAdsTokenListener iUnityAdsTokenListener = commonInitAwaitingGetHeaderBiddingToken.listener;
        if (iUnityAdsTokenListener != null) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(str);
        }
    }

    public final AwaitInitialization getAwaitInitialization() {
        return this.awaitInitialization;
    }

    public final GetHeaderBiddingToken getGetHeaderBiddingToken() {
        return this.getHeaderBiddingToken;
    }

    public final GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    public final IUnityAdsTokenListener getListener() {
        return this.listener;
    }

    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    /* renamed from: getStartTime-z9LOYto  reason: not valid java name */
    public final long m32getStartTimez9LOYto() {
        return this.startTime;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(com.unity3d.ads.IUnityAdsTokenListener r15, xd.d<? super sd.w> r16) {
        /*
            r14 = this;
            r6 = r14
            r0 = r15
            r1 = r16
            boolean r2 = r1 instanceof com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1 r2 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1 r2 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1
            r2.<init>(r14, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = yd.d.c()
            int r4 = r2.label
            r5 = 2
            r7 = 1
            if (r4 == 0) goto L_0x003b
            if (r4 != r7) goto L_0x0033
            java.lang.Object r0 = r2.L$0
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken r0 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken) r0
            sd.p.b(r1)
            r8 = r0
            goto L_0x007b
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003b:
            sd.p.b(r1)
            r6.listener = r0
            r14.tokenStart()
            if (r0 != 0) goto L_0x0052
            r1 = 0
            r3 = 0
            r4 = 4
            r5 = 0
            java.lang.String r2 = "listener_null"
            r0 = r14
            tokenFailure$default(r0, r1, r2, r3, r4, r5)
            sd.w r0 = sd.w.f38141a
            return r0
        L_0x0052:
            com.unity3d.ads.core.domain.GetInitializationState r0 = r6.getInitializationState
            com.unity3d.ads.core.data.model.InitializationState r0 = r0.invoke()
            int[] r1 = com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r7) goto L_0x00b0
            if (r0 == r5) goto L_0x00a5
            r1 = 3
            if (r0 == r1) goto L_0x00a5
            r1 = 4
            if (r0 == r1) goto L_0x006b
            goto L_0x00b4
        L_0x006b:
            com.unity3d.ads.core.domain.AwaitInitialization r0 = r6.awaitInitialization
            r8 = 5000(0x1388, double:2.4703E-320)
            r2.L$0 = r6
            r2.label = r7
            java.lang.Object r1 = r0.invoke(r8, r2)
            if (r1 != r3) goto L_0x007a
            return r3
        L_0x007a:
            r8 = r6
        L_0x007b:
            com.unity3d.ads.core.data.model.InitializationState r1 = (com.unity3d.ads.core.data.model.InitializationState) r1
            if (r1 != 0) goto L_0x0081
            r0 = -1
            goto L_0x0089
        L_0x0081:
            int[] r0 = com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r0 = r0[r1]
        L_0x0089:
            if (r0 == r7) goto L_0x00a1
            if (r0 == r5) goto L_0x0097
            r9 = 1
            r11 = 0
            r12 = 4
            r13 = 0
            java.lang.String r10 = "timeout"
            tokenFailure$default(r8, r9, r10, r11, r12, r13)
            goto L_0x00b4
        L_0x0097:
            r9 = 1
            r11 = 0
            r12 = 4
            r13 = 0
            java.lang.String r10 = "not_initialized"
            tokenFailure$default(r8, r9, r10, r11, r12, r13)
            goto L_0x00b4
        L_0x00a1:
            r8.fetchToken(r7)
            goto L_0x00b4
        L_0x00a5:
            r1 = 0
            r3 = 0
            r4 = 4
            r5 = 0
            java.lang.String r2 = "not_initialized"
            r0 = r14
            tokenFailure$default(r0, r1, r2, r3, r4, r5)
            goto L_0x00b4
        L_0x00b0:
            r0 = 0
            r14.fetchToken(r0)
        L_0x00b4:
            sd.w r0 = sd.w.f38141a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.invoke(com.unity3d.ads.IUnityAdsTokenListener, xd.d):java.lang.Object");
    }

    public final void setListener(IUnityAdsTokenListener iUnityAdsTokenListener) {
        this.listener = iUnityAdsTokenListener;
    }
}
