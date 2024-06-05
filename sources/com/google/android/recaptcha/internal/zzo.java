package com.google.android.recaptcha.internal;

import fe.p;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzo extends l implements p {
    zzo(d dVar) {
        super(2, dVar);
    }

    public final d create(Object obj, d dVar) {
        return new zzo(dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        p0 p0Var = (p0) obj;
        return new zzo((d) obj2).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        sd.p.b(obj);
        Thread.currentThread().setPriority(8);
        return w.f38141a;
    }
}
