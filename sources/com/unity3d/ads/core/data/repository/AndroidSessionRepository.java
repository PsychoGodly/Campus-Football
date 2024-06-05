package com.unity3d.ads.core.data.repository;

import com.google.protobuf.i;
import com.google.protobuf.z;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import fe.p;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import pe.c2;
import pe.p0;
import pe.q0;
import pe.r0;
import re.a;
import sd.s;
import sd.w;
import se.b0;
import se.e;
import se.k0;
import se.u;
import se.v;
import se.z;
import vb.v2;
import vb.x2;
import vb.y1;
import vb.z1;
import xd.d;
import xd.g;

/* compiled from: AndroidSessionRepository.kt */
public final class AndroidSessionRepository implements SessionRepository {
    private final v<i> _currentState;
    private v<String> _gameId = k0.a(ClientProperties.getGameId());
    private final v<String> _gatewayUrl;
    private final v<Integer> _headerBiddingTokenCounter;
    private final v<InitializationState> _initializationState;
    private final v<Boolean> _isTestModeEnabled;
    private u<SessionChange> _onChange;
    /* access modifiers changed from: private */
    public final v<z1> _sdkConfiguration;
    private final v<x2> _sessionCounters;
    private final v<i> _sessionId;
    private final v<i> _sessionToken;
    private final v<Boolean> _shouldInitialize;
    private final ByteStringDataSource fsmDataSource;
    private final ByteStringDataSource gatewayCacheDataSource;
    /* access modifiers changed from: private */
    public final v<Boolean> isInit;
    /* access modifiers changed from: private */
    public final ByteStringDataSource nativeConfigDataSource;
    private final z<SessionChange> onChange;
    /* access modifiers changed from: private */
    public final e<z1> persistedNativeConfiguration;
    private final ByteStringDataSource privacyDataSource;

    @f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$1", f = "AndroidSessionRepository.kt", l = {47}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$1  reason: invalid class name */
    /* compiled from: AndroidSessionRepository.kt */
    static final class AnonymousClass1 extends l implements p<p0, d<? super w>, Object> {
        int label;
        final /* synthetic */ AndroidSessionRepository this$0;

        {
            this.this$0 = r1;
        }

        public final d<w> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, sendDiagnosticEvent, dVar);
        }

        public final Object invoke(p0 p0Var, d<? super w> dVar) {
            return ((AnonymousClass1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                sd.p.b(obj);
                ByteStringDataSource access$getNativeConfigDataSource$p = this.this$0.nativeConfigDataSource;
                this.label = 1;
                obj = access$getNativeConfigDataSource$p.get(this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                try {
                    sd.p.b(obj);
                } catch (Exception e10) {
                    SendDiagnosticEvent sendDiagnosticEvent = sendDiagnosticEvent;
                    String message = e10.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_initialize_missed_native_parsing", (Double) null, j0.e(s.a("debugReason", message)), (Map) null, (AdObject) null, 26, (Object) null);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i g02 = ((c) obj).g0();
            if (!g02.isEmpty()) {
                v access$get_sdkConfiguration$p = this.this$0._sdkConfiguration;
                z1 x02 = z1.x0(g02);
                m.d(x02, "parseFrom(data)");
                access$get_sdkConfiguration$p.setValue(x02);
            }
            this.this$0.isInit.setValue(b.a(true));
            return w.f38141a;
        }
    }

    public AndroidSessionRepository(ByteStringDataSource byteStringDataSource, ByteStringDataSource byteStringDataSource2, ByteStringDataSource byteStringDataSource3, ByteStringDataSource byteStringDataSource4, z1 z1Var, pe.k0 k0Var, final SendDiagnosticEvent sendDiagnosticEvent) {
        m.e(byteStringDataSource, "gatewayCacheDataSource");
        m.e(byteStringDataSource2, "privacyDataSource");
        m.e(byteStringDataSource3, "fsmDataSource");
        m.e(byteStringDataSource4, "nativeConfigDataSource");
        m.e(z1Var, "defaultNativeConfiguration");
        m.e(k0Var, "dispatcher");
        m.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.gatewayCacheDataSource = byteStringDataSource;
        this.privacyDataSource = byteStringDataSource2;
        this.fsmDataSource = byteStringDataSource3;
        this.nativeConfigDataSource = byteStringDataSource4;
        v<z1> a10 = k0.a(z1Var);
        this._sdkConfiguration = a10;
        v<Boolean> a11 = k0.a(Boolean.FALSE);
        this.isInit = a11;
        c2 unused = k.d(q0.a(k0Var), (g) null, (r0) null, new AnonymousClass1(this, (d<? super AnonymousClass1>) null), 3, (Object) null);
        this.persistedNativeConfiguration = new AndroidSessionRepository$special$$inlined$map$1(new AndroidSessionRepository$special$$inlined$filter$1(se.g.s(a10, a11, new AndroidSessionRepository$persistedNativeConfiguration$1((d<? super AndroidSessionRepository$persistedNativeConfiguration$1>) null))));
        u<SessionChange> b10 = b0.b(0, 0, (a) null, 7, (Object) null);
        this._onChange = b10;
        this.onChange = se.g.a(b10);
        UUID randomUUID = UUID.randomUUID();
        m.d(randomUUID, "randomUUID()");
        this._sessionId = k0.a(ProtobufExtensionsKt.toByteString(randomUUID));
        this._isTestModeEnabled = k0.a(Boolean.valueOf(SdkProperties.isTestMode()));
        com.google.protobuf.z s10 = x2.q0().build();
        m.d(s10, "newBuilder().build()");
        this._sessionCounters = k0.a(s10);
        i iVar = i.f27039b;
        m.d(iVar, "EMPTY");
        this._sessionToken = k0.a(iVar);
        m.d(iVar, "EMPTY");
        this._currentState = k0.a(iVar);
        this._gatewayUrl = k0.a(UnityAdsConstants.DefaultUrls.GATEWAY_URL);
        this._initializationState = k0.a(InitializationState.NOT_INITIALIZED);
        this._headerBiddingTokenCounter = k0.a(0);
        this._shouldInitialize = k0.a(Boolean.TRUE);
    }

    public y1 getFeatureFlags() {
        y1 s02 = getNativeConfiguration().s0();
        m.d(s02, "nativeConfiguration.featureFlags");
        return s02;
    }

    public String getGameId() {
        String value;
        String gameId;
        v<String> vVar = this._gameId;
        do {
            value = vVar.getValue();
            String str = value;
            gameId = ClientProperties.getGameId();
        } while (!vVar.a(value, gameId));
        return gameId;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getGatewayCache(xd.d<? super com.google.protobuf.i> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sd.p.b(r5)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            sd.p.b(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.gatewayCacheDataSource
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            c r5 = (defpackage.c) r5
            com.google.protobuf.i r5 = r5.g0()
            java.lang.String r0 = "gatewayCacheDataSource.get().data"
            kotlin.jvm.internal.m.d(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.getGatewayCache(xd.d):java.lang.Object");
    }

    public i getGatewayState() {
        return this._currentState.getValue();
    }

    public String getGatewayUrl() {
        return this._gatewayUrl.getValue();
    }

    public int getHeaderBiddingTokenCounter() {
        Integer value;
        Number number;
        v<Integer> vVar = this._headerBiddingTokenCounter;
        do {
            value = vVar.getValue();
            number = value;
        } while (!vVar.a(value, Integer.valueOf(number.intValue() + 1)));
        return number.intValue();
    }

    public InitializationState getInitializationState() {
        return this._initializationState.getValue();
    }

    public z1 getNativeConfiguration() {
        if (!this.isInit.getValue().booleanValue()) {
            return (z1) j.b((g) null, new AndroidSessionRepository$nativeConfiguration$1(this, (d<? super AndroidSessionRepository$nativeConfiguration$1>) null), 1, (Object) null);
        }
        return this._sdkConfiguration.getValue();
    }

    public e<InitializationState> getObserveInitializationState() {
        return this._initializationState;
    }

    public z<SessionChange> getOnChange() {
        return this.onChange;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getPrivacy(xd.d<? super com.google.protobuf.i> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sd.p.b(r5)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            sd.p.b(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.privacyDataSource
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            c r5 = (defpackage.c) r5
            com.google.protobuf.i r5 = r5.g0()
            java.lang.String r0 = "privacyDataSource.get().data"
            kotlin.jvm.internal.m.d(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacy(xd.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getPrivacyFsm(xd.d<? super com.google.protobuf.i> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sd.p.b(r5)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            sd.p.b(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.fsmDataSource
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            c r5 = (defpackage.c) r5
            com.google.protobuf.i r5 = r5.g0()
            java.lang.String r0 = "fsmDataSource.get().data"
            kotlin.jvm.internal.m.d(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacyFsm(xd.d):java.lang.Object");
    }

    public x2 getSessionCounters() {
        return this._sessionCounters.getValue();
    }

    public i getSessionId() {
        return this._sessionId.getValue();
    }

    public i getSessionToken() {
        return this._sessionToken.getValue();
    }

    public boolean getShouldInitialize() {
        return this._shouldInitialize.getValue().booleanValue();
    }

    public void incrementBannerImpressionCount() {
        x2 value;
        v2 a10;
        v<x2> vVar = this._sessionCounters;
        do {
            value = vVar.getValue();
            v2.a aVar = v2.f39102b;
            z.a d02 = value.b();
            m.d(d02, "this.toBuilder()");
            a10 = aVar.a((x2.a) d02);
            a10.g(a10.b() + 1);
        } while (!vVar.a(value, a10.a()));
    }

    public void incrementBannerLoadRequestAdmCount() {
        x2 value;
        v2 a10;
        v<x2> vVar = this._sessionCounters;
        do {
            value = vVar.getValue();
            v2.a aVar = v2.f39102b;
            z.a d02 = value.b();
            m.d(d02, "this.toBuilder()");
            a10 = aVar.a((x2.a) d02);
            a10.i(a10.d() + 1);
        } while (!vVar.a(value, a10.a()));
    }

    public void incrementBannerLoadRequestCount() {
        x2 value;
        v2 a10;
        v<x2> vVar = this._sessionCounters;
        do {
            value = vVar.getValue();
            v2.a aVar = v2.f39102b;
            z.a d02 = value.b();
            m.d(d02, "this.toBuilder()");
            a10 = aVar.a((x2.a) d02);
            a10.h(a10.c() + 1);
        } while (!vVar.a(value, a10.a()));
    }

    public void incrementLoadRequestAdmCount() {
        x2 value;
        v2 a10;
        v<x2> vVar = this._sessionCounters;
        do {
            value = vVar.getValue();
            v2.a aVar = v2.f39102b;
            z.a d02 = value.b();
            m.d(d02, "this.toBuilder()");
            a10 = aVar.a((x2.a) d02);
            a10.k(a10.f() + 1);
        } while (!vVar.a(value, a10.a()));
    }

    public void incrementLoadRequestCount() {
        x2 value;
        v2 a10;
        v<x2> vVar = this._sessionCounters;
        do {
            value = vVar.getValue();
            v2.a aVar = v2.f39102b;
            z.a d02 = value.b();
            m.d(d02, "this.toBuilder()");
            a10 = aVar.a((x2.a) d02);
            a10.j(a10.e() + 1);
        } while (!vVar.a(value, a10.a()));
    }

    public boolean isDiagnosticsEnabled() {
        return getNativeConfiguration().p0().m0();
    }

    public boolean isOmEnabled() {
        return getNativeConfiguration().r0();
    }

    public boolean isSdkInitialized() {
        return getInitializationState() == InitializationState.INITIALIZED;
    }

    public boolean isTestModeEnabled() {
        Boolean value;
        Boolean valueOf;
        v<Boolean> vVar = this._isTestModeEnabled;
        do {
            value = vVar.getValue();
            value.booleanValue();
            valueOf = Boolean.valueOf(SdkProperties.isTestMode());
        } while (!vVar.a(value, valueOf));
        return valueOf.booleanValue();
    }

    public Object persistNativeConfiguration(d<? super w> dVar) {
        ByteStringDataSource byteStringDataSource = this.nativeConfigDataSource;
        i e10 = getNativeConfiguration().e();
        m.d(e10, "nativeConfiguration.toByteString()");
        Object obj = byteStringDataSource.set(e10, dVar);
        return obj == d.c() ? obj : w.f38141a;
    }

    public void setGameId(String str) {
        String value;
        v<String> vVar = this._gameId;
        do {
            value = vVar.getValue();
            String str2 = value;
            ClientProperties.setGameId(str);
        } while (!vVar.a(value, str));
    }

    public Object setGatewayCache(i iVar, d<? super w> dVar) {
        Object obj = this.gatewayCacheDataSource.set(iVar, dVar);
        return obj == d.c() ? obj : w.f38141a;
    }

    public void setGatewayState(i iVar) {
        i value;
        m.e(iVar, "value");
        v<i> vVar = this._currentState;
        do {
            value = vVar.getValue();
            i iVar2 = value;
        } while (!vVar.a(value, iVar));
    }

    public void setGatewayUrl(String str) {
        String value;
        m.e(str, "value");
        v<String> vVar = this._gatewayUrl;
        do {
            value = vVar.getValue();
            String str2 = value;
        } while (!vVar.a(value, str));
    }

    public void setInitializationState(InitializationState initializationState) {
        InitializationState value;
        m.e(initializationState, "value");
        v<InitializationState> vVar = this._initializationState;
        do {
            value = vVar.getValue();
            InitializationState initializationState2 = value;
        } while (!vVar.a(value, initializationState));
    }

    public void setNativeConfiguration(z1 z1Var) {
        z1 value;
        m.e(z1Var, "value");
        v<z1> vVar = this._sdkConfiguration;
        do {
            value = vVar.getValue();
            z1 z1Var2 = value;
        } while (!vVar.a(value, z1Var));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object setPrivacy(com.google.protobuf.i r6, xd.d<? super sd.w> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            sd.p.b(r7)
            goto L_0x0068
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.L$1
            com.google.protobuf.i r6 = (com.google.protobuf.i) r6
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.data.repository.AndroidSessionRepository r2 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository) r2
            sd.p.b(r7)
            goto L_0x0053
        L_0x0040:
            sd.p.b(r7)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r7 = r5.privacyDataSource
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.set(r6, r0)
            if (r7 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r2 = r5
        L_0x0053:
            se.u<com.unity3d.ads.core.data.model.SessionChange> r7 = r2._onChange
            com.unity3d.ads.core.data.model.SessionChange$UserConsentChange r2 = new com.unity3d.ads.core.data.model.SessionChange$UserConsentChange
            r2.<init>(r6)
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = r7.emit(r2, r0)
            if (r6 != r1) goto L_0x0068
            return r1
        L_0x0068:
            sd.w r6 = sd.w.f38141a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacy(com.google.protobuf.i, xd.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object setPrivacyFsm(com.google.protobuf.i r6, xd.d<? super sd.w> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            sd.p.b(r7)
            goto L_0x0068
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.L$1
            com.google.protobuf.i r6 = (com.google.protobuf.i) r6
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.data.repository.AndroidSessionRepository r2 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository) r2
            sd.p.b(r7)
            goto L_0x0053
        L_0x0040:
            sd.p.b(r7)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r7 = r5.fsmDataSource
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.set(r6, r0)
            if (r7 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r2 = r5
        L_0x0053:
            se.u<com.unity3d.ads.core.data.model.SessionChange> r7 = r2._onChange
            com.unity3d.ads.core.data.model.SessionChange$PrivacyFsmChange r2 = new com.unity3d.ads.core.data.model.SessionChange$PrivacyFsmChange
            r2.<init>(r6)
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = r7.emit(r2, r0)
            if (r6 != r1) goto L_0x0068
            return r1
        L_0x0068:
            sd.w r6 = sd.w.f38141a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacyFsm(com.google.protobuf.i, xd.d):java.lang.Object");
    }

    public void setSessionCounters(x2 x2Var) {
        x2 value;
        m.e(x2Var, "value");
        v<x2> vVar = this._sessionCounters;
        do {
            value = vVar.getValue();
            x2 x2Var2 = value;
        } while (!vVar.a(value, x2Var));
    }

    public void setSessionToken(i iVar) {
        i value;
        m.e(iVar, "value");
        v<i> vVar = this._sessionToken;
        do {
            value = vVar.getValue();
            i iVar2 = value;
        } while (!vVar.a(value, iVar));
    }

    public void setShouldInitialize(boolean z10) {
        Boolean value;
        v<Boolean> vVar = this._shouldInitialize;
        do {
            value = vVar.getValue();
            value.booleanValue();
        } while (!vVar.a(value, Boolean.valueOf(z10)));
    }
}
