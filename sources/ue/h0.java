package ue;

import fe.l;
import kotlin.coroutines.jvm.internal.e;
import pe.a;
import pe.g0;
import xd.d;
import xd.g;

/* compiled from: Scopes.kt */
public class h0<T> extends a<T> implements e {

    /* renamed from: d  reason: collision with root package name */
    public final d<T> f38806d;

    public h0(g gVar, d<? super T> dVar) {
        super(gVar, true, true);
        this.f38806d = dVar;
    }

    /* access modifiers changed from: protected */
    public void P0(Object obj) {
        d<T> dVar = this.f38806d;
        dVar.resumeWith(g0.a(obj, dVar));
    }

    /* access modifiers changed from: protected */
    public final boolean d0() {
        return true;
    }

    public final e getCallerFrame() {
        d<T> dVar = this.f38806d;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void x(Object obj) {
        m.c(c.b(this.f38806d), g0.a(obj, this.f38806d), (l) null, 2, (Object) null);
    }
}
