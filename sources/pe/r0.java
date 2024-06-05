package pe;

import fe.l;
import fe.p;
import ve.b;
import xd.d;
import xd.f;

/* compiled from: CoroutineStart.kt */
public enum r0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* compiled from: CoroutineStart.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f37393a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                pe.r0[] r0 = pe.r0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                pe.r0 r1 = pe.r0.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                pe.r0 r1 = pe.r0.ATOMIC     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                pe.r0 r1 = pe.r0.UNDISPATCHED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                pe.r0 r1 = pe.r0.LAZY     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f37393a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pe.r0.a.<clinit>():void");
        }
    }

    public final <R, T> void c(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        int i10 = a.f37393a[ordinal()];
        if (i10 == 1) {
            ve.a.d(pVar, r10, dVar, (l) null, 4, (Object) null);
        } else if (i10 == 2) {
            f.a(pVar, r10, dVar);
        } else if (i10 == 3) {
            b.a(pVar, r10, dVar);
        } else if (i10 != 4) {
            throw new sd.l();
        }
    }

    public final boolean d() {
        return this == LAZY;
    }
}
