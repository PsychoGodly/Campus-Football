package androidx.lifecycle;

import androidx.lifecycle.i;
import fe.a;
import kotlin.jvm.internal.m;
import pe.o;
import sd.o;
import sd.p;

/* compiled from: WithLifecycleState.kt */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements m {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i.b f3874a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i f3875b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ o<Object> f3876c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a<Object> f3877d;

    public void onStateChanged(p pVar, i.a aVar) {
        Object obj;
        m.e(pVar, "source");
        m.e(aVar, "event");
        if (aVar == i.a.Companion.c(this.f3874a)) {
            this.f3875b.d(this);
            o<Object> oVar = this.f3876c;
            a<Object> aVar2 = this.f3877d;
            try {
                o.a aVar3 = sd.o.f38128b;
                obj = sd.o.b(aVar2.invoke());
            } catch (Throwable th) {
                o.a aVar4 = sd.o.f38128b;
                obj = sd.o.b(p.a(th));
            }
            oVar.resumeWith(obj);
        } else if (aVar == i.a.ON_DESTROY) {
            this.f3875b.d(this);
            pe.o<Object> oVar2 = this.f3876c;
            o.a aVar5 = sd.o.f38128b;
            oVar2.resumeWith(sd.o.b(p.a(new k())));
        }
    }
}
