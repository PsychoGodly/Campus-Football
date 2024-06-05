package te;

import fe.p;
import kotlin.coroutines.jvm.internal.l;
import sd.w;
import se.f;
import ue.p0;
import xd.d;
import xd.g;

/* compiled from: ChannelFlow.kt */
final class z<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final g f38722a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f38723b;

    /* renamed from: c  reason: collision with root package name */
    private final p<T, d<? super w>, Object> f38724c;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {212}, m = "invokeSuspend")
    /* compiled from: ChannelFlow.kt */
    static final class a extends l implements p<T, d<? super w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f38725a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f38726b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f<T> f38727c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f<? super T> fVar, d<? super a> dVar) {
            super(2, dVar);
            this.f38727c = fVar;
        }

        public final d<w> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f38727c, dVar);
            aVar.f38726b = obj;
            return aVar;
        }

        /* renamed from: d */
        public final Object invoke(T t10, d<? super w> dVar) {
            return ((a) create(t10, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f38725a;
            if (i10 == 0) {
                sd.p.b(obj);
                Object obj2 = this.f38726b;
                f<T> fVar = this.f38727c;
                this.f38725a = 1;
                if (fVar.emit(obj2, this) == c10) {
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

    public z(f<? super T> fVar, g gVar) {
        this.f38722a = gVar;
        this.f38723b = p0.b(gVar);
        this.f38724c = new a(fVar, (d<? super a>) null);
    }

    public Object emit(T t10, d<? super w> dVar) {
        Object b10 = f.b(this.f38722a, t10, this.f38723b, this.f38724c, dVar);
        return b10 == d.c() ? b10 : w.f38141a;
    }
}
