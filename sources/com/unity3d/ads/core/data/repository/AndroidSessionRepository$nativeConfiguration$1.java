package com.unity3d.ads.core.data.repository;

import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import se.e;
import se.g;
import vb.z1;
import xd.d;

@f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$nativeConfiguration$1", f = "AndroidSessionRepository.kt", l = {131}, m = "invokeSuspend")
/* compiled from: AndroidSessionRepository.kt */
final class AndroidSessionRepository$nativeConfiguration$1 extends l implements p<p0, d<? super z1>, Object> {
    int label;
    final /* synthetic */ AndroidSessionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidSessionRepository$nativeConfiguration$1(AndroidSessionRepository androidSessionRepository, d<? super AndroidSessionRepository$nativeConfiguration$1> dVar) {
        super(2, dVar);
        this.this$0 = androidSessionRepository;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidSessionRepository$nativeConfiguration$1(this.this$0, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super z1> dVar) {
        return ((AndroidSessionRepository$nativeConfiguration$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            e access$getPersistedNativeConfiguration$p = this.this$0.persistedNativeConfiguration;
            this.label = 1;
            obj = g.q(access$getPersistedNativeConfiguration$p, this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            sd.p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
