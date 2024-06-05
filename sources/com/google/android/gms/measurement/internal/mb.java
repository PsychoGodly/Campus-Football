package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.mediation.MaxReward;
import i5.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class mb implements Parcelable.Creator<lb> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y10 = b.y(parcel);
        String str = MaxReward.DEFAULT_LABEL;
        String str2 = str;
        String str3 = str2;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str11 = null;
        String str12 = null;
        long j17 = -2147483648L;
        boolean z10 = true;
        boolean z11 = false;
        int i10 = 0;
        boolean z12 = true;
        boolean z13 = false;
        boolean z14 = false;
        int i11 = 100;
        int i12 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            switch (b.l(r10)) {
                case 2:
                    str4 = b.f(parcel2, r10);
                    break;
                case 3:
                    str5 = b.f(parcel2, r10);
                    break;
                case 4:
                    str6 = b.f(parcel2, r10);
                    break;
                case 5:
                    str7 = b.f(parcel2, r10);
                    break;
                case 6:
                    j10 = b.u(parcel2, r10);
                    break;
                case 7:
                    j11 = b.u(parcel2, r10);
                    break;
                case 8:
                    str8 = b.f(parcel2, r10);
                    break;
                case 9:
                    z10 = b.m(parcel2, r10);
                    break;
                case 10:
                    z11 = b.m(parcel2, r10);
                    break;
                case 11:
                    j17 = b.u(parcel2, r10);
                    break;
                case 12:
                    str9 = b.f(parcel2, r10);
                    break;
                case 13:
                    j12 = b.u(parcel2, r10);
                    break;
                case 14:
                    j13 = b.u(parcel2, r10);
                    break;
                case 15:
                    i10 = b.t(parcel2, r10);
                    break;
                case 16:
                    z12 = b.m(parcel2, r10);
                    break;
                case 18:
                    z13 = b.m(parcel2, r10);
                    break;
                case 19:
                    str10 = b.f(parcel2, r10);
                    break;
                case 21:
                    bool = b.n(parcel2, r10);
                    break;
                case 22:
                    j14 = b.u(parcel2, r10);
                    break;
                case 23:
                    arrayList = b.h(parcel2, r10);
                    break;
                case 24:
                    str11 = b.f(parcel2, r10);
                    break;
                case 25:
                    str = b.f(parcel2, r10);
                    break;
                case 26:
                    str2 = b.f(parcel2, r10);
                    break;
                case 27:
                    str12 = b.f(parcel2, r10);
                    break;
                case 28:
                    z14 = b.m(parcel2, r10);
                    break;
                case 29:
                    j15 = b.u(parcel2, r10);
                    break;
                case 30:
                    i11 = b.t(parcel2, r10);
                    break;
                case 31:
                    str3 = b.f(parcel2, r10);
                    break;
                case 32:
                    i12 = b.t(parcel2, r10);
                    break;
                case 34:
                    j16 = b.u(parcel2, r10);
                    break;
                default:
                    b.x(parcel2, r10);
                    break;
            }
        }
        b.k(parcel2, y10);
        return new lb(str4, str5, str6, str7, j10, j11, str8, z10, z11, j17, str9, j12, j13, i10, z12, z13, str10, bool, j14, (List<String>) arrayList, str11, str, str2, str12, z14, j15, i11, str3, i12, j16);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new lb[i10];
    }
}
