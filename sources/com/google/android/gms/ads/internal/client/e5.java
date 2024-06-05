package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class e5 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        String str = null;
        c3 c3Var = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            switch (b.l(r10)) {
                case 1:
                    str = b.f(parcel, r10);
                    break;
                case 2:
                    j10 = b.u(parcel, r10);
                    break;
                case 3:
                    c3Var = (c3) b.e(parcel, r10, c3.CREATOR);
                    break;
                case 4:
                    bundle = b.a(parcel, r10);
                    break;
                case 5:
                    str2 = b.f(parcel, r10);
                    break;
                case 6:
                    str3 = b.f(parcel, r10);
                    break;
                case 7:
                    str4 = b.f(parcel, r10);
                    break;
                case 8:
                    str5 = b.f(parcel, r10);
                    break;
                default:
                    b.x(parcel, r10);
                    break;
            }
        }
        b.k(parcel, y10);
        return new d5(str, j10, c3Var, bundle, str2, str3, str4, str5);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d5[i10];
    }
}
