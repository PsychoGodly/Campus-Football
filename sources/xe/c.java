package xe;

import fe.l;
import fe.q;
import kotlin.jvm.internal.n;
import pe.o;
import sd.w;
import ue.l0;

/* compiled from: Select.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final q<Object, Object, Object, Object> f39363a = a.f39369a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final l0 f39364b = new l0("STATE_REG");
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final l0 f39365c = new l0("STATE_COMPLETED");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final l0 f39366d = new l0("STATE_CANCELLED");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final l0 f39367e = new l0("NO_RESULT");

    /* renamed from: f  reason: collision with root package name */
    private static final l0 f39368f = new l0("PARAM_CLAUSE_0");

    /* compiled from: Select.kt */
    static final class a extends n implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final a f39369a = new a();

        a() {
            super(3);
        }

        /* renamed from: a */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static final d a(int i10) {
        if (i10 == 0) {
            return d.SUCCESSFUL;
        }
        if (i10 == 1) {
            return d.REREGISTER;
        }
        if (i10 == 2) {
            return d.CANCELLED;
        }
        if (i10 == 3) {
            return d.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    /* access modifiers changed from: private */
    public static final boolean h(o<? super w> oVar, l<? super Throwable, w> lVar) {
        Object k10 = oVar.k(w.f38141a, (Object) null, lVar);
        if (k10 == null) {
            return false;
        }
        oVar.r(k10);
        return true;
    }
}
