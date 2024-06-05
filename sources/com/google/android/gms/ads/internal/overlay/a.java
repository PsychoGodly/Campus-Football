package com.google.android.gms.ads.internal.overlay;

import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class a implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r31) {
        /*
            r30 = this;
            r0 = r31
            int r1 = i5.b.y(r31)
            r2 = 0
            r3 = 0
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r12 = r10
            r13 = r12
            r16 = r13
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = r25
            r27 = r26
            r28 = r27
            r29 = r28
            r11 = 0
            r14 = 0
            r15 = 0
        L_0x002f:
            int r2 = r31.dataPosition()
            if (r2 >= r1) goto L_0x00d8
            int r2 = i5.b.r(r31)
            int r3 = i5.b.l(r2)
            switch(r3) {
                case 2: goto L_0x00cd;
                case 3: goto L_0x00c7;
                case 4: goto L_0x00c1;
                case 5: goto L_0x00bb;
                case 6: goto L_0x00b5;
                case 7: goto L_0x00af;
                case 8: goto L_0x00aa;
                case 9: goto L_0x00a5;
                case 10: goto L_0x00a0;
                case 11: goto L_0x009b;
                case 12: goto L_0x0096;
                case 13: goto L_0x0091;
                case 14: goto L_0x0086;
                case 15: goto L_0x0040;
                case 16: goto L_0x0081;
                case 17: goto L_0x0076;
                case 18: goto L_0x0071;
                case 19: goto L_0x006c;
                case 20: goto L_0x0067;
                case 21: goto L_0x0062;
                case 22: goto L_0x005d;
                case 23: goto L_0x0058;
                case 24: goto L_0x0053;
                case 25: goto L_0x004e;
                case 26: goto L_0x0049;
                case 27: goto L_0x0044;
                default: goto L_0x0040;
            }
        L_0x0040:
            i5.b.x(r0, r2)
            goto L_0x002f
        L_0x0044:
            android.os.IBinder r29 = i5.b.s(r0, r2)
            goto L_0x002f
        L_0x0049:
            android.os.IBinder r28 = i5.b.s(r0, r2)
            goto L_0x002f
        L_0x004e:
            java.lang.String r27 = i5.b.f(r0, r2)
            goto L_0x002f
        L_0x0053:
            java.lang.String r26 = i5.b.f(r0, r2)
            goto L_0x002f
        L_0x0058:
            android.os.IBinder r25 = i5.b.s(r0, r2)
            goto L_0x002f
        L_0x005d:
            android.os.IBinder r24 = i5.b.s(r0, r2)
            goto L_0x002f
        L_0x0062:
            android.os.IBinder r23 = i5.b.s(r0, r2)
            goto L_0x002f
        L_0x0067:
            android.os.IBinder r22 = i5.b.s(r0, r2)
            goto L_0x002f
        L_0x006c:
            java.lang.String r21 = i5.b.f(r0, r2)
            goto L_0x002f
        L_0x0071:
            android.os.IBinder r20 = i5.b.s(r0, r2)
            goto L_0x002f
        L_0x0076:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.j> r3 = com.google.android.gms.ads.internal.j.CREATOR
            android.os.Parcelable r2 = i5.b.e(r0, r2, r3)
            r19 = r2
            com.google.android.gms.ads.internal.j r19 = (com.google.android.gms.ads.internal.j) r19
            goto L_0x002f
        L_0x0081:
            java.lang.String r18 = i5.b.f(r0, r2)
            goto L_0x002f
        L_0x0086:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbzg> r3 = com.google.android.gms.internal.ads.zzbzg.CREATOR
            android.os.Parcelable r2 = i5.b.e(r0, r2, r3)
            r17 = r2
            com.google.android.gms.internal.ads.zzbzg r17 = (com.google.android.gms.internal.ads.zzbzg) r17
            goto L_0x002f
        L_0x0091:
            java.lang.String r16 = i5.b.f(r0, r2)
            goto L_0x002f
        L_0x0096:
            int r15 = i5.b.t(r0, r2)
            goto L_0x002f
        L_0x009b:
            int r14 = i5.b.t(r0, r2)
            goto L_0x002f
        L_0x00a0:
            android.os.IBinder r13 = i5.b.s(r0, r2)
            goto L_0x002f
        L_0x00a5:
            java.lang.String r12 = i5.b.f(r0, r2)
            goto L_0x002f
        L_0x00aa:
            boolean r11 = i5.b.m(r0, r2)
            goto L_0x002f
        L_0x00af:
            java.lang.String r10 = i5.b.f(r0, r2)
            goto L_0x002f
        L_0x00b5:
            android.os.IBinder r9 = i5.b.s(r0, r2)
            goto L_0x002f
        L_0x00bb:
            android.os.IBinder r8 = i5.b.s(r0, r2)
            goto L_0x002f
        L_0x00c1:
            android.os.IBinder r7 = i5.b.s(r0, r2)
            goto L_0x002f
        L_0x00c7:
            android.os.IBinder r6 = i5.b.s(r0, r2)
            goto L_0x002f
        L_0x00cd:
            android.os.Parcelable$Creator<t4.i> r3 = t4.i.CREATOR
            android.os.Parcelable r2 = i5.b.e(r0, r2, r3)
            r5 = r2
            t4.i r5 = (t4.i) r5
            goto L_0x002f
        L_0x00d8:
            i5.b.k(r0, r1)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.a.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new AdOverlayInfoParcel[i10];
    }
}
