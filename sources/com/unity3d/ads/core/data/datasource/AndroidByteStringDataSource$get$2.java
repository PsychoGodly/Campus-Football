package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.i;
import defpackage.a;
import defpackage.c;
import fe.q;
import h0.a;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import sd.p;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$get$2", f = "AndroidByteStringDataSource.kt", l = {18}, m = "invokeSuspend")
/* compiled from: AndroidByteStringDataSource.kt */
final class AndroidByteStringDataSource$get$2 extends l implements q<se.f<? super c>, Throwable, d<? super w>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    AndroidByteStringDataSource$get$2(d<? super AndroidByteStringDataSource$get$2> dVar) {
        super(3, dVar);
    }

    public final Object invoke(se.f<? super c> fVar, Throwable th, d<? super w> dVar) {
        AndroidByteStringDataSource$get$2 androidByteStringDataSource$get$2 = new AndroidByteStringDataSource$get$2(dVar);
        androidByteStringDataSource$get$2.L$0 = fVar;
        androidByteStringDataSource$get$2.L$1 = th;
        return androidByteStringDataSource$get$2.invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            p.b(obj);
            se.f fVar = (se.f) this.L$0;
            Throwable th = (Throwable) this.L$1;
            if (th instanceof a) {
                a.C0254a aVar = a.f24247b;
                c.a i02 = c.i0();
                m.d(i02, "newBuilder()");
                a a10 = aVar.a(i02);
                i iVar = i.f27039b;
                m.d(iVar, "EMPTY");
                a10.b(iVar);
                c a11 = a10.a();
                this.L$0 = null;
                this.label = 1;
                if (fVar.emit(a11, this) == c10) {
                    return c10;
                }
            } else {
                throw th;
            }
        } else if (i10 == 1) {
            p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return w.f38141a;
    }
}
