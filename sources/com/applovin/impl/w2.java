package com.applovin.impl;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.z4;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class w2 extends y2 {
    /* access modifiers changed from: private */
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, R.styleable.AppCompatTheme_tooltipFrameBackground, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: y  reason: collision with root package name */
    private static final int[] f12909y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z  reason: collision with root package name */
    private static final int[] f12910z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: g  reason: collision with root package name */
    private final yg f12911g = new yg();

    /* renamed from: h  reason: collision with root package name */
    private final int f12912h;

    /* renamed from: i  reason: collision with root package name */
    private final int f12913i;

    /* renamed from: j  reason: collision with root package name */
    private final int f12914j;

    /* renamed from: k  reason: collision with root package name */
    private final long f12915k;

    /* renamed from: l  reason: collision with root package name */
    private final ArrayList f12916l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private a f12917m = new a(0, 4);

    /* renamed from: n  reason: collision with root package name */
    private List f12918n;

    /* renamed from: o  reason: collision with root package name */
    private List f12919o;

    /* renamed from: p  reason: collision with root package name */
    private int f12920p;

    /* renamed from: q  reason: collision with root package name */
    private int f12921q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f12922r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f12923s;

    /* renamed from: t  reason: collision with root package name */
    private byte f12924t;

    /* renamed from: u  reason: collision with root package name */
    private byte f12925u;

    /* renamed from: v  reason: collision with root package name */
    private int f12926v = 0;

    /* renamed from: w  reason: collision with root package name */
    private boolean f12927w;

    /* renamed from: x  reason: collision with root package name */
    private long f12928x;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List f12929a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List f12930b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final StringBuilder f12931c = new StringBuilder();
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f12932d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f12933e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f12934f;

        /* renamed from: g  reason: collision with root package name */
        private int f12935g;

        /* renamed from: h  reason: collision with root package name */
        private int f12936h;

        /* renamed from: com.applovin.impl.w2$a$a  reason: collision with other inner class name */
        private static class C0143a {

            /* renamed from: a  reason: collision with root package name */
            public final int f12937a;

            /* renamed from: b  reason: collision with root package name */
            public final boolean f12938b;

            /* renamed from: c  reason: collision with root package name */
            public int f12939c;

            public C0143a(int i10, boolean z10, int i11) {
                this.f12937a = i10;
                this.f12938b = z10;
                this.f12939c = i11;
            }
        }

        public a(int i10, int i11) {
            b(i10);
            this.f12936h = i11;
        }

        public void d() {
            this.f12930b.add(b());
            this.f12931c.setLength(0);
            this.f12929a.clear();
            int min = Math.min(this.f12936h, this.f12932d);
            while (this.f12930b.size() >= min) {
                this.f12930b.remove(0);
            }
        }

        public void b(int i10) {
            this.f12935g = i10;
            this.f12929a.clear();
            this.f12930b.clear();
            this.f12931c.setLength(0);
            this.f12932d = 15;
            this.f12933e = 0;
            this.f12934f = 0;
        }

        public boolean c() {
            return this.f12929a.isEmpty() && this.f12930b.isEmpty() && this.f12931c.length() == 0;
        }

        public void a(char c10) {
            if (this.f12931c.length() < 32) {
                this.f12931c.append(c10);
            }
        }

        public void a() {
            int length = this.f12931c.length();
            if (length > 0) {
                this.f12931c.delete(length - 1, length);
                int size = this.f12929a.size() - 1;
                while (size >= 0) {
                    C0143a aVar = (C0143a) this.f12929a.get(size);
                    int i10 = aVar.f12939c;
                    if (i10 == length) {
                        aVar.f12939c = i10 - 1;
                        size--;
                    } else {
                        return;
                    }
                }
            }
        }

        public void c(int i10) {
            this.f12935g = i10;
        }

        public void d(int i10) {
            this.f12936h = i10;
        }

        private static void b(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        private SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f12931c);
            int length = spannableStringBuilder.length();
            int i10 = 0;
            int i11 = -1;
            int i12 = -1;
            int i13 = 0;
            int i14 = -1;
            boolean z10 = false;
            int i15 = -1;
            while (i10 < this.f12929a.size()) {
                C0143a aVar = (C0143a) this.f12929a.get(i10);
                boolean z11 = aVar.f12938b;
                int i16 = aVar.f12937a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i15 = w2.A[i16];
                    }
                    z10 = z12;
                }
                int i17 = aVar.f12939c;
                i10++;
                if (i17 != (i10 < this.f12929a.size() ? ((C0143a) this.f12929a.get(i10)).f12939c : length)) {
                    if (i11 != -1 && !z11) {
                        b(spannableStringBuilder, i11, i17);
                        i11 = -1;
                    } else if (i11 == -1 && z11) {
                        i11 = i17;
                    }
                    if (i12 != -1 && !z10) {
                        a(spannableStringBuilder, i12, i17);
                        i12 = -1;
                    } else if (i12 == -1 && z10) {
                        i12 = i17;
                    }
                    if (i15 != i14) {
                        a(spannableStringBuilder, i13, i17, i14);
                        i14 = i15;
                        i13 = i17;
                    }
                }
            }
            if (!(i11 == -1 || i11 == length)) {
                b(spannableStringBuilder, i11, length);
            }
            if (!(i12 == -1 || i12 == length)) {
                a(spannableStringBuilder, i12, length);
            }
            if (i13 != length) {
                a(spannableStringBuilder, i13, length, i14);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public z4 a(int i10) {
            float f10;
            int i11 = this.f12933e + this.f12934f;
            int i12 = 32 - i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f12930b.size(); i13++) {
                spannableStringBuilder.append(yp.a((CharSequence) this.f12930b.get(i13), i12));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(yp.a((CharSequence) b(), i12));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i12 - spannableStringBuilder.length();
            int i14 = i11 - length;
            if (i10 == Integer.MIN_VALUE) {
                if (this.f12935g != 2 || (Math.abs(i14) >= 3 && length >= 0)) {
                    i10 = (this.f12935g != 2 || i14 <= 0) ? 0 : 2;
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
            int i15 = this.f12932d;
            if (i15 > 7) {
                i15 -= 17;
            } else if (this.f12935g == 1) {
                i15 -= this.f12936h - 1;
            }
            return new z4.b().a((CharSequence) spannableStringBuilder).b(Layout.Alignment.ALIGN_NORMAL).a((float) i15, 1).b(f10).b(i10).a();
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
            }
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        public void a(int i10, boolean z10) {
            this.f12929a.add(new C0143a(i10, z10, this.f12931c.length()));
        }
    }

    public w2(String str, int i10, long j10) {
        this.f12915k = j10 > 0 ? j10 * 1000 : -9223372036854775807L;
        this.f12912h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f12914j = 0;
            this.f12913i = 0;
        } else if (i10 == 2) {
            this.f12914j = 1;
            this.f12913i = 0;
        } else if (i10 == 3) {
            this.f12914j = 0;
            this.f12913i = 1;
        } else if (i10 != 4) {
            kc.d("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f12914j = 0;
            this.f12913i = 0;
        } else {
            this.f12914j = 1;
            this.f12913i = 1;
        }
        a(0);
        m();
        this.f12927w = true;
        this.f12928x = -9223372036854775807L;
    }

    private static int b(byte b10) {
        return (b10 >> 3) & 1;
    }

    private static boolean c(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    private static char d(byte b10) {
        return (char) E[b10 & Ascii.US];
    }

    private static boolean d(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    private static boolean e(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    private static boolean f(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    private static boolean g(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    private static boolean h(byte b10) {
        return (b10 & 224) == 0;
    }

    private static boolean h(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    private void i(byte b10, byte b11) {
        if (k(b10)) {
            this.f12927w = false;
        } else if (j(b10)) {
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
                                this.f12927w = false;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.f12927w = true;
        }
    }

    private static boolean i(byte b10) {
        return (b10 & 240) == 16;
    }

    private static boolean j(byte b10) {
        return (b10 & 247) == 20;
    }

    private static boolean k(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    private List l() {
        int size = this.f12916l.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            z4 a10 = ((a) this.f12916l.get(i11)).a((int) RecyclerView.UNDEFINED_DURATION);
            arrayList.add(a10);
            if (a10 != null) {
                i10 = Math.min(i10, a10.f13760j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            z4 z4Var = (z4) arrayList.get(i12);
            if (z4Var != null) {
                if (z4Var.f13760j != i10) {
                    z4Var = (z4) a1.a((Object) ((a) this.f12916l.get(i12)).a(i10));
                }
                arrayList2.add(z4Var);
            }
        }
        return arrayList2;
    }

    private void m() {
        this.f12917m.b(this.f12920p);
        this.f12916l.clear();
        this.f12916l.add(this.f12917m);
    }

    private boolean n() {
        if (this.f12915k == -9223372036854775807L || this.f12928x == -9223372036854775807L || i() - this.f12928x < this.f12915k) {
            return false;
        }
        return true;
    }

    public void a() {
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0018 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.applovin.impl.ol r10) {
        /*
            r9 = this;
            java.nio.ByteBuffer r10 = r10.f9906c
            java.lang.Object r10 = com.applovin.impl.a1.a((java.lang.Object) r10)
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            com.applovin.impl.yg r0 = r9.f12911g
            byte[] r1 = r10.array()
            int r10 = r10.limit()
            r0.a((byte[]) r1, (int) r10)
            r10 = 0
            r0 = 1
            r1 = 0
        L_0x0018:
            com.applovin.impl.yg r2 = r9.f12911g
            int r2 = r2.a()
            int r3 = r9.f12912h
            if (r2 < r3) goto L_0x00f6
            r2 = 2
            if (r3 != r2) goto L_0x0027
            r2 = -4
            goto L_0x002e
        L_0x0027:
            com.applovin.impl.yg r2 = r9.f12911g
            int r2 = r2.w()
            byte r2 = (byte) r2
        L_0x002e:
            com.applovin.impl.yg r3 = r9.f12911g
            int r3 = r3.w()
            com.applovin.impl.yg r4 = r9.f12911g
            int r4 = r4.w()
            r5 = r2 & 2
            if (r5 == 0) goto L_0x003f
            goto L_0x0018
        L_0x003f:
            r5 = r2 & 1
            int r6 = r9.f12913i
            if (r5 == r6) goto L_0x0046
            goto L_0x0018
        L_0x0046:
            r5 = r3 & 127(0x7f, float:1.78E-43)
            byte r5 = (byte) r5
            r6 = r4 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            if (r5 != 0) goto L_0x0051
            if (r6 != 0) goto L_0x0051
            goto L_0x0018
        L_0x0051:
            boolean r7 = r9.f12922r
            r2 = r2 & 4
            r8 = 4
            if (r2 != r8) goto L_0x0064
            boolean[] r2 = F
            boolean r3 = r2[r3]
            if (r3 == 0) goto L_0x0064
            boolean r2 = r2[r4]
            if (r2 == 0) goto L_0x0064
            r2 = 1
            goto L_0x0065
        L_0x0064:
            r2 = 0
        L_0x0065:
            r9.f12922r = r2
            boolean r2 = r9.a(r2, r5, r6)
            if (r2 == 0) goto L_0x006e
            goto L_0x0018
        L_0x006e:
            boolean r2 = r9.f12922r
            if (r2 != 0) goto L_0x0079
            if (r7 == 0) goto L_0x0018
            r9.m()
        L_0x0077:
            r1 = 1
            goto L_0x0018
        L_0x0079:
            r9.i(r5, r6)
            boolean r2 = r9.f12927w
            if (r2 != 0) goto L_0x0081
            goto L_0x0018
        L_0x0081:
            boolean r2 = r9.l(r5)
            if (r2 != 0) goto L_0x0088
            goto L_0x0018
        L_0x0088:
            boolean r1 = h(r5)
            if (r1 == 0) goto L_0x00df
            boolean r1 = g(r5, r6)
            if (r1 == 0) goto L_0x009e
            com.applovin.impl.w2$a r1 = r9.f12917m
            char r2 = e(r6)
            r1.a((char) r2)
            goto L_0x0077
        L_0x009e:
            boolean r1 = c(r5, r6)
            if (r1 == 0) goto L_0x00b3
            com.applovin.impl.w2$a r1 = r9.f12917m
            r1.a()
            com.applovin.impl.w2$a r1 = r9.f12917m
            char r2 = a(r5, r6)
            r1.a((char) r2)
            goto L_0x0077
        L_0x00b3:
            boolean r1 = d(r5, r6)
            if (r1 == 0) goto L_0x00bd
            r9.f(r6)
            goto L_0x0077
        L_0x00bd:
            boolean r1 = f(r5, r6)
            if (r1 == 0) goto L_0x00c7
            r9.b(r5, r6)
            goto L_0x0077
        L_0x00c7:
            boolean r1 = h(r5, r6)
            if (r1 == 0) goto L_0x00d5
            com.applovin.impl.w2$a r1 = r9.f12917m
            int r6 = r6 + -32
            int unused = r1.f12934f = r6
            goto L_0x0077
        L_0x00d5:
            boolean r1 = e(r5, r6)
            if (r1 == 0) goto L_0x0077
            r9.g(r6)
            goto L_0x0077
        L_0x00df:
            com.applovin.impl.w2$a r1 = r9.f12917m
            char r2 = a((byte) r5)
            r1.a((char) r2)
            r1 = r6 & 224(0xe0, float:3.14E-43)
            if (r1 == 0) goto L_0x0077
            com.applovin.impl.w2$a r1 = r9.f12917m
            char r2 = a((byte) r6)
            r1.a((char) r2)
            goto L_0x0077
        L_0x00f6:
            if (r1 == 0) goto L_0x010b
            int r10 = r9.f12920p
            if (r10 == r0) goto L_0x00ff
            r0 = 3
            if (r10 != r0) goto L_0x010b
        L_0x00ff:
            java.util.List r10 = r9.l()
            r9.f12918n = r10
            long r0 = r9.i()
            r9.f12928x = r0
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.w2.a(com.applovin.impl.ol):void");
    }

    public void b() {
        super.b();
        this.f12918n = null;
        this.f12919o = null;
        a(0);
        b(4);
        m();
        this.f12922r = false;
        this.f12923s = false;
        this.f12924t = 0;
        this.f12925u = 0;
        this.f12926v = 0;
        this.f12927w = true;
        this.f12928x = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    public kl e() {
        List list = this.f12918n;
        this.f12919o = list;
        return new z2((List) a1.a((Object) list));
    }

    public /* bridge */ /* synthetic */ ol f() {
        return super.d();
    }

    /* renamed from: g */
    public pl c() {
        pl h10;
        pl g10 = super.c();
        if (g10 != null) {
            return g10;
        }
        if (!n() || (h10 = h()) == null) {
            return null;
        }
        this.f12918n = Collections.emptyList();
        this.f12928x = -9223372036854775807L;
        pl plVar = h10;
        plVar.a(i(), e(), Long.MAX_VALUE);
        return h10;
    }

    /* access modifiers changed from: protected */
    public boolean j() {
        return this.f12918n != this.f12919o;
    }

    private static char c(byte b10) {
        return (char) D[b10 & Ascii.US];
    }

    private void f(byte b10) {
        this.f12917m.a(' ');
        this.f12917m.a((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    private static char e(byte b10) {
        return (char) C[b10 & Ascii.SI];
    }

    private void g(byte b10) {
        if (b10 == 32) {
            a(2);
        } else if (b10 != 41) {
            switch (b10) {
                case 37:
                    a(1);
                    b(2);
                    return;
                case 38:
                    a(1);
                    b(3);
                    return;
                case 39:
                    a(1);
                    b(4);
                    return;
                default:
                    int i10 = this.f12920p;
                    if (i10 != 0) {
                        if (b10 != 33) {
                            switch (b10) {
                                case 44:
                                    this.f12918n = Collections.emptyList();
                                    int i11 = this.f12920p;
                                    if (i11 == 1 || i11 == 3) {
                                        m();
                                        return;
                                    }
                                    return;
                                case 45:
                                    if (i10 == 1 && !this.f12917m.c()) {
                                        this.f12917m.d();
                                        return;
                                    }
                                    return;
                                case 46:
                                    m();
                                    return;
                                case 47:
                                    this.f12918n = l();
                                    m();
                                    return;
                                default:
                                    return;
                            }
                        } else {
                            this.f12917m.a();
                            return;
                        }
                    } else {
                        return;
                    }
            }
        } else {
            a(3);
        }
    }

    private boolean l(byte b10) {
        if (h(b10)) {
            this.f12926v = b(b10);
        }
        return this.f12926v == this.f12914j;
    }

    private void b(byte b10, byte b11) {
        int i10 = f12909y[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f12917m.f12932d) {
            if (this.f12920p != 1 && !this.f12917m.c()) {
                a aVar = new a(this.f12920p, this.f12921q);
                this.f12917m = aVar;
                this.f12916l.add(aVar);
            }
            int unused = this.f12917m.f12932d = i10;
        }
        boolean z10 = false;
        boolean z11 = (b11 & Ascii.DLE) == 16;
        if ((b11 & 1) == 1) {
            z10 = true;
        }
        int i11 = (b11 >> 1) & 7;
        this.f12917m.a(z11 ? 8 : i11, z10);
        if (z11) {
            int unused2 = this.f12917m.f12933e = f12910z[i11];
        }
    }

    public /* bridge */ /* synthetic */ void b(ol olVar) {
        super.a(olVar);
    }

    private void b(int i10) {
        this.f12921q = i10;
        this.f12917m.d(i10);
    }

    private static char a(byte b10) {
        return (char) B[(b10 & Ascii.DEL) - 32];
    }

    private static char a(byte b10, byte b11) {
        if ((b10 & 1) == 0) {
            return c(b11);
        }
        return d(b11);
    }

    private boolean a(boolean z10, byte b10, byte b11) {
        if (!z10 || !i(b10)) {
            this.f12923s = false;
        } else if (this.f12923s && this.f12924t == b10 && this.f12925u == b11) {
            this.f12923s = false;
            return true;
        } else {
            this.f12923s = true;
            this.f12924t = b10;
            this.f12925u = b11;
        }
        return false;
    }

    private void a(int i10) {
        int i11 = this.f12920p;
        if (i11 != i10) {
            this.f12920p = i10;
            if (i10 == 3) {
                for (int i12 = 0; i12 < this.f12916l.size(); i12++) {
                    ((a) this.f12916l.get(i12)).c(i10);
                }
                return;
            }
            m();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f12918n = Collections.emptyList();
            }
        }
    }

    public /* bridge */ /* synthetic */ void a(long j10) {
        super.a(j10);
    }
}
