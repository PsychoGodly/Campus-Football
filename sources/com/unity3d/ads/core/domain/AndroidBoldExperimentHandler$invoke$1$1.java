package com.unity3d.ads.core.domain;

import com.google.protobuf.i;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.AndroidBoldExperimentHandler$invoke$1$1", f = "AndroidBoldExperimentHandler.kt", l = {28}, m = "invokeSuspend")
/* compiled from: AndroidBoldExperimentHandler.kt */
final class AndroidBoldExperimentHandler$invoke$1$1 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ String $it;
    int label;
    final /* synthetic */ AndroidBoldExperimentHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidBoldExperimentHandler$invoke$1$1(AndroidBoldExperimentHandler androidBoldExperimentHandler, String str, d<? super AndroidBoldExperimentHandler$invoke$1$1> dVar) {
        super(2, dVar);
        this.this$0 = androidBoldExperimentHandler;
        this.$it = str;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidBoldExperimentHandler$invoke$1$1(this.this$0, this.$it, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((AndroidBoldExperimentHandler$invoke$1$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            ByteStringDataSource access$getGatewayCacheDataSource$p = this.this$0.gatewayCacheDataSource;
            i fromBase64 = ProtobufExtensionsKt.fromBase64(this.$it);
            this.label = 1;
            if (access$getGatewayCacheDataSource$p.set(fromBase64, this) == c10) {
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
