package te;

import fe.q;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.m;
import sd.w;
import se.f;
import xd.d;

/* compiled from: SafeCollector.kt */
public final class u {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final q<f<Object>, Object, d<? super w>, Object> f38716a;

    /* compiled from: SafeCollector.kt */
    /* synthetic */ class a extends k implements q<f<? super Object>, Object, d<? super w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f38717a = new a();

        a() {
            super(3, f.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* renamed from: b */
        public final Object invoke(f<Object> fVar, Object obj, d<? super w> dVar) {
            return fVar.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.f38717a;
        m.c(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f38716a = (q) c0.b(aVar, 3);
    }
}
