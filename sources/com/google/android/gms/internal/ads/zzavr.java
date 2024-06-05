package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzavr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y10 = b.y(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        boolean z10 = false;
        int i10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            switch (b.l(r10)) {
                case 2:
                    str = b.f(parcel2, r10);
                    break;
                case 3:
                    j10 = b.u(parcel2, r10);
                    break;
                case 4:
                    str2 = b.f(parcel2, r10);
                    break;
                case 5:
                    str3 = b.f(parcel2, r10);
                    break;
                case 6:
                    str4 = b.f(parcel2, r10);
                    break;
                case 7:
                    bundle = b.a(parcel2, r10);
                    break;
                case 8:
                    z10 = b.m(parcel2, r10);
                    break;
                case 9:
                    j11 = b.u(parcel2, r10);
                    break;
                case 10:
                    str5 = b.f(parcel2, r10);
                    break;
                case 11:
                    i10 = b.t(parcel2, r10);
                    break;
                default:
                    b.x(parcel2, r10);
                    break;
            }
        }
        b.k(parcel2, y10);
        return new zzavq(str, j10, str2, str3, str4, bundle, z10, j11, str5, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzavq[i10];
    }
}
