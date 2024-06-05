package u0;

import androidx.concurrent.futures.c;
import fe.l;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import pe.x0;
import sd.w;
import w6.f;

/* compiled from: CoroutineAdapter.kt */
public final class b {

    /* compiled from: CoroutineAdapter.kt */
    static final class a extends n implements l<Throwable, w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.a<T> f22793a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ x0<T> f22794b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c.a<T> aVar, x0<? extends T> x0Var) {
            super(1);
            this.f22793a = aVar;
            this.f22794b = x0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return w.f38141a;
        }

        public final void invoke(Throwable th) {
            if (th == null) {
                this.f22793a.b(this.f22794b.n());
            } else if (th instanceof CancellationException) {
                this.f22793a.c();
            } else {
                this.f22793a.e(th);
            }
        }
    }

    public static final <T> f<T> b(x0<? extends T> x0Var, Object obj) {
        m.e(x0Var, "<this>");
        f<T> a10 = c.a(new a(x0Var, obj));
        m.d(a10, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return a10;
    }

    public static /* synthetic */ f c(x0 x0Var, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(x0Var, obj);
    }

    /* access modifiers changed from: private */
    public static final Object d(x0 x0Var, Object obj, c.a aVar) {
        m.e(x0Var, "$this_asListenableFuture");
        m.e(aVar, "completer");
        x0Var.u(new a(aVar, x0Var));
        return obj;
    }
}
