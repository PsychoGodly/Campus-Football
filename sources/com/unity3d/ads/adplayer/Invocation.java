package com.unity3d.ads.adplayer;

import fe.l;
import kotlin.jvm.internal.m;
import pe.c2;
import pe.q0;
import pe.r0;
import pe.x;
import pe.x0;
import pe.z;
import sd.w;
import xd.d;
import xd.g;

/* compiled from: Invocation.kt */
public final class Invocation {
    private final x<w> _isHandled = z.b((c2) null, 1, (Object) null);
    /* access modifiers changed from: private */
    public final x<Object> completableDeferred = z.b((c2) null, 1, (Object) null);
    private final String location;
    private final Object[] parameters;

    public Invocation(String str, Object[] objArr) {
        m.e(str, "location");
        m.e(objArr, "parameters");
        this.location = str;
        this.parameters = objArr;
    }

    public static /* synthetic */ Object handle$default(Invocation invocation, l lVar, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = new Invocation$handle$2((d<? super Invocation$handle$2>) null);
        }
        return invocation.handle(lVar, dVar);
    }

    public final String getLocation() {
        return this.location;
    }

    public final Object[] getParameters() {
        return this.parameters;
    }

    public final Object getResult(d<Object> dVar) {
        return this.completableDeferred.E0(dVar);
    }

    public final Object handle(l<? super d<Object>, ? extends Object> lVar, d<? super w> dVar) {
        x<w> xVar = this._isHandled;
        w wVar = w.f38141a;
        xVar.n0(wVar);
        c2 unused = k.d(q0.a(dVar.getContext()), (g) null, (r0) null, new Invocation$handle$3(lVar, this, (d<? super Invocation$handle$3>) null), 3, (Object) null);
        return wVar;
    }

    public final x0<w> isHandled() {
        return this._isHandled;
    }
}
