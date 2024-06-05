package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import i5.a;
import i5.c;
import n4.h;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class z4 extends a {
    public static final Parcelable.Creator<z4> CREATOR = new a5();

    /* renamed from: a  reason: collision with root package name */
    public final String f14646a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14647b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14648c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14649d;

    /* renamed from: f  reason: collision with root package name */
    public final int f14650f;

    /* renamed from: g  reason: collision with root package name */
    public final int f14651g;

    /* renamed from: h  reason: collision with root package name */
    public final z4[] f14652h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f14653i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f14654j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f14655k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f14656l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f14657m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f14658n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f14659o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f14660p;

    public z4() {
        this("interstitial_mb", 0, 0, true, 0, 0, (z4[]) null, false, false, false, false, false, false, false, false);
    }

    public static int b(DisplayMetrics displayMetrics) {
        return (int) (((float) z(displayMetrics)) * displayMetrics.density);
    }

    public static z4 v() {
        return new z4("interstitial_mb", 0, 0, false, 0, 0, (z4[]) null, false, false, false, false, true, false, false, false);
    }

    public static z4 w() {
        return new z4("320x50_mb", 0, 0, false, 0, 0, (z4[]) null, true, false, false, false, false, false, false, false);
    }

    public static z4 x() {
        return new z4("reward_mb", 0, 0, true, 0, 0, (z4[]) null, false, false, false, false, false, false, false, false);
    }

    public static z4 y() {
        return new z4("invalid", 0, 0, false, 0, 0, (z4[]) null, false, false, false, true, false, false, false, false);
    }

    private static int z(DisplayMetrics displayMetrics) {
        int i10 = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i10 <= 400) {
            return 32;
        }
        return i10 <= 720 ? 50 : 90;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 2, this.f14646a, false);
        c.k(parcel, 3, this.f14647b);
        c.k(parcel, 4, this.f14648c);
        c.c(parcel, 5, this.f14649d);
        c.k(parcel, 6, this.f14650f);
        c.k(parcel, 7, this.f14651g);
        c.t(parcel, 8, this.f14652h, i10, false);
        c.c(parcel, 9, this.f14653i);
        c.c(parcel, 10, this.f14654j);
        c.c(parcel, 11, this.f14655k);
        c.c(parcel, 12, this.f14656l);
        c.c(parcel, 13, this.f14657m);
        c.c(parcel, 14, this.f14658n);
        c.c(parcel, 15, this.f14659o);
        c.c(parcel, 16, this.f14660p);
        c.b(parcel, a10);
    }

    public z4(Context context, h hVar) {
        this(context, new h[]{hVar});
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z4(android.content.Context r14, n4.h[] r15) {
        /*
            r13 = this;
            r13.<init>()
            r0 = 0
            r1 = r15[r0]
            r13.f14649d = r0
            boolean r2 = r1.l()
            r13.f14654j = r2
            boolean r3 = n4.d0.f(r1)
            r13.f14658n = r3
            boolean r3 = n4.d0.g(r1)
            r13.f14659o = r3
            boolean r3 = n4.d0.h(r1)
            r13.f14660p = r3
            if (r2 == 0) goto L_0x0031
            n4.h r3 = n4.h.f20927i
            int r4 = r3.j()
            r13.f14650f = r4
            int r3 = r3.c()
            r13.f14647b = r3
            goto L_0x005d
        L_0x0031:
            boolean r4 = r13.f14659o
            if (r4 == 0) goto L_0x0042
            int r3 = r1.j()
            r13.f14650f = r3
            int r3 = n4.d0.a(r1)
            r13.f14647b = r3
            goto L_0x005d
        L_0x0042:
            if (r3 == 0) goto L_0x0051
            int r3 = r1.j()
            r13.f14650f = r3
            int r3 = n4.d0.b(r1)
            r13.f14647b = r3
            goto L_0x005d
        L_0x0051:
            int r3 = r1.j()
            r13.f14650f = r3
            int r3 = r1.c()
            r13.f14647b = r3
        L_0x005d:
            int r4 = r13.f14650f
            r5 = -1
            r6 = 1
            if (r4 != r5) goto L_0x0065
            r4 = 1
            goto L_0x0066
        L_0x0065:
            r4 = 0
        L_0x0066:
            r5 = -2
            if (r3 != r5) goto L_0x006b
            r3 = 1
            goto L_0x006c
        L_0x006b:
            r3 = 0
        L_0x006c:
            android.content.res.Resources r5 = r14.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            if (r4 == 0) goto L_0x0100
            com.google.android.gms.ads.internal.client.x.b()
            android.content.res.Resources r7 = r14.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.orientation
            r8 = 2
            if (r7 == r8) goto L_0x0087
            goto L_0x00e8
        L_0x0087:
            android.content.res.Resources r7 = r14.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r8 = r7.heightPixels
            float r8 = (float) r8
            float r7 = r7.density
            float r8 = r8 / r7
            int r7 = (int) r8
            r8 = 600(0x258, float:8.41E-43)
            if (r7 >= r8) goto L_0x00e8
            com.google.android.gms.ads.internal.client.x.b()
            android.content.res.Resources r7 = r14.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            java.lang.String r8 = "window"
            java.lang.Object r8 = r14.getSystemService(r8)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            if (r8 == 0) goto L_0x00e8
            android.view.Display r8 = r8.getDefaultDisplay()
            r8.getRealMetrics(r7)
            int r9 = r7.heightPixels
            int r10 = r7.widthPixels
            r8.getMetrics(r7)
            int r8 = r7.heightPixels
            int r7 = r7.widthPixels
            if (r8 != r9) goto L_0x00e8
            if (r7 != r10) goto L_0x00e8
            int r7 = r5.widthPixels
            com.google.android.gms.ads.internal.client.x.b()
            android.content.res.Resources r8 = r14.getResources()
            java.lang.String r9 = "navigation_bar_width"
            java.lang.String r10 = "dimen"
            java.lang.String r11 = "android"
            int r8 = r8.getIdentifier(r9, r10, r11)
            if (r8 <= 0) goto L_0x00e3
            android.content.res.Resources r9 = r14.getResources()
            int r8 = r9.getDimensionPixelSize(r8)
            goto L_0x00e4
        L_0x00e3:
            r8 = 0
        L_0x00e4:
            int r7 = r7 - r8
            r13.f14651g = r7
            goto L_0x00ec
        L_0x00e8:
            int r7 = r5.widthPixels
            r13.f14651g = r7
        L_0x00ec:
            float r8 = r5.density
            float r7 = (float) r7
            float r7 = r7 / r8
            double r7 = (double) r7
            int r9 = (int) r7
            double r10 = (double) r9
            double r7 = r7 - r10
            r10 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x010d
            int r9 = r9 + 1
            goto L_0x010d
        L_0x0100:
            int r9 = r13.f14650f
            com.google.android.gms.ads.internal.client.x.b()
            int r7 = r13.f14650f
            int r7 = com.google.android.gms.internal.ads.zzbyt.zzq(r5, r7)
            r13.f14651g = r7
        L_0x010d:
            if (r3 == 0) goto L_0x0114
            int r7 = z(r5)
            goto L_0x0116
        L_0x0114:
            int r7 = r13.f14647b
        L_0x0116:
            com.google.android.gms.ads.internal.client.x.b()
            int r5 = com.google.android.gms.internal.ads.zzbyt.zzq(r5, r7)
            r13.f14648c = r5
            java.lang.String r5 = "_as"
            java.lang.String r8 = "x"
            if (r4 != 0) goto L_0x0159
            if (r3 == 0) goto L_0x0128
            goto L_0x0159
        L_0x0128:
            boolean r3 = r13.f14659o
            if (r3 != 0) goto L_0x013d
            boolean r3 = r13.f14660p
            if (r3 == 0) goto L_0x0131
            goto L_0x013d
        L_0x0131:
            if (r2 == 0) goto L_0x0136
            java.lang.String r1 = "320x50_mb"
            goto L_0x0156
        L_0x0136:
            java.lang.String r1 = r1.toString()
            r13.f14646a = r1
            goto L_0x0170
        L_0x013d:
            int r1 = r13.f14650f
            int r2 = r13.f14647b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r8)
            r3.append(r2)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
        L_0x0156:
            r13.f14646a = r1
            goto L_0x0170
        L_0x0159:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r8)
            r1.append(r7)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r13.f14646a = r1
        L_0x0170:
            int r1 = r15.length
            if (r1 <= r6) goto L_0x0189
            com.google.android.gms.ads.internal.client.z4[] r1 = new com.google.android.gms.ads.internal.client.z4[r1]
            r13.f14652h = r1
            r1 = 0
        L_0x0178:
            int r2 = r15.length
            if (r1 >= r2) goto L_0x018c
            com.google.android.gms.ads.internal.client.z4[] r2 = r13.f14652h
            com.google.android.gms.ads.internal.client.z4 r3 = new com.google.android.gms.ads.internal.client.z4
            r4 = r15[r1]
            r3.<init>((android.content.Context) r14, (n4.h) r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x0178
        L_0x0189:
            r14 = 0
            r13.f14652h = r14
        L_0x018c:
            r13.f14653i = r0
            r13.f14655k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.z4.<init>(android.content.Context, n4.h[]):void");
    }

    z4(String str, int i10, int i11, boolean z10, int i12, int i13, z4[] z4VarArr, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.f14646a = str;
        this.f14647b = i10;
        this.f14648c = i11;
        this.f14649d = z10;
        this.f14650f = i12;
        this.f14651g = i13;
        this.f14652h = z4VarArr;
        this.f14653i = z11;
        this.f14654j = z12;
        this.f14655k = z13;
        this.f14656l = z14;
        this.f14657m = z15;
        this.f14658n = z16;
        this.f14659o = z17;
        this.f14660p = z18;
    }
}
