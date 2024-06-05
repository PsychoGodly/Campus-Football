package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.Invocation;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2", f = "HandleInvocationsFromAdViewer.kt", l = {134}, m = "invokeSuspend")
/* compiled from: HandleInvocationsFromAdViewer.kt */
final class HandleInvocationsFromAdViewer$invoke$2 extends l implements p<se.f<? super Invocation>, d<? super w>, Object> {
    final /* synthetic */ fe.l<d<? super w>, Object> $onSubscription;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HandleInvocationsFromAdViewer$invoke$2(fe.l<? super d<? super w>, ? extends Object> lVar, d<? super HandleInvocationsFromAdViewer$invoke$2> dVar) {
        super(2, dVar);
        this.$onSubscription = lVar;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new HandleInvocationsFromAdViewer$invoke$2(this.$onSubscription, dVar);
    }

    public final Object invoke(se.f<? super Invocation> fVar, d<? super w> dVar) {
        return ((HandleInvocationsFromAdViewer$invoke$2) create(fVar, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            fe.l<d<? super w>, Object> lVar = this.$onSubscription;
            this.label = 1;
            if (lVar.invoke(this) == c10) {
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
