package r7;

import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p8.d0;
import u7.i;
import u7.r;
import u7.z;

/* compiled from: FieldFilter */
public class p extends q {

    /* renamed from: a  reason: collision with root package name */
    private final b f29981a;

    /* renamed from: b  reason: collision with root package name */
    private final d0 f29982b;

    /* renamed from: c  reason: collision with root package name */
    private final r f29983c;

    /* compiled from: FieldFilter */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29984a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                r7.p$b[] r0 = r7.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29984a = r0
                r7.p$b r1 = r7.p.b.LESS_THAN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29984a     // Catch:{ NoSuchFieldError -> 0x001d }
                r7.p$b r1 = r7.p.b.LESS_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29984a     // Catch:{ NoSuchFieldError -> 0x0028 }
                r7.p$b r1 = r7.p.b.EQUAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29984a     // Catch:{ NoSuchFieldError -> 0x0033 }
                r7.p$b r1 = r7.p.b.NOT_EQUAL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29984a     // Catch:{ NoSuchFieldError -> 0x003e }
                r7.p$b r1 = r7.p.b.GREATER_THAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29984a     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7.p$b r1 = r7.p.b.GREATER_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r7.p.a.<clinit>():void");
        }
    }

    /* compiled from: FieldFilter */
    public enum b {
        LESS_THAN("<"),
        LESS_THAN_OR_EQUAL("<="),
        EQUAL("=="),
        NOT_EQUAL("!="),
        GREATER_THAN(">"),
        GREATER_THAN_OR_EQUAL(">="),
        ARRAY_CONTAINS("array_contains"),
        ARRAY_CONTAINS_ANY("array_contains_any"),
        IN(ScarConstants.IN_SIGNAL_KEY),
        NOT_IN("not_in");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f29996a;

        private b(String str) {
            this.f29996a = str;
        }

        public String toString() {
            return this.f29996a;
        }
    }

    protected p(r rVar, b bVar, d0 d0Var) {
        this.f29983c = rVar;
        this.f29981a = bVar;
        this.f29982b = d0Var;
    }

    public static p e(r rVar, b bVar, d0 d0Var) {
        if (rVar.r()) {
            if (bVar == b.IN) {
                return new r0(rVar, d0Var);
            }
            if (bVar == b.NOT_IN) {
                return new s0(rVar, d0Var);
            }
            boolean z10 = (bVar == b.ARRAY_CONTAINS || bVar == b.ARRAY_CONTAINS_ANY) ? false : true;
            y7.b.d(z10, bVar.toString() + "queries don't make sense on document keys", new Object[0]);
            return new q0(rVar, bVar, d0Var);
        } else if (bVar == b.ARRAY_CONTAINS) {
            return new f(rVar, d0Var);
        } else {
            if (bVar == b.IN) {
                return new p0(rVar, d0Var);
            }
            if (bVar == b.ARRAY_CONTAINS_ANY) {
                return new e(rVar, d0Var);
            }
            if (bVar == b.NOT_IN) {
                return new x0(rVar, d0Var);
            }
            return new p(rVar, bVar, d0Var);
        }
    }

    public String a() {
        return f().d() + g().toString() + z.b(h());
    }

    public List<q> b() {
        return Collections.singletonList(this);
    }

    public List<p> c() {
        return Collections.singletonList(this);
    }

    public boolean d(i iVar) {
        d0 h10 = iVar.h(this.f29983c);
        if (this.f29981a == b.NOT_EQUAL) {
            if (h10 == null || !j(z.i(h10, this.f29982b))) {
                return false;
            }
            return true;
        } else if (h10 == null || z.G(h10) != z.G(this.f29982b) || !j(z.i(h10, this.f29982b))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f29981a != pVar.f29981a || !this.f29983c.equals(pVar.f29983c) || !this.f29982b.equals(pVar.f29982b)) {
            return false;
        }
        return true;
    }

    public r f() {
        return this.f29983c;
    }

    public b g() {
        return this.f29981a;
    }

    public d0 h() {
        return this.f29982b;
    }

    public int hashCode() {
        return ((((1147 + this.f29981a.hashCode()) * 31) + this.f29983c.hashCode()) * 31) + this.f29982b.hashCode();
    }

    public boolean i() {
        return Arrays.asList(new b[]{b.LESS_THAN, b.LESS_THAN_OR_EQUAL, b.GREATER_THAN, b.GREATER_THAN_OR_EQUAL, b.NOT_EQUAL, b.NOT_IN}).contains(this.f29981a);
    }

    /* access modifiers changed from: protected */
    public boolean j(int i10) {
        switch (a.f29984a[this.f29981a.ordinal()]) {
            case 1:
                if (i10 < 0) {
                    return true;
                }
                return false;
            case 2:
                if (i10 <= 0) {
                    return true;
                }
                return false;
            case 3:
                if (i10 == 0) {
                    return true;
                }
                return false;
            case 4:
                if (i10 != 0) {
                    return true;
                }
                return false;
            case 5:
                if (i10 > 0) {
                    return true;
                }
                return false;
            case 6:
                if (i10 >= 0) {
                    return true;
                }
                return false;
            default:
                throw y7.b.a("Unknown FieldFilter operator: %s", this.f29981a);
        }
    }

    public String toString() {
        return a();
    }
}
