package te;

import androidx.recyclerview.widget.RecyclerView;
import fe.p;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import pe.c2;
import ue.h0;
import xd.g;

/* compiled from: SafeCollector.common.kt */
public final class v {

    /* compiled from: SafeCollector.common.kt */
    static final class a extends n implements p<Integer, g.b, Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t<?> f38718a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(t<?> tVar) {
            super(2);
            this.f38718a = tVar;
        }

        public final Integer a(int i10, g.b bVar) {
            g.c key = bVar.getKey();
            g.b bVar2 = this.f38718a.f38711b.get(key);
            if (key != c2.B1) {
                return Integer.valueOf(bVar != bVar2 ? RecyclerView.UNDEFINED_DURATION : i10 + 1);
            }
            c2 c2Var = (c2) bVar2;
            m.c(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            c2 b10 = v.b((c2) bVar, c2Var);
            if (b10 == c2Var) {
                if (c2Var != null) {
                    i10++;
                }
                return Integer.valueOf(i10);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b10 + ", expected child of " + c2Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public static final void a(t<?> tVar, g gVar) {
        if (((Number) gVar.fold(0, new a(tVar))).intValue() != tVar.f38712c) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + tVar.f38711b + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    public static final c2 b(c2 c2Var, c2 c2Var2) {
        while (c2Var != null) {
            if (c2Var == c2Var2 || !(c2Var instanceof h0)) {
                return c2Var;
            }
            c2Var = c2Var.getParent();
        }
        return null;
    }
}
