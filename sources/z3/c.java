package z3;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import k4.a0;
import k4.e;
import k4.r;
import k4.z;
import y3.b;
import y3.h;
import y3.j;
import y3.l;
import y3.m;

/* compiled from: Cea708Decoder */
public final class c extends e {

    /* renamed from: g  reason: collision with root package name */
    private final a0 f24182g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final z f24183h = new z();

    /* renamed from: i  reason: collision with root package name */
    private int f24184i = -1;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f24185j;

    /* renamed from: k  reason: collision with root package name */
    private final int f24186k;

    /* renamed from: l  reason: collision with root package name */
    private final b[] f24187l;

    /* renamed from: m  reason: collision with root package name */
    private b f24188m;

    /* renamed from: n  reason: collision with root package name */
    private List<y3.b> f24189n;

    /* renamed from: o  reason: collision with root package name */
    private List<y3.b> f24190o;

    /* renamed from: p  reason: collision with root package name */
    private C0253c f24191p;

    /* renamed from: q  reason: collision with root package name */
    private int f24192q;

    /* compiled from: Cea708Decoder */
    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final Comparator<a> f24193c = b.f39472a;

        /* renamed from: a  reason: collision with root package name */
        public final y3.b f24194a;

        /* renamed from: b  reason: collision with root package name */
        public final int f24195b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            b.C0250b n10 = new b.C0250b().o(charSequence).p(alignment).h(f10, i10).i(i11).k(f11).l(i12).n(f12);
            if (z10) {
                n10.s(i13);
            }
            this.f24194a = n10.a();
            this.f24195b = i14;
        }
    }

    /* compiled from: Cea708Decoder */
    private static final class b {
        private static final int[] A = {0, 0, 0, 0, 0, 0, 2};
        private static final int[] B = {3, 3, 3, 3, 3, 3, 1};
        private static final boolean[] C = {false, false, false, true, true, true, false};
        private static final int[] D;
        private static final int[] E = {0, 1, 2, 3, 4, 3, 4};
        private static final int[] F = {0, 0, 0, 0, 0, 3, 3};
        private static final int[] G;

        /* renamed from: w  reason: collision with root package name */
        public static final int f24196w = h(2, 2, 2, 0);

        /* renamed from: x  reason: collision with root package name */
        public static final int f24197x;

        /* renamed from: y  reason: collision with root package name */
        public static final int f24198y;

        /* renamed from: z  reason: collision with root package name */
        private static final int[] f24199z = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: a  reason: collision with root package name */
        private final List<SpannableString> f24200a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final SpannableStringBuilder f24201b = new SpannableStringBuilder();

        /* renamed from: c  reason: collision with root package name */
        private boolean f24202c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f24203d;

        /* renamed from: e  reason: collision with root package name */
        private int f24204e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f24205f;

        /* renamed from: g  reason: collision with root package name */
        private int f24206g;

        /* renamed from: h  reason: collision with root package name */
        private int f24207h;

        /* renamed from: i  reason: collision with root package name */
        private int f24208i;

        /* renamed from: j  reason: collision with root package name */
        private int f24209j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f24210k;

        /* renamed from: l  reason: collision with root package name */
        private int f24211l;

        /* renamed from: m  reason: collision with root package name */
        private int f24212m;

        /* renamed from: n  reason: collision with root package name */
        private int f24213n;

        /* renamed from: o  reason: collision with root package name */
        private int f24214o;

        /* renamed from: p  reason: collision with root package name */
        private int f24215p;

        /* renamed from: q  reason: collision with root package name */
        private int f24216q;

        /* renamed from: r  reason: collision with root package name */
        private int f24217r;

        /* renamed from: s  reason: collision with root package name */
        private int f24218s;

        /* renamed from: t  reason: collision with root package name */
        private int f24219t;

        /* renamed from: u  reason: collision with root package name */
        private int f24220u;

        /* renamed from: v  reason: collision with root package name */
        private int f24221v;

        static {
            int h10 = h(0, 0, 0, 0);
            f24197x = h10;
            int h11 = h(0, 0, 0, 3);
            f24198y = h11;
            D = new int[]{h10, h11, h10, h10, h11, h10, h10};
            G = new int[]{h10, h10, h10, h10, h10, h11, h11};
        }

        public b() {
            l();
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                k4.a.c(r4, r0, r1)
                k4.a.c(r5, r0, r1)
                k4.a.c(r6, r0, r1)
                k4.a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L_0x0021
                if (r7 == r1) goto L_0x0021
                r3 = 2
                if (r7 == r3) goto L_0x001e
                r3 = 3
                if (r7 == r3) goto L_0x001c
                goto L_0x0021
            L_0x001c:
                r7 = 0
                goto L_0x0023
            L_0x001e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L_0x0023
            L_0x0021:
                r7 = 255(0xff, float:3.57E-43)
            L_0x0023:
                if (r4 <= r1) goto L_0x0028
                r4 = 255(0xff, float:3.57E-43)
                goto L_0x0029
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r5 <= r1) goto L_0x002e
                r5 = 255(0xff, float:3.57E-43)
                goto L_0x002f
            L_0x002e:
                r5 = 0
            L_0x002f:
                if (r6 <= r1) goto L_0x0033
                r0 = 255(0xff, float:3.57E-43)
            L_0x0033:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: z3.c.b.h(int, int, int, int):int");
        }

        public void a(char c10) {
            if (c10 == 10) {
                this.f24200a.add(d());
                this.f24201b.clear();
                if (this.f24215p != -1) {
                    this.f24215p = 0;
                }
                if (this.f24216q != -1) {
                    this.f24216q = 0;
                }
                if (this.f24217r != -1) {
                    this.f24217r = 0;
                }
                if (this.f24219t != -1) {
                    this.f24219t = 0;
                }
                while (true) {
                    if ((this.f24210k && this.f24200a.size() >= this.f24209j) || this.f24200a.size() >= 15) {
                        this.f24200a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f24201b.append(c10);
            }
        }

        public void b() {
            int length = this.f24201b.length();
            if (length > 0) {
                this.f24201b.delete(length - 1, length);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public z3.c.a c() {
            /*
                r15 = this;
                boolean r0 = r15.j()
                if (r0 == 0) goto L_0x0008
                r0 = 0
                return r0
            L_0x0008:
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r0 = 0
                r1 = 0
            L_0x000f:
                java.util.List<android.text.SpannableString> r3 = r15.f24200a
                int r3 = r3.size()
                if (r1 >= r3) goto L_0x002a
                java.util.List<android.text.SpannableString> r3 = r15.f24200a
                java.lang.Object r3 = r3.get(r1)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r2.append(r3)
                r3 = 10
                r2.append(r3)
                int r1 = r1 + 1
                goto L_0x000f
            L_0x002a:
                android.text.SpannableString r1 = r15.d()
                r2.append(r1)
                int r1 = r15.f24211l
                r3 = 2
                r4 = 3
                r5 = 1
                if (r1 == 0) goto L_0x005e
                if (r1 == r5) goto L_0x005b
                if (r1 == r3) goto L_0x0058
                if (r1 != r4) goto L_0x003f
                goto L_0x005e
            L_0x003f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected justification value: "
                r1.append(r2)
                int r2 = r15.f24211l
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0058:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L_0x0060
            L_0x005b:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L_0x0060
            L_0x005e:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            L_0x0060:
                r6 = r1
                boolean r1 = r15.f24205f
                if (r1 == 0) goto L_0x0070
                int r1 = r15.f24207h
                float r1 = (float) r1
                r7 = 1120272384(0x42c60000, float:99.0)
                float r1 = r1 / r7
                int r8 = r15.f24206g
                float r8 = (float) r8
                float r8 = r8 / r7
                goto L_0x007d
            L_0x0070:
                int r1 = r15.f24207h
                float r1 = (float) r1
                r7 = 1129381888(0x43510000, float:209.0)
                float r1 = r1 / r7
                int r7 = r15.f24206g
                float r7 = (float) r7
                r8 = 1116995584(0x42940000, float:74.0)
                float r8 = r7 / r8
            L_0x007d:
                r7 = 1063675494(0x3f666666, float:0.9)
                float r1 = r1 * r7
                r9 = 1028443341(0x3d4ccccd, float:0.05)
                float r10 = r1 + r9
                float r8 = r8 * r7
                float r7 = r8 + r9
                int r1 = r15.f24208i
                int r8 = r1 / 3
                if (r8 != 0) goto L_0x0093
                r8 = 0
                goto L_0x009a
            L_0x0093:
                int r8 = r1 / 3
                if (r8 != r5) goto L_0x0099
                r8 = 1
                goto L_0x009a
            L_0x0099:
                r8 = 2
            L_0x009a:
                int r9 = r1 % 3
                if (r9 != 0) goto L_0x00a0
                r9 = 0
                goto L_0x00a6
            L_0x00a0:
                int r1 = r1 % r4
                if (r1 != r5) goto L_0x00a5
                r9 = 1
                goto L_0x00a6
            L_0x00a5:
                r9 = 2
            L_0x00a6:
                int r1 = r15.f24214o
                int r3 = f24197x
                if (r1 == r3) goto L_0x00ad
                r0 = 1
            L_0x00ad:
                z3.c$a r13 = new z3.c$a
                r5 = 0
                r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                int r12 = r15.f24214o
                int r14 = r15.f24204e
                r1 = r13
                r3 = r6
                r4 = r7
                r6 = r8
                r7 = r10
                r8 = r9
                r9 = r11
                r10 = r0
                r11 = r12
                r12 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: z3.c.b.c():z3.c$a");
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f24201b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f24215p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f24215p, length, 33);
                }
                if (this.f24216q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f24216q, length, 33);
                }
                if (this.f24217r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f24218s), this.f24217r, length, 33);
                }
                if (this.f24219t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f24220u), this.f24219t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f24200a.clear();
            this.f24201b.clear();
            this.f24215p = -1;
            this.f24216q = -1;
            this.f24217r = -1;
            this.f24219t = -1;
            this.f24221v = 0;
        }

        public void f(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            boolean z14 = z11;
            int i18 = i16;
            int i19 = i17;
            this.f24202c = true;
            this.f24203d = z10;
            this.f24210k = z14;
            this.f24204e = i10;
            this.f24205f = z13;
            this.f24206g = i11;
            this.f24207h = i12;
            this.f24208i = i15;
            int i20 = i13 + 1;
            if (this.f24209j != i20) {
                this.f24209j = i20;
                while (true) {
                    if ((!z14 || this.f24200a.size() < this.f24209j) && this.f24200a.size() < 15) {
                        break;
                    }
                    this.f24200a.remove(0);
                }
            }
            if (!(i18 == 0 || this.f24212m == i18)) {
                this.f24212m = i18;
                int i21 = i18 - 1;
                q(D[i21], f24198y, C[i21], 0, A[i21], B[i21], f24199z[i21]);
            }
            if (i19 != 0 && this.f24213n != i19) {
                this.f24213n = i19;
                int i22 = i19 - 1;
                m(0, 1, 1, false, false, F[i22], E[i22]);
                n(f24196w, G[i22], f24197x);
            }
        }

        public boolean i() {
            return this.f24202c;
        }

        public boolean j() {
            return !i() || (this.f24200a.isEmpty() && this.f24201b.length() == 0);
        }

        public boolean k() {
            return this.f24203d;
        }

        public void l() {
            e();
            this.f24202c = false;
            this.f24203d = false;
            this.f24204e = 4;
            this.f24205f = false;
            this.f24206g = 0;
            this.f24207h = 0;
            this.f24208i = 0;
            this.f24209j = 15;
            this.f24210k = true;
            this.f24211l = 0;
            this.f24212m = 0;
            this.f24213n = 0;
            int i10 = f24197x;
            this.f24214o = i10;
            this.f24218s = f24196w;
            this.f24220u = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f24215p != -1) {
                if (!z10) {
                    this.f24201b.setSpan(new StyleSpan(2), this.f24215p, this.f24201b.length(), 33);
                    this.f24215p = -1;
                }
            } else if (z10) {
                this.f24215p = this.f24201b.length();
            }
            if (this.f24216q != -1) {
                if (!z11) {
                    this.f24201b.setSpan(new UnderlineSpan(), this.f24216q, this.f24201b.length(), 33);
                    this.f24216q = -1;
                }
            } else if (z11) {
                this.f24216q = this.f24201b.length();
            }
        }

        public void n(int i10, int i11, int i12) {
            if (!(this.f24217r == -1 || this.f24218s == i10)) {
                this.f24201b.setSpan(new ForegroundColorSpan(this.f24218s), this.f24217r, this.f24201b.length(), 33);
            }
            if (i10 != f24196w) {
                this.f24217r = this.f24201b.length();
                this.f24218s = i10;
            }
            if (!(this.f24219t == -1 || this.f24220u == i11)) {
                this.f24201b.setSpan(new BackgroundColorSpan(this.f24220u), this.f24219t, this.f24201b.length(), 33);
            }
            if (i11 != f24197x) {
                this.f24219t = this.f24201b.length();
                this.f24220u = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f24221v != i10) {
                a(10);
            }
            this.f24221v = i10;
        }

        public void p(boolean z10) {
            this.f24203d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f24214o = i10;
            this.f24211l = i15;
        }
    }

    /* renamed from: z3.c$c  reason: collision with other inner class name */
    /* compiled from: Cea708Decoder */
    private static final class C0253c {

        /* renamed from: a  reason: collision with root package name */
        public final int f24222a;

        /* renamed from: b  reason: collision with root package name */
        public final int f24223b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f24224c;

        /* renamed from: d  reason: collision with root package name */
        int f24225d = 0;

        public C0253c(int i10, int i11) {
            this.f24222a = i10;
            this.f24223b = i11;
            this.f24224c = new byte[((i11 * 2) - 1)];
        }
    }

    public c(int i10, List<byte[]> list) {
        boolean z10 = true;
        this.f24186k = i10 == -1 ? 1 : i10;
        this.f24185j = (list == null || !e.h(list)) ? false : z10;
        this.f24187l = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f24187l[i11] = new b();
        }
        this.f24188m = this.f24187l[0];
    }

    private void A() {
        int h10 = b.h(this.f24183h.h(2), this.f24183h.h(2), this.f24183h.h(2), this.f24183h.h(2));
        int h11 = b.h(this.f24183h.h(2), this.f24183h.h(2), this.f24183h.h(2), this.f24183h.h(2));
        this.f24183h.r(2);
        this.f24188m.n(h10, h11, b.g(this.f24183h.h(2), this.f24183h.h(2), this.f24183h.h(2)));
    }

    private void B() {
        this.f24183h.r(4);
        int h10 = this.f24183h.h(4);
        this.f24183h.r(2);
        this.f24188m.o(h10, this.f24183h.h(6));
    }

    private void C() {
        int h10 = b.h(this.f24183h.h(2), this.f24183h.h(2), this.f24183h.h(2), this.f24183h.h(2));
        int h11 = this.f24183h.h(2);
        int g10 = b.g(this.f24183h.h(2), this.f24183h.h(2), this.f24183h.h(2));
        if (this.f24183h.g()) {
            h11 |= 4;
        }
        boolean g11 = this.f24183h.g();
        int h12 = this.f24183h.h(2);
        int h13 = this.f24183h.h(2);
        int h14 = this.f24183h.h(2);
        this.f24183h.r(8);
        this.f24188m.q(h10, g10, g11, h11, h12, h13, h14);
    }

    private void D() {
        C0253c cVar = this.f24191p;
        if (cVar.f24225d != (cVar.f24223b * 2) - 1) {
            r.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f24191p.f24223b * 2) - 1) + ", but current index is " + this.f24191p.f24225d + " (sequence number " + this.f24191p.f24222a + ");");
        }
        boolean z10 = false;
        z zVar = this.f24183h;
        C0253c cVar2 = this.f24191p;
        zVar.o(cVar2.f24224c, cVar2.f24225d);
        while (true) {
            if (this.f24183h.b() <= 0) {
                break;
            }
            int h10 = this.f24183h.h(3);
            int h11 = this.f24183h.h(5);
            if (h10 == 7) {
                this.f24183h.r(2);
                h10 = this.f24183h.h(6);
                if (h10 < 7) {
                    r.i("Cea708Decoder", "Invalid extended service number: " + h10);
                }
            }
            if (h11 == 0) {
                if (h10 != 0) {
                    r.i("Cea708Decoder", "serviceNumber is non-zero (" + h10 + ") when blockSize is 0");
                }
            } else if (h10 != this.f24186k) {
                this.f24183h.s(h11);
            } else {
                int e10 = this.f24183h.e() + (h11 * 8);
                while (this.f24183h.e() < e10) {
                    int h12 = this.f24183h.h(8);
                    if (h12 == 16) {
                        int h13 = this.f24183h.h(8);
                        if (h13 <= 31) {
                            s(h13);
                        } else if (h13 <= 127) {
                            x(h13);
                        } else if (h13 <= 159) {
                            t(h13);
                        } else if (h13 <= 255) {
                            y(h13);
                        } else {
                            r.i("Cea708Decoder", "Invalid extended command: " + h13);
                        }
                    } else if (h12 <= 31) {
                        q(h12);
                    } else if (h12 <= 127) {
                        v(h12);
                    } else if (h12 <= 159) {
                        r(h12);
                    } else if (h12 <= 255) {
                        w(h12);
                    } else {
                        r.i("Cea708Decoder", "Invalid base command: " + h12);
                    }
                    z10 = true;
                }
            }
        }
        if (z10) {
            this.f24189n = p();
        }
    }

    private void E() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f24187l[i10].l();
        }
    }

    private void o() {
        if (this.f24191p != null) {
            D();
            this.f24191p = null;
        }
    }

    private List<y3.b> p() {
        a c10;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f24187l[i10].j() && this.f24187l[i10].k() && (c10 = this.f24187l[i10].c()) != null) {
                arrayList.add(c10);
            }
        }
        Collections.sort(arrayList, a.f24193c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f24194a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void q(int i10) {
        if (i10 == 0) {
            return;
        }
        if (i10 == 3) {
            this.f24189n = p();
        } else if (i10 != 8) {
            switch (i10) {
                case 12:
                    E();
                    return;
                case 13:
                    this.f24188m.a(10);
                    return;
                case 14:
                    return;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        r.i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        this.f24183h.r(8);
                        return;
                    } else if (i10 < 24 || i10 > 31) {
                        r.i("Cea708Decoder", "Invalid C0 command: " + i10);
                        return;
                    } else {
                        r.i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        this.f24183h.r(16);
                        return;
                    }
            }
        } else {
            this.f24188m.b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        if (r4.f24183h.g() == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        r4.f24187l[8 - r2].l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        if (r4.f24183h.g() == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cf, code lost:
        r4.f24187l[8 - r2].p(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d9, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f3, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fb, code lost:
        if (r4.f24183h.g() == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fd, code lost:
        r4.f24187l[8 - r2].e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0106, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r(int r5) {
        /*
            r4 = this;
            r0 = 16
            r1 = 8
            r2 = 1
            switch(r5) {
                case 128: goto L_0x0109;
                case 129: goto L_0x0109;
                case 130: goto L_0x0109;
                case 131: goto L_0x0109;
                case 132: goto L_0x0109;
                case 133: goto L_0x0109;
                case 134: goto L_0x0109;
                case 135: goto L_0x0109;
                case 136: goto L_0x00f3;
                case 137: goto L_0x00dc;
                case 138: goto L_0x00c5;
                case 139: goto L_0x00a9;
                case 140: goto L_0x0093;
                case 141: goto L_0x008c;
                case 142: goto L_0x0117;
                case 143: goto L_0x0087;
                case 144: goto L_0x0073;
                case 145: goto L_0x005d;
                case 146: goto L_0x0049;
                case 147: goto L_0x0008;
                case 148: goto L_0x0008;
                case 149: goto L_0x0008;
                case 150: goto L_0x0008;
                case 151: goto L_0x0033;
                case 152: goto L_0x0020;
                case 153: goto L_0x0020;
                case 154: goto L_0x0020;
                case 155: goto L_0x0020;
                case 156: goto L_0x0020;
                case 157: goto L_0x0020;
                case 158: goto L_0x0020;
                case 159: goto L_0x0020;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid C1 command: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "Cea708Decoder"
            k4.r.i(r0, r5)
            goto L_0x0117
        L_0x0020:
            int r5 = r5 + -152
            r4.u(r5)
            int r0 = r4.f24192q
            if (r0 == r5) goto L_0x0117
            r4.f24192q = r5
            z3.c$b[] r0 = r4.f24187l
            r5 = r0[r5]
            r4.f24188m = r5
            goto L_0x0117
        L_0x0033:
            z3.c$b r5 = r4.f24188m
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x0044
            k4.z r5 = r4.f24183h
            r0 = 32
            r5.r(r0)
            goto L_0x0117
        L_0x0044:
            r4.C()
            goto L_0x0117
        L_0x0049:
            z3.c$b r5 = r4.f24188m
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x0058
            k4.z r5 = r4.f24183h
            r5.r(r0)
            goto L_0x0117
        L_0x0058:
            r4.B()
            goto L_0x0117
        L_0x005d:
            z3.c$b r5 = r4.f24188m
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x006e
            k4.z r5 = r4.f24183h
            r0 = 24
            r5.r(r0)
            goto L_0x0117
        L_0x006e:
            r4.A()
            goto L_0x0117
        L_0x0073:
            z3.c$b r5 = r4.f24188m
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x0082
            k4.z r5 = r4.f24183h
            r5.r(r0)
            goto L_0x0117
        L_0x0082:
            r4.z()
            goto L_0x0117
        L_0x0087:
            r4.E()
            goto L_0x0117
        L_0x008c:
            k4.z r5 = r4.f24183h
            r5.r(r1)
            goto L_0x0117
        L_0x0093:
            if (r2 > r1) goto L_0x0117
            k4.z r5 = r4.f24183h
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x00a6
            z3.c$b[] r5 = r4.f24187l
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.l()
        L_0x00a6:
            int r2 = r2 + 1
            goto L_0x0093
        L_0x00a9:
            r5 = 1
        L_0x00aa:
            if (r5 > r1) goto L_0x0117
            k4.z r0 = r4.f24183h
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x00c2
            z3.c$b[] r0 = r4.f24187l
            int r3 = 8 - r5
            r0 = r0[r3]
            boolean r3 = r0.k()
            r3 = r3 ^ r2
            r0.p(r3)
        L_0x00c2:
            int r5 = r5 + 1
            goto L_0x00aa
        L_0x00c5:
            if (r2 > r1) goto L_0x0117
            k4.z r5 = r4.f24183h
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x00d9
            z3.c$b[] r5 = r4.f24187l
            int r0 = 8 - r2
            r5 = r5[r0]
            r0 = 0
            r5.p(r0)
        L_0x00d9:
            int r2 = r2 + 1
            goto L_0x00c5
        L_0x00dc:
            r5 = 1
        L_0x00dd:
            if (r5 > r1) goto L_0x0117
            k4.z r0 = r4.f24183h
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x00f0
            z3.c$b[] r0 = r4.f24187l
            int r3 = 8 - r5
            r0 = r0[r3]
            r0.p(r2)
        L_0x00f0:
            int r5 = r5 + 1
            goto L_0x00dd
        L_0x00f3:
            if (r2 > r1) goto L_0x0117
            k4.z r5 = r4.f24183h
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x0106
            z3.c$b[] r5 = r4.f24187l
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.e()
        L_0x0106:
            int r2 = r2 + 1
            goto L_0x00f3
        L_0x0109:
            int r5 = r5 + -128
            int r0 = r4.f24192q
            if (r0 == r5) goto L_0x0117
            r4.f24192q = r5
            z3.c$b[] r0 = r4.f24187l
            r5 = r0[r5]
            r4.f24188m = r5
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.c.r(int):void");
    }

    private void s(int i10) {
        if (i10 > 7) {
            if (i10 <= 15) {
                this.f24183h.r(8);
            } else if (i10 <= 23) {
                this.f24183h.r(16);
            } else if (i10 <= 31) {
                this.f24183h.r(24);
            }
        }
    }

    private void t(int i10) {
        if (i10 <= 135) {
            this.f24183h.r(32);
        } else if (i10 <= 143) {
            this.f24183h.r(40);
        } else if (i10 <= 159) {
            this.f24183h.r(2);
            this.f24183h.r(this.f24183h.h(6) * 8);
        }
    }

    private void u(int i10) {
        b bVar = this.f24187l[i10];
        this.f24183h.r(2);
        boolean g10 = this.f24183h.g();
        boolean g11 = this.f24183h.g();
        boolean g12 = this.f24183h.g();
        int h10 = this.f24183h.h(3);
        boolean g13 = this.f24183h.g();
        int h11 = this.f24183h.h(7);
        int h12 = this.f24183h.h(8);
        int h13 = this.f24183h.h(4);
        int h14 = this.f24183h.h(4);
        this.f24183h.r(2);
        int h15 = this.f24183h.h(6);
        this.f24183h.r(2);
        bVar.f(g10, g11, g12, h10, g13, h11, h12, h14, h15, h13, this.f24183h.h(3), this.f24183h.h(3));
    }

    private void v(int i10) {
        if (i10 == 127) {
            this.f24188m.a(9835);
        } else {
            this.f24188m.a((char) (i10 & 255));
        }
    }

    private void w(int i10) {
        this.f24188m.a((char) (i10 & 255));
    }

    private void x(int i10) {
        if (i10 == 32) {
            this.f24188m.a(' ');
        } else if (i10 == 33) {
            this.f24188m.a(160);
        } else if (i10 == 37) {
            this.f24188m.a(8230);
        } else if (i10 == 42) {
            this.f24188m.a(352);
        } else if (i10 == 44) {
            this.f24188m.a(338);
        } else if (i10 == 63) {
            this.f24188m.a(376);
        } else if (i10 == 57) {
            this.f24188m.a(8482);
        } else if (i10 == 58) {
            this.f24188m.a(353);
        } else if (i10 == 60) {
            this.f24188m.a(339);
        } else if (i10 != 61) {
            switch (i10) {
                case 48:
                    this.f24188m.a(9608);
                    return;
                case 49:
                    this.f24188m.a(8216);
                    return;
                case 50:
                    this.f24188m.a(8217);
                    return;
                case 51:
                    this.f24188m.a(8220);
                    return;
                case 52:
                    this.f24188m.a(8221);
                    return;
                case 53:
                    this.f24188m.a(8226);
                    return;
                default:
                    switch (i10) {
                        case 118:
                            this.f24188m.a(8539);
                            return;
                        case 119:
                            this.f24188m.a(8540);
                            return;
                        case 120:
                            this.f24188m.a(8541);
                            return;
                        case 121:
                            this.f24188m.a(8542);
                            return;
                        case 122:
                            this.f24188m.a(9474);
                            return;
                        case 123:
                            this.f24188m.a(9488);
                            return;
                        case 124:
                            this.f24188m.a(9492);
                            return;
                        case 125:
                            this.f24188m.a(9472);
                            return;
                        case 126:
                            this.f24188m.a(9496);
                            return;
                        case 127:
                            this.f24188m.a(9484);
                            return;
                        default:
                            r.i("Cea708Decoder", "Invalid G2 character: " + i10);
                            return;
                    }
            }
        } else {
            this.f24188m.a(8480);
        }
    }

    private void y(int i10) {
        if (i10 == 160) {
            this.f24188m.a(13252);
            return;
        }
        r.i("Cea708Decoder", "Invalid G3 character: " + i10);
        this.f24188m.a('_');
    }

    private void z() {
        this.f24188m.m(this.f24183h.h(4), this.f24183h.h(2), this.f24183h.h(2), this.f24183h.g(), this.f24183h.g(), this.f24183h.h(3), this.f24183h.h(3));
    }

    public /* bridge */ /* synthetic */ void a(long j10) {
        super.a(j10);
    }

    /* access modifiers changed from: protected */
    public h e() {
        List<y3.b> list = this.f24189n;
        this.f24190o = list;
        return new f((List) k4.a.e(list));
    }

    /* access modifiers changed from: protected */
    public void f(l lVar) {
        ByteBuffer byteBuffer = (ByteBuffer) k4.a.e(lVar.f21755c);
        this.f24182g.R(byteBuffer.array(), byteBuffer.limit());
        while (this.f24182g.a() >= 3) {
            int G = this.f24182g.G() & 7;
            int i10 = G & 3;
            boolean z10 = false;
            boolean z11 = (G & 4) == 4;
            byte G2 = (byte) this.f24182g.G();
            byte G3 = (byte) this.f24182g.G();
            if ((i10 == 2 || i10 == 3) && z11) {
                if (i10 == 3) {
                    o();
                    int i11 = (G2 & 192) >> 6;
                    int i12 = this.f24184i;
                    if (!(i12 == -1 || i11 == (i12 + 1) % 4)) {
                        E();
                        r.i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f24184i + " current=" + i11);
                    }
                    this.f24184i = i11;
                    byte b10 = G2 & 63;
                    if (b10 == 0) {
                        b10 = 64;
                    }
                    C0253c cVar = new C0253c(i11, b10);
                    this.f24191p = cVar;
                    byte[] bArr = cVar.f24224c;
                    int i13 = cVar.f24225d;
                    cVar.f24225d = i13 + 1;
                    bArr[i13] = G3;
                } else {
                    if (i10 == 2) {
                        z10 = true;
                    }
                    k4.a.a(z10);
                    C0253c cVar2 = this.f24191p;
                    if (cVar2 == null) {
                        r.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = cVar2.f24224c;
                        int i14 = cVar2.f24225d;
                        int i15 = i14 + 1;
                        cVar2.f24225d = i15;
                        bArr2[i14] = G2;
                        cVar2.f24225d = i15 + 1;
                        bArr2[i15] = G3;
                    }
                }
                C0253c cVar3 = this.f24191p;
                if (cVar3.f24225d == (cVar3.f24223b * 2) - 1) {
                    o();
                }
            }
        }
    }

    public void flush() {
        super.flush();
        this.f24189n = null;
        this.f24190o = null;
        this.f24192q = 0;
        this.f24188m = this.f24187l[0];
        E();
        this.f24191p = null;
    }

    public /* bridge */ /* synthetic */ l g() throws j {
        return super.c();
    }

    public /* bridge */ /* synthetic */ m h() throws j {
        return super.b();
    }

    /* access modifiers changed from: protected */
    public boolean k() {
        return this.f24189n != this.f24190o;
    }

    public /* bridge */ /* synthetic */ void l(l lVar) throws j {
        super.d(lVar);
    }

    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}
