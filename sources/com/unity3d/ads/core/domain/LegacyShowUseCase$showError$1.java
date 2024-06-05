package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import fe.t;
import java.util.Map;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import oe.i;
import pe.k0;
import pe.p0;
import sd.p;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1", f = "LegacyShowUseCase.kt", l = {274}, m = "invokeSuspend")
/* compiled from: LegacyShowUseCase.kt */
final class LegacyShowUseCase$showError$1 extends l implements t<String, UnityAds.UnityAdsShowError, String, Integer, String, d<? super w>, Object> {
    final /* synthetic */ Listeners $listeners;
    final /* synthetic */ String $placement;
    final /* synthetic */ i $startTime;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    int label;
    final /* synthetic */ LegacyShowUseCase this$0;

    @f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1$1", f = "LegacyShowUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1$1  reason: invalid class name */
    /* compiled from: LegacyShowUseCase.kt */
    static final class AnonymousClass1 extends l implements fe.p<p0, d<? super w>, Object> {
        int label;

        public final d<w> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(listeners, str2, unityAdsShowError, str, dVar);
        }

        public final Object invoke(p0 p0Var, d<? super w> dVar) {
            return ((AnonymousClass1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                p.b(obj);
                listeners.onError(str2, unityAdsShowError, str);
                return w.f38141a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LegacyShowUseCase$showError$1(String str, LegacyShowUseCase legacyShowUseCase, i iVar, Listeners listeners, d<? super LegacyShowUseCase$showError$1> dVar) {
        super(6, dVar);
        this.$placement = str;
        this.this$0 = legacyShowUseCase;
        this.$startTime = iVar;
        this.$listeners = listeners;
    }

    public final Object invoke(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2, Integer num, String str3, d<? super w> dVar) {
        LegacyShowUseCase$showError$1 legacyShowUseCase$showError$1 = new LegacyShowUseCase$showError$1(this.$placement, this.this$0, this.$startTime, this.$listeners, dVar);
        legacyShowUseCase$showError$1.L$0 = str;
        legacyShowUseCase$showError$1.L$1 = unityAdsShowError;
        legacyShowUseCase$showError$1.L$2 = str2;
        legacyShowUseCase$showError$1.L$3 = num;
        legacyShowUseCase$showError$1.L$4 = str3;
        return legacyShowUseCase$showError$1.invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            p.b(obj);
            final UnityAds.UnityAdsShowError unityAdsShowError = (UnityAds.UnityAdsShowError) this.L$1;
            final String str = (String) this.L$2;
            DeviceLog.debug("Unity Ads Show Failed for placement " + this.$placement);
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.sendDiagnosticEvent, "native_show_failure_time", b.b(TimeExtensionsKt.elapsedMillis(this.$startTime)), this.this$0.getTags((String) this.L$0, (Integer) this.L$3, (String) this.L$4), (Map) null, this.this$0.adObject, 8, (Object) null);
            k0 access$getDispatcher$p = this.this$0.dispatcher;
            final Listeners listeners = this.$listeners;
            final String str2 = this.$placement;
            AnonymousClass1 r52 = new AnonymousClass1((d<? super AnonymousClass1>) null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
            if (pe.i.g(access$getDispatcher$p, r52, this) == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return w.f38141a;
    }
}
