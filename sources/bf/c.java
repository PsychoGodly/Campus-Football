package bf;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;
import java.util.concurrent.TimeUnit;

/* compiled from: CacheControl */
public final class c {

    /* renamed from: n  reason: collision with root package name */
    public static final c f31657n = new a().c().a();

    /* renamed from: o  reason: collision with root package name */
    public static final c f31658o = new a().d().b(a.e.API_PRIORITY_OTHER, TimeUnit.SECONDS).a();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f31659a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f31660b;

    /* renamed from: c  reason: collision with root package name */
    private final int f31661c;

    /* renamed from: d  reason: collision with root package name */
    private final int f31662d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f31663e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f31664f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f31665g;

    /* renamed from: h  reason: collision with root package name */
    private final int f31666h;

    /* renamed from: i  reason: collision with root package name */
    private final int f31667i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f31668j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f31669k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f31670l;

    /* renamed from: m  reason: collision with root package name */
    String f31671m;

    /* compiled from: CacheControl */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f31672a;

        /* renamed from: b  reason: collision with root package name */
        boolean f31673b;

        /* renamed from: c  reason: collision with root package name */
        int f31674c = -1;

        /* renamed from: d  reason: collision with root package name */
        int f31675d = -1;

        /* renamed from: e  reason: collision with root package name */
        int f31676e = -1;

        /* renamed from: f  reason: collision with root package name */
        boolean f31677f;

        /* renamed from: g  reason: collision with root package name */
        boolean f31678g;

        /* renamed from: h  reason: collision with root package name */
        boolean f31679h;

        public c a() {
            return new c(this);
        }

        public a b(int i10, TimeUnit timeUnit) {
            if (i10 >= 0) {
                long seconds = timeUnit.toSeconds((long) i10);
                this.f31675d = seconds > 2147483647L ? a.e.API_PRIORITY_OTHER : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i10);
        }

        public a c() {
            this.f31672a = true;
            return this;
        }

        public a d() {
            this.f31677f = true;
            return this;
        }
    }

    private c(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f31659a = z10;
        this.f31660b = z11;
        this.f31661c = i10;
        this.f31662d = i11;
        this.f31663e = z12;
        this.f31664f = z13;
        this.f31665g = z14;
        this.f31666h = i12;
        this.f31667i = i13;
        this.f31668j = z15;
        this.f31669k = z16;
        this.f31670l = z17;
        this.f31671m = str;
    }

    private String a() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f31659a) {
            sb2.append("no-cache, ");
        }
        if (this.f31660b) {
            sb2.append("no-store, ");
        }
        if (this.f31661c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f31661c);
            sb2.append(", ");
        }
        if (this.f31662d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f31662d);
            sb2.append(", ");
        }
        if (this.f31663e) {
            sb2.append("private, ");
        }
        if (this.f31664f) {
            sb2.append("public, ");
        }
        if (this.f31665g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f31666h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f31666h);
            sb2.append(", ");
        }
        if (this.f31667i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f31667i);
            sb2.append(", ");
        }
        if (this.f31668j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f31669k) {
            sb2.append("no-transform, ");
        }
        if (this.f31670l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return MaxReward.DEFAULT_LABEL;
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        return sb2.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static bf.c k(bf.q r22) {
        /*
            r0 = r22
            int r1 = r22.g()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x001a:
            if (r6 >= r1) goto L_0x013f
            java.lang.String r2 = r0.e(r6)
            java.lang.String r4 = r0.i(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0031
            if (r8 == 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            r8 = r4
            goto L_0x003a
        L_0x0031:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x0138
        L_0x0039:
            r7 = 0
        L_0x003a:
            r2 = 0
        L_0x003b:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x0138
            java.lang.String r3 = "=,;"
            int r3 = ff.e.f(r4, r2, r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x0099
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x0099
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x0066
            goto L_0x0099
        L_0x0066:
            int r3 = r3 + 1
            int r0 = ff.e.g(r4, r3)
            int r3 = r4.length()
            if (r0 >= r3) goto L_0x0089
            char r3 = r4.charAt(r0)
            r5 = 34
            if (r3 != r5) goto L_0x0089
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = ff.e.f(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x009d
        L_0x0089:
            r5 = 1
            java.lang.String r3 = ",;"
            int r3 = ff.e.f(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            java.lang.String r0 = r0.trim()
            goto L_0x009d
        L_0x0099:
            r5 = 1
            int r3 = r3 + 1
            r0 = 0
        L_0x009d:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00a9
            r5 = -1
            r9 = 1
            goto L_0x0133
        L_0x00a9:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00b5
            r5 = -1
            r10 = 1
            goto L_0x0133
        L_0x00b5:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c4
            r5 = -1
            int r11 = ff.e.d(r0, r5)
            goto L_0x0133
        L_0x00c4:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00d2
            r5 = -1
            int r12 = ff.e.d(r0, r5)
            goto L_0x0133
        L_0x00d2:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00dd
            r5 = -1
            r13 = 1
            goto L_0x0133
        L_0x00dd:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e8
            r5 = -1
            r14 = 1
            goto L_0x0133
        L_0x00e8:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00f3
            r5 = -1
            r15 = 1
            goto L_0x0133
        L_0x00f3:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0104
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r16 = ff.e.d(r0, r2)
            r5 = -1
            goto L_0x0133
        L_0x0104:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0112
            r5 = -1
            int r17 = ff.e.d(r0, r5)
            goto L_0x0133
        L_0x0112:
            r5 = -1
            java.lang.String r0 = "only-if-cached"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x011e
            r18 = 1
            goto L_0x0133
        L_0x011e:
            java.lang.String r0 = "no-transform"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0129
            r19 = 1
            goto L_0x0133
        L_0x0129:
            java.lang.String r0 = "immutable"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0133
            r20 = 1
        L_0x0133:
            r0 = r22
            r2 = r3
            goto L_0x003b
        L_0x0138:
            r5 = -1
            int r6 = r6 + 1
            r0 = r22
            goto L_0x001a
        L_0x013f:
            if (r7 != 0) goto L_0x0144
            r21 = 0
            goto L_0x0146
        L_0x0144:
            r21 = r8
        L_0x0146:
            bf.c r0 = new bf.c
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.c.k(bf.q):bf.c");
    }

    public boolean b() {
        return this.f31663e;
    }

    public boolean c() {
        return this.f31664f;
    }

    public int d() {
        return this.f31661c;
    }

    public int e() {
        return this.f31666h;
    }

    public int f() {
        return this.f31667i;
    }

    public boolean g() {
        return this.f31665g;
    }

    public boolean h() {
        return this.f31659a;
    }

    public boolean i() {
        return this.f31660b;
    }

    public boolean j() {
        return this.f31668j;
    }

    public String toString() {
        String str = this.f31671m;
        if (str != null) {
            return str;
        }
        String a10 = a();
        this.f31671m = a10;
        return a10;
    }

    c(a aVar) {
        this.f31659a = aVar.f31672a;
        this.f31660b = aVar.f31673b;
        this.f31661c = aVar.f31674c;
        this.f31662d = -1;
        this.f31663e = false;
        this.f31664f = false;
        this.f31665g = false;
        this.f31666h = aVar.f31675d;
        this.f31667i = aVar.f31676e;
        this.f31668j = aVar.f31677f;
        this.f31669k = aVar.f31678g;
        this.f31670l = aVar.f31679h;
    }
}
