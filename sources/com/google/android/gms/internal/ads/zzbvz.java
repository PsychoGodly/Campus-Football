package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbvz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            switch (b.l(r10)) {
                case 2:
                    str = b.f(parcel, r10);
                    break;
                case 3:
                    str2 = b.f(parcel, r10);
                    break;
                case 4:
                    z10 = b.m(parcel, r10);
                    break;
                case 5:
                    z11 = b.m(parcel, r10);
                    break;
                case 6:
                    arrayList = b.h(parcel, r10);
                    break;
                case 7:
                    z12 = b.m(parcel, r10);
                    break;
                case 8:
                    z13 = b.m(parcel, r10);
                    break;
                case 9:
                    arrayList2 = b.h(parcel, r10);
                    break;
                default:
                    b.x(parcel, r10);
                    break;
            }
        }
        b.k(parcel, y10);
        return new zzbvy(str, str2, z10, z11, arrayList, z12, z13, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbvy[i10];
    }
}
