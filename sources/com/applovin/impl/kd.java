package com.applovin.impl;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.applovin.impl.cd;
import com.applovin.impl.id;
import com.applovin.impl.xq;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public class kd extends gd {

    /* renamed from: s1  reason: collision with root package name */
    private static final int[] f8945s1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: t1  reason: collision with root package name */
    private static boolean f8946t1;

    /* renamed from: u1  reason: collision with root package name */
    private static boolean f8947u1;
    private final Context J0;
    private final wq K0;
    private final xq.a L0;
    private final long M0;
    private final int N0;
    private final boolean O0;
    private a P0;
    private boolean Q0;
    private boolean R0;
    private Surface S0;
    private f7 T0;
    private boolean U0;
    private int V0;
    private boolean W0;
    private boolean X0;
    private boolean Y0;
    private long Z0;

    /* renamed from: a1  reason: collision with root package name */
    private long f8948a1;

    /* renamed from: b1  reason: collision with root package name */
    private long f8949b1;

    /* renamed from: c1  reason: collision with root package name */
    private int f8950c1;

    /* renamed from: d1  reason: collision with root package name */
    private int f8951d1;

    /* renamed from: e1  reason: collision with root package name */
    private int f8952e1;

    /* renamed from: f1  reason: collision with root package name */
    private long f8953f1;

    /* renamed from: g1  reason: collision with root package name */
    private long f8954g1;

    /* renamed from: h1  reason: collision with root package name */
    private long f8955h1;

    /* renamed from: i1  reason: collision with root package name */
    private int f8956i1;

    /* renamed from: j1  reason: collision with root package name */
    private int f8957j1;

    /* renamed from: k1  reason: collision with root package name */
    private int f8958k1;

    /* renamed from: l1  reason: collision with root package name */
    private int f8959l1;

    /* renamed from: m1  reason: collision with root package name */
    private float f8960m1;

    /* renamed from: n1  reason: collision with root package name */
    private yq f8961n1;

    /* renamed from: o1  reason: collision with root package name */
    private boolean f8962o1;

    /* renamed from: p1  reason: collision with root package name */
    private int f8963p1;

    /* renamed from: q1  reason: collision with root package name */
    b f8964q1;

    /* renamed from: r1  reason: collision with root package name */
    private vq f8965r1;

    protected static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f8966a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8967b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8968c;

        public a(int i10, int i11, int i12) {
            this.f8966a = i10;
            this.f8967b = i11;
            this.f8968c = i12;
        }
    }

    public kd(Context context, cd.b bVar, hd hdVar, long j10, boolean z10, Handler handler, xq xqVar, int i10) {
        super(2, bVar, hdVar, z10, 30.0f);
        this.M0 = j10;
        this.N0 = i10;
        Context applicationContext = context.getApplicationContext();
        this.J0 = applicationContext;
        this.K0 = new wq(applicationContext);
        this.L0 = new xq.a(handler, xqVar);
        this.O0 = e0();
        this.f8948a1 = -9223372036854775807L;
        this.f8957j1 = -1;
        this.f8958k1 = -1;
        this.f8960m1 = -1.0f;
        this.V0 = 1;
        this.f8963p1 = 0;
        d0();
    }

    private static Point b(fd fdVar, d9 d9Var) {
        int i10 = d9Var.f7159s;
        int i11 = d9Var.f7158r;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = ((float) i10) / ((float) i12);
        for (int i13 : f8945s1) {
            int i14 = (int) (((float) i13) * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (yp.f13662a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point a10 = fdVar.a(i15, i13);
                if (fdVar.a(a10.x, a10.y, (double) d9Var.f7160t)) {
                    return a10;
                }
            } else {
                try {
                    int a11 = yp.a(i13, 16) * 16;
                    int a12 = yp.a(i14, 16) * 16;
                    if (a11 * a12 <= id.b()) {
                        int i16 = z10 ? a12 : a11;
                        if (!z10) {
                            a11 = a12;
                        }
                        return new Point(i16, a11);
                    }
                } catch (id.c unused) {
                }
            }
        }
        return null;
    }

    protected static int c(fd fdVar, d9 d9Var) {
        if (d9Var.f7154n == -1) {
            return a(fdVar, d9Var);
        }
        int size = d9Var.f7155o.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((byte[]) d9Var.f7155o.get(i11)).length;
        }
        return d9Var.f7154n + i10;
    }

    private void c0() {
        cd I;
        this.W0 = false;
        if (yp.f13662a >= 23 && this.f8962o1 && (I = I()) != null) {
            this.f8964q1 = new b(I);
        }
    }

    private void d0() {
        this.f8961n1 = null;
    }

    private static boolean e0() {
        return "NVIDIA".equals(yp.f13664c);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x07cf, code lost:
        if (r0.equals("NX573J") == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0831, code lost:
        if (r0.equals("AFTN") == false) goto L_0x0829;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x084d, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean f0() {
        /*
            int r0 = com.applovin.impl.yp.f13662a
            r1 = 6
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 28
            r6 = 2
            r7 = -1
            r8 = 0
            r9 = 1
            if (r0 > r5) goto L_0x006d
            java.lang.String r10 = com.applovin.impl.yp.f13663b
            r10.hashCode()
            int r11 = r10.hashCode()
            switch(r11) {
                case -1339091551: goto L_0x005e;
                case -1220081023: goto L_0x0053;
                case -1220066608: goto L_0x0048;
                case -1012436106: goto L_0x003d;
                case -64886864: goto L_0x0032;
                case 3415681: goto L_0x0027;
                case 825323514: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            r10 = -1
            goto L_0x0068
        L_0x001c:
            java.lang.String r11 = "machuca"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0025
            goto L_0x001a
        L_0x0025:
            r10 = 6
            goto L_0x0068
        L_0x0027:
            java.lang.String r11 = "once"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0030
            goto L_0x001a
        L_0x0030:
            r10 = 5
            goto L_0x0068
        L_0x0032:
            java.lang.String r11 = "magnolia"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x003b
            goto L_0x001a
        L_0x003b:
            r10 = 4
            goto L_0x0068
        L_0x003d:
            java.lang.String r11 = "oneday"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0046
            goto L_0x001a
        L_0x0046:
            r10 = 3
            goto L_0x0068
        L_0x0048:
            java.lang.String r11 = "dangalUHD"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0051
            goto L_0x001a
        L_0x0051:
            r10 = 2
            goto L_0x0068
        L_0x0053:
            java.lang.String r11 = "dangalFHD"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x005c
            goto L_0x001a
        L_0x005c:
            r10 = 1
            goto L_0x0068
        L_0x005e:
            java.lang.String r11 = "dangal"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0067
            goto L_0x001a
        L_0x0067:
            r10 = 0
        L_0x0068:
            switch(r10) {
                case 0: goto L_0x006c;
                case 1: goto L_0x006c;
                case 2: goto L_0x006c;
                case 3: goto L_0x006c;
                case 4: goto L_0x006c;
                case 5: goto L_0x006c;
                case 6: goto L_0x006c;
                default: goto L_0x006b;
            }
        L_0x006b:
            goto L_0x006d
        L_0x006c:
            return r9
        L_0x006d:
            r10 = 27
            if (r0 > r10) goto L_0x007c
            java.lang.String r11 = com.applovin.impl.yp.f13663b
            java.lang.String r12 = "HWEML"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x007c
            return r9
        L_0x007c:
            r11 = 26
            if (r0 > r11) goto L_0x084e
            java.lang.String r0 = com.applovin.impl.yp.f13663b
            r0.hashCode()
            int r12 = r0.hashCode()
            switch(r12) {
                case -2144781245: goto L_0x080f;
                case -2144781185: goto L_0x0803;
                case -2144781160: goto L_0x07f7;
                case -2097309513: goto L_0x07eb;
                case -2022874474: goto L_0x07df;
                case -1978993182: goto L_0x07d3;
                case -1978990237: goto L_0x07c9;
                case -1936688988: goto L_0x07bd;
                case -1936688066: goto L_0x07b0;
                case -1936688065: goto L_0x07a2;
                case -1931988508: goto L_0x0794;
                case -1885099851: goto L_0x0786;
                case -1696512866: goto L_0x0778;
                case -1680025915: goto L_0x076a;
                case -1615810839: goto L_0x075c;
                case -1600724499: goto L_0x074e;
                case -1554255044: goto L_0x0740;
                case -1481772737: goto L_0x0732;
                case -1481772730: goto L_0x0724;
                case -1481772729: goto L_0x0716;
                case -1320080169: goto L_0x0708;
                case -1217592143: goto L_0x06fa;
                case -1180384755: goto L_0x06ec;
                case -1139198265: goto L_0x06de;
                case -1052835013: goto L_0x06d0;
                case -993250464: goto L_0x06c2;
                case -993250458: goto L_0x06b4;
                case -965403638: goto L_0x06a6;
                case -958336948: goto L_0x0698;
                case -879245230: goto L_0x068a;
                case -842500323: goto L_0x067c;
                case -821392978: goto L_0x066e;
                case -797483286: goto L_0x0660;
                case -794946968: goto L_0x0652;
                case -788334647: goto L_0x0644;
                case -782144577: goto L_0x0636;
                case -575125681: goto L_0x0628;
                case -521118391: goto L_0x061a;
                case -430914369: goto L_0x060c;
                case -290434366: goto L_0x05fe;
                case -282781963: goto L_0x05f0;
                case -277133239: goto L_0x05e2;
                case -173639913: goto L_0x05d4;
                case -56598463: goto L_0x05c6;
                case 2126: goto L_0x05b8;
                case 2564: goto L_0x05aa;
                case 2715: goto L_0x059c;
                case 2719: goto L_0x058e;
                case 3091: goto L_0x0580;
                case 3483: goto L_0x0572;
                case 73405: goto L_0x0564;
                case 75537: goto L_0x0556;
                case 75739: goto L_0x0548;
                case 76779: goto L_0x053a;
                case 78669: goto L_0x052c;
                case 79305: goto L_0x051e;
                case 80618: goto L_0x0510;
                case 88274: goto L_0x0502;
                case 98846: goto L_0x04f4;
                case 98848: goto L_0x04e6;
                case 99329: goto L_0x04d8;
                case 101481: goto L_0x04ca;
                case 1513190: goto L_0x04bc;
                case 1514184: goto L_0x04ae;
                case 1514185: goto L_0x04a0;
                case 2133089: goto L_0x0492;
                case 2133091: goto L_0x0484;
                case 2133120: goto L_0x0476;
                case 2133151: goto L_0x0468;
                case 2133182: goto L_0x045a;
                case 2133184: goto L_0x044c;
                case 2436959: goto L_0x043e;
                case 2463773: goto L_0x0430;
                case 2464648: goto L_0x0422;
                case 2689555: goto L_0x0414;
                case 3154429: goto L_0x0406;
                case 3284551: goto L_0x03f8;
                case 3351335: goto L_0x03ea;
                case 3386211: goto L_0x03dc;
                case 41325051: goto L_0x03ce;
                case 51349633: goto L_0x03c0;
                case 51350594: goto L_0x03b2;
                case 55178625: goto L_0x03a4;
                case 61542055: goto L_0x0396;
                case 65355429: goto L_0x0388;
                case 66214468: goto L_0x037a;
                case 66214470: goto L_0x036c;
                case 66214473: goto L_0x035e;
                case 66215429: goto L_0x0350;
                case 66215431: goto L_0x0342;
                case 66215433: goto L_0x0334;
                case 66216390: goto L_0x0326;
                case 76402249: goto L_0x0318;
                case 76404105: goto L_0x030a;
                case 76404911: goto L_0x02fc;
                case 80963634: goto L_0x02ee;
                case 82882791: goto L_0x02e0;
                case 98715550: goto L_0x02d2;
                case 101370885: goto L_0x02c4;
                case 102844228: goto L_0x02b6;
                case 165221241: goto L_0x02a8;
                case 182191441: goto L_0x029a;
                case 245388979: goto L_0x028c;
                case 287431619: goto L_0x027e;
                case 307593612: goto L_0x0270;
                case 308517133: goto L_0x0262;
                case 316215098: goto L_0x0254;
                case 316215116: goto L_0x0246;
                case 316246811: goto L_0x0238;
                case 316246818: goto L_0x022a;
                case 407160593: goto L_0x021c;
                case 507412548: goto L_0x020e;
                case 793982701: goto L_0x0200;
                case 794038622: goto L_0x01f2;
                case 794040393: goto L_0x01e4;
                case 835649806: goto L_0x01d6;
                case 917340916: goto L_0x01c8;
                case 958008161: goto L_0x01ba;
                case 1060579533: goto L_0x01ac;
                case 1150207623: goto L_0x019e;
                case 1176899427: goto L_0x0190;
                case 1280332038: goto L_0x0182;
                case 1306947716: goto L_0x0174;
                case 1349174697: goto L_0x0166;
                case 1522194893: goto L_0x0158;
                case 1691543273: goto L_0x014a;
                case 1691544261: goto L_0x013c;
                case 1709443163: goto L_0x012e;
                case 1865889110: goto L_0x0120;
                case 1906253259: goto L_0x0112;
                case 1977196784: goto L_0x0104;
                case 2006372676: goto L_0x00f7;
                case 2019281702: goto L_0x00ea;
                case 2029784656: goto L_0x00dd;
                case 2030379515: goto L_0x00d0;
                case 2033393791: goto L_0x00c3;
                case 2047190025: goto L_0x00b6;
                case 2047252157: goto L_0x00a9;
                case 2048319463: goto L_0x009c;
                case 2048855701: goto L_0x008f;
                default: goto L_0x008c;
            }
        L_0x008c:
            r1 = -1
            goto L_0x081a
        L_0x008f:
            java.lang.String r1 = "HWWAS-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0098
            goto L_0x008c
        L_0x0098:
            r1 = 139(0x8b, float:1.95E-43)
            goto L_0x081a
        L_0x009c:
            java.lang.String r1 = "HWVNS-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00a5
            goto L_0x008c
        L_0x00a5:
            r1 = 138(0x8a, float:1.93E-43)
            goto L_0x081a
        L_0x00a9:
            java.lang.String r1 = "ELUGA_Prim"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b2
            goto L_0x008c
        L_0x00b2:
            r1 = 137(0x89, float:1.92E-43)
            goto L_0x081a
        L_0x00b6:
            java.lang.String r1 = "ELUGA_Note"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00bf
            goto L_0x008c
        L_0x00bf:
            r1 = 136(0x88, float:1.9E-43)
            goto L_0x081a
        L_0x00c3:
            java.lang.String r1 = "ASUS_X00AD_2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00cc
            goto L_0x008c
        L_0x00cc:
            r1 = 135(0x87, float:1.89E-43)
            goto L_0x081a
        L_0x00d0:
            java.lang.String r1 = "HWCAM-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00d9
            goto L_0x008c
        L_0x00d9:
            r1 = 134(0x86, float:1.88E-43)
            goto L_0x081a
        L_0x00dd:
            java.lang.String r1 = "HWBLN-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00e6
            goto L_0x008c
        L_0x00e6:
            r1 = 133(0x85, float:1.86E-43)
            goto L_0x081a
        L_0x00ea:
            java.lang.String r1 = "DM-01K"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00f3
            goto L_0x008c
        L_0x00f3:
            r1 = 132(0x84, float:1.85E-43)
            goto L_0x081a
        L_0x00f7:
            java.lang.String r1 = "BRAVIA_ATV3_4K"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0100
            goto L_0x008c
        L_0x0100:
            r1 = 131(0x83, float:1.84E-43)
            goto L_0x081a
        L_0x0104:
            java.lang.String r1 = "Infinix-X572"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x010e
            goto L_0x008c
        L_0x010e:
            r1 = 130(0x82, float:1.82E-43)
            goto L_0x081a
        L_0x0112:
            java.lang.String r1 = "PB2-670M"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x011c
            goto L_0x008c
        L_0x011c:
            r1 = 129(0x81, float:1.81E-43)
            goto L_0x081a
        L_0x0120:
            java.lang.String r1 = "santoni"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x012a
            goto L_0x008c
        L_0x012a:
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x081a
        L_0x012e:
            java.lang.String r1 = "iball8735_9806"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0138
            goto L_0x008c
        L_0x0138:
            r1 = 127(0x7f, float:1.78E-43)
            goto L_0x081a
        L_0x013c:
            java.lang.String r1 = "CPH1715"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0146
            goto L_0x008c
        L_0x0146:
            r1 = 126(0x7e, float:1.77E-43)
            goto L_0x081a
        L_0x014a:
            java.lang.String r1 = "CPH1609"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0154
            goto L_0x008c
        L_0x0154:
            r1 = 125(0x7d, float:1.75E-43)
            goto L_0x081a
        L_0x0158:
            java.lang.String r1 = "woods_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0162
            goto L_0x008c
        L_0x0162:
            r1 = 124(0x7c, float:1.74E-43)
            goto L_0x081a
        L_0x0166:
            java.lang.String r1 = "htc_e56ml_dtul"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0170
            goto L_0x008c
        L_0x0170:
            r1 = 123(0x7b, float:1.72E-43)
            goto L_0x081a
        L_0x0174:
            java.lang.String r1 = "EverStar_S"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x017e
            goto L_0x008c
        L_0x017e:
            r1 = 122(0x7a, float:1.71E-43)
            goto L_0x081a
        L_0x0182:
            java.lang.String r1 = "hwALE-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x018c
            goto L_0x008c
        L_0x018c:
            r1 = 121(0x79, float:1.7E-43)
            goto L_0x081a
        L_0x0190:
            java.lang.String r1 = "itel_S41"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x019a
            goto L_0x008c
        L_0x019a:
            r1 = 120(0x78, float:1.68E-43)
            goto L_0x081a
        L_0x019e:
            java.lang.String r1 = "LS-5017"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01a8
            goto L_0x008c
        L_0x01a8:
            r1 = 119(0x77, float:1.67E-43)
            goto L_0x081a
        L_0x01ac:
            java.lang.String r1 = "panell_d"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01b6
            goto L_0x008c
        L_0x01b6:
            r1 = 118(0x76, float:1.65E-43)
            goto L_0x081a
        L_0x01ba:
            java.lang.String r1 = "j2xlteins"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01c4
            goto L_0x008c
        L_0x01c4:
            r1 = 117(0x75, float:1.64E-43)
            goto L_0x081a
        L_0x01c8:
            java.lang.String r1 = "A7000plus"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01d2
            goto L_0x008c
        L_0x01d2:
            r1 = 116(0x74, float:1.63E-43)
            goto L_0x081a
        L_0x01d6:
            java.lang.String r1 = "manning"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01e0
            goto L_0x008c
        L_0x01e0:
            r1 = 115(0x73, float:1.61E-43)
            goto L_0x081a
        L_0x01e4:
            java.lang.String r1 = "GIONEE_WBL7519"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01ee
            goto L_0x008c
        L_0x01ee:
            r1 = 114(0x72, float:1.6E-43)
            goto L_0x081a
        L_0x01f2:
            java.lang.String r1 = "GIONEE_WBL7365"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01fc
            goto L_0x008c
        L_0x01fc:
            r1 = 113(0x71, float:1.58E-43)
            goto L_0x081a
        L_0x0200:
            java.lang.String r1 = "GIONEE_WBL5708"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x020a
            goto L_0x008c
        L_0x020a:
            r1 = 112(0x70, float:1.57E-43)
            goto L_0x081a
        L_0x020e:
            java.lang.String r1 = "QM16XE_U"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0218
            goto L_0x008c
        L_0x0218:
            r1 = 111(0x6f, float:1.56E-43)
            goto L_0x081a
        L_0x021c:
            java.lang.String r1 = "Pixi5-10_4G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0226
            goto L_0x008c
        L_0x0226:
            r1 = 110(0x6e, float:1.54E-43)
            goto L_0x081a
        L_0x022a:
            java.lang.String r1 = "TB3-850M"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0234
            goto L_0x008c
        L_0x0234:
            r1 = 109(0x6d, float:1.53E-43)
            goto L_0x081a
        L_0x0238:
            java.lang.String r1 = "TB3-850F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0242
            goto L_0x008c
        L_0x0242:
            r1 = 108(0x6c, float:1.51E-43)
            goto L_0x081a
        L_0x0246:
            java.lang.String r1 = "TB3-730X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0250
            goto L_0x008c
        L_0x0250:
            r1 = 107(0x6b, float:1.5E-43)
            goto L_0x081a
        L_0x0254:
            java.lang.String r1 = "TB3-730F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x025e
            goto L_0x008c
        L_0x025e:
            r1 = 106(0x6a, float:1.49E-43)
            goto L_0x081a
        L_0x0262:
            java.lang.String r1 = "A7020a48"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x026c
            goto L_0x008c
        L_0x026c:
            r1 = 105(0x69, float:1.47E-43)
            goto L_0x081a
        L_0x0270:
            java.lang.String r1 = "A7010a48"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x027a
            goto L_0x008c
        L_0x027a:
            r1 = 104(0x68, float:1.46E-43)
            goto L_0x081a
        L_0x027e:
            java.lang.String r1 = "griffin"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0288
            goto L_0x008c
        L_0x0288:
            r1 = 103(0x67, float:1.44E-43)
            goto L_0x081a
        L_0x028c:
            java.lang.String r1 = "marino_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0296
            goto L_0x008c
        L_0x0296:
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x081a
        L_0x029a:
            java.lang.String r1 = "CPY83_I00"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02a4
            goto L_0x008c
        L_0x02a4:
            r1 = 101(0x65, float:1.42E-43)
            goto L_0x081a
        L_0x02a8:
            java.lang.String r1 = "A2016a40"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02b2
            goto L_0x008c
        L_0x02b2:
            r1 = 100
            goto L_0x081a
        L_0x02b6:
            java.lang.String r1 = "le_x6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02c0
            goto L_0x008c
        L_0x02c0:
            r1 = 99
            goto L_0x081a
        L_0x02c4:
            java.lang.String r1 = "l5460"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02ce
            goto L_0x008c
        L_0x02ce:
            r1 = 98
            goto L_0x081a
        L_0x02d2:
            java.lang.String r1 = "i9031"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02dc
            goto L_0x008c
        L_0x02dc:
            r1 = 97
            goto L_0x081a
        L_0x02e0:
            java.lang.String r1 = "X3_HK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02ea
            goto L_0x008c
        L_0x02ea:
            r1 = 96
            goto L_0x081a
        L_0x02ee:
            java.lang.String r1 = "V23GB"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02f8
            goto L_0x008c
        L_0x02f8:
            r1 = 95
            goto L_0x081a
        L_0x02fc:
            java.lang.String r1 = "Q4310"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0306
            goto L_0x008c
        L_0x0306:
            r1 = 94
            goto L_0x081a
        L_0x030a:
            java.lang.String r1 = "Q4260"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0314
            goto L_0x008c
        L_0x0314:
            r1 = 93
            goto L_0x081a
        L_0x0318:
            java.lang.String r1 = "PRO7S"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0322
            goto L_0x008c
        L_0x0322:
            r1 = 92
            goto L_0x081a
        L_0x0326:
            java.lang.String r1 = "F3311"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0330
            goto L_0x008c
        L_0x0330:
            r1 = 91
            goto L_0x081a
        L_0x0334:
            java.lang.String r1 = "F3215"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x033e
            goto L_0x008c
        L_0x033e:
            r1 = 90
            goto L_0x081a
        L_0x0342:
            java.lang.String r1 = "F3213"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x034c
            goto L_0x008c
        L_0x034c:
            r1 = 89
            goto L_0x081a
        L_0x0350:
            java.lang.String r1 = "F3211"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x035a
            goto L_0x008c
        L_0x035a:
            r1 = 88
            goto L_0x081a
        L_0x035e:
            java.lang.String r1 = "F3116"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0368
            goto L_0x008c
        L_0x0368:
            r1 = 87
            goto L_0x081a
        L_0x036c:
            java.lang.String r1 = "F3113"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0376
            goto L_0x008c
        L_0x0376:
            r1 = 86
            goto L_0x081a
        L_0x037a:
            java.lang.String r1 = "F3111"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0384
            goto L_0x008c
        L_0x0384:
            r1 = 85
            goto L_0x081a
        L_0x0388:
            java.lang.String r1 = "E5643"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0392
            goto L_0x008c
        L_0x0392:
            r1 = 84
            goto L_0x081a
        L_0x0396:
            java.lang.String r1 = "A1601"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03a0
            goto L_0x008c
        L_0x03a0:
            r1 = 83
            goto L_0x081a
        L_0x03a4:
            java.lang.String r1 = "Aura_Note_2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03ae
            goto L_0x008c
        L_0x03ae:
            r1 = 82
            goto L_0x081a
        L_0x03b2:
            java.lang.String r1 = "602LV"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03bc
            goto L_0x008c
        L_0x03bc:
            r1 = 81
            goto L_0x081a
        L_0x03c0:
            java.lang.String r1 = "601LV"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03ca
            goto L_0x008c
        L_0x03ca:
            r1 = 80
            goto L_0x081a
        L_0x03ce:
            java.lang.String r1 = "MEIZU_M5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03d8
            goto L_0x008c
        L_0x03d8:
            r1 = 79
            goto L_0x081a
        L_0x03dc:
            java.lang.String r1 = "p212"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03e6
            goto L_0x008c
        L_0x03e6:
            r1 = 78
            goto L_0x081a
        L_0x03ea:
            java.lang.String r1 = "mido"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03f4
            goto L_0x008c
        L_0x03f4:
            r1 = 77
            goto L_0x081a
        L_0x03f8:
            java.lang.String r1 = "kate"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0402
            goto L_0x008c
        L_0x0402:
            r1 = 76
            goto L_0x081a
        L_0x0406:
            java.lang.String r1 = "fugu"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0410
            goto L_0x008c
        L_0x0410:
            r1 = 75
            goto L_0x081a
        L_0x0414:
            java.lang.String r1 = "XE2X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x041e
            goto L_0x008c
        L_0x041e:
            r1 = 74
            goto L_0x081a
        L_0x0422:
            java.lang.String r1 = "Q427"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x042c
            goto L_0x008c
        L_0x042c:
            r1 = 73
            goto L_0x081a
        L_0x0430:
            java.lang.String r1 = "Q350"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x043a
            goto L_0x008c
        L_0x043a:
            r1 = 72
            goto L_0x081a
        L_0x043e:
            java.lang.String r1 = "P681"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0448
            goto L_0x008c
        L_0x0448:
            r1 = 71
            goto L_0x081a
        L_0x044c:
            java.lang.String r1 = "F04J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0456
            goto L_0x008c
        L_0x0456:
            r1 = 70
            goto L_0x081a
        L_0x045a:
            java.lang.String r1 = "F04H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0464
            goto L_0x008c
        L_0x0464:
            r1 = 69
            goto L_0x081a
        L_0x0468:
            java.lang.String r1 = "F03H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0472
            goto L_0x008c
        L_0x0472:
            r1 = 68
            goto L_0x081a
        L_0x0476:
            java.lang.String r1 = "F02H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0480
            goto L_0x008c
        L_0x0480:
            r1 = 67
            goto L_0x081a
        L_0x0484:
            java.lang.String r1 = "F01J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x048e
            goto L_0x008c
        L_0x048e:
            r1 = 66
            goto L_0x081a
        L_0x0492:
            java.lang.String r1 = "F01H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x049c
            goto L_0x008c
        L_0x049c:
            r1 = 65
            goto L_0x081a
        L_0x04a0:
            java.lang.String r1 = "1714"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04aa
            goto L_0x008c
        L_0x04aa:
            r1 = 64
            goto L_0x081a
        L_0x04ae:
            java.lang.String r1 = "1713"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04b8
            goto L_0x008c
        L_0x04b8:
            r1 = 63
            goto L_0x081a
        L_0x04bc:
            java.lang.String r1 = "1601"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04c6
            goto L_0x008c
        L_0x04c6:
            r1 = 62
            goto L_0x081a
        L_0x04ca:
            java.lang.String r1 = "flo"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04d4
            goto L_0x008c
        L_0x04d4:
            r1 = 61
            goto L_0x081a
        L_0x04d8:
            java.lang.String r1 = "deb"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04e2
            goto L_0x008c
        L_0x04e2:
            r1 = 60
            goto L_0x081a
        L_0x04e6:
            java.lang.String r1 = "cv3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04f0
            goto L_0x008c
        L_0x04f0:
            r1 = 59
            goto L_0x081a
        L_0x04f4:
            java.lang.String r1 = "cv1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04fe
            goto L_0x008c
        L_0x04fe:
            r1 = 58
            goto L_0x081a
        L_0x0502:
            java.lang.String r1 = "Z80"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x050c
            goto L_0x008c
        L_0x050c:
            r1 = 57
            goto L_0x081a
        L_0x0510:
            java.lang.String r1 = "QX1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x051a
            goto L_0x008c
        L_0x051a:
            r1 = 56
            goto L_0x081a
        L_0x051e:
            java.lang.String r1 = "PLE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0528
            goto L_0x008c
        L_0x0528:
            r1 = 55
            goto L_0x081a
        L_0x052c:
            java.lang.String r1 = "P85"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0536
            goto L_0x008c
        L_0x0536:
            r1 = 54
            goto L_0x081a
        L_0x053a:
            java.lang.String r1 = "MX6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0544
            goto L_0x008c
        L_0x0544:
            r1 = 53
            goto L_0x081a
        L_0x0548:
            java.lang.String r1 = "M5c"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0552
            goto L_0x008c
        L_0x0552:
            r1 = 52
            goto L_0x081a
        L_0x0556:
            java.lang.String r1 = "M04"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0560
            goto L_0x008c
        L_0x0560:
            r1 = 51
            goto L_0x081a
        L_0x0564:
            java.lang.String r1 = "JGZ"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x056e
            goto L_0x008c
        L_0x056e:
            r1 = 50
            goto L_0x081a
        L_0x0572:
            java.lang.String r1 = "mh"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x057c
            goto L_0x008c
        L_0x057c:
            r1 = 49
            goto L_0x081a
        L_0x0580:
            java.lang.String r1 = "b5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x058a
            goto L_0x008c
        L_0x058a:
            r1 = 48
            goto L_0x081a
        L_0x058e:
            java.lang.String r1 = "V5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0598
            goto L_0x008c
        L_0x0598:
            r1 = 47
            goto L_0x081a
        L_0x059c:
            java.lang.String r1 = "V1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05a6
            goto L_0x008c
        L_0x05a6:
            r1 = 46
            goto L_0x081a
        L_0x05aa:
            java.lang.String r1 = "Q5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05b4
            goto L_0x008c
        L_0x05b4:
            r1 = 45
            goto L_0x081a
        L_0x05b8:
            java.lang.String r1 = "C1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05c2
            goto L_0x008c
        L_0x05c2:
            r1 = 44
            goto L_0x081a
        L_0x05c6:
            java.lang.String r1 = "woods_fn"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05d0
            goto L_0x008c
        L_0x05d0:
            r1 = 43
            goto L_0x081a
        L_0x05d4:
            java.lang.String r1 = "ELUGA_A3_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05de
            goto L_0x008c
        L_0x05de:
            r1 = 42
            goto L_0x081a
        L_0x05e2:
            java.lang.String r1 = "Z12_PRO"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05ec
            goto L_0x008c
        L_0x05ec:
            r1 = 41
            goto L_0x081a
        L_0x05f0:
            java.lang.String r1 = "BLACK-1X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05fa
            goto L_0x008c
        L_0x05fa:
            r1 = 40
            goto L_0x081a
        L_0x05fe:
            java.lang.String r1 = "taido_row"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0608
            goto L_0x008c
        L_0x0608:
            r1 = 39
            goto L_0x081a
        L_0x060c:
            java.lang.String r1 = "Pixi4-7_3G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0616
            goto L_0x008c
        L_0x0616:
            r1 = 38
            goto L_0x081a
        L_0x061a:
            java.lang.String r1 = "GIONEE_GBL7360"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0624
            goto L_0x008c
        L_0x0624:
            r1 = 37
            goto L_0x081a
        L_0x0628:
            java.lang.String r1 = "GiONEE_CBL7513"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0632
            goto L_0x008c
        L_0x0632:
            r1 = 36
            goto L_0x081a
        L_0x0636:
            java.lang.String r1 = "OnePlus5T"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0640
            goto L_0x008c
        L_0x0640:
            r1 = 35
            goto L_0x081a
        L_0x0644:
            java.lang.String r1 = "whyred"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x064e
            goto L_0x008c
        L_0x064e:
            r1 = 34
            goto L_0x081a
        L_0x0652:
            java.lang.String r1 = "watson"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x065c
            goto L_0x008c
        L_0x065c:
            r1 = 33
            goto L_0x081a
        L_0x0660:
            java.lang.String r1 = "SVP-DTV15"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x066a
            goto L_0x008c
        L_0x066a:
            r1 = 32
            goto L_0x081a
        L_0x066e:
            java.lang.String r1 = "A7000-a"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0678
            goto L_0x008c
        L_0x0678:
            r1 = 31
            goto L_0x081a
        L_0x067c:
            java.lang.String r1 = "nicklaus_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0686
            goto L_0x008c
        L_0x0686:
            r1 = 30
            goto L_0x081a
        L_0x068a:
            java.lang.String r1 = "tcl_eu"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0694
            goto L_0x008c
        L_0x0694:
            r1 = 29
            goto L_0x081a
        L_0x0698:
            java.lang.String r1 = "ELUGA_Ray_X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06a2
            goto L_0x008c
        L_0x06a2:
            r1 = 28
            goto L_0x081a
        L_0x06a6:
            java.lang.String r1 = "s905x018"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06b0
            goto L_0x008c
        L_0x06b0:
            r1 = 27
            goto L_0x081a
        L_0x06b4:
            java.lang.String r1 = "A10-70L"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06be
            goto L_0x008c
        L_0x06be:
            r1 = 26
            goto L_0x081a
        L_0x06c2:
            java.lang.String r1 = "A10-70F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06cc
            goto L_0x008c
        L_0x06cc:
            r1 = 25
            goto L_0x081a
        L_0x06d0:
            java.lang.String r1 = "namath"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06da
            goto L_0x008c
        L_0x06da:
            r1 = 24
            goto L_0x081a
        L_0x06de:
            java.lang.String r1 = "Slate_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06e8
            goto L_0x008c
        L_0x06e8:
            r1 = 23
            goto L_0x081a
        L_0x06ec:
            java.lang.String r1 = "iris60"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06f6
            goto L_0x008c
        L_0x06f6:
            r1 = 22
            goto L_0x081a
        L_0x06fa:
            java.lang.String r1 = "BRAVIA_ATV2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0704
            goto L_0x008c
        L_0x0704:
            r1 = 21
            goto L_0x081a
        L_0x0708:
            java.lang.String r1 = "GiONEE_GBL7319"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0712
            goto L_0x008c
        L_0x0712:
            r1 = 20
            goto L_0x081a
        L_0x0716:
            java.lang.String r1 = "panell_dt"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0720
            goto L_0x008c
        L_0x0720:
            r1 = 19
            goto L_0x081a
        L_0x0724:
            java.lang.String r1 = "panell_ds"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x072e
            goto L_0x008c
        L_0x072e:
            r1 = 18
            goto L_0x081a
        L_0x0732:
            java.lang.String r1 = "panell_dl"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x073c
            goto L_0x008c
        L_0x073c:
            r1 = 17
            goto L_0x081a
        L_0x0740:
            java.lang.String r1 = "vernee_M5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x074a
            goto L_0x008c
        L_0x074a:
            r1 = 16
            goto L_0x081a
        L_0x074e:
            java.lang.String r1 = "pacificrim"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0758
            goto L_0x008c
        L_0x0758:
            r1 = 15
            goto L_0x081a
        L_0x075c:
            java.lang.String r1 = "Phantom6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0766
            goto L_0x008c
        L_0x0766:
            r1 = 14
            goto L_0x081a
        L_0x076a:
            java.lang.String r1 = "ComioS1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0774
            goto L_0x008c
        L_0x0774:
            r1 = 13
            goto L_0x081a
        L_0x0778:
            java.lang.String r1 = "XT1663"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0782
            goto L_0x008c
        L_0x0782:
            r1 = 12
            goto L_0x081a
        L_0x0786:
            java.lang.String r1 = "RAIJIN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0790
            goto L_0x008c
        L_0x0790:
            r1 = 11
            goto L_0x081a
        L_0x0794:
            java.lang.String r1 = "AquaPowerM"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x079e
            goto L_0x008c
        L_0x079e:
            r1 = 10
            goto L_0x081a
        L_0x07a2:
            java.lang.String r1 = "PGN611"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07ac
            goto L_0x008c
        L_0x07ac:
            r1 = 9
            goto L_0x081a
        L_0x07b0:
            java.lang.String r1 = "PGN610"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07ba
            goto L_0x008c
        L_0x07ba:
            r1 = 8
            goto L_0x081a
        L_0x07bd:
            java.lang.String r1 = "PGN528"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07c7
            goto L_0x008c
        L_0x07c7:
            r1 = 7
            goto L_0x081a
        L_0x07c9:
            java.lang.String r2 = "NX573J"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x081a
            goto L_0x008c
        L_0x07d3:
            java.lang.String r1 = "NX541J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07dd
            goto L_0x008c
        L_0x07dd:
            r1 = 5
            goto L_0x081a
        L_0x07df:
            java.lang.String r1 = "CP8676_I02"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07e9
            goto L_0x008c
        L_0x07e9:
            r1 = 4
            goto L_0x081a
        L_0x07eb:
            java.lang.String r1 = "K50a40"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07f5
            goto L_0x008c
        L_0x07f5:
            r1 = 3
            goto L_0x081a
        L_0x07f7:
            java.lang.String r1 = "GIONEE_SWW1631"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0801
            goto L_0x008c
        L_0x0801:
            r1 = 2
            goto L_0x081a
        L_0x0803:
            java.lang.String r1 = "GIONEE_SWW1627"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x080d
            goto L_0x008c
        L_0x080d:
            r1 = 1
            goto L_0x081a
        L_0x080f:
            java.lang.String r1 = "GIONEE_SWW1609"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0819
            goto L_0x008c
        L_0x0819:
            r1 = 0
        L_0x081a:
            switch(r1) {
                case 0: goto L_0x084d;
                case 1: goto L_0x084d;
                case 2: goto L_0x084d;
                case 3: goto L_0x084d;
                case 4: goto L_0x084d;
                case 5: goto L_0x084d;
                case 6: goto L_0x084d;
                case 7: goto L_0x084d;
                case 8: goto L_0x084d;
                case 9: goto L_0x084d;
                case 10: goto L_0x084d;
                case 11: goto L_0x084d;
                case 12: goto L_0x084d;
                case 13: goto L_0x084d;
                case 14: goto L_0x084d;
                case 15: goto L_0x084d;
                case 16: goto L_0x084d;
                case 17: goto L_0x084d;
                case 18: goto L_0x084d;
                case 19: goto L_0x084d;
                case 20: goto L_0x084d;
                case 21: goto L_0x084d;
                case 22: goto L_0x084d;
                case 23: goto L_0x084d;
                case 24: goto L_0x084d;
                case 25: goto L_0x084d;
                case 26: goto L_0x084d;
                case 27: goto L_0x084d;
                case 28: goto L_0x084d;
                case 29: goto L_0x084d;
                case 30: goto L_0x084d;
                case 31: goto L_0x084d;
                case 32: goto L_0x084d;
                case 33: goto L_0x084d;
                case 34: goto L_0x084d;
                case 35: goto L_0x084d;
                case 36: goto L_0x084d;
                case 37: goto L_0x084d;
                case 38: goto L_0x084d;
                case 39: goto L_0x084d;
                case 40: goto L_0x084d;
                case 41: goto L_0x084d;
                case 42: goto L_0x084d;
                case 43: goto L_0x084d;
                case 44: goto L_0x084d;
                case 45: goto L_0x084d;
                case 46: goto L_0x084d;
                case 47: goto L_0x084d;
                case 48: goto L_0x084d;
                case 49: goto L_0x084d;
                case 50: goto L_0x084d;
                case 51: goto L_0x084d;
                case 52: goto L_0x084d;
                case 53: goto L_0x084d;
                case 54: goto L_0x084d;
                case 55: goto L_0x084d;
                case 56: goto L_0x084d;
                case 57: goto L_0x084d;
                case 58: goto L_0x084d;
                case 59: goto L_0x084d;
                case 60: goto L_0x084d;
                case 61: goto L_0x084d;
                case 62: goto L_0x084d;
                case 63: goto L_0x084d;
                case 64: goto L_0x084d;
                case 65: goto L_0x084d;
                case 66: goto L_0x084d;
                case 67: goto L_0x084d;
                case 68: goto L_0x084d;
                case 69: goto L_0x084d;
                case 70: goto L_0x084d;
                case 71: goto L_0x084d;
                case 72: goto L_0x084d;
                case 73: goto L_0x084d;
                case 74: goto L_0x084d;
                case 75: goto L_0x084d;
                case 76: goto L_0x084d;
                case 77: goto L_0x084d;
                case 78: goto L_0x084d;
                case 79: goto L_0x084d;
                case 80: goto L_0x084d;
                case 81: goto L_0x084d;
                case 82: goto L_0x084d;
                case 83: goto L_0x084d;
                case 84: goto L_0x084d;
                case 85: goto L_0x084d;
                case 86: goto L_0x084d;
                case 87: goto L_0x084d;
                case 88: goto L_0x084d;
                case 89: goto L_0x084d;
                case 90: goto L_0x084d;
                case 91: goto L_0x084d;
                case 92: goto L_0x084d;
                case 93: goto L_0x084d;
                case 94: goto L_0x084d;
                case 95: goto L_0x084d;
                case 96: goto L_0x084d;
                case 97: goto L_0x084d;
                case 98: goto L_0x084d;
                case 99: goto L_0x084d;
                case 100: goto L_0x084d;
                case 101: goto L_0x084d;
                case 102: goto L_0x084d;
                case 103: goto L_0x084d;
                case 104: goto L_0x084d;
                case 105: goto L_0x084d;
                case 106: goto L_0x084d;
                case 107: goto L_0x084d;
                case 108: goto L_0x084d;
                case 109: goto L_0x084d;
                case 110: goto L_0x084d;
                case 111: goto L_0x084d;
                case 112: goto L_0x084d;
                case 113: goto L_0x084d;
                case 114: goto L_0x084d;
                case 115: goto L_0x084d;
                case 116: goto L_0x084d;
                case 117: goto L_0x084d;
                case 118: goto L_0x084d;
                case 119: goto L_0x084d;
                case 120: goto L_0x084d;
                case 121: goto L_0x084d;
                case 122: goto L_0x084d;
                case 123: goto L_0x084d;
                case 124: goto L_0x084d;
                case 125: goto L_0x084d;
                case 126: goto L_0x084d;
                case 127: goto L_0x084d;
                case 128: goto L_0x084d;
                case 129: goto L_0x084d;
                case 130: goto L_0x084d;
                case 131: goto L_0x084d;
                case 132: goto L_0x084d;
                case 133: goto L_0x084d;
                case 134: goto L_0x084d;
                case 135: goto L_0x084d;
                case 136: goto L_0x084d;
                case 137: goto L_0x084d;
                case 138: goto L_0x084d;
                case 139: goto L_0x084d;
                default: goto L_0x081d;
            }
        L_0x081d:
            java.lang.String r0 = com.applovin.impl.yp.f13665d
            r0.hashCode()
            int r1 = r0.hashCode()
            switch(r1) {
                case -594534941: goto L_0x083f;
                case 2006354: goto L_0x0834;
                case 2006367: goto L_0x082b;
                default: goto L_0x0829;
            }
        L_0x0829:
            r6 = -1
            goto L_0x0849
        L_0x082b:
            java.lang.String r1 = "AFTN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0849
            goto L_0x0829
        L_0x0834:
            java.lang.String r1 = "AFTA"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x083d
            goto L_0x0829
        L_0x083d:
            r6 = 1
            goto L_0x0849
        L_0x083f:
            java.lang.String r1 = "JSN-L21"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0848
            goto L_0x0829
        L_0x0848:
            r6 = 0
        L_0x0849:
            switch(r6) {
                case 0: goto L_0x084d;
                case 1: goto L_0x084d;
                case 2: goto L_0x084d;
                default: goto L_0x084c;
            }
        L_0x084c:
            goto L_0x084e
        L_0x084d:
            return r9
        L_0x084e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.kd.f0():boolean");
    }

    private static boolean g(long j10) {
        return j10 < -30000;
    }

    private void g0() {
        if (this.f8950c1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.L0.a(this.f8950c1, elapsedRealtime - this.f8949b1);
            this.f8950c1 = 0;
            this.f8949b1 = elapsedRealtime;
        }
    }

    private static boolean h(long j10) {
        return j10 < -500000;
    }

    private void i0() {
        int i10 = this.f8956i1;
        if (i10 != 0) {
            this.L0.b(this.f8955h1, i10);
            this.f8955h1 = 0;
            this.f8956i1 = 0;
        }
    }

    private void j0() {
        int i10 = this.f8957j1;
        if (i10 != -1 || this.f8958k1 != -1) {
            yq yqVar = this.f8961n1;
            if (yqVar == null || yqVar.f13679a != i10 || yqVar.f13680b != this.f8958k1 || yqVar.f13681c != this.f8959l1 || yqVar.f13682d != this.f8960m1) {
                yq yqVar2 = new yq(this.f8957j1, this.f8958k1, this.f8959l1, this.f8960m1);
                this.f8961n1 = yqVar2;
                this.L0.b(yqVar2);
            }
        }
    }

    private void k0() {
        if (this.U0) {
            this.L0.a((Object) this.S0);
        }
    }

    private void l0() {
        yq yqVar = this.f8961n1;
        if (yqVar != null) {
            this.L0.b(yqVar);
        }
    }

    /* access modifiers changed from: private */
    public void m0() {
        a0();
    }

    private void n0() {
        this.f8948a1 = this.M0 > 0 ? SystemClock.elapsedRealtime() + this.M0 : -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    public boolean K() {
        return this.f8962o1 && yp.f13662a < 23;
    }

    /* access modifiers changed from: protected */
    public void Q() {
        super.Q();
        c0();
    }

    /* access modifiers changed from: protected */
    public void W() {
        super.W();
        this.f8952e1 = 0;
    }

    public boolean d() {
        f7 f7Var;
        if (super.d() && (this.W0 || (((f7Var = this.T0) != null && this.S0 == f7Var) || I() == null || this.f8962o1))) {
            this.f8948a1 = -9223372036854775807L;
            return true;
        } else if (this.f8948a1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f8948a1) {
                return true;
            }
            this.f8948a1 = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void f(int i10) {
        l5 l5Var = this.E0;
        l5Var.f9191g += i10;
        this.f8950c1 += i10;
        int i11 = this.f8951d1 + i10;
        this.f8951d1 = i11;
        l5Var.f9192h = Math.max(i11, l5Var.f9192h);
        int i12 = this.N0;
        if (i12 > 0 && this.f8950c1 >= i12) {
            g0();
        }
    }

    /* access modifiers changed from: protected */
    public void g(String str) {
        this.L0.a(str);
    }

    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* access modifiers changed from: protected */
    public boolean h(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (kd.class) {
            if (!f8946t1) {
                f8947u1 = f0();
                f8946t1 = true;
            }
        }
        return f8947u1;
    }

    /* access modifiers changed from: package-private */
    public void h0() {
        this.Y0 = true;
        if (!this.W0) {
            this.W0 = true;
            this.L0.a((Object) this.S0);
            this.U0 = true;
        }
    }

    /* access modifiers changed from: protected */
    public void i(long j10) {
        f(j10);
        j0();
        this.E0.f9189e++;
        h0();
        d(j10);
    }

    /* access modifiers changed from: protected */
    public void j(long j10) {
        this.E0.a(j10);
        this.f8955h1 += j10;
        this.f8956i1++;
    }

    /* access modifiers changed from: protected */
    public void v() {
        d0();
        c0();
        this.U0 = false;
        this.K0.b();
        this.f8964q1 = null;
        try {
            super.v();
        } finally {
            this.L0.a(this.E0);
        }
    }

    /* access modifiers changed from: protected */
    public void w() {
        try {
            super.w();
            f7 f7Var = this.T0;
            if (f7Var != null) {
                if (this.S0 == f7Var) {
                    this.S0 = null;
                }
                f7Var.release();
                this.T0 = null;
            }
        } catch (Throwable th) {
            if (this.T0 != null) {
                Surface surface = this.S0;
                f7 f7Var2 = this.T0;
                if (surface == f7Var2) {
                    this.S0 = null;
                }
                f7Var2.release();
                this.T0 = null;
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public void x() {
        super.x();
        this.f8950c1 = 0;
        this.f8949b1 = SystemClock.elapsedRealtime();
        this.f8954g1 = SystemClock.elapsedRealtime() * 1000;
        this.f8955h1 = 0;
        this.f8956i1 = 0;
        this.K0.e();
    }

    /* access modifiers changed from: protected */
    public void y() {
        this.f8948a1 = -9223372036854775807L;
        g0();
        i0();
        this.K0.f();
        super.y();
    }

    /* access modifiers changed from: protected */
    public o5 a(fd fdVar, d9 d9Var, d9 d9Var2) {
        int i10;
        o5 a10 = fdVar.a(d9Var, d9Var2);
        int i11 = a10.f10067e;
        int i12 = d9Var2.f7158r;
        a aVar = this.P0;
        if (i12 > aVar.f8966a || d9Var2.f7159s > aVar.f8967b) {
            i11 |= 256;
        }
        if (c(fdVar, d9Var2) > this.P0.f8968c) {
            i11 |= 64;
        }
        int i13 = i11;
        String str = fdVar.f7722a;
        if (i13 != 0) {
            i10 = 0;
        } else {
            i10 = a10.f10066d;
        }
        return new o5(str, d9Var, d9Var2, i10, i13);
    }

    private final class b implements cd.c, Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f8969a;

        public b(cd cdVar) {
            Handler a10 = yp.a((Handler.Callback) this);
            this.f8969a = a10;
            cdVar.a((cd.c) this, a10);
        }

        private void a(long j10) {
            kd kdVar = kd.this;
            if (this == kdVar.f8964q1) {
                if (j10 == Long.MAX_VALUE) {
                    kdVar.m0();
                    return;
                }
                try {
                    kdVar.i(j10);
                } catch (y7 e10) {
                    kd.this.a(e10);
                }
            }
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a(yp.c(message.arg1, message.arg2));
            return true;
        }

        public void a(cd cdVar, long j10, long j11) {
            if (yp.f13662a < 30) {
                this.f8969a.sendMessageAtFrontOfQueue(Message.obtain(this.f8969a, 0, (int) (j10 >> 32), (int) j10));
                return;
            }
            a(j10);
        }
    }

    /* access modifiers changed from: protected */
    public void c(cd cdVar, int i10, long j10) {
        lo.a("skipVideoBuffer");
        cdVar.a(i10, false);
        lo.a();
        this.E0.f9190f++;
    }

    /* access modifiers changed from: protected */
    public void d(long j10) {
        super.d(j10);
        if (!this.f8962o1) {
            this.f8952e1--;
        }
    }

    private static void a(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    private boolean c(fd fdVar) {
        return yp.f13662a >= 23 && !this.f8962o1 && !h(fdVar.f7722a) && (!fdVar.f7728g || f7.b(this.J0));
    }

    /* access modifiers changed from: protected */
    public boolean d(long j10, long j11) {
        return g(j10) && j11 > 100000;
    }

    /* access modifiers changed from: protected */
    public void a(cd cdVar, int i10, long j10) {
        lo.a("dropVideoBuffer");
        cdVar.a(i10, false);
        lo.a();
        f(1);
    }

    /* access modifiers changed from: protected */
    public boolean b(long j10, boolean z10) {
        int b10 = b(j10);
        if (b10 == 0) {
            return false;
        }
        l5 l5Var = this.E0;
        l5Var.f9193i++;
        int i10 = this.f8952e1 + b10;
        if (z10) {
            l5Var.f9190f += i10;
        } else {
            f(i10);
        }
        G();
        return true;
    }

    public kd(Context context, hd hdVar, long j10, boolean z10, Handler handler, xq xqVar, int i10) {
        this(context, cd.b.f6979a, hdVar, j10, z10, handler, xqVar, i10);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
        if (r3.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_H265) == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r11 = ((java.lang.Integer) r11.first).intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(com.applovin.impl.fd r10, com.applovin.impl.d9 r11) {
        /*
            int r0 = r11.f7158r
            int r1 = r11.f7159s
            r2 = -1
            if (r0 == r2) goto L_0x00c6
            if (r1 != r2) goto L_0x000b
            goto L_0x00c6
        L_0x000b:
            java.lang.String r3 = r11.f7153m
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            r6 = 1
            java.lang.String r7 = "video/hevc"
            r8 = 2
            if (r4 == 0) goto L_0x0034
            android.util.Pair r11 = com.applovin.impl.id.a((com.applovin.impl.d9) r11)
            if (r11 == 0) goto L_0x0033
            java.lang.Object r11 = r11.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r3 = 512(0x200, float:7.175E-43)
            if (r11 == r3) goto L_0x0031
            if (r11 == r6) goto L_0x0031
            if (r11 != r8) goto L_0x0033
        L_0x0031:
            r3 = r5
            goto L_0x0034
        L_0x0033:
            r3 = r7
        L_0x0034:
            r3.hashCode()
            int r11 = r3.hashCode()
            r4 = 4
            r9 = 3
            switch(r11) {
                case -1664118616: goto L_0x0073;
                case -1662541442: goto L_0x006c;
                case 1187890754: goto L_0x0061;
                case 1331836730: goto L_0x0058;
                case 1599127256: goto L_0x004d;
                case 1599127257: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            r6 = -1
            goto L_0x007d
        L_0x0042:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L_0x004b
            goto L_0x0040
        L_0x004b:
            r6 = 5
            goto L_0x007d
        L_0x004d:
            java.lang.String r11 = "video/x-vnd.on2.vp8"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L_0x0056
            goto L_0x0040
        L_0x0056:
            r6 = 4
            goto L_0x007d
        L_0x0058:
            boolean r11 = r3.equals(r5)
            if (r11 != 0) goto L_0x005f
            goto L_0x0040
        L_0x005f:
            r6 = 3
            goto L_0x007d
        L_0x0061:
            java.lang.String r11 = "video/mp4v-es"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L_0x006a
            goto L_0x0040
        L_0x006a:
            r6 = 2
            goto L_0x007d
        L_0x006c:
            boolean r11 = r3.equals(r7)
            if (r11 != 0) goto L_0x007d
            goto L_0x0040
        L_0x0073:
            java.lang.String r11 = "video/3gpp"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L_0x007c
            goto L_0x0040
        L_0x007c:
            r6 = 0
        L_0x007d:
            switch(r6) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x00ba;
                case 2: goto L_0x00bd;
                case 3: goto L_0x0081;
                case 4: goto L_0x00bd;
                case 5: goto L_0x00ba;
                default: goto L_0x0080;
            }
        L_0x0080:
            return r2
        L_0x0081:
            java.lang.String r11 = com.applovin.impl.yp.f13665d
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x00b9
            java.lang.String r3 = com.applovin.impl.yp.f13664c
            java.lang.String r4 = "Amazon"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00aa
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x00b9
            java.lang.String r3 = "AFTS"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x00aa
            boolean r10 = r10.f7728g
            if (r10 == 0) goto L_0x00aa
            goto L_0x00b9
        L_0x00aa:
            r10 = 16
            int r11 = com.applovin.impl.yp.a((int) r0, (int) r10)
            int r10 = com.applovin.impl.yp.a((int) r1, (int) r10)
            int r11 = r11 * r10
            int r11 = r11 * 256
            goto L_0x00bf
        L_0x00b9:
            return r2
        L_0x00ba:
            int r11 = r0 * r1
            goto L_0x00c0
        L_0x00bd:
            int r11 = r0 * r1
        L_0x00bf:
            r4 = 2
        L_0x00c0:
            int r11 = r11 * 3
            int r4 = r4 * 2
            int r11 = r11 / r4
            return r11
        L_0x00c6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.kd.a(com.applovin.impl.fd, com.applovin.impl.d9):int");
    }

    /* access modifiers changed from: protected */
    public void b(n5 n5Var) {
        boolean z10 = this.f8962o1;
        if (!z10) {
            this.f8952e1++;
        }
        if (yp.f13662a < 23 && z10) {
            i(n5Var.f9908f);
        }
    }

    /* access modifiers changed from: protected */
    public void b(cd cdVar, int i10, long j10) {
        j0();
        lo.a("releaseOutputBuffer");
        cdVar.a(i10, true);
        lo.a();
        this.f8954g1 = SystemClock.elapsedRealtime() * 1000;
        this.E0.f9189e++;
        this.f8951d1 = 0;
        h0();
    }

    /* access modifiers changed from: protected */
    public a a(fd fdVar, d9 d9Var, d9[] d9VarArr) {
        int a10;
        int i10 = d9Var.f7158r;
        int i11 = d9Var.f7159s;
        int c10 = c(fdVar, d9Var);
        if (d9VarArr.length == 1) {
            if (!(c10 == -1 || (a10 = a(fdVar, d9Var)) == -1)) {
                c10 = Math.min((int) (((float) c10) * 1.5f), a10);
            }
            return new a(i10, i11, c10);
        }
        int length = d9VarArr.length;
        boolean z10 = false;
        for (int i12 = 0; i12 < length; i12++) {
            d9 d9Var2 = d9VarArr[i12];
            if (d9Var.f7165y != null && d9Var2.f7165y == null) {
                d9Var2 = d9Var2.a().a(d9Var.f7165y).a();
            }
            if (fdVar.a(d9Var, d9Var2).f10066d != 0) {
                int i13 = d9Var2.f7158r;
                z10 |= i13 == -1 || d9Var2.f7159s == -1;
                i10 = Math.max(i10, i13);
                i11 = Math.max(i11, d9Var2.f7159s);
                c10 = Math.max(c10, c(fdVar, d9Var2));
            }
        }
        if (z10) {
            kc.d("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i10 + "x" + i11);
            Point b10 = b(fdVar, d9Var);
            if (b10 != null) {
                i10 = Math.max(i10, b10.x);
                i11 = Math.max(i11, b10.y);
                c10 = Math.max(c10, a(fdVar, d9Var.a().q(i10).g(i11).a()));
                kc.d("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i10 + "x" + i11);
            }
        }
        return new a(i10, i11, c10);
    }

    /* access modifiers changed from: protected */
    public boolean b(long j10, long j11, boolean z10) {
        return g(j10) && !z10;
    }

    /* access modifiers changed from: protected */
    public boolean b(fd fdVar) {
        return this.S0 != null || c(fdVar);
    }

    /* access modifiers changed from: protected */
    public float a(float f10, d9 d9Var, d9[] d9VarArr) {
        float f11 = -1.0f;
        for (d9 d9Var2 : d9VarArr) {
            float f12 = d9Var2.f7160t;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    /* access modifiers changed from: protected */
    public List a(hd hdVar, d9 d9Var, boolean z10) {
        return a(hdVar, d9Var, z10, this.f8962o1);
    }

    private static List a(hd hdVar, d9 d9Var, boolean z10, boolean z11) {
        Pair a10;
        String str = d9Var.f7153m;
        if (str == null) {
            return Collections.emptyList();
        }
        List a11 = id.a(hdVar.a(str, z10, z11), d9Var);
        if ("video/dolby-vision".equals(str) && (a10 = id.a(d9Var)) != null) {
            int intValue = ((Integer) a10.first).intValue();
            if (intValue == 16 || intValue == 256) {
                a11.addAll(hdVar.a(MimeTypes.VIDEO_H265, z10, z11));
            } else if (intValue == 512) {
                a11.addAll(hdVar.a(MimeTypes.VIDEO_H264, z10, z11));
            }
        }
        return Collections.unmodifiableList(a11);
    }

    /* access modifiers changed from: protected */
    public cd.a a(fd fdVar, d9 d9Var, MediaCrypto mediaCrypto, float f10) {
        f7 f7Var = this.T0;
        if (!(f7Var == null || f7Var.f7639a == fdVar.f7728g)) {
            f7Var.release();
            this.T0 = null;
        }
        String str = fdVar.f7724c;
        a a10 = a(fdVar, d9Var, t());
        this.P0 = a10;
        MediaFormat a11 = a(d9Var, str, a10, f10, this.O0, this.f8962o1 ? this.f8963p1 : 0);
        if (this.S0 == null) {
            if (c(fdVar)) {
                if (this.T0 == null) {
                    this.T0 = f7.a(this.J0, fdVar.f7728g);
                }
                this.S0 = this.T0;
            } else {
                throw new IllegalStateException();
            }
        }
        return cd.a.a(fdVar, a11, d9Var, this.S0, mediaCrypto);
    }

    /* access modifiers changed from: protected */
    public MediaFormat a(d9 d9Var, String str, a aVar, float f10, boolean z10, int i10) {
        Pair a10;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", d9Var.f7158r);
        mediaFormat.setInteger("height", d9Var.f7159s);
        nd.a(mediaFormat, d9Var.f7155o);
        nd.a(mediaFormat, "frame-rate", d9Var.f7160t);
        nd.a(mediaFormat, "rotation-degrees", d9Var.f7161u);
        nd.a(mediaFormat, d9Var.f7165y);
        if ("video/dolby-vision".equals(d9Var.f7153m) && (a10 = id.a(d9Var)) != null) {
            nd.a(mediaFormat, "profile", ((Integer) a10.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f8966a);
        mediaFormat.setInteger("max-height", aVar.f8967b);
        nd.a(mediaFormat, "max-input-size", aVar.f8968c);
        if (yp.f13662a >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            a(mediaFormat, i10);
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    public void a(n5 n5Var) {
        if (this.R0) {
            ByteBuffer byteBuffer = (ByteBuffer) a1.a((Object) n5Var.f9909g);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    a(I(), bArr);
                }
            }
        }
    }

    public void a(int i10, Object obj) {
        if (i10 == 1) {
            a(obj);
        } else if (i10 == 7) {
            this.f8965r1 = (vq) obj;
        } else if (i10 == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.f8963p1 != intValue) {
                this.f8963p1 = intValue;
                if (this.f8962o1) {
                    U();
                }
            }
        } else if (i10 == 4) {
            this.V0 = ((Integer) obj).intValue();
            cd I = I();
            if (I != null) {
                I.c(this.V0);
            }
        } else if (i10 != 5) {
            super.a(i10, obj);
        } else {
            this.K0.a(((Integer) obj).intValue());
        }
    }

    private void a(long j10, long j11, d9 d9Var) {
        vq vqVar = this.f8965r1;
        if (vqVar != null) {
            vqVar.a(j10, j11, d9Var, L());
        }
    }

    /* access modifiers changed from: protected */
    public void a(Exception exc) {
        kc.a("MediaCodecVideoRenderer", "Video codec error", exc);
        this.L0.b(exc);
    }

    /* access modifiers changed from: protected */
    public void a(String str, long j10, long j11) {
        this.L0.a(str, j10, j11);
        this.Q0 = h(str);
        this.R0 = ((fd) a1.a((Object) J())).b();
        if (yp.f13662a >= 23 && this.f8962o1) {
            this.f8964q1 = new b((cd) a1.a((Object) I()));
        }
    }

    /* access modifiers changed from: protected */
    public void a(boolean z10, boolean z11) {
        super.a(z10, z11);
        boolean z12 = q().f9996a;
        a1.b(!z12 || this.f8963p1 != 0);
        if (this.f8962o1 != z12) {
            this.f8962o1 = z12;
            U();
        }
        this.L0.b(this.E0);
        this.K0.c();
        this.X0 = z11;
        this.Y0 = false;
    }

    /* access modifiers changed from: protected */
    public o5 a(e9 e9Var) {
        o5 a10 = super.a(e9Var);
        this.L0.a(e9Var.f7378b, a10);
        return a10;
    }

    /* access modifiers changed from: protected */
    public void a(d9 d9Var, MediaFormat mediaFormat) {
        int i10;
        int i11;
        cd I = I();
        if (I != null) {
            I.c(this.V0);
        }
        if (this.f8962o1) {
            this.f8957j1 = d9Var.f7158r;
            this.f8958k1 = d9Var.f7159s;
        } else {
            a1.a((Object) mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z10) {
                i10 = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                i10 = mediaFormat.getInteger("width");
            }
            this.f8957j1 = i10;
            if (z10) {
                i11 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                i11 = mediaFormat.getInteger("height");
            }
            this.f8958k1 = i11;
        }
        float f10 = d9Var.f7162v;
        this.f8960m1 = f10;
        if (yp.f13662a >= 21) {
            int i12 = d9Var.f7161u;
            if (i12 == 90 || i12 == 270) {
                int i13 = this.f8957j1;
                this.f8957j1 = this.f8958k1;
                this.f8958k1 = i13;
                this.f8960m1 = 1.0f / f10;
            }
        } else {
            this.f8959l1 = d9Var.f7161u;
        }
        this.K0.a(d9Var.f7160t);
    }

    /* access modifiers changed from: protected */
    public void a(long j10, boolean z10) {
        super.a(j10, z10);
        c0();
        this.K0.d();
        this.f8953f1 = -9223372036854775807L;
        this.Z0 = -9223372036854775807L;
        this.f8951d1 = 0;
        if (z10) {
            n0();
        } else {
            this.f8948a1 = -9223372036854775807L;
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(long j10, long j11, cd cdVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, d9 d9Var) {
        long j13;
        boolean z12;
        long j14 = j10;
        cd cdVar2 = cdVar;
        int i13 = i10;
        long j15 = j12;
        a1.a((Object) cdVar);
        if (this.Z0 == -9223372036854775807L) {
            this.Z0 = j14;
        }
        if (j15 != this.f8953f1) {
            this.K0.b(j15);
            this.f8953f1 = j15;
        }
        long M = M();
        long j16 = j15 - M;
        if (!z10 || z11) {
            double N = (double) N();
            boolean z13 = b() == 2;
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            long j17 = (long) (((double) (j15 - j14)) / N);
            if (z13) {
                j17 -= elapsedRealtime - j11;
            }
            if (this.S0 != this.T0) {
                long j18 = elapsedRealtime - this.f8954g1;
                if (this.Y0 ? this.W0 : !z13 && !this.X0) {
                    j13 = j18;
                    z12 = false;
                } else {
                    j13 = j18;
                    z12 = true;
                }
                if (this.f8948a1 != -9223372036854775807L || j14 < M || (!z12 && (!z13 || !d(j17, j13)))) {
                    if (z13 && j14 != this.Z0) {
                        long nanoTime = System.nanoTime();
                        long a10 = this.K0.a((j17 * 1000) + nanoTime);
                        long j19 = (a10 - nanoTime) / 1000;
                        long j20 = j19;
                        boolean z14 = this.f8948a1 != -9223372036854775807L;
                        if (a(j19, j11, z11) && b(j14, z14)) {
                            return false;
                        }
                        if (b(j20, j11, z11)) {
                            if (z14) {
                                c(cdVar2, i13, j16);
                            } else {
                                a(cdVar2, i13, j16);
                            }
                            j(j20);
                            return true;
                        }
                        long j21 = j20;
                        if (yp.f13662a >= 21) {
                            if (j21 < 50000) {
                                a(j16, a10, d9Var);
                                a(cdVar, i10, j16, a10);
                                j(j21);
                                return true;
                            }
                        } else if (j21 < 30000) {
                            if (j21 > 11000) {
                                try {
                                    Thread.sleep((j21 - UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) / 1000);
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    return false;
                                }
                            }
                            a(j16, a10, d9Var);
                            b(cdVar2, i13, j16);
                            j(j21);
                            return true;
                        }
                    }
                    return false;
                }
                long nanoTime2 = System.nanoTime();
                a(j16, nanoTime2, d9Var);
                if (yp.f13662a >= 21) {
                    a(cdVar, i10, j16, nanoTime2);
                } else {
                    b(cdVar2, i13, j16);
                }
                j(j17);
                return true;
            } else if (!g(j17)) {
                return false;
            } else {
                c(cdVar2, i13, j16);
                j(j17);
                return true;
            }
        } else {
            c(cdVar2, i13, j16);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void a(cd cdVar, int i10, long j10, long j11) {
        j0();
        lo.a("releaseOutputBuffer");
        cdVar.a(i10, j11);
        lo.a();
        this.f8954g1 = SystemClock.elapsedRealtime() * 1000;
        this.E0.f9189e++;
        this.f8951d1 = 0;
        h0();
    }

    private static void a(cd cdVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        cdVar.a(bundle);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.view.Surface
            if (r0 == 0) goto L_0x0007
            android.view.Surface r5 = (android.view.Surface) r5
            goto L_0x0008
        L_0x0007:
            r5 = 0
        L_0x0008:
            if (r5 != 0) goto L_0x0026
            com.applovin.impl.f7 r0 = r4.T0
            if (r0 == 0) goto L_0x0010
            r5 = r0
            goto L_0x0026
        L_0x0010:
            com.applovin.impl.fd r0 = r4.J()
            if (r0 == 0) goto L_0x0026
            boolean r1 = r4.c(r0)
            if (r1 == 0) goto L_0x0026
            android.content.Context r5 = r4.J0
            boolean r0 = r0.f7728g
            com.applovin.impl.f7 r5 = com.applovin.impl.f7.a(r5, r0)
            r4.T0 = r5
        L_0x0026:
            android.view.Surface r0 = r4.S0
            if (r0 == r5) goto L_0x006e
            r4.S0 = r5
            com.applovin.impl.wq r0 = r4.K0
            r0.a((android.view.Surface) r5)
            r0 = 0
            r4.U0 = r0
            int r0 = r4.b()
            com.applovin.impl.cd r1 = r4.I()
            if (r1 == 0) goto L_0x0054
            int r2 = com.applovin.impl.yp.f13662a
            r3 = 23
            if (r2 < r3) goto L_0x004e
            if (r5 == 0) goto L_0x004e
            boolean r2 = r4.Q0
            if (r2 != 0) goto L_0x004e
            r4.a((com.applovin.impl.cd) r1, (android.view.Surface) r5)
            goto L_0x0054
        L_0x004e:
            r4.U()
            r4.P()
        L_0x0054:
            if (r5 == 0) goto L_0x0067
            com.applovin.impl.f7 r1 = r4.T0
            if (r5 == r1) goto L_0x0067
            r4.l0()
            r4.c0()
            r5 = 2
            if (r0 != r5) goto L_0x007a
            r4.n0()
            goto L_0x007a
        L_0x0067:
            r4.d0()
            r4.c0()
            goto L_0x007a
        L_0x006e:
            if (r5 == 0) goto L_0x007a
            com.applovin.impl.f7 r0 = r4.T0
            if (r5 == r0) goto L_0x007a
            r4.l0()
            r4.k0()
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.kd.a(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    public void a(cd cdVar, Surface surface) {
        cdVar.a(surface);
    }

    public void a(float f10, float f11) {
        super.a(f10, f11);
        this.K0.b(f10);
    }

    /* access modifiers changed from: protected */
    public boolean a(long j10, long j11, boolean z10) {
        return h(j10) && !z10;
    }

    /* access modifiers changed from: protected */
    public int a(hd hdVar, d9 d9Var) {
        int i10 = 0;
        if (!df.i(d9Var.f7153m)) {
            return hz.a(0);
        }
        boolean z10 = d9Var.f7156p != null;
        List a10 = a(hdVar, d9Var, z10, false);
        if (z10 && a10.isEmpty()) {
            a10 = a(hdVar, d9Var, false, false);
        }
        if (a10.isEmpty()) {
            return hz.a(1);
        }
        if (!gd.d(d9Var)) {
            return hz.a(2);
        }
        fd fdVar = (fd) a10.get(0);
        boolean b10 = fdVar.b(d9Var);
        int i11 = fdVar.c(d9Var) ? 16 : 8;
        if (b10) {
            List a11 = a(hdVar, d9Var, z10, true);
            if (!a11.isEmpty()) {
                fd fdVar2 = (fd) a11.get(0);
                if (fdVar2.b(d9Var) && fdVar2.c(d9Var)) {
                    i10 = 32;
                }
            }
        }
        return hz.b(b10 ? 4 : 3, i11, i10);
    }

    /* access modifiers changed from: protected */
    public ed a(Throwable th, fd fdVar) {
        return new jd(th, fdVar, this.S0);
    }
}
