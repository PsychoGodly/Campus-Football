package s7;

import com.google.android.gms.common.api.a;
import com.google.protobuf.t1;
import java.util.Map;
import p8.b;
import p8.d0;
import u7.u;
import u7.z;

/* compiled from: FirestoreIndexValueWriter */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f30294a = new c();

    /* compiled from: FirestoreIndexValueWriter */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30295a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                p8.d0$c[] r0 = p8.d0.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30295a = r0
                p8.d0$c r1 = p8.d0.c.NULL_VALUE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30295a     // Catch:{ NoSuchFieldError -> 0x001d }
                p8.d0$c r1 = p8.d0.c.BOOLEAN_VALUE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30295a     // Catch:{ NoSuchFieldError -> 0x0028 }
                p8.d0$c r1 = p8.d0.c.DOUBLE_VALUE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30295a     // Catch:{ NoSuchFieldError -> 0x0033 }
                p8.d0$c r1 = p8.d0.c.INTEGER_VALUE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30295a     // Catch:{ NoSuchFieldError -> 0x003e }
                p8.d0$c r1 = p8.d0.c.TIMESTAMP_VALUE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30295a     // Catch:{ NoSuchFieldError -> 0x0049 }
                p8.d0$c r1 = p8.d0.c.STRING_VALUE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30295a     // Catch:{ NoSuchFieldError -> 0x0054 }
                p8.d0$c r1 = p8.d0.c.BYTES_VALUE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f30295a     // Catch:{ NoSuchFieldError -> 0x0060 }
                p8.d0$c r1 = p8.d0.c.REFERENCE_VALUE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f30295a     // Catch:{ NoSuchFieldError -> 0x006c }
                p8.d0$c r1 = p8.d0.c.GEO_POINT_VALUE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f30295a     // Catch:{ NoSuchFieldError -> 0x0078 }
                p8.d0$c r1 = p8.d0.c.MAP_VALUE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f30295a     // Catch:{ NoSuchFieldError -> 0x0084 }
                p8.d0$c r1 = p8.d0.c.ARRAY_VALUE     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s7.c.a.<clinit>():void");
        }
    }

    private c() {
    }

    private void a(b bVar, b bVar2) {
        i(bVar2, 50);
        for (d0 f10 : bVar.g()) {
            f(f10, bVar2);
        }
    }

    private void b(String str, b bVar) {
        i(bVar, 37);
        u p10 = u.p(str);
        int k10 = p10.k();
        for (int i10 = 5; i10 < k10; i10++) {
            String h10 = p10.h(i10);
            i(bVar, 60);
            h(h10, bVar);
        }
    }

    private void c(p8.u uVar, b bVar) {
        i(bVar, 55);
        for (Map.Entry next : uVar.i0().entrySet()) {
            d((String) next.getKey(), bVar);
            f((d0) next.getValue(), bVar);
        }
    }

    private void d(String str, b bVar) {
        i(bVar, 25);
        h(str, bVar);
    }

    private void f(d0 d0Var, b bVar) {
        switch (a.f30295a[d0Var.B0().ordinal()]) {
            case 1:
                i(bVar, 5);
                return;
            case 2:
                i(bVar, 10);
                bVar.d(d0Var.r0() ? 1 : 0);
                return;
            case 3:
                double u02 = d0Var.u0();
                if (Double.isNaN(u02)) {
                    i(bVar, 13);
                    return;
                }
                i(bVar, 15);
                if (u02 == -0.0d) {
                    bVar.b(0.0d);
                    return;
                } else {
                    bVar.b(u02);
                    return;
                }
            case 4:
                i(bVar, 15);
                bVar.b((double) d0Var.w0());
                return;
            case 5:
                t1 A0 = d0Var.A0();
                i(bVar, 20);
                bVar.d(A0.j0());
                bVar.d((long) A0.i0());
                return;
            case 6:
                d(d0Var.z0(), bVar);
                g(bVar);
                return;
            case 7:
                i(bVar, 30);
                bVar.a(d0Var.s0());
                g(bVar);
                return;
            case 8:
                b(d0Var.y0(), bVar);
                return;
            case 9:
                u8.a v02 = d0Var.v0();
                i(bVar, 45);
                bVar.b(v02.i0());
                bVar.b(v02.j0());
                return;
            case 10:
                if (z.x(d0Var)) {
                    i(bVar, a.e.API_PRIORITY_OTHER);
                    return;
                }
                c(d0Var.x0(), bVar);
                g(bVar);
                return;
            case 11:
                a(d0Var.q0(), bVar);
                g(bVar);
                return;
            default:
                throw new IllegalArgumentException("unknown index value type " + d0Var.B0());
        }
    }

    private void g(b bVar) {
        bVar.d(2);
    }

    private void h(String str, b bVar) {
        bVar.e(str);
    }

    private void i(b bVar, int i10) {
        bVar.d((long) i10);
    }

    public void e(d0 d0Var, b bVar) {
        f(d0Var, bVar);
        bVar.c();
    }
}
