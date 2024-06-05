package sd;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: LazyJVM.kt */
class i {

    /* compiled from: LazyJVM.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f38121a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                sd.k[] r0 = sd.k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                sd.k r1 = sd.k.SYNCHRONIZED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                sd.k r1 = sd.k.PUBLICATION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                sd.k r1 = sd.k.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f38121a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sd.i.a.<clinit>():void");
        }
    }

    public static <T> g<T> a(fe.a<? extends T> aVar) {
        m.e(aVar, "initializer");
        return new r(aVar, (Object) null, 2, (h) null);
    }

    public static <T> g<T> b(k kVar, fe.a<? extends T> aVar) {
        m.e(kVar, "mode");
        m.e(aVar, "initializer");
        int i10 = a.f38121a[kVar.ordinal()];
        if (i10 == 1) {
            return new r(aVar, (Object) null, 2, (h) null);
        }
        if (i10 == 2) {
            return new q(aVar);
        }
        if (i10 == 3) {
            return new x(aVar);
        }
        throw new l();
    }
}
