package com.unity3d.ads.core.domain;

import android.content.Context;
import com.applovin.mediation.MaxReward;
import com.google.protobuf.i;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.log.DeviceLog;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import oe.j;
import org.json.JSONObject;
import pe.k0;
import sd.s;
import vb.p;
import vb.r0;
import vb.w;
import wb.b;
import xd.d;

/* compiled from: LegacyLoadUseCase.kt */
public final class LegacyLoadUseCase {
    public static final Companion Companion = new Companion((h) null);
    public static final String KEY_AD_MARKUP = "adMarkup";
    public static final String KEY_OBJECT_ID = "objectId";
    /* access modifiers changed from: private */
    public final AdRepository adRepository;
    /* access modifiers changed from: private */
    public final AwaitInitialization awaitInitialization;
    private final k0 dispatcher;
    /* access modifiers changed from: private */
    public final GetInitializationState getInitializationState;
    private boolean isBanner;
    private boolean isHeaderBidding;
    /* access modifiers changed from: private */
    public IUnityAdsLoadListener listener;
    /* access modifiers changed from: private */
    public final Load load;
    private UnityAdsLoadOptions loadOptions;
    /* access modifiers changed from: private */
    public i opportunity;
    /* access modifiers changed from: private */
    public String placement;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private oe.i startTime;

    /* compiled from: LegacyLoadUseCase.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public LegacyLoadUseCase(k0 k0Var, Load load2, SendDiagnosticEvent sendDiagnosticEvent2, GetInitializationState getInitializationState2, AwaitInitialization awaitInitialization2, SessionRepository sessionRepository2, AdRepository adRepository2) {
        m.e(k0Var, "dispatcher");
        m.e(load2, "load");
        m.e(sendDiagnosticEvent2, "sendDiagnosticEvent");
        m.e(getInitializationState2, "getInitializationState");
        m.e(awaitInitialization2, "awaitInitialization");
        m.e(sessionRepository2, "sessionRepository");
        m.e(adRepository2, "adRepository");
        this.dispatcher = k0Var;
        this.load = load2;
        this.sendDiagnosticEvent = sendDiagnosticEvent2;
        this.getInitializationState = getInitializationState2;
        this.awaitInitialization = awaitInitialization2;
        this.sessionRepository = sessionRepository2;
        this.adRepository = adRepository2;
    }

    private final String getAdMarkup(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object opt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (opt = data.opt(KEY_AD_MARKUP)) == null) {
            return null;
        }
        return opt.toString();
    }

    private final r0 getAdType() {
        return this.isBanner ? r0.DIAGNOSTIC_AD_TYPE_BANNER : r0.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
    }

    private final p getBannerSize(UnityBannerSize unityBannerSize) {
        if (unityBannerSize == null) {
            return null;
        }
        w.a aVar = w.f39105b;
        p.a h02 = p.h0();
        m.d(h02, "newBuilder()");
        w a10 = aVar.a(h02);
        a10.c(unityBannerSize.getWidth());
        a10.b(unityBannerSize.getHeight());
        return a10.a();
    }

    /* access modifiers changed from: private */
    public final b getHeaderBiddingAdMarkup(String str) {
        if (str == null || o.m(str)) {
            return b.i0();
        }
        try {
            return b.j0(ProtobufExtensionsKt.fromBase64(str).J());
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final String getOpportunityId(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object opt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (opt = data.opt("objectId")) == null) {
            return null;
        }
        return opt.toString();
    }

    private final Map<String, String> getTags(String str, String str2) {
        boolean z10 = false;
        Map<String, String> l10 = k0.l(s.a("state", this.getInitializationState.invoke().toString()), s.a("operation", OperationType.LOAD.toString()));
        if (!(str == null || str.length() == 0)) {
            l10.put("reason", str);
        }
        if (str2 == null || str2.length() == 0) {
            z10 = true;
        }
        if (!z10) {
            l10.put("reason_debug", str2);
        }
        return l10;
    }

    static /* synthetic */ Map getTags$default(LegacyLoadUseCase legacyLoadUseCase, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return legacyLoadUseCase.getTags(str, str2);
    }

    private final AdObject getTmpAdObject() {
        i iVar = this.opportunity;
        if (iVar == null) {
            iVar = i.f27039b;
        }
        i iVar2 = iVar;
        m.d(iVar2, "opportunity ?: ByteString.EMPTY");
        String str = this.placement;
        if (str == null) {
            str = MaxReward.DEFAULT_LABEL;
        }
        String str2 = str;
        i iVar3 = i.f27039b;
        m.d(iVar3, "EMPTY");
        UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        if (unityAdsLoadOptions == null) {
            unityAdsLoadOptions = new UnityAdsLoadOptions();
        }
        return new AdObject(iVar2, str2, iVar3, (AdPlayer) null, (String) null, unityAdsLoadOptions, Boolean.valueOf(this.isHeaderBidding), getAdType(), 16, (h) null);
    }

    public static /* synthetic */ Object invoke$default(LegacyLoadUseCase legacyLoadUseCase, Context context, String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, d dVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            unityBannerSize = null;
        }
        return legacyLoadUseCase.invoke(context, str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize, dVar);
    }

    /* access modifiers changed from: private */
    public final Object loadFailure(LoadResult.Failure failure, d<? super sd.w> dVar) {
        DeviceLog.debug("Unity Ads Load Failure for placement: " + this.placement + " reason: " + failure.getError() + " :: " + failure.getMessage());
        SendDiagnosticEvent sendDiagnosticEvent2 = this.sendDiagnosticEvent;
        oe.i iVar = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_load_failure_time", iVar != null ? kotlin.coroutines.jvm.internal.b.b(TimeExtensionsKt.elapsedMillis(iVar)) : null, getTags(failure.getReason(), failure.getReasonDebug()), (Map) null, getTmpAdObject(), 8, (Object) null);
        Object g10 = pe.i.g(this.dispatcher, new LegacyLoadUseCase$loadFailure$2(this, failure, (d<? super LegacyLoadUseCase$loadFailure$2>) null), dVar);
        return g10 == d.c() ? g10 : sd.w.f38141a;
    }

    private final oe.i loadStart() {
        long a10 = j.f36786a.a();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_load_started", (Double) null, getTags$default(this, (String) null, (String) null, 3, (Object) null), (Map) null, getTmpAdObject(), 10, (Object) null);
        return j.a.c(a10);
    }

    /* access modifiers changed from: private */
    public final Object loadSuccess(AdObject adObject, d<? super sd.w> dVar) {
        DeviceLog.debug("Unity Ads Load Success for placement: " + this.placement);
        SendDiagnosticEvent sendDiagnosticEvent2 = this.sendDiagnosticEvent;
        oe.i iVar = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_load_success_time", iVar != null ? kotlin.coroutines.jvm.internal.b.b(TimeExtensionsKt.elapsedMillis(iVar)) : null, getTags$default(this, (String) null, (String) null, 3, (Object) null), (Map) null, adObject, 8, (Object) null);
        Object g10 = pe.i.g(this.dispatcher, new LegacyLoadUseCase$loadSuccess$2(this, (d<? super LegacyLoadUseCase$loadSuccess$2>) null), dVar);
        return g10 == d.c() ? g10 : sd.w.f38141a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.unity3d.ads.core.data.model.LoadResult} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.unity3d.ads.core.domain.LegacyLoadUseCase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.unity3d.ads.core.domain.LegacyLoadUseCase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: com.unity3d.ads.core.data.model.LoadResult$Failure} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: com.unity3d.ads.core.data.model.LoadResult$Failure} */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e1 A[Catch:{ all -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0109 A[Catch:{ all -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011e A[Catch:{ all -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x004b=Splitter:B:16:0x004b, B:39:0x00dd=Splitter:B:39:0x00dd} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(android.content.Context r27, java.lang.String r28, com.unity3d.ads.UnityAdsLoadOptions r29, com.unity3d.ads.IUnityAdsLoadListener r30, com.unity3d.services.banners.UnityBannerSize r31, xd.d<? super sd.w> r32) {
        /*
            r26 = this;
            r9 = r26
            r0 = r28
            r4 = r29
            r1 = r31
            r2 = r32
            boolean r3 = r2 instanceof com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$1
            if (r3 == 0) goto L_0x001d
            r3 = r2
            com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$1 r3 = (com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$1) r3
            int r5 = r3.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001d
            int r5 = r5 - r6
            r3.label = r5
            goto L_0x0022
        L_0x001d:
            com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$1 r3 = new com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$1
            r3.<init>(r9, r2)
        L_0x0022:
            r10 = r3
            java.lang.Object r2 = r10.result
            java.lang.Object r11 = yd.d.c()
            int r3 = r10.label
            r12 = 4
            r13 = 3
            r14 = 2
            r8 = 1
            if (r3 == 0) goto L_0x0067
            if (r3 == r8) goto L_0x0056
            if (r3 == r14) goto L_0x0050
            if (r3 == r13) goto L_0x0046
            if (r3 != r12) goto L_0x003e
            sd.p.b(r2)
            goto L_0x0155
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            java.lang.Object r0 = r10.L$0
            r1 = r0
            com.unity3d.ads.core.domain.LegacyLoadUseCase r1 = (com.unity3d.ads.core.domain.LegacyLoadUseCase) r1
        L_0x004b:
            sd.p.b(r2)     // Catch:{ all -> 0x0063 }
            goto L_0x0155
        L_0x0050:
            java.lang.Object r0 = r10.L$0
            r1 = r0
            com.unity3d.ads.core.domain.LegacyLoadUseCase r1 = (com.unity3d.ads.core.domain.LegacyLoadUseCase) r1
            goto L_0x004b
        L_0x0056:
            java.lang.Object r0 = r10.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r10.L$0
            com.unity3d.ads.core.domain.LegacyLoadUseCase r1 = (com.unity3d.ads.core.domain.LegacyLoadUseCase) r1
            sd.p.b(r2)     // Catch:{ all -> 0x0063 }
            goto L_0x00dd
        L_0x0063:
            r0 = move-exception
            r5 = r0
            goto L_0x0136
        L_0x0067:
            sd.p.b(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unity Ads Load Start for placement "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.unity3d.services.core.log.DeviceLog.debug(r2)
            java.lang.String r5 = r9.getAdMarkup(r4)
            com.unity3d.ads.core.data.repository.SessionRepository r2 = r9.sessionRepository
            vb.z1 r2 = r2.getNativeConfiguration()
            vb.w1 r2 = r2.l0()
            int r2 = r2.j0()
            long r6 = (long) r2
            vb.p r16 = r9.getBannerSize(r1)
            r2 = 0
            if (r5 == 0) goto L_0x00a1
            boolean r3 = ne.o.m(r5)
            if (r3 == 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r3 = 0
            goto L_0x00a2
        L_0x00a1:
            r3 = 1
        L_0x00a2:
            r3 = r3 ^ r8
            r9.isHeaderBidding = r3
            if (r1 == 0) goto L_0x00a8
            r2 = 1
        L_0x00a8:
            r9.isBanner = r2
            r1 = r30
            r9.listener = r1
            r9.placement = r0
            r9.loadOptions = r4
            oe.i r1 = r26.loadStart()
            r9.startTime = r1
            com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1 r3 = new com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1     // Catch:{ all -> 0x0133 }
            r17 = 0
            r1 = r3
            r2 = r28
            r12 = r3
            r3 = r26
            r4 = r29
            r13 = r6
            r6 = r27
            r7 = r16
            r15 = 1
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0133 }
            r10.L$0 = r9     // Catch:{ all -> 0x0133 }
            r10.L$1 = r0     // Catch:{ all -> 0x0133 }
            r10.label = r15     // Catch:{ all -> 0x0133 }
            java.lang.Object r2 = pe.g3.d(r13, r12, r10)     // Catch:{ all -> 0x0133 }
            if (r2 != r11) goto L_0x00dc
            return r11
        L_0x00dc:
            r1 = r9
        L_0x00dd:
            com.unity3d.ads.core.data.model.LoadResult r2 = (com.unity3d.ads.core.data.model.LoadResult) r2     // Catch:{ all -> 0x0063 }
            if (r2 != 0) goto L_0x0105
            com.unity3d.ads.core.data.model.LoadResult$Failure r2 = new com.unity3d.ads.core.data.model.LoadResult$Failure     // Catch:{ all -> 0x0063 }
            com.unity3d.ads.UnityAds$UnityAdsLoadError r19 = com.unity3d.ads.UnityAds.UnityAdsLoadError.TIMEOUT     // Catch:{ all -> 0x0063 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r3.<init>()     // Catch:{ all -> 0x0063 }
            java.lang.String r4 = "[UnityAds] Timeout while loading "
            r3.append(r4)     // Catch:{ all -> 0x0063 }
            r3.append(r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r20 = r3.toString()     // Catch:{ all -> 0x0063 }
            r21 = 0
            java.lang.String r22 = "timeout"
            r23 = 0
            r24 = 20
            r25 = 0
            r18 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0063 }
        L_0x0105:
            boolean r0 = r2 instanceof com.unity3d.ads.core.data.model.LoadResult.Success     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x011e
            com.unity3d.ads.core.data.model.LoadResult$Success r2 = (com.unity3d.ads.core.data.model.LoadResult.Success) r2     // Catch:{ all -> 0x0063 }
            com.unity3d.ads.core.data.model.AdObject r0 = r2.getAdObject()     // Catch:{ all -> 0x0063 }
            r10.L$0 = r1     // Catch:{ all -> 0x0063 }
            r2 = 0
            r10.L$1 = r2     // Catch:{ all -> 0x0063 }
            r2 = 2
            r10.label = r2     // Catch:{ all -> 0x0063 }
            java.lang.Object r0 = r1.loadSuccess(r0, r10)     // Catch:{ all -> 0x0063 }
            if (r0 != r11) goto L_0x0155
            return r11
        L_0x011e:
            boolean r0 = r2 instanceof com.unity3d.ads.core.data.model.LoadResult.Failure     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x0155
            com.unity3d.ads.core.data.model.LoadResult$Failure r2 = (com.unity3d.ads.core.data.model.LoadResult.Failure) r2     // Catch:{ all -> 0x0063 }
            r10.L$0 = r1     // Catch:{ all -> 0x0063 }
            r3 = 0
            r10.L$1 = r3     // Catch:{ all -> 0x0063 }
            r0 = 3
            r10.label = r0     // Catch:{ all -> 0x0063 }
            java.lang.Object r0 = r1.loadFailure(r2, r10)     // Catch:{ all -> 0x0063 }
            if (r0 != r11) goto L_0x0155
            return r11
        L_0x0133:
            r0 = move-exception
            r5 = r0
            r1 = r9
        L_0x0136:
            com.unity3d.ads.UnityAds$UnityAdsLoadError r3 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR
            java.lang.String r7 = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.retrieveUnityCrashValue(r5)
            com.unity3d.ads.core.data.model.LoadResult$Failure r0 = new com.unity3d.ads.core.data.model.LoadResult$Failure
            java.lang.String r4 = "Internal error"
            java.lang.String r6 = "uncaught_exception"
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            r2 = 0
            r10.L$0 = r2
            r10.L$1 = r2
            r2 = 4
            r10.label = r2
            java.lang.Object r0 = r1.loadFailure(r0, r10)
            if (r0 != r11) goto L_0x0155
            return r11
        L_0x0155:
            sd.w r0 = sd.w.f38141a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyLoadUseCase.invoke(android.content.Context, java.lang.String, com.unity3d.ads.UnityAdsLoadOptions, com.unity3d.ads.IUnityAdsLoadListener, com.unity3d.services.banners.UnityBannerSize, xd.d):java.lang.Object");
    }
}
