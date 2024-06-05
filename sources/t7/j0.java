package t7;

import g7.e;
import java.util.ArrayList;
import r7.m;
import r7.x1;
import u7.l;

/* compiled from: LocalViewChanges */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f30461a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f30462b;

    /* renamed from: c  reason: collision with root package name */
    private final e<l> f30463c;

    /* renamed from: d  reason: collision with root package name */
    private final e<l> f30464d;

    /* compiled from: LocalViewChanges */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30465a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                r7.m$a[] r0 = r7.m.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30465a = r0
                r7.m$a r1 = r7.m.a.ADDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30465a     // Catch:{ NoSuchFieldError -> 0x001d }
                r7.m$a r1 = r7.m.a.REMOVED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t7.j0.a.<clinit>():void");
        }
    }

    public j0(int i10, boolean z10, e<l> eVar, e<l> eVar2) {
        this.f30461a = i10;
        this.f30462b = z10;
        this.f30463c = eVar;
        this.f30464d = eVar2;
    }

    public static j0 a(int i10, x1 x1Var) {
        e eVar = new e(new ArrayList(), l.a());
        e eVar2 = new e(new ArrayList(), l.a());
        for (m next : x1Var.d()) {
            int i11 = a.f30465a[next.c().ordinal()];
            if (i11 == 1) {
                eVar = eVar.e(next.b().getKey());
            } else if (i11 == 2) {
                eVar2 = eVar2.e(next.b().getKey());
            }
        }
        return new j0(i10, x1Var.k(), eVar, eVar2);
    }

    public e<l> b() {
        return this.f30463c;
    }

    public e<l> c() {
        return this.f30464d;
    }

    public int d() {
        return this.f30461a;
    }

    public boolean e() {
        return this.f30462b;
    }
}
