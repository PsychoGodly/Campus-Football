package com.unity3d.ads.core.data.repository;

import android.content.Context;
import com.unity3d.ads.core.data.model.OMResult;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.h;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
/* compiled from: AndroidOpenMeasurementRepository.kt */
final class AndroidOpenMeasurementRepository$activateOM$2 extends l implements p<p0, d<? super OMResult>, Object> {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ AndroidOpenMeasurementRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidOpenMeasurementRepository$activateOM$2(AndroidOpenMeasurementRepository androidOpenMeasurementRepository, Context context, d<? super AndroidOpenMeasurementRepository$activateOM$2> dVar) {
        super(2, dVar);
        this.this$0 = androidOpenMeasurementRepository;
        this.$context = context;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidOpenMeasurementRepository$activateOM$2(this.this$0, this.$context, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super OMResult> dVar) {
        return ((AndroidOpenMeasurementRepository$activateOM$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            if (this.this$0.isOMActive()) {
                new OMResult.Failure("om_already_active", (String) null, 2, (h) null);
            }
            try {
                this.this$0.omidManager.activate(this.$context);
                AndroidOpenMeasurementRepository androidOpenMeasurementRepository = this.this$0;
                androidOpenMeasurementRepository.setOMActive(androidOpenMeasurementRepository.omidManager.isActive());
                if (this.this$0.isOMActive()) {
                    return OMResult.Success.INSTANCE;
                }
                return new OMResult.Failure("om_activate_failure_time", (String) null, 2, (h) null);
            } catch (Throwable th) {
                return new OMResult.Failure("uncaught_exception", String.valueOf(th.getMessage()));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
