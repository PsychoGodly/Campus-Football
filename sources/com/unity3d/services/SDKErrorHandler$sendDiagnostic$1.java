package com.unity3d.services;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import fe.p;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.s;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.SDKErrorHandler$sendDiagnostic$1", f = "SDKErrorHandler.kt", l = {}, m = "invokeSuspend")
/* compiled from: SDKErrorHandler.kt */
final class SDKErrorHandler$sendDiagnostic$1 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ String $name;
    final /* synthetic */ String $reason;
    final /* synthetic */ String $scopeName;
    int label;
    final /* synthetic */ SDKErrorHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SDKErrorHandler$sendDiagnostic$1(SDKErrorHandler sDKErrorHandler, String str, String str2, String str3, d<? super SDKErrorHandler$sendDiagnostic$1> dVar) {
        super(2, dVar);
        this.this$0 = sDKErrorHandler;
        this.$name = str;
        this.$reason = str2;
        this.$scopeName = str3;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new SDKErrorHandler$sendDiagnostic$1(this.this$0, this.$name, this.$reason, this.$scopeName, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((SDKErrorHandler$sendDiagnostic$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.sendDiagnosticEvent, this.$name, (Double) null, k0.j(s.a("reason", this.$reason), s.a("coroutine_name", this.$scopeName)), (Map) null, (AdObject) null, 26, (Object) null);
            return w.f38141a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
