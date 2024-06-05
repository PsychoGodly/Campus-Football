package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i5.b;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class w4 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y10 = b.y(parcel);
        Bundle bundle = null;
        ArrayList<String> arrayList = null;
        String str = null;
        k4 k4Var = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        a1 a1Var = null;
        String str5 = null;
        ArrayList<String> arrayList3 = null;
        String str6 = null;
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i13 = 0;
        int i14 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            switch (b.l(r10)) {
                case 1:
                    i10 = b.t(parcel2, r10);
                    break;
                case 2:
                    j10 = b.u(parcel2, r10);
                    break;
                case 3:
                    bundle = b.a(parcel2, r10);
                    break;
                case 4:
                    i11 = b.t(parcel2, r10);
                    break;
                case 5:
                    arrayList = b.h(parcel2, r10);
                    break;
                case 6:
                    z10 = b.m(parcel2, r10);
                    break;
                case 7:
                    i12 = b.t(parcel2, r10);
                    break;
                case 8:
                    z11 = b.m(parcel2, r10);
                    break;
                case 9:
                    str = b.f(parcel2, r10);
                    break;
                case 10:
                    k4Var = (k4) b.e(parcel2, r10, k4.CREATOR);
                    break;
                case 11:
                    location = (Location) b.e(parcel2, r10, Location.CREATOR);
                    break;
                case 12:
                    str2 = b.f(parcel2, r10);
                    break;
                case 13:
                    bundle2 = b.a(parcel2, r10);
                    break;
                case 14:
                    bundle3 = b.a(parcel2, r10);
                    break;
                case 15:
                    arrayList2 = b.h(parcel2, r10);
                    break;
                case 16:
                    str3 = b.f(parcel2, r10);
                    break;
                case 17:
                    str4 = b.f(parcel2, r10);
                    break;
                case 18:
                    z12 = b.m(parcel2, r10);
                    break;
                case 19:
                    a1Var = (a1) b.e(parcel2, r10, a1.CREATOR);
                    break;
                case 20:
                    i13 = b.t(parcel2, r10);
                    break;
                case 21:
                    str5 = b.f(parcel2, r10);
                    break;
                case 22:
                    arrayList3 = b.h(parcel2, r10);
                    break;
                case 23:
                    i14 = b.t(parcel2, r10);
                    break;
                case 24:
                    str6 = b.f(parcel2, r10);
                    break;
                default:
                    b.x(parcel2, r10);
                    break;
            }
        }
        b.k(parcel2, y10);
        return new u4(i10, j10, bundle, i11, arrayList, z10, i12, z11, str, k4Var, location, str2, bundle2, bundle3, arrayList2, str3, str4, z12, a1Var, i13, str5, arrayList3, i14, str6);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new u4[i10];
    }
}
