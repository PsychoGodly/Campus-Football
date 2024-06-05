package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzags  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzags implements Parcelable.Creator<zzagt> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y10 = b.y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            switch (b.l(r10)) {
                case 2:
                    str = b.f(parcel2, r10);
                    break;
                case 3:
                    str2 = b.f(parcel2, r10);
                    break;
                case 4:
                    str3 = b.f(parcel2, r10);
                    break;
                case 5:
                    str4 = b.f(parcel2, r10);
                    break;
                case 6:
                    str5 = b.f(parcel2, r10);
                    break;
                case 7:
                    str6 = b.f(parcel2, r10);
                    break;
                case 8:
                    str7 = b.f(parcel2, r10);
                    break;
                case 9:
                    str8 = b.f(parcel2, r10);
                    break;
                case 10:
                    z10 = b.m(parcel2, r10);
                    break;
                case 11:
                    z11 = b.m(parcel2, r10);
                    break;
                case 12:
                    str9 = b.f(parcel2, r10);
                    break;
                case 13:
                    str10 = b.f(parcel2, r10);
                    break;
                case 14:
                    str11 = b.f(parcel2, r10);
                    break;
                case 15:
                    str12 = b.f(parcel2, r10);
                    break;
                case 16:
                    z12 = b.m(parcel2, r10);
                    break;
                case 17:
                    str13 = b.f(parcel2, r10);
                    break;
                default:
                    b.x(parcel2, r10);
                    break;
            }
        }
        b.k(parcel2, y10);
        return new zzagt(str, str2, str3, str4, str5, str6, str7, str8, z10, z11, str9, str10, str11, str12, z12, str13);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzagt[i10];
    }
}
