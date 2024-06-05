package v;

import s.d;
import s.i;
import v.d;
import v.e;

/* compiled from: Guideline */
public class g extends e {
    protected float L0 = -1.0f;
    protected int M0 = -1;
    protected int N0 = -1;
    protected boolean O0 = true;
    private d P0 = this.P;
    private int Q0;
    private int R0;
    private boolean S0;

    /* compiled from: Guideline */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f23144a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                v.d$b[] r0 = v.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23144a = r0
                v.d$b r1 = v.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23144a     // Catch:{ NoSuchFieldError -> 0x001d }
                v.d$b r1 = v.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23144a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v.d$b r1 = v.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23144a     // Catch:{ NoSuchFieldError -> 0x0033 }
                v.d$b r1 = v.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f23144a     // Catch:{ NoSuchFieldError -> 0x003e }
                v.d$b r1 = v.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f23144a     // Catch:{ NoSuchFieldError -> 0x0049 }
                v.d$b r1 = v.d.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f23144a     // Catch:{ NoSuchFieldError -> 0x0054 }
                v.d$b r1 = v.d.b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f23144a     // Catch:{ NoSuchFieldError -> 0x0060 }
                v.d$b r1 = v.d.b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f23144a     // Catch:{ NoSuchFieldError -> 0x006c }
                v.d$b r1 = v.d.b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v.g.a.<clinit>():void");
        }
    }

    public g() {
        this.Q0 = 0;
        this.R0 = 0;
        this.X.clear();
        this.X.add(this.P0);
        int length = this.W.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.W[i10] = this.P0;
        }
    }

    public void g(d dVar, boolean z10) {
        f fVar = (f) I();
        if (fVar != null) {
            d m10 = fVar.m(d.b.LEFT);
            d m11 = fVar.m(d.b.RIGHT);
            e eVar = this.f23070a0;
            boolean z11 = true;
            boolean z12 = eVar != null && eVar.Z[0] == e.b.WRAP_CONTENT;
            if (this.Q0 == 0) {
                m10 = fVar.m(d.b.TOP);
                m11 = fVar.m(d.b.BOTTOM);
                e eVar2 = this.f23070a0;
                if (eVar2 == null || eVar2.Z[1] != e.b.WRAP_CONTENT) {
                    z11 = false;
                }
                z12 = z11;
            }
            if (this.S0 && this.P0.m()) {
                i q10 = dVar.q(this.P0);
                dVar.f(q10, this.P0.d());
                if (this.M0 != -1) {
                    if (z12) {
                        dVar.h(dVar.q(m11), q10, 0, 5);
                    }
                } else if (this.N0 != -1 && z12) {
                    i q11 = dVar.q(m11);
                    dVar.h(q10, dVar.q(m10), 0, 5);
                    dVar.h(q11, q10, 0, 5);
                }
                this.S0 = false;
            } else if (this.M0 != -1) {
                i q12 = dVar.q(this.P0);
                dVar.e(q12, dVar.q(m10), this.M0, 8);
                if (z12) {
                    dVar.h(dVar.q(m11), q12, 0, 5);
                }
            } else if (this.N0 != -1) {
                i q13 = dVar.q(this.P0);
                i q14 = dVar.q(m11);
                dVar.e(q13, q14, -this.N0, 8);
                if (z12) {
                    dVar.h(q13, dVar.q(m10), 0, 5);
                    dVar.h(q14, q13, 0, 5);
                }
            } else if (this.L0 != -1.0f) {
                dVar.d(s.d.s(dVar, dVar.q(this.P0), dVar.q(m11), this.L0));
            }
        }
    }

    public boolean h() {
        return true;
    }

    public boolean l0() {
        return this.S0;
    }

    public d m(d.b bVar) {
        int i10 = a.f23144a[bVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.Q0 == 1) {
                return this.P0;
            }
            return null;
        } else if ((i10 == 3 || i10 == 4) && this.Q0 == 0) {
            return this.P0;
        } else {
            return null;
        }
    }

    public boolean m0() {
        return this.S0;
    }

    public void n1(s.d dVar, boolean z10) {
        if (I() != null) {
            int x10 = dVar.x(this.P0);
            if (this.Q0 == 1) {
                j1(x10);
                k1(0);
                I0(I().v());
                h1(0);
                return;
            }
            j1(0);
            k1(x10);
            h1(I().U());
            I0(0);
        }
    }

    public d o1() {
        return this.P0;
    }

    public int p1() {
        return this.Q0;
    }

    public int q1() {
        return this.M0;
    }

    public int r1() {
        return this.N0;
    }

    public float s1() {
        return this.L0;
    }

    public void t1(int i10) {
        this.P0.s(i10);
        this.S0 = true;
    }

    public void u1(int i10) {
        if (i10 > -1) {
            this.L0 = -1.0f;
            this.M0 = i10;
            this.N0 = -1;
        }
    }

    public void v1(int i10) {
        if (i10 > -1) {
            this.L0 = -1.0f;
            this.M0 = -1;
            this.N0 = i10;
        }
    }

    public void w1(float f10) {
        if (f10 > -1.0f) {
            this.L0 = f10;
            this.M0 = -1;
            this.N0 = -1;
        }
    }

    public void x1(int i10) {
        if (this.Q0 != i10) {
            this.Q0 = i10;
            this.X.clear();
            if (this.Q0 == 1) {
                this.P0 = this.O;
            } else {
                this.P0 = this.P;
            }
            this.X.add(this.P0);
            int length = this.W.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.W[i11] = this.P0;
            }
        }
    }
}
