package com.applovin.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.z4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class i7 {

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f8443h = {0, 7, 8, Ascii.SI};

    /* renamed from: i  reason: collision with root package name */
    private static final byte[] f8444i = {0, 119, -120, -1};

    /* renamed from: j  reason: collision with root package name */
    private static final byte[] f8445j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f8446a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f8447b;

    /* renamed from: c  reason: collision with root package name */
    private final Canvas f8448c = new Canvas();

    /* renamed from: d  reason: collision with root package name */
    private final b f8449d = new b(719, 575, 0, 719, 0, 575);

    /* renamed from: e  reason: collision with root package name */
    private final a f8450e = new a(0, a(), b(), c());

    /* renamed from: f  reason: collision with root package name */
    private final h f8451f;

    /* renamed from: g  reason: collision with root package name */
    private Bitmap f8452g;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f8453a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f8454b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f8455c;

        /* renamed from: d  reason: collision with root package name */
        public final int[] f8456d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f8453a = i10;
            this.f8454b = iArr;
            this.f8455c = iArr2;
            this.f8456d = iArr3;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f8457a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8458b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8459c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8460d;

        /* renamed from: e  reason: collision with root package name */
        public final int f8461e;

        /* renamed from: f  reason: collision with root package name */
        public final int f8462f;

        public b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f8457a = i10;
            this.f8458b = i11;
            this.f8459c = i12;
            this.f8460d = i13;
            this.f8461e = i14;
            this.f8462f = i15;
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f8463a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f8464b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f8465c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f8466d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f8463a = i10;
            this.f8464b = z10;
            this.f8465c = bArr;
            this.f8466d = bArr2;
        }
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f8467a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8468b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8469c;

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray f8470d;

        public d(int i10, int i11, int i12, SparseArray sparseArray) {
            this.f8467a = i10;
            this.f8468b = i11;
            this.f8469c = i12;
            this.f8470d = sparseArray;
        }
    }

    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f8471a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8472b;

        public e(int i10, int i11) {
            this.f8471a = i10;
            this.f8472b = i11;
        }
    }

    private static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f8473a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f8474b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8475c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8476d;

        /* renamed from: e  reason: collision with root package name */
        public final int f8477e;

        /* renamed from: f  reason: collision with root package name */
        public final int f8478f;

        /* renamed from: g  reason: collision with root package name */
        public final int f8479g;

        /* renamed from: h  reason: collision with root package name */
        public final int f8480h;

        /* renamed from: i  reason: collision with root package name */
        public final int f8481i;

        /* renamed from: j  reason: collision with root package name */
        public final int f8482j;

        /* renamed from: k  reason: collision with root package name */
        public final SparseArray f8483k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray sparseArray) {
            this.f8473a = i10;
            this.f8474b = z10;
            this.f8475c = i11;
            this.f8476d = i12;
            this.f8477e = i13;
            this.f8478f = i14;
            this.f8479g = i15;
            this.f8480h = i16;
            this.f8481i = i17;
            this.f8482j = i18;
            this.f8483k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray sparseArray = fVar.f8483k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f8483k.put(sparseArray.keyAt(i10), (g) sparseArray.valueAt(i10));
            }
        }
    }

    private static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final int f8484a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8485b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8486c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8487d;

        /* renamed from: e  reason: collision with root package name */
        public final int f8488e;

        /* renamed from: f  reason: collision with root package name */
        public final int f8489f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f8484a = i10;
            this.f8485b = i11;
            this.f8486c = i12;
            this.f8487d = i13;
            this.f8488e = i14;
            this.f8489f = i15;
        }
    }

    private static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final int f8490a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8491b;

        /* renamed from: c  reason: collision with root package name */
        public final SparseArray f8492c = new SparseArray();

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray f8493d = new SparseArray();

        /* renamed from: e  reason: collision with root package name */
        public final SparseArray f8494e = new SparseArray();

        /* renamed from: f  reason: collision with root package name */
        public final SparseArray f8495f = new SparseArray();

        /* renamed from: g  reason: collision with root package name */
        public final SparseArray f8496g = new SparseArray();

        /* renamed from: h  reason: collision with root package name */
        public b f8497h;

        /* renamed from: i  reason: collision with root package name */
        public d f8498i;

        public h(int i10, int i11) {
            this.f8490a = i10;
            this.f8491b = i11;
        }

        public void a() {
            this.f8492c.clear();
            this.f8493d.clear();
            this.f8494e.clear();
            this.f8495f.clear();
            this.f8496g.clear();
            this.f8497h = null;
            this.f8498i = null;
        }
    }

    public i7(int i10, int i11) {
        Paint paint = new Paint();
        this.f8446a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.f8447b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        this.f8451f = new h(i10, i11);
    }

    private static int a(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static byte[] a(int i10, int i11, xg xgVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) xgVar.a(i11);
        }
        return bArr;
    }

    private static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = a(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                int i11 = 127;
                int i12 = (i10 & 1) != 0 ? 127 : 0;
                int i13 = (i10 & 2) != 0 ? 127 : 0;
                if ((i10 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i10] = a(255, i12, i13, i11);
            }
        }
        return iArr;
    }

    private static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = 255;
            if (i10 < 8) {
                int i12 = (i10 & 1) != 0 ? 255 : 0;
                int i13 = (i10 & 2) != 0 ? 255 : 0;
                if ((i10 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i10] = a(63, i12, i13, i11);
            } else {
                int i14 = i10 & 136;
                int i15 = 170;
                int i16 = 85;
                if (i14 == 0) {
                    int i17 = ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0);
                    int i18 = ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0);
                    if ((i10 & 4) == 0) {
                        i16 = 0;
                    }
                    if ((i10 & 64) == 0) {
                        i15 = 0;
                    }
                    iArr[i10] = a(255, i17, i18, i16 + i15);
                } else if (i14 != 8) {
                    int i19 = 43;
                    if (i14 == 128) {
                        int i20 = ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0);
                        int i21 = ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0);
                        if ((i10 & 4) == 0) {
                            i19 = 0;
                        }
                        int i22 = i19 + 127;
                        if ((i10 & 64) == 0) {
                            i16 = 0;
                        }
                        iArr[i10] = a(255, i20, i21, i22 + i16);
                    } else if (i14 == 136) {
                        int i23 = ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0);
                        int i24 = ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0);
                        if ((i10 & 4) == 0) {
                            i19 = 0;
                        }
                        if ((i10 & 64) == 0) {
                            i16 = 0;
                        }
                        iArr[i10] = a(255, i23, i24, i19 + i16);
                    }
                } else {
                    int i25 = ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0);
                    int i26 = ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0);
                    if ((i10 & 4) == 0) {
                        i16 = 0;
                    }
                    if ((i10 & 64) == 0) {
                        i15 = 0;
                    }
                    iArr[i10] = a(127, i25, i26, i16 + i15);
                }
            }
        }
        return iArr;
    }

    public void d() {
        this.f8451f.a();
    }

    private static int[] a() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e A[LOOP:0: B:1:0x0009->B:34:0x008e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int b(com.applovin.impl.xg r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 4
            int r4 = r13.a((int) r3)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0016
            r11 = r2
        L_0x0013:
            r12 = 1
            goto L_0x006e
        L_0x0016:
            boolean r4 = r13.f()
            r7 = 3
            if (r4 != 0) goto L_0x002d
            int r3 = r13.a((int) r7)
            if (r3 == 0) goto L_0x0029
            int r5 = r3 + 2
            r11 = r2
            r12 = r5
            r4 = 0
            goto L_0x006e
        L_0x0029:
            r4 = 0
            r11 = 1
        L_0x002b:
            r12 = 0
            goto L_0x006e
        L_0x002d:
            boolean r4 = r13.f()
            if (r4 != 0) goto L_0x0040
            int r4 = r13.a((int) r5)
            int r5 = r4 + 4
            int r4 = r13.a((int) r3)
        L_0x003d:
            r11 = r2
            r12 = r5
            goto L_0x006e
        L_0x0040:
            int r4 = r13.a((int) r5)
            if (r4 == 0) goto L_0x006b
            if (r4 == r6) goto L_0x0067
            if (r4 == r5) goto L_0x005c
            if (r4 == r7) goto L_0x004f
            r11 = r2
            r4 = 0
            goto L_0x002b
        L_0x004f:
            r4 = 8
            int r4 = r13.a((int) r4)
            int r5 = r4 + 25
            int r4 = r13.a((int) r3)
            goto L_0x003d
        L_0x005c:
            int r4 = r13.a((int) r3)
            int r5 = r4 + 9
            int r4 = r13.a((int) r3)
            goto L_0x003d
        L_0x0067:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L_0x006e
        L_0x006b:
            r11 = r2
            r4 = 0
            goto L_0x0013
        L_0x006e:
            if (r12 == 0) goto L_0x008a
            if (r8 == 0) goto L_0x008a
            if (r15 == 0) goto L_0x0076
            byte r4 = r15[r4]
        L_0x0076:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x008a:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x008e
            return r10
        L_0x008e:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.i7.b(com.applovin.impl.xg, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0082 A[LOOP:0: B:1:0x0009->B:31:0x0082, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0081 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(com.applovin.impl.xg r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 2
            int r4 = r13.a((int) r3)
            r5 = 1
            if (r4 == 0) goto L_0x0014
            r11 = r2
        L_0x0012:
            r12 = 1
            goto L_0x0060
        L_0x0014:
            boolean r4 = r13.f()
            r6 = 3
            if (r4 == 0) goto L_0x0028
            int r4 = r13.a((int) r6)
            int r4 = r4 + r6
            int r3 = r13.a((int) r3)
        L_0x0024:
            r11 = r2
            r12 = r4
            r4 = r3
            goto L_0x0060
        L_0x0028:
            boolean r4 = r13.f()
            if (r4 == 0) goto L_0x0031
            r11 = r2
            r4 = 0
            goto L_0x0012
        L_0x0031:
            int r4 = r13.a((int) r3)
            if (r4 == 0) goto L_0x005d
            if (r4 == r5) goto L_0x0059
            if (r4 == r3) goto L_0x004d
            if (r4 == r6) goto L_0x0040
            r11 = r2
            r4 = 0
            goto L_0x005f
        L_0x0040:
            r4 = 8
            int r4 = r13.a((int) r4)
            int r4 = r4 + 29
            int r3 = r13.a((int) r3)
            goto L_0x0024
        L_0x004d:
            r4 = 4
            int r4 = r13.a((int) r4)
            int r4 = r4 + 12
            int r3 = r13.a((int) r3)
            goto L_0x0024
        L_0x0059:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L_0x0060
        L_0x005d:
            r4 = 0
            r11 = 1
        L_0x005f:
            r12 = 0
        L_0x0060:
            if (r12 == 0) goto L_0x007e
            if (r8 == 0) goto L_0x007e
            if (r15 == 0) goto L_0x0068
            byte r4 = r15[r4]
        L_0x0068:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x007e:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0082
            return r10
        L_0x0082:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.i7.a(com.applovin.impl.xg, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int c(com.applovin.impl.xg r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 8
            int r4 = r13.a((int) r3)
            r5 = 1
            if (r4 == 0) goto L_0x0015
            r11 = r2
            r12 = 1
            goto L_0x0035
        L_0x0015:
            boolean r4 = r13.f()
            r6 = 7
            if (r4 != 0) goto L_0x002a
            int r3 = r13.a((int) r6)
            if (r3 == 0) goto L_0x0026
            r11 = r2
            r12 = r3
            r4 = 0
            goto L_0x0035
        L_0x0026:
            r4 = 0
            r11 = 1
            r12 = 0
            goto L_0x0035
        L_0x002a:
            int r4 = r13.a((int) r6)
            int r3 = r13.a((int) r3)
            r11 = r2
            r12 = r4
            r4 = r3
        L_0x0035:
            if (r12 == 0) goto L_0x0053
            if (r8 == 0) goto L_0x0053
            if (r15 == 0) goto L_0x003d
            byte r4 = r15[r4]
        L_0x003d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0053:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0057
            return r10
        L_0x0057:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.i7.c(com.applovin.impl.xg, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    private static f c(xg xgVar, int i10) {
        int i11;
        int i12;
        xg xgVar2 = xgVar;
        int a10 = xgVar2.a(8);
        xgVar2.d(4);
        boolean f10 = xgVar.f();
        xgVar2.d(3);
        int i13 = 16;
        int a11 = xgVar2.a(16);
        int a12 = xgVar2.a(16);
        int a13 = xgVar2.a(3);
        int a14 = xgVar2.a(3);
        int i14 = 2;
        xgVar2.d(2);
        int a15 = xgVar2.a(8);
        int a16 = xgVar2.a(8);
        int a17 = xgVar2.a(4);
        int a18 = xgVar2.a(2);
        xgVar2.d(2);
        int i15 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i15 > 0) {
            int a19 = xgVar2.a(i13);
            int a20 = xgVar2.a(i14);
            int a21 = xgVar2.a(i14);
            int a22 = xgVar2.a(12);
            int i16 = a18;
            xgVar2.d(4);
            int a23 = xgVar2.a(12);
            int i17 = i15 - 6;
            if (a20 != 1) {
                if (a20 != 2) {
                    i15 = i17;
                    i12 = 0;
                    i11 = 0;
                    sparseArray.put(a19, new g(a20, a21, a22, a23, i12, i11));
                    a18 = i16;
                    i14 = 2;
                    i13 = 16;
                }
            }
            i15 -= 8;
            i12 = xgVar2.a(8);
            i11 = xgVar2.a(8);
            sparseArray.put(a19, new g(a20, a21, a22, a23, i12, i11));
            a18 = i16;
            i14 = 2;
            i13 = 16;
        }
        return new f(a10, f10, a11, a12, a13, a14, a15, a16, a17, a18, sparseArray);
    }

    private static void a(c cVar, a aVar, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = aVar.f8456d;
        } else if (i10 == 2) {
            iArr = aVar.f8455c;
        } else {
            iArr = aVar.f8454b;
        }
        int[] iArr2 = iArr;
        int i13 = i10;
        int i14 = i11;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        a(cVar.f8465c, iArr2, i13, i14, i12, paint2, canvas2);
        a(cVar.f8466d, iArr2, i13, i14, i12 + 1, paint2, canvas2);
    }

    private static c b(xg xgVar) {
        byte[] bArr;
        int a10 = xgVar.a(16);
        xgVar.d(4);
        int a11 = xgVar.a(2);
        boolean f10 = xgVar.f();
        xgVar.d(1);
        byte[] bArr2 = yp.f13667f;
        if (a11 == 1) {
            xgVar.d(xgVar.a(8) * 16);
        } else if (a11 == 0) {
            int a12 = xgVar.a(16);
            int a13 = xgVar.a(16);
            if (a12 > 0) {
                bArr2 = new byte[a12];
                xgVar.b(bArr2, 0, a12);
            }
            if (a13 > 0) {
                bArr = new byte[a13];
                xgVar.b(bArr, 0, a13);
                return new c(a10, f10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(a10, f10, bArr2, bArr);
    }

    private static a a(xg xgVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        xg xgVar2 = xgVar;
        int i16 = 8;
        int a10 = xgVar2.a(8);
        xgVar2.d(8);
        int i17 = 2;
        int i18 = i10 - 2;
        int[] a11 = a();
        int[] b10 = b();
        int[] c10 = c();
        while (i18 > 0) {
            int a12 = xgVar2.a(i16);
            int a13 = xgVar2.a(i16);
            int[] iArr = (a13 & 128) != 0 ? a11 : (a13 & 64) != 0 ? b10 : c10;
            if ((a13 & 1) != 0) {
                i14 = xgVar2.a(i16);
                i13 = xgVar2.a(i16);
                i12 = xgVar2.a(i16);
                i11 = xgVar2.a(i16);
                i15 = i18 - 6;
            } else {
                i12 = xgVar2.a(4) << 4;
                i15 = i18 - 4;
                int a14 = xgVar2.a(4) << 4;
                i11 = xgVar2.a(i17) << 6;
                i14 = xgVar2.a(6) << i17;
                i13 = a14;
            }
            if (i14 == 0) {
                i13 = 0;
                i12 = 0;
                i11 = 255;
            }
            double d10 = (double) i14;
            double d11 = (double) (i13 - 128);
            double d12 = (double) (i12 - 128);
            iArr[a12] = a((byte) (255 - (i11 & 255)), yp.a((int) (d10 + (1.402d * d11)), 0, 255), yp.a((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), yp.a((int) (d10 + (d12 * 1.772d)), 0, 255));
            i18 = i15;
            a10 = a10;
            i16 = 8;
            i17 = 2;
        }
        return new a(a10, a11, b10, c10);
    }

    private static d b(xg xgVar, int i10) {
        int a10 = xgVar.a(8);
        int a11 = xgVar.a(4);
        int a12 = xgVar.a(2);
        xgVar.d(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int a13 = xgVar.a(8);
            xgVar.d(8);
            i11 -= 6;
            sparseArray.put(a13, new e(xgVar.a(16), xgVar.a(16)));
        }
        return new d(a10, a11, a12, sparseArray);
    }

    private static b a(xg xgVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        xgVar.d(4);
        boolean f10 = xgVar.f();
        xgVar.d(3);
        int a10 = xgVar.a(16);
        int a11 = xgVar.a(16);
        if (f10) {
            int a12 = xgVar.a(16);
            int a13 = xgVar.a(16);
            int a14 = xgVar.a(16);
            i10 = xgVar.a(16);
            i12 = a13;
            i11 = a14;
            i13 = a12;
        } else {
            i12 = a10;
            i10 = a11;
            i13 = 0;
            i11 = 0;
        }
        return new b(a10, a11, i13, i12, i11, i10);
    }

    private static void a(xg xgVar, h hVar) {
        f fVar;
        int a10 = xgVar.a(8);
        int a11 = xgVar.a(16);
        int a12 = xgVar.a(16);
        int d10 = xgVar.d() + a12;
        if (a12 * 8 > xgVar.b()) {
            kc.d("DvbParser", "Data field length exceeds limit");
            xgVar.d(xgVar.b());
            return;
        }
        switch (a10) {
            case 16:
                if (a11 == hVar.f8490a) {
                    d dVar = hVar.f8498i;
                    d b10 = b(xgVar, a12);
                    if (b10.f8469c == 0) {
                        if (!(dVar == null || dVar.f8468b == b10.f8468b)) {
                            hVar.f8498i = b10;
                            break;
                        }
                    } else {
                        hVar.f8498i = b10;
                        hVar.f8492c.clear();
                        hVar.f8493d.clear();
                        hVar.f8494e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f8498i;
                if (a11 == hVar.f8490a && dVar2 != null) {
                    f c10 = c(xgVar, a12);
                    if (dVar2.f8469c == 0 && (fVar = (f) hVar.f8492c.get(c10.f8473a)) != null) {
                        c10.a(fVar);
                    }
                    hVar.f8492c.put(c10.f8473a, c10);
                    break;
                }
            case 18:
                if (a11 != hVar.f8490a) {
                    if (a11 == hVar.f8491b) {
                        a a13 = a(xgVar, a12);
                        hVar.f8495f.put(a13.f8453a, a13);
                        break;
                    }
                } else {
                    a a14 = a(xgVar, a12);
                    hVar.f8493d.put(a14.f8453a, a14);
                    break;
                }
                break;
            case 19:
                if (a11 != hVar.f8490a) {
                    if (a11 == hVar.f8491b) {
                        c b11 = b(xgVar);
                        hVar.f8496g.put(b11.f8463a, b11);
                        break;
                    }
                } else {
                    c b12 = b(xgVar);
                    hVar.f8494e.put(b12.f8463a, b12);
                    break;
                }
                break;
            case 20:
                if (a11 == hVar.f8490a) {
                    hVar.f8497h = a(xgVar);
                    break;
                }
                break;
        }
        xgVar.e(d10 - xgVar.d());
    }

    public List a(byte[] bArr, int i10) {
        int i11;
        int i12;
        SparseArray sparseArray;
        xg xgVar = new xg(bArr, i10);
        while (xgVar.b() >= 48 && xgVar.a(8) == 15) {
            a(xgVar, this.f8451f);
        }
        h hVar = this.f8451f;
        d dVar = hVar.f8498i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        b bVar = hVar.f8497h;
        if (bVar == null) {
            bVar = this.f8449d;
        }
        Bitmap bitmap = this.f8452g;
        if (!(bitmap != null && bVar.f8457a + 1 == bitmap.getWidth() && bVar.f8458b + 1 == this.f8452g.getHeight())) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f8457a + 1, bVar.f8458b + 1, Bitmap.Config.ARGB_8888);
            this.f8452g = createBitmap;
            this.f8448c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray2 = dVar.f8470d;
        for (int i13 = 0; i13 < sparseArray2.size(); i13++) {
            this.f8448c.save();
            e eVar = (e) sparseArray2.valueAt(i13);
            f fVar = (f) this.f8451f.f8492c.get(sparseArray2.keyAt(i13));
            int i14 = eVar.f8471a + bVar.f8459c;
            int i15 = eVar.f8472b + bVar.f8461e;
            this.f8448c.clipRect(i14, i15, Math.min(fVar.f8475c + i14, bVar.f8460d), Math.min(fVar.f8476d + i15, bVar.f8462f));
            a aVar = (a) this.f8451f.f8493d.get(fVar.f8479g);
            if (aVar == null && (aVar = (a) this.f8451f.f8495f.get(fVar.f8479g)) == null) {
                aVar = this.f8450e;
            }
            SparseArray sparseArray3 = fVar.f8483k;
            int i16 = 0;
            while (i16 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i16);
                g gVar = (g) sparseArray3.valueAt(i16);
                c cVar = (c) this.f8451f.f8494e.get(keyAt);
                c cVar2 = cVar == null ? (c) this.f8451f.f8496g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    Paint paint = cVar2.f8464b ? null : this.f8446a;
                    i12 = i16;
                    int i17 = i15 + gVar.f8487d;
                    sparseArray = sparseArray3;
                    a(cVar2, aVar, fVar.f8478f, gVar.f8486c + i14, i17, paint, this.f8448c);
                } else {
                    i12 = i16;
                    sparseArray = sparseArray3;
                }
                i16 = i12 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f8474b) {
                int i18 = fVar.f8478f;
                if (i18 == 3) {
                    i11 = aVar.f8456d[fVar.f8480h];
                } else if (i18 == 2) {
                    i11 = aVar.f8455c[fVar.f8481i];
                } else {
                    i11 = aVar.f8454b[fVar.f8482j];
                }
                this.f8447b.setColor(i11);
                this.f8448c.drawRect((float) i14, (float) i15, (float) (fVar.f8475c + i14), (float) (fVar.f8476d + i15), this.f8447b);
            }
            arrayList.add(new z4.b().a(Bitmap.createBitmap(this.f8452g, i14, i15, fVar.f8475c, fVar.f8476d)).b(((float) i14) / ((float) bVar.f8457a)).b(0).a(((float) i15) / ((float) bVar.f8458b), 0).a(0).d(((float) fVar.f8475c) / ((float) bVar.f8457a)).a(((float) fVar.f8476d) / ((float) bVar.f8458b)).a());
            this.f8448c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f8448c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void a(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i13 = i10;
        byte[] bArr4 = bArr;
        xg xgVar = new xg(bArr);
        int i14 = i11;
        int i15 = i12;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (xgVar.b() != 0) {
            int a10 = xgVar.a(8);
            if (a10 != 240) {
                switch (a10) {
                    case 16:
                        if (i13 == 3) {
                            if (bArr5 != null) {
                                bArr2 = bArr5;
                                i14 = a(xgVar, iArr, bArr2, i14, i15, paint, canvas);
                                xgVar.c();
                                break;
                            } else {
                                bArr3 = f8444i;
                            }
                        } else {
                            if (i13 != 2) {
                                bArr2 = null;
                            } else if (bArr7 == null) {
                                bArr3 = f8443h;
                            } else {
                                bArr2 = bArr7;
                            }
                            i14 = a(xgVar, iArr, bArr2, i14, i15, paint, canvas);
                            xgVar.c();
                        }
                        bArr2 = bArr3;
                        i14 = a(xgVar, iArr, bArr2, i14, i15, paint, canvas);
                        xgVar.c();
                    case 17:
                        i14 = b(xgVar, iArr, i13 == 3 ? bArr6 == null ? f8445j : bArr6 : null, i14, i15, paint, canvas);
                        xgVar.c();
                        break;
                    case 18:
                        i14 = c(xgVar, iArr, (byte[]) null, i14, i15, paint, canvas);
                        break;
                    default:
                        switch (a10) {
                            case 32:
                                bArr7 = a(4, 4, xgVar);
                                break;
                            case 33:
                                bArr5 = a(4, 8, xgVar);
                                break;
                            case 34:
                                bArr6 = a(16, 8, xgVar);
                                break;
                        }
                }
            } else {
                i15 += 2;
                i14 = i11;
            }
        }
    }
}
