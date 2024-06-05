package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbjb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y10 = b.y(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j10 = 0;
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            switch (b.l(r10)) {
                case 1:
                    z10 = b.m(parcel2, r10);
                    break;
                case 2:
                    str = b.f(parcel2, r10);
                    break;
                case 3:
                    i10 = b.t(parcel2, r10);
                    break;
                case 4:
                    bArr = b.b(parcel2, r10);
                    break;
                case 5:
                    strArr = b.g(parcel2, r10);
                    break;
                case 6:
                    strArr2 = b.g(parcel2, r10);
                    break;
                case 7:
                    z11 = b.m(parcel2, r10);
                    break;
                case 8:
                    j10 = b.u(parcel2, r10);
                    break;
                default:
                    b.x(parcel2, r10);
                    break;
            }
        }
        b.k(parcel2, y10);
        return new zzbja(z10, str, i10, bArr, strArr, strArr2, z11, j10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbja[i10];
    }
}
