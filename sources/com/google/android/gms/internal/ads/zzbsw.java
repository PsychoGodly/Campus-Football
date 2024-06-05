package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbsw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        String str = null;
        Bundle bundle = null;
        byte[] bArr = null;
        String str2 = null;
        String str3 = null;
        int i10 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            switch (b.l(r10)) {
                case 1:
                    str = b.f(parcel, r10);
                    break;
                case 2:
                    i10 = b.t(parcel, r10);
                    break;
                case 3:
                    bundle = b.a(parcel, r10);
                    break;
                case 4:
                    bArr = b.b(parcel, r10);
                    break;
                case 5:
                    z10 = b.m(parcel, r10);
                    break;
                case 6:
                    str2 = b.f(parcel, r10);
                    break;
                case 7:
                    str3 = b.f(parcel, r10);
                    break;
                default:
                    b.x(parcel, r10);
                    break;
            }
        }
        b.k(parcel, y10);
        return new zzbsv(str, i10, bundle, bArr, z10, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbsv[i10];
    }
}
