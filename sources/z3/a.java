package z3;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Ascii;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k4.a0;
import k4.n0;
import k4.r;
import y3.b;
import y3.h;
import y3.j;
import y3.l;
import y3.m;

/* compiled from: Cea608Decoder */
public final class a extends e {
    /* access modifiers changed from: private */
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, R.styleable.AppCompatTheme_tooltipFrameBackground, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: y  reason: collision with root package name */
    private static final int[] f24151y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z  reason: collision with root package name */
    private static final int[] f24152z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: g  reason: collision with root package name */
    private final a0 f24153g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final int f24154h;

    /* renamed from: i  reason: collision with root package name */
    private final int f24155i;

    /* renamed from: j  reason: collision with root package name */
    private final int f24156j;

    /* renamed from: k  reason: collision with root package name */
    private final long f24157k;

    /* renamed from: l  reason: collision with root package name */
    private final ArrayList<C0251a> f24158l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    private C0251a f24159m = new C0251a(0, 4);

    /* renamed from: n  reason: collision with root package name */
    private List<b> f24160n;

    /* renamed from: o  reason: collision with root package name */
    private List<b> f24161o;

    /* renamed from: p  reason: collision with root package name */
    private int f24162p;

    /* renamed from: q  reason: collision with root package name */
    private int f24163q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f24164r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f24165s;

    /* renamed from: t  reason: collision with root package name */
    private byte f24166t;

    /* renamed from: u  reason: collision with root package name */
    private byte f24167u;

    /* renamed from: v  reason: collision with root package name */
    private int f24168v = 0;

    /* renamed from: w  reason: collision with root package name */
    private boolean f24169w;

    /* renamed from: x  reason: collision with root package name */
    private long f24170x;

    /* renamed from: z3.a$a  reason: collision with other inner class name */
    /* compiled from: Cea608Decoder */
    private static final class C0251a {

        /* renamed from: a  reason: collision with root package name */
        private final List<C0252a> f24171a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<SpannableString> f24172b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final StringBuilder f24173c = new StringBuilder();
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f24174d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f24175e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f24176f;

        /* renamed from: g  reason: collision with root package name */
        private int f24177g;

        /* renamed from: h  reason: collision with root package name */
        private int f24178h;

        /* renamed from: z3.a$a$a  reason: collision with other inner class name */
        /* compiled from: Cea608Decoder */
        private static class C0252a {

            /* renamed from: a  reason: collision with root package name */
            public final int f24179a;

            /* renamed from: b  reason: collision with root package name */
            public final boolean f24180b;

            /* renamed from: c  reason: collision with root package name */
            public int f24181c;

            public C0252a(int i10, boolean z10, int i11) {
                this.f24179a = i10;
                this.f24180b = z10;
                this.f24181c = i11;
            }
        }

        public C0251a(int i10, int i11) {
            j(i10);
            this.f24178h = i11;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f24173c);
            int length = spannableStringBuilder.length();
            int i10 = 0;
            int i11 = -1;
            int i12 = -1;
            int i13 = 0;
            int i14 = -1;
            int i15 = -1;
            boolean z10 = false;
            while (i10 < this.f24171a.size()) {
                C0252a aVar = this.f24171a.get(i10);
                boolean z11 = aVar.f24180b;
                int i16 = aVar.f24179a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i15 = a.A[i16];
                    }
                    z10 = z12;
                }
                int i17 = aVar.f24181c;
                i10++;
                if (i17 != (i10 < this.f24171a.size() ? this.f24171a.get(i10).f24181c : length)) {
                    if (i11 != -1 && !z11) {
                        q(spannableStringBuilder, i11, i17);
                        i11 = -1;
                    } else if (i11 == -1 && z11) {
                        i11 = i17;
                    }
                    if (i12 != -1 && !z10) {
                        o(spannableStringBuilder, i12, i17);
                        i12 = -1;
                    } else if (i12 == -1 && z10) {
                        i12 = i17;
                    }
                    if (i15 != i14) {
                        n(spannableStringBuilder, i13, i17, i14);
                        i14 = i15;
                        i13 = i17;
                    }
                }
            }
            if (!(i11 == -1 || i11 == length)) {
                q(spannableStringBuilder, i11, length);
            }
            if (!(i12 == -1 || i12 == length)) {
                o(spannableStringBuilder, i12, length);
            }
            if (i13 != length) {
                n(spannableStringBuilder, i13, length, i14);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
            }
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void e(char c10) {
            if (this.f24173c.length() < 32) {
                this.f24173c.append(c10);
            }
        }

        public void f() {
            int length = this.f24173c.length();
            if (length > 0) {
                this.f24173c.delete(length - 1, length);
                int size = this.f24171a.size() - 1;
                while (size >= 0) {
                    C0252a aVar = this.f24171a.get(size);
                    int i10 = aVar.f24181c;
                    if (i10 == length) {
                        aVar.f24181c = i10 - 1;
                        size--;
                    } else {
                        return;
                    }
                }
            }
        }

        public b g(int i10) {
            float f10;
            int i11 = this.f24175e + this.f24176f;
            int i12 = 32 - i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f24172b.size(); i13++) {
                spannableStringBuilder.append(n0.Y0(this.f24172b.get(i13), i12));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(n0.Y0(h(), i12));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i12 - spannableStringBuilder.length();
            int i14 = i11 - length;
            if (i10 == Integer.MIN_VALUE) {
                if (this.f24177g != 2 || (Math.abs(i14) >= 3 && length >= 0)) {
                    i10 = (this.f24177g != 2 || i14 <= 0) ? 0 : 2;
                } else {
                    i10 = 1;
                }
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 32 - length;
                }
                f10 = ((((float) i11) / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i15 = this.f24174d;
            if (i15 > 7) {
                i15 = (i15 - 15) - 2;
            } else if (this.f24177g == 1) {
                i15 -= this.f24178h - 1;
            }
            return new b.C0250b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h((float) i15, 1).k(f10).l(i10).a();
        }

        public boolean i() {
            return this.f24171a.isEmpty() && this.f24172b.isEmpty() && this.f24173c.length() == 0;
        }

        public void j(int i10) {
            this.f24177g = i10;
            this.f24171a.clear();
            this.f24172b.clear();
            this.f24173c.setLength(0);
            this.f24174d = 15;
            this.f24175e = 0;
            this.f24176f = 0;
        }

        public void k() {
            this.f24172b.add(h());
            this.f24173c.setLength(0);
            this.f24171a.clear();
            int min = Math.min(this.f24178h, this.f24174d);
            while (this.f24172b.size() >= min) {
                this.f24172b.remove(0);
            }
        }

        public void l(int i10) {
            this.f24177g = i10;
        }

        public void m(int i10) {
            this.f24178h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f24171a.add(new C0252a(i10, z10, this.f24173c.length()));
        }
    }

    public a(String str, int i10, long j10) {
        this.f24157k = j10 > 0 ? j10 * 1000 : -9223372036854775807L;
        this.f24154h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f24156j = 0;
            this.f24155i = 0;
        } else if (i10 == 2) {
            this.f24156j = 1;
            this.f24155i = 0;
        } else if (i10 == 3) {
            this.f24156j = 0;
            this.f24155i = 1;
        } else if (i10 != 4) {
            r.i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f24156j = 0;
            this.f24155i = 0;
        } else {
            this.f24156j = 1;
            this.f24155i = 1;
        }
        M(0);
        L();
        this.f24169w = true;
        this.f24170x = -9223372036854775807L;
    }

    private static boolean A(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    private static boolean B(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    private static boolean C(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    private static boolean D(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    private static boolean E(byte b10) {
        return (b10 & 240) == 16;
    }

    private boolean F(boolean z10, byte b10, byte b11) {
        if (!z10 || !E(b10)) {
            this.f24165s = false;
        } else if (this.f24165s && this.f24166t == b10 && this.f24167u == b11) {
            this.f24165s = false;
            return true;
        } else {
            this.f24165s = true;
            this.f24166t = b10;
            this.f24167u = b11;
        }
        return false;
    }

    private static boolean G(byte b10) {
        return (b10 & 246) == 20;
    }

    private static boolean H(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    private static boolean I(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    private static boolean J(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    private void K(byte b10, byte b11) {
        if (J(b10)) {
            this.f24169w = false;
        } else if (G(b10)) {
            if (!(b11 == 32 || b11 == 47)) {
                switch (b11) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b11) {
                            case 41:
                                break;
                            case 42:
                            case 43:
                                this.f24169w = false;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.f24169w = true;
        }
    }

    private void L() {
        this.f24159m.j(this.f24162p);
        this.f24158l.clear();
        this.f24158l.add(this.f24159m);
    }

    private void M(int i10) {
        int i11 = this.f24162p;
        if (i11 != i10) {
            this.f24162p = i10;
            if (i10 == 3) {
                for (int i12 = 0; i12 < this.f24158l.size(); i12++) {
                    this.f24158l.get(i12).l(i10);
                }
                return;
            }
            L();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f24160n = Collections.emptyList();
            }
        }
    }

    private void N(int i10) {
        this.f24163q = i10;
        this.f24159m.m(i10);
    }

    private boolean O() {
        if (this.f24157k == -9223372036854775807L || this.f24170x == -9223372036854775807L || j() - this.f24170x < this.f24157k) {
            return false;
        }
        return true;
    }

    private boolean P(byte b10) {
        if (z(b10)) {
            this.f24168v = q(b10);
        }
        return this.f24168v == this.f24156j;
    }

    private static char p(byte b10) {
        return (char) B[(b10 & Ascii.DEL) - 32];
    }

    private static int q(byte b10) {
        return (b10 >> 3) & 1;
    }

    private List<b> r() {
        int size = this.f24158l.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            b g10 = this.f24158l.get(i11).g(RecyclerView.UNDEFINED_DURATION);
            arrayList.add(g10);
            if (g10 != null) {
                i10 = Math.min(i10, g10.f23836j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = (b) arrayList.get(i12);
            if (bVar != null) {
                if (bVar.f23836j != i10) {
                    bVar = (b) k4.a.e(this.f24158l.get(i12).g(i10));
                }
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    private static char s(byte b10) {
        return (char) D[b10 & Ascii.US];
    }

    private static char t(byte b10) {
        return (char) E[b10 & Ascii.US];
    }

    private static char u(byte b10, byte b11) {
        if ((b10 & 1) == 0) {
            return s(b11);
        }
        return t(b11);
    }

    private static char v(byte b10) {
        return (char) C[b10 & Ascii.SI];
    }

    private void w(byte b10) {
        this.f24159m.e(' ');
        this.f24159m.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    private void x(byte b10) {
        if (b10 == 32) {
            M(2);
        } else if (b10 != 41) {
            switch (b10) {
                case 37:
                    M(1);
                    N(2);
                    return;
                case 38:
                    M(1);
                    N(3);
                    return;
                case 39:
                    M(1);
                    N(4);
                    return;
                default:
                    int i10 = this.f24162p;
                    if (i10 != 0) {
                        if (b10 != 33) {
                            switch (b10) {
                                case 44:
                                    this.f24160n = Collections.emptyList();
                                    int i11 = this.f24162p;
                                    if (i11 == 1 || i11 == 3) {
                                        L();
                                        return;
                                    }
                                    return;
                                case 45:
                                    if (i10 == 1 && !this.f24159m.i()) {
                                        this.f24159m.k();
                                        return;
                                    }
                                    return;
                                case 46:
                                    L();
                                    return;
                                case 47:
                                    this.f24160n = r();
                                    L();
                                    return;
                                default:
                                    return;
                            }
                        } else {
                            this.f24159m.f();
                            return;
                        }
                    } else {
                        return;
                    }
            }
        } else {
            M(3);
        }
    }

    private void y(byte b10, byte b11) {
        int i10 = f24151y[b10 & 7];
        boolean z10 = false;
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f24159m.f24174d) {
            if (this.f24162p != 1 && !this.f24159m.i()) {
                C0251a aVar = new C0251a(this.f24162p, this.f24163q);
                this.f24159m = aVar;
                this.f24158l.add(aVar);
            }
            int unused = this.f24159m.f24174d = i10;
        }
        boolean z11 = (b11 & Ascii.DLE) == 16;
        if ((b11 & 1) == 1) {
            z10 = true;
        }
        int i11 = (b11 >> 1) & 7;
        this.f24159m.p(z11 ? 8 : i11, z10);
        if (z11) {
            int unused2 = this.f24159m.f24175e = f24152z[i11];
        }
    }

    private static boolean z(byte b10) {
        return (b10 & 224) == 0;
    }

    public /* bridge */ /* synthetic */ void a(long j10) {
        super.a(j10);
    }

    /* access modifiers changed from: protected */
    public h e() {
        List<b> list = this.f24160n;
        this.f24161o = list;
        return new f((List) k4.a.e(list));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0018 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(y3.l r10) {
        /*
            r9 = this;
            java.nio.ByteBuffer r10 = r10.f21755c
            java.lang.Object r10 = k4.a.e(r10)
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            k4.a0 r0 = r9.f24153g
            byte[] r1 = r10.array()
            int r10 = r10.limit()
            r0.R(r1, r10)
            r10 = 0
            r0 = 1
            r1 = 0
        L_0x0018:
            k4.a0 r2 = r9.f24153g
            int r2 = r2.a()
            int r3 = r9.f24154h
            if (r2 < r3) goto L_0x00f5
            r2 = 2
            if (r3 != r2) goto L_0x0027
            r2 = -4
            goto L_0x002d
        L_0x0027:
            k4.a0 r2 = r9.f24153g
            int r2 = r2.G()
        L_0x002d:
            k4.a0 r3 = r9.f24153g
            int r3 = r3.G()
            k4.a0 r4 = r9.f24153g
            int r4 = r4.G()
            r5 = r2 & 2
            if (r5 == 0) goto L_0x003e
            goto L_0x0018
        L_0x003e:
            r5 = r2 & 1
            int r6 = r9.f24155i
            if (r5 == r6) goto L_0x0045
            goto L_0x0018
        L_0x0045:
            r5 = r3 & 127(0x7f, float:1.78E-43)
            byte r5 = (byte) r5
            r6 = r4 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            if (r5 != 0) goto L_0x0050
            if (r6 != 0) goto L_0x0050
            goto L_0x0018
        L_0x0050:
            boolean r7 = r9.f24164r
            r2 = r2 & 4
            r8 = 4
            if (r2 != r8) goto L_0x0063
            boolean[] r2 = F
            boolean r3 = r2[r3]
            if (r3 == 0) goto L_0x0063
            boolean r2 = r2[r4]
            if (r2 == 0) goto L_0x0063
            r2 = 1
            goto L_0x0064
        L_0x0063:
            r2 = 0
        L_0x0064:
            r9.f24164r = r2
            boolean r2 = r9.F(r2, r5, r6)
            if (r2 == 0) goto L_0x006d
            goto L_0x0018
        L_0x006d:
            boolean r2 = r9.f24164r
            if (r2 != 0) goto L_0x0078
            if (r7 == 0) goto L_0x0018
            r9.L()
        L_0x0076:
            r1 = 1
            goto L_0x0018
        L_0x0078:
            r9.K(r5, r6)
            boolean r2 = r9.f24169w
            if (r2 != 0) goto L_0x0080
            goto L_0x0018
        L_0x0080:
            boolean r2 = r9.P(r5)
            if (r2 != 0) goto L_0x0087
            goto L_0x0018
        L_0x0087:
            boolean r1 = z(r5)
            if (r1 == 0) goto L_0x00de
            boolean r1 = H(r5, r6)
            if (r1 == 0) goto L_0x009d
            z3.a$a r1 = r9.f24159m
            char r2 = v(r6)
            r1.e(r2)
            goto L_0x0076
        L_0x009d:
            boolean r1 = A(r5, r6)
            if (r1 == 0) goto L_0x00b2
            z3.a$a r1 = r9.f24159m
            r1.f()
            z3.a$a r1 = r9.f24159m
            char r2 = u(r5, r6)
            r1.e(r2)
            goto L_0x0076
        L_0x00b2:
            boolean r1 = B(r5, r6)
            if (r1 == 0) goto L_0x00bc
            r9.w(r6)
            goto L_0x0076
        L_0x00bc:
            boolean r1 = D(r5, r6)
            if (r1 == 0) goto L_0x00c6
            r9.y(r5, r6)
            goto L_0x0076
        L_0x00c6:
            boolean r1 = I(r5, r6)
            if (r1 == 0) goto L_0x00d4
            z3.a$a r1 = r9.f24159m
            int r6 = r6 + -32
            int unused = r1.f24176f = r6
            goto L_0x0076
        L_0x00d4:
            boolean r1 = C(r5, r6)
            if (r1 == 0) goto L_0x0076
            r9.x(r6)
            goto L_0x0076
        L_0x00de:
            z3.a$a r1 = r9.f24159m
            char r2 = p(r5)
            r1.e(r2)
            r1 = r6 & 224(0xe0, float:3.14E-43)
            if (r1 == 0) goto L_0x0076
            z3.a$a r1 = r9.f24159m
            char r2 = p(r6)
            r1.e(r2)
            goto L_0x0076
        L_0x00f5:
            if (r1 == 0) goto L_0x010a
            int r10 = r9.f24162p
            if (r10 == r0) goto L_0x00fe
            r0 = 3
            if (r10 != r0) goto L_0x010a
        L_0x00fe:
            java.util.List r10 = r9.r()
            r9.f24160n = r10
            long r0 = r9.j()
            r9.f24170x = r0
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.a.f(y3.l):void");
    }

    public void flush() {
        super.flush();
        this.f24160n = null;
        this.f24161o = null;
        M(0);
        N(4);
        L();
        this.f24164r = false;
        this.f24165s = false;
        this.f24166t = 0;
        this.f24167u = 0;
        this.f24168v = 0;
        this.f24169w = true;
        this.f24170x = -9223372036854775807L;
    }

    public /* bridge */ /* synthetic */ l g() throws j {
        return super.c();
    }

    /* renamed from: h */
    public m b() throws j {
        m i10;
        m h10 = super.b();
        if (h10 != null) {
            return h10;
        }
        if (!O() || (i10 = i()) == null) {
            return null;
        }
        this.f24160n = Collections.emptyList();
        this.f24170x = -9223372036854775807L;
        m mVar = i10;
        mVar.r(j(), e(), Long.MAX_VALUE);
        return i10;
    }

    /* access modifiers changed from: protected */
    public boolean k() {
        return this.f24160n != this.f24161o;
    }

    public /* bridge */ /* synthetic */ void l(l lVar) throws j {
        super.d(lVar);
    }

    public void release() {
    }
}
