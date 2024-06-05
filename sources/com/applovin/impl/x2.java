package com.applovin.impl;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.applovin.impl.z4;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class x2 extends y2 {

    /* renamed from: g  reason: collision with root package name */
    private final yg f13227g = new yg();

    /* renamed from: h  reason: collision with root package name */
    private final xg f13228h = new xg();

    /* renamed from: i  reason: collision with root package name */
    private int f13229i = -1;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f13230j;

    /* renamed from: k  reason: collision with root package name */
    private final int f13231k;

    /* renamed from: l  reason: collision with root package name */
    private final b[] f13232l;

    /* renamed from: m  reason: collision with root package name */
    private b f13233m;

    /* renamed from: n  reason: collision with root package name */
    private List f13234n;

    /* renamed from: o  reason: collision with root package name */
    private List f13235o;

    /* renamed from: p  reason: collision with root package name */
    private c f13236p;

    /* renamed from: q  reason: collision with root package name */
    private int f13237q;

    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final Comparator f13238c = m70.f9323a;

        /* renamed from: a  reason: collision with root package name */
        public final z4 f13239a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13240b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            z4.b d10 = new z4.b().a(charSequence).b(alignment).a(f10, i10).a(i11).b(f11).b(i12).d(f12);
            if (z10) {
                d10.d(i13);
            }
            this.f13239a = d10.a();
            this.f13240b = i14;
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f13267a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13268b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f13269c;

        /* renamed from: d  reason: collision with root package name */
        int f13270d = 0;

        public c(int i10, int i11) {
            this.f13267a = i10;
            this.f13268b = i11;
            this.f13269c = new byte[((i11 * 2) - 1)];
        }
    }

    public x2(int i10, List list) {
        boolean z10 = true;
        this.f13231k = i10 == -1 ? 1 : i10;
        this.f13230j = (list == null || !m3.a(list)) ? false : z10;
        this.f13232l = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f13232l[i11] = new b();
        }
        this.f13233m = this.f13232l[0];
    }

    private void c(int i10) {
        if (i10 > 7) {
            if (i10 <= 15) {
                this.f13228h.d(8);
            } else if (i10 <= 23) {
                this.f13228h.d(16);
            } else if (i10 <= 31) {
                this.f13228h.d(24);
            }
        }
    }

    private void d(int i10) {
        if (i10 <= 135) {
            this.f13228h.d(32);
        } else if (i10 <= 143) {
            this.f13228h.d(40);
        } else if (i10 <= 159) {
            this.f13228h.d(2);
            this.f13228h.d(this.f13228h.a(6) * 8);
        }
    }

    private void h(int i10) {
        if (i10 == 32) {
            this.f13233m.a(' ');
        } else if (i10 == 33) {
            this.f13233m.a(160);
        } else if (i10 == 37) {
            this.f13233m.a(8230);
        } else if (i10 == 42) {
            this.f13233m.a(352);
        } else if (i10 == 44) {
            this.f13233m.a(338);
        } else if (i10 == 63) {
            this.f13233m.a(376);
        } else if (i10 == 57) {
            this.f13233m.a(8482);
        } else if (i10 == 58) {
            this.f13233m.a(353);
        } else if (i10 == 60) {
            this.f13233m.a(339);
        } else if (i10 != 61) {
            switch (i10) {
                case 48:
                    this.f13233m.a(9608);
                    return;
                case 49:
                    this.f13233m.a(8216);
                    return;
                case 50:
                    this.f13233m.a(8217);
                    return;
                case 51:
                    this.f13233m.a(8220);
                    return;
                case 52:
                    this.f13233m.a(8221);
                    return;
                case 53:
                    this.f13233m.a(8226);
                    return;
                default:
                    switch (i10) {
                        case 118:
                            this.f13233m.a(8539);
                            return;
                        case 119:
                            this.f13233m.a(8540);
                            return;
                        case 120:
                            this.f13233m.a(8541);
                            return;
                        case 121:
                            this.f13233m.a(8542);
                            return;
                        case 122:
                            this.f13233m.a(9474);
                            return;
                        case 123:
                            this.f13233m.a(9488);
                            return;
                        case 124:
                            this.f13233m.a(9492);
                            return;
                        case 125:
                            this.f13233m.a(9472);
                            return;
                        case 126:
                            this.f13233m.a(9496);
                            return;
                        case 127:
                            this.f13233m.a(9484);
                            return;
                        default:
                            kc.d("Cea708Decoder", "Invalid G2 character: " + i10);
                            return;
                    }
            }
        } else {
            this.f13233m.a(8480);
        }
    }

    private void i(int i10) {
        if (i10 == 160) {
            this.f13233m.a(13252);
            return;
        }
        kc.d("Cea708Decoder", "Invalid G3 character: " + i10);
        this.f13233m.a('_');
    }

    private void k() {
        if (this.f13236p != null) {
            q();
            this.f13236p = null;
        }
    }

    private List l() {
        a b10;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f13232l[i10].f() && this.f13232l[i10].g() && (b10 = this.f13232l[i10].b()) != null) {
                arrayList.add(b10);
            }
        }
        Collections.sort(arrayList, a.f13238c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f13239a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void m() {
        this.f13233m.a(this.f13228h.a(4), this.f13228h.a(2), this.f13228h.a(2), this.f13228h.f(), this.f13228h.f(), this.f13228h.a(3), this.f13228h.a(3));
    }

    private void n() {
        int a10 = b.a(this.f13228h.a(2), this.f13228h.a(2), this.f13228h.a(2), this.f13228h.a(2));
        int a11 = b.a(this.f13228h.a(2), this.f13228h.a(2), this.f13228h.a(2), this.f13228h.a(2));
        this.f13228h.d(2);
        this.f13233m.b(a10, a11, b.a(this.f13228h.a(2), this.f13228h.a(2), this.f13228h.a(2)));
    }

    private void o() {
        this.f13228h.d(4);
        int a10 = this.f13228h.a(4);
        this.f13228h.d(2);
        this.f13233m.a(a10, this.f13228h.a(6));
    }

    private void p() {
        int a10 = b.a(this.f13228h.a(2), this.f13228h.a(2), this.f13228h.a(2), this.f13228h.a(2));
        int a11 = this.f13228h.a(2);
        int a12 = b.a(this.f13228h.a(2), this.f13228h.a(2), this.f13228h.a(2));
        if (this.f13228h.f()) {
            a11 |= 4;
        }
        boolean f10 = this.f13228h.f();
        int a13 = this.f13228h.a(2);
        int a14 = this.f13228h.a(2);
        int a15 = this.f13228h.a(2);
        this.f13228h.d(8);
        this.f13233m.a(a10, a12, f10, a11, a13, a14, a15);
    }

    private void q() {
        c cVar = this.f13236p;
        if (cVar.f13270d != (cVar.f13268b * 2) - 1) {
            kc.a("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f13236p.f13268b * 2) - 1) + ", but current index is " + this.f13236p.f13270d + " (sequence number " + this.f13236p.f13267a + ");");
        }
        xg xgVar = this.f13228h;
        c cVar2 = this.f13236p;
        xgVar.a(cVar2.f13269c, cVar2.f13270d);
        int a10 = this.f13228h.a(3);
        int a11 = this.f13228h.a(5);
        if (a10 == 7) {
            this.f13228h.d(2);
            a10 = this.f13228h.a(6);
            if (a10 < 7) {
                kc.d("Cea708Decoder", "Invalid extended service number: " + a10);
            }
        }
        if (a11 == 0) {
            if (a10 != 0) {
                kc.d("Cea708Decoder", "serviceNumber is non-zero (" + a10 + ") when blockSize is 0");
            }
        } else if (a10 == this.f13231k) {
            boolean z10 = false;
            while (this.f13228h.b() > 0) {
                int a12 = this.f13228h.a(8);
                if (a12 == 16) {
                    int a13 = this.f13228h.a(8);
                    if (a13 <= 31) {
                        c(a13);
                    } else if (a13 <= 127) {
                        h(a13);
                    } else if (a13 <= 159) {
                        d(a13);
                    } else if (a13 <= 255) {
                        i(a13);
                    } else {
                        kc.d("Cea708Decoder", "Invalid extended command: " + a13);
                    }
                } else if (a12 <= 31) {
                    a(a12);
                } else if (a12 <= 127) {
                    f(a12);
                } else if (a12 <= 159) {
                    b(a12);
                } else if (a12 <= 255) {
                    g(a12);
                } else {
                    kc.d("Cea708Decoder", "Invalid base command: " + a12);
                }
                z10 = true;
            }
            if (z10) {
                this.f13234n = l();
            }
        }
    }

    private void r() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f13232l[i10].h();
        }
    }

    /* access modifiers changed from: protected */
    public void a(ol olVar) {
        ByteBuffer byteBuffer = (ByteBuffer) a1.a((Object) olVar.f9906c);
        this.f13227g.a(byteBuffer.array(), byteBuffer.limit());
        while (this.f13227g.a() >= 3) {
            int w10 = this.f13227g.w();
            int i10 = w10 & 3;
            boolean z10 = false;
            boolean z11 = (w10 & 4) == 4;
            byte w11 = (byte) this.f13227g.w();
            byte w12 = (byte) this.f13227g.w();
            if ((i10 == 2 || i10 == 3) && z11) {
                if (i10 == 3) {
                    k();
                    int i11 = (w11 & 192) >> 6;
                    int i12 = this.f13229i;
                    if (!(i12 == -1 || i11 == (i12 + 1) % 4)) {
                        r();
                        kc.d("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f13229i + " current=" + i11);
                    }
                    this.f13229i = i11;
                    byte b10 = w11 & 63;
                    if (b10 == 0) {
                        b10 = 64;
                    }
                    c cVar = new c(i11, b10);
                    this.f13236p = cVar;
                    byte[] bArr = cVar.f13269c;
                    int i13 = cVar.f13270d;
                    cVar.f13270d = i13 + 1;
                    bArr[i13] = w12;
                } else {
                    if (i10 == 2) {
                        z10 = true;
                    }
                    a1.a(z10);
                    c cVar2 = this.f13236p;
                    if (cVar2 == null) {
                        kc.b("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = cVar2.f13269c;
                        int i14 = cVar2.f13270d;
                        bArr2[i14] = w11;
                        cVar2.f13270d = i14 + 2;
                        bArr2[i14 + 1] = w12;
                    }
                }
                c cVar3 = this.f13236p;
                if (cVar3.f13270d == (cVar3.f13268b * 2) - 1) {
                    k();
                }
            }
        }
    }

    public void b() {
        super.b();
        this.f13234n = null;
        this.f13235o = null;
        this.f13237q = 0;
        this.f13233m = this.f13232l[0];
        r();
        this.f13236p = null;
    }

    /* access modifiers changed from: protected */
    public kl e() {
        List list = this.f13234n;
        this.f13235o = list;
        return new z2((List) a1.a((Object) list));
    }

    public /* bridge */ /* synthetic */ ol f() {
        return super.d();
    }

    public /* bridge */ /* synthetic */ pl g() {
        return super.c();
    }

    /* access modifiers changed from: protected */
    public boolean j() {
        return this.f13234n != this.f13235o;
    }

    private void f(int i10) {
        if (i10 == 127) {
            this.f13233m.a(9835);
        } else {
            this.f13233m.a((char) (i10 & 255));
        }
    }

    private void g(int i10) {
        this.f13233m.a((char) (i10 & 255));
    }

    private void e(int i10) {
        b bVar = this.f13232l[i10];
        this.f13228h.d(2);
        boolean f10 = this.f13228h.f();
        boolean f11 = this.f13228h.f();
        boolean f12 = this.f13228h.f();
        int a10 = this.f13228h.a(3);
        boolean f13 = this.f13228h.f();
        int a11 = this.f13228h.a(7);
        int a12 = this.f13228h.a(8);
        int a13 = this.f13228h.a(4);
        int a14 = this.f13228h.a(4);
        this.f13228h.d(2);
        int a15 = this.f13228h.a(6);
        this.f13228h.d(2);
        bVar.a(f10, f11, f12, a10, f13, a11, a12, a14, a15, a13, this.f13228h.a(3), this.f13228h.a(3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        if (r4.f13228h.f() == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        r4.f13232l[8 - r2].h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        if (r4.f13228h.f() == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cf, code lost:
        r4.f13232l[8 - r2].a(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d9, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f3, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fb, code lost:
        if (r4.f13228h.f() == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fd, code lost:
        r4.f13232l[8 - r2].d();
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
    private void b(int r5) {
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
            com.applovin.impl.kc.d(r0, r5)
            goto L_0x0117
        L_0x0020:
            int r5 = r5 + -152
            r4.e(r5)
            int r0 = r4.f13237q
            if (r0 == r5) goto L_0x0117
            r4.f13237q = r5
            com.applovin.impl.x2$b[] r0 = r4.f13232l
            r5 = r0[r5]
            r4.f13233m = r5
            goto L_0x0117
        L_0x0033:
            com.applovin.impl.x2$b r5 = r4.f13233m
            boolean r5 = r5.e()
            if (r5 != 0) goto L_0x0044
            com.applovin.impl.xg r5 = r4.f13228h
            r0 = 32
            r5.d(r0)
            goto L_0x0117
        L_0x0044:
            r4.p()
            goto L_0x0117
        L_0x0049:
            com.applovin.impl.x2$b r5 = r4.f13233m
            boolean r5 = r5.e()
            if (r5 != 0) goto L_0x0058
            com.applovin.impl.xg r5 = r4.f13228h
            r5.d(r0)
            goto L_0x0117
        L_0x0058:
            r4.o()
            goto L_0x0117
        L_0x005d:
            com.applovin.impl.x2$b r5 = r4.f13233m
            boolean r5 = r5.e()
            if (r5 != 0) goto L_0x006e
            com.applovin.impl.xg r5 = r4.f13228h
            r0 = 24
            r5.d(r0)
            goto L_0x0117
        L_0x006e:
            r4.n()
            goto L_0x0117
        L_0x0073:
            com.applovin.impl.x2$b r5 = r4.f13233m
            boolean r5 = r5.e()
            if (r5 != 0) goto L_0x0082
            com.applovin.impl.xg r5 = r4.f13228h
            r5.d(r0)
            goto L_0x0117
        L_0x0082:
            r4.m()
            goto L_0x0117
        L_0x0087:
            r4.r()
            goto L_0x0117
        L_0x008c:
            com.applovin.impl.xg r5 = r4.f13228h
            r5.d(r1)
            goto L_0x0117
        L_0x0093:
            if (r2 > r1) goto L_0x0117
            com.applovin.impl.xg r5 = r4.f13228h
            boolean r5 = r5.f()
            if (r5 == 0) goto L_0x00a6
            com.applovin.impl.x2$b[] r5 = r4.f13232l
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.h()
        L_0x00a6:
            int r2 = r2 + 1
            goto L_0x0093
        L_0x00a9:
            r5 = 1
        L_0x00aa:
            if (r5 > r1) goto L_0x0117
            com.applovin.impl.xg r0 = r4.f13228h
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x00c2
            com.applovin.impl.x2$b[] r0 = r4.f13232l
            int r3 = 8 - r5
            r0 = r0[r3]
            boolean r3 = r0.g()
            r3 = r3 ^ r2
            r0.a((boolean) r3)
        L_0x00c2:
            int r5 = r5 + 1
            goto L_0x00aa
        L_0x00c5:
            if (r2 > r1) goto L_0x0117
            com.applovin.impl.xg r5 = r4.f13228h
            boolean r5 = r5.f()
            if (r5 == 0) goto L_0x00d9
            com.applovin.impl.x2$b[] r5 = r4.f13232l
            int r0 = 8 - r2
            r5 = r5[r0]
            r0 = 0
            r5.a((boolean) r0)
        L_0x00d9:
            int r2 = r2 + 1
            goto L_0x00c5
        L_0x00dc:
            r5 = 1
        L_0x00dd:
            if (r5 > r1) goto L_0x0117
            com.applovin.impl.xg r0 = r4.f13228h
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x00f0
            com.applovin.impl.x2$b[] r0 = r4.f13232l
            int r3 = 8 - r5
            r0 = r0[r3]
            r0.a((boolean) r2)
        L_0x00f0:
            int r5 = r5 + 1
            goto L_0x00dd
        L_0x00f3:
            if (r2 > r1) goto L_0x0117
            com.applovin.impl.xg r5 = r4.f13228h
            boolean r5 = r5.f()
            if (r5 == 0) goto L_0x0106
            com.applovin.impl.x2$b[] r5 = r4.f13232l
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.d()
        L_0x0106:
            int r2 = r2 + 1
            goto L_0x00f3
        L_0x0109:
            int r5 = r5 + -128
            int r0 = r4.f13237q
            if (r0 == r5) goto L_0x0117
            r4.f13237q = r5
            com.applovin.impl.x2$b[] r0 = r4.f13232l
            r5 = r0[r5]
            r4.f13233m = r5
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.x2.b(int):void");
    }

    private static final class b {
        private static final int[] A = {0, 0, 0, 0, 0, 0, 2};
        private static final int[] B = {3, 3, 3, 3, 3, 3, 1};
        private static final boolean[] C = {false, false, false, true, true, true, false};
        private static final int[] D;
        private static final int[] E = {0, 1, 2, 3, 4, 3, 4};
        private static final int[] F = {0, 0, 0, 0, 0, 3, 3};
        private static final int[] G;

        /* renamed from: w  reason: collision with root package name */
        public static final int f13241w = a(2, 2, 2, 0);

        /* renamed from: x  reason: collision with root package name */
        public static final int f13242x;

        /* renamed from: y  reason: collision with root package name */
        public static final int f13243y;

        /* renamed from: z  reason: collision with root package name */
        private static final int[] f13244z = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: a  reason: collision with root package name */
        private final List f13245a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final SpannableStringBuilder f13246b = new SpannableStringBuilder();

        /* renamed from: c  reason: collision with root package name */
        private boolean f13247c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f13248d;

        /* renamed from: e  reason: collision with root package name */
        private int f13249e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f13250f;

        /* renamed from: g  reason: collision with root package name */
        private int f13251g;

        /* renamed from: h  reason: collision with root package name */
        private int f13252h;

        /* renamed from: i  reason: collision with root package name */
        private int f13253i;

        /* renamed from: j  reason: collision with root package name */
        private int f13254j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f13255k;

        /* renamed from: l  reason: collision with root package name */
        private int f13256l;

        /* renamed from: m  reason: collision with root package name */
        private int f13257m;

        /* renamed from: n  reason: collision with root package name */
        private int f13258n;

        /* renamed from: o  reason: collision with root package name */
        private int f13259o;

        /* renamed from: p  reason: collision with root package name */
        private int f13260p;

        /* renamed from: q  reason: collision with root package name */
        private int f13261q;

        /* renamed from: r  reason: collision with root package name */
        private int f13262r;

        /* renamed from: s  reason: collision with root package name */
        private int f13263s;

        /* renamed from: t  reason: collision with root package name */
        private int f13264t;

        /* renamed from: u  reason: collision with root package name */
        private int f13265u;

        /* renamed from: v  reason: collision with root package name */
        private int f13266v;

        static {
            int a10 = a(0, 0, 0, 0);
            f13242x = a10;
            int a11 = a(0, 0, 0, 3);
            f13243y = a11;
            D = new int[]{a10, a11, a10, a10, a11, a10, a10};
            G = new int[]{a10, a10, a10, a10, a10, a11, a11};
        }

        public b() {
            h();
        }

        public void a(char c10) {
            if (c10 == 10) {
                this.f13245a.add(c());
                this.f13246b.clear();
                if (this.f13260p != -1) {
                    this.f13260p = 0;
                }
                if (this.f13261q != -1) {
                    this.f13261q = 0;
                }
                if (this.f13262r != -1) {
                    this.f13262r = 0;
                }
                if (this.f13264t != -1) {
                    this.f13264t = 0;
                }
                while (true) {
                    if ((this.f13255k && this.f13245a.size() >= this.f13254j) || this.f13245a.size() >= 15) {
                        this.f13245a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f13246b.append(c10);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.applovin.impl.x2.a b() {
            /*
                r15 = this;
                boolean r0 = r15.f()
                if (r0 == 0) goto L_0x0008
                r0 = 0
                return r0
            L_0x0008:
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r0 = 0
                r1 = 0
            L_0x000f:
                java.util.List r3 = r15.f13245a
                int r3 = r3.size()
                if (r1 >= r3) goto L_0x002a
                java.util.List r3 = r15.f13245a
                java.lang.Object r3 = r3.get(r1)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r2.append(r3)
                r3 = 10
                r2.append(r3)
                int r1 = r1 + 1
                goto L_0x000f
            L_0x002a:
                android.text.SpannableString r1 = r15.c()
                r2.append(r1)
                int r1 = r15.f13256l
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L_0x005e
                if (r1 == r5) goto L_0x005b
                if (r1 == r4) goto L_0x0058
                if (r1 != r3) goto L_0x003f
                goto L_0x005e
            L_0x003f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected justification value: "
                r1.append(r2)
                int r2 = r15.f13256l
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
                boolean r1 = r15.f13250f
                if (r1 == 0) goto L_0x0070
                int r1 = r15.f13252h
                float r1 = (float) r1
                r7 = 1120272384(0x42c60000, float:99.0)
                float r1 = r1 / r7
                int r8 = r15.f13251g
                float r8 = (float) r8
                float r8 = r8 / r7
                goto L_0x007d
            L_0x0070:
                int r1 = r15.f13252h
                float r1 = (float) r1
                r7 = 1129381888(0x43510000, float:209.0)
                float r1 = r1 / r7
                int r7 = r15.f13251g
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
                int r1 = r15.f13253i
                int r8 = r1 / 3
                if (r8 != 0) goto L_0x0093
                r8 = 0
                goto L_0x0098
            L_0x0093:
                if (r8 != r5) goto L_0x0097
                r8 = 1
                goto L_0x0098
            L_0x0097:
                r8 = 2
            L_0x0098:
                int r1 = r1 % r3
                if (r1 != 0) goto L_0x009d
                r9 = 0
                goto L_0x00a2
            L_0x009d:
                if (r1 != r5) goto L_0x00a1
                r9 = 1
                goto L_0x00a2
            L_0x00a1:
                r9 = 2
            L_0x00a2:
                int r1 = r15.f13259o
                int r3 = f13242x
                if (r1 == r3) goto L_0x00a9
                r0 = 1
            L_0x00a9:
                com.applovin.impl.x2$a r13 = new com.applovin.impl.x2$a
                int r11 = r15.f13259o
                int r12 = r15.f13249e
                r5 = 0
                r14 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                r1 = r13
                r3 = r6
                r4 = r7
                r6 = r8
                r7 = r10
                r8 = r9
                r9 = r14
                r10 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.x2.b.b():com.applovin.impl.x2$a");
        }

        public SpannableString c() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f13246b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f13260p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f13260p, length, 33);
                }
                if (this.f13261q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f13261q, length, 33);
                }
                if (this.f13262r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f13263s), this.f13262r, length, 33);
                }
                if (this.f13264t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f13265u), this.f13264t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void d() {
            this.f13245a.clear();
            this.f13246b.clear();
            this.f13260p = -1;
            this.f13261q = -1;
            this.f13262r = -1;
            this.f13264t = -1;
            this.f13266v = 0;
        }

        public boolean e() {
            return this.f13247c;
        }

        public boolean f() {
            return !e() || (this.f13245a.isEmpty() && this.f13246b.length() == 0);
        }

        public boolean g() {
            return this.f13248d;
        }

        public void h() {
            d();
            this.f13247c = false;
            this.f13248d = false;
            this.f13249e = 4;
            this.f13250f = false;
            this.f13251g = 0;
            this.f13252h = 0;
            this.f13253i = 0;
            this.f13254j = 15;
            this.f13255k = true;
            this.f13256l = 0;
            this.f13257m = 0;
            this.f13258n = 0;
            int i10 = f13242x;
            this.f13259o = i10;
            this.f13263s = f13241w;
            this.f13265u = i10;
        }

        public void a() {
            int length = this.f13246b.length();
            if (length > 0) {
                this.f13246b.delete(length - 1, length);
            }
        }

        public void a(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            boolean z14 = z11;
            int i18 = i16;
            int i19 = i17;
            this.f13247c = true;
            this.f13248d = z10;
            this.f13255k = z14;
            this.f13249e = i10;
            this.f13250f = z13;
            this.f13251g = i11;
            this.f13252h = i12;
            this.f13253i = i15;
            int i20 = i13 + 1;
            if (this.f13254j != i20) {
                this.f13254j = i20;
                while (true) {
                    if ((!z14 || this.f13245a.size() < this.f13254j) && this.f13245a.size() < 15) {
                        break;
                    }
                    this.f13245a.remove(0);
                }
            }
            if (!(i18 == 0 || this.f13257m == i18)) {
                this.f13257m = i18;
                int i21 = i18 - 1;
                a(D[i21], f13243y, C[i21], 0, A[i21], B[i21], f13244z[i21]);
            }
            if (i19 != 0 && this.f13258n != i19) {
                this.f13258n = i19;
                int i22 = i19 - 1;
                a(0, 1, 1, false, false, F[i22], E[i22]);
                b(f13241w, G[i22], f13242x);
            }
        }

        public void b(int i10, int i11, int i12) {
            if (!(this.f13262r == -1 || this.f13263s == i10)) {
                this.f13246b.setSpan(new ForegroundColorSpan(this.f13263s), this.f13262r, this.f13246b.length(), 33);
            }
            if (i10 != f13241w) {
                this.f13262r = this.f13246b.length();
                this.f13263s = i10;
            }
            if (!(this.f13264t == -1 || this.f13265u == i11)) {
                this.f13246b.setSpan(new BackgroundColorSpan(this.f13265u), this.f13264t, this.f13246b.length(), 33);
            }
            if (i11 != f13242x) {
                this.f13264t = this.f13246b.length();
                this.f13265u = i11;
            }
        }

        public static int a(int i10, int i11, int i12) {
            return a(i10, i11, i12, 0);
        }

        public static int a(int i10, int i11, int i12, int i13) {
            int i14 = 0;
            a1.a(i10, 0, 4);
            a1.a(i11, 0, 4);
            a1.a(i12, 0, 4);
            a1.a(i13, 0, 4);
            int i15 = i13 != 2 ? i13 != 3 ? 255 : 0 : 127;
            int i16 = i10 > 1 ? 255 : 0;
            int i17 = i11 > 1 ? 255 : 0;
            if (i12 > 1) {
                i14 = 255;
            }
            return Color.argb(i15, i16, i17, i14);
        }

        public void a(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f13260p != -1) {
                if (!z10) {
                    this.f13246b.setSpan(new StyleSpan(2), this.f13260p, this.f13246b.length(), 33);
                    this.f13260p = -1;
                }
            } else if (z10) {
                this.f13260p = this.f13246b.length();
            }
            if (this.f13261q != -1) {
                if (!z11) {
                    this.f13246b.setSpan(new UnderlineSpan(), this.f13261q, this.f13246b.length(), 33);
                    this.f13261q = -1;
                }
            } else if (z11) {
                this.f13261q = this.f13246b.length();
            }
        }

        public void a(int i10, int i11) {
            if (this.f13266v != i10) {
                a(10);
            }
            this.f13266v = i10;
        }

        public void a(boolean z10) {
            this.f13248d = z10;
        }

        public void a(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f13259o = i10;
            this.f13256l = i15;
        }
    }

    private void a(int i10) {
        if (i10 == 0) {
            return;
        }
        if (i10 == 3) {
            this.f13234n = l();
        } else if (i10 != 8) {
            switch (i10) {
                case 12:
                    r();
                    return;
                case 13:
                    this.f13233m.a(10);
                    return;
                case 14:
                    return;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        kc.d("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        this.f13228h.d(8);
                        return;
                    } else if (i10 < 24 || i10 > 31) {
                        kc.d("Cea708Decoder", "Invalid C0 command: " + i10);
                        return;
                    } else {
                        kc.d("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        this.f13228h.d(16);
                        return;
                    }
            }
        } else {
            this.f13233m.a();
        }
    }

    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public /* bridge */ /* synthetic */ void a(long j10) {
        super.a(j10);
    }

    public /* bridge */ /* synthetic */ void b(ol olVar) {
        super.a(olVar);
    }
}
