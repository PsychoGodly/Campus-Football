package v;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import v.d;
import w.c;
import w.f;
import w.l;
import w.n;
import w.p;

/* compiled from: ConstraintWidget */
public class e {
    public static float K0 = 0.5f;
    public int A = 0;
    int A0;
    public float B = 1.0f;
    boolean B0;
    public int C = 0;
    boolean C0;
    public int D = 0;
    public float[] D0;
    public float E = 1.0f;
    protected e[] E0;
    int F = -1;
    protected e[] F0;
    float G = 1.0f;
    e G0;
    private int[] H = {a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER};
    e H0;
    private float I = 0.0f;
    public int I0;
    private boolean J = false;
    public int J0;
    private boolean K;
    private boolean L = false;
    private int M = 0;
    private int N = 0;
    public d O = new d(this, d.b.LEFT);
    public d P = new d(this, d.b.TOP);
    public d Q = new d(this, d.b.RIGHT);
    public d R = new d(this, d.b.BOTTOM);
    public d S = new d(this, d.b.BASELINE);
    d T = new d(this, d.b.CENTER_X);
    d U = new d(this, d.b.CENTER_Y);
    public d V;
    public d[] W;
    protected ArrayList<d> X;
    private boolean[] Y;
    public b[] Z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f23069a = false;

    /* renamed from: a0  reason: collision with root package name */
    public e f23070a0;

    /* renamed from: b  reason: collision with root package name */
    public p[] f23071b = new p[2];

    /* renamed from: b0  reason: collision with root package name */
    int f23072b0;

    /* renamed from: c  reason: collision with root package name */
    public c f23073c;

    /* renamed from: c0  reason: collision with root package name */
    int f23074c0;

    /* renamed from: d  reason: collision with root package name */
    public c f23075d;

    /* renamed from: d0  reason: collision with root package name */
    public float f23076d0;

    /* renamed from: e  reason: collision with root package name */
    public l f23077e = null;

    /* renamed from: e0  reason: collision with root package name */
    protected int f23078e0;

    /* renamed from: f  reason: collision with root package name */
    public n f23079f = null;

    /* renamed from: f0  reason: collision with root package name */
    protected int f23080f0;

    /* renamed from: g  reason: collision with root package name */
    public boolean[] f23081g = {true, true};

    /* renamed from: g0  reason: collision with root package name */
    protected int f23082g0;

    /* renamed from: h  reason: collision with root package name */
    boolean f23083h = false;

    /* renamed from: h0  reason: collision with root package name */
    int f23084h0;

    /* renamed from: i  reason: collision with root package name */
    private boolean f23085i = true;

    /* renamed from: i0  reason: collision with root package name */
    int f23086i0;

    /* renamed from: j  reason: collision with root package name */
    private boolean f23087j = false;

    /* renamed from: j0  reason: collision with root package name */
    protected int f23088j0;

    /* renamed from: k  reason: collision with root package name */
    private boolean f23089k = true;

    /* renamed from: k0  reason: collision with root package name */
    protected int f23090k0;

    /* renamed from: l  reason: collision with root package name */
    private int f23091l = -1;

    /* renamed from: l0  reason: collision with root package name */
    int f23092l0;

    /* renamed from: m  reason: collision with root package name */
    private int f23093m = -1;

    /* renamed from: m0  reason: collision with root package name */
    protected int f23094m0;

    /* renamed from: n  reason: collision with root package name */
    public u.a f23095n = new u.a(this);

    /* renamed from: n0  reason: collision with root package name */
    protected int f23096n0;

    /* renamed from: o  reason: collision with root package name */
    public String f23097o;

    /* renamed from: o0  reason: collision with root package name */
    float f23098o0;

    /* renamed from: p  reason: collision with root package name */
    private boolean f23099p = false;

    /* renamed from: p0  reason: collision with root package name */
    float f23100p0;

    /* renamed from: q  reason: collision with root package name */
    private boolean f23101q = false;

    /* renamed from: q0  reason: collision with root package name */
    private Object f23102q0;

    /* renamed from: r  reason: collision with root package name */
    private boolean f23103r = false;

    /* renamed from: r0  reason: collision with root package name */
    private int f23104r0;

    /* renamed from: s  reason: collision with root package name */
    private boolean f23105s = false;

    /* renamed from: s0  reason: collision with root package name */
    private int f23106s0;

    /* renamed from: t  reason: collision with root package name */
    public int f23107t = -1;

    /* renamed from: t0  reason: collision with root package name */
    private boolean f23108t0;

    /* renamed from: u  reason: collision with root package name */
    public int f23109u = -1;

    /* renamed from: u0  reason: collision with root package name */
    private String f23110u0;

    /* renamed from: v  reason: collision with root package name */
    private int f23111v = 0;

    /* renamed from: v0  reason: collision with root package name */
    private String f23112v0;

    /* renamed from: w  reason: collision with root package name */
    public int f23113w = 0;

    /* renamed from: w0  reason: collision with root package name */
    boolean f23114w0;

    /* renamed from: x  reason: collision with root package name */
    public int f23115x = 0;

    /* renamed from: x0  reason: collision with root package name */
    boolean f23116x0;

    /* renamed from: y  reason: collision with root package name */
    public int[] f23117y = new int[2];

    /* renamed from: y0  reason: collision with root package name */
    boolean f23118y0;

    /* renamed from: z  reason: collision with root package name */
    public int f23119z = 0;

    /* renamed from: z0  reason: collision with root package name */
    int f23120z0;

    /* compiled from: ConstraintWidget */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f23121a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f23122b;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        static {
            /*
                v.e$b[] r0 = v.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23122b = r0
                r1 = 1
                v.e$b r2 = v.e.b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f23122b     // Catch:{ NoSuchFieldError -> 0x001d }
                v.e$b r3 = v.e.b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f23122b     // Catch:{ NoSuchFieldError -> 0x0028 }
                v.e$b r4 = v.e.b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f23122b     // Catch:{ NoSuchFieldError -> 0x0033 }
                v.e$b r5 = v.e.b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                v.d$b[] r4 = v.d.b.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f23121a = r4
                v.d$b r5 = v.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f23121a     // Catch:{ NoSuchFieldError -> 0x004e }
                v.d$b r4 = v.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f23121a     // Catch:{ NoSuchFieldError -> 0x0058 }
                v.d$b r1 = v.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f23121a     // Catch:{ NoSuchFieldError -> 0x0062 }
                v.d$b r1 = v.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f23121a     // Catch:{ NoSuchFieldError -> 0x006d }
                v.d$b r1 = v.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f23121a     // Catch:{ NoSuchFieldError -> 0x0078 }
                v.d$b r1 = v.d.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f23121a     // Catch:{ NoSuchFieldError -> 0x0083 }
                v.d$b r1 = v.d.b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f23121a     // Catch:{ NoSuchFieldError -> 0x008f }
                v.d$b r1 = v.d.b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f23121a     // Catch:{ NoSuchFieldError -> 0x009b }
                v.d$b r1 = v.d.b.NONE     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v.e.a.<clinit>():void");
        }
    }

    /* compiled from: ConstraintWidget */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.V = dVar;
        this.W = new d[]{this.O, this.Q, this.P, this.R, this.S, dVar};
        this.X = new ArrayList<>();
        this.Y = new boolean[2];
        b bVar = b.FIXED;
        this.Z = new b[]{bVar, bVar};
        this.f23070a0 = null;
        this.f23072b0 = 0;
        this.f23074c0 = 0;
        this.f23076d0 = 0.0f;
        this.f23078e0 = -1;
        this.f23080f0 = 0;
        this.f23082g0 = 0;
        this.f23084h0 = 0;
        this.f23086i0 = 0;
        this.f23088j0 = 0;
        this.f23090k0 = 0;
        this.f23092l0 = 0;
        float f10 = K0;
        this.f23098o0 = f10;
        this.f23100p0 = f10;
        this.f23104r0 = 0;
        this.f23106s0 = 0;
        this.f23108t0 = false;
        this.f23110u0 = null;
        this.f23112v0 = null;
        this.f23118y0 = false;
        this.f23120z0 = 0;
        this.A0 = 0;
        this.D0 = new float[]{-1.0f, -1.0f};
        this.E0 = new e[]{null, null};
        this.F0 = new e[]{null, null};
        this.G0 = null;
        this.H0 = null;
        this.I0 = -1;
        this.J0 = -1;
        d();
    }

    private void N(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11) {
        sb2.append(str);
        sb2.append(" :  {\n");
        v0(sb2, "      size", i10, 0);
        v0(sb2, "      min", i11, 0);
        v0(sb2, "      max", i12, a.e.API_PRIORITY_OTHER);
        v0(sb2, "      matchMin", i14, 0);
        v0(sb2, "      matchDef", i15, 0);
        u0(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    private void O(StringBuilder sb2, String str, d dVar) {
        if (dVar.f23054f != null) {
            sb2.append("    ");
            sb2.append(str);
            sb2.append(" : [ '");
            sb2.append(dVar.f23054f);
            sb2.append("'");
            if (!(dVar.f23056h == Integer.MIN_VALUE && dVar.f23055g == 0)) {
                sb2.append(",");
                sb2.append(dVar.f23055g);
                if (dVar.f23056h != Integer.MIN_VALUE) {
                    sb2.append(",");
                    sb2.append(dVar.f23056h);
                    sb2.append(",");
                }
            }
            sb2.append(" ] ,\n");
        }
    }

    private void d() {
        this.X.add(this.O);
        this.X.add(this.P);
        this.X.add(this.Q);
        this.X.add(this.R);
        this.X.add(this.T);
        this.X.add(this.U);
        this.X.add(this.V);
        this.X.add(this.S);
    }

    private boolean d0(int i10) {
        int i11 = i10 * 2;
        d[] dVarArr = this.W;
        if (!(dVarArr[i11].f23054f == null || dVarArr[i11].f23054f.f23054f == dVarArr[i11])) {
            int i12 = i11 + 1;
            return dVarArr[i12].f23054f != null && dVarArr[i12].f23054f.f23054f == dVarArr[i12];
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:262:0x046d, code lost:
        if ((r4 instanceof v.a) != false) goto L_0x0472;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01e5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0458 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0459  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0527 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x055e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:377:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:381:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i(s.d r37, boolean r38, boolean r39, boolean r40, boolean r41, s.i r42, s.i r43, v.e.b r44, boolean r45, v.d r46, v.d r47, int r48, int r49, int r50, int r51, float r52, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57, int r58, int r59, int r60, int r61, float r62, boolean r63) {
        /*
            r36 = this;
            r0 = r36
            r10 = r37
            r11 = r42
            r12 = r43
            r13 = r46
            r14 = r47
            r15 = r50
            r1 = r51
            r2 = r59
            r3 = r60
            r4 = r61
            s.i r9 = r10.q(r13)
            s.i r8 = r10.q(r14)
            v.d r5 = r46.i()
            s.i r7 = r10.q(r5)
            v.d r5 = r47.i()
            s.i r6 = r10.q(r5)
            s.d.w()
            boolean r16 = r46.n()
            boolean r17 = r47.n()
            v.d r5 = r0.V
            boolean r18 = r5.n()
            if (r17 == 0) goto L_0x0044
            int r5 = r16 + 1
            goto L_0x0046
        L_0x0044:
            r5 = r16
        L_0x0046:
            if (r18 == 0) goto L_0x004a
            int r5 = r5 + 1
        L_0x004a:
            if (r53 == 0) goto L_0x004f
            r19 = 3
            goto L_0x0051
        L_0x004f:
            r19 = r58
        L_0x0051:
            int[] r20 = v.e.a.f23122b
            int r21 = r44.ordinal()
            r12 = r20[r21]
            r2 = 1
            if (r12 == r2) goto L_0x0065
            r2 = 2
            if (r12 == r2) goto L_0x0065
            r2 = 3
            if (r12 == r2) goto L_0x0065
            r2 = 4
            if (r12 == r2) goto L_0x006a
        L_0x0065:
            r12 = r19
        L_0x0067:
            r19 = 0
            goto L_0x0070
        L_0x006a:
            r12 = r19
            if (r12 == r2) goto L_0x0067
            r19 = 1
        L_0x0070:
            int r2 = r0.f23091l
            r14 = -1
            if (r2 == r14) goto L_0x007d
            if (r38 == 0) goto L_0x007d
            r0.f23091l = r14
            r49 = r2
            r19 = 0
        L_0x007d:
            int r2 = r0.f23093m
            if (r2 == r14) goto L_0x0088
            if (r38 != 0) goto L_0x0088
            r0.f23093m = r14
            r19 = 0
            goto L_0x008a
        L_0x0088:
            r2 = r49
        L_0x008a:
            int r14 = r0.f23106s0
            r49 = r2
            r2 = 8
            if (r14 != r2) goto L_0x0096
            r14 = 0
            r19 = 0
            goto L_0x0098
        L_0x0096:
            r14 = r49
        L_0x0098:
            if (r63 == 0) goto L_0x00b6
            if (r16 != 0) goto L_0x00a6
            if (r17 != 0) goto L_0x00a6
            if (r18 != 0) goto L_0x00a6
            r2 = r48
            r10.f(r9, r2)
            goto L_0x00b6
        L_0x00a6:
            if (r16 == 0) goto L_0x00b6
            if (r17 != 0) goto L_0x00b6
            int r2 = r46.e()
            r24 = r6
            r6 = 8
            r10.e(r9, r7, r2, r6)
            goto L_0x00ba
        L_0x00b6:
            r24 = r6
            r6 = 8
        L_0x00ba:
            if (r19 != 0) goto L_0x00e5
            if (r45 == 0) goto L_0x00d3
            r2 = 3
            r6 = 0
            r10.e(r8, r9, r6, r2)
            r2 = 8
            if (r15 <= 0) goto L_0x00ca
            r10.h(r8, r9, r15, r2)
        L_0x00ca:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r6) goto L_0x00d8
            r10.j(r8, r9, r1, r2)
            goto L_0x00d8
        L_0x00d3:
            r2 = 8
            r10.e(r8, r9, r14, r2)
        L_0x00d8:
            r1 = r5
            r2 = r7
            r14 = r8
            r25 = r19
            r15 = r24
            r19 = r41
        L_0x00e1:
            r24 = r3
            goto L_0x01e3
        L_0x00e5:
            r1 = 2
            if (r5 == r1) goto L_0x0108
            if (r53 != 0) goto L_0x0108
            r1 = 1
            if (r12 == r1) goto L_0x00ef
            if (r12 != 0) goto L_0x0108
        L_0x00ef:
            int r1 = java.lang.Math.max(r3, r14)
            if (r4 <= 0) goto L_0x00f9
            int r1 = java.lang.Math.min(r4, r1)
        L_0x00f9:
            r2 = 8
            r10.e(r8, r9, r1, r2)
            r19 = r41
            r1 = r5
            r2 = r7
            r14 = r8
            r15 = r24
            r25 = 0
            goto L_0x00e1
        L_0x0108:
            r1 = -2
            if (r3 != r1) goto L_0x010d
            r2 = r14
            goto L_0x010e
        L_0x010d:
            r2 = r3
        L_0x010e:
            if (r4 != r1) goto L_0x0112
            r1 = r14
            goto L_0x0113
        L_0x0112:
            r1 = r4
        L_0x0113:
            if (r14 <= 0) goto L_0x0119
            r3 = 1
            if (r12 == r3) goto L_0x0119
            r14 = 0
        L_0x0119:
            if (r2 <= 0) goto L_0x0124
            r3 = 8
            r10.h(r8, r9, r2, r3)
            int r14 = java.lang.Math.max(r14, r2)
        L_0x0124:
            if (r1 <= 0) goto L_0x013d
            if (r39 == 0) goto L_0x012d
            r3 = 1
            if (r12 != r3) goto L_0x012d
            r3 = 0
            goto L_0x012e
        L_0x012d:
            r3 = 1
        L_0x012e:
            if (r3 == 0) goto L_0x0136
            r3 = 8
            r10.j(r8, r9, r1, r3)
            goto L_0x0138
        L_0x0136:
            r3 = 8
        L_0x0138:
            int r14 = java.lang.Math.min(r14, r1)
            goto L_0x013f
        L_0x013d:
            r3 = 8
        L_0x013f:
            r4 = 1
            if (r12 != r4) goto L_0x0167
            if (r39 == 0) goto L_0x0148
            r10.e(r8, r9, r14, r3)
            goto L_0x0159
        L_0x0148:
            if (r55 == 0) goto L_0x0152
            r4 = 5
            r10.e(r8, r9, r14, r4)
            r10.j(r8, r9, r14, r3)
            goto L_0x0159
        L_0x0152:
            r4 = 5
            r10.e(r8, r9, r14, r4)
            r10.j(r8, r9, r14, r3)
        L_0x0159:
            r4 = r1
            r1 = r5
            r14 = r8
            r25 = r19
            r15 = r24
            r19 = r41
            r24 = r2
            r2 = r7
            goto L_0x01e3
        L_0x0167:
            r3 = 2
            if (r12 != r3) goto L_0x01d2
            v.d$b r3 = r46.j()
            v.d$b r4 = v.d.b.TOP
            if (r3 == r4) goto L_0x0194
            v.d$b r3 = r46.j()
            v.d$b r6 = v.d.b.BOTTOM
            if (r3 != r6) goto L_0x017b
            goto L_0x0194
        L_0x017b:
            v.e r3 = r0.f23070a0
            v.d$b r4 = v.d.b.LEFT
            v.d r3 = r3.m(r4)
            s.i r3 = r10.q(r3)
            v.e r4 = r0.f23070a0
            v.d$b r6 = v.d.b.RIGHT
            v.d r4 = r4.m(r6)
            s.i r4 = r10.q(r4)
            goto L_0x01aa
        L_0x0194:
            v.e r3 = r0.f23070a0
            v.d r3 = r3.m(r4)
            s.i r3 = r10.q(r3)
            v.e r4 = r0.f23070a0
            v.d$b r6 = v.d.b.BOTTOM
            v.d r4 = r4.m(r6)
            s.i r4 = r10.q(r4)
        L_0x01aa:
            r14 = r3
            r6 = r4
            s.b r3 = r37.r()
            r4 = r8
            r45 = r1
            r1 = r5
            r5 = r9
            r15 = r24
            r51 = r2
            r2 = r7
            r7 = r14
            r14 = r8
            r8 = r62
            s.b r3 = r3.k(r4, r5, r6, r7, r8)
            r10.d(r3)
            if (r39 == 0) goto L_0x01c9
            r19 = 0
        L_0x01c9:
            r4 = r45
            r24 = r51
            r25 = r19
            r19 = r41
            goto L_0x01e3
        L_0x01d2:
            r45 = r1
            r51 = r2
            r1 = r5
            r2 = r7
            r14 = r8
            r15 = r24
            r4 = r45
            r24 = r51
            r25 = r19
            r19 = 1
        L_0x01e3:
            if (r63 == 0) goto L_0x0553
            if (r55 == 0) goto L_0x01e9
            goto L_0x0553
        L_0x01e9:
            if (r16 != 0) goto L_0x01f4
            if (r17 != 0) goto L_0x01f4
            if (r18 != 0) goto L_0x01f4
        L_0x01ef:
            r2 = r15
            r1 = 5
            r3 = 0
            goto L_0x0523
        L_0x01f4:
            if (r16 == 0) goto L_0x020d
            if (r17 != 0) goto L_0x020d
            v.d r1 = r13.f23054f
            v.e r1 = r1.f23052d
            if (r39 == 0) goto L_0x0205
            boolean r1 = r1 instanceof v.a
            if (r1 == 0) goto L_0x0205
            r2 = 8
            goto L_0x0206
        L_0x0205:
            r2 = 5
        L_0x0206:
            r20 = r39
            r1 = r2
        L_0x0209:
            r2 = r15
        L_0x020a:
            r3 = 0
            goto L_0x0525
        L_0x020d:
            if (r16 != 0) goto L_0x023d
            if (r17 == 0) goto L_0x023d
            int r1 = r47.e()
            int r1 = -r1
            r2 = 8
            r10.e(r14, r15, r1, r2)
            if (r39 == 0) goto L_0x01ef
            boolean r1 = r0.f23087j
            if (r1 == 0) goto L_0x0235
            boolean r1 = r9.f22253h
            if (r1 == 0) goto L_0x0235
            v.e r1 = r0.f23070a0
            if (r1 == 0) goto L_0x0235
            v.f r1 = (v.f) r1
            if (r38 == 0) goto L_0x0231
            r1.w1(r13)
            goto L_0x01ef
        L_0x0231:
            r1.B1(r13)
            goto L_0x01ef
        L_0x0235:
            r1 = 5
            r3 = 0
            r10.h(r9, r11, r3, r1)
            r2 = r15
            goto L_0x0523
        L_0x023d:
            r3 = 0
            if (r16 == 0) goto L_0x0521
            if (r17 == 0) goto L_0x0521
            v.d r1 = r13.f23054f
            v.e r8 = r1.f23052d
            r6 = r47
            r7 = 0
            v.d r1 = r6.f23054f
            v.e r5 = r1.f23052d
            v.e r3 = r36.I()
            r16 = 6
            if (r25 == 0) goto L_0x0393
            if (r12 != 0) goto L_0x02be
            if (r4 != 0) goto L_0x0282
            if (r24 != 0) goto L_0x0282
            boolean r1 = r2.f22253h
            if (r1 == 0) goto L_0x0275
            boolean r1 = r15.f22253h
            if (r1 == 0) goto L_0x0275
            int r1 = r46.e()
            r4 = 8
            r10.e(r9, r2, r1, r4)
            int r1 = r47.e()
            int r1 = -r1
            r10.e(r14, r15, r1, r4)
            return
        L_0x0275:
            r4 = 8
            r1 = 8
            r17 = 8
            r18 = 0
            r21 = 1
            r23 = 0
            goto L_0x028d
        L_0x0282:
            r4 = 8
            r1 = 5
            r17 = 5
            r18 = 1
            r21 = 0
            r23 = 1
        L_0x028d:
            boolean r4 = r8 instanceof v.a
            if (r4 != 0) goto L_0x02a8
            boolean r4 = r5 instanceof v.a
            if (r4 == 0) goto L_0x0296
            goto L_0x02a8
        L_0x0296:
            r4 = r43
            r22 = r17
            r27 = r18
            r28 = r21
            r26 = r23
            r7 = 1
            r17 = 8
            r18 = 5
            r20 = 6
            goto L_0x02b9
        L_0x02a8:
            r4 = r43
            r27 = r18
            r28 = r21
            r26 = r23
            r7 = 1
            r17 = 8
            r18 = 5
            r20 = 6
            r22 = 4
        L_0x02b9:
            r23 = r1
            r1 = 3
            goto L_0x03e7
        L_0x02be:
            r1 = 2
            r17 = 8
            if (r12 != r1) goto L_0x02e0
            boolean r1 = r8 instanceof v.a
            if (r1 != 0) goto L_0x02d8
            boolean r1 = r5 instanceof v.a
            if (r1 == 0) goto L_0x02cc
            goto L_0x02d8
        L_0x02cc:
            r4 = r43
            r1 = 3
            r7 = 1
            r18 = 5
            r20 = 6
            r22 = 5
            goto L_0x03df
        L_0x02d8:
            r4 = r43
            r1 = 3
            r7 = 1
        L_0x02dc:
            r18 = 5
            goto L_0x03db
        L_0x02e0:
            r1 = 1
            if (r12 != r1) goto L_0x02f1
            r4 = r43
            r1 = 3
            r7 = 1
            r18 = 5
            r20 = 6
            r22 = 4
            r23 = 8
            goto L_0x03e1
        L_0x02f1:
            r1 = 3
            if (r12 != r1) goto L_0x0383
            int r1 = r0.F
            r7 = -1
            if (r1 != r7) goto L_0x031d
            if (r56 == 0) goto L_0x0309
            r4 = r43
            r1 = 3
            r7 = 1
            r18 = 5
            if (r39 == 0) goto L_0x0306
            r20 = 5
            goto L_0x0311
        L_0x0306:
            r20 = 4
            goto L_0x0311
        L_0x0309:
            r4 = r43
            r1 = 3
            r7 = 1
            r18 = 5
            r20 = 8
        L_0x0311:
            r22 = 5
            r23 = 8
        L_0x0315:
            r26 = 1
            r27 = 1
            r28 = 1
            goto L_0x03e7
        L_0x031d:
            if (r53 == 0) goto L_0x0347
            r1 = r59
            r7 = 2
            if (r1 == r7) goto L_0x032a
            r7 = 1
            if (r1 != r7) goto L_0x0328
            goto L_0x032b
        L_0x0328:
            r1 = 0
            goto L_0x032c
        L_0x032a:
            r7 = 1
        L_0x032b:
            r1 = 1
        L_0x032c:
            if (r1 != 0) goto L_0x0332
            r1 = 8
            r4 = 5
            goto L_0x0334
        L_0x0332:
            r1 = 5
            r4 = 4
        L_0x0334:
            r23 = r1
            r22 = r4
            r1 = 3
            r18 = 5
            r20 = 6
            r26 = 1
            r27 = 1
            r28 = 1
            r4 = r43
            goto L_0x03e7
        L_0x0347:
            r7 = 1
            if (r4 <= 0) goto L_0x0354
            r4 = r43
            r1 = 3
            r18 = 5
            r20 = 6
            r22 = 5
            goto L_0x0380
        L_0x0354:
            if (r4 != 0) goto L_0x0377
            if (r24 != 0) goto L_0x0377
            if (r56 != 0) goto L_0x0364
            r4 = r43
            r1 = 3
            r18 = 5
            r20 = 6
            r22 = 8
            goto L_0x0380
        L_0x0364:
            if (r8 == r3) goto L_0x036a
            if (r5 == r3) goto L_0x036a
            r1 = 4
            goto L_0x036b
        L_0x036a:
            r1 = 5
        L_0x036b:
            r4 = r43
            r23 = r1
            r1 = 3
            r18 = 5
            r20 = 6
            r22 = 4
            goto L_0x0315
        L_0x0377:
            r4 = r43
            r1 = 3
            r18 = 5
            r20 = 6
            r22 = 4
        L_0x0380:
            r23 = 5
            goto L_0x0315
        L_0x0383:
            r7 = 1
            r4 = r43
            r18 = 5
            r20 = 6
            r22 = 4
            r23 = 5
            r26 = 0
            r27 = 0
            goto L_0x03e5
        L_0x0393:
            r7 = 1
            r17 = 8
            boolean r1 = r2.f22253h
            if (r1 == 0) goto L_0x03d6
            boolean r1 = r15.f22253h
            if (r1 == 0) goto L_0x03d6
            int r1 = r46.e()
            int r3 = r47.e()
            r4 = 8
            r53 = r37
            r54 = r9
            r55 = r2
            r56 = r1
            r57 = r52
            r58 = r15
            r59 = r14
            r60 = r3
            r61 = r4
            r53.c(r54, r55, r56, r57, r58, r59, r60, r61)
            if (r39 == 0) goto L_0x03d5
            if (r19 == 0) goto L_0x03d5
            v.d r1 = r6.f23054f
            if (r1 == 0) goto L_0x03cc
            int r1 = r47.e()
            r4 = r43
            goto L_0x03cf
        L_0x03cc:
            r4 = r43
            r1 = 0
        L_0x03cf:
            if (r15 == r4) goto L_0x03d5
            r2 = 5
            r10.h(r4, r14, r1, r2)
        L_0x03d5:
            return
        L_0x03d6:
            r4 = r43
            r1 = 3
            goto L_0x02dc
        L_0x03db:
            r20 = 6
            r22 = 4
        L_0x03df:
            r23 = 5
        L_0x03e1:
            r26 = 1
            r27 = 1
        L_0x03e5:
            r28 = 0
        L_0x03e7:
            if (r26 == 0) goto L_0x03f2
            if (r2 != r15) goto L_0x03f2
            if (r8 == r3) goto L_0x03f2
            r26 = 0
            r29 = 0
            goto L_0x03f4
        L_0x03f2:
            r29 = 1
        L_0x03f4:
            if (r27 == 0) goto L_0x043a
            if (r25 != 0) goto L_0x0409
            if (r54 != 0) goto L_0x0409
            if (r56 != 0) goto L_0x0409
            if (r2 != r11) goto L_0x0409
            if (r15 != r4) goto L_0x0409
            r20 = 0
            r23 = 8
            r27 = 8
            r29 = 0
            goto L_0x040d
        L_0x0409:
            r27 = r20
            r20 = r39
        L_0x040d:
            int r30 = r46.e()
            int r31 = r47.e()
            r13 = 3
            r1 = r37
            r41 = r2
            r7 = 5
            r13 = 8
            r17 = 4
            r18 = 1
            r2 = r9
            r32 = r3
            r3 = r41
            r4 = r30
            r33 = r5
            r5 = r52
            r6 = r15
            r7 = r14
            r34 = r8
            r8 = r31
            r35 = r9
            r9 = r27
            r1.c(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x044c
        L_0x043a:
            r41 = r2
            r32 = r3
            r33 = r5
            r34 = r8
            r35 = r9
            r13 = 8
            r17 = 4
            r18 = 1
            r20 = r39
        L_0x044c:
            r2 = r29
            int r1 = r0.f23106s0
            if (r1 != r13) goto L_0x0459
            boolean r1 = r47.l()
            if (r1 != 0) goto L_0x0459
            return
        L_0x0459:
            r1 = r41
            if (r26 == 0) goto L_0x048e
            if (r20 == 0) goto L_0x0474
            if (r1 == r15) goto L_0x0474
            if (r25 != 0) goto L_0x0474
            r3 = r34
            boolean r4 = r3 instanceof v.a
            if (r4 != 0) goto L_0x0470
            r4 = r33
            boolean r5 = r4 instanceof v.a
            if (r5 == 0) goto L_0x0478
            goto L_0x0472
        L_0x0470:
            r4 = r33
        L_0x0472:
            r5 = 6
            goto L_0x047a
        L_0x0474:
            r4 = r33
            r3 = r34
        L_0x0478:
            r5 = r23
        L_0x047a:
            int r6 = r46.e()
            r8 = r35
            r10.h(r8, r1, r6, r5)
            int r6 = r47.e()
            int r6 = -r6
            r10.j(r14, r15, r6, r5)
            r23 = r5
            goto L_0x0494
        L_0x048e:
            r4 = r33
            r3 = r34
            r8 = r35
        L_0x0494:
            if (r20 == 0) goto L_0x04a8
            if (r57 == 0) goto L_0x04a8
            boolean r5 = r3 instanceof v.a
            if (r5 != 0) goto L_0x04a8
            boolean r5 = r4 instanceof v.a
            if (r5 != 0) goto L_0x04a8
            r5 = r32
            if (r4 == r5) goto L_0x04aa
            r2 = 1
            r6 = 6
            r7 = 6
            goto L_0x04ae
        L_0x04a8:
            r5 = r32
        L_0x04aa:
            r6 = r22
            r7 = r23
        L_0x04ae:
            if (r2 == 0) goto L_0x04f7
            if (r28 == 0) goto L_0x04d8
            if (r56 == 0) goto L_0x04b6
            if (r40 == 0) goto L_0x04d8
        L_0x04b6:
            if (r3 == r5) goto L_0x04bd
            if (r4 != r5) goto L_0x04bb
            goto L_0x04bd
        L_0x04bb:
            r2 = r6
            goto L_0x04be
        L_0x04bd:
            r2 = 6
        L_0x04be:
            boolean r9 = r3 instanceof v.g
            if (r9 != 0) goto L_0x04c6
            boolean r9 = r4 instanceof v.g
            if (r9 == 0) goto L_0x04c7
        L_0x04c6:
            r2 = 5
        L_0x04c7:
            boolean r9 = r3 instanceof v.a
            if (r9 != 0) goto L_0x04cf
            boolean r9 = r4 instanceof v.a
            if (r9 == 0) goto L_0x04d0
        L_0x04cf:
            r2 = 5
        L_0x04d0:
            if (r56 == 0) goto L_0x04d3
            r2 = 5
        L_0x04d3:
            int r2 = java.lang.Math.max(r2, r6)
            goto L_0x04d9
        L_0x04d8:
            r2 = r6
        L_0x04d9:
            if (r20 == 0) goto L_0x04e8
            int r2 = java.lang.Math.min(r7, r2)
            if (r53 == 0) goto L_0x04e8
            if (r56 != 0) goto L_0x04e8
            if (r3 == r5) goto L_0x04e7
            if (r4 != r5) goto L_0x04e8
        L_0x04e7:
            r2 = 4
        L_0x04e8:
            int r3 = r46.e()
            r10.e(r8, r1, r3, r2)
            int r3 = r47.e()
            int r3 = -r3
            r10.e(r14, r15, r3, r2)
        L_0x04f7:
            if (r20 == 0) goto L_0x0508
            if (r11 != r1) goto L_0x0500
            int r2 = r46.e()
            goto L_0x0501
        L_0x0500:
            r2 = 0
        L_0x0501:
            if (r1 == r11) goto L_0x0508
            r1 = 5
            r10.h(r8, r11, r2, r1)
            goto L_0x0509
        L_0x0508:
            r1 = 5
        L_0x0509:
            if (r20 == 0) goto L_0x0209
            if (r25 == 0) goto L_0x0209
            r2 = r15
            if (r50 != 0) goto L_0x020a
            if (r24 != 0) goto L_0x020a
            if (r25 == 0) goto L_0x051c
            r3 = 3
            if (r12 != r3) goto L_0x051c
            r3 = 0
            r10.h(r14, r8, r3, r13)
            goto L_0x0525
        L_0x051c:
            r3 = 0
            r10.h(r14, r8, r3, r1)
            goto L_0x0525
        L_0x0521:
            r2 = r15
            r1 = 5
        L_0x0523:
            r20 = r39
        L_0x0525:
            if (r20 == 0) goto L_0x0552
            if (r19 == 0) goto L_0x0552
            r4 = r47
            v.d r5 = r4.f23054f
            if (r5 == 0) goto L_0x0533
            int r3 = r47.e()
        L_0x0533:
            r5 = r43
            if (r2 == r5) goto L_0x0552
            boolean r2 = r0.f23087j
            if (r2 == 0) goto L_0x054f
            boolean r2 = r14.f22253h
            if (r2 == 0) goto L_0x054f
            v.e r2 = r0.f23070a0
            if (r2 == 0) goto L_0x054f
            v.f r2 = (v.f) r2
            if (r38 == 0) goto L_0x054b
            r2.v1(r4)
            goto L_0x054e
        L_0x054b:
            r2.A1(r4)
        L_0x054e:
            return
        L_0x054f:
            r10.h(r5, r14, r3, r1)
        L_0x0552:
            return
        L_0x0553:
            r5 = r43
            r8 = r9
            r3 = 0
            r7 = 2
            r13 = 8
            r18 = 1
            if (r1 >= r7) goto L_0x0596
            if (r39 == 0) goto L_0x0596
            if (r19 == 0) goto L_0x0596
            r10.h(r8, r11, r3, r13)
            if (r38 != 0) goto L_0x0570
            v.d r1 = r0.S
            v.d r1 = r1.f23054f
            if (r1 != 0) goto L_0x056e
            goto L_0x0570
        L_0x056e:
            r2 = 0
            goto L_0x0571
        L_0x0570:
            r2 = 1
        L_0x0571:
            if (r38 != 0) goto L_0x0591
            v.d r1 = r0.S
            v.d r1 = r1.f23054f
            if (r1 == 0) goto L_0x0591
            v.e r1 = r1.f23052d
            float r2 = r1.f23076d0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0590
            v.e$b[] r1 = r1.Z
            r2 = r1[r3]
            v.e$b r4 = v.e.b.MATCH_CONSTRAINT
            if (r2 != r4) goto L_0x0590
            r1 = r1[r18]
            if (r1 != r4) goto L_0x0590
            r2 = 1
            goto L_0x0591
        L_0x0590:
            r2 = 0
        L_0x0591:
            if (r2 == 0) goto L_0x0596
            r10.h(r5, r14, r3, r13)
        L_0x0596:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.e.i(s.d, boolean, boolean, boolean, boolean, s.i, s.i, v.e$b, boolean, v.d, v.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private void u0(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 != f11) {
            sb2.append(str);
            sb2.append(" :   ");
            sb2.append(f10);
            sb2.append(",\n");
        }
    }

    private void v0(StringBuilder sb2, String str, int i10, int i11) {
        if (i10 != i11) {
            sb2.append(str);
            sb2.append(" :   ");
            sb2.append(i10);
            sb2.append(",\n");
        }
    }

    private void w0(StringBuilder sb2, String str, float f10, int i10) {
        if (f10 != 0.0f) {
            sb2.append(str);
            sb2.append(" :  [");
            sb2.append(f10);
            sb2.append(",");
            sb2.append(i10);
            sb2.append(MaxReward.DEFAULT_LABEL);
            sb2.append("],\n");
        }
    }

    public int A() {
        return this.M;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x008e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x008e
        L_0x000b:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0037
            int r6 = r2 + -1
            if (r3 >= r6) goto L_0x0037
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002c
            r1 = 0
            goto L_0x0035
        L_0x002c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0035
            r1 = 1
        L_0x0035:
            int r4 = r3 + 1
        L_0x0037:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L_0x0075
            int r2 = r2 - r5
            if (r3 >= r2) goto L_0x0075
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0084
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0084
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            if (r1 != r5) goto L_0x006f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x006f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0075:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0084
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0084:
            r9 = 0
        L_0x0085:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r8.f23076d0 = r9
            r8.f23078e0 = r1
        L_0x008d:
            return
        L_0x008e:
            r8.f23076d0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.e.A0(java.lang.String):void");
    }

    public int B() {
        return this.N;
    }

    public void B0(int i10) {
        if (this.J) {
            int i11 = i10 - this.f23092l0;
            int i12 = this.f23074c0 + i11;
            this.f23082g0 = i11;
            this.P.s(i11);
            this.R.s(i12);
            this.S.s(i10);
            this.f23101q = true;
        }
    }

    public int C(int i10) {
        if (i10 == 0) {
            return U();
        }
        if (i10 == 1) {
            return v();
        }
        return 0;
    }

    public void C0(int i10, int i11) {
        if (!this.f23099p) {
            this.O.s(i10);
            this.Q.s(i11);
            this.f23080f0 = i10;
            this.f23072b0 = i11 - i10;
            this.f23099p = true;
        }
    }

    public int D() {
        return this.H[1];
    }

    public void D0(int i10) {
        this.O.s(i10);
        this.f23080f0 = i10;
    }

    public int E() {
        return this.H[0];
    }

    public void E0(int i10) {
        this.P.s(i10);
        this.f23082g0 = i10;
    }

    public int F() {
        return this.f23096n0;
    }

    public void F0(int i10, int i11) {
        if (!this.f23101q) {
            this.P.s(i10);
            this.R.s(i11);
            this.f23082g0 = i10;
            this.f23074c0 = i11 - i10;
            if (this.J) {
                this.S.s(i10 + this.f23092l0);
            }
            this.f23101q = true;
        }
    }

    public int G() {
        return this.f23094m0;
    }

    public void G0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f23080f0 = i10;
        this.f23082g0 = i11;
        if (this.f23106s0 == 8) {
            this.f23072b0 = 0;
            this.f23074c0 = 0;
            return;
        }
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i16 < (i15 = this.f23072b0)) {
            i16 = i15;
        }
        if (bVarArr[1] == bVar2 && i17 < (i14 = this.f23074c0)) {
            i17 = i14;
        }
        this.f23072b0 = i16;
        this.f23074c0 = i17;
        int i18 = this.f23096n0;
        if (i17 < i18) {
            this.f23074c0 = i18;
        }
        int i19 = this.f23094m0;
        if (i16 < i19) {
            this.f23072b0 = i19;
        }
        int i20 = this.A;
        if (i20 > 0 && bVarArr[0] == b.MATCH_CONSTRAINT) {
            this.f23072b0 = Math.min(this.f23072b0, i20);
        }
        int i21 = this.D;
        if (i21 > 0 && this.Z[1] == b.MATCH_CONSTRAINT) {
            this.f23074c0 = Math.min(this.f23074c0, i21);
        }
        int i22 = this.f23072b0;
        if (i16 != i22) {
            this.f23091l = i22;
        }
        int i23 = this.f23074c0;
        if (i17 != i23) {
            this.f23093m = i23;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.R;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v.e H(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            v.d r3 = r2.Q
            v.d r0 = r3.f23054f
            if (r0 == 0) goto L_0x001f
            v.d r1 = r0.f23054f
            if (r1 != r3) goto L_0x001f
            v.e r3 = r0.f23052d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            v.d r3 = r2.R
            v.d r0 = r3.f23054f
            if (r0 == 0) goto L_0x001f
            v.d r1 = r0.f23054f
            if (r1 != r3) goto L_0x001f
            v.e r3 = r0.f23052d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: v.e.H(int):v.e");
    }

    public void H0(boolean z10) {
        this.J = z10;
    }

    public e I() {
        return this.f23070a0;
    }

    public void I0(int i10) {
        this.f23074c0 = i10;
        int i11 = this.f23096n0;
        if (i10 < i11) {
            this.f23074c0 = i11;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.P;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v.e J(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            v.d r3 = r2.O
            v.d r0 = r3.f23054f
            if (r0 == 0) goto L_0x001f
            v.d r1 = r0.f23054f
            if (r1 != r3) goto L_0x001f
            v.e r3 = r0.f23052d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            v.d r3 = r2.P
            v.d r0 = r3.f23054f
            if (r0 == 0) goto L_0x001f
            v.d r1 = r0.f23054f
            if (r1 != r3) goto L_0x001f
            v.e r3 = r0.f23052d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: v.e.J(int):v.e");
    }

    public void J0(float f10) {
        this.f23098o0 = f10;
    }

    public int K() {
        return V() + this.f23072b0;
    }

    public void K0(int i10) {
        this.f23120z0 = i10;
    }

    public p L(int i10) {
        if (i10 == 0) {
            return this.f23077e;
        }
        if (i10 == 1) {
            return this.f23079f;
        }
        return null;
    }

    public void L0(int i10, int i11) {
        this.f23080f0 = i10;
        int i12 = i11 - i10;
        this.f23072b0 = i12;
        int i13 = this.f23094m0;
        if (i12 < i13) {
            this.f23072b0 = i13;
        }
    }

    public void M(StringBuilder sb2) {
        sb2.append("  " + this.f23097o + ":{\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("    actualWidth:");
        sb3.append(this.f23072b0);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.f23074c0);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f23080f0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f23082g0);
        sb2.append("\n");
        O(sb2, "left", this.O);
        O(sb2, "top", this.P);
        O(sb2, "right", this.Q);
        O(sb2, "bottom", this.R);
        O(sb2, "baseline", this.S);
        O(sb2, "centerX", this.T);
        O(sb2, "centerY", this.U);
        N(sb2, "    width", this.f23072b0, this.f23094m0, this.H[0], this.f23091l, this.f23119z, this.f23113w, this.B, this.D0[0]);
        N(sb2, "    height", this.f23074c0, this.f23096n0, this.H[1], this.f23093m, this.C, this.f23115x, this.E, this.D0[1]);
        w0(sb2, "    dimensionRatio", this.f23076d0, this.f23078e0);
        u0(sb2, "    horizontalBias", this.f23098o0, K0);
        u0(sb2, "    verticalBias", this.f23100p0, K0);
        v0(sb2, "    horizontalChainStyle", this.f23120z0, 0);
        v0(sb2, "    verticalChainStyle", this.A0, 0);
        sb2.append("  }");
    }

    public void M0(b bVar) {
        this.Z[0] = bVar;
    }

    public void N0(int i10, int i11, int i12, float f10) {
        this.f23113w = i10;
        this.f23119z = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.A = i12;
        this.B = f10;
        if (f10 > 0.0f && f10 < 1.0f && i10 == 0) {
            this.f23113w = 2;
        }
    }

    public void O0(float f10) {
        this.D0[0] = f10;
    }

    public float P() {
        return this.f23100p0;
    }

    /* access modifiers changed from: protected */
    public void P0(int i10, boolean z10) {
        this.Y[i10] = z10;
    }

    public int Q() {
        return this.A0;
    }

    public void Q0(boolean z10) {
        this.K = z10;
    }

    public b R() {
        return this.Z[1];
    }

    public void R0(boolean z10) {
        this.L = z10;
    }

    public int S() {
        int i10 = 0;
        if (this.O != null) {
            i10 = 0 + this.P.f23055g;
        }
        return this.Q != null ? i10 + this.R.f23055g : i10;
    }

    public void S0(int i10, int i11) {
        this.M = i10;
        this.N = i11;
        V0(false);
    }

    public int T() {
        return this.f23106s0;
    }

    public void T0(int i10) {
        this.H[1] = i10;
    }

    public int U() {
        if (this.f23106s0 == 8) {
            return 0;
        }
        return this.f23072b0;
    }

    public void U0(int i10) {
        this.H[0] = i10;
    }

    public int V() {
        e eVar = this.f23070a0;
        if (eVar == null || !(eVar instanceof f)) {
            return this.f23080f0;
        }
        return ((f) eVar).S0 + this.f23080f0;
    }

    public void V0(boolean z10) {
        this.f23085i = z10;
    }

    public int W() {
        e eVar = this.f23070a0;
        if (eVar == null || !(eVar instanceof f)) {
            return this.f23082g0;
        }
        return ((f) eVar).T0 + this.f23082g0;
    }

    public void W0(int i10) {
        if (i10 < 0) {
            this.f23096n0 = 0;
        } else {
            this.f23096n0 = i10;
        }
    }

    public boolean X() {
        return this.J;
    }

    public void X0(int i10) {
        if (i10 < 0) {
            this.f23094m0 = 0;
        } else {
            this.f23094m0 = i10;
        }
    }

    public boolean Y(int i10) {
        if (i10 == 0) {
            return (this.O.f23054f != null ? 1 : 0) + (this.Q.f23054f != null ? 1 : 0) < 2;
        }
        if ((this.P.f23054f != null ? 1 : 0) + (this.R.f23054f != null ? 1 : 0) + (this.S.f23054f != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    public void Y0(int i10, int i11) {
        this.f23080f0 = i10;
        this.f23082g0 = i11;
    }

    public boolean Z() {
        int size = this.X.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.X.get(i10).l()) {
                return true;
            }
        }
        return false;
    }

    public void Z0(e eVar) {
        this.f23070a0 = eVar;
    }

    public boolean a0() {
        return (this.f23091l == -1 && this.f23093m == -1) ? false : true;
    }

    public void a1(float f10) {
        this.f23100p0 = f10;
    }

    public boolean b0(int i10, int i11) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.O.f23054f;
            if (dVar3 == null || !dVar3.m() || (dVar2 = this.Q.f23054f) == null || !dVar2.m() || (this.Q.f23054f.d() - this.Q.e()) - (this.O.f23054f.d() + this.O.e()) < i11) {
                return false;
            }
            return true;
        }
        d dVar4 = this.P.f23054f;
        if (dVar4 == null || !dVar4.m() || (dVar = this.R.f23054f) == null || !dVar.m() || (this.R.f23054f.d() - this.R.e()) - (this.P.f23054f.d() + this.P.e()) < i11) {
            return false;
        }
        return true;
        return false;
    }

    public void b1(int i10) {
        this.A0 = i10;
    }

    public void c0(d.b bVar, e eVar, d.b bVar2, int i10, int i11) {
        m(bVar).a(eVar.m(bVar2), i10, i11, true);
    }

    public void c1(int i10, int i11) {
        this.f23082g0 = i10;
        int i12 = i11 - i10;
        this.f23074c0 = i12;
        int i13 = this.f23096n0;
        if (i12 < i13) {
            this.f23074c0 = i13;
        }
    }

    public void d1(b bVar) {
        this.Z[1] = bVar;
    }

    public void e(f fVar, s.d dVar, HashSet<e> hashSet, int i10, boolean z10) {
        if (z10) {
            if (hashSet.contains(this)) {
                j.a(fVar, dVar, this);
                hashSet.remove(this);
                g(dVar, fVar.P1(64));
            } else {
                return;
            }
        }
        if (i10 == 0) {
            HashSet<d> c10 = this.O.c();
            if (c10 != null) {
                Iterator<d> it = c10.iterator();
                while (it.hasNext()) {
                    it.next().f23052d.e(fVar, dVar, hashSet, i10, true);
                }
            }
            HashSet<d> c11 = this.Q.c();
            if (c11 != null) {
                Iterator<d> it2 = c11.iterator();
                while (it2.hasNext()) {
                    it2.next().f23052d.e(fVar, dVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<d> c12 = this.P.c();
        if (c12 != null) {
            Iterator<d> it3 = c12.iterator();
            while (it3.hasNext()) {
                it3.next().f23052d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<d> c13 = this.R.c();
        if (c13 != null) {
            Iterator<d> it4 = c13.iterator();
            while (it4.hasNext()) {
                it4.next().f23052d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<d> c14 = this.S.c();
        if (c14 != null) {
            Iterator<d> it5 = c14.iterator();
            while (it5.hasNext()) {
                it5.next().f23052d.e(fVar, dVar, hashSet, i10, true);
            }
        }
    }

    public boolean e0() {
        return this.f23103r;
    }

    public void e1(int i10, int i11, int i12, float f10) {
        this.f23115x = i10;
        this.C = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.D = i12;
        this.E = f10;
        if (f10 > 0.0f && f10 < 1.0f && i10 == 0) {
            this.f23115x = 2;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return (this instanceof k) || (this instanceof g);
    }

    public boolean f0(int i10) {
        return this.Y[i10];
    }

    public void f1(float f10) {
        this.D0[1] = f10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:184:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x04c3  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04ca  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0561  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0564  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x05a4  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x05aa  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x05d5  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x05df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(s.d r54, boolean r55) {
        /*
            r53 = this;
            r15 = r53
            r14 = r54
            v.d r0 = r15.O
            s.i r13 = r14.q(r0)
            v.d r0 = r15.Q
            s.i r12 = r14.q(r0)
            v.d r0 = r15.P
            s.i r11 = r14.q(r0)
            v.d r0 = r15.R
            s.i r10 = r14.q(r0)
            v.d r0 = r15.S
            s.i r9 = r14.q(r0)
            v.e r0 = r15.f23070a0
            r8 = 2
            r1 = 3
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0054
            if (r0 == 0) goto L_0x0036
            v.e$b[] r2 = r0.Z
            r2 = r2[r6]
            v.e$b r3 = v.e.b.WRAP_CONTENT
            if (r2 != r3) goto L_0x0036
            r2 = 1
            goto L_0x0037
        L_0x0036:
            r2 = 0
        L_0x0037:
            if (r0 == 0) goto L_0x0043
            v.e$b[] r0 = r0.Z
            r0 = r0[r7]
            v.e$b r3 = v.e.b.WRAP_CONTENT
            if (r0 != r3) goto L_0x0043
            r0 = 1
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            int r3 = r15.f23111v
            if (r3 == r7) goto L_0x0052
            if (r3 == r8) goto L_0x004f
            if (r3 == r1) goto L_0x0054
            r5 = r0
            r4 = r2
            goto L_0x0056
        L_0x004f:
            r5 = r0
            r4 = 0
            goto L_0x0056
        L_0x0052:
            r4 = r2
            goto L_0x0055
        L_0x0054:
            r4 = 0
        L_0x0055:
            r5 = 0
        L_0x0056:
            int r0 = r15.f23106s0
            r3 = 8
            if (r0 != r3) goto L_0x0071
            boolean r0 = r15.f23108t0
            if (r0 != 0) goto L_0x0071
            boolean r0 = r53.Z()
            if (r0 != 0) goto L_0x0071
            boolean[] r0 = r15.Y
            boolean r2 = r0[r6]
            if (r2 != 0) goto L_0x0071
            boolean r0 = r0[r7]
            if (r0 != 0) goto L_0x0071
            return
        L_0x0071:
            boolean r0 = r15.f23099p
            r2 = 5
            if (r0 != 0) goto L_0x007a
            boolean r8 = r15.f23101q
            if (r8 == 0) goto L_0x00f7
        L_0x007a:
            if (r0 == 0) goto L_0x00a9
            int r0 = r15.f23080f0
            r14.f(r13, r0)
            int r0 = r15.f23080f0
            int r8 = r15.f23072b0
            int r0 = r0 + r8
            r14.f(r12, r0)
            if (r4 == 0) goto L_0x00a9
            v.e r0 = r15.f23070a0
            if (r0 == 0) goto L_0x00a9
            boolean r8 = r15.f23089k
            if (r8 == 0) goto L_0x00a0
            v.f r0 = (v.f) r0
            v.d r8 = r15.O
            r0.w1(r8)
            v.d r8 = r15.Q
            r0.v1(r8)
            goto L_0x00a9
        L_0x00a0:
            v.d r0 = r0.Q
            s.i r0 = r14.q(r0)
            r14.h(r0, r12, r6, r2)
        L_0x00a9:
            boolean r0 = r15.f23101q
            if (r0 == 0) goto L_0x00ea
            int r0 = r15.f23082g0
            r14.f(r11, r0)
            int r0 = r15.f23082g0
            int r8 = r15.f23074c0
            int r0 = r0 + r8
            r14.f(r10, r0)
            v.d r0 = r15.S
            boolean r0 = r0.l()
            if (r0 == 0) goto L_0x00ca
            int r0 = r15.f23082g0
            int r8 = r15.f23092l0
            int r0 = r0 + r8
            r14.f(r9, r0)
        L_0x00ca:
            if (r5 == 0) goto L_0x00ea
            v.e r0 = r15.f23070a0
            if (r0 == 0) goto L_0x00ea
            boolean r8 = r15.f23089k
            if (r8 == 0) goto L_0x00e1
            v.f r0 = (v.f) r0
            v.d r8 = r15.P
            r0.B1(r8)
            v.d r8 = r15.R
            r0.A1(r8)
            goto L_0x00ea
        L_0x00e1:
            v.d r0 = r0.R
            s.i r0 = r14.q(r0)
            r14.h(r0, r10, r6, r2)
        L_0x00ea:
            boolean r0 = r15.f23099p
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r15.f23101q
            if (r0 == 0) goto L_0x00f7
            r15.f23099p = r6
            r15.f23101q = r6
            return
        L_0x00f7:
            s.e r0 = s.d.f22213x
            if (r55 == 0) goto L_0x017f
            w.l r0 = r15.f23077e
            if (r0 == 0) goto L_0x017f
            w.n r8 = r15.f23079f
            if (r8 == 0) goto L_0x017f
            w.f r2 = r0.f23492h
            boolean r1 = r2.f23441j
            if (r1 == 0) goto L_0x017f
            w.f r0 = r0.f23493i
            boolean r0 = r0.f23441j
            if (r0 == 0) goto L_0x017f
            w.f r0 = r8.f23492h
            boolean r0 = r0.f23441j
            if (r0 == 0) goto L_0x017f
            w.f r0 = r8.f23493i
            boolean r0 = r0.f23441j
            if (r0 == 0) goto L_0x017f
            int r0 = r2.f23438g
            r14.f(r13, r0)
            w.l r0 = r15.f23077e
            w.f r0 = r0.f23493i
            int r0 = r0.f23438g
            r14.f(r12, r0)
            w.n r0 = r15.f23079f
            w.f r0 = r0.f23492h
            int r0 = r0.f23438g
            r14.f(r11, r0)
            w.n r0 = r15.f23079f
            w.f r0 = r0.f23493i
            int r0 = r0.f23438g
            r14.f(r10, r0)
            w.n r0 = r15.f23079f
            w.f r0 = r0.f23467k
            int r0 = r0.f23438g
            r14.f(r9, r0)
            v.e r0 = r15.f23070a0
            if (r0 == 0) goto L_0x017a
            if (r4 == 0) goto L_0x0161
            boolean[] r0 = r15.f23081g
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x0161
            boolean r0 = r53.g0()
            if (r0 != 0) goto L_0x0161
            v.e r0 = r15.f23070a0
            v.d r0 = r0.Q
            s.i r0 = r14.q(r0)
            r14.h(r0, r12, r6, r3)
        L_0x0161:
            if (r5 == 0) goto L_0x017a
            boolean[] r0 = r15.f23081g
            boolean r0 = r0[r7]
            if (r0 == 0) goto L_0x017a
            boolean r0 = r53.i0()
            if (r0 != 0) goto L_0x017a
            v.e r0 = r15.f23070a0
            v.d r0 = r0.R
            s.i r0 = r14.q(r0)
            r14.h(r0, r10, r6, r3)
        L_0x017a:
            r15.f23099p = r6
            r15.f23101q = r6
            return
        L_0x017f:
            v.e r0 = r15.f23070a0
            if (r0 == 0) goto L_0x01f0
            boolean r0 = r15.d0(r6)
            if (r0 == 0) goto L_0x0192
            v.e r0 = r15.f23070a0
            v.f r0 = (v.f) r0
            r0.s1(r15, r6)
            r0 = 1
            goto L_0x0196
        L_0x0192:
            boolean r0 = r53.g0()
        L_0x0196:
            boolean r1 = r15.d0(r7)
            if (r1 == 0) goto L_0x01a5
            v.e r1 = r15.f23070a0
            v.f r1 = (v.f) r1
            r1.s1(r15, r7)
            r1 = 1
            goto L_0x01a9
        L_0x01a5:
            boolean r1 = r53.i0()
        L_0x01a9:
            if (r0 != 0) goto L_0x01c8
            if (r4 == 0) goto L_0x01c8
            int r2 = r15.f23106s0
            if (r2 == r3) goto L_0x01c8
            v.d r2 = r15.O
            v.d r2 = r2.f23054f
            if (r2 != 0) goto L_0x01c8
            v.d r2 = r15.Q
            v.d r2 = r2.f23054f
            if (r2 != 0) goto L_0x01c8
            v.e r2 = r15.f23070a0
            v.d r2 = r2.Q
            s.i r2 = r14.q(r2)
            r14.h(r2, r12, r6, r7)
        L_0x01c8:
            if (r1 != 0) goto L_0x01eb
            if (r5 == 0) goto L_0x01eb
            int r2 = r15.f23106s0
            if (r2 == r3) goto L_0x01eb
            v.d r2 = r15.P
            v.d r2 = r2.f23054f
            if (r2 != 0) goto L_0x01eb
            v.d r2 = r15.R
            v.d r2 = r2.f23054f
            if (r2 != 0) goto L_0x01eb
            v.d r2 = r15.S
            if (r2 != 0) goto L_0x01eb
            v.e r2 = r15.f23070a0
            v.d r2 = r2.R
            s.i r2 = r14.q(r2)
            r14.h(r2, r10, r6, r7)
        L_0x01eb:
            r29 = r0
            r28 = r1
            goto L_0x01f4
        L_0x01f0:
            r28 = 0
            r29 = 0
        L_0x01f4:
            int r0 = r15.f23072b0
            int r1 = r15.f23094m0
            if (r0 >= r1) goto L_0x01fb
            goto L_0x01fc
        L_0x01fb:
            r1 = r0
        L_0x01fc:
            int r2 = r15.f23074c0
            int r8 = r15.f23096n0
            if (r2 >= r8) goto L_0x0203
            goto L_0x0204
        L_0x0203:
            r8 = r2
        L_0x0204:
            v.e$b[] r3 = r15.Z
            r7 = r3[r6]
            v.e$b r6 = v.e.b.MATCH_CONSTRAINT
            r22 = r1
            if (r7 == r6) goto L_0x0210
            r7 = 1
            goto L_0x0211
        L_0x0210:
            r7 = 0
        L_0x0211:
            r20 = 1
            r1 = r3[r20]
            r23 = r8
            if (r1 == r6) goto L_0x021b
            r1 = 1
            goto L_0x021c
        L_0x021b:
            r1 = 0
        L_0x021c:
            int r8 = r15.f23078e0
            r15.F = r8
            r27 = r9
            float r9 = r15.f23076d0
            r15.G = r9
            r30 = r10
            int r10 = r15.f23113w
            r31 = r11
            int r11 = r15.f23115x
            r24 = 0
            r25 = 4
            r32 = r12
            int r24 = (r9 > r24 ? 1 : (r9 == r24 ? 0 : -1))
            if (r24 <= 0) goto L_0x02c2
            int r12 = r15.f23106s0
            r33 = r13
            r13 = 8
            if (r12 == r13) goto L_0x02c4
            r12 = 0
            r13 = r3[r12]
            if (r13 != r6) goto L_0x0248
            if (r10 != 0) goto L_0x0248
            r10 = 3
        L_0x0248:
            r12 = 1
            r13 = r3[r12]
            if (r13 != r6) goto L_0x0250
            if (r11 != 0) goto L_0x0250
            r11 = 3
        L_0x0250:
            r13 = 0
            r14 = r3[r13]
            if (r14 != r6) goto L_0x0262
            r13 = r3[r12]
            if (r13 != r6) goto L_0x0262
            r12 = 3
            if (r10 != r12) goto L_0x0263
            if (r11 != r12) goto L_0x0263
            r15.l1(r4, r5, r7, r1)
            goto L_0x02b6
        L_0x0262:
            r12 = 3
        L_0x0263:
            r1 = 0
            r7 = r3[r1]
            if (r7 != r6) goto L_0x0289
            if (r10 != r12) goto L_0x0289
            r15.F = r1
            float r0 = (float) r2
            float r9 = r9 * r0
            int r1 = (int) r9
            r2 = 1
            r0 = r3[r2]
            if (r0 == r6) goto L_0x027f
            r35 = r11
            r34 = r23
            r14 = 0
            r21 = 0
            r36 = 4
            goto L_0x02cf
        L_0x027f:
            r36 = r10
            r35 = r11
            r34 = r23
            r14 = 1
            r21 = 0
            goto L_0x02cf
        L_0x0289:
            r2 = 1
            r1 = r3[r2]
            if (r1 != r6) goto L_0x02b6
            r1 = 3
            if (r11 != r1) goto L_0x02b6
            r15.F = r2
            r1 = -1
            if (r8 != r1) goto L_0x029b
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r9
            r15.G = r1
        L_0x029b:
            float r1 = r15.G
            float r0 = (float) r0
            float r1 = r1 * r0
            int r8 = (int) r1
            r21 = 0
            r0 = r3[r21]
            r34 = r8
            r36 = r10
            if (r0 == r6) goto L_0x02b1
            r1 = r22
            r14 = 0
            r35 = 4
            goto L_0x02cf
        L_0x02b1:
            r35 = r11
            r1 = r22
            goto L_0x02c0
        L_0x02b6:
            r21 = 0
            r36 = r10
            r35 = r11
            r1 = r22
            r34 = r23
        L_0x02c0:
            r14 = 1
            goto L_0x02cf
        L_0x02c2:
            r33 = r13
        L_0x02c4:
            r21 = 0
            r36 = r10
            r35 = r11
            r1 = r22
            r34 = r23
            r14 = 0
        L_0x02cf:
            int[] r0 = r15.f23117y
            r0[r21] = r36
            r2 = 1
            r0[r2] = r35
            r15.f23083h = r14
            if (r14 == 0) goto L_0x02e4
            int r0 = r15.F
            r2 = -1
            if (r0 == 0) goto L_0x02e1
            if (r0 != r2) goto L_0x02e5
        L_0x02e1:
            r18 = 1
            goto L_0x02e7
        L_0x02e4:
            r2 = -1
        L_0x02e5:
            r18 = 0
        L_0x02e7:
            if (r14 == 0) goto L_0x02f3
            int r0 = r15.F
            r3 = 1
            if (r0 == r3) goto L_0x02f0
            if (r0 != r2) goto L_0x02f3
        L_0x02f0:
            r37 = 1
            goto L_0x02f5
        L_0x02f3:
            r37 = 0
        L_0x02f5:
            v.e$b[] r0 = r15.Z
            r2 = 0
            r0 = r0[r2]
            v.e$b r13 = v.e.b.WRAP_CONTENT
            if (r0 != r13) goto L_0x0304
            boolean r0 = r15 instanceof v.f
            if (r0 == 0) goto L_0x0304
            r9 = 1
            goto L_0x0305
        L_0x0304:
            r9 = 0
        L_0x0305:
            if (r9 == 0) goto L_0x030a
            r22 = 0
            goto L_0x030c
        L_0x030a:
            r22 = r1
        L_0x030c:
            v.d r0 = r15.V
            boolean r0 = r0.n()
            r1 = 1
            r38 = r0 ^ 1
            boolean[] r0 = r15.Y
            r2 = 0
            boolean r23 = r0[r2]
            boolean r39 = r0[r1]
            int r0 = r15.f23107t
            r40 = 0
            r8 = 2
            if (r0 == r8) goto L_0x0433
            boolean r0 = r15.f23099p
            if (r0 != 0) goto L_0x0433
            if (r55 == 0) goto L_0x038a
            w.l r0 = r15.f23077e
            if (r0 == 0) goto L_0x038a
            w.f r1 = r0.f23492h
            boolean r2 = r1.f23441j
            if (r2 == 0) goto L_0x038a
            w.f r0 = r0.f23493i
            boolean r0 = r0.f23441j
            if (r0 != 0) goto L_0x033a
            goto L_0x038a
        L_0x033a:
            if (r55 == 0) goto L_0x0386
            int r0 = r1.f23438g
            r12 = r54
            r11 = r33
            r12.f(r11, r0)
            w.l r0 = r15.f23077e
            w.f r0 = r0.f23493i
            int r0 = r0.f23438g
            r10 = r32
            r12.f(r10, r0)
            v.e r0 = r15.f23070a0
            if (r0 == 0) goto L_0x0370
            if (r4 == 0) goto L_0x0370
            boolean[] r0 = r15.f23081g
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x0370
            boolean r0 = r53.g0()
            if (r0 != 0) goto L_0x0370
            v.e r0 = r15.f23070a0
            v.d r0 = r0.Q
            s.i r0 = r12.q(r0)
            r3 = 8
            r12.h(r0, r10, r1, r3)
        L_0x0370:
            r43 = r4
            r47 = r5
            r48 = r6
            r52 = r13
            r32 = r14
            r49 = r27
            r50 = r30
            r51 = r31
            r30 = r10
            r31 = r11
            goto L_0x0447
        L_0x0386:
            r12 = r54
            goto L_0x0433
        L_0x038a:
            r12 = r54
            r10 = r32
            r11 = r33
            r3 = 8
            v.e r0 = r15.f23070a0
            if (r0 == 0) goto L_0x039e
            v.d r0 = r0.Q
            s.i r0 = r12.q(r0)
            r7 = r0
            goto L_0x03a0
        L_0x039e:
            r7 = r40
        L_0x03a0:
            v.e r0 = r15.f23070a0
            if (r0 == 0) goto L_0x03ad
            v.d r0 = r0.O
            s.i r0 = r12.q(r0)
            r16 = r0
            goto L_0x03af
        L_0x03ad:
            r16 = r40
        L_0x03af:
            boolean[] r0 = r15.f23081g
            r19 = 0
            boolean r21 = r0[r19]
            v.e$b[] r0 = r15.Z
            r32 = r0[r19]
            v.d r1 = r15.O
            v.d r2 = r15.Q
            r41 = r2
            int r2 = r15.f23080f0
            r42 = r2
            int r2 = r15.f23094m0
            int[] r3 = r15.H
            r44 = r3[r19]
            float r3 = r15.f23098o0
            r20 = 1
            r0 = r0[r20]
            if (r0 != r6) goto L_0x03d4
            r45 = 1
            goto L_0x03d6
        L_0x03d4:
            r45 = 0
        L_0x03d6:
            int r0 = r15.f23119z
            r24 = r0
            int r0 = r15.A
            r25 = r0
            float r0 = r15.B
            r26 = r0
            r0 = r53
            r46 = r1
            r1 = r54
            r17 = r41
            r33 = r42
            r41 = r2
            r2 = 1
            r42 = r3
            r3 = r4
            r43 = r4
            r4 = r5
            r47 = r5
            r5 = r21
            r48 = r6
            r6 = r16
            r8 = r32
            r49 = r27
            r16 = r10
            r50 = r30
            r10 = r46
            r19 = r11
            r51 = r31
            r11 = r17
            r30 = r16
            r12 = r33
            r52 = r13
            r31 = r19
            r13 = r22
            r32 = r14
            r14 = r41
            r15 = r44
            r16 = r42
            r17 = r18
            r18 = r45
            r19 = r29
            r20 = r28
            r21 = r23
            r22 = r36
            r23 = r35
            r27 = r38
            r0.i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0447
        L_0x0433:
            r43 = r4
            r47 = r5
            r48 = r6
            r52 = r13
            r49 = r27
            r50 = r30
            r51 = r31
            r30 = r32
            r31 = r33
            r32 = r14
        L_0x0447:
            if (r55 == 0) goto L_0x04ad
            r15 = r53
            w.n r0 = r15.f23079f
            if (r0 == 0) goto L_0x04a0
            w.f r1 = r0.f23492h
            boolean r2 = r1.f23441j
            if (r2 == 0) goto L_0x04a0
            w.f r0 = r0.f23493i
            boolean r0 = r0.f23441j
            if (r0 == 0) goto L_0x04a0
            int r0 = r1.f23438g
            r14 = r54
            r13 = r51
            r14.f(r13, r0)
            w.n r0 = r15.f23079f
            w.f r0 = r0.f23493i
            int r0 = r0.f23438g
            r12 = r50
            r14.f(r12, r0)
            w.n r0 = r15.f23079f
            w.f r0 = r0.f23467k
            int r0 = r0.f23438g
            r1 = r49
            r14.f(r1, r0)
            v.e r0 = r15.f23070a0
            if (r0 == 0) goto L_0x049a
            if (r28 != 0) goto L_0x049a
            if (r47 == 0) goto L_0x049a
            boolean[] r2 = r15.f23081g
            r11 = 1
            boolean r2 = r2[r11]
            if (r2 == 0) goto L_0x0496
            v.d r0 = r0.R
            s.i r0 = r14.q(r0)
            r2 = 8
            r10 = 0
            r14.h(r0, r12, r10, r2)
            goto L_0x049e
        L_0x0496:
            r2 = 8
            r10 = 0
            goto L_0x049e
        L_0x049a:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x049e:
            r7 = 0
            goto L_0x04bc
        L_0x04a0:
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
            r2 = 8
            r10 = 0
            r11 = 1
            goto L_0x04bb
        L_0x04ad:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r53
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
        L_0x04bb:
            r7 = 1
        L_0x04bc:
            int r0 = r15.f23109u
            r3 = 2
            if (r0 != r3) goto L_0x04c3
            r6 = 0
            goto L_0x04c4
        L_0x04c3:
            r6 = r7
        L_0x04c4:
            if (r6 == 0) goto L_0x05a4
            boolean r0 = r15.f23101q
            if (r0 != 0) goto L_0x05a4
            v.e$b[] r0 = r15.Z
            r0 = r0[r11]
            r3 = r52
            if (r0 != r3) goto L_0x04d8
            boolean r0 = r15 instanceof v.f
            if (r0 == 0) goto L_0x04d8
            r9 = 1
            goto L_0x04d9
        L_0x04d8:
            r9 = 0
        L_0x04d9:
            if (r9 == 0) goto L_0x04dd
            r34 = 0
        L_0x04dd:
            v.e r0 = r15.f23070a0
            if (r0 == 0) goto L_0x04e9
            v.d r0 = r0.R
            s.i r0 = r14.q(r0)
            r7 = r0
            goto L_0x04eb
        L_0x04e9:
            r7 = r40
        L_0x04eb:
            v.e r0 = r15.f23070a0
            if (r0 == 0) goto L_0x04f7
            v.d r0 = r0.P
            s.i r0 = r14.q(r0)
            r6 = r0
            goto L_0x04f9
        L_0x04f7:
            r6 = r40
        L_0x04f9:
            int r0 = r15.f23092l0
            if (r0 > 0) goto L_0x0501
            int r0 = r15.f23106s0
            if (r0 != r2) goto L_0x0541
        L_0x0501:
            v.d r0 = r15.S
            v.d r3 = r0.f23054f
            if (r3 == 0) goto L_0x052e
            int r0 = r53.n()
            r14.e(r1, r13, r0, r2)
            v.d r0 = r15.S
            v.d r0 = r0.f23054f
            s.i r0 = r14.q(r0)
            v.d r3 = r15.S
            int r3 = r3.e()
            r14.e(r1, r0, r3, r2)
            if (r47 == 0) goto L_0x052b
            v.d r0 = r15.R
            s.i r0 = r14.q(r0)
            r1 = 5
            r14.h(r7, r0, r10, r1)
        L_0x052b:
            r27 = 0
            goto L_0x0543
        L_0x052e:
            int r3 = r15.f23106s0
            if (r3 != r2) goto L_0x053a
            int r0 = r0.e()
            r14.e(r1, r13, r0, r2)
            goto L_0x0541
        L_0x053a:
            int r0 = r53.n()
            r14.e(r1, r13, r0, r2)
        L_0x0541:
            r27 = r38
        L_0x0543:
            boolean[] r0 = r15.f23081g
            boolean r5 = r0[r11]
            v.e$b[] r0 = r15.Z
            r8 = r0[r11]
            v.d r4 = r15.P
            v.d r3 = r15.R
            int r1 = r15.f23082g0
            int r2 = r15.f23096n0
            int[] r10 = r15.H
            r16 = r10[r11]
            float r10 = r15.f23100p0
            r17 = 0
            r0 = r0[r17]
            r11 = r48
            if (r0 != r11) goto L_0x0564
            r18 = 1
            goto L_0x0566
        L_0x0564:
            r18 = 0
        L_0x0566:
            int r0 = r15.C
            r24 = r0
            int r0 = r15.D
            r25 = r0
            float r0 = r15.E
            r26 = r0
            r0 = r53
            r19 = r1
            r1 = r54
            r20 = r2
            r2 = 0
            r11 = r3
            r3 = r47
            r21 = r4
            r4 = r43
            r17 = r10
            r10 = r21
            r33 = r12
            r12 = r19
            r38 = r13
            r13 = r34
            r14 = r20
            r15 = r16
            r16 = r17
            r17 = r37
            r19 = r28
            r20 = r29
            r21 = r39
            r22 = r35
            r23 = r36
            r0.i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x05a8
        L_0x05a4:
            r33 = r12
            r38 = r13
        L_0x05a8:
            if (r32 == 0) goto L_0x05d5
            r6 = 8
            r7 = r53
            int r0 = r7.F
            r1 = 1
            if (r0 != r1) goto L_0x05c3
            float r5 = r7.G
            r0 = r54
            r1 = r33
            r2 = r38
            r3 = r30
            r4 = r31
            r0.k(r1, r2, r3, r4, r5, r6)
            goto L_0x05d7
        L_0x05c3:
            float r5 = r7.G
            r6 = 8
            r0 = r54
            r1 = r30
            r2 = r31
            r3 = r33
            r4 = r38
            r0.k(r1, r2, r3, r4, r5, r6)
            goto L_0x05d7
        L_0x05d5:
            r7 = r53
        L_0x05d7:
            v.d r0 = r7.V
            boolean r0 = r0.n()
            if (r0 == 0) goto L_0x05ff
            v.d r0 = r7.V
            v.d r0 = r0.i()
            v.e r0 = r0.g()
            float r1 = r7.I
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            v.d r2 = r7.V
            int r2 = r2.e()
            r3 = r54
            r3.b(r7, r0, r1, r2)
        L_0x05ff:
            r0 = 0
            r7.f23099p = r0
            r7.f23101q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.e.g(s.d, boolean):void");
    }

    public boolean g0() {
        d dVar = this.O;
        d dVar2 = dVar.f23054f;
        if (dVar2 != null && dVar2.f23054f == dVar) {
            return true;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f23054f;
        return dVar4 != null && dVar4.f23054f == dVar3;
    }

    public void g1(int i10) {
        this.f23106s0 = i10;
    }

    public boolean h() {
        return this.f23106s0 != 8;
    }

    public boolean h0() {
        return this.K;
    }

    public void h1(int i10) {
        this.f23072b0 = i10;
        int i11 = this.f23094m0;
        if (i10 < i11) {
            this.f23072b0 = i11;
        }
    }

    public boolean i0() {
        d dVar = this.P;
        d dVar2 = dVar.f23054f;
        if (dVar2 != null && dVar2.f23054f == dVar) {
            return true;
        }
        d dVar3 = this.R;
        d dVar4 = dVar3.f23054f;
        return dVar4 != null && dVar4.f23054f == dVar3;
    }

    public void i1(int i10) {
        if (i10 >= 0 && i10 <= 3) {
            this.f23111v = i10;
        }
    }

    public void j(e eVar, float f10, int i10) {
        d.b bVar = d.b.CENTER;
        c0(bVar, eVar, bVar, i10, 0);
        this.I = f10;
    }

    public boolean j0() {
        return this.L;
    }

    public void j1(int i10) {
        this.f23080f0 = i10;
    }

    public void k(s.d dVar) {
        dVar.q(this.O);
        dVar.q(this.P);
        dVar.q(this.Q);
        dVar.q(this.R);
        if (this.f23092l0 > 0) {
            dVar.q(this.S);
        }
    }

    public boolean k0() {
        return this.f23085i && this.f23106s0 != 8;
    }

    public void k1(int i10) {
        this.f23082g0 = i10;
    }

    public void l() {
        if (this.f23077e == null) {
            this.f23077e = new l(this);
        }
        if (this.f23079f == null) {
            this.f23079f = new n(this);
        }
    }

    public boolean l0() {
        return this.f23099p || (this.O.m() && this.Q.m());
    }

    public void l1(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.F == -1) {
            if (z12 && !z13) {
                this.F = 0;
            } else if (!z12 && z13) {
                this.F = 1;
                if (this.f23078e0 == -1) {
                    this.G = 1.0f / this.G;
                }
            }
        }
        if (this.F == 0 && (!this.P.n() || !this.R.n())) {
            this.F = 1;
        } else if (this.F == 1 && (!this.O.n() || !this.Q.n())) {
            this.F = 0;
        }
        if (this.F == -1 && (!this.P.n() || !this.R.n() || !this.O.n() || !this.Q.n())) {
            if (this.P.n() && this.R.n()) {
                this.F = 0;
            } else if (this.O.n() && this.Q.n()) {
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
        if (this.F == -1) {
            int i10 = this.f23119z;
            if (i10 > 0 && this.C == 0) {
                this.F = 0;
            } else if (i10 == 0 && this.C > 0) {
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
    }

    public d m(d.b bVar) {
        switch (a.f23121a[bVar.ordinal()]) {
            case 1:
                return this.O;
            case 2:
                return this.P;
            case 3:
                return this.Q;
            case 4:
                return this.R;
            case 5:
                return this.S;
            case 6:
                return this.V;
            case 7:
                return this.T;
            case 8:
                return this.U;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public boolean m0() {
        return this.f23101q || (this.P.m() && this.R.m());
    }

    public void m1(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean k10 = z10 & this.f23077e.k();
        boolean k11 = z11 & this.f23079f.k();
        l lVar = this.f23077e;
        int i12 = lVar.f23492h.f23438g;
        n nVar = this.f23079f;
        int i13 = nVar.f23492h.f23438g;
        int i14 = lVar.f23493i.f23438g;
        int i15 = nVar.f23493i.f23438g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (k10) {
            this.f23080f0 = i12;
        }
        if (k11) {
            this.f23082g0 = i13;
        }
        if (this.f23106s0 == 8) {
            this.f23072b0 = 0;
            this.f23074c0 = 0;
            return;
        }
        if (k10) {
            if (this.Z[0] == b.FIXED && i17 < (i11 = this.f23072b0)) {
                i17 = i11;
            }
            this.f23072b0 = i17;
            int i19 = this.f23094m0;
            if (i17 < i19) {
                this.f23072b0 = i19;
            }
        }
        if (k11) {
            if (this.Z[1] == b.FIXED && i18 < (i10 = this.f23074c0)) {
                i18 = i10;
            }
            this.f23074c0 = i18;
            int i20 = this.f23096n0;
            if (i18 < i20) {
                this.f23074c0 = i20;
            }
        }
    }

    public int n() {
        return this.f23092l0;
    }

    public boolean n0() {
        return this.f23105s;
    }

    public void n1(s.d dVar, boolean z10) {
        n nVar;
        l lVar;
        int x10 = dVar.x(this.O);
        int x11 = dVar.x(this.P);
        int x12 = dVar.x(this.Q);
        int x13 = dVar.x(this.R);
        if (z10 && (lVar = this.f23077e) != null) {
            f fVar = lVar.f23492h;
            if (fVar.f23441j) {
                f fVar2 = lVar.f23493i;
                if (fVar2.f23441j) {
                    x10 = fVar.f23438g;
                    x12 = fVar2.f23438g;
                }
            }
        }
        if (z10 && (nVar = this.f23079f) != null) {
            f fVar3 = nVar.f23492h;
            if (fVar3.f23441j) {
                f fVar4 = nVar.f23493i;
                if (fVar4.f23441j) {
                    x11 = fVar3.f23438g;
                    x13 = fVar4.f23438g;
                }
            }
        }
        int i10 = x13 - x11;
        if (x12 - x10 < 0 || i10 < 0 || x10 == Integer.MIN_VALUE || x10 == Integer.MAX_VALUE || x11 == Integer.MIN_VALUE || x11 == Integer.MAX_VALUE || x12 == Integer.MIN_VALUE || x12 == Integer.MAX_VALUE || x13 == Integer.MIN_VALUE || x13 == Integer.MAX_VALUE) {
            x13 = 0;
            x10 = 0;
            x11 = 0;
            x12 = 0;
        }
        G0(x10, x11, x12, x13);
    }

    public float o(int i10) {
        if (i10 == 0) {
            return this.f23098o0;
        }
        if (i10 == 1) {
            return this.f23100p0;
        }
        return -1.0f;
    }

    public void o0() {
        this.f23103r = true;
    }

    public int p() {
        return W() + this.f23074c0;
    }

    public void p0() {
        this.f23105s = true;
    }

    public Object q() {
        return this.f23102q0;
    }

    public boolean q0() {
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public String r() {
        return this.f23110u0;
    }

    public void r0() {
        this.O.p();
        this.P.p();
        this.Q.p();
        this.R.p();
        this.S.p();
        this.T.p();
        this.U.p();
        this.V.p();
        this.f23070a0 = null;
        this.I = 0.0f;
        this.f23072b0 = 0;
        this.f23074c0 = 0;
        this.f23076d0 = 0.0f;
        this.f23078e0 = -1;
        this.f23080f0 = 0;
        this.f23082g0 = 0;
        this.f23088j0 = 0;
        this.f23090k0 = 0;
        this.f23092l0 = 0;
        this.f23094m0 = 0;
        this.f23096n0 = 0;
        float f10 = K0;
        this.f23098o0 = f10;
        this.f23100p0 = f10;
        b[] bVarArr = this.Z;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f23102q0 = null;
        this.f23104r0 = 0;
        this.f23106s0 = 0;
        this.f23112v0 = null;
        this.f23114w0 = false;
        this.f23116x0 = false;
        this.f23120z0 = 0;
        this.A0 = 0;
        this.B0 = false;
        this.C0 = false;
        float[] fArr = this.D0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f23107t = -1;
        this.f23109u = -1;
        int[] iArr = this.H;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f23113w = 0;
        this.f23115x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = a.e.API_PRIORITY_OTHER;
        this.D = a.e.API_PRIORITY_OTHER;
        this.f23119z = 0;
        this.C = 0;
        this.f23083h = false;
        this.F = -1;
        this.G = 1.0f;
        this.f23118y0 = false;
        boolean[] zArr = this.f23081g;
        zArr[0] = true;
        zArr[1] = true;
        this.L = false;
        boolean[] zArr2 = this.Y;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f23085i = true;
        int[] iArr2 = this.f23117y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f23091l = -1;
        this.f23093m = -1;
    }

    public b s(int i10) {
        if (i10 == 0) {
            return y();
        }
        if (i10 == 1) {
            return R();
        }
        return null;
    }

    public void s0() {
        this.f23099p = false;
        this.f23101q = false;
        this.f23103r = false;
        this.f23105s = false;
        int size = this.X.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.X.get(i10).q();
        }
    }

    public float t() {
        return this.f23076d0;
    }

    public void t0(s.c cVar) {
        this.O.r(cVar);
        this.P.r(cVar);
        this.Q.r(cVar);
        this.R.r(cVar);
        this.S.r(cVar);
        this.V.r(cVar);
        this.T.r(cVar);
        this.U.r(cVar);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = this.f23112v0;
        String str3 = MaxReward.DEFAULT_LABEL;
        if (str2 != null) {
            str = "type: " + this.f23112v0 + " ";
        } else {
            str = str3;
        }
        sb2.append(str);
        if (this.f23110u0 != null) {
            str3 = "id: " + this.f23110u0 + " ";
        }
        sb2.append(str3);
        sb2.append("(");
        sb2.append(this.f23080f0);
        sb2.append(", ");
        sb2.append(this.f23082g0);
        sb2.append(") - (");
        sb2.append(this.f23072b0);
        sb2.append(" x ");
        sb2.append(this.f23074c0);
        sb2.append(")");
        return sb2.toString();
    }

    public int u() {
        return this.f23078e0;
    }

    public int v() {
        if (this.f23106s0 == 8) {
            return 0;
        }
        return this.f23074c0;
    }

    public float w() {
        return this.f23098o0;
    }

    public int x() {
        return this.f23120z0;
    }

    public void x0(int i10) {
        this.f23092l0 = i10;
        this.J = i10 > 0;
    }

    public b y() {
        return this.Z[0];
    }

    public void y0(Object obj) {
        this.f23102q0 = obj;
    }

    public int z() {
        d dVar = this.O;
        int i10 = 0;
        if (dVar != null) {
            i10 = 0 + dVar.f23055g;
        }
        d dVar2 = this.Q;
        return dVar2 != null ? i10 + dVar2.f23055g : i10;
    }

    public void z0(String str) {
        this.f23110u0 = str;
    }
}
