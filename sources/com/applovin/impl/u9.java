package com.applovin.impl;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.applovin.impl.adview.g;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.k;

public class u9 extends m9 {
    public u9(b bVar, Activity activity, k kVar) {
        super(bVar, activity, kVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public /* bridge */ /* synthetic */ void a(g gVar) {
        super.a(gVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x026f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.widget.ImageView r17, com.applovin.impl.adview.g r18, com.applovin.impl.adview.l r19, com.applovin.impl.o r20, android.widget.ProgressBar r21, com.applovin.impl.f3 r22, android.view.View r23, com.applovin.adview.AppLovinAdView r24, com.applovin.impl.adview.k r25, android.widget.ImageView r26, android.view.ViewGroup r27) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            com.applovin.impl.sdk.ad.b r12 = r0.f9329c
            com.applovin.impl.sdk.ad.b$e r12 = r12.p0()
            com.applovin.impl.sdk.ad.b$e r13 = com.applovin.impl.sdk.ad.b.e.TOP
            r15 = 48
            r14 = -1
            if (r12 != r13) goto L_0x002d
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r13 = -2
            r12.<init>(r14, r13, r15)
        L_0x002b:
            r15 = 5
            goto L_0x0066
        L_0x002d:
            r13 = -2
            com.applovin.impl.sdk.ad.b r12 = r0.f9329c
            com.applovin.impl.sdk.ad.b$e r12 = r12.p0()
            com.applovin.impl.sdk.ad.b$e r15 = com.applovin.impl.sdk.ad.b.e.BOTTOM
            if (r12 != r15) goto L_0x0040
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r15 = 80
            r12.<init>(r14, r13, r15)
            goto L_0x002b
        L_0x0040:
            com.applovin.impl.sdk.ad.b r12 = r0.f9329c
            com.applovin.impl.sdk.ad.b$e r12 = r12.p0()
            com.applovin.impl.sdk.ad.b$e r15 = com.applovin.impl.sdk.ad.b.e.LEFT
            if (r12 != r15) goto L_0x0051
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r15 = 3
            r12.<init>(r13, r14, r15)
            goto L_0x002b
        L_0x0051:
            r15 = 3
            com.applovin.impl.sdk.ad.b r12 = r0.f9329c
            com.applovin.impl.sdk.ad.b$e r12 = r12.p0()
            com.applovin.impl.sdk.ad.b$e r15 = com.applovin.impl.sdk.ad.b.e.RIGHT
            if (r12 != r15) goto L_0x0063
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r15 = 5
            r12.<init>(r13, r14, r15)
            goto L_0x0066
        L_0x0063:
            r15 = 5
            android.widget.FrameLayout$LayoutParams r12 = r0.f9331e
        L_0x0066:
            android.widget.FrameLayout$LayoutParams r13 = r0.f9331e
            r8.setLayoutParams(r13)
            android.view.ViewGroup r13 = r0.f9330d
            r13.addView(r8)
            android.view.View r8 = new android.view.View
            android.app.Activity r13 = r0.f9328b
            r8.<init>(r13)
            android.widget.FrameLayout$LayoutParams r13 = r0.f9331e
            r8.setLayoutParams(r13)
            r13 = 254(0xfe, float:3.56E-43)
            r15 = 0
            int r13 = android.graphics.Color.argb(r13, r15, r15, r15)
            r8.setBackgroundColor(r13)
            com.applovin.impl.x50 r13 = com.applovin.impl.x50.f13289a
            r8.setOnTouchListener(r13)
            android.view.ViewGroup r13 = r0.f9330d
            r13.addView(r8)
            r7.setLayoutParams(r12)
            android.view.ViewGroup r8 = r0.f9330d
            r8.addView(r7)
            if (r3 == 0) goto L_0x013d
            com.applovin.impl.sdk.ad.b r7 = r0.f9329c
            com.applovin.impl.rq r7 = r7.i0()
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            android.app.Activity r12 = r0.f9328b
            r8.<init>(r12)
            r12 = 1
            r8.setOrientation(r12)
            r12 = 1120403456(0x42c80000, float:100.0)
            r8.setWeightSum(r12)
            int r13 = r7.e()
            r8.setGravity(r13)
            android.widget.FrameLayout$LayoutParams r13 = new android.widget.FrameLayout$LayoutParams
            r13.<init>(r14, r14)
            android.widget.LinearLayout r14 = new android.widget.LinearLayout
            android.app.Activity r12 = r0.f9328b
            r14.<init>(r12)
            r14.setOrientation(r15)
            r12 = 1120403456(0x42c80000, float:100.0)
            r14.setWeightSum(r12)
            int r12 = r7.e()
            r14.setGravity(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            int r11 = r7.f()
            float r11 = (float) r11
            r9 = -2
            r12.<init>(r9, r15, r11)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            int r11 = r7.i()
            float r11 = (float) r11
            r10 = -1
            r9.<init>(r15, r10, r11)
            android.app.Activity r10 = r0.f9328b
            int r11 = r7.g()
            int r10 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r10, r11)
            r9.setMargins(r10, r10, r10, r10)
            r14.addView(r3, r9)
            r8.addView(r14, r12)
            android.view.ViewGroup r9 = r0.f9330d
            r9.addView(r8, r13)
            float r8 = r7.a()
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0121
            r8 = 4
            r3.setVisibility(r8)
            float r8 = r7.a()
            long r10 = com.applovin.impl.zp.c((float) r8)
            long r12 = r7.b()
            com.applovin.impl.y50 r8 = new com.applovin.impl.y50
            r8.<init>(r3, r12)
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(r8, r10)
        L_0x0121:
            float r8 = r7.c()
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x013d
            float r8 = r7.c()
            long r8 = com.applovin.impl.zp.c((float) r8)
            long r10 = r7.d()
            com.applovin.impl.z50 r7 = new com.applovin.impl.z50
            r7.<init>(r3, r10)
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(r7, r8)
        L_0x013d:
            if (r2 == 0) goto L_0x0158
            com.applovin.impl.sdk.ad.b r3 = r0.f9329c
            boolean r3 = r3.E0()
            if (r3 == 0) goto L_0x014b
            r3 = 48
            r14 = 3
            goto L_0x014e
        L_0x014b:
            r3 = 48
            r14 = 5
        L_0x014e:
            r3 = r3 | r14
            com.applovin.impl.sdk.ad.b r7 = r0.f9329c
            com.applovin.impl.sdk.ad.b$d r7 = r7.l()
            r0.a(r7, r3, r2)
        L_0x0158:
            if (r1 == 0) goto L_0x019d
            android.app.Activity r2 = r0.f9328b
            com.applovin.impl.sdk.k r3 = r0.f9327a
            com.applovin.impl.oj r7 = com.applovin.impl.oj.f10458z2
            java.lang.Object r3 = r3.a((com.applovin.impl.oj) r7)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r2 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r2, r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            com.applovin.impl.sdk.k r7 = r0.f9327a
            com.applovin.impl.oj r8 = com.applovin.impl.oj.B2
            java.lang.Object r7 = r7.a((com.applovin.impl.oj) r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r3.<init>(r2, r2, r7)
            android.app.Activity r2 = r0.f9328b
            com.applovin.impl.sdk.k r7 = r0.f9327a
            com.applovin.impl.oj r8 = com.applovin.impl.oj.A2
            java.lang.Object r7 = r7.a((com.applovin.impl.oj) r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r2 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r2, r7)
            r3.setMargins(r2, r2, r2, r2)
            android.view.ViewGroup r2 = r0.f9330d
            r2.addView(r1, r3)
        L_0x019d:
            if (r4 == 0) goto L_0x01a6
            android.view.ViewGroup r1 = r0.f9330d
            android.widget.FrameLayout$LayoutParams r2 = r0.f9331e
            r1.addView(r4, r2)
        L_0x01a6:
            if (r6 == 0) goto L_0x01eb
            android.app.Activity r1 = r0.f9328b
            com.applovin.impl.sdk.k r2 = r0.f9327a
            com.applovin.impl.oj r3 = com.applovin.impl.oj.f10338k2
            java.lang.Object r2 = r2.a((com.applovin.impl.oj) r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r1 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r1, r2)
            com.applovin.impl.sdk.k r2 = r0.f9327a
            com.applovin.impl.oj r3 = com.applovin.impl.oj.f10330j2
            java.lang.Object r2 = r2.a((com.applovin.impl.oj) r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r1, r1, r2)
            android.app.Activity r1 = r0.f9328b
            com.applovin.impl.sdk.k r2 = r0.f9327a
            com.applovin.impl.oj r4 = com.applovin.impl.oj.f10322i2
            java.lang.Object r2 = r2.a((com.applovin.impl.oj) r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r1 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r1, r2)
            r3.setMargins(r1, r1, r1, r1)
            android.view.ViewGroup r1 = r0.f9330d
            r1.addView(r6, r3)
        L_0x01eb:
            if (r5 == 0) goto L_0x020d
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = 20
            r3 = 80
            r4 = -1
            r1.<init>(r4, r2, r3)
            com.applovin.impl.sdk.k r2 = r0.f9327a
            com.applovin.impl.oj r3 = com.applovin.impl.oj.E2
            java.lang.Object r2 = r2.a((com.applovin.impl.oj) r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setMargins(r15, r15, r15, r2)
            android.view.ViewGroup r2 = r0.f9330d
            r2.addView(r5, r1)
        L_0x020d:
            r1 = r26
            if (r1 == 0) goto L_0x025a
            com.applovin.impl.sdk.ad.b r2 = r0.f9329c
            com.applovin.impl.bq r2 = (com.applovin.impl.bq) r2
            boolean r3 = r2.q1()
            if (r3 == 0) goto L_0x025a
            android.app.Activity r3 = r0.f9328b
            com.applovin.impl.hq r4 = r2.k1()
            int r4 = r4.f()
            int r3 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r3, r4)
            android.app.Activity r4 = r0.f9328b
            com.applovin.impl.hq r2 = r2.k1()
            int r2 = r2.c()
            int r2 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r4, r2)
            android.app.Activity r4 = r0.f9328b
            com.applovin.impl.sdk.k r5 = r0.f9327a
            com.applovin.impl.oj r6 = com.applovin.impl.oj.X4
            java.lang.Object r5 = r5.a((com.applovin.impl.oj) r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r4 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r4, r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r6 = 83
            r5.<init>(r3, r2, r6)
            r5.setMargins(r4, r4, r4, r4)
            android.view.ViewGroup r2 = r0.f9330d
            r2.addView(r1, r5)
        L_0x025a:
            r1 = r25
            if (r1 == 0) goto L_0x0265
            android.view.ViewGroup r2 = r0.f9330d
            android.widget.FrameLayout$LayoutParams r3 = r0.f9331e
            r2.addView(r1, r3)
        L_0x0265:
            r1 = r27
            if (r1 == 0) goto L_0x026f
            android.view.ViewGroup r2 = r0.f9330d
            r1.addView(r2)
            goto L_0x0276
        L_0x026f:
            android.app.Activity r1 = r0.f9328b
            android.view.ViewGroup r2 = r0.f9330d
            r1.setContentView(r2)
        L_0x0276:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.u9.a(android.widget.ImageView, com.applovin.impl.adview.g, com.applovin.impl.adview.l, com.applovin.impl.o, android.widget.ProgressBar, com.applovin.impl.f3, android.view.View, com.applovin.adview.AppLovinAdView, com.applovin.impl.adview.k, android.widget.ImageView, android.view.ViewGroup):void");
    }

    public /* bridge */ /* synthetic */ void a(View view) {
        super.a(view);
    }

    public void a(g gVar, com.applovin.impl.adview.k kVar, View view, ProgressBar progressBar) {
        if (view != null) {
            view.setVisibility(0);
        }
        e0.a(this.f9330d, view);
        int i10 = 48;
        if (gVar != null) {
            a(this.f9329c.l(), (this.f9329c.y0() ? 3 : 5) | 48, gVar);
        }
        if (progressBar != null) {
            if (((Boolean) this.f9327a.a(oj.M2)).booleanValue()) {
                i10 = 80;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 20, i10);
            layoutParams.setMargins(0, 0, 0, ((Integer) this.f9327a.a(oj.N2)).intValue());
            this.f9330d.addView(progressBar, layoutParams);
        }
        if (kVar != null) {
            this.f9330d.addView(kVar, this.f9331e);
        }
    }
}
