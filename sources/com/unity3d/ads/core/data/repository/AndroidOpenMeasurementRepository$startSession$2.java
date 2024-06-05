package com.unity3d.ads.core.data.repository;

import android.webkit.WebView;
import com.google.protobuf.i;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import fe.p;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.h;
import pe.p0;
import sd.w;
import x9.b;
import x9.c;
import x9.k;
import xd.d;

@f(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
/* compiled from: AndroidOpenMeasurementRepository.kt */
final class AndroidOpenMeasurementRepository$startSession$2 extends l implements p<p0, d<? super OMResult>, Object> {
    final /* synthetic */ i $opportunityId;
    final /* synthetic */ OmidOptions $options;
    final /* synthetic */ WebView $webView;
    int label;
    final /* synthetic */ AndroidOpenMeasurementRepository this$0;

    /* compiled from: AndroidOpenMeasurementRepository.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                x9.f[] r0 = x9.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                x9.f r1 = x9.f.HTML_DISPLAY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                x9.f r1 = x9.f.VIDEO     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidOpenMeasurementRepository$startSession$2(AndroidOpenMeasurementRepository androidOpenMeasurementRepository, i iVar, OmidOptions omidOptions, WebView webView, d<? super AndroidOpenMeasurementRepository$startSession$2> dVar) {
        super(2, dVar);
        this.this$0 = androidOpenMeasurementRepository;
        this.$opportunityId = iVar;
        this.$options = omidOptions;
        this.$webView = webView;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidOpenMeasurementRepository$startSession$2(this.this$0, this.$opportunityId, this.$options, this.$webView, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super OMResult> dVar) {
        return ((AndroidOpenMeasurementRepository$startSession$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        x9.d dVar;
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            try {
                if (!this.this$0.isOMActive()) {
                    new OMResult.Failure("om_not_active", (String) null, 2, (h) null);
                }
                if (((Map) this.this$0.activeSessions.getValue()).containsKey(ProtobufExtensionsKt.toISO8859String(this.$opportunityId))) {
                    new OMResult.Failure("om_session_already_exists", (String) null, 2, (h) null);
                }
                x9.f creativeType = this.$options.getCreativeType();
                if (creativeType == null) {
                    return new OMResult.Failure("om_creative_type_null", (String) null, 2, (h) null);
                }
                OmidManager access$getOmidManager$p = this.this$0.omidManager;
                x9.i impressionType = this.$options.getImpressionType();
                if (impressionType == null) {
                    impressionType = x9.i.DEFINED_BY_JAVASCRIPT;
                }
                x9.i iVar = impressionType;
                k impressionOwner = this.$options.getImpressionOwner();
                if (impressionOwner == null) {
                    impressionOwner = k.JAVASCRIPT;
                }
                k kVar = impressionOwner;
                k videoEventsOwner = this.$options.getVideoEventsOwner();
                if (videoEventsOwner == null) {
                    videoEventsOwner = k.JAVASCRIPT;
                }
                c createAdSessionConfiguration = access$getOmidManager$p.createAdSessionConfiguration(creativeType, iVar, kVar, videoEventsOwner, this.$options.getIsolateVerificationScripts());
                int i10 = WhenMappings.$EnumSwitchMapping$0[creativeType.ordinal()];
                if (i10 == 1) {
                    dVar = this.this$0.omidManager.createHtmlAdSessionContext(this.this$0.partner, this.$webView, (String) null, this.$options.getCustomReferenceData());
                } else if (i10 != 2) {
                    return new OMResult.Failure("om_creative_type_invalid", (String) null, 2, (h) null);
                } else {
                    dVar = this.this$0.omidManager.createJavaScriptAdSessionContext(this.this$0.partner, this.$webView, (String) null, this.$options.getCustomReferenceData());
                }
                b createAdSession = this.this$0.omidManager.createAdSession(createAdSessionConfiguration, dVar);
                createAdSession.c(this.$webView);
                createAdSession.d();
                this.this$0.addSession(this.$opportunityId, createAdSession);
                return OMResult.Success.INSTANCE;
            } catch (Throwable th) {
                return new OMResult.Failure("uncaught_exception", String.valueOf(th.getMessage()));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
