package com.unity3d.ads.core.data.repository;

import fe.q;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import sd.n;
import sd.p;
import sd.s;
import sd.w;
import vb.z1;
import xd.d;

@f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$persistedNativeConfiguration$1", f = "AndroidSessionRepository.kt", l = {}, m = "invokeSuspend")
/* compiled from: AndroidSessionRepository.kt */
final class AndroidSessionRepository$persistedNativeConfiguration$1 extends l implements q<z1, Boolean, d<? super n<? extends z1, ? extends Boolean>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    AndroidSessionRepository$persistedNativeConfiguration$1(d<? super AndroidSessionRepository$persistedNativeConfiguration$1> dVar) {
        super(3, dVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((z1) obj, ((Boolean) obj2).booleanValue(), (d<? super n<z1, Boolean>>) (d) obj3);
    }

    public final Object invoke(z1 z1Var, boolean z10, d<? super n<z1, Boolean>> dVar) {
        AndroidSessionRepository$persistedNativeConfiguration$1 androidSessionRepository$persistedNativeConfiguration$1 = new AndroidSessionRepository$persistedNativeConfiguration$1(dVar);
        androidSessionRepository$persistedNativeConfiguration$1.L$0 = z1Var;
        androidSessionRepository$persistedNativeConfiguration$1.Z$0 = z10;
        return androidSessionRepository$persistedNativeConfiguration$1.invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            p.b(obj);
            return s.a((z1) this.L$0, b.a(this.Z$0));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
