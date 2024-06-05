package com.unity3d.ads.core.data.repository;

import com.google.protobuf.i;
import com.unity3d.ads.core.data.model.OMResult;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.h;
import pe.p0;
import sd.w;
import x9.a;
import x9.b;
import xd.d;

@f(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$impressionOccurred$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
/* compiled from: AndroidOpenMeasurementRepository.kt */
final class AndroidOpenMeasurementRepository$impressionOccurred$2 extends l implements p<p0, d<? super OMResult>, Object> {
    final /* synthetic */ i $opportunityId;
    final /* synthetic */ boolean $signalLoaded;
    int label;
    final /* synthetic */ AndroidOpenMeasurementRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidOpenMeasurementRepository$impressionOccurred$2(AndroidOpenMeasurementRepository androidOpenMeasurementRepository, i iVar, boolean z10, d<? super AndroidOpenMeasurementRepository$impressionOccurred$2> dVar) {
        super(2, dVar);
        this.this$0 = androidOpenMeasurementRepository;
        this.$opportunityId = iVar;
        this.$signalLoaded = z10;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidOpenMeasurementRepository$impressionOccurred$2(this.this$0, this.$opportunityId, this.$signalLoaded, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super OMResult> dVar) {
        return ((AndroidOpenMeasurementRepository$impressionOccurred$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            b access$getSession = this.this$0.getSession(this.$opportunityId);
            if (access$getSession == null) {
                return new OMResult.Failure("om_session_not_found", (String) null, 2, (h) null);
            }
            a createAdEvents = this.this$0.omidManager.createAdEvents(access$getSession);
            if (this.$signalLoaded) {
                createAdEvents.c();
            }
            createAdEvents.b();
            return OMResult.Success.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
