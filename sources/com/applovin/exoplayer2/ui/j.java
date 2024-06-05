package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.applovin.exoplayer2.ui.SubtitleView;
import com.applovin.impl.v2;
import com.applovin.impl.yp;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class j extends FrameLayout implements SubtitleView.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f6254a;

    /* renamed from: b  reason: collision with root package name */
    private final WebView f6255b;

    /* renamed from: c  reason: collision with root package name */
    private List f6256c;

    /* renamed from: d  reason: collision with root package name */
    private v2 f6257d;

    /* renamed from: f  reason: collision with root package name */
    private float f6258f;

    /* renamed from: g  reason: collision with root package name */
    private int f6259g;

    /* renamed from: h  reason: collision with root package name */
    private float f6260h;

    class a extends WebView {
        a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6262a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6262a = r0
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6262a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6262a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.j.b.<clinit>():void");
        }
    }

    public j(Context context) {
        this(context, (AttributeSet) null);
    }

    private static int a(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String a(v2 v2Var) {
        int i10 = v2Var.f12661d;
        if (i10 == 1) {
            return yp.a("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", c.a(v2Var.f12662e));
        } else if (i10 == 2) {
            return yp.a("0.1em 0.12em 0.15em %s", c.a(v2Var.f12662e));
        } else if (i10 == 3) {
            return yp.a("0.06em 0.08em 0.15em %s", c.a(v2Var.f12662e));
        } else if (i10 != 4) {
            return "unset";
        } else {
            return yp.a("-0.05em -0.05em 0.15em %s", c.a(v2Var.f12662e));
        }
    }

    private static String b(int i10) {
        return i10 != 1 ? i10 != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0147, code lost:
        if (r13 != false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x014a, code lost:
        if (r13 != false) goto L_0x014c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0240  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
            r26 = this;
            r0 = r26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.applovin.impl.v2 r2 = r0.f6257d
            int r2 = r2.f12658a
            java.lang.String r2 = com.applovin.exoplayer2.ui.c.a((int) r2)
            int r3 = r0.f6259g
            float r4 = r0.f6258f
            java.lang.String r3 = r0.a(r3, r4)
            r4 = 1067030938(0x3f99999a, float:1.2)
            java.lang.Float r5 = java.lang.Float.valueOf(r4)
            com.applovin.impl.v2 r6 = r0.f6257d
            java.lang.String r6 = a((com.applovin.impl.v2) r6)
            r7 = 4
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r9 = 0
            r8[r9] = r2
            r2 = 1
            r8[r2] = r3
            r3 = 2
            r8[r3] = r5
            r5 = 3
            r8[r5] = r6
            java.lang.String r6 = "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>"
            java.lang.String r6 = com.applovin.impl.yp.a((java.lang.String) r6, (java.lang.Object[]) r8)
            r1.append(r6)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.String r8 = "default_bg"
            java.lang.String r10 = com.applovin.exoplayer2.ui.c.a((java.lang.String) r8)
            com.applovin.impl.v2 r11 = r0.f6257d
            int r11 = r11.f12659b
            java.lang.String r11 = com.applovin.exoplayer2.ui.c.a((int) r11)
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r9] = r11
            java.lang.String r11 = "background-color:%s;"
            java.lang.String r11 = com.applovin.impl.yp.a((java.lang.String) r11, (java.lang.Object[]) r12)
            r6.put(r10, r11)
            r10 = 0
        L_0x005d:
            java.util.List r11 = r0.f6256c
            int r11 = r11.size()
            if (r10 >= r11) goto L_0x025f
            java.util.List r11 = r0.f6256c
            java.lang.Object r11 = r11.get(r10)
            com.applovin.impl.z4 r11 = (com.applovin.impl.z4) r11
            float r12 = r11.f13759i
            r13 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r14 = 1120403456(0x42c80000, float:100.0)
            int r15 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x007b
            float r12 = r12 * r14
            goto L_0x007d
        L_0x007b:
            r12 = 1112014848(0x42480000, float:50.0)
        L_0x007d:
            int r15 = r11.f13760j
            int r15 = a((int) r15)
            float r7 = r11.f13756f
            r17 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r5 = "%.2f%%"
            int r18 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r18 == 0) goto L_0x00dd
            int r3 = r11.f13757g
            if (r3 == r2) goto L_0x00b2
            float r7 = r7 * r14
            java.lang.Float r3 = java.lang.Float.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r9] = r3
            java.lang.String r3 = com.applovin.impl.yp.a((java.lang.String) r5, (java.lang.Object[]) r7)
            int r7 = r11.f13767q
            if (r7 != r2) goto L_0x00ab
            int r7 = r11.f13758h
            int r7 = a((int) r7)
            int r7 = -r7
            goto L_0x00f1
        L_0x00ab:
            int r7 = r11.f13758h
            int r7 = a((int) r7)
            goto L_0x00f1
        L_0x00b2:
            r3 = 0
            java.lang.String r13 = "%.2fem"
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x00c9
            float r7 = r7 * r4
            java.lang.Float r3 = java.lang.Float.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r9] = r3
            java.lang.String r3 = com.applovin.impl.yp.a((java.lang.String) r13, (java.lang.Object[]) r7)
            r7 = 0
            goto L_0x00f1
        L_0x00c9:
            float r3 = -r7
            float r3 = r3 - r17
            float r3 = r3 * r4
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r9] = r3
            java.lang.String r3 = com.applovin.impl.yp.a((java.lang.String) r13, (java.lang.Object[]) r7)
            r7 = 0
            r13 = 1
            goto L_0x00f2
        L_0x00dd:
            float r3 = r0.f6260h
            float r17 = r17 - r3
            float r17 = r17 * r14
            java.lang.Float r3 = java.lang.Float.valueOf(r17)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r9] = r3
            java.lang.String r3 = com.applovin.impl.yp.a((java.lang.String) r5, (java.lang.Object[]) r7)
            r7 = -100
        L_0x00f1:
            r13 = 0
        L_0x00f2:
            float r4 = r11.f13761k
            r19 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r19 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r19 == 0) goto L_0x010a
            float r4 = r4 * r14
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r14[r9] = r4
            java.lang.String r4 = com.applovin.impl.yp.a((java.lang.String) r5, (java.lang.Object[]) r14)
            goto L_0x010c
        L_0x010a:
            java.lang.String r4 = "fit-content"
        L_0x010c:
            android.text.Layout$Alignment r5 = r11.f13753b
            java.lang.String r5 = a((android.text.Layout.Alignment) r5)
            int r14 = r11.f13767q
            java.lang.String r14 = b(r14)
            int r9 = r11.f13765o
            float r2 = r11.f13766p
            java.lang.String r2 = r0.a(r9, r2)
            boolean r9 = r11.f13763m
            if (r9 == 0) goto L_0x0127
            int r9 = r11.f13764n
            goto L_0x012b
        L_0x0127:
            com.applovin.impl.v2 r9 = r0.f6257d
            int r9 = r9.f12660c
        L_0x012b:
            java.lang.String r9 = com.applovin.exoplayer2.ui.c.a((int) r9)
            r20 = r7
            int r7 = r11.f13767q
            java.lang.String r21 = "right"
            java.lang.String r22 = "top"
            java.lang.String r23 = "left"
            r24 = r15
            r15 = 1
            if (r7 == r15) goto L_0x014a
            r15 = 2
            if (r7 == r15) goto L_0x0147
            if (r13 == 0) goto L_0x0145
            java.lang.String r22 = "bottom"
        L_0x0145:
            r13 = 2
            goto L_0x0153
        L_0x0147:
            if (r13 == 0) goto L_0x014c
            goto L_0x014e
        L_0x014a:
            if (r13 == 0) goto L_0x014e
        L_0x014c:
            r21 = r23
        L_0x014e:
            r23 = r22
            r13 = 2
            r22 = r21
        L_0x0153:
            if (r7 == r13) goto L_0x015e
            r13 = 1
            if (r7 != r13) goto L_0x0159
            goto L_0x015e
        L_0x0159:
            java.lang.String r7 = "width"
            r15 = r24
            goto L_0x0164
        L_0x015e:
            java.lang.String r7 = "height"
            r15 = r20
            r20 = r24
        L_0x0164:
            java.lang.CharSequence r13 = r11.f13752a
            android.content.Context r21 = r26.getContext()
            android.content.res.Resources r21 = r21.getResources()
            android.util.DisplayMetrics r0 = r21.getDisplayMetrics()
            float r0 = r0.density
            com.applovin.exoplayer2.ui.f$b r0 = com.applovin.exoplayer2.ui.f.a((java.lang.CharSequence) r13, (float) r0)
            java.util.Set r13 = r6.keySet()
            java.util.Iterator r13 = r13.iterator()
        L_0x0180:
            boolean r21 = r13.hasNext()
            if (r21 == 0) goto L_0x01b8
            java.lang.Object r21 = r13.next()
            r24 = r13
            r13 = r21
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r21 = r6.get(r13)
            r25 = r0
            r0 = r21
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r6.put(r13, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x01af
            java.lang.Object r13 = r6.get(r13)
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x01ad
            goto L_0x01af
        L_0x01ad:
            r0 = 0
            goto L_0x01b0
        L_0x01af:
            r0 = 1
        L_0x01b0:
            com.applovin.impl.a1.b((boolean) r0)
            r13 = r24
            r0 = r25
            goto L_0x0180
        L_0x01b8:
            r25 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r20)
            java.lang.String r20 = a((com.applovin.impl.z4) r11)
            r21 = r6
            r6 = 14
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r19 = 0
            r6[r19] = r0
            r0 = 1
            r6[r0] = r23
            r0 = 2
            r6[r0] = r12
            r12 = 3
            r6[r12] = r22
            r16 = 4
            r6[r16] = r3
            r3 = 5
            r6[r3] = r7
            r3 = 6
            r6[r3] = r4
            r3 = 7
            r6[r3] = r5
            r3 = 8
            r6[r3] = r14
            r3 = 9
            r6[r3] = r2
            r2 = 10
            r6[r2] = r9
            r2 = 11
            r6[r2] = r13
            r2 = 12
            r6[r2] = r15
            r2 = 13
            r6[r2] = r20
            java.lang.String r2 = "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>"
            java.lang.String r2 = com.applovin.impl.yp.a((java.lang.String) r2, (java.lang.Object[]) r6)
            r1.append(r2)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r8
            java.lang.String r5 = "<span class='%s'>"
            java.lang.String r3 = com.applovin.impl.yp.a((java.lang.String) r5, (java.lang.Object[]) r3)
            r1.append(r3)
            android.text.Layout$Alignment r3 = r11.f13754c
            java.lang.String r5 = "</span>"
            if (r3 == 0) goto L_0x0240
            java.lang.String r3 = a((android.text.Layout.Alignment) r3)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r4] = r3
            java.lang.String r2 = "<span style='display:inline-block; text-align:%s;'>"
            java.lang.String r2 = com.applovin.impl.yp.a((java.lang.String) r2, (java.lang.Object[]) r6)
            r1.append(r2)
            r2 = r25
            java.lang.String r2 = r2.f6218a
            r1.append(r2)
            r1.append(r5)
            goto L_0x0247
        L_0x0240:
            r2 = r25
            java.lang.String r2 = r2.f6218a
            r1.append(r2)
        L_0x0247:
            r1.append(r5)
            java.lang.String r2 = "</div>"
            r1.append(r2)
            int r10 = r10 + 1
            r0 = r26
            r6 = r21
            r2 = 1
            r3 = 2
            r4 = 1067030938(0x3f99999a, float:1.2)
            r5 = 3
            r7 = 4
            r9 = 0
            goto L_0x005d
        L_0x025f:
            r21 = r6
            java.lang.String r0 = "</div></body></html>"
            r1.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "<html><head><style>"
            r0.append(r2)
            java.util.Set r2 = r21.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0278:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x029d
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            java.lang.String r4 = "{"
            r0.append(r4)
            r4 = r21
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            java.lang.String r3 = "}"
            r0.append(r3)
            goto L_0x0278
        L_0x029d:
            java.lang.String r2 = "</style></head>"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 0
            r1.insert(r2, r0)
            r0 = r26
            android.webkit.WebView r2 = r0.f6255b
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r3 = com.applovin.exoplayer2.common.base.Charsets.UTF_8
            byte[] r1 = r1.getBytes(r3)
            r3 = 1
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r3)
            java.lang.String r3 = "text/html"
            java.lang.String r4 = "base64"
            r2.loadData(r1, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.j.b():void");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && !this.f6256c.isEmpty()) {
            b();
        }
    }

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6256c = Collections.emptyList();
        this.f6257d = v2.f12657g;
        this.f6258f = 0.0533f;
        this.f6259g = 0;
        this.f6260h = 0.08f;
        a aVar = new a(context, attributeSet);
        this.f6254a = aVar;
        a aVar2 = new a(context, attributeSet);
        this.f6255b = aVar2;
        aVar2.setBackgroundColor(0);
        addView(aVar);
        addView(aVar2);
    }

    private static String a(z4 z4Var) {
        float f10 = z4Var.f13768r;
        if (f10 == 0.0f) {
            return MaxReward.DEFAULT_LABEL;
        }
        int i10 = z4Var.f13767q;
        return yp.a("%s(%.2fdeg)", (i10 == 2 || i10 == 1) ? "skewY" : "skewX", Float.valueOf(f10));
    }

    public void a(List list, v2 v2Var, float f10, int i10, float f11) {
        this.f6257d = v2Var;
        this.f6258f = f10;
        this.f6259g = i10;
        this.f6260h = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            z4 z4Var = (z4) list.get(i11);
            if (z4Var.f13755d != null) {
                arrayList.add(z4Var);
            } else {
                arrayList2.add(z4Var);
            }
        }
        if (!this.f6256c.isEmpty() || !arrayList2.isEmpty()) {
            this.f6256c = arrayList2;
            b();
        }
        this.f6254a.a(arrayList, v2Var, f10, i10, f11);
        invalidate();
    }

    public void a() {
        this.f6255b.destroy();
    }

    private String a(int i10, float f10) {
        float a10 = h.a(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (a10 == -3.4028235E38f) {
            return "unset";
        }
        return yp.a("%.2fpx", Float.valueOf(a10 / getContext().getResources().getDisplayMetrics().density));
    }

    private static String a(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i10 = b.f6262a[alignment.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? "center" : "end";
        }
        return "start";
    }
}
